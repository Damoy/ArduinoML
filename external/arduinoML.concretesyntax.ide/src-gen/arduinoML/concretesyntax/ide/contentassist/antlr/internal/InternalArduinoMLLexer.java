package arduinoML.concretesyntax.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalArduinoMLLexer extends Lexer {
    public static final int RULE_BOOLEAN_CONSTANT=4;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=7;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators

    public InternalArduinoMLLexer() {;} 
    public InternalArduinoMLLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalArduinoMLLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalArduinoML.g"; }

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalArduinoML.g:11:7: ( 'HIGH' )
            // InternalArduinoML.g:11:9: 'HIGH'
            {
            match("HIGH"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalArduinoML.g:12:7: ( 'LOW' )
            // InternalArduinoML.g:12:9: 'LOW'
            {
            match("LOW"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalArduinoML.g:13:7: ( 'ms' )
            // InternalArduinoML.g:13:9: 'ms'
            {
            match("ms"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalArduinoML.g:14:7: ( 's' )
            // InternalArduinoML.g:14:9: 's'
            {
            match('s'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalArduinoML.g:15:7: ( 'min' )
            // InternalArduinoML.g:15:9: 'min'
            {
            match("min"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalArduinoML.g:16:7: ( 'inf' )
            // InternalArduinoML.g:16:9: 'inf'
            {
            match("inf"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalArduinoML.g:17:7: ( 'einf' )
            // InternalArduinoML.g:17:9: 'einf'
            {
            match("einf"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalArduinoML.g:18:7: ( 'equal' )
            // InternalArduinoML.g:18:9: 'equal'
            {
            match("equal"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalArduinoML.g:19:7: ( 'esup' )
            // InternalArduinoML.g:19:9: 'esup'
            {
            match("esup"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalArduinoML.g:20:7: ( 'sup' )
            // InternalArduinoML.g:20:9: 'sup'
            {
            match("sup"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalArduinoML.g:21:7: ( 'enable' )
            // InternalArduinoML.g:21:9: 'enable'
            {
            match("enable"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalArduinoML.g:22:7: ( 'monitoring' )
            // InternalArduinoML.g:22:9: 'monitoring'
            {
            match("monitoring"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalArduinoML.g:23:7: ( 'app' )
            // InternalArduinoML.g:23:9: 'app'
            {
            match("app"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalArduinoML.g:24:7: ( 'initial' )
            // InternalArduinoML.g:24:9: 'initial'
            {
            match("initial"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalArduinoML.g:25:7: ( 'mode' )
            // InternalArduinoML.g:25:9: 'mode'
            {
            match("mode"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalArduinoML.g:26:7: ( ':' )
            // InternalArduinoML.g:26:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalArduinoML.g:27:7: ( 'bricks' )
            // InternalArduinoML.g:27:9: 'bricks'
            {
            match("bricks"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalArduinoML.g:28:7: ( 'modes' )
            // InternalArduinoML.g:28:9: 'modes'
            {
            match("modes"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalArduinoML.g:29:7: ( 'with' )
            // InternalArduinoML.g:29:9: 'with'
            {
            match("with"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalArduinoML.g:30:7: ( 'debug' )
            // InternalArduinoML.g:30:9: 'debug'
            {
            match("debug"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalArduinoML.g:31:7: ( 'state' )
            // InternalArduinoML.g:31:9: 'state'
            {
            match("state"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalArduinoML.g:32:7: ( 'states' )
            // InternalArduinoML.g:32:9: 'states'
            {
            match("states"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalArduinoML.g:33:7: ( 'transitions' )
            // InternalArduinoML.g:33:9: 'transitions'
            {
            match("transitions"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalArduinoML.g:34:7: ( 'Actuator' )
            // InternalArduinoML.g:34:9: 'Actuator'
            {
            match("Actuator"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalArduinoML.g:35:7: ( 'Digital' )
            // InternalArduinoML.g:35:9: 'Digital'
            {
            match("Digital"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalArduinoML.g:36:7: ( 'Analog' )
            // InternalArduinoML.g:36:9: 'Analog'
            {
            match("Analog"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalArduinoML.g:37:7: ( 'change' )
            // InternalArduinoML.g:37:9: 'change'
            {
            match("change"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalArduinoML.g:38:7: ( 'to' )
            // InternalArduinoML.g:38:9: 'to'
            {
            match("to"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalArduinoML.g:39:7: ( 'go' )
            // InternalArduinoML.g:39:9: 'go'
            {
            match("go"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalArduinoML.g:40:7: ( 'when' )
            // InternalArduinoML.g:40:9: 'when'
            {
            match("when"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalArduinoML.g:41:7: ( 'is' )
            // InternalArduinoML.g:41:9: 'is'
            {
            match("is"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalArduinoML.g:42:7: ( 'and' )
            // InternalArduinoML.g:42:9: 'and'
            {
            match("and"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalArduinoML.g:43:7: ( 'wait' )
            // InternalArduinoML.g:43:9: 'wait'
            {
            match("wait"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalArduinoML.g:44:7: ( 'then' )
            // InternalArduinoML.g:44:9: 'then'
            {
            match("then"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "RULE_BOOLEAN_CONSTANT"
    public final void mRULE_BOOLEAN_CONSTANT() throws RecognitionException {
        try {
            int _type = RULE_BOOLEAN_CONSTANT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalArduinoML.g:5154:23: ( ( 'true' | 'false' ) )
            // InternalArduinoML.g:5154:25: ( 'true' | 'false' )
            {
            // InternalArduinoML.g:5154:25: ( 'true' | 'false' )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='t') ) {
                alt1=1;
            }
            else if ( (LA1_0=='f') ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalArduinoML.g:5154:26: 'true'
                    {
                    match("true"); 


                    }
                    break;
                case 2 :
                    // InternalArduinoML.g:5154:33: 'false'
                    {
                    match("false"); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_BOOLEAN_CONSTANT"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalArduinoML.g:5156:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalArduinoML.g:5156:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalArduinoML.g:5156:11: ( '^' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='^') ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalArduinoML.g:5156:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalArduinoML.g:5156:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')||(LA3_0>='A' && LA3_0<='Z')||LA3_0=='_'||(LA3_0>='a' && LA3_0<='z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalArduinoML.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalArduinoML.g:5158:10: ( ( '0' .. '9' )+ )
            // InternalArduinoML.g:5158:12: ( '0' .. '9' )+
            {
            // InternalArduinoML.g:5158:12: ( '0' .. '9' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalArduinoML.g:5158:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalArduinoML.g:5160:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalArduinoML.g:5160:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalArduinoML.g:5160:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='\"') ) {
                alt7=1;
            }
            else if ( (LA7_0=='\'') ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalArduinoML.g:5160:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalArduinoML.g:5160:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='!')||(LA5_0>='#' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFF')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalArduinoML.g:5160:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalArduinoML.g:5160:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalArduinoML.g:5160:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalArduinoML.g:5160:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop6:
                    do {
                        int alt6=3;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0=='\\') ) {
                            alt6=1;
                        }
                        else if ( ((LA6_0>='\u0000' && LA6_0<='&')||(LA6_0>='(' && LA6_0<='[')||(LA6_0>=']' && LA6_0<='\uFFFF')) ) {
                            alt6=2;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalArduinoML.g:5160:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalArduinoML.g:5160:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalArduinoML.g:5162:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalArduinoML.g:5162:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalArduinoML.g:5162:24: ( options {greedy=false; } : . )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0=='*') ) {
                    int LA8_1 = input.LA(2);

                    if ( (LA8_1=='/') ) {
                        alt8=2;
                    }
                    else if ( ((LA8_1>='\u0000' && LA8_1<='.')||(LA8_1>='0' && LA8_1<='\uFFFF')) ) {
                        alt8=1;
                    }


                }
                else if ( ((LA8_0>='\u0000' && LA8_0<=')')||(LA8_0>='+' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalArduinoML.g:5162:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalArduinoML.g:5164:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalArduinoML.g:5164:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalArduinoML.g:5164:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='\u0000' && LA9_0<='\t')||(LA9_0>='\u000B' && LA9_0<='\f')||(LA9_0>='\u000E' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalArduinoML.g:5164:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            // InternalArduinoML.g:5164:40: ( ( '\\r' )? '\\n' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='\n'||LA11_0=='\r') ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalArduinoML.g:5164:41: ( '\\r' )? '\\n'
                    {
                    // InternalArduinoML.g:5164:41: ( '\\r' )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0=='\r') ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // InternalArduinoML.g:5164:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalArduinoML.g:5166:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalArduinoML.g:5166:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalArduinoML.g:5166:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalArduinoML.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalArduinoML.g:5168:16: ( . )
            // InternalArduinoML.g:5168:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalArduinoML.g:1:8: ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | RULE_BOOLEAN_CONSTANT | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt13=42;
        alt13 = dfa13.predict(input);
        switch (alt13) {
            case 1 :
                // InternalArduinoML.g:1:10: T__12
                {
                mT__12(); 

                }
                break;
            case 2 :
                // InternalArduinoML.g:1:16: T__13
                {
                mT__13(); 

                }
                break;
            case 3 :
                // InternalArduinoML.g:1:22: T__14
                {
                mT__14(); 

                }
                break;
            case 4 :
                // InternalArduinoML.g:1:28: T__15
                {
                mT__15(); 

                }
                break;
            case 5 :
                // InternalArduinoML.g:1:34: T__16
                {
                mT__16(); 

                }
                break;
            case 6 :
                // InternalArduinoML.g:1:40: T__17
                {
                mT__17(); 

                }
                break;
            case 7 :
                // InternalArduinoML.g:1:46: T__18
                {
                mT__18(); 

                }
                break;
            case 8 :
                // InternalArduinoML.g:1:52: T__19
                {
                mT__19(); 

                }
                break;
            case 9 :
                // InternalArduinoML.g:1:58: T__20
                {
                mT__20(); 

                }
                break;
            case 10 :
                // InternalArduinoML.g:1:64: T__21
                {
                mT__21(); 

                }
                break;
            case 11 :
                // InternalArduinoML.g:1:70: T__22
                {
                mT__22(); 

                }
                break;
            case 12 :
                // InternalArduinoML.g:1:76: T__23
                {
                mT__23(); 

                }
                break;
            case 13 :
                // InternalArduinoML.g:1:82: T__24
                {
                mT__24(); 

                }
                break;
            case 14 :
                // InternalArduinoML.g:1:88: T__25
                {
                mT__25(); 

                }
                break;
            case 15 :
                // InternalArduinoML.g:1:94: T__26
                {
                mT__26(); 

                }
                break;
            case 16 :
                // InternalArduinoML.g:1:100: T__27
                {
                mT__27(); 

                }
                break;
            case 17 :
                // InternalArduinoML.g:1:106: T__28
                {
                mT__28(); 

                }
                break;
            case 18 :
                // InternalArduinoML.g:1:112: T__29
                {
                mT__29(); 

                }
                break;
            case 19 :
                // InternalArduinoML.g:1:118: T__30
                {
                mT__30(); 

                }
                break;
            case 20 :
                // InternalArduinoML.g:1:124: T__31
                {
                mT__31(); 

                }
                break;
            case 21 :
                // InternalArduinoML.g:1:130: T__32
                {
                mT__32(); 

                }
                break;
            case 22 :
                // InternalArduinoML.g:1:136: T__33
                {
                mT__33(); 

                }
                break;
            case 23 :
                // InternalArduinoML.g:1:142: T__34
                {
                mT__34(); 

                }
                break;
            case 24 :
                // InternalArduinoML.g:1:148: T__35
                {
                mT__35(); 

                }
                break;
            case 25 :
                // InternalArduinoML.g:1:154: T__36
                {
                mT__36(); 

                }
                break;
            case 26 :
                // InternalArduinoML.g:1:160: T__37
                {
                mT__37(); 

                }
                break;
            case 27 :
                // InternalArduinoML.g:1:166: T__38
                {
                mT__38(); 

                }
                break;
            case 28 :
                // InternalArduinoML.g:1:172: T__39
                {
                mT__39(); 

                }
                break;
            case 29 :
                // InternalArduinoML.g:1:178: T__40
                {
                mT__40(); 

                }
                break;
            case 30 :
                // InternalArduinoML.g:1:184: T__41
                {
                mT__41(); 

                }
                break;
            case 31 :
                // InternalArduinoML.g:1:190: T__42
                {
                mT__42(); 

                }
                break;
            case 32 :
                // InternalArduinoML.g:1:196: T__43
                {
                mT__43(); 

                }
                break;
            case 33 :
                // InternalArduinoML.g:1:202: T__44
                {
                mT__44(); 

                }
                break;
            case 34 :
                // InternalArduinoML.g:1:208: T__45
                {
                mT__45(); 

                }
                break;
            case 35 :
                // InternalArduinoML.g:1:214: RULE_BOOLEAN_CONSTANT
                {
                mRULE_BOOLEAN_CONSTANT(); 

                }
                break;
            case 36 :
                // InternalArduinoML.g:1:236: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 37 :
                // InternalArduinoML.g:1:244: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 38 :
                // InternalArduinoML.g:1:253: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 39 :
                // InternalArduinoML.g:1:265: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 40 :
                // InternalArduinoML.g:1:281: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 41 :
                // InternalArduinoML.g:1:297: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 42 :
                // InternalArduinoML.g:1:305: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA13 dfa13 = new DFA13(this);
    static final String DFA13_eotS =
        "\1\uffff\3\33\1\42\3\33\1\uffff\11\33\1\31\2\uffff\3\31\2\uffff\1\33\1\uffff\1\33\1\101\4\33\1\uffff\1\33\1\111\6\33\1\uffff\6\33\1\127\5\33\1\135\1\33\5\uffff\1\33\1\140\1\uffff\1\141\2\33\1\144\1\33\1\146\1\33\1\uffff\4\33\1\154\1\155\7\33\1\uffff\5\33\1\uffff\1\33\1\173\2\uffff\1\33\1\176\1\uffff\1\33\1\uffff\1\33\1\u0081\1\33\1\u0083\1\33\2\uffff\1\33\1\u0086\1\u0087\1\u0088\2\33\1\u008b\1\u008c\5\33\1\uffff\1\33\1\u0093\1\uffff\1\u0095\1\33\1\uffff\1\u0097\1\uffff\2\33\3\uffff\1\u009a\1\33\2\uffff\4\33\1\u008b\1\33\1\uffff\1\u00a1\1\uffff\1\33\1\uffff\1\u00a3\1\u00a4\1\uffff\2\33\1\u00a7\1\33\1\u00a9\1\33\1\uffff\1\u00ab\2\uffff\2\33\1\uffff\1\u00ae\1\uffff\1\33\1\uffff\1\33\1\u00b1\1\uffff\2\33\1\uffff\1\u00b4\1\33\1\uffff\1\u00b6\1\uffff";
    static final String DFA13_eofS =
        "\u00b7\uffff";
    static final String DFA13_minS =
        "\1\0\1\111\1\117\1\151\1\60\1\156\1\151\1\156\1\uffff\1\162\1\141\1\145\1\150\1\143\1\151\1\150\1\157\1\141\1\101\2\uffff\2\0\1\52\2\uffff\1\107\1\uffff\1\127\1\60\1\156\1\144\1\160\1\141\1\uffff\1\146\1\60\1\156\2\165\1\141\1\160\1\144\1\uffff\1\151\1\164\1\145\1\151\1\142\1\141\1\60\1\145\1\164\1\141\1\147\1\141\1\60\1\154\5\uffff\1\110\1\60\1\uffff\1\60\1\151\1\145\1\60\1\164\1\60\1\164\1\uffff\1\146\1\141\1\160\1\142\2\60\1\143\1\150\1\156\1\164\1\165\1\156\1\145\1\uffff\1\156\1\165\1\154\1\151\1\156\1\uffff\1\163\1\60\2\uffff\1\164\1\60\1\uffff\1\145\1\uffff\1\151\1\60\1\154\1\60\1\154\2\uffff\1\153\3\60\1\147\1\163\2\60\1\141\1\157\1\164\1\147\1\145\1\uffff\1\157\1\60\1\uffff\1\60\1\141\1\uffff\1\60\1\uffff\1\145\1\163\3\uffff\1\60\1\151\2\uffff\1\164\1\147\1\141\1\145\1\60\1\162\1\uffff\1\60\1\uffff\1\154\1\uffff\2\60\1\uffff\1\164\1\157\1\60\1\154\1\60\1\151\1\uffff\1\60\2\uffff\1\151\1\162\1\uffff\1\60\1\uffff\1\156\1\uffff\1\157\1\60\1\uffff\1\147\1\156\1\uffff\1\60\1\163\1\uffff\1\60\1\uffff";
    static final String DFA13_maxS =
        "\1\uffff\1\111\1\117\1\163\1\172\2\163\1\160\1\uffff\1\162\1\151\1\145\1\162\1\156\1\151\1\150\1\157\1\141\1\172\2\uffff\2\uffff\1\57\2\uffff\1\107\1\uffff\1\127\1\172\2\156\1\160\1\141\1\uffff\1\151\1\172\1\156\2\165\1\141\1\160\1\144\1\uffff\1\151\1\164\1\145\1\151\1\142\1\165\1\172\1\145\1\164\1\141\1\147\1\141\1\172\1\154\5\uffff\1\110\1\172\1\uffff\1\172\1\151\1\145\1\172\1\164\1\172\1\164\1\uffff\1\146\1\141\1\160\1\142\2\172\1\143\1\150\1\156\1\164\1\165\1\156\1\145\1\uffff\1\156\1\165\1\154\1\151\1\156\1\uffff\1\163\1\172\2\uffff\1\164\1\172\1\uffff\1\145\1\uffff\1\151\1\172\1\154\1\172\1\154\2\uffff\1\153\3\172\1\147\1\163\2\172\1\141\1\157\1\164\1\147\1\145\1\uffff\1\157\1\172\1\uffff\1\172\1\141\1\uffff\1\172\1\uffff\1\145\1\163\3\uffff\1\172\1\151\2\uffff\1\164\1\147\1\141\1\145\1\172\1\162\1\uffff\1\172\1\uffff\1\154\1\uffff\2\172\1\uffff\1\164\1\157\1\172\1\154\1\172\1\151\1\uffff\1\172\2\uffff\1\151\1\162\1\uffff\1\172\1\uffff\1\156\1\uffff\1\157\1\172\1\uffff\1\147\1\156\1\uffff\1\172\1\163\1\uffff\1\172\1\uffff";
    static final String DFA13_acceptS =
        "\10\uffff\1\20\12\uffff\1\44\1\45\3\uffff\1\51\1\52\1\uffff\1\44\6\uffff\1\4\10\uffff\1\20\16\uffff\1\45\1\46\1\47\1\50\1\51\2\uffff\1\3\7\uffff\1\37\15\uffff\1\34\5\uffff\1\35\2\uffff\1\2\1\5\2\uffff\1\12\1\uffff\1\6\5\uffff\1\15\1\40\15\uffff\1\1\2\uffff\1\17\2\uffff\1\7\1\uffff\1\11\2\uffff\1\23\1\36\1\41\2\uffff\1\43\1\42\6\uffff\1\22\1\uffff\1\25\1\uffff\1\10\2\uffff\1\24\6\uffff\1\26\1\uffff\1\13\1\21\2\uffff\1\32\1\uffff\1\33\1\uffff\1\16\2\uffff\1\31\2\uffff\1\30\2\uffff\1\14\1\uffff\1\27";
    static final String DFA13_specialS =
        "\1\2\24\uffff\1\1\1\0\u00a0\uffff}>";
    static final String[] DFA13_transitionS = {
            "\11\31\2\30\2\31\1\30\22\31\1\30\1\31\1\25\4\31\1\26\7\31\1\27\12\24\1\10\6\31\1\15\2\23\1\16\3\23\1\1\3\23\1\2\16\23\3\31\1\22\1\23\1\31\1\7\1\11\1\17\1\13\1\6\1\21\1\20\1\23\1\5\3\23\1\3\5\23\1\4\1\14\2\23\1\12\3\23\uff85\31",
            "\1\32",
            "\1\34",
            "\1\36\5\uffff\1\37\3\uffff\1\35",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\23\33\1\41\1\40\5\33",
            "\1\43\4\uffff\1\44",
            "\1\45\4\uffff\1\50\2\uffff\1\46\1\uffff\1\47",
            "\1\52\1\uffff\1\51",
            "",
            "\1\54",
            "\1\57\6\uffff\1\56\1\55",
            "\1\60",
            "\1\63\6\uffff\1\62\2\uffff\1\61",
            "\1\64\12\uffff\1\65",
            "\1\66",
            "\1\67",
            "\1\70",
            "\1\71",
            "\32\33\4\uffff\1\33\1\uffff\32\33",
            "",
            "",
            "\0\73",
            "\0\73",
            "\1\74\4\uffff\1\75",
            "",
            "",
            "\1\77",
            "",
            "\1\100",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\102",
            "\1\104\11\uffff\1\103",
            "\1\105",
            "\1\106",
            "",
            "\1\107\2\uffff\1\110",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\112",
            "\1\113",
            "\1\114",
            "\1\115",
            "\1\116",
            "\1\117",
            "",
            "\1\120",
            "\1\121",
            "\1\122",
            "\1\123",
            "\1\124",
            "\1\125\23\uffff\1\126",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\130",
            "\1\131",
            "\1\132",
            "\1\133",
            "\1\134",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\136",
            "",
            "",
            "",
            "",
            "",
            "\1\137",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\142",
            "\1\143",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\145",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\147",
            "",
            "\1\150",
            "\1\151",
            "\1\152",
            "\1\153",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\156",
            "\1\157",
            "\1\160",
            "\1\161",
            "\1\162",
            "\1\163",
            "\1\164",
            "",
            "\1\165",
            "\1\166",
            "\1\167",
            "\1\170",
            "\1\171",
            "",
            "\1\172",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "",
            "",
            "\1\174",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\22\33\1\175\7\33",
            "",
            "\1\177",
            "",
            "\1\u0080",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\u0082",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\u0084",
            "",
            "",
            "\1\u0085",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\u0089",
            "\1\u008a",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "\1\u0091",
            "",
            "\1\u0092",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\22\33\1\u0094\7\33",
            "\1\u0096",
            "",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "",
            "\1\u0098",
            "\1\u0099",
            "",
            "",
            "",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\u009b",
            "",
            "",
            "\1\u009c",
            "\1\u009d",
            "\1\u009e",
            "\1\u009f",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\u00a0",
            "",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "",
            "\1\u00a2",
            "",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "",
            "\1\u00a5",
            "\1\u00a6",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\u00a8",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\u00aa",
            "",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "",
            "",
            "\1\u00ac",
            "\1\u00ad",
            "",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "",
            "\1\u00af",
            "",
            "\1\u00b0",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "",
            "\1\u00b2",
            "\1\u00b3",
            "",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\u00b5",
            "",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            ""
    };

    static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
    static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
    static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
    static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
    static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
    static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
    static final short[][] DFA13_transition;

    static {
        int numStates = DFA13_transitionS.length;
        DFA13_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
        }
    }

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = DFA13_eot;
            this.eof = DFA13_eof;
            this.min = DFA13_min;
            this.max = DFA13_max;
            this.accept = DFA13_accept;
            this.special = DFA13_special;
            this.transition = DFA13_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | RULE_BOOLEAN_CONSTANT | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA13_22 = input.LA(1);

                        s = -1;
                        if ( ((LA13_22>='\u0000' && LA13_22<='\uFFFF')) ) {s = 59;}

                        else s = 25;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA13_21 = input.LA(1);

                        s = -1;
                        if ( ((LA13_21>='\u0000' && LA13_21<='\uFFFF')) ) {s = 59;}

                        else s = 25;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA13_0 = input.LA(1);

                        s = -1;
                        if ( (LA13_0=='H') ) {s = 1;}

                        else if ( (LA13_0=='L') ) {s = 2;}

                        else if ( (LA13_0=='m') ) {s = 3;}

                        else if ( (LA13_0=='s') ) {s = 4;}

                        else if ( (LA13_0=='i') ) {s = 5;}

                        else if ( (LA13_0=='e') ) {s = 6;}

                        else if ( (LA13_0=='a') ) {s = 7;}

                        else if ( (LA13_0==':') ) {s = 8;}

                        else if ( (LA13_0=='b') ) {s = 9;}

                        else if ( (LA13_0=='w') ) {s = 10;}

                        else if ( (LA13_0=='d') ) {s = 11;}

                        else if ( (LA13_0=='t') ) {s = 12;}

                        else if ( (LA13_0=='A') ) {s = 13;}

                        else if ( (LA13_0=='D') ) {s = 14;}

                        else if ( (LA13_0=='c') ) {s = 15;}

                        else if ( (LA13_0=='g') ) {s = 16;}

                        else if ( (LA13_0=='f') ) {s = 17;}

                        else if ( (LA13_0=='^') ) {s = 18;}

                        else if ( ((LA13_0>='B' && LA13_0<='C')||(LA13_0>='E' && LA13_0<='G')||(LA13_0>='I' && LA13_0<='K')||(LA13_0>='M' && LA13_0<='Z')||LA13_0=='_'||LA13_0=='h'||(LA13_0>='j' && LA13_0<='l')||(LA13_0>='n' && LA13_0<='r')||(LA13_0>='u' && LA13_0<='v')||(LA13_0>='x' && LA13_0<='z')) ) {s = 19;}

                        else if ( ((LA13_0>='0' && LA13_0<='9')) ) {s = 20;}

                        else if ( (LA13_0=='\"') ) {s = 21;}

                        else if ( (LA13_0=='\'') ) {s = 22;}

                        else if ( (LA13_0=='/') ) {s = 23;}

                        else if ( ((LA13_0>='\t' && LA13_0<='\n')||LA13_0=='\r'||LA13_0==' ') ) {s = 24;}

                        else if ( ((LA13_0>='\u0000' && LA13_0<='\b')||(LA13_0>='\u000B' && LA13_0<='\f')||(LA13_0>='\u000E' && LA13_0<='\u001F')||LA13_0=='!'||(LA13_0>='#' && LA13_0<='&')||(LA13_0>='(' && LA13_0<='.')||(LA13_0>=';' && LA13_0<='@')||(LA13_0>='[' && LA13_0<=']')||LA13_0=='`'||(LA13_0>='{' && LA13_0<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 13, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}