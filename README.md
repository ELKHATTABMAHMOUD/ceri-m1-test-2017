# ceri-m2-test 

## Badges

[![CircleCI](https://circleci.com/gh/ELKHATTABMAHMOUD/ceri-m1-test-2017.svg?style=svg)](https://circleci.com/gh/ELKHATTABMAHMOUD/ceri-m1-test-2017)
[![Codacy Badge](https://api.codacy.com/project/badge/Grade/c9b8623b251146b1abeca46c52eb617c)](https://www.codacy.com/app/elkhattab.mahmoud/ceri-m1-test-2017?utm_source=github.com&amp;utm_medium=referral&amp;utm_content=ELKHATTABMAHMOUD/ceri-m1-test-2017&amp;utm_campaign=Badge_Grade)
[![codecov](https://codecov.io/gh/ELKHATTABMAHMOUD/ceri-m1-test-2017/branch/master/graph/badge.svg)](https://codecov.io/gh/ELKHATTABMAHMOUD/ceri-m1-test-2017)

## Author

Mahmoud EL KHATTAB

## Description
	Le travail demandé consistait dans un premier temps à la réalisation des tests des interfaces données au tp. Ensuite, une
	implémentation des interfaces a été réalisée pour les concrétiser. Ainsi, pour savoir si la réalisation que j'ai réalisé 
	est conforme à ce qui a été demandé, j'ai exécuté dessus des tests que j'ai hérité des tests réalisés au début. 

	Les cas de tests sont séparés dans deux packages différents selon les classes ou les interfaces à tester. 

	src//main/java
		fr.univavignon.rodeo.api 				:	les interfaces
		fr.univavignon.rodeo.implementation 	:	l'implémentation réalisée
	


### Test des interfaces
	Les interfaces ont été testées en réalisant pour chacun un cas de test. Chaque cas de test comporte les méthodes 
	de tests correspondantes aux méthodes de l'interface à tester. Il comporte également deux autres méthodes, une 
	pour la création d'un Mock de l'interface à tester ( **getXXXXMock()** ) et la deuxième méthode ( **getXXXXInstance()** ) 
	permet de récupérer une instancede l'interface à tester en faisant appel à la première.  

	src//test/java
		fr.univavignon.rodeo.api 				:  	cas de test pour les interfaces 
 
### Implémentation
	L'implémentation réalisée pour chacune des interfaces est présente sous le package :
	src//test/java
		fr.univavignon.rodeo.implementation 
	
### Test de l'implémentation
	les tests de l'implémentation sont rassemblés sous le package 
	src//test/java
		fr.univavignon.rodeo.implementation 	:	cas de test des implémentations
		
	Le test de l'implémentation de chaque interface hérite du test réalisé pour ce dernier. Le test d'une classe ne comporte que 
	la redéfinition de la méthode **getXXXXInstance()**. Au lieu que cette dernière appel la méthode **getXXXXMock()** pour la 
	création d'un Mock en cas du test de l'interface, elle permet de créer l'objet concrêt en cas du test de l'implémentation. 
	
### External

- [JUnit 5 documentation](http://junit.org/junit5/docs/current/user-guide)

