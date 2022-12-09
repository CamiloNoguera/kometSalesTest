# Prueba Tecnica KOMET SALES

### Indicaciones
Asumiendo que se tiene una empresa encargada de manejar el inventario de Flores, cree una aplicación java con spring boot, que exponga las siguientes APIs:

#### 1. API para recibir una lista de flores y esta se debe guardar en una variable static.
  1. Atributos del objeto flor:
    - id
    - name
    - price
    
  2. La lista de flores se sobreescribe cada vez que se recibe la petición.

#### 2. API para retornar todas las flores guardadas en esa variable (variable static), concatenando al final de cada atributo name la palabra “-kometsales”. Esta lista debe quedar ordenada alfabéticamente de manera descendente, solo retornar los campos name y price en cada objeto de la lista.

#### 3. API para retornar las flores con el precio mayor a 20 (retornar todos los campos del objeto).

#### 4. API para borrar una flor de la lista.

#### 5. API para recibir el name de una flor y devuelva una lista de flores que coincidan con ese name (retornar todos los campos del objeto).

### Consideraciones:
1. Debe ser RESTful API.

2. Se recomienda desarrollar utilizando Spring boot
