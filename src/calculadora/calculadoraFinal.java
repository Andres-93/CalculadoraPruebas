PWD: Ver directorio actual de trabajo.
Ls –l: Ver los archivos contenidos en el directorio.
mkdir <nombre>: Creamos una carpeta en el directorio.
Cd <nombre>: cambiar a la carpeta deseada.
Git init: iniciamos git.
Git status:  ver el status de los commit.
Git config –list:  muestra la configuración del git.
Git config  --global user.name “nombre”: configuramos el nombre.
Git config  --global user.email “email”: configuramos el email.
Git config  --global core.editor vi : Elegimos el editor de texto por defecto.
Touch README : creamos un archivo vacio.
Cat README : ver contenido.
 echo Archivo readme de comienzo >README: Introducd en readme lo que queramos

Git add README: añadimos el archivo al escenario.
Git commit –m “ readme” : el – me representa un mensaje que hay que añadir.
Git log: vemos los commit.

Vi : abrimos el editor de texto.
ESC + :WQ salimos y guardamos

Código al cuadrado en javascript
 


 git log –oneline . versión reducidad del log de los commits

git branch : vemos ramas  actuales

git branch inverse : creamos rama llamada inverse

git branch –d nombrerama: borramos la branch
git branch inverse b2202c5 creamos rama llamada inverse apàrtir del commit con 

el id b2202.

git checkout inverse : cambiamos de rama a la rama invers<git s

$ git diff inverse master: diferencias entre las dos ramas.

git merge inverse : fusionamos rama actial con la rama inverse



SUBIDAS A GITHUB.










Indicar nuestro repositorio remoto:
Git remote add CalculatorRemoto https://github.com/Andres-93/Calculator.git
		<nombreRepositorio> 
Git push CalculatorRemoto master

PARA TRAER LOS CAMBIOS REALIZADOS EN GITHUB A NUESTRO REPOSITORIO LOCAL
Git pull CalculatorRemoto master

EJERCICIO HEROES PASO A PASO.
Mkdir demo03 : creamos el directorio.
Cd demo03 : entramos al directorio.
Vi README.md : creamos el archivo readme y entramos a editarlo.
(debemos pulsar i para empezar a escribir) Para salir y que se guarde esc + :wq
Git init iniciamos el repositorio.
Git status: vemos que esta el readme pero no esta añadido en el índice.
Git add .   : para añadirlo al índice se pone el . si quieres todo o el nombre si solo quieres uno.
Git commit –m “mensaje” : añadimos lo que tenegamos en el índice al repositorio local.
Git log: Comprobamos que el commit se ha añadido correctamente.

Ahora modificaremos el readme con el vi README.
Si quieres ver la diferencia entre   directorio de trabajo y nuestro índice usaremos el comando git diff ( En este caso vemos que es diferente).
Añadimos el readme de nuestro directorio al índice con el comando git add README.md
Podemos comprobar que está correctamente con git status
Si queremos ver las diferencias entre el repositorio y el índice: Git diff –staged
Vamos a borrar la referencia del README del índice git reset README
Ahora con el git status veremos el README en rojo porque ya no esta en el índice pero si en el directorio
Lo volvemos a modificar con el vi README.md
Ahora lo añadimos al índice con el git add REAME.md
Hacemos el commit con git commit –m “mensaje escrito mal”
Con git log ahora lo vemos , y comprobamos que hemos escrito el mensaje mal.
Para corregir ese error git commit --amend -m "readme actualizado"


Ahora volvemos a modificar el README con el vi README. Porque supuestamente nos hemos equivocado y hemos commitado algo que es erróneo.

Git reset –soft HEAD^ : con este comando retrocederemos en los commit, o mas bien borraremos el ultimo commid, en el que señala el HEAD.

Ahora como añadimos el readme de nuevo desde el directorio tendremos que hacer el git add y después el git commit. (Se pueden hacer los dos de golpe para pasar directamente del directorio al índice con el comando git commit –am “actualizamos el readme con todos los cambios”).


Ahora probaremos el uso del comando Reset Hard para borrar todo para ellos crearemos el directorio demo04 y nos situaremos en él.
Iniciamos repositorio git init

Git add README.md
Git commit –m “agregamos el readme”
Git add misiones.md
Git commit –m “agregamos las misiones”
Git add heroes.md
Git commit –m “agregamos los heroes”
Git add ciudades.md
Git commit –m “agregamos las ciudades”
Añadimos todos los archivos como commits individualmente
Git log – oneline :  vemos los commits de manera resumida.


Git add .   :  solo queda por añadir una carpeta asique añadimos todo lo que quera emn nuestro difecrtorio de trabajo.

Ahora agregamos la carpeta con un mensaje mal aposta.
Usaremos el git commit –amend –m “nuevo mensaje”  para vovler a cambiar el mensaje del ultimo commit porque lo pusimos mal.

Modificamos el readme para ahora añadirlo de golpe al commit, con  git commit –am “mensaje”.
Modificamos también el archivo héroes. Usamos el mismo comandp que el anterior.

Ahora borraremos el hereoes que hemos metido porque nos hemos equivocado
Git reset –-soft <id a donde queremos mover el head>  y se borrara todo lo nuevo desde ahí
Modificaremos nuevamente héroes y haremos nuevamente el add y el commit

Ahora queremos borrar dos commits con el mix
Git reset –mixed <id>
Ahora probamos el git hard, lo borrar también todo del directorio de trabajo.

Si la hemos cagado  y queremos traer de nuevo lo borrad.
Podemos ver todo lo ocurrido hasta ajhora n git reflog.

Ahora desharemos todo lo hecho hasta donde queramos.
Git reset –hard <id del reflog que queramos volver>







COMO HACER QUE GIT IGNORE CIERTOS ARCHIVOS PORQUE NO LOS NECESITAMOS:
Hay que crear un archivo que se llame .gitignore con vi .gitignore
Y dentro escribir lo queramos que ignore.: Podemos escribir por ejemplo *.log para que ignore todos lo archivos con terminación . log

































Reset soft – borra un commit sin tocar ni índice ni directorio
Reset mix – borrar commit e indice sin tocar el diorectorio de trabajo
Reset hard – borra un commit deshace el índice y borra el directorio de trabajo.






