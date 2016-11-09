package parser;

import java_cup.runtime.*;
      
%%
   
%class MyLexer


%line
%column
    
%cup
   
%{   

    private Symbol symbol(int type) {
        return new Symbol(type, yyline, yycolumn);
    }

    private Symbol symbol(int type, Object value) {
        return new Symbol(type, yyline, yycolumn, value);
    }
%}
   

LineTerminator = \r|\n|\r\n
   
WhiteSpace     = {LineTerminator} | [ \t\f]
   
LICZBA = 0 | [1-9][0-9]*
Identifier = [a-zA-Z$_] [a-zA-Z0-9$_]*
/*Identifier = [:jletter:] [:jletterdigit:]**/

   
%%

/* ------------------------Lexical Rules Section---------------------- */
   
   
<YYINITIAL> {
   
   
    "+"             { return symbol(sym.PLUS); }
    "-"             { return symbol(sym.MINUS); }  
    ","             { return symbol(sym.PRZECINEK); }   
    "("             { return symbol(sym.LNAWIAS); }   
    ")"             { return symbol(sym.PNAWIAS); }     
    "="             { return symbol(sym.PRZYPISZ); }   
    "{"             { return symbol(sym.LKLAMRA); }      
    "}"             { return symbol(sym.PKLAMRA); }      
    "=="            { return symbol(sym.ROWNE); }      
    "!="            { return symbol(sym.NIEROWNE); }      
    ">"             { return symbol(sym.WIEKSZE); }      
    "<"             { return symbol(sym.MNIEJSZE); }
    "'"             { return symbol(sym.APOSTROF); }
    "START"         { return symbol(sym.START); }
    "KONIEC"        { return symbol(sym.KONIEC); }
    "ZMIENNE"       { return symbol(sym.ZMIENNE); }    
    "RYSUJ"         { return symbol(sym.RYSUJ); }      
    "JESLI"         { return symbol(sym.JESLI); }              
    "PETLA"         { return symbol(sym.PETLA); }         

    {LICZBA}        { return symbol(sym.LICZBA, new Integer(yytext())); }
    {Identifier}    { return symbol(sym.ID, new String(yytext())); }
    {WhiteSpace}    {  }   
}


[^]   { throw new Error("Nieoczekiwany znak <"+yytext()+">"); }

