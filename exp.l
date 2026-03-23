%{
#include <stdio.h>
int token_no = 0;
int line_no = 1;
%}

%%
"#include"|"using"|"namespace"|"int"|"void"|"return"|"for"|"static"
{
    printf("%d\t%d\tkeyword\t\t%s\n", ++token_no, line_no, yytext);
}

"<"|">"|"="|"++"|";"|"," 
{
    printf("%d\t%d\tspecial symbol\t%s\n", ++token_no, line_no, yytext);
}

"(" | ")" | "{" | "}"
{
    printf("%d\t%d\tbracket\t\t%s\n", ++token_no, line_no, yytext);
}

[0-9]+
{
    printf("%d\t%d\tconstant\t%s\n", ++token_no, line_no, yytext);
}

[a-zA-Z_][a-zA-Z0-9_.]*
{
    printf("%d\t%d\tidentifier\t%s\n", ++token_no, line_no, yytext);
}

\n      { line_no++; }
[ \t]+  { }
.       { }
%%

int yywrap()
{
    return 1;
}

int main()
{
    printf("TOKEN NO\tLINE NO\tTOKEN\t\tLEXEME\n");
    yylex();
    return 0;
}
