Jeu de l'oie sur un tableau 2D
SAVIGNY Pierre et VALADE Tristan


I - Le projet
	
	Le projet consistait à créer un petit jeu de l'oie avec en spécificité
un système de bonus/malus aléatoirement dispersé sur chacune des cases.
Pour ce faire, nous avons créé un tableau de 100x2, une ligne correspondant
aux 100 cases sur lesquelles le joueur avance, et la seconde correspondant
pour chaque case au bonus/malus lorsque le joueur arrive dessus.
	
Le jeu se fait dans la console (nous aurions aimé faire une interface
JFrame mais le temps a manqué), et il suffit pour le joueur d'entrer
de combien de cases il veut avancer selon une valeur entre 1 et 6.
Bien sûr, la seconde ligne du tableau lui est cachée et il ne sait pas s'il
va tomber sur une case qui va le gratifier d'un bonus ou le pénaliser.



II - Les tests

	Pour les tests nous ne savions pas vraiment quoi faire, donc nous les
avons surtout créés afin de vous montrer que nous savons faire.

Nous avons donc créé la méthode "Avance" qui permet de vérifier que le pion
ne dépasse pas la valeur 100, car cela donnerait lieu à une erreur lorsqu'il
faut le placer dans le tableau. Cette fonction retourne donc la valeur de
pion+avancee lorsqu'elle est inférieure à 100, et 100 si elle est supérieure.
 - Dans la classe de tests, nous avons donc fait un test qui vérifie que la
méthode retourne bien 100 lorsque les valeurs aditionnées font plus de 100.
 - Puis nous avons fait un second test qui lui sera faux, qui vérifie si la
méthode retourne 0 lorsque la somme des valeurs fait un nombre négatif
(ce qui ferait crasher le programme au moment du placement du pion à
tab[-10][1], par exemple). Ce test est donc faux, mais comme dit en
commentaire la fonction qui remplit le tableau fait en sorte de ne pas avoir
de malus qui ferait passer le pion sous 0

Nous avons ensuite créé un compteur dans la méthode "remplir" qui nous
permettra de vérifier si la boucle for passe bien dans chacune des
cases du tableau.
//On sait bien que c'est un peu débile mais on ne savait vraiment pas quoi faire
Nous avons donc un test qui vérifie que la boucle tourne bien 100 fois
et un autre qui vérifie si ça ne retourne pas true à chaque fois.



III - Anecdote

	C'est en cherchant sur Google Images des jeux de plateau en tableau
à 2 dimensions et en voyant une sorte de jeu de l'oie avec des échelles pour
sauter des cases et des serpents qui font reculer que j'ai eu l'idée du jeu.
								-Tristan