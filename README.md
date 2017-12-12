Jeu de l'oie sur un tableau 2D
SAVIGNY Pierre et VALADE Tristan


I - Le projet
	
	Le projet consistait � cr�er un petit jeu de l'oie avec en sp�cificit�
un syst�me de bonus/malus al�atoirement dispers� sur chacune des cases.
Pour ce faire, nous avons cr�� un tableau de 100x2, une ligne correspondant
aux 100 cases sur lesquelles le joueur avance, et la seconde correspondant
pour chaque case au bonus/malus lorsque le joueur arrive dessus.
	
Le jeu se fait dans la console (nous aurions aim� faire une interface
JFrame mais le temps a manqu�), et il suffit pour le joueur d'entrer
de combien de cases il veut avancer selon une valeur entre 1 et 6.
Bien s�r, la seconde ligne du tableau lui est cach�e et il ne sait pas s'il
va tomber sur une case qui va le gratifier d'un bonus ou le p�naliser.



II - Les tests

	Pour les tests nous ne savions pas vraiment quoi faire, donc nous les
avons surtout cr��s afin de vous montrer que nous savons faire.

Nous avons donc cr�� la m�thode "Avance" qui permet de v�rifier que le pion
ne d�passe pas la valeur 100, car cela donnerait lieu � une erreur lorsqu'il
faut le placer dans le tableau. Cette fonction retourne donc la valeur de
pion+avancee lorsqu'elle est inf�rieure � 100, et 100 si elle est sup�rieure.
 - Dans la classe de tests, nous avons donc fait un test qui v�rifie que la
m�thode retourne bien 100 lorsque les valeurs aditionn�es font plus de 100.
 - Puis nous avons fait un second test qui lui sera faux, qui v�rifie si la
m�thode retourne 0 lorsque la somme des valeurs fait un nombre n�gatif
(ce qui ferait crasher le programme au moment du placement du pion �
tab[-10][1], par exemple). Ce test est donc faux, mais comme dit en
commentaire la fonction qui remplit le tableau fait en sorte de ne pas avoir
de malus qui ferait passer le pion sous 0

Nous avons ensuite cr�� un compteur dans la m�thode "remplir" qui nous
permettra de v�rifier si la boucle for passe bien dans chacune des
cases du tableau.
//On sait bien que c'est un peu d�bile mais on ne savait vraiment pas quoi faire
Nous avons donc un test qui v�rifie que la boucle tourne bien 100 fois
et un autre qui v�rifie si �a ne retourne pas true � chaque fois.



III - Anecdote

	C'est en cherchant sur Google Images des jeux de plateau en tableau
� 2 dimensions et en voyant une sorte de jeu de l'oie avec des �chelles pour
sauter des cases et des serpents qui font reculer que j'ai eu l'id�e du jeu.
								-Tristan