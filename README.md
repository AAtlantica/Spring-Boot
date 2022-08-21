# Configuracion
## @SpringBootApplication
- Esta anotación única es equivalente a usar @Configuration, @EnableAutoConfiguration y @ComponentScan.
- Con esta anotación escanea de manera automática un paquete en busca de beans.

# Anotaciones de Clases
Observaciones: Dado que @Repository, @Service, @Configuration y @Controller son meta-anotaciones de @Component, comparten el mismo comportamiento de nomenclatura de beans.

## @Component
- Es una anotacion de clase, cuando Spring Boot realiza el escaneo detecta de manera automática.

## @Repository
- La capa de acceso a los datos de las bases de datos se representan con la clase Repository, cuya clase debe llevar esta anotación
- Cuando usamos un framework de persistencia como Hibernate, las excepciones nativas lanzadas dentro de estas clases se traduciran en subclases de DataAccesoException de Spring.

## @Service
- La lógica de negocioes de una aplicación generalmente reside dentro de la capa de servicios.

## @RestController
- Es una anotación de nivel de clase que le dice a Spring Boot que esta clase sirve como controlador en nuestra API REST
- Equivale y contiene a los meta-datos @Controller y @ResponseBody.

# Inyeccion de Dependencia
## @Autowired
- Las conexiones automáticas que realiza Spring Boot al utilizar esta anotación se denomina cableado (wiring).
- Se utilizan en:
    - Un Atributo
    - En un Setter
    - En el Constructor (recomendada en la página oficial)