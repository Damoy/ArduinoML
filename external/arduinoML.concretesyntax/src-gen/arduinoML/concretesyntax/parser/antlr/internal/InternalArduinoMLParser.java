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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'app'", "'initial state'", "'{'", "'bricks'", "'states'", "'}'", "':'", "'-'", "'Actuator'", "'Sensor'", "'change'", "'to'", "'when'", "'is'", "'go to'", "'wait'", "'then go to'", "'HIGH'", "'LOW'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
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
    // InternalArduinoML.g:72:1: ruleApp returns [EObject current=null] : (otherlv_0= 'app' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'initial state' ( ( ruleEString ) ) otherlv_4= '{' otherlv_5= 'bricks' ( (lv_bricks_6_0= ruleBrick ) ) ( (lv_bricks_7_0= ruleBrick ) )* otherlv_8= 'states' ( (lv_states_9_0= ruleState ) ) ( (lv_states_10_0= ruleState ) )* otherlv_11= '}' ) ;
    public final EObject ruleApp() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_bricks_6_0 = null;

        EObject lv_bricks_7_0 = null;

        EObject lv_states_9_0 = null;

        EObject lv_states_10_0 = null;



        	enterRule();

        try {
            // InternalArduinoML.g:78:2: ( (otherlv_0= 'app' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'initial state' ( ( ruleEString ) ) otherlv_4= '{' otherlv_5= 'bricks' ( (lv_bricks_6_0= ruleBrick ) ) ( (lv_bricks_7_0= ruleBrick ) )* otherlv_8= 'states' ( (lv_states_9_0= ruleState ) ) ( (lv_states_10_0= ruleState ) )* otherlv_11= '}' ) )
            // InternalArduinoML.g:79:2: (otherlv_0= 'app' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'initial state' ( ( ruleEString ) ) otherlv_4= '{' otherlv_5= 'bricks' ( (lv_bricks_6_0= ruleBrick ) ) ( (lv_bricks_7_0= ruleBrick ) )* otherlv_8= 'states' ( (lv_states_9_0= ruleState ) ) ( (lv_states_10_0= ruleState ) )* otherlv_11= '}' )
            {
            // InternalArduinoML.g:79:2: (otherlv_0= 'app' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'initial state' ( ( ruleEString ) ) otherlv_4= '{' otherlv_5= 'bricks' ( (lv_bricks_6_0= ruleBrick ) ) ( (lv_bricks_7_0= ruleBrick ) )* otherlv_8= 'states' ( (lv_states_9_0= ruleState ) ) ( (lv_states_10_0= ruleState ) )* otherlv_11= '}' )
            // InternalArduinoML.g:80:3: otherlv_0= 'app' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'initial state' ( ( ruleEString ) ) otherlv_4= '{' otherlv_5= 'bricks' ( (lv_bricks_6_0= ruleBrick ) ) ( (lv_bricks_7_0= ruleBrick ) )* otherlv_8= 'states' ( (lv_states_9_0= ruleState ) ) ( (lv_states_10_0= ruleState ) )* otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getAppAccess().getAppKeyword_0());
            		
            // InternalArduinoML.g:84:3: ( (lv_name_1_0= ruleEString ) )
            // InternalArduinoML.g:85:4: (lv_name_1_0= ruleEString )
            {
            // InternalArduinoML.g:85:4: (lv_name_1_0= ruleEString )
            // InternalArduinoML.g:86:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAppAccess().getNameEStringParserRuleCall_1_0());
            				
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

            otherlv_2=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getAppAccess().getInitialStateKeyword_2());
            		
            // InternalArduinoML.g:107:3: ( ( ruleEString ) )
            // InternalArduinoML.g:108:4: ( ruleEString )
            {
            // InternalArduinoML.g:108:4: ( ruleEString )
            // InternalArduinoML.g:109:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAppRule());
            					}
            				

            					newCompositeNode(grammarAccess.getAppAccess().getInitialStateCrossReference_3_0());
            				
            pushFollow(FOLLOW_5);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_4, grammarAccess.getAppAccess().getLeftCurlyBracketKeyword_4());
            		
            otherlv_5=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_5, grammarAccess.getAppAccess().getBricksKeyword_5());
            		
            // InternalArduinoML.g:131:3: ( (lv_bricks_6_0= ruleBrick ) )
            // InternalArduinoML.g:132:4: (lv_bricks_6_0= ruleBrick )
            {
            // InternalArduinoML.g:132:4: (lv_bricks_6_0= ruleBrick )
            // InternalArduinoML.g:133:5: lv_bricks_6_0= ruleBrick
            {

            					newCompositeNode(grammarAccess.getAppAccess().getBricksBrickParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_8);
            lv_bricks_6_0=ruleBrick();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAppRule());
            					}
            					add(
            						current,
            						"bricks",
            						lv_bricks_6_0,
            						"arduinoML.concretesyntax.ArduinoML.Brick");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalArduinoML.g:150:3: ( (lv_bricks_7_0= ruleBrick ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=19 && LA1_0<=20)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalArduinoML.g:151:4: (lv_bricks_7_0= ruleBrick )
            	    {
            	    // InternalArduinoML.g:151:4: (lv_bricks_7_0= ruleBrick )
            	    // InternalArduinoML.g:152:5: lv_bricks_7_0= ruleBrick
            	    {

            	    					newCompositeNode(grammarAccess.getAppAccess().getBricksBrickParserRuleCall_7_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_bricks_7_0=ruleBrick();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getAppRule());
            	    					}
            	    					add(
            	    						current,
            	    						"bricks",
            	    						lv_bricks_7_0,
            	    						"arduinoML.concretesyntax.ArduinoML.Brick");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_8=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_8, grammarAccess.getAppAccess().getStatesKeyword_8());
            		
            // InternalArduinoML.g:173:3: ( (lv_states_9_0= ruleState ) )
            // InternalArduinoML.g:174:4: (lv_states_9_0= ruleState )
            {
            // InternalArduinoML.g:174:4: (lv_states_9_0= ruleState )
            // InternalArduinoML.g:175:5: lv_states_9_0= ruleState
            {

            					newCompositeNode(grammarAccess.getAppAccess().getStatesStateParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_9);
            lv_states_9_0=ruleState();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAppRule());
            					}
            					add(
            						current,
            						"states",
            						lv_states_9_0,
            						"arduinoML.concretesyntax.ArduinoML.State");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalArduinoML.g:192:3: ( (lv_states_10_0= ruleState ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=RULE_STRING && LA2_0<=RULE_ID)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalArduinoML.g:193:4: (lv_states_10_0= ruleState )
            	    {
            	    // InternalArduinoML.g:193:4: (lv_states_10_0= ruleState )
            	    // InternalArduinoML.g:194:5: lv_states_10_0= ruleState
            	    {

            	    					newCompositeNode(grammarAccess.getAppAccess().getStatesStateParserRuleCall_10_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_states_10_0=ruleState();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getAppRule());
            	    					}
            	    					add(
            	    						current,
            	    						"states",
            	    						lv_states_10_0,
            	    						"arduinoML.concretesyntax.ArduinoML.State");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_11=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getAppAccess().getRightCurlyBracketKeyword_11());
            		

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
    // InternalArduinoML.g:219:1: entryRuleBrick returns [EObject current=null] : iv_ruleBrick= ruleBrick EOF ;
    public final EObject entryRuleBrick() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBrick = null;


        try {
            // InternalArduinoML.g:219:46: (iv_ruleBrick= ruleBrick EOF )
            // InternalArduinoML.g:220:2: iv_ruleBrick= ruleBrick EOF
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
    // InternalArduinoML.g:226:1: ruleBrick returns [EObject current=null] : ( (this_Actuator_0= ruleActuator | this_Sensor_1= ruleSensor ) ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' ( (lv_pin_4_0= ruleEInt ) ) ) ;
    public final EObject ruleBrick() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        EObject this_Actuator_0 = null;

        EObject this_Sensor_1 = null;

        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_pin_4_0 = null;



        	enterRule();

        try {
            // InternalArduinoML.g:232:2: ( ( (this_Actuator_0= ruleActuator | this_Sensor_1= ruleSensor ) ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' ( (lv_pin_4_0= ruleEInt ) ) ) )
            // InternalArduinoML.g:233:2: ( (this_Actuator_0= ruleActuator | this_Sensor_1= ruleSensor ) ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' ( (lv_pin_4_0= ruleEInt ) ) )
            {
            // InternalArduinoML.g:233:2: ( (this_Actuator_0= ruleActuator | this_Sensor_1= ruleSensor ) ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' ( (lv_pin_4_0= ruleEInt ) ) )
            // InternalArduinoML.g:234:3: (this_Actuator_0= ruleActuator | this_Sensor_1= ruleSensor ) ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' ( (lv_pin_4_0= ruleEInt ) )
            {
            // InternalArduinoML.g:234:3: (this_Actuator_0= ruleActuator | this_Sensor_1= ruleSensor )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==19) ) {
                alt3=1;
            }
            else if ( (LA3_0==20) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalArduinoML.g:235:4: this_Actuator_0= ruleActuator
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
                    // InternalArduinoML.g:244:4: this_Sensor_1= ruleSensor
                    {

                    				newCompositeNode(grammarAccess.getBrickAccess().getSensorParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_3);
                    this_Sensor_1=ruleSensor();

                    state._fsp--;


                    				current = this_Sensor_1;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            // InternalArduinoML.g:253:3: ( (lv_name_2_0= ruleEString ) )
            // InternalArduinoML.g:254:4: (lv_name_2_0= ruleEString )
            {
            // InternalArduinoML.g:254:4: (lv_name_2_0= ruleEString )
            // InternalArduinoML.g:255:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getBrickAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_10);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBrickRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"arduinoML.concretesyntax.ArduinoML.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,17,FOLLOW_11); 

            			newLeafNode(otherlv_3, grammarAccess.getBrickAccess().getColonKeyword_2());
            		
            // InternalArduinoML.g:276:3: ( (lv_pin_4_0= ruleEInt ) )
            // InternalArduinoML.g:277:4: (lv_pin_4_0= ruleEInt )
            {
            // InternalArduinoML.g:277:4: (lv_pin_4_0= ruleEInt )
            // InternalArduinoML.g:278:5: lv_pin_4_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getBrickAccess().getPinEIntParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_pin_4_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBrickRule());
            					}
            					set(
            						current,
            						"pin",
            						lv_pin_4_0,
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
    // InternalArduinoML.g:299:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalArduinoML.g:299:47: (iv_ruleEString= ruleEString EOF )
            // InternalArduinoML.g:300:2: iv_ruleEString= ruleEString EOF
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
    // InternalArduinoML.g:306:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalArduinoML.g:312:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalArduinoML.g:313:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalArduinoML.g:313:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_STRING) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_ID) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalArduinoML.g:314:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalArduinoML.g:322:3: this_ID_1= RULE_ID
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


    // $ANTLR start "entryRuleState"
    // InternalArduinoML.g:333:1: entryRuleState returns [EObject current=null] : iv_ruleState= ruleState EOF ;
    public final EObject entryRuleState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleState = null;


        try {
            // InternalArduinoML.g:333:46: (iv_ruleState= ruleState EOF )
            // InternalArduinoML.g:334:2: iv_ruleState= ruleState EOF
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
    // InternalArduinoML.g:340:1: ruleState returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' ( (lv_actions_2_0= ruleAction ) ) ( (lv_actions_3_0= ruleAction ) )* ( (lv_transitions_4_0= ruleTransition ) ) ( (lv_transitions_5_0= ruleTransition ) )* otherlv_6= '}' ) ;
    public final EObject ruleState() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_actions_2_0 = null;

        EObject lv_actions_3_0 = null;

        EObject lv_transitions_4_0 = null;

        EObject lv_transitions_5_0 = null;



        	enterRule();

        try {
            // InternalArduinoML.g:346:2: ( ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' ( (lv_actions_2_0= ruleAction ) ) ( (lv_actions_3_0= ruleAction ) )* ( (lv_transitions_4_0= ruleTransition ) ) ( (lv_transitions_5_0= ruleTransition ) )* otherlv_6= '}' ) )
            // InternalArduinoML.g:347:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' ( (lv_actions_2_0= ruleAction ) ) ( (lv_actions_3_0= ruleAction ) )* ( (lv_transitions_4_0= ruleTransition ) ) ( (lv_transitions_5_0= ruleTransition ) )* otherlv_6= '}' )
            {
            // InternalArduinoML.g:347:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' ( (lv_actions_2_0= ruleAction ) ) ( (lv_actions_3_0= ruleAction ) )* ( (lv_transitions_4_0= ruleTransition ) ) ( (lv_transitions_5_0= ruleTransition ) )* otherlv_6= '}' )
            // InternalArduinoML.g:348:3: ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' ( (lv_actions_2_0= ruleAction ) ) ( (lv_actions_3_0= ruleAction ) )* ( (lv_transitions_4_0= ruleTransition ) ) ( (lv_transitions_5_0= ruleTransition ) )* otherlv_6= '}'
            {
            // InternalArduinoML.g:348:3: ( (lv_name_0_0= ruleEString ) )
            // InternalArduinoML.g:349:4: (lv_name_0_0= ruleEString )
            {
            // InternalArduinoML.g:349:4: (lv_name_0_0= ruleEString )
            // InternalArduinoML.g:350:5: lv_name_0_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getStateAccess().getNameEStringParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_5);
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

            otherlv_1=(Token)match(input,13,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalArduinoML.g:371:3: ( (lv_actions_2_0= ruleAction ) )
            // InternalArduinoML.g:372:4: (lv_actions_2_0= ruleAction )
            {
            // InternalArduinoML.g:372:4: (lv_actions_2_0= ruleAction )
            // InternalArduinoML.g:373:5: lv_actions_2_0= ruleAction
            {

            					newCompositeNode(grammarAccess.getStateAccess().getActionsActionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_13);
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

            // InternalArduinoML.g:390:3: ( (lv_actions_3_0= ruleAction ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==21) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalArduinoML.g:391:4: (lv_actions_3_0= ruleAction )
            	    {
            	    // InternalArduinoML.g:391:4: (lv_actions_3_0= ruleAction )
            	    // InternalArduinoML.g:392:5: lv_actions_3_0= ruleAction
            	    {

            	    					newCompositeNode(grammarAccess.getStateAccess().getActionsActionParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_13);
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
            	    break loop5;
                }
            } while (true);

            // InternalArduinoML.g:409:3: ( (lv_transitions_4_0= ruleTransition ) )
            // InternalArduinoML.g:410:4: (lv_transitions_4_0= ruleTransition )
            {
            // InternalArduinoML.g:410:4: (lv_transitions_4_0= ruleTransition )
            // InternalArduinoML.g:411:5: lv_transitions_4_0= ruleTransition
            {

            					newCompositeNode(grammarAccess.getStateAccess().getTransitionsTransitionParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_14);
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

            // InternalArduinoML.g:428:3: ( (lv_transitions_5_0= ruleTransition ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==23||LA6_0==26) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalArduinoML.g:429:4: (lv_transitions_5_0= ruleTransition )
            	    {
            	    // InternalArduinoML.g:429:4: (lv_transitions_5_0= ruleTransition )
            	    // InternalArduinoML.g:430:5: lv_transitions_5_0= ruleTransition
            	    {

            	    					newCompositeNode(grammarAccess.getStateAccess().getTransitionsTransitionParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_14);
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
            	    break loop6;
                }
            } while (true);

            otherlv_6=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getStateAccess().getRightCurlyBracketKeyword_6());
            		

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
    // InternalArduinoML.g:455:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalArduinoML.g:455:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalArduinoML.g:456:2: iv_ruleEInt= ruleEInt EOF
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
    // InternalArduinoML.g:462:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalArduinoML.g:468:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalArduinoML.g:469:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalArduinoML.g:469:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalArduinoML.g:470:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalArduinoML.g:470:3: (kw= '-' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==18) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalArduinoML.g:471:4: kw= '-'
                    {
                    kw=(Token)match(input,18,FOLLOW_15); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_1);
            		

            			newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1());
            		

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
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleActuator"
    // InternalArduinoML.g:488:1: entryRuleActuator returns [EObject current=null] : iv_ruleActuator= ruleActuator EOF ;
    public final EObject entryRuleActuator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActuator = null;


        try {
            // InternalArduinoML.g:488:49: (iv_ruleActuator= ruleActuator EOF )
            // InternalArduinoML.g:489:2: iv_ruleActuator= ruleActuator EOF
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
    // InternalArduinoML.g:495:1: ruleActuator returns [EObject current=null] : ( () otherlv_1= 'Actuator' ) ;
    public final EObject ruleActuator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalArduinoML.g:501:2: ( ( () otherlv_1= 'Actuator' ) )
            // InternalArduinoML.g:502:2: ( () otherlv_1= 'Actuator' )
            {
            // InternalArduinoML.g:502:2: ( () otherlv_1= 'Actuator' )
            // InternalArduinoML.g:503:3: () otherlv_1= 'Actuator'
            {
            // InternalArduinoML.g:503:3: ()
            // InternalArduinoML.g:504:4: 
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


    // $ANTLR start "entryRuleSensor"
    // InternalArduinoML.g:518:1: entryRuleSensor returns [EObject current=null] : iv_ruleSensor= ruleSensor EOF ;
    public final EObject entryRuleSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSensor = null;


        try {
            // InternalArduinoML.g:518:47: (iv_ruleSensor= ruleSensor EOF )
            // InternalArduinoML.g:519:2: iv_ruleSensor= ruleSensor EOF
            {
             newCompositeNode(grammarAccess.getSensorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSensor=ruleSensor();

            state._fsp--;

             current =iv_ruleSensor; 
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
    // $ANTLR end "entryRuleSensor"


    // $ANTLR start "ruleSensor"
    // InternalArduinoML.g:525:1: ruleSensor returns [EObject current=null] : ( () otherlv_1= 'Sensor' ) ;
    public final EObject ruleSensor() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalArduinoML.g:531:2: ( ( () otherlv_1= 'Sensor' ) )
            // InternalArduinoML.g:532:2: ( () otherlv_1= 'Sensor' )
            {
            // InternalArduinoML.g:532:2: ( () otherlv_1= 'Sensor' )
            // InternalArduinoML.g:533:3: () otherlv_1= 'Sensor'
            {
            // InternalArduinoML.g:533:3: ()
            // InternalArduinoML.g:534:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSensorAccess().getSensorAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getSensorAccess().getSensorKeyword_1());
            		

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
    // $ANTLR end "ruleSensor"


    // $ANTLR start "entryRuleAction"
    // InternalArduinoML.g:548:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // InternalArduinoML.g:548:47: (iv_ruleAction= ruleAction EOF )
            // InternalArduinoML.g:549:2: iv_ruleAction= ruleAction EOF
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
    // InternalArduinoML.g:555:1: ruleAction returns [EObject current=null] : (otherlv_0= 'change' ( ( ruleEString ) ) otherlv_2= 'to' ( (lv_value_3_0= ruleSignal ) ) ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Enumerator lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalArduinoML.g:561:2: ( (otherlv_0= 'change' ( ( ruleEString ) ) otherlv_2= 'to' ( (lv_value_3_0= ruleSignal ) ) ) )
            // InternalArduinoML.g:562:2: (otherlv_0= 'change' ( ( ruleEString ) ) otherlv_2= 'to' ( (lv_value_3_0= ruleSignal ) ) )
            {
            // InternalArduinoML.g:562:2: (otherlv_0= 'change' ( ( ruleEString ) ) otherlv_2= 'to' ( (lv_value_3_0= ruleSignal ) ) )
            // InternalArduinoML.g:563:3: otherlv_0= 'change' ( ( ruleEString ) ) otherlv_2= 'to' ( (lv_value_3_0= ruleSignal ) )
            {
            otherlv_0=(Token)match(input,21,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getActionAccess().getChangeKeyword_0());
            		
            // InternalArduinoML.g:567:3: ( ( ruleEString ) )
            // InternalArduinoML.g:568:4: ( ruleEString )
            {
            // InternalArduinoML.g:568:4: ( ruleEString )
            // InternalArduinoML.g:569:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getActionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getActionAccess().getActuatorActuatorCrossReference_1_0());
            				
            pushFollow(FOLLOW_16);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,22,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getActionAccess().getToKeyword_2());
            		
            // InternalArduinoML.g:587:3: ( (lv_value_3_0= ruleSignal ) )
            // InternalArduinoML.g:588:4: (lv_value_3_0= ruleSignal )
            {
            // InternalArduinoML.g:588:4: (lv_value_3_0= ruleSignal )
            // InternalArduinoML.g:589:5: lv_value_3_0= ruleSignal
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
    // InternalArduinoML.g:610:1: entryRuleTransition returns [EObject current=null] : iv_ruleTransition= ruleTransition EOF ;
    public final EObject entryRuleTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransition = null;


        try {
            // InternalArduinoML.g:610:51: (iv_ruleTransition= ruleTransition EOF )
            // InternalArduinoML.g:611:2: iv_ruleTransition= ruleTransition EOF
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
    // InternalArduinoML.g:617:1: ruleTransition returns [EObject current=null] : ( (otherlv_0= 'when' ( ( ruleEString ) ) otherlv_2= 'is' ( (lv_value_3_0= ruleSignal ) ) otherlv_4= 'go to' ( ( ruleEString ) ) ) | (otherlv_6= 'wait' ( (lv_time_7_0= ruleEInt ) ) otherlv_8= 'then go to' ( ( ruleEString ) ) ) ) ;
    public final EObject ruleTransition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Enumerator lv_value_3_0 = null;

        AntlrDatatypeRuleToken lv_time_7_0 = null;



        	enterRule();

        try {
            // InternalArduinoML.g:623:2: ( ( (otherlv_0= 'when' ( ( ruleEString ) ) otherlv_2= 'is' ( (lv_value_3_0= ruleSignal ) ) otherlv_4= 'go to' ( ( ruleEString ) ) ) | (otherlv_6= 'wait' ( (lv_time_7_0= ruleEInt ) ) otherlv_8= 'then go to' ( ( ruleEString ) ) ) ) )
            // InternalArduinoML.g:624:2: ( (otherlv_0= 'when' ( ( ruleEString ) ) otherlv_2= 'is' ( (lv_value_3_0= ruleSignal ) ) otherlv_4= 'go to' ( ( ruleEString ) ) ) | (otherlv_6= 'wait' ( (lv_time_7_0= ruleEInt ) ) otherlv_8= 'then go to' ( ( ruleEString ) ) ) )
            {
            // InternalArduinoML.g:624:2: ( (otherlv_0= 'when' ( ( ruleEString ) ) otherlv_2= 'is' ( (lv_value_3_0= ruleSignal ) ) otherlv_4= 'go to' ( ( ruleEString ) ) ) | (otherlv_6= 'wait' ( (lv_time_7_0= ruleEInt ) ) otherlv_8= 'then go to' ( ( ruleEString ) ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==23) ) {
                alt8=1;
            }
            else if ( (LA8_0==26) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalArduinoML.g:625:3: (otherlv_0= 'when' ( ( ruleEString ) ) otherlv_2= 'is' ( (lv_value_3_0= ruleSignal ) ) otherlv_4= 'go to' ( ( ruleEString ) ) )
                    {
                    // InternalArduinoML.g:625:3: (otherlv_0= 'when' ( ( ruleEString ) ) otherlv_2= 'is' ( (lv_value_3_0= ruleSignal ) ) otherlv_4= 'go to' ( ( ruleEString ) ) )
                    // InternalArduinoML.g:626:4: otherlv_0= 'when' ( ( ruleEString ) ) otherlv_2= 'is' ( (lv_value_3_0= ruleSignal ) ) otherlv_4= 'go to' ( ( ruleEString ) )
                    {
                    otherlv_0=(Token)match(input,23,FOLLOW_3); 

                    				newLeafNode(otherlv_0, grammarAccess.getTransitionAccess().getWhenKeyword_0_0());
                    			
                    // InternalArduinoML.g:630:4: ( ( ruleEString ) )
                    // InternalArduinoML.g:631:5: ( ruleEString )
                    {
                    // InternalArduinoML.g:631:5: ( ruleEString )
                    // InternalArduinoML.g:632:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTransitionRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getTransitionAccess().getSensorSensorCrossReference_0_1_0());
                    					
                    pushFollow(FOLLOW_18);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_2=(Token)match(input,24,FOLLOW_17); 

                    				newLeafNode(otherlv_2, grammarAccess.getTransitionAccess().getIsKeyword_0_2());
                    			
                    // InternalArduinoML.g:650:4: ( (lv_value_3_0= ruleSignal ) )
                    // InternalArduinoML.g:651:5: (lv_value_3_0= ruleSignal )
                    {
                    // InternalArduinoML.g:651:5: (lv_value_3_0= ruleSignal )
                    // InternalArduinoML.g:652:6: lv_value_3_0= ruleSignal
                    {

                    						newCompositeNode(grammarAccess.getTransitionAccess().getValueSignalEnumRuleCall_0_3_0());
                    					
                    pushFollow(FOLLOW_19);
                    lv_value_3_0=ruleSignal();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTransitionRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_3_0,
                    							"arduinoML.concretesyntax.ArduinoML.Signal");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_4=(Token)match(input,25,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getTransitionAccess().getGoToKeyword_0_4());
                    			
                    // InternalArduinoML.g:673:4: ( ( ruleEString ) )
                    // InternalArduinoML.g:674:5: ( ruleEString )
                    {
                    // InternalArduinoML.g:674:5: ( ruleEString )
                    // InternalArduinoML.g:675:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTransitionRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getTransitionAccess().getNextStateCrossReference_0_5_0());
                    					
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
                    // InternalArduinoML.g:691:3: (otherlv_6= 'wait' ( (lv_time_7_0= ruleEInt ) ) otherlv_8= 'then go to' ( ( ruleEString ) ) )
                    {
                    // InternalArduinoML.g:691:3: (otherlv_6= 'wait' ( (lv_time_7_0= ruleEInt ) ) otherlv_8= 'then go to' ( ( ruleEString ) ) )
                    // InternalArduinoML.g:692:4: otherlv_6= 'wait' ( (lv_time_7_0= ruleEInt ) ) otherlv_8= 'then go to' ( ( ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,26,FOLLOW_11); 

                    				newLeafNode(otherlv_6, grammarAccess.getTransitionAccess().getWaitKeyword_1_0());
                    			
                    // InternalArduinoML.g:696:4: ( (lv_time_7_0= ruleEInt ) )
                    // InternalArduinoML.g:697:5: (lv_time_7_0= ruleEInt )
                    {
                    // InternalArduinoML.g:697:5: (lv_time_7_0= ruleEInt )
                    // InternalArduinoML.g:698:6: lv_time_7_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getTransitionAccess().getTimeEIntParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_20);
                    lv_time_7_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTransitionRule());
                    						}
                    						set(
                    							current,
                    							"time",
                    							lv_time_7_0,
                    							"arduinoML.concretesyntax.ArduinoML.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_8=(Token)match(input,27,FOLLOW_3); 

                    				newLeafNode(otherlv_8, grammarAccess.getTransitionAccess().getThenGoToKeyword_1_2());
                    			
                    // InternalArduinoML.g:719:4: ( ( ruleEString ) )
                    // InternalArduinoML.g:720:5: ( ruleEString )
                    {
                    // InternalArduinoML.g:720:5: ( ruleEString )
                    // InternalArduinoML.g:721:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTransitionRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getTransitionAccess().getNextStateCrossReference_1_3_0());
                    					
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
    // InternalArduinoML.g:740:1: ruleSignal returns [Enumerator current=null] : ( (enumLiteral_0= 'HIGH' ) | (enumLiteral_1= 'LOW' ) ) ;
    public final Enumerator ruleSignal() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalArduinoML.g:746:2: ( ( (enumLiteral_0= 'HIGH' ) | (enumLiteral_1= 'LOW' ) ) )
            // InternalArduinoML.g:747:2: ( (enumLiteral_0= 'HIGH' ) | (enumLiteral_1= 'LOW' ) )
            {
            // InternalArduinoML.g:747:2: ( (enumLiteral_0= 'HIGH' ) | (enumLiteral_1= 'LOW' ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==28) ) {
                alt9=1;
            }
            else if ( (LA9_0==29) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalArduinoML.g:748:3: (enumLiteral_0= 'HIGH' )
                    {
                    // InternalArduinoML.g:748:3: (enumLiteral_0= 'HIGH' )
                    // InternalArduinoML.g:749:4: enumLiteral_0= 'HIGH'
                    {
                    enumLiteral_0=(Token)match(input,28,FOLLOW_2); 

                    				current = grammarAccess.getSignalAccess().getHIGHEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getSignalAccess().getHIGHEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalArduinoML.g:756:3: (enumLiteral_1= 'LOW' )
                    {
                    // InternalArduinoML.g:756:3: (enumLiteral_1= 'LOW' )
                    // InternalArduinoML.g:757:4: enumLiteral_1= 'LOW'
                    {
                    enumLiteral_1=(Token)match(input,29,FOLLOW_2); 

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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000188000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010030L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040040L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000004A00000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000004A10000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000008000000L});

}