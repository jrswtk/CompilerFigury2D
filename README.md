# Compiler Figury2D (JFlex, JavaCup):

This project is the compiler to generate geometric figures. It has implemented five figures and colors. Syntax of the compiler was based on Pascal and have includes: 

* loops
* integer values
* simple math operations
* if-conditions
* predefined methods

### Java libraries:

* JFlex - is a lexical analyzer generator:
```
File of lexical analyzer for compiler: FIGURY_2D/figury2d.flex
```
[figury2d.flex](https://github.com/jrswtk/CompilerFigury2D/blob/master/FIGURY_2D/figury2d.flex)

* JavaCup - is a parser generator:
```
File of parser generator for compiler:  FIGURY_2D/figury2d.cup
```
[figury2d.cup](https://github.com/jrswtk/CompilerFigury2D/blob/master/FIGURY_2D/figury2d.cup)

Classes of parser for tree of syntax generator: src/parser

#### Syntax compiler:

```
START
ZMIENNE [values]
{
[loops, simple math operations, if-conditions, predefined methods] 
}
KONIEC
```

### Predefined methods:

**Draw figures:**

```
KOLO([figure], [int x, int y, ..., String kolor])
```
**Figures:**

Circle: 
```
KOLO(int x, int y, int width, String kolor)
```
Square: 
```
KWADRAT(int x, int y, int width, String kolor)
```
Triangle:
```
TROJKAT(int x1, int y1, int x2, int y2, int x3, int y3, String kolor)
```
Elipse:
```
ELIPSA(int x, int y, int width, int height, String kolor)
```
Rectangle:
```
PROSTOKAT(int x, int y, int width, int height, String kolor)
```

#### Example:

```
START
ZMIENNE i, x, y, x1, y1, x2, y2, figura, kolor, szer, wys
{
i = 0
figura = 'trojkat' 
kolor = 'zielony'                                                    
x = 500
y = 100
x1 = 400 
y1 = 200
x2 = 600 
y2 = 200                                        
PETLA (i<3) {
i = i + 1
y1 = y1 + 100
y2 = y2 + 100
RYSUJ(figura, x, y, x1, y1, x2, y2, kolor)
}
x = 480 
y = 500
szer = 50 
wys = 100
figura = 'prostokat' 
kolor = 'brazowy'
RYSUJ(figura, x, y, szer, wys, kolor)
x = 50
y = 50
szer = 200
figura = 'kolo'
kolor = 'zolty'
RYSUJ(figura, x, y, szer, kolor)
}
KONIEC
```
After success compiling the compiler shows a window with the figures.


