package com.example.studypetclinic.bootstrap;

import com.example.studypetclinic.model.Owner;
import com.example.studypetclinic.model.Vet;
import com.example.studypetclinic.services.OwnerService;
import com.example.studypetclinic.services.VetService;
import com.example.studypetclinic.services.map.OwnerServiceMap;
import com.example.studypetclinic.services.map.VetServiceMap;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;


    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {
        Owner owner1 = new Owner();
        owner1.setFirstName("Bruce");
        owner1.setLastName("Wayne");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Richard");
        owner2.setLastName("Grayson");

        ownerService.save(owner2);

        System.out.println("Owners Data Loaded...");

        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstName("Damian");
        vet1.setLastName("Wayne");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setId(2L);
        vet2.setFirstName("Barbara");
        vet2.setLastName("Gordon");

        vetService.save(vet2);

        System.out.println("Vets Data Loaded...");
    }
}
