PWD: Ver directorio actual de trabajo.
Ls �l: Ver los archivos contenidos en el directorio.
mkdir <nombre>: Creamos una carpeta en el directorio.
Cd <nombre>: cambiar a la carpeta deseada.
Git init: iniciamos git.
Git status:  ver el status de los commit.
Git config �list:  muestra la configuraci�n del git.
Git config  --global user.name �nombre�: configuramos el nombre.
Git config  --global user.email �email�: configuramos el email.
Git config  --global core.editor vi : Elegimos el editor de texto por defecto.
Touch README : creamos un archivo vacio.
Cat README : ver contenido.
 echo Archivo readme de comienzo >README: Introducd en readme lo que queramos

Git add README: a�adimos el archivo al escenario.
Git commit �m � readme� : el � me representa un mensaje que hay que a�adir.
Git log: vemos los commit.

Vi : abrimos el editor de texto.
ESC + :WQ salimos y guardamos

C�digo al cuadrado en javascript
 


 git log �oneline . versi�n reducidad del log de los commits

git branch : vemos ramas  actuales

git branch inverse : creamos rama llamada inverse

git branch �d nombrerama: borramos la branch
git branch inverse b2202c5 creamos rama llamada inverse ap�rtir del commit con 

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
Git status: vemos que esta el readme pero no esta a�adido en el �ndice.
Git add .   : para a�adirlo al �ndice se pone el . si quieres todo o el nombre si solo quieres uno.
Git commit �m �mensaje� : a�adimos lo que tenegamos en el �ndice al repositorio local.
Git log: Comprobamos que el commit se ha a�adido correctamente.

Ahora modificaremos el readme con el vi README.
Si quieres ver la diferencia entre   directorio de trabajo y nuestro �ndice usaremos el comando git diff ( En este caso vemos que es diferente).
A�adimos el readme de nuestro directorio al �ndice con el comando git add README.md
Podemos comprobar que est� correctamente con git status
Si queremos ver las diferencias entre el repositorio y el �ndice: Git diff �staged
Vamos a borrar la referencia del README del �ndice git reset README
Ahora con el git status veremos el README en rojo porque ya no esta en el �ndice pero si en el directorio
Lo volvemos a modificar con el vi README.md
Ahora lo a�adimos al �ndice con el git add REAME.md
Hacemos el commit con git commit �m �mensaje escrito mal�
Con git log ahora lo vemos , y comprobamos que hemos escrito el mensaje mal.
Para corregir ese error git commit --amend -m "readme actualizado"


Ahora volvemos a modificar el README con el vi README. Porque supuestamente nos hemos equivocado y hemos commitado algo que es err�neo.

Git reset �soft HEAD^ : con este comando retrocederemos en los commit, o mas bien borraremos el ultimo commid, en el que se�ala el HEAD.

Ahora como a�adimos el readme de nuevo desde el directorio tendremos que hacer el git add y despu�s el git commit. (Se pueden hacer los dos de golpe para pasar directamente del directorio al �ndice con el comando git commit �am �actualizamos el readme con todos los cambios�).


Ahora probaremos el uso del comando Reset Hard para borrar todo para ellos crearemos el directorio demo04 y nos situaremos en �l.
Iniciamos repositorio git init

Git add README.md
Git commit �m �agregamos el readme�
Git add misiones.md
Git commit �m �agregamos las misiones�
Git add heroes.md
Git commit �m �agregamos los heroes�
Git add ciudades.md
Git commit �m �agregamos las ciudades�
A�adimos todos los archivos como commits individualmente
Git log � oneline :  vemos los commits de manera resumida.


Git add .   :  solo queda por a�adir una carpeta asique a�adimos todo lo que quera emn nuestro difecrtorio de trabajo.

Ahora agregamos la carpeta con un mensaje mal aposta.
Usaremos el git commit �amend �m �nuevo mensaje�  para vovler a cambiar el mensaje del ultimo commit porque lo pusimos mal.

Modificamos el readme para ahora a�adirlo de golpe al commit, con  git commit �am �mensaje�.
Modificamos tambi�n el archivo h�roes. Usamos el mismo comandp que el anterior.

Ahora borraremos el hereoes que hemos metido porque nos hemos equivocado
Git reset �-soft <id a donde queremos mover el head>  y se borrara todo lo nuevo desde ah�
Modificaremos nuevamente h�roes y haremos nuevamente el add y el commit

Ahora queremos borrar dos commits con el mix
Git reset �mixed <id>
Ahora probamos el git hard, lo borrar tambi�n todo del directorio de trabajo.

Si la hemos cagado  y queremos traer de nuevo lo borrad.
Podemos ver todo lo ocurrido hasta ajhora n git reflog.

Ahora desharemos todo lo hecho hasta donde queramos.
Git reset �hard <id del reflog que queramos volver>







COMO HACER QUE GIT IGNORE CIERTOS ARCHIVOS PORQUE NO LOS NECESITAMOS:
Hay que crear un archivo que se llame .gitignore con vi .gitignore
Y dentro escribir lo queramos que ignore.: Podemos escribir por ejemplo *.log para que ignore todos lo archivos con terminaci�n . log

































Reset soft � borra un commit sin tocar ni �ndice ni directorio
Reset mix � borrar commit e indice sin tocar el diorectorio de trabajo
Reset hard � borra un commit deshace el �ndice y borra el directorio de trabajo.






