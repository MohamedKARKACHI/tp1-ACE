package com.project.core.ui;

import com.project.core.repository.DataRepository;
import com.project.core.service.BusinessService;

import java.io.File;
import java.lang.reflect.Method;
import java.util.Scanner;

public class ApplicationController {
    public static void main(String[] args) throws Exception {
        // Chargement de la configuration depuis le fichier
        Scanner fileReader = new Scanner(new File("application.properties"));
        String repositoryClassPath = fileReader.nextLine();

        // Chargement dynamique de la classe Repository via réflexion
        Class<?> repositoryClass = Class.forName(repositoryClassPath);
        DataRepository repository = (DataRepository) repositoryClass.getDeclaredConstructor().newInstance();

        // Chargement de la classe Service depuis la configuration
        String serviceClassPath = fileReader.nextLine();
        Class<?> serviceClass = Class.forName(serviceClassPath);
        BusinessService service = (BusinessService) serviceClass.getDeclaredConstructor().newInstance();

        // Injection de dépendance via réflexion
        Method injectMethod = serviceClass.getMethod("injectRepository", DataRepository.class);
        injectMethod.invoke(service, repository);

        // Exécution du calcul et affichage
        System.out.println("Résultat du calcul = " + service.processCalculation());

        fileReader.close();
    }
}

