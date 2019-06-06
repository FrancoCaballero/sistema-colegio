PROYECTO CRUD COLEGIO
Proyecto realizado en spring framework, spring data, Maven, MySQL y thymeleaf

COMENZANDO
Estas instrucciones te permitirán obtener una copia del proyecto en funcionamiento en tu máquina local para propósitos de desarrollo y pruebas.

PRE-REQUISITOS
Qué necesitamos para desplegar el proyecto:
JDK(Java SE Development Kit)
Eclipse + Spring >Tools Plugin
Maven
MySQL

DESCARGA E INSTALACIÓN
JDK: Al instalar el jdk(en mi caso trabaje con la versión 8 de 64-bit), tenemos que copiar la ruta de la carpeta bin,
para luego agregarla a la variable de entorno PATH,
en windows 10, en buscar colocamos "Editar las variables de entorno del sistema",
en opciones avanzadas, damos click en "Variables de entorno",
en Variables del sistema damos doble click en "Path",
damos click en nuevo y copiamos la ruta de la carpeta bin del jdk.

ECLIPSE: Vamos a la página www.eclipse.org,
en Download(parte superior derecha de la página) damos click,
damos click en Download Packages,
en "Eclipse IDE for Enterprise Java Developers" ,
damos click en Windows 64-bit,
click en Download,
extraemos eclipse,
entramos en la carpeta eclipse y damos doble click en eclipse(aplicación),
(paso opcional) tenemos que crear la carpeta en C:\Spring5\eclipse-workspace
y utilizarla en la ruta de Workspace que pide eclipse o dejar la que viene
por defecto, marcar la opción "Use this as the default and do not ask again", 
para que no vuelva a preguntar por la ruta, damos click en Launch.
Ahora tenemos que instalar el plugins de spring,
vamos Help, Eclipse Marketplace, 
en Find buscamos por Spring tools instalamos la ultima versión,
marcamos todo aun que viene por defecto asi,
damos a confirmar, aceptamos los terminos y finalizar.
Si aparece un Warning le damos a Install anyway,
marcamos en Eclipse Foundation, aceptar y reiniciamos eclipse.
En la parte superior de Eclipse buscamos un icono verde de spring,
le damos click para activar el Boot Dashboard.

Maven: Por suerte ya viene incluido en el eclipse no hay que instalar nada.

MySQL: Vamos a www.mysql.com, Downloads, 
vamos a la versión "MySQL Community Edition",
damos click en Community(GPL)Download,
en MySQL Community Server damos click en DOWNLOAD,
bajamos, damos click en Go to Downlad Page,
descargamos la versión completa que pesa más de 300mb,
damos click en "No thanks, just start my download" para no tener que registrarte,
ejecutamos el instalador,
aceptamos licencia siguiente,
seleccionamos Custom siguiente,
seleccionamos MySql Server y lo agregamos con la flecha,
en Aplications buscamos MySQL Workbench y lo agregamos siguiente,
ejecutamos, cuando este listo damos a siguiente,
siguiente otra vez,
dejamos por defecto y damos a siguiente,
otra vez todo por defecto y siguiente,
por defecto en Recomendado y siguiente,
agregamos la contraseña y damos a siguiente,
todo por defecto y siguiente,
ejecutamos y finalizar,
siguiente otra vez y finalizar,
la instalación esta completada,
abrimos MySQL Workbench y le damos a Local instance MySQL,
colocamos la contraseña antes ingresada para el usuario root damos a ok,
tenemos que crear un nuevo esquema en "Create a new schema in the connected derver",
es un icono en la parte superior,
la llamamos db_springboot,
aplicamos, aplicamos otra vez y finalizar.

Con esto ya estamos listo para poder ejecutar nuestra aplicación,
abrimos el proyecto en eclipse,
le damos click derecho en el proyecto,
en Run As y le damos a Spring Boot App.

Con esto ya podemos ver funcionando el proyecto.

Desarrollador
Franco Caballero (Analista Programador Computacional)






