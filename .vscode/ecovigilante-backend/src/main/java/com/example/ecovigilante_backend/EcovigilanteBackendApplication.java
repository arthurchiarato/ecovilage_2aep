// 3
package com.example.ecovigilante_backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import java.util.List;
import java.util.Map;

@SpringBootApplication
public class EcovigilanteBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(EcovigilanteBackendApplication.class, args);
	}

	@Bean
	public CommandLineRunner listarDenunciasIniciais() {
		return args -> {
			List<Map<String, Object>> denuncias = List.of(
				Map.of(
					"id", 1,
					"type", "trash",
					"typeName", "Descarte de Lixo",
					"description", "Lixo acumulado em terreno baldio.",
					"location", Map.of("lat", -23.425, "lng", -51.938),
					"address", "Rua das Flores, 123",
					"date", "2025-06-10",
					"status", "pending",
					"image", "trash"
				),
				Map.of(
					"id", 2,
					"type", "deforestation",
					"typeName", "Desmatamento",
					"description", "Árvores cortadas ilegalmente.",
					"location", Map.of("lat", -23.430, "lng", -51.940),
					"address", "Avenida Central, 456",
					"date", "2025-06-11",
					"status", "pending",
					"image", "deforestation"
				),
				Map.of(
					"id", 3,
					"type", "pollution",
					"typeName", "Poluição",
					"description", "Rio com água escura e odor forte.",
					"location", Map.of("lat", -23.435, "lng", -51.945),
					"address", "Parque do Ingá",
					"date", "2025-06-12",
					"status", "pending",
					"image", "pollution"
				),
				Map.of(
					"id", 4,
					"type", "other",
					"typeName", "Outro",
					"description", "Queimada em área urbana.",
					"location", Map.of("lat", -23.440, "lng", -51.950),
					"address", "Rua das Palmeiras, 789",
					"date", "2025-06-13",
					"status", "pending",
					"image", "other"
				),
				Map.of(
					"id", 5,
					"type", "trash",
					"typeName", "Descarte de Lixo",
					"description", "Sofá jogado na calçada.",
					"location", Map.of("lat", -23.445, "lng", -51.955),
					"address", "Rua das Acácias, 321",
					"date", "2025-06-14",
					"status", "pending",
					"image", "trash"
				),
				Map.of(
					"id", 6,
					"type", "pollution",
					"typeName", "Poluição",
					"description", "Fumaça constante de indústria.",
					"location", Map.of("lat", -23.450, "lng", -51.960),
					"address", "Distrito Industrial",
					"date", "2025-06-15",
					"status", "pending",
					"image", "pollution"
				)
			);
			System.out.println("\n===== DENÚNCIAS INICIAIS =====");
			for (Map<String, Object> d : denuncias) {
				System.out.println("ID: " + d.get("id"));
				System.out.println("Tipo: " + d.get("typeName"));
				System.out.println("Descrição: " + d.get("description"));
				System.out.println("Localização: " + d.get("location"));
				System.out.println("Endereço: " + d.get("address"));
				System.out.println("Data: " + d.get("date"));
				System.out.println("Status: " + d.get("status"));
				System.out.println("Imagem: " + d.get("image"));
				System.out.println("----------------------------------");
			}
			System.out.println("===============================\n");
		};
	}
}
