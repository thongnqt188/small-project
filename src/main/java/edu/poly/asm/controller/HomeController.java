package edu.poly.asm.controller;

import edu.poly.asm.domain.Product;
import edu.poly.asm.model.ProductDto;
import edu.poly.asm.service.CategoryService;
import edu.poly.asm.service.ProductService;
import edu.poly.asm.service.StorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("admin")
public class HomeController {
    @Autowired
    ProductService productService;

    @Autowired
    CategoryService categoryService;

    @Autowired
    StorageService storageService;

    @RequestMapping("home")
    public String list(ModelMap model){
        List<Product> list = productService.findAll();

        model.addAttribute("products", list);

        return "/admin/home";
    }

    @RequestMapping(value = "getimage/{id}", method = RequestMethod.GET)
    public ResponseEntity<ByteArrayResource> imageProduct(@PathVariable Long id) {
        Optional<Product> pot = productService.findById(id);

        if (pot.isPresent()){
            Product product = pot.get();
            try {
                Path filename = Paths.get("uploads/imagessss", product.getImage());
                byte[] buffer = Files.readAllBytes(filename);

                ByteArrayResource bsr = new ByteArrayResource(buffer);
                return ResponseEntity.ok()
                        .contentLength(buffer.length)
                        .contentType(MediaType.parseMediaType("uploads/imagessss"))
                        .body(bsr);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        return ResponseEntity.badRequest().build();
    }

    @GetMapping("add")
    public String add(Model model) {
        ProductDto dto = new ProductDto();
        dto.setIsEdit(true);  //!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
        model.addAttribute("product", dto);

        return "/admin/home";
    }

}