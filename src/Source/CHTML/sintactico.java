
//----------------------------------------------------
// The following code was generated by CUP v0.11a beta 20060608
// Fri Feb 16 18:57:09 CST 2018
//----------------------------------------------------

package Source.CHTML;

import java_cup.runtime.*;
import java.util.ArrayList;
import java.io.PrintWriter;
import Principal.Interfaz.*;
import Principal.Errores;
import Principal.Interfaz;
import Principal.tablaSimbolos;

/** CUP v0.11a beta 20060608 generated parser.
  * @version Fri Feb 16 18:57:09 CST 2018
  */
public class sintactico extends java_cup.runtime.lr_parser {

  /** Default constructor. */
  public sintactico() {super();}

  /** Constructor which sets the default scanner. */
  public sintactico(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public sintactico(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\013\000\002\002\004\000\002\002\012\000\002\003" +
    "\011\000\002\004\015\000\002\004\015\000\002\004\014" +
    "\000\002\004\014\000\002\005\011\000\002\006\006\000" +
    "\002\006\006\000\002\006\002" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\104\000\004\004\005\001\002\000\004\002\106\001" +
    "\002\000\004\006\006\001\002\000\004\005\007\001\002" +
    "\000\004\004\011\001\002\000\004\004\065\001\002\000" +
    "\004\010\012\001\002\000\004\005\013\001\002\000\004" +
    "\004\014\001\002\000\006\011\044\017\043\001\002\000" +
    "\004\004\016\001\002\000\010\011\020\017\017\021\021" +
    "\001\002\000\004\012\033\001\002\000\004\012\023\001" +
    "\002\000\004\005\022\001\002\000\004\004\uffff\001\002" +
    "\000\004\013\024\001\002\000\004\014\025\001\002\000" +
    "\004\015\026\001\002\000\004\005\027\001\002\000\004" +
    "\004\030\001\002\000\004\016\031\001\002\000\004\005" +
    "\032\001\002\000\004\004\ufffe\001\002\000\004\013\034" +
    "\001\002\000\004\014\035\001\002\000\004\015\036\001" +
    "\002\000\004\005\037\001\002\000\004\004\040\001\002" +
    "\000\004\020\041\001\002\000\004\005\042\001\002\000" +
    "\004\004\ufffd\001\002\000\004\012\055\001\002\000\004" +
    "\012\045\001\002\000\004\013\046\001\002\000\004\014" +
    "\047\001\002\000\004\015\050\001\002\000\004\005\051" +
    "\001\002\000\004\004\052\001\002\000\004\016\053\001" +
    "\002\000\004\005\054\001\002\000\004\004\ufffb\001\002" +
    "\000\004\013\056\001\002\000\004\014\057\001\002\000" +
    "\004\015\060\001\002\000\004\005\061\001\002\000\004" +
    "\004\062\001\002\000\004\020\063\001\002\000\004\005" +
    "\064\001\002\000\004\004\ufffc\001\002\000\004\022\072" +
    "\001\002\000\004\004\067\001\002\000\004\007\070\001" +
    "\002\000\004\005\071\001\002\000\004\002\000\001\002" +
    "\000\006\005\ufff7\024\074\001\002\000\004\005\102\001" +
    "\002\000\004\013\075\001\002\000\006\025\076\026\077" +
    "\001\002\000\004\015\101\001\002\000\004\015\100\001" +
    "\002\000\004\005\ufff8\001\002\000\004\005\ufff9\001\002" +
    "\000\004\004\103\001\002\000\004\023\104\001\002\000" +
    "\004\005\105\001\002\000\004\004\ufffa\001\002\000\004" +
    "\002\001\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\104\000\004\002\003\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\004\003\007\001\001" +
    "\000\004\005\065\001\001\000\002\001\001\000\002\001" +
    "\001\000\004\004\014\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\004\006\072" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$sintactico$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$sintactico$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$sintactico$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}




	public static String ConvertirObjectToString(Object Obj)
	 {
		String Str="";
		if(Obj!=null)
		{
			Str = Obj.toString();
		}
		return Str;
	}


	public static void erroresSintacticos(Symbol s)
	{
		System.out.println("Error de sintaxis. Linea: " + (s.right + 1) +
		" Columna: " + s.left + ". Texto: \"" + s.value + "\"");
		Errores errores_sintacticos=new Errores();
		errores_sintacticos.setTipo("Sintactico");
		errores_sintacticos.setLinea(s.right+1);
		errores_sintacticos.setColumna(s.left);
		errores_sintacticos.setDescripcion(ConvertirObjectToString(s.value));
		//sintactico.listaSintactico.add(errores_sintacticos);
		Interfaz.erroresSintacticos.add(errores_sintacticos);

	}


}

/** Cup generated class to encapsulate user supplied action code.*/
class CUP$sintactico$actions {
  private final sintactico parser;

  /** Constructor */
  CUP$sintactico$actions(sintactico parser) {
    this.parser = parser;
  }

  /** Method with the actual generated action code. */
  public final java_cup.runtime.Symbol CUP$sintactico$do_action(
    int                        CUP$sintactico$act_num,
    java_cup.runtime.lr_parser CUP$sintactico$parser,
    java.util.Stack            CUP$sintactico$stack,
    int                        CUP$sintactico$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$sintactico$result;

      /* select the action based on the action number */
      switch (CUP$sintactico$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // ESTILOCUERPO ::= 
            {
              String RESULT =null;

              CUP$sintactico$result = parser.getSymbolFactory().newSymbol("ESTILOCUERPO",4, ((java_cup.runtime.Symbol)CUP$sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$sintactico$stack.peek()), RESULT);
            }
          return CUP$sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // ESTILOCUERPO ::= fondo asignacion id puntoComa 
            {
              String RESULT =null;

              CUP$sintactico$result = parser.getSymbolFactory().newSymbol("ESTILOCUERPO",4, ((java_cup.runtime.Symbol)CUP$sintactico$stack.elementAt(CUP$sintactico$top-3)), ((java_cup.runtime.Symbol)CUP$sintactico$stack.peek()), RESULT);
            }
          return CUP$sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // ESTILOCUERPO ::= fondo asignacion rgb puntoComa 
            {
              String RESULT =null;

              CUP$sintactico$result = parser.getSymbolFactory().newSymbol("ESTILOCUERPO",4, ((java_cup.runtime.Symbol)CUP$sintactico$stack.elementAt(CUP$sintactico$top-3)), ((java_cup.runtime.Symbol)CUP$sintactico$stack.peek()), RESULT);
            }
          return CUP$sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // CUERPO ::= menorQue inicioCuerpo ESTILOCUERPO mayorQue menorQue finCuerpo mayorQue 
            {
              String RESULT =null;
		
              CUP$sintactico$result = parser.getSymbolFactory().newSymbol("CUERPO",3, ((java_cup.runtime.Symbol)CUP$sintactico$stack.elementAt(CUP$sintactico$top-6)), ((java_cup.runtime.Symbol)CUP$sintactico$stack.peek()), RESULT);
            }
          return CUP$sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // DEFINICIONARCHIVOS ::= menorQue inicioCjs ruta asignacion pathComillas puntoComa mayorQue menorQue finCjs mayorQue 
            {
              String RESULT =null;
		
              CUP$sintactico$result = parser.getSymbolFactory().newSymbol("DEFINICIONARCHIVOS",2, ((java_cup.runtime.Symbol)CUP$sintactico$stack.elementAt(CUP$sintactico$top-9)), ((java_cup.runtime.Symbol)CUP$sintactico$stack.peek()), RESULT);
            }
          return CUP$sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // DEFINICIONARCHIVOS ::= menorQue inicioCcss ruta asignacion pathComillas puntoComa mayorQue menorQue finCcss mayorQue 
            {
              String RESULT =null;
		
              CUP$sintactico$result = parser.getSymbolFactory().newSymbol("DEFINICIONARCHIVOS",2, ((java_cup.runtime.Symbol)CUP$sintactico$stack.elementAt(CUP$sintactico$top-9)), ((java_cup.runtime.Symbol)CUP$sintactico$stack.peek()), RESULT);
            }
          return CUP$sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // DEFINICIONARCHIVOS ::= DEFINICIONARCHIVOS menorQue inicioCcss ruta asignacion pathComillas puntoComa mayorQue menorQue finCcss mayorQue 
            {
              String RESULT =null;
		
              CUP$sintactico$result = parser.getSymbolFactory().newSymbol("DEFINICIONARCHIVOS",2, ((java_cup.runtime.Symbol)CUP$sintactico$stack.elementAt(CUP$sintactico$top-10)), ((java_cup.runtime.Symbol)CUP$sintactico$stack.peek()), RESULT);
            }
          return CUP$sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // DEFINICIONARCHIVOS ::= DEFINICIONARCHIVOS menorQue inicioCjs ruta asignacion pathComillas puntoComa mayorQue menorQue finCjs mayorQue 
            {
              String RESULT =null;
		
              CUP$sintactico$result = parser.getSymbolFactory().newSymbol("DEFINICIONARCHIVOS",2, ((java_cup.runtime.Symbol)CUP$sintactico$stack.elementAt(CUP$sintactico$top-10)), ((java_cup.runtime.Symbol)CUP$sintactico$stack.peek()), RESULT);
            }
          return CUP$sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // ENCABEZADO ::= menorQue inicioEncabezado mayorQue DEFINICIONARCHIVOS menorQue finEncabezado mayorQue 
            {
              String RESULT =null;
		
              CUP$sintactico$result = parser.getSymbolFactory().newSymbol("ENCABEZADO",1, ((java_cup.runtime.Symbol)CUP$sintactico$stack.elementAt(CUP$sintactico$top-6)), ((java_cup.runtime.Symbol)CUP$sintactico$stack.peek()), RESULT);
            }
          return CUP$sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // CHTML ::= menorQue inicioChtml mayorQue ENCABEZADO CUERPO menorQue finChtml mayorQue 
            {
              String RESULT =null;
		
              CUP$sintactico$result = parser.getSymbolFactory().newSymbol("CHTML",0, ((java_cup.runtime.Symbol)CUP$sintactico$stack.elementAt(CUP$sintactico$top-7)), ((java_cup.runtime.Symbol)CUP$sintactico$stack.peek()), RESULT);
            }
          return CUP$sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= CHTML EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$sintactico$stack.elementAt(CUP$sintactico$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$sintactico$stack.elementAt(CUP$sintactico$top-1)).right;
		String start_val = (String)((java_cup.runtime.Symbol) CUP$sintactico$stack.elementAt(CUP$sintactico$top-1)).value;
		RESULT = start_val;
              CUP$sintactico$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$sintactico$stack.elementAt(CUP$sintactico$top-1)), ((java_cup.runtime.Symbol)CUP$sintactico$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$sintactico$parser.done_parsing();
          return CUP$sintactico$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number found in internal parse table");

        }
    }
}

