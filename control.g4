grammar control;

line: (command LINEFEED)* command;
command: (qword WS)? .*? cmd_type eoc;   //Structure of one command

cmd_type: (cmd_move | cmd_info) .*? (WS places)?;   //command type (places are optional)
cmd_move: (MOVE | STEPS) ;                          //movement planning
cmd_info: TRAIN;

places:
    place WS 'és' WS place WS 'között'  #noExactPlace
    | from WS to                        #hasFromTo
    | to                                #hasTo;
place: LTR+ | LTR+ (FROM | TO)* LTR*;
from: place FROM;
to: place TO;

MOVE: [Mm]'enj' | [Úú]'t' LTR* | LTR* 'jut' LTR*;            //Move command - planning
STEPS: 'megálló';
TRAIN: 'vonat';
LINEFEED: [\n\r]+;

eoc: WS* ('.' | '!' | '?')?;    //End of command
/*
Datatype reference
*/
qword:  'Hogyan' | qplace | qtime | quantity ;  //Question type
qplace: 'Hol' | 'Merre' | 'Melyik';             //Place / Position data
qtime: 'Mikor';                                 //Time / interval data
quantity: 'Mennyi' | 'Hány' ;                   //Quantity data


WS: [\p{White_Space}];
FROM: 'ból' | 'ből' | 'ról' | 'ről' | 'tól' | 'től';    //Grammar modifier - source
TO: 'ig' | 'ra' | 're' | 'ba' | 'be';                   //Grammar modifier - destination
LTR: [{\p{Alpha}\p{General_Category=Other_Letter}];