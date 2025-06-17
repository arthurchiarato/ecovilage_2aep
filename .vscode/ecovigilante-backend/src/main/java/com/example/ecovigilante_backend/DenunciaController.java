// 1
package com.example.ecovigilante_backend;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;
import java.util.Map;

@RestController
@RequestMapping("/api/denuncias")
@CrossOrigin(origins = "*")
public class DenunciaController {

    @PostMapping
    // 2
    public void receberDenuncia(@RequestBody Map<String, Object> denuncia) {
        System.out.println("\n===== NOVA DENÚNCIA RECEBIDA =====");
        System.out.println("ID: " + denuncia.get("id"));
        System.out.println("Tipo: " + denuncia.get("typeName"));
        System.out.println("Descrição: " + denuncia.get("description"));
        System.out.println("Localização: " + denuncia.get("location"));
        System.out.println("Endereço: " + denuncia.get("address"));
        System.out.println("Data: " + denuncia.get("date"));
        System.out.println("Status: " + denuncia.get("status"));
        System.out.println("Imagem: " + denuncia.get("image"));
        System.out.println("==================================\n");
    }
}
