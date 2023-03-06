# Pruebas Automatizadas para proyecto Summa Expcolaborador - Jhonatan Caraballo - Certificador QA
Pruebas automatizadas para proyecto Summa Expcolaborador, en éste se verán las pruebas para loos módulos de Créditos y Beneficios

## Pre-requisitos
- Java JDK 1.8 (variables de entorno configuradas)
- Gradle v7.0.0 o superior (variables de entorno configuradas)
- Serenity BDD Cucumber + Gherkin
- Screenplay 
- IntelliJ IDEA
- Broswer Chrome

## Pasos para configurar proyecto

- Clonar el repositorio con el siguiente comando: git clone ```https://summa-sci.visualstudio.com/Summa%20-%20Experiencia%20del%20colaborador/_git/ec-beneficios-auto-test ```
- Importar el proyecto de gradle ```SummaAgilBenefitsAutoTest```

## Pruebas Diseñadas

- Pruebas para Autenticación


## Flujo para la ejecución de pruebas

1. Definir Estrategia de Ejecución
2. Ejecutar pruebas
3. Generar reporte del serenity
4. Guardar reporte de ejecución en item de Plan de Pruebas del Sprint

## Ejecutar Pruebas
1. authentication
1.1 Login desde el BtoC
1.2 Login desde el Active Directory
1.3 Login Fallido desde el BtoC
1.4 Login Fallido desde el Active Directory
1.5 Logout desde el BtoC
1.6 Logout desde el Active Directory
1.7 Logout desde el Menu Aside 

2. Consultar beneficios de colaboradores
2.1 Consultar Beneficios por Filtro General 
2.2 Consultar Beneficios por CEDULA
2.3 Consultar Beneficios NOMBRE
2.4 Consultar Beneficios por CEDULA inexistente
2.5 Consultar Beneficio por Filtro General a usuario inexistente

3. Consultar Beneficio por Filtro General a usuario inexistente
3.1 Editar Beneficio por Filtro General
3.2 Editar Beneficios por CEDULA
3.3 Editar Beneficios NOMBRE
4. 
4. asd

- Ejecutar todas las pruebas ```gradle clean test aggregate```

## Como contribuir al proyecto

- Las pruebas están enfocadas en los flujos críticos del aplicativo de acuerdo a las reglas del negocio y requerimientos de los StakeHolders

## Crear Pruebas

1. Definir Story
2. Crear Flujo de la Funcionalidad 
3. Definir Escenario feliz de la mano con el negocio
4. Definir Escenarios alternos usando técnicas de diseño de caja negra
5. Crear runner para su ejecución

## Estructura del proyecto

* ```src/main/java```
``` 

+ SummaAgileBenefitsManualTest

    + Clase: ManualTest.java
    Clase con la se realiza la ejecucón manual de los casos de prueba
    
````
* ```src/test/java```
``` 

+ src/test/java/creditos01/runners
    Clases que permiten la ejecución de las pruebas. 

+ src.test.java.creditos01.stepdefinitions
    Clases donde se acopla el lenguaje Gherkin con que se escriben los escenarios y el código java que va a ser ejecutado para la automatización. 

``` 
* ```src/test/resources```
``` 

+ features
    Archivos donde se escriben los escenarios o historias que lleva a cabo el usuario a nivel de negocio.  

````
## Versionamiento

- Versionamiento basado en Trunk Based Development 

## Autores

* **Jhonatan David Caraballo Ortiz** - *Certificador QA* - [jhonatan.c@tcs.com]



