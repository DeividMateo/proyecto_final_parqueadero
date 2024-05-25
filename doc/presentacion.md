---
marp: true
header: <div class="encabezado"><img src='imagenes/franjaSuperior.png'  /><div class="titulo"><h1 class="texto"></h1></div></div>
footer: '![image](imagenes/franjaInferior.png)' 
_header: '' 
_footer: '' 
paginate: true
_paginate: false
_backgroundImage: url('imagenes/fondo.png')
style: |

  .encabezado {
    position: relative; left: 0; top:0;display: inline-block; text-align: center;
  }
  .titulo {
    position: absolute; top: 40%; left: 50%; transform: translate(0%, -50%); color: gray;
  }
  .columns {
    display: grid;
    grid-template-columns: repeat(2, minmax(0, 1fr));
    gap: 1rem;
  }
  .texto:after {
    content: 'Titulo';
  }
  
  h1 { color: black }
---

<div style="position: absolute; left: 30%; top:45%; width: 70%; text-align: left"><h1 style="color: gray">Programación Orientada a Objetos</h1></div>
<div style="position: absolute; left: 30%; top:55%; width: 70%; text-align: left"><h5 style="color: gray">Área de programación<br />
Programa de Ingeniería de Sistemas y Computación<br />
Facultad de Ingeniería

</h5></div>

<div style="position: absolute; left: 45%; top:20%; background-color: rgb(212, 231, 205); width: 550px">
<b>
Problema: <br />
Administracion de un parqueadero<br />
</b>
</div>


<div style="position: absolute; left: 93%; top:10px; ">

![width:80](imagenes/licencia.png)
</div>

---


<style scoped>
.texto:after {
    content: 'Problema:';
  }
</style>

<div style="font-size: 15pt">

Se desea desarrollar una aplicación para la administración eficiente de un parqueadero. El
parqueadero cuenta con un número n de puestos, cada uno identificado por una posición
única (i, j). Cada puesto puede estar ocupado por un vehículo, que puede ser de tipo moto
(clásica o híbrida) o carro, y debe tener una placa, un modelo y un propietario registrado en el
sistema.
Para las motos, se debe registrar también su velocidad máxima, ya que el parqueadero es
frecuentado por compradores de motos usadas interesados en conocer este dato. Un vehículo
solo puede ocupar un puesto a la vez, por lo que se debe verificar la disponibilidad del puesto
antes de ubicar un vehículo en él.
El sistema debe llevar un registro completo de todos los vehículos que han parqueado en el
establecimiento, incluyendo información sobre el puesto ocupado y el momento de ingreso.
Además, debe permitir la identificación del propietario de un vehículo ubicado en un puesto
dado y llevar un registro de todos los ingresos al parqueadero, registrando el puesto ocupado
y el vehículo ubicado en el mismo.
La implementación del parqueadero debe hacer uso de herencia para una mejor organización
y reutilización del código.




