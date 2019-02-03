package arduinoML.concretesyntax.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import arduinoML.concretesyntax.services.ArduinoMLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalArduinoMLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'app'", "'initial'", "'state'", "':'", "'bricks'", "'states'", "'mode'", "'modes'", "'Actuator'", "'Digital'", "'Analog'", "'change'", "'to'", "'when'", "'is'", "'and'", "'wait'", "'then'", "'go'", "'HIGH'", "'LOW'", "'ms'", "'s'", "'min'", "'inf'", "'einf'", "'equal'", "'esup'", "'sup'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalArduinoMLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalArduinoMLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalArduinoMLParser.tokenNames; }
    public String getGrammarFileName() { return "InternalArduinoML.g"; }



     	private ArduinoMLGrammarAccess grammarAccess;

        public InternalArduinoMLParser(TokenStream input, ArduinoMLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "App";
       	}

       	@Override
       	protected ArduinoMLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleApp"
    // InternalArduinoML.g:65:1: entryRuleApp returns [EObject current=null] : iv_ruleApp= ruleApp EOF ;
    public final EObject entryRuleApp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleApp = null;


        try {
            // InternalArduinoML.g:65:44: (iv_ruleApp= ruleApp EOF )
            // InternalArduinoML.g:66:2: iv_ruleApp= ruleApp EOF
            {
             newCompositeNode(grammarAccess.getAppRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleApp=ruleApp();

            state._fsp--;

             current =iv_ruleApp; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleApp"


    // $ANTLR start "ruleApp"
    // InternalArduinoML.g:72:1: ruleApp returns [EObject current=null] : ( (otherlv_0= 'app' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'initial' otherlv_3= 'state' ( ( ruleEString ) ) otherlv_5= ':' otherlv_6= 'bricks' otherlv_7= ':' ( (lv_bricks_8_0= ruleBrick ) ) ( (lv_bricks_9_0= ruleBrick ) )* otherlv_10= 'states' otherlv_11= ':' ( (lv_states_12_0= ruleState ) ) ( (lv_states_13_0= ruleState ) )* ) | (otherlv_14= 'app' ( (lv_name_15_0= ruleEString ) ) otherlv_16= 'initial' otherlv_17= 'mode' ( ( ruleEString ) ) otherlv_19= ':' otherlv_20= 'bricks' otherlv_21= ':' ( (lv_bricks_22_0= ruleBrick ) ) ( (lv_bricks_23_0= ruleBrick ) )* otherlv_24= 'modes' otherlv_25= ':' ( (lv_modes_26_0= ruleMode ) ) ( (lv_modes_27_0= ruleMode ) )* ) ) ;
    public final EObject ruleApp() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_bricks_8_0 = null;

        EObject lv_bricks_9_0 = null;

        EObject lv_states_12_0 = null;

        EObject lv_states_13_0 = null;

        AntlrDatatypeRuleToken lv_name_15_0 = null;

        EObject lv_bricks_22_0 = null;

        EObject lv_bricks_23_0 = null;

        EObject lv_modes_26_0 = null;

        EObject lv_modes_27_0 = null;



        	enterRule();

        try {
            // InternalArduinoML.g:78:2: ( ( (otherlv_0= 'app' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'initial' otherlv_3= 'state' ( ( ruleEString ) ) otherlv_5= ':' otherlv_6= 'bricks' otherlv_7= ':' ( (lv_bricks_8_0= ruleBrick ) ) ( (lv_bricks_9_0= ruleBrick ) )* otherlv_10= 'states' otherlv_11= ':' ( (lv_states_12_0= ruleState ) ) ( (lv_states_13_0= ruleState ) )* ) | (otherlv_14= 'app' ( (lv_name_15_0= ruleEString ) ) otherlv_16= 'initial' otherlv_17= 'mode' ( ( ruleEString ) ) otherlv_19= ':' otherlv_20= 'bricks' otherlv_21= ':' ( (lv_bricks_22_0= ruleBrick ) ) ( (lv_bricks_23_0= ruleBrick ) )* otherlv_24= 'modes' otherlv_25= ':' ( (lv_modes_26_0= ruleMode ) ) ( (lv_modes_27_0= ruleMode ) )* ) ) )
            // InternalArduinoML.g:79:2: ( (otherlv_0= 'app' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'initial' otherlv_3= 'state' ( ( ruleEString ) ) otherlv_5= ':' otherlv_6= 'bricks' otherlv_7= ':' ( (lv_bricks_8_0= ruleBrick ) ) ( (lv_bricks_9_0= ruleBrick ) )* otherlv_10= 'states' otherlv_11= ':' ( (lv_states_12_0= ruleState ) ) ( (lv_states_13_0= ruleState ) )* ) | (otherlv_14= 'app' ( (lv_name_15_0= ruleEString ) ) otherlv_16= 'initial' otherlv_17= 'mode' ( ( ruleEString ) ) otherlv_19= ':' otherlv_20= 'bricks' otherlv_21= ':' ( (lv_bricks_22_0= ruleBrick ) ) ( (lv_bricks_23_0= ruleBrick ) )* otherlv_24= 'modes' otherlv_25= ':' ( (lv_modes_26_0= ruleMode ) ) ( (lv_modes_27_0= ruleMode ) )* ) )
            {
            // InternalArduinoML.g:79:2: ( (otherlv_0= 'app' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'initial' otherlv_3= 'state' ( ( ruleEString ) ) otherlv_5= ':' otherlv_6= 'bricks' otherlv_7= ':' ( (lv_bricks_8_0= ruleBrick ) ) ( (lv_bricks_9_0= ruleBrick ) )* otherlv_10= 'states' otherlv_11= ':' ( (lv_states_12_0= ruleState ) ) ( (lv_states_13_0= ruleState ) )* ) | (otherlv_14= 'app' ( (lv_name_15_0= ruleEString ) ) otherlv_16= 'initial' otherlv_17= 'mode' ( ( ruleEString ) ) otherlv_19= ':' otherlv_20= 'bricks' otherlv_21= ':' ( (lv_bricks_22_0= ruleBrick ) ) ( (lv_bricks_23_0= ruleBrick ) )* otherlv_24= 'modes' otherlv_25= ':' ( (lv_modes_26_0= ruleMode ) ) ( (lv_modes_27_0= ruleMode ) )* ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==11) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==RULE_STRING) ) {
                    int LA5_2 = input.LA(3);

                    if ( (LA5_2==12) ) {
                        int LA5_4 = input.LA(4);

                        if ( (LA5_4==17) ) {
                            alt5=2;
                        }
                        else if ( (LA5_4==13) ) {
                            alt5=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 5, 4, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 2, input);

                        throw nvae;
                    }
                }
                else if ( (LA5_1==RULE_ID) ) {
                    int LA5_3 = input.LA(3);

                    if ( (LA5_3==12) ) {
                        int LA5_4 = input.LA(4);

                        if ( (LA5_4==17) ) {
                            alt5=2;
                        }
                        else if ( (LA5_4==13) ) {
                            alt5=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 5, 4, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalArduinoML.g:80:3: (otherlv_0= 'app' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'initial' otherlv_3= 'state' ( ( ruleEString ) ) otherlv_5= ':' otherlv_6= 'bricks' otherlv_7= ':' ( (lv_bricks_8_0= ruleBrick ) ) ( (lv_bricks_9_0= ruleBrick ) )* otherlv_10= 'states' otherlv_11= ':' ( (lv_states_12_0= ruleState ) ) ( (lv_states_13_0= ruleState ) )* )
                    {
                    // InternalArduinoML.g:80:3: (otherlv_0= 'app' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'initial' otherlv_3= 'state' ( ( ruleEString ) ) otherlv_5= ':' otherlv_6= 'bricks' otherlv_7= ':' ( (lv_bricks_8_0= ruleBrick ) ) ( (lv_bricks_9_0= ruleBrick ) )* otherlv_10= 'states' otherlv_11= ':' ( (lv_states_12_0= ruleState ) ) ( (lv_states_13_0= ruleState ) )* )
                    // InternalArduinoML.g:81:4: otherlv_0= 'app' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'initial' otherlv_3= 'state' ( ( ruleEString ) ) otherlv_5= ':' otherlv_6= 'bricks' otherlv_7= ':' ( (lv_bricks_8_0= ruleBrick ) ) ( (lv_bricks_9_0= ruleBrick ) )* otherlv_10= 'states' otherlv_11= ':' ( (lv_states_12_0= ruleState ) ) ( (lv_states_13_0= ruleState ) )*
                    {
                    otherlv_0=(Token)match(input,11,FOLLOW_3); 

                    				newLeafNode(otherlv_0, grammarAccess.getAppAccess().getAppKeyword_0_0());
                    			
                    // InternalArduinoML.g:85:4: ( (lv_name_1_0= ruleEString ) )
                    // InternalArduinoML.g:86:5: (lv_name_1_0= ruleEString )
                    {
                    // InternalArduinoML.g:86:5: (lv_name_1_0= ruleEString )
                    // InternalArduinoML.g:87:6: lv_name_1_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getAppAccess().getNameEStringParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_4);
                    lv_name_1_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAppRule());
                    						}
                    						set(
                    							current,
                    							"name",
                    							lv_name_1_0,
                    							"arduinoML.concretesyntax.ArduinoML.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_2=(Token)match(input,12,FOLLOW_5); 

                    				newLeafNode(otherlv_2, grammarAccess.getAppAccess().getInitialKeyword_0_2());
                    			
                    otherlv_3=(Token)match(input,13,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getAppAccess().getStateKeyword_0_3());
                    			
                    // InternalArduinoML.g:112:4: ( ( ruleEString ) )
                    // InternalArduinoML.g:113:5: ( ruleEString )
                    {
                    // InternalArduinoML.g:113:5: ( ruleEString )
                    // InternalArduinoML.g:114:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAppRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getAppAccess().getInitial_stateStateCrossReference_0_4_0());
                    					
                    pushFollow(FOLLOW_6);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_5=(Token)match(input,14,FOLLOW_7); 

                    				newLeafNode(otherlv_5, grammarAccess.getAppAccess().getColonKeyword_0_5());
                    			
                    otherlv_6=(Token)match(input,15,FOLLOW_6); 

                    				newLeafNode(otherlv_6, grammarAccess.getAppAccess().getBricksKeyword_0_6());
                    			
                    otherlv_7=(Token)match(input,14,FOLLOW_8); 

                    				newLeafNode(otherlv_7, grammarAccess.getAppAccess().getColonKeyword_0_7());
                    			
                    // InternalArduinoML.g:140:4: ( (lv_bricks_8_0= ruleBrick ) )
                    // InternalArduinoML.g:141:5: (lv_bricks_8_0= ruleBrick )
                    {
                    // InternalArduinoML.g:141:5: (lv_bricks_8_0= ruleBrick )
                    // InternalArduinoML.g:142:6: lv_bricks_8_0= ruleBrick
                    {

                    						newCompositeNode(grammarAccess.getAppAccess().getBricksBrickParserRuleCall_0_8_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_bricks_8_0=ruleBrick();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAppRule());
                    						}
                    						add(
                    							current,
                    							"bricks",
                    							lv_bricks_8_0,
                    							"arduinoML.concretesyntax.ArduinoML.Brick");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalArduinoML.g:159:4: ( (lv_bricks_9_0= ruleBrick ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( ((LA1_0>=19 && LA1_0<=21)) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalArduinoML.g:160:5: (lv_bricks_9_0= ruleBrick )
                    	    {
                    	    // InternalArduinoML.g:160:5: (lv_bricks_9_0= ruleBrick )
                    	    // InternalArduinoML.g:161:6: lv_bricks_9_0= ruleBrick
                    	    {

                    	    						newCompositeNode(grammarAccess.getAppAccess().getBricksBrickParserRuleCall_0_9_0());
                    	    					
                    	    pushFollow(FOLLOW_9);
                    	    lv_bricks_9_0=ruleBrick();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getAppRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"bricks",
                    	    							lv_bricks_9_0,
                    	    							"arduinoML.concretesyntax.ArduinoML.Brick");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,16,FOLLOW_6); 

                    				newLeafNode(otherlv_10, grammarAccess.getAppAccess().getStatesKeyword_0_10());
                    			
                    otherlv_11=(Token)match(input,14,FOLLOW_3); 

                    				newLeafNode(otherlv_11, grammarAccess.getAppAccess().getColonKeyword_0_11());
                    			
                    // InternalArduinoML.g:186:4: ( (lv_states_12_0= ruleState ) )
                    // InternalArduinoML.g:187:5: (lv_states_12_0= ruleState )
                    {
                    // InternalArduinoML.g:187:5: (lv_states_12_0= ruleState )
                    // InternalArduinoML.g:188:6: lv_states_12_0= ruleState
                    {

                    						newCompositeNode(grammarAccess.getAppAccess().getStatesStateParserRuleCall_0_12_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_states_12_0=ruleState();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAppRule());
                    						}
                    						add(
                    							current,
                    							"states",
                    							lv_states_12_0,
                    							"arduinoML.concretesyntax.ArduinoML.State");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalArduinoML.g:205:4: ( (lv_states_13_0= ruleState ) )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( ((LA2_0>=RULE_STRING && LA2_0<=RULE_ID)) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // InternalArduinoML.g:206:5: (lv_states_13_0= ruleState )
                    	    {
                    	    // InternalArduinoML.g:206:5: (lv_states_13_0= ruleState )
                    	    // InternalArduinoML.g:207:6: lv_states_13_0= ruleState
                    	    {

                    	    						newCompositeNode(grammarAccess.getAppAccess().getStatesStateParserRuleCall_0_13_0());
                    	    					
                    	    pushFollow(FOLLOW_10);
                    	    lv_states_13_0=ruleState();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getAppRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"states",
                    	    							lv_states_13_0,
                    	    							"arduinoML.concretesyntax.ArduinoML.State");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // InternalArduinoML.g:226:3: (otherlv_14= 'app' ( (lv_name_15_0= ruleEString ) ) otherlv_16= 'initial' otherlv_17= 'mode' ( ( ruleEString ) ) otherlv_19= ':' otherlv_20= 'bricks' otherlv_21= ':' ( (lv_bricks_22_0= ruleBrick ) ) ( (lv_bricks_23_0= ruleBrick ) )* otherlv_24= 'modes' otherlv_25= ':' ( (lv_modes_26_0= ruleMode ) ) ( (lv_modes_27_0= ruleMode ) )* )
                    {
                    // InternalArduinoML.g:226:3: (otherlv_14= 'app' ( (lv_name_15_0= ruleEString ) ) otherlv_16= 'initial' otherlv_17= 'mode' ( ( ruleEString ) ) otherlv_19= ':' otherlv_20= 'bricks' otherlv_21= ':' ( (lv_bricks_22_0= ruleBrick ) ) ( (lv_bricks_23_0= ruleBrick ) )* otherlv_24= 'modes' otherlv_25= ':' ( (lv_modes_26_0= ruleMode ) ) ( (lv_modes_27_0= ruleMode ) )* )
                    // InternalArduinoML.g:227:4: otherlv_14= 'app' ( (lv_name_15_0= ruleEString ) ) otherlv_16= 'initial' otherlv_17= 'mode' ( ( ruleEString ) ) otherlv_19= ':' otherlv_20= 'bricks' otherlv_21= ':' ( (lv_bricks_22_0= ruleBrick ) ) ( (lv_bricks_23_0= ruleBrick ) )* otherlv_24= 'modes' otherlv_25= ':' ( (lv_modes_26_0= ruleMode ) ) ( (lv_modes_27_0= ruleMode ) )*
                    {
                    otherlv_14=(Token)match(input,11,FOLLOW_3); 

                    				newLeafNode(otherlv_14, grammarAccess.getAppAccess().getAppKeyword_1_0());
                    			
                    // InternalArduinoML.g:231:4: ( (lv_name_15_0= ruleEString ) )
                    // InternalArduinoML.g:232:5: (lv_name_15_0= ruleEString )
                    {
                    // InternalArduinoML.g:232:5: (lv_name_15_0= ruleEString )
                    // InternalArduinoML.g:233:6: lv_name_15_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getAppAccess().getNameEStringParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_4);
                    lv_name_15_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAppRule());
                    						}
                    						set(
                    							current,
                    							"name",
                    							lv_name_15_0,
                    							"arduinoML.concretesyntax.ArduinoML.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_16=(Token)match(input,12,FOLLOW_11); 

                    				newLeafNode(otherlv_16, grammarAccess.getAppAccess().getInitialKeyword_1_2());
                    			
                    otherlv_17=(Token)match(input,17,FOLLOW_3); 

                    				newLeafNode(otherlv_17, grammarAccess.getAppAccess().getModeKeyword_1_3());
                    			
                    // InternalArduinoML.g:258:4: ( ( ruleEString ) )
                    // InternalArduinoML.g:259:5: ( ruleEString )
                    {
                    // InternalArduinoML.g:259:5: ( ruleEString )
                    // InternalArduinoML.g:260:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAppRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getAppAccess().getInitial_modeModeCrossReference_1_4_0());
                    					
                    pushFollow(FOLLOW_6);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_19=(Token)match(input,14,FOLLOW_7); 

                    				newLeafNode(otherlv_19, grammarAccess.getAppAccess().getColonKeyword_1_5());
                    			
                    otherlv_20=(Token)match(input,15,FOLLOW_6); 

                    				newLeafNode(otherlv_20, grammarAccess.getAppAccess().getBricksKeyword_1_6());
                    			
                    otherlv_21=(Token)match(input,14,FOLLOW_8); 

                    				newLeafNode(otherlv_21, grammarAccess.getAppAccess().getColonKeyword_1_7());
                    			
                    // InternalArduinoML.g:286:4: ( (lv_bricks_22_0= ruleBrick ) )
                    // InternalArduinoML.g:287:5: (lv_bricks_22_0= ruleBrick )
                    {
                    // InternalArduinoML.g:287:5: (lv_bricks_22_0= ruleBrick )
                    // InternalArduinoML.g:288:6: lv_bricks_22_0= ruleBrick
                    {

                    						newCompositeNode(grammarAccess.getAppAccess().getBricksBrickParserRuleCall_1_8_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_bricks_22_0=ruleBrick();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAppRule());
                    						}
                    						add(
                    							current,
                    							"bricks",
                    							lv_bricks_22_0,
                    							"arduinoML.concretesyntax.ArduinoML.Brick");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalArduinoML.g:305:4: ( (lv_bricks_23_0= ruleBrick ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( ((LA3_0>=19 && LA3_0<=21)) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalArduinoML.g:306:5: (lv_bricks_23_0= ruleBrick )
                    	    {
                    	    // InternalArduinoML.g:306:5: (lv_bricks_23_0= ruleBrick )
                    	    // InternalArduinoML.g:307:6: lv_bricks_23_0= ruleBrick
                    	    {

                    	    						newCompositeNode(grammarAccess.getAppAccess().getBricksBrickParserRuleCall_1_9_0());
                    	    					
                    	    pushFollow(FOLLOW_12);
                    	    lv_bricks_23_0=ruleBrick();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getAppRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"bricks",
                    	    							lv_bricks_23_0,
                    	    							"arduinoML.concretesyntax.ArduinoML.Brick");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    otherlv_24=(Token)match(input,18,FOLLOW_6); 

                    				newLeafNode(otherlv_24, grammarAccess.getAppAccess().getModesKeyword_1_10());
                    			
                    otherlv_25=(Token)match(input,14,FOLLOW_3); 

                    				newLeafNode(otherlv_25, grammarAccess.getAppAccess().getColonKeyword_1_11());
                    			
                    // InternalArduinoML.g:332:4: ( (lv_modes_26_0= ruleMode ) )
                    // InternalArduinoML.g:333:5: (lv_modes_26_0= ruleMode )
                    {
                    // InternalArduinoML.g:333:5: (lv_modes_26_0= ruleMode )
                    // InternalArduinoML.g:334:6: lv_modes_26_0= ruleMode
                    {

                    						newCompositeNode(grammarAccess.getAppAccess().getModesModeParserRuleCall_1_12_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_modes_26_0=ruleMode();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAppRule());
                    						}
                    						add(
                    							current,
                    							"modes",
                    							lv_modes_26_0,
                    							"arduinoML.concretesyntax.ArduinoML.Mode");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalArduinoML.g:351:4: ( (lv_modes_27_0= ruleMode ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( ((LA4_0>=RULE_STRING && LA4_0<=RULE_ID)) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalArduinoML.g:352:5: (lv_modes_27_0= ruleMode )
                    	    {
                    	    // InternalArduinoML.g:352:5: (lv_modes_27_0= ruleMode )
                    	    // InternalArduinoML.g:353:6: lv_modes_27_0= ruleMode
                    	    {

                    	    						newCompositeNode(grammarAccess.getAppAccess().getModesModeParserRuleCall_1_13_0());
                    	    					
                    	    pushFollow(FOLLOW_10);
                    	    lv_modes_27_0=ruleMode();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getAppRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"modes",
                    	    							lv_modes_27_0,
                    	    							"arduinoML.concretesyntax.ArduinoML.Mode");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleApp"


    // $ANTLR start "entryRuleBrick"
    // InternalArduinoML.g:375:1: entryRuleBrick returns [EObject current=null] : iv_ruleBrick= ruleBrick EOF ;
    public final EObject entryRuleBrick() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBrick = null;


        try {
            // InternalArduinoML.g:375:46: (iv_ruleBrick= ruleBrick EOF )
            // InternalArduinoML.g:376:2: iv_ruleBrick= ruleBrick EOF
            {
             newCompositeNode(grammarAccess.getBrickRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBrick=ruleBrick();

            state._fsp--;

             current =iv_ruleBrick; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBrick"


    // $ANTLR start "ruleBrick"
    // InternalArduinoML.g:382:1: ruleBrick returns [EObject current=null] : ( (this_Actuator_0= ruleActuator | this_Digital_1= ruleDigital | this_Analog_2= ruleAnalog ) ( (lv_name_3_0= ruleEString ) ) otherlv_4= ':' ( (lv_pin_5_0= ruleEInt ) ) ) ;
    public final EObject ruleBrick() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        EObject this_Actuator_0 = null;

        EObject this_Digital_1 = null;

        EObject this_Analog_2 = null;

        AntlrDatatypeRuleToken lv_name_3_0 = null;

        AntlrDatatypeRuleToken lv_pin_5_0 = null;



        	enterRule();

        try {
            // InternalArduinoML.g:388:2: ( ( (this_Actuator_0= ruleActuator | this_Digital_1= ruleDigital | this_Analog_2= ruleAnalog ) ( (lv_name_3_0= ruleEString ) ) otherlv_4= ':' ( (lv_pin_5_0= ruleEInt ) ) ) )
            // InternalArduinoML.g:389:2: ( (this_Actuator_0= ruleActuator | this_Digital_1= ruleDigital | this_Analog_2= ruleAnalog ) ( (lv_name_3_0= ruleEString ) ) otherlv_4= ':' ( (lv_pin_5_0= ruleEInt ) ) )
            {
            // InternalArduinoML.g:389:2: ( (this_Actuator_0= ruleActuator | this_Digital_1= ruleDigital | this_Analog_2= ruleAnalog ) ( (lv_name_3_0= ruleEString ) ) otherlv_4= ':' ( (lv_pin_5_0= ruleEInt ) ) )
            // InternalArduinoML.g:390:3: (this_Actuator_0= ruleActuator | this_Digital_1= ruleDigital | this_Analog_2= ruleAnalog ) ( (lv_name_3_0= ruleEString ) ) otherlv_4= ':' ( (lv_pin_5_0= ruleEInt ) )
            {
            // InternalArduinoML.g:390:3: (this_Actuator_0= ruleActuator | this_Digital_1= ruleDigital | this_Analog_2= ruleAnalog )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt6=1;
                }
                break;
            case 20:
                {
                alt6=2;
                }
                break;
            case 21:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalArduinoML.g:391:4: this_Actuator_0= ruleActuator
                    {

                    				newCompositeNode(grammarAccess.getBrickAccess().getActuatorParserRuleCall_0_0());
                    			
                    pushFollow(FOLLOW_3);
                    this_Actuator_0=ruleActuator();

                    state._fsp--;


                    				current = this_Actuator_0;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 2 :
                    // InternalArduinoML.g:400:4: this_Digital_1= ruleDigital
                    {

                    				newCompositeNode(grammarAccess.getBrickAccess().getDigitalParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_3);
                    this_Digital_1=ruleDigital();

                    state._fsp--;


                    				current = this_Digital_1;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 3 :
                    // InternalArduinoML.g:409:4: this_Analog_2= ruleAnalog
                    {

                    				newCompositeNode(grammarAccess.getBrickAccess().getAnalogParserRuleCall_0_2());
                    			
                    pushFollow(FOLLOW_3);
                    this_Analog_2=ruleAnalog();

                    state._fsp--;


                    				current = this_Analog_2;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            // InternalArduinoML.g:418:3: ( (lv_name_3_0= ruleEString ) )
            // InternalArduinoML.g:419:4: (lv_name_3_0= ruleEString )
            {
            // InternalArduinoML.g:419:4: (lv_name_3_0= ruleEString )
            // InternalArduinoML.g:420:5: lv_name_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getBrickAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_6);
            lv_name_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBrickRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_3_0,
            						"arduinoML.concretesyntax.ArduinoML.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,14,FOLLOW_13); 

            			newLeafNode(otherlv_4, grammarAccess.getBrickAccess().getColonKeyword_2());
            		
            // InternalArduinoML.g:441:3: ( (lv_pin_5_0= ruleEInt ) )
            // InternalArduinoML.g:442:4: (lv_pin_5_0= ruleEInt )
            {
            // InternalArduinoML.g:442:4: (lv_pin_5_0= ruleEInt )
            // InternalArduinoML.g:443:5: lv_pin_5_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getBrickAccess().getPinEIntParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_pin_5_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBrickRule());
            					}
            					set(
            						current,
            						"pin",
            						lv_pin_5_0,
            						"arduinoML.concretesyntax.ArduinoML.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBrick"


    // $ANTLR start "entryRuleEString"
    // InternalArduinoML.g:464:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalArduinoML.g:464:47: (iv_ruleEString= ruleEString EOF )
            // InternalArduinoML.g:465:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalArduinoML.g:471:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalArduinoML.g:477:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalArduinoML.g:478:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalArduinoML.g:478:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_STRING) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_ID) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalArduinoML.g:479:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalArduinoML.g:487:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleMode"
    // InternalArduinoML.g:498:1: entryRuleMode returns [EObject current=null] : iv_ruleMode= ruleMode EOF ;
    public final EObject entryRuleMode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMode = null;


        try {
            // InternalArduinoML.g:498:45: (iv_ruleMode= ruleMode EOF )
            // InternalArduinoML.g:499:2: iv_ruleMode= ruleMode EOF
            {
             newCompositeNode(grammarAccess.getModeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMode=ruleMode();

            state._fsp--;

             current =iv_ruleMode; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMode"


    // $ANTLR start "ruleMode"
    // InternalArduinoML.g:505:1: ruleMode returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= 'initial' otherlv_2= 'state' ( ( ruleEString ) ) otherlv_4= ':' (otherlv_5= 'bricks' otherlv_6= ':' ( (lv_bricks_7_0= ruleBrick ) ) ( (lv_bricks_8_0= ruleBrick ) )* )? otherlv_9= 'states' otherlv_10= ':' ( (lv_states_11_0= ruleState ) ) ( (lv_states_12_0= ruleState ) )* ) ;
    public final EObject ruleMode() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_bricks_7_0 = null;

        EObject lv_bricks_8_0 = null;

        EObject lv_states_11_0 = null;

        EObject lv_states_12_0 = null;



        	enterRule();

        try {
            // InternalArduinoML.g:511:2: ( ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= 'initial' otherlv_2= 'state' ( ( ruleEString ) ) otherlv_4= ':' (otherlv_5= 'bricks' otherlv_6= ':' ( (lv_bricks_7_0= ruleBrick ) ) ( (lv_bricks_8_0= ruleBrick ) )* )? otherlv_9= 'states' otherlv_10= ':' ( (lv_states_11_0= ruleState ) ) ( (lv_states_12_0= ruleState ) )* ) )
            // InternalArduinoML.g:512:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= 'initial' otherlv_2= 'state' ( ( ruleEString ) ) otherlv_4= ':' (otherlv_5= 'bricks' otherlv_6= ':' ( (lv_bricks_7_0= ruleBrick ) ) ( (lv_bricks_8_0= ruleBrick ) )* )? otherlv_9= 'states' otherlv_10= ':' ( (lv_states_11_0= ruleState ) ) ( (lv_states_12_0= ruleState ) )* )
            {
            // InternalArduinoML.g:512:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= 'initial' otherlv_2= 'state' ( ( ruleEString ) ) otherlv_4= ':' (otherlv_5= 'bricks' otherlv_6= ':' ( (lv_bricks_7_0= ruleBrick ) ) ( (lv_bricks_8_0= ruleBrick ) )* )? otherlv_9= 'states' otherlv_10= ':' ( (lv_states_11_0= ruleState ) ) ( (lv_states_12_0= ruleState ) )* )
            // InternalArduinoML.g:513:3: ( (lv_name_0_0= ruleEString ) ) otherlv_1= 'initial' otherlv_2= 'state' ( ( ruleEString ) ) otherlv_4= ':' (otherlv_5= 'bricks' otherlv_6= ':' ( (lv_bricks_7_0= ruleBrick ) ) ( (lv_bricks_8_0= ruleBrick ) )* )? otherlv_9= 'states' otherlv_10= ':' ( (lv_states_11_0= ruleState ) ) ( (lv_states_12_0= ruleState ) )*
            {
            // InternalArduinoML.g:513:3: ( (lv_name_0_0= ruleEString ) )
            // InternalArduinoML.g:514:4: (lv_name_0_0= ruleEString )
            {
            // InternalArduinoML.g:514:4: (lv_name_0_0= ruleEString )
            // InternalArduinoML.g:515:5: lv_name_0_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getModeAccess().getNameEStringParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_0_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getModeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"arduinoML.concretesyntax.ArduinoML.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getModeAccess().getInitialKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getModeAccess().getStateKeyword_2());
            		
            // InternalArduinoML.g:540:3: ( ( ruleEString ) )
            // InternalArduinoML.g:541:4: ( ruleEString )
            {
            // InternalArduinoML.g:541:4: ( ruleEString )
            // InternalArduinoML.g:542:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getModeRule());
            					}
            				

            					newCompositeNode(grammarAccess.getModeAccess().getInitialStateCrossReference_3_0());
            				
            pushFollow(FOLLOW_6);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,14,FOLLOW_14); 

            			newLeafNode(otherlv_4, grammarAccess.getModeAccess().getColonKeyword_4());
            		
            // InternalArduinoML.g:560:3: (otherlv_5= 'bricks' otherlv_6= ':' ( (lv_bricks_7_0= ruleBrick ) ) ( (lv_bricks_8_0= ruleBrick ) )* )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==15) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalArduinoML.g:561:4: otherlv_5= 'bricks' otherlv_6= ':' ( (lv_bricks_7_0= ruleBrick ) ) ( (lv_bricks_8_0= ruleBrick ) )*
                    {
                    otherlv_5=(Token)match(input,15,FOLLOW_6); 

                    				newLeafNode(otherlv_5, grammarAccess.getModeAccess().getBricksKeyword_5_0());
                    			
                    otherlv_6=(Token)match(input,14,FOLLOW_8); 

                    				newLeafNode(otherlv_6, grammarAccess.getModeAccess().getColonKeyword_5_1());
                    			
                    // InternalArduinoML.g:569:4: ( (lv_bricks_7_0= ruleBrick ) )
                    // InternalArduinoML.g:570:5: (lv_bricks_7_0= ruleBrick )
                    {
                    // InternalArduinoML.g:570:5: (lv_bricks_7_0= ruleBrick )
                    // InternalArduinoML.g:571:6: lv_bricks_7_0= ruleBrick
                    {

                    						newCompositeNode(grammarAccess.getModeAccess().getBricksBrickParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_bricks_7_0=ruleBrick();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getModeRule());
                    						}
                    						add(
                    							current,
                    							"bricks",
                    							lv_bricks_7_0,
                    							"arduinoML.concretesyntax.ArduinoML.Brick");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalArduinoML.g:588:4: ( (lv_bricks_8_0= ruleBrick ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( ((LA8_0>=19 && LA8_0<=21)) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalArduinoML.g:589:5: (lv_bricks_8_0= ruleBrick )
                    	    {
                    	    // InternalArduinoML.g:589:5: (lv_bricks_8_0= ruleBrick )
                    	    // InternalArduinoML.g:590:6: lv_bricks_8_0= ruleBrick
                    	    {

                    	    						newCompositeNode(grammarAccess.getModeAccess().getBricksBrickParserRuleCall_5_3_0());
                    	    					
                    	    pushFollow(FOLLOW_9);
                    	    lv_bricks_8_0=ruleBrick();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getModeRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"bricks",
                    	    							lv_bricks_8_0,
                    	    							"arduinoML.concretesyntax.ArduinoML.Brick");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_9=(Token)match(input,16,FOLLOW_6); 

            			newLeafNode(otherlv_9, grammarAccess.getModeAccess().getStatesKeyword_6());
            		
            otherlv_10=(Token)match(input,14,FOLLOW_3); 

            			newLeafNode(otherlv_10, grammarAccess.getModeAccess().getColonKeyword_7());
            		
            // InternalArduinoML.g:616:3: ( (lv_states_11_0= ruleState ) )
            // InternalArduinoML.g:617:4: (lv_states_11_0= ruleState )
            {
            // InternalArduinoML.g:617:4: (lv_states_11_0= ruleState )
            // InternalArduinoML.g:618:5: lv_states_11_0= ruleState
            {

            					newCompositeNode(grammarAccess.getModeAccess().getStatesStateParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_10);
            lv_states_11_0=ruleState();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getModeRule());
            					}
            					add(
            						current,
            						"states",
            						lv_states_11_0,
            						"arduinoML.concretesyntax.ArduinoML.State");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalArduinoML.g:635:3: ( (lv_states_12_0= ruleState ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_STRING) ) {
                    int LA10_1 = input.LA(2);

                    if ( (LA10_1==14) ) {
                        alt10=1;
                    }


                }
                else if ( (LA10_0==RULE_ID) ) {
                    int LA10_2 = input.LA(2);

                    if ( (LA10_2==14) ) {
                        alt10=1;
                    }


                }


                switch (alt10) {
            	case 1 :
            	    // InternalArduinoML.g:636:4: (lv_states_12_0= ruleState )
            	    {
            	    // InternalArduinoML.g:636:4: (lv_states_12_0= ruleState )
            	    // InternalArduinoML.g:637:5: lv_states_12_0= ruleState
            	    {

            	    					newCompositeNode(grammarAccess.getModeAccess().getStatesStateParserRuleCall_9_0());
            	    				
            	    pushFollow(FOLLOW_10);
            	    lv_states_12_0=ruleState();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModeRule());
            	    					}
            	    					add(
            	    						current,
            	    						"states",
            	    						lv_states_12_0,
            	    						"arduinoML.concretesyntax.ArduinoML.State");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMode"


    // $ANTLR start "entryRuleState"
    // InternalArduinoML.g:658:1: entryRuleState returns [EObject current=null] : iv_ruleState= ruleState EOF ;
    public final EObject entryRuleState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleState = null;


        try {
            // InternalArduinoML.g:658:46: (iv_ruleState= ruleState EOF )
            // InternalArduinoML.g:659:2: iv_ruleState= ruleState EOF
            {
             newCompositeNode(grammarAccess.getStateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleState=ruleState();

            state._fsp--;

             current =iv_ruleState; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleState"


    // $ANTLR start "ruleState"
    // InternalArduinoML.g:665:1: ruleState returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_actions_2_0= ruleAction ) ) ( (lv_actions_3_0= ruleAction ) )* ( (lv_transitions_4_0= ruleTransition ) ) ( (lv_transitions_5_0= ruleTransition ) )* ) ;
    public final EObject ruleState() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_actions_2_0 = null;

        EObject lv_actions_3_0 = null;

        EObject lv_transitions_4_0 = null;

        EObject lv_transitions_5_0 = null;



        	enterRule();

        try {
            // InternalArduinoML.g:671:2: ( ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_actions_2_0= ruleAction ) ) ( (lv_actions_3_0= ruleAction ) )* ( (lv_transitions_4_0= ruleTransition ) ) ( (lv_transitions_5_0= ruleTransition ) )* ) )
            // InternalArduinoML.g:672:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_actions_2_0= ruleAction ) ) ( (lv_actions_3_0= ruleAction ) )* ( (lv_transitions_4_0= ruleTransition ) ) ( (lv_transitions_5_0= ruleTransition ) )* )
            {
            // InternalArduinoML.g:672:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_actions_2_0= ruleAction ) ) ( (lv_actions_3_0= ruleAction ) )* ( (lv_transitions_4_0= ruleTransition ) ) ( (lv_transitions_5_0= ruleTransition ) )* )
            // InternalArduinoML.g:673:3: ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_actions_2_0= ruleAction ) ) ( (lv_actions_3_0= ruleAction ) )* ( (lv_transitions_4_0= ruleTransition ) ) ( (lv_transitions_5_0= ruleTransition ) )*
            {
            // InternalArduinoML.g:673:3: ( (lv_name_0_0= ruleEString ) )
            // InternalArduinoML.g:674:4: (lv_name_0_0= ruleEString )
            {
            // InternalArduinoML.g:674:4: (lv_name_0_0= ruleEString )
            // InternalArduinoML.g:675:5: lv_name_0_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getStateAccess().getNameEStringParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_6);
            lv_name_0_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStateRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"arduinoML.concretesyntax.ArduinoML.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,14,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getStateAccess().getColonKeyword_1());
            		
            // InternalArduinoML.g:696:3: ( (lv_actions_2_0= ruleAction ) )
            // InternalArduinoML.g:697:4: (lv_actions_2_0= ruleAction )
            {
            // InternalArduinoML.g:697:4: (lv_actions_2_0= ruleAction )
            // InternalArduinoML.g:698:5: lv_actions_2_0= ruleAction
            {

            					newCompositeNode(grammarAccess.getStateAccess().getActionsActionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_16);
            lv_actions_2_0=ruleAction();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStateRule());
            					}
            					add(
            						current,
            						"actions",
            						lv_actions_2_0,
            						"arduinoML.concretesyntax.ArduinoML.Action");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalArduinoML.g:715:3: ( (lv_actions_3_0= ruleAction ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==22) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalArduinoML.g:716:4: (lv_actions_3_0= ruleAction )
            	    {
            	    // InternalArduinoML.g:716:4: (lv_actions_3_0= ruleAction )
            	    // InternalArduinoML.g:717:5: lv_actions_3_0= ruleAction
            	    {

            	    					newCompositeNode(grammarAccess.getStateAccess().getActionsActionParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_16);
            	    lv_actions_3_0=ruleAction();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getStateRule());
            	    					}
            	    					add(
            	    						current,
            	    						"actions",
            	    						lv_actions_3_0,
            	    						"arduinoML.concretesyntax.ArduinoML.Action");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            // InternalArduinoML.g:734:3: ( (lv_transitions_4_0= ruleTransition ) )
            // InternalArduinoML.g:735:4: (lv_transitions_4_0= ruleTransition )
            {
            // InternalArduinoML.g:735:4: (lv_transitions_4_0= ruleTransition )
            // InternalArduinoML.g:736:5: lv_transitions_4_0= ruleTransition
            {

            					newCompositeNode(grammarAccess.getStateAccess().getTransitionsTransitionParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_17);
            lv_transitions_4_0=ruleTransition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStateRule());
            					}
            					add(
            						current,
            						"transitions",
            						lv_transitions_4_0,
            						"arduinoML.concretesyntax.ArduinoML.Transition");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalArduinoML.g:753:3: ( (lv_transitions_5_0= ruleTransition ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==24||LA12_0==27) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalArduinoML.g:754:4: (lv_transitions_5_0= ruleTransition )
            	    {
            	    // InternalArduinoML.g:754:4: (lv_transitions_5_0= ruleTransition )
            	    // InternalArduinoML.g:755:5: lv_transitions_5_0= ruleTransition
            	    {

            	    					newCompositeNode(grammarAccess.getStateAccess().getTransitionsTransitionParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_17);
            	    lv_transitions_5_0=ruleTransition();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getStateRule());
            	    					}
            	    					add(
            	    						current,
            	    						"transitions",
            	    						lv_transitions_5_0,
            	    						"arduinoML.concretesyntax.ArduinoML.Transition");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleState"


    // $ANTLR start "entryRuleEInt"
    // InternalArduinoML.g:776:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalArduinoML.g:776:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalArduinoML.g:777:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalArduinoML.g:783:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;


        	enterRule();

        try {
            // InternalArduinoML.g:789:2: (this_INT_0= RULE_INT )
            // InternalArduinoML.g:790:2: this_INT_0= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            		current.merge(this_INT_0);
            	

            		newLeafNode(this_INT_0, grammarAccess.getEIntAccess().getINTTerminalRuleCall());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleActuator"
    // InternalArduinoML.g:800:1: entryRuleActuator returns [EObject current=null] : iv_ruleActuator= ruleActuator EOF ;
    public final EObject entryRuleActuator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActuator = null;


        try {
            // InternalArduinoML.g:800:49: (iv_ruleActuator= ruleActuator EOF )
            // InternalArduinoML.g:801:2: iv_ruleActuator= ruleActuator EOF
            {
             newCompositeNode(grammarAccess.getActuatorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleActuator=ruleActuator();

            state._fsp--;

             current =iv_ruleActuator; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleActuator"


    // $ANTLR start "ruleActuator"
    // InternalArduinoML.g:807:1: ruleActuator returns [EObject current=null] : ( () otherlv_1= 'Actuator' ) ;
    public final EObject ruleActuator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalArduinoML.g:813:2: ( ( () otherlv_1= 'Actuator' ) )
            // InternalArduinoML.g:814:2: ( () otherlv_1= 'Actuator' )
            {
            // InternalArduinoML.g:814:2: ( () otherlv_1= 'Actuator' )
            // InternalArduinoML.g:815:3: () otherlv_1= 'Actuator'
            {
            // InternalArduinoML.g:815:3: ()
            // InternalArduinoML.g:816:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getActuatorAccess().getActuatorAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getActuatorAccess().getActuatorKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleActuator"


    // $ANTLR start "entryRuleDigital"
    // InternalArduinoML.g:830:1: entryRuleDigital returns [EObject current=null] : iv_ruleDigital= ruleDigital EOF ;
    public final EObject entryRuleDigital() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDigital = null;


        try {
            // InternalArduinoML.g:830:48: (iv_ruleDigital= ruleDigital EOF )
            // InternalArduinoML.g:831:2: iv_ruleDigital= ruleDigital EOF
            {
             newCompositeNode(grammarAccess.getDigitalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDigital=ruleDigital();

            state._fsp--;

             current =iv_ruleDigital; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDigital"


    // $ANTLR start "ruleDigital"
    // InternalArduinoML.g:837:1: ruleDigital returns [EObject current=null] : ( () otherlv_1= 'Digital' ) ;
    public final EObject ruleDigital() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalArduinoML.g:843:2: ( ( () otherlv_1= 'Digital' ) )
            // InternalArduinoML.g:844:2: ( () otherlv_1= 'Digital' )
            {
            // InternalArduinoML.g:844:2: ( () otherlv_1= 'Digital' )
            // InternalArduinoML.g:845:3: () otherlv_1= 'Digital'
            {
            // InternalArduinoML.g:845:3: ()
            // InternalArduinoML.g:846:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDigitalAccess().getDigitalAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getDigitalAccess().getDigitalKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDigital"


    // $ANTLR start "entryRuleAnalog"
    // InternalArduinoML.g:860:1: entryRuleAnalog returns [EObject current=null] : iv_ruleAnalog= ruleAnalog EOF ;
    public final EObject entryRuleAnalog() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnalog = null;


        try {
            // InternalArduinoML.g:860:47: (iv_ruleAnalog= ruleAnalog EOF )
            // InternalArduinoML.g:861:2: iv_ruleAnalog= ruleAnalog EOF
            {
             newCompositeNode(grammarAccess.getAnalogRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAnalog=ruleAnalog();

            state._fsp--;

             current =iv_ruleAnalog; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAnalog"


    // $ANTLR start "ruleAnalog"
    // InternalArduinoML.g:867:1: ruleAnalog returns [EObject current=null] : ( () otherlv_1= 'Analog' ) ;
    public final EObject ruleAnalog() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalArduinoML.g:873:2: ( ( () otherlv_1= 'Analog' ) )
            // InternalArduinoML.g:874:2: ( () otherlv_1= 'Analog' )
            {
            // InternalArduinoML.g:874:2: ( () otherlv_1= 'Analog' )
            // InternalArduinoML.g:875:3: () otherlv_1= 'Analog'
            {
            // InternalArduinoML.g:875:3: ()
            // InternalArduinoML.g:876:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAnalogAccess().getAnalogAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getAnalogAccess().getAnalogKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAnalog"


    // $ANTLR start "entryRuleAction"
    // InternalArduinoML.g:890:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // InternalArduinoML.g:890:47: (iv_ruleAction= ruleAction EOF )
            // InternalArduinoML.g:891:2: iv_ruleAction= ruleAction EOF
            {
             newCompositeNode(grammarAccess.getActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAction=ruleAction();

            state._fsp--;

             current =iv_ruleAction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAction"


    // $ANTLR start "ruleAction"
    // InternalArduinoML.g:897:1: ruleAction returns [EObject current=null] : (otherlv_0= 'change' ( ( ruleEString ) ) otherlv_2= 'to' ( (lv_value_3_0= ruleSignal ) ) ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Enumerator lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalArduinoML.g:903:2: ( (otherlv_0= 'change' ( ( ruleEString ) ) otherlv_2= 'to' ( (lv_value_3_0= ruleSignal ) ) ) )
            // InternalArduinoML.g:904:2: (otherlv_0= 'change' ( ( ruleEString ) ) otherlv_2= 'to' ( (lv_value_3_0= ruleSignal ) ) )
            {
            // InternalArduinoML.g:904:2: (otherlv_0= 'change' ( ( ruleEString ) ) otherlv_2= 'to' ( (lv_value_3_0= ruleSignal ) ) )
            // InternalArduinoML.g:905:3: otherlv_0= 'change' ( ( ruleEString ) ) otherlv_2= 'to' ( (lv_value_3_0= ruleSignal ) )
            {
            otherlv_0=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getActionAccess().getChangeKeyword_0());
            		
            // InternalArduinoML.g:909:3: ( ( ruleEString ) )
            // InternalArduinoML.g:910:4: ( ruleEString )
            {
            // InternalArduinoML.g:910:4: ( ruleEString )
            // InternalArduinoML.g:911:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getActionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getActionAccess().getActuatorActuatorCrossReference_1_0());
            				
            pushFollow(FOLLOW_18);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,23,FOLLOW_19); 

            			newLeafNode(otherlv_2, grammarAccess.getActionAccess().getToKeyword_2());
            		
            // InternalArduinoML.g:929:3: ( (lv_value_3_0= ruleSignal ) )
            // InternalArduinoML.g:930:4: (lv_value_3_0= ruleSignal )
            {
            // InternalArduinoML.g:930:4: (lv_value_3_0= ruleSignal )
            // InternalArduinoML.g:931:5: lv_value_3_0= ruleSignal
            {

            					newCompositeNode(grammarAccess.getActionAccess().getValueSignalEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_3_0=ruleSignal();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getActionRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_3_0,
            						"arduinoML.concretesyntax.ArduinoML.Signal");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAction"


    // $ANTLR start "entryRuleTransition"
    // InternalArduinoML.g:952:1: entryRuleTransition returns [EObject current=null] : iv_ruleTransition= ruleTransition EOF ;
    public final EObject entryRuleTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransition = null;


        try {
            // InternalArduinoML.g:952:51: (iv_ruleTransition= ruleTransition EOF )
            // InternalArduinoML.g:953:2: iv_ruleTransition= ruleTransition EOF
            {
             newCompositeNode(grammarAccess.getTransitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTransition=ruleTransition();

            state._fsp--;

             current =iv_ruleTransition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTransition"


    // $ANTLR start "ruleTransition"
    // InternalArduinoML.g:959:1: ruleTransition returns [EObject current=null] : ( ( (otherlv_0= 'when' ( ( ( ( ruleEString ) ) otherlv_2= 'is' ( (lv_d_values_3_0= ruleSignal ) ) ) | ( ( ( ruleEString ) ) ( (lv_comp_5_0= ruleCompare ) ) ( (lv_a_values_6_0= ruleEInt ) ) ) ) (otherlv_7= 'and' ( ( ( ( ruleEString ) ) otherlv_9= 'is' ( (lv_d_values_10_0= ruleSignal ) ) ) | ( ( ( ruleEString ) ) ( (lv_comp_12_0= ruleCompare ) ) ( (lv_a_values_13_0= ruleEInt ) ) ) ) )* (otherlv_14= 'wait' ( (lv_time_15_0= ruleEInt ) ) ( (lv_unit_16_0= ruleTime_unit ) ) otherlv_17= 'then' )? ) | (otherlv_18= 'wait' ( (lv_time_19_0= ruleEInt ) ) ( (lv_unit_20_0= ruleTime_unit ) ) otherlv_21= 'then' ) ) otherlv_22= 'go' otherlv_23= 'to' ( (otherlv_24= 'state' ( ( ruleEString ) ) ) | (otherlv_26= 'mode' ( ( ruleEString ) ) ) ) ) ;
    public final EObject ruleTransition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_14=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        Enumerator lv_d_values_3_0 = null;

        Enumerator lv_comp_5_0 = null;

        AntlrDatatypeRuleToken lv_a_values_6_0 = null;

        Enumerator lv_d_values_10_0 = null;

        Enumerator lv_comp_12_0 = null;

        AntlrDatatypeRuleToken lv_a_values_13_0 = null;

        AntlrDatatypeRuleToken lv_time_15_0 = null;

        Enumerator lv_unit_16_0 = null;

        AntlrDatatypeRuleToken lv_time_19_0 = null;

        Enumerator lv_unit_20_0 = null;



        	enterRule();

        try {
            // InternalArduinoML.g:965:2: ( ( ( (otherlv_0= 'when' ( ( ( ( ruleEString ) ) otherlv_2= 'is' ( (lv_d_values_3_0= ruleSignal ) ) ) | ( ( ( ruleEString ) ) ( (lv_comp_5_0= ruleCompare ) ) ( (lv_a_values_6_0= ruleEInt ) ) ) ) (otherlv_7= 'and' ( ( ( ( ruleEString ) ) otherlv_9= 'is' ( (lv_d_values_10_0= ruleSignal ) ) ) | ( ( ( ruleEString ) ) ( (lv_comp_12_0= ruleCompare ) ) ( (lv_a_values_13_0= ruleEInt ) ) ) ) )* (otherlv_14= 'wait' ( (lv_time_15_0= ruleEInt ) ) ( (lv_unit_16_0= ruleTime_unit ) ) otherlv_17= 'then' )? ) | (otherlv_18= 'wait' ( (lv_time_19_0= ruleEInt ) ) ( (lv_unit_20_0= ruleTime_unit ) ) otherlv_21= 'then' ) ) otherlv_22= 'go' otherlv_23= 'to' ( (otherlv_24= 'state' ( ( ruleEString ) ) ) | (otherlv_26= 'mode' ( ( ruleEString ) ) ) ) ) )
            // InternalArduinoML.g:966:2: ( ( (otherlv_0= 'when' ( ( ( ( ruleEString ) ) otherlv_2= 'is' ( (lv_d_values_3_0= ruleSignal ) ) ) | ( ( ( ruleEString ) ) ( (lv_comp_5_0= ruleCompare ) ) ( (lv_a_values_6_0= ruleEInt ) ) ) ) (otherlv_7= 'and' ( ( ( ( ruleEString ) ) otherlv_9= 'is' ( (lv_d_values_10_0= ruleSignal ) ) ) | ( ( ( ruleEString ) ) ( (lv_comp_12_0= ruleCompare ) ) ( (lv_a_values_13_0= ruleEInt ) ) ) ) )* (otherlv_14= 'wait' ( (lv_time_15_0= ruleEInt ) ) ( (lv_unit_16_0= ruleTime_unit ) ) otherlv_17= 'then' )? ) | (otherlv_18= 'wait' ( (lv_time_19_0= ruleEInt ) ) ( (lv_unit_20_0= ruleTime_unit ) ) otherlv_21= 'then' ) ) otherlv_22= 'go' otherlv_23= 'to' ( (otherlv_24= 'state' ( ( ruleEString ) ) ) | (otherlv_26= 'mode' ( ( ruleEString ) ) ) ) )
            {
            // InternalArduinoML.g:966:2: ( ( (otherlv_0= 'when' ( ( ( ( ruleEString ) ) otherlv_2= 'is' ( (lv_d_values_3_0= ruleSignal ) ) ) | ( ( ( ruleEString ) ) ( (lv_comp_5_0= ruleCompare ) ) ( (lv_a_values_6_0= ruleEInt ) ) ) ) (otherlv_7= 'and' ( ( ( ( ruleEString ) ) otherlv_9= 'is' ( (lv_d_values_10_0= ruleSignal ) ) ) | ( ( ( ruleEString ) ) ( (lv_comp_12_0= ruleCompare ) ) ( (lv_a_values_13_0= ruleEInt ) ) ) ) )* (otherlv_14= 'wait' ( (lv_time_15_0= ruleEInt ) ) ( (lv_unit_16_0= ruleTime_unit ) ) otherlv_17= 'then' )? ) | (otherlv_18= 'wait' ( (lv_time_19_0= ruleEInt ) ) ( (lv_unit_20_0= ruleTime_unit ) ) otherlv_21= 'then' ) ) otherlv_22= 'go' otherlv_23= 'to' ( (otherlv_24= 'state' ( ( ruleEString ) ) ) | (otherlv_26= 'mode' ( ( ruleEString ) ) ) ) )
            // InternalArduinoML.g:967:3: ( (otherlv_0= 'when' ( ( ( ( ruleEString ) ) otherlv_2= 'is' ( (lv_d_values_3_0= ruleSignal ) ) ) | ( ( ( ruleEString ) ) ( (lv_comp_5_0= ruleCompare ) ) ( (lv_a_values_6_0= ruleEInt ) ) ) ) (otherlv_7= 'and' ( ( ( ( ruleEString ) ) otherlv_9= 'is' ( (lv_d_values_10_0= ruleSignal ) ) ) | ( ( ( ruleEString ) ) ( (lv_comp_12_0= ruleCompare ) ) ( (lv_a_values_13_0= ruleEInt ) ) ) ) )* (otherlv_14= 'wait' ( (lv_time_15_0= ruleEInt ) ) ( (lv_unit_16_0= ruleTime_unit ) ) otherlv_17= 'then' )? ) | (otherlv_18= 'wait' ( (lv_time_19_0= ruleEInt ) ) ( (lv_unit_20_0= ruleTime_unit ) ) otherlv_21= 'then' ) ) otherlv_22= 'go' otherlv_23= 'to' ( (otherlv_24= 'state' ( ( ruleEString ) ) ) | (otherlv_26= 'mode' ( ( ruleEString ) ) ) )
            {
            // InternalArduinoML.g:967:3: ( (otherlv_0= 'when' ( ( ( ( ruleEString ) ) otherlv_2= 'is' ( (lv_d_values_3_0= ruleSignal ) ) ) | ( ( ( ruleEString ) ) ( (lv_comp_5_0= ruleCompare ) ) ( (lv_a_values_6_0= ruleEInt ) ) ) ) (otherlv_7= 'and' ( ( ( ( ruleEString ) ) otherlv_9= 'is' ( (lv_d_values_10_0= ruleSignal ) ) ) | ( ( ( ruleEString ) ) ( (lv_comp_12_0= ruleCompare ) ) ( (lv_a_values_13_0= ruleEInt ) ) ) ) )* (otherlv_14= 'wait' ( (lv_time_15_0= ruleEInt ) ) ( (lv_unit_16_0= ruleTime_unit ) ) otherlv_17= 'then' )? ) | (otherlv_18= 'wait' ( (lv_time_19_0= ruleEInt ) ) ( (lv_unit_20_0= ruleTime_unit ) ) otherlv_21= 'then' ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==24) ) {
                alt17=1;
            }
            else if ( (LA17_0==27) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalArduinoML.g:968:4: (otherlv_0= 'when' ( ( ( ( ruleEString ) ) otherlv_2= 'is' ( (lv_d_values_3_0= ruleSignal ) ) ) | ( ( ( ruleEString ) ) ( (lv_comp_5_0= ruleCompare ) ) ( (lv_a_values_6_0= ruleEInt ) ) ) ) (otherlv_7= 'and' ( ( ( ( ruleEString ) ) otherlv_9= 'is' ( (lv_d_values_10_0= ruleSignal ) ) ) | ( ( ( ruleEString ) ) ( (lv_comp_12_0= ruleCompare ) ) ( (lv_a_values_13_0= ruleEInt ) ) ) ) )* (otherlv_14= 'wait' ( (lv_time_15_0= ruleEInt ) ) ( (lv_unit_16_0= ruleTime_unit ) ) otherlv_17= 'then' )? )
                    {
                    // InternalArduinoML.g:968:4: (otherlv_0= 'when' ( ( ( ( ruleEString ) ) otherlv_2= 'is' ( (lv_d_values_3_0= ruleSignal ) ) ) | ( ( ( ruleEString ) ) ( (lv_comp_5_0= ruleCompare ) ) ( (lv_a_values_6_0= ruleEInt ) ) ) ) (otherlv_7= 'and' ( ( ( ( ruleEString ) ) otherlv_9= 'is' ( (lv_d_values_10_0= ruleSignal ) ) ) | ( ( ( ruleEString ) ) ( (lv_comp_12_0= ruleCompare ) ) ( (lv_a_values_13_0= ruleEInt ) ) ) ) )* (otherlv_14= 'wait' ( (lv_time_15_0= ruleEInt ) ) ( (lv_unit_16_0= ruleTime_unit ) ) otherlv_17= 'then' )? )
                    // InternalArduinoML.g:969:5: otherlv_0= 'when' ( ( ( ( ruleEString ) ) otherlv_2= 'is' ( (lv_d_values_3_0= ruleSignal ) ) ) | ( ( ( ruleEString ) ) ( (lv_comp_5_0= ruleCompare ) ) ( (lv_a_values_6_0= ruleEInt ) ) ) ) (otherlv_7= 'and' ( ( ( ( ruleEString ) ) otherlv_9= 'is' ( (lv_d_values_10_0= ruleSignal ) ) ) | ( ( ( ruleEString ) ) ( (lv_comp_12_0= ruleCompare ) ) ( (lv_a_values_13_0= ruleEInt ) ) ) ) )* (otherlv_14= 'wait' ( (lv_time_15_0= ruleEInt ) ) ( (lv_unit_16_0= ruleTime_unit ) ) otherlv_17= 'then' )?
                    {
                    otherlv_0=(Token)match(input,24,FOLLOW_3); 

                    					newLeafNode(otherlv_0, grammarAccess.getTransitionAccess().getWhenKeyword_0_0_0());
                    				
                    // InternalArduinoML.g:973:5: ( ( ( ( ruleEString ) ) otherlv_2= 'is' ( (lv_d_values_3_0= ruleSignal ) ) ) | ( ( ( ruleEString ) ) ( (lv_comp_5_0= ruleCompare ) ) ( (lv_a_values_6_0= ruleEInt ) ) ) )
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==RULE_STRING) ) {
                        int LA13_1 = input.LA(2);

                        if ( (LA13_1==25) ) {
                            alt13=1;
                        }
                        else if ( ((LA13_1>=35 && LA13_1<=39)) ) {
                            alt13=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 13, 1, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA13_0==RULE_ID) ) {
                        int LA13_2 = input.LA(2);

                        if ( ((LA13_2>=35 && LA13_2<=39)) ) {
                            alt13=2;
                        }
                        else if ( (LA13_2==25) ) {
                            alt13=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 13, 2, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 13, 0, input);

                        throw nvae;
                    }
                    switch (alt13) {
                        case 1 :
                            // InternalArduinoML.g:974:6: ( ( ( ruleEString ) ) otherlv_2= 'is' ( (lv_d_values_3_0= ruleSignal ) ) )
                            {
                            // InternalArduinoML.g:974:6: ( ( ( ruleEString ) ) otherlv_2= 'is' ( (lv_d_values_3_0= ruleSignal ) ) )
                            // InternalArduinoML.g:975:7: ( ( ruleEString ) ) otherlv_2= 'is' ( (lv_d_values_3_0= ruleSignal ) )
                            {
                            // InternalArduinoML.g:975:7: ( ( ruleEString ) )
                            // InternalArduinoML.g:976:8: ( ruleEString )
                            {
                            // InternalArduinoML.g:976:8: ( ruleEString )
                            // InternalArduinoML.g:977:9: ruleEString
                            {

                            									if (current==null) {
                            										current = createModelElement(grammarAccess.getTransitionRule());
                            									}
                            								

                            									newCompositeNode(grammarAccess.getTransitionAccess().getDigitalsDigitalCrossReference_0_0_1_0_0_0());
                            								
                            pushFollow(FOLLOW_20);
                            ruleEString();

                            state._fsp--;


                            									afterParserOrEnumRuleCall();
                            								

                            }


                            }

                            otherlv_2=(Token)match(input,25,FOLLOW_19); 

                            							newLeafNode(otherlv_2, grammarAccess.getTransitionAccess().getIsKeyword_0_0_1_0_1());
                            						
                            // InternalArduinoML.g:995:7: ( (lv_d_values_3_0= ruleSignal ) )
                            // InternalArduinoML.g:996:8: (lv_d_values_3_0= ruleSignal )
                            {
                            // InternalArduinoML.g:996:8: (lv_d_values_3_0= ruleSignal )
                            // InternalArduinoML.g:997:9: lv_d_values_3_0= ruleSignal
                            {

                            									newCompositeNode(grammarAccess.getTransitionAccess().getD_valuesSignalEnumRuleCall_0_0_1_0_2_0());
                            								
                            pushFollow(FOLLOW_21);
                            lv_d_values_3_0=ruleSignal();

                            state._fsp--;


                            									if (current==null) {
                            										current = createModelElementForParent(grammarAccess.getTransitionRule());
                            									}
                            									add(
                            										current,
                            										"d_values",
                            										lv_d_values_3_0,
                            										"arduinoML.concretesyntax.ArduinoML.Signal");
                            									afterParserOrEnumRuleCall();
                            								

                            }


                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalArduinoML.g:1016:6: ( ( ( ruleEString ) ) ( (lv_comp_5_0= ruleCompare ) ) ( (lv_a_values_6_0= ruleEInt ) ) )
                            {
                            // InternalArduinoML.g:1016:6: ( ( ( ruleEString ) ) ( (lv_comp_5_0= ruleCompare ) ) ( (lv_a_values_6_0= ruleEInt ) ) )
                            // InternalArduinoML.g:1017:7: ( ( ruleEString ) ) ( (lv_comp_5_0= ruleCompare ) ) ( (lv_a_values_6_0= ruleEInt ) )
                            {
                            // InternalArduinoML.g:1017:7: ( ( ruleEString ) )
                            // InternalArduinoML.g:1018:8: ( ruleEString )
                            {
                            // InternalArduinoML.g:1018:8: ( ruleEString )
                            // InternalArduinoML.g:1019:9: ruleEString
                            {

                            									if (current==null) {
                            										current = createModelElement(grammarAccess.getTransitionRule());
                            									}
                            								

                            									newCompositeNode(grammarAccess.getTransitionAccess().getAnalogsAnalogCrossReference_0_0_1_1_0_0());
                            								
                            pushFollow(FOLLOW_22);
                            ruleEString();

                            state._fsp--;


                            									afterParserOrEnumRuleCall();
                            								

                            }


                            }

                            // InternalArduinoML.g:1033:7: ( (lv_comp_5_0= ruleCompare ) )
                            // InternalArduinoML.g:1034:8: (lv_comp_5_0= ruleCompare )
                            {
                            // InternalArduinoML.g:1034:8: (lv_comp_5_0= ruleCompare )
                            // InternalArduinoML.g:1035:9: lv_comp_5_0= ruleCompare
                            {

                            									newCompositeNode(grammarAccess.getTransitionAccess().getCompCompareEnumRuleCall_0_0_1_1_1_0());
                            								
                            pushFollow(FOLLOW_13);
                            lv_comp_5_0=ruleCompare();

                            state._fsp--;


                            									if (current==null) {
                            										current = createModelElementForParent(grammarAccess.getTransitionRule());
                            									}
                            									add(
                            										current,
                            										"comp",
                            										lv_comp_5_0,
                            										"arduinoML.concretesyntax.ArduinoML.Compare");
                            									afterParserOrEnumRuleCall();
                            								

                            }


                            }

                            // InternalArduinoML.g:1052:7: ( (lv_a_values_6_0= ruleEInt ) )
                            // InternalArduinoML.g:1053:8: (lv_a_values_6_0= ruleEInt )
                            {
                            // InternalArduinoML.g:1053:8: (lv_a_values_6_0= ruleEInt )
                            // InternalArduinoML.g:1054:9: lv_a_values_6_0= ruleEInt
                            {

                            									newCompositeNode(grammarAccess.getTransitionAccess().getA_valuesEIntParserRuleCall_0_0_1_1_2_0());
                            								
                            pushFollow(FOLLOW_21);
                            lv_a_values_6_0=ruleEInt();

                            state._fsp--;


                            									if (current==null) {
                            										current = createModelElementForParent(grammarAccess.getTransitionRule());
                            									}
                            									add(
                            										current,
                            										"a_values",
                            										lv_a_values_6_0,
                            										"arduinoML.concretesyntax.ArduinoML.EInt");
                            									afterParserOrEnumRuleCall();
                            								

                            }


                            }


                            }


                            }
                            break;

                    }

                    // InternalArduinoML.g:1073:5: (otherlv_7= 'and' ( ( ( ( ruleEString ) ) otherlv_9= 'is' ( (lv_d_values_10_0= ruleSignal ) ) ) | ( ( ( ruleEString ) ) ( (lv_comp_12_0= ruleCompare ) ) ( (lv_a_values_13_0= ruleEInt ) ) ) ) )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==26) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // InternalArduinoML.g:1074:6: otherlv_7= 'and' ( ( ( ( ruleEString ) ) otherlv_9= 'is' ( (lv_d_values_10_0= ruleSignal ) ) ) | ( ( ( ruleEString ) ) ( (lv_comp_12_0= ruleCompare ) ) ( (lv_a_values_13_0= ruleEInt ) ) ) )
                    	    {
                    	    otherlv_7=(Token)match(input,26,FOLLOW_3); 

                    	    						newLeafNode(otherlv_7, grammarAccess.getTransitionAccess().getAndKeyword_0_0_2_0());
                    	    					
                    	    // InternalArduinoML.g:1078:6: ( ( ( ( ruleEString ) ) otherlv_9= 'is' ( (lv_d_values_10_0= ruleSignal ) ) ) | ( ( ( ruleEString ) ) ( (lv_comp_12_0= ruleCompare ) ) ( (lv_a_values_13_0= ruleEInt ) ) ) )
                    	    int alt14=2;
                    	    int LA14_0 = input.LA(1);

                    	    if ( (LA14_0==RULE_STRING) ) {
                    	        int LA14_1 = input.LA(2);

                    	        if ( ((LA14_1>=35 && LA14_1<=39)) ) {
                    	            alt14=2;
                    	        }
                    	        else if ( (LA14_1==25) ) {
                    	            alt14=1;
                    	        }
                    	        else {
                    	            NoViableAltException nvae =
                    	                new NoViableAltException("", 14, 1, input);

                    	            throw nvae;
                    	        }
                    	    }
                    	    else if ( (LA14_0==RULE_ID) ) {
                    	        int LA14_2 = input.LA(2);

                    	        if ( (LA14_2==25) ) {
                    	            alt14=1;
                    	        }
                    	        else if ( ((LA14_2>=35 && LA14_2<=39)) ) {
                    	            alt14=2;
                    	        }
                    	        else {
                    	            NoViableAltException nvae =
                    	                new NoViableAltException("", 14, 2, input);

                    	            throw nvae;
                    	        }
                    	    }
                    	    else {
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 14, 0, input);

                    	        throw nvae;
                    	    }
                    	    switch (alt14) {
                    	        case 1 :
                    	            // InternalArduinoML.g:1079:7: ( ( ( ruleEString ) ) otherlv_9= 'is' ( (lv_d_values_10_0= ruleSignal ) ) )
                    	            {
                    	            // InternalArduinoML.g:1079:7: ( ( ( ruleEString ) ) otherlv_9= 'is' ( (lv_d_values_10_0= ruleSignal ) ) )
                    	            // InternalArduinoML.g:1080:8: ( ( ruleEString ) ) otherlv_9= 'is' ( (lv_d_values_10_0= ruleSignal ) )
                    	            {
                    	            // InternalArduinoML.g:1080:8: ( ( ruleEString ) )
                    	            // InternalArduinoML.g:1081:9: ( ruleEString )
                    	            {
                    	            // InternalArduinoML.g:1081:9: ( ruleEString )
                    	            // InternalArduinoML.g:1082:10: ruleEString
                    	            {

                    	            										if (current==null) {
                    	            											current = createModelElement(grammarAccess.getTransitionRule());
                    	            										}
                    	            									

                    	            										newCompositeNode(grammarAccess.getTransitionAccess().getDigitalsDigitalCrossReference_0_0_2_1_0_0_0());
                    	            									
                    	            pushFollow(FOLLOW_20);
                    	            ruleEString();

                    	            state._fsp--;


                    	            										afterParserOrEnumRuleCall();
                    	            									

                    	            }


                    	            }

                    	            otherlv_9=(Token)match(input,25,FOLLOW_19); 

                    	            								newLeafNode(otherlv_9, grammarAccess.getTransitionAccess().getIsKeyword_0_0_2_1_0_1());
                    	            							
                    	            // InternalArduinoML.g:1100:8: ( (lv_d_values_10_0= ruleSignal ) )
                    	            // InternalArduinoML.g:1101:9: (lv_d_values_10_0= ruleSignal )
                    	            {
                    	            // InternalArduinoML.g:1101:9: (lv_d_values_10_0= ruleSignal )
                    	            // InternalArduinoML.g:1102:10: lv_d_values_10_0= ruleSignal
                    	            {

                    	            										newCompositeNode(grammarAccess.getTransitionAccess().getD_valuesSignalEnumRuleCall_0_0_2_1_0_2_0());
                    	            									
                    	            pushFollow(FOLLOW_21);
                    	            lv_d_values_10_0=ruleSignal();

                    	            state._fsp--;


                    	            										if (current==null) {
                    	            											current = createModelElementForParent(grammarAccess.getTransitionRule());
                    	            										}
                    	            										add(
                    	            											current,
                    	            											"d_values",
                    	            											lv_d_values_10_0,
                    	            											"arduinoML.concretesyntax.ArduinoML.Signal");
                    	            										afterParserOrEnumRuleCall();
                    	            									

                    	            }


                    	            }


                    	            }


                    	            }
                    	            break;
                    	        case 2 :
                    	            // InternalArduinoML.g:1121:7: ( ( ( ruleEString ) ) ( (lv_comp_12_0= ruleCompare ) ) ( (lv_a_values_13_0= ruleEInt ) ) )
                    	            {
                    	            // InternalArduinoML.g:1121:7: ( ( ( ruleEString ) ) ( (lv_comp_12_0= ruleCompare ) ) ( (lv_a_values_13_0= ruleEInt ) ) )
                    	            // InternalArduinoML.g:1122:8: ( ( ruleEString ) ) ( (lv_comp_12_0= ruleCompare ) ) ( (lv_a_values_13_0= ruleEInt ) )
                    	            {
                    	            // InternalArduinoML.g:1122:8: ( ( ruleEString ) )
                    	            // InternalArduinoML.g:1123:9: ( ruleEString )
                    	            {
                    	            // InternalArduinoML.g:1123:9: ( ruleEString )
                    	            // InternalArduinoML.g:1124:10: ruleEString
                    	            {

                    	            										if (current==null) {
                    	            											current = createModelElement(grammarAccess.getTransitionRule());
                    	            										}
                    	            									

                    	            										newCompositeNode(grammarAccess.getTransitionAccess().getAnalogsAnalogCrossReference_0_0_2_1_1_0_0());
                    	            									
                    	            pushFollow(FOLLOW_22);
                    	            ruleEString();

                    	            state._fsp--;


                    	            										afterParserOrEnumRuleCall();
                    	            									

                    	            }


                    	            }

                    	            // InternalArduinoML.g:1138:8: ( (lv_comp_12_0= ruleCompare ) )
                    	            // InternalArduinoML.g:1139:9: (lv_comp_12_0= ruleCompare )
                    	            {
                    	            // InternalArduinoML.g:1139:9: (lv_comp_12_0= ruleCompare )
                    	            // InternalArduinoML.g:1140:10: lv_comp_12_0= ruleCompare
                    	            {

                    	            										newCompositeNode(grammarAccess.getTransitionAccess().getCompCompareEnumRuleCall_0_0_2_1_1_1_0());
                    	            									
                    	            pushFollow(FOLLOW_13);
                    	            lv_comp_12_0=ruleCompare();

                    	            state._fsp--;


                    	            										if (current==null) {
                    	            											current = createModelElementForParent(grammarAccess.getTransitionRule());
                    	            										}
                    	            										add(
                    	            											current,
                    	            											"comp",
                    	            											lv_comp_12_0,
                    	            											"arduinoML.concretesyntax.ArduinoML.Compare");
                    	            										afterParserOrEnumRuleCall();
                    	            									

                    	            }


                    	            }

                    	            // InternalArduinoML.g:1157:8: ( (lv_a_values_13_0= ruleEInt ) )
                    	            // InternalArduinoML.g:1158:9: (lv_a_values_13_0= ruleEInt )
                    	            {
                    	            // InternalArduinoML.g:1158:9: (lv_a_values_13_0= ruleEInt )
                    	            // InternalArduinoML.g:1159:10: lv_a_values_13_0= ruleEInt
                    	            {

                    	            										newCompositeNode(grammarAccess.getTransitionAccess().getA_valuesEIntParserRuleCall_0_0_2_1_1_2_0());
                    	            									
                    	            pushFollow(FOLLOW_21);
                    	            lv_a_values_13_0=ruleEInt();

                    	            state._fsp--;


                    	            										if (current==null) {
                    	            											current = createModelElementForParent(grammarAccess.getTransitionRule());
                    	            										}
                    	            										add(
                    	            											current,
                    	            											"a_values",
                    	            											lv_a_values_13_0,
                    	            											"arduinoML.concretesyntax.ArduinoML.EInt");
                    	            										afterParserOrEnumRuleCall();
                    	            									

                    	            }


                    	            }


                    	            }


                    	            }
                    	            break;

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);

                    // InternalArduinoML.g:1179:5: (otherlv_14= 'wait' ( (lv_time_15_0= ruleEInt ) ) ( (lv_unit_16_0= ruleTime_unit ) ) otherlv_17= 'then' )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==27) ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // InternalArduinoML.g:1180:6: otherlv_14= 'wait' ( (lv_time_15_0= ruleEInt ) ) ( (lv_unit_16_0= ruleTime_unit ) ) otherlv_17= 'then'
                            {
                            otherlv_14=(Token)match(input,27,FOLLOW_13); 

                            						newLeafNode(otherlv_14, grammarAccess.getTransitionAccess().getWaitKeyword_0_0_3_0());
                            					
                            // InternalArduinoML.g:1184:6: ( (lv_time_15_0= ruleEInt ) )
                            // InternalArduinoML.g:1185:7: (lv_time_15_0= ruleEInt )
                            {
                            // InternalArduinoML.g:1185:7: (lv_time_15_0= ruleEInt )
                            // InternalArduinoML.g:1186:8: lv_time_15_0= ruleEInt
                            {

                            								newCompositeNode(grammarAccess.getTransitionAccess().getTimeEIntParserRuleCall_0_0_3_1_0());
                            							
                            pushFollow(FOLLOW_23);
                            lv_time_15_0=ruleEInt();

                            state._fsp--;


                            								if (current==null) {
                            									current = createModelElementForParent(grammarAccess.getTransitionRule());
                            								}
                            								set(
                            									current,
                            									"time",
                            									lv_time_15_0,
                            									"arduinoML.concretesyntax.ArduinoML.EInt");
                            								afterParserOrEnumRuleCall();
                            							

                            }


                            }

                            // InternalArduinoML.g:1203:6: ( (lv_unit_16_0= ruleTime_unit ) )
                            // InternalArduinoML.g:1204:7: (lv_unit_16_0= ruleTime_unit )
                            {
                            // InternalArduinoML.g:1204:7: (lv_unit_16_0= ruleTime_unit )
                            // InternalArduinoML.g:1205:8: lv_unit_16_0= ruleTime_unit
                            {

                            								newCompositeNode(grammarAccess.getTransitionAccess().getUnitTime_unitEnumRuleCall_0_0_3_2_0());
                            							
                            pushFollow(FOLLOW_24);
                            lv_unit_16_0=ruleTime_unit();

                            state._fsp--;


                            								if (current==null) {
                            									current = createModelElementForParent(grammarAccess.getTransitionRule());
                            								}
                            								set(
                            									current,
                            									"unit",
                            									lv_unit_16_0,
                            									"arduinoML.concretesyntax.ArduinoML.Time_unit");
                            								afterParserOrEnumRuleCall();
                            							

                            }


                            }

                            otherlv_17=(Token)match(input,28,FOLLOW_25); 

                            						newLeafNode(otherlv_17, grammarAccess.getTransitionAccess().getThenKeyword_0_0_3_3());
                            					

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalArduinoML.g:1229:4: (otherlv_18= 'wait' ( (lv_time_19_0= ruleEInt ) ) ( (lv_unit_20_0= ruleTime_unit ) ) otherlv_21= 'then' )
                    {
                    // InternalArduinoML.g:1229:4: (otherlv_18= 'wait' ( (lv_time_19_0= ruleEInt ) ) ( (lv_unit_20_0= ruleTime_unit ) ) otherlv_21= 'then' )
                    // InternalArduinoML.g:1230:5: otherlv_18= 'wait' ( (lv_time_19_0= ruleEInt ) ) ( (lv_unit_20_0= ruleTime_unit ) ) otherlv_21= 'then'
                    {
                    otherlv_18=(Token)match(input,27,FOLLOW_13); 

                    					newLeafNode(otherlv_18, grammarAccess.getTransitionAccess().getWaitKeyword_0_1_0());
                    				
                    // InternalArduinoML.g:1234:5: ( (lv_time_19_0= ruleEInt ) )
                    // InternalArduinoML.g:1235:6: (lv_time_19_0= ruleEInt )
                    {
                    // InternalArduinoML.g:1235:6: (lv_time_19_0= ruleEInt )
                    // InternalArduinoML.g:1236:7: lv_time_19_0= ruleEInt
                    {

                    							newCompositeNode(grammarAccess.getTransitionAccess().getTimeEIntParserRuleCall_0_1_1_0());
                    						
                    pushFollow(FOLLOW_23);
                    lv_time_19_0=ruleEInt();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getTransitionRule());
                    							}
                    							set(
                    								current,
                    								"time",
                    								lv_time_19_0,
                    								"arduinoML.concretesyntax.ArduinoML.EInt");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    // InternalArduinoML.g:1253:5: ( (lv_unit_20_0= ruleTime_unit ) )
                    // InternalArduinoML.g:1254:6: (lv_unit_20_0= ruleTime_unit )
                    {
                    // InternalArduinoML.g:1254:6: (lv_unit_20_0= ruleTime_unit )
                    // InternalArduinoML.g:1255:7: lv_unit_20_0= ruleTime_unit
                    {

                    							newCompositeNode(grammarAccess.getTransitionAccess().getUnitTime_unitEnumRuleCall_0_1_2_0());
                    						
                    pushFollow(FOLLOW_24);
                    lv_unit_20_0=ruleTime_unit();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getTransitionRule());
                    							}
                    							set(
                    								current,
                    								"unit",
                    								lv_unit_20_0,
                    								"arduinoML.concretesyntax.ArduinoML.Time_unit");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    otherlv_21=(Token)match(input,28,FOLLOW_25); 

                    					newLeafNode(otherlv_21, grammarAccess.getTransitionAccess().getThenKeyword_0_1_3());
                    				

                    }


                    }
                    break;

            }

            otherlv_22=(Token)match(input,29,FOLLOW_18); 

            			newLeafNode(otherlv_22, grammarAccess.getTransitionAccess().getGoKeyword_1());
            		
            otherlv_23=(Token)match(input,23,FOLLOW_26); 

            			newLeafNode(otherlv_23, grammarAccess.getTransitionAccess().getToKeyword_2());
            		
            // InternalArduinoML.g:1286:3: ( (otherlv_24= 'state' ( ( ruleEString ) ) ) | (otherlv_26= 'mode' ( ( ruleEString ) ) ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==13) ) {
                alt18=1;
            }
            else if ( (LA18_0==17) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalArduinoML.g:1287:4: (otherlv_24= 'state' ( ( ruleEString ) ) )
                    {
                    // InternalArduinoML.g:1287:4: (otherlv_24= 'state' ( ( ruleEString ) ) )
                    // InternalArduinoML.g:1288:5: otherlv_24= 'state' ( ( ruleEString ) )
                    {
                    otherlv_24=(Token)match(input,13,FOLLOW_3); 

                    					newLeafNode(otherlv_24, grammarAccess.getTransitionAccess().getStateKeyword_3_0_0());
                    				
                    // InternalArduinoML.g:1292:5: ( ( ruleEString ) )
                    // InternalArduinoML.g:1293:6: ( ruleEString )
                    {
                    // InternalArduinoML.g:1293:6: ( ruleEString )
                    // InternalArduinoML.g:1294:7: ruleEString
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getTransitionRule());
                    							}
                    						

                    							newCompositeNode(grammarAccess.getTransitionAccess().getNext_stateStateCrossReference_3_0_1_0());
                    						
                    pushFollow(FOLLOW_2);
                    ruleEString();

                    state._fsp--;


                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalArduinoML.g:1310:4: (otherlv_26= 'mode' ( ( ruleEString ) ) )
                    {
                    // InternalArduinoML.g:1310:4: (otherlv_26= 'mode' ( ( ruleEString ) ) )
                    // InternalArduinoML.g:1311:5: otherlv_26= 'mode' ( ( ruleEString ) )
                    {
                    otherlv_26=(Token)match(input,17,FOLLOW_3); 

                    					newLeafNode(otherlv_26, grammarAccess.getTransitionAccess().getModeKeyword_3_1_0());
                    				
                    // InternalArduinoML.g:1315:5: ( ( ruleEString ) )
                    // InternalArduinoML.g:1316:6: ( ruleEString )
                    {
                    // InternalArduinoML.g:1316:6: ( ruleEString )
                    // InternalArduinoML.g:1317:7: ruleEString
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getTransitionRule());
                    							}
                    						

                    							newCompositeNode(grammarAccess.getTransitionAccess().getNext_modeModeCrossReference_3_1_1_0());
                    						
                    pushFollow(FOLLOW_2);
                    ruleEString();

                    state._fsp--;


                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTransition"


    // $ANTLR start "ruleSignal"
    // InternalArduinoML.g:1337:1: ruleSignal returns [Enumerator current=null] : ( (enumLiteral_0= 'HIGH' ) | (enumLiteral_1= 'LOW' ) ) ;
    public final Enumerator ruleSignal() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalArduinoML.g:1343:2: ( ( (enumLiteral_0= 'HIGH' ) | (enumLiteral_1= 'LOW' ) ) )
            // InternalArduinoML.g:1344:2: ( (enumLiteral_0= 'HIGH' ) | (enumLiteral_1= 'LOW' ) )
            {
            // InternalArduinoML.g:1344:2: ( (enumLiteral_0= 'HIGH' ) | (enumLiteral_1= 'LOW' ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==30) ) {
                alt19=1;
            }
            else if ( (LA19_0==31) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalArduinoML.g:1345:3: (enumLiteral_0= 'HIGH' )
                    {
                    // InternalArduinoML.g:1345:3: (enumLiteral_0= 'HIGH' )
                    // InternalArduinoML.g:1346:4: enumLiteral_0= 'HIGH'
                    {
                    enumLiteral_0=(Token)match(input,30,FOLLOW_2); 

                    				current = grammarAccess.getSignalAccess().getHIGHEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getSignalAccess().getHIGHEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalArduinoML.g:1353:3: (enumLiteral_1= 'LOW' )
                    {
                    // InternalArduinoML.g:1353:3: (enumLiteral_1= 'LOW' )
                    // InternalArduinoML.g:1354:4: enumLiteral_1= 'LOW'
                    {
                    enumLiteral_1=(Token)match(input,31,FOLLOW_2); 

                    				current = grammarAccess.getSignalAccess().getLOWEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getSignalAccess().getLOWEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSignal"


    // $ANTLR start "ruleTime_unit"
    // InternalArduinoML.g:1364:1: ruleTime_unit returns [Enumerator current=null] : ( (enumLiteral_0= 'ms' ) | (enumLiteral_1= 's' ) | (enumLiteral_2= 'min' ) ) ;
    public final Enumerator ruleTime_unit() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalArduinoML.g:1370:2: ( ( (enumLiteral_0= 'ms' ) | (enumLiteral_1= 's' ) | (enumLiteral_2= 'min' ) ) )
            // InternalArduinoML.g:1371:2: ( (enumLiteral_0= 'ms' ) | (enumLiteral_1= 's' ) | (enumLiteral_2= 'min' ) )
            {
            // InternalArduinoML.g:1371:2: ( (enumLiteral_0= 'ms' ) | (enumLiteral_1= 's' ) | (enumLiteral_2= 'min' ) )
            int alt20=3;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt20=1;
                }
                break;
            case 33:
                {
                alt20=2;
                }
                break;
            case 34:
                {
                alt20=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // InternalArduinoML.g:1372:3: (enumLiteral_0= 'ms' )
                    {
                    // InternalArduinoML.g:1372:3: (enumLiteral_0= 'ms' )
                    // InternalArduinoML.g:1373:4: enumLiteral_0= 'ms'
                    {
                    enumLiteral_0=(Token)match(input,32,FOLLOW_2); 

                    				current = grammarAccess.getTime_unitAccess().getMsEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTime_unitAccess().getMsEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalArduinoML.g:1380:3: (enumLiteral_1= 's' )
                    {
                    // InternalArduinoML.g:1380:3: (enumLiteral_1= 's' )
                    // InternalArduinoML.g:1381:4: enumLiteral_1= 's'
                    {
                    enumLiteral_1=(Token)match(input,33,FOLLOW_2); 

                    				current = grammarAccess.getTime_unitAccess().getSEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTime_unitAccess().getSEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalArduinoML.g:1388:3: (enumLiteral_2= 'min' )
                    {
                    // InternalArduinoML.g:1388:3: (enumLiteral_2= 'min' )
                    // InternalArduinoML.g:1389:4: enumLiteral_2= 'min'
                    {
                    enumLiteral_2=(Token)match(input,34,FOLLOW_2); 

                    				current = grammarAccess.getTime_unitAccess().getMinEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getTime_unitAccess().getMinEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTime_unit"


    // $ANTLR start "ruleCompare"
    // InternalArduinoML.g:1399:1: ruleCompare returns [Enumerator current=null] : ( (enumLiteral_0= 'inf' ) | (enumLiteral_1= 'einf' ) | (enumLiteral_2= 'equal' ) | (enumLiteral_3= 'esup' ) | (enumLiteral_4= 'sup' ) ) ;
    public final Enumerator ruleCompare() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalArduinoML.g:1405:2: ( ( (enumLiteral_0= 'inf' ) | (enumLiteral_1= 'einf' ) | (enumLiteral_2= 'equal' ) | (enumLiteral_3= 'esup' ) | (enumLiteral_4= 'sup' ) ) )
            // InternalArduinoML.g:1406:2: ( (enumLiteral_0= 'inf' ) | (enumLiteral_1= 'einf' ) | (enumLiteral_2= 'equal' ) | (enumLiteral_3= 'esup' ) | (enumLiteral_4= 'sup' ) )
            {
            // InternalArduinoML.g:1406:2: ( (enumLiteral_0= 'inf' ) | (enumLiteral_1= 'einf' ) | (enumLiteral_2= 'equal' ) | (enumLiteral_3= 'esup' ) | (enumLiteral_4= 'sup' ) )
            int alt21=5;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt21=1;
                }
                break;
            case 36:
                {
                alt21=2;
                }
                break;
            case 37:
                {
                alt21=3;
                }
                break;
            case 38:
                {
                alt21=4;
                }
                break;
            case 39:
                {
                alt21=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // InternalArduinoML.g:1407:3: (enumLiteral_0= 'inf' )
                    {
                    // InternalArduinoML.g:1407:3: (enumLiteral_0= 'inf' )
                    // InternalArduinoML.g:1408:4: enumLiteral_0= 'inf'
                    {
                    enumLiteral_0=(Token)match(input,35,FOLLOW_2); 

                    				current = grammarAccess.getCompareAccess().getInfEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getCompareAccess().getInfEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalArduinoML.g:1415:3: (enumLiteral_1= 'einf' )
                    {
                    // InternalArduinoML.g:1415:3: (enumLiteral_1= 'einf' )
                    // InternalArduinoML.g:1416:4: enumLiteral_1= 'einf'
                    {
                    enumLiteral_1=(Token)match(input,36,FOLLOW_2); 

                    				current = grammarAccess.getCompareAccess().getEinfEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getCompareAccess().getEinfEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalArduinoML.g:1423:3: (enumLiteral_2= 'equal' )
                    {
                    // InternalArduinoML.g:1423:3: (enumLiteral_2= 'equal' )
                    // InternalArduinoML.g:1424:4: enumLiteral_2= 'equal'
                    {
                    enumLiteral_2=(Token)match(input,37,FOLLOW_2); 

                    				current = grammarAccess.getCompareAccess().getEqualEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getCompareAccess().getEqualEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalArduinoML.g:1431:3: (enumLiteral_3= 'esup' )
                    {
                    // InternalArduinoML.g:1431:3: (enumLiteral_3= 'esup' )
                    // InternalArduinoML.g:1432:4: enumLiteral_3= 'esup'
                    {
                    enumLiteral_3=(Token)match(input,38,FOLLOW_2); 

                    				current = grammarAccess.getCompareAccess().getEsupEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getCompareAccess().getEsupEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalArduinoML.g:1439:3: (enumLiteral_4= 'sup' )
                    {
                    // InternalArduinoML.g:1439:3: (enumLiteral_4= 'sup' )
                    // InternalArduinoML.g:1440:4: enumLiteral_4= 'sup'
                    {
                    enumLiteral_4=(Token)match(input,39,FOLLOW_2); 

                    				current = grammarAccess.getCompareAccess().getSupEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getCompareAccess().getSupEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCompare"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000380000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000390000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00000000003C0000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000009400000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000009400002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x000000002C000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x000000F800000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000700000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000022000L});

}