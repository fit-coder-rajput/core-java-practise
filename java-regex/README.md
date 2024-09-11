# Java REGEX practise

*   :   '*' with folowing char represent 0 or more occurence of char. eg:  abc*def => means => ab|*c|def =>  ab| any no. of c |
.   :  '.' it represent wild card any char can be place in place of '.'  eg: a.b => a|any_char|b
\s(space)  : represent space character eg: a  bcd, a  bed, a  bty => regex => a\s\sb.*