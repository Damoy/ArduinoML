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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'app'", "'initial state'", "':'", "'bricks :'", "'states :'", "'-'", "'Actuator'", "'Sensor'", "'change'", "'to'", "'when'", "'is'", "'and'", "'go to'", "'wait'", "'then go to'", "'HIGH'", "'LOW'", "'ms'", "'s'", "'min'"
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
    public static final int T__30=30;
    public static final int T__31=31;
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
    // InternalArduinoML.g:72:1: ruleApp returns [EObject current=null] : (otherlv_0= 'app' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'initial state' ( ( ruleEString ) ) otherlv_4= ':' otherlv_5= 'bricks :' ( (lv_bricks_6_0= ruleBrick ) ) ( (lv_bricks_7_0= ruleBrick ) )* otherlv_8= 'states :' ( (lv_states_9_0= ruleState ) ) ( (lv_states_10_0= ruleState ) )* ) ;
    public final EObject ruleApp() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_bricks_6_0 = null;

        EObject lv_bricks_7_0 = null;

        EObject lv_states_9_0 = null;

        EObject lv_states_10_0 = null;



        	enterRule();

        try {
            // InternalArduinoML.g:78:2: ( (otherlv_0= 'app' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'initial state' ( ( ruleEString ) ) otherlv_4= ':' otherlv_5= 'bricks :' ( (lv_bricks_6_0= ruleBrick ) ) ( (lv_bricks_7_0= ruleBrick ) )* otherlv_8= 'states :' ( (lv_states_9_0= ruleState ) ) ( (lv_states_10_0= ruleState ) )* ) )
            // InternalArduinoML.g:79:2: (otherlv_0= 'app' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'initial state' ( ( ruleEString ) ) otherlv_4= ':' otherlv_5= 'bricks :' ( (lv_bricks_6_0= ruleBrick ) ) ( (lv_bricks_7_0= ruleBrick ) )* otherlv_8= 'states :' ( (lv_states_9_0= ruleState ) ) ( (lv_states_10_0= ruleState ) )* )
            {
            // InternalArduinoML.g:79:2: (otherlv_0= 'app' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'initial state' ( ( ruleEString ) ) otherlv_4= ':' otherlv_5= 'bricks :' ( (lv_bricks_6_0= ruleBrick ) ) ( (lv_bricks_7_0= ruleBrick ) )* otherlv_8= 'states :' ( (lv_states_9_0= ruleState ) ) ( (lv_states_10_0= ruleState ) )* )
            // InternalArduinoML.g:80:3: otherlv_0= 'app' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'initial state' ( ( ruleEString ) ) otherlv_4= ':' otherlv_5= 'bricks :' ( (lv_bricks_6_0= ruleBrick ) ) ( (lv_bricks_7_0= ruleBrick ) )* otherlv_8= 'states :' ( (lv_states_9_0= ruleState ) ) ( (lv_states_10_0= ruleState ) )*
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

            			newLeafNode(otherlv_4, grammarAccess.getAppAccess().getColonKeyword_4());
            		
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

                if ( ((LA1_0>=17 && LA1_0<=18)) ) {
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
    // InternalArduinoML.g:215:1: entryRuleBrick returns [EObject current=null] : iv_ruleBrick= ruleBrick EOF ;
    public final EObject entryRuleBrick() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBrick = null;


        try {
            // InternalArduinoML.g:215:46: (iv_ruleBrick= ruleBrick EOF )
            // InternalArduinoML.g:216:2: iv_ruleBrick= ruleBrick EOF
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
    // InternalArduinoML.g:222:1: ruleBrick returns [EObject current=null] : ( (this_Actuator_0= ruleActuator | this_Sensor_1= ruleSensor ) ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' ( (lv_pin_4_0= ruleEInt ) ) ) ;
    public final EObject ruleBrick() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        EObject this_Actuator_0 = null;

        EObject this_Sensor_1 = null;

        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_pin_4_0 = null;



        	enterRule();

        try {
            // InternalArduinoML.g:228:2: ( ( (this_Actuator_0= ruleActuator | this_Sensor_1= ruleSensor ) ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' ( (lv_pin_4_0= ruleEInt ) ) ) )
            // InternalArduinoML.g:229:2: ( (this_Actuator_0= ruleActuator | this_Sensor_1= ruleSensor ) ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' ( (lv_pin_4_0= ruleEInt ) ) )
            {
            // InternalArduinoML.g:229:2: ( (this_Actuator_0= ruleActuator | this_Sensor_1= ruleSensor ) ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' ( (lv_pin_4_0= ruleEInt ) ) )
            // InternalArduinoML.g:230:3: (this_Actuator_0= ruleActuator | this_Sensor_1= ruleSensor ) ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' ( (lv_pin_4_0= ruleEInt ) )
            {
            // InternalArduinoML.g:230:3: (this_Actuator_0= ruleActuator | this_Sensor_1= ruleSensor )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==17) ) {
                alt3=1;
            }
            else if ( (LA3_0==18) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalArduinoML.g:231:4: this_Actuator_0= ruleActuator
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
                    // InternalArduinoML.g:240:4: this_Sensor_1= ruleSensor
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

            // InternalArduinoML.g:249:3: ( (lv_name_2_0= ruleEString ) )
            // InternalArduinoML.g:250:4: (lv_name_2_0= ruleEString )
            {
            // InternalArduinoML.g:250:4: (lv_name_2_0= ruleEString )
            // InternalArduinoML.g:251:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getBrickAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_5);
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

            otherlv_3=(Token)match(input,13,FOLLOW_10); 

            			newLeafNode(otherlv_3, grammarAccess.getBrickAccess().getColonKeyword_2());
            		
            // InternalArduinoML.g:272:3: ( (lv_pin_4_0= ruleEInt ) )
            // InternalArduinoML.g:273:4: (lv_pin_4_0= ruleEInt )
            {
            // InternalArduinoML.g:273:4: (lv_pin_4_0= ruleEInt )
            // InternalArduinoML.g:274:5: lv_pin_4_0= ruleEInt
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
    // InternalArduinoML.g:295:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalArduinoML.g:295:47: (iv_ruleEString= ruleEString EOF )
            // InternalArduinoML.g:296:2: iv_ruleEString= ruleEString EOF
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
    // InternalArduinoML.g:302:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalArduinoML.g:308:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalArduinoML.g:309:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalArduinoML.g:309:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
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
                    // InternalArduinoML.g:310:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalArduinoML.g:318:3: this_ID_1= RULE_ID
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
    // InternalArduinoML.g:329:1: entryRuleState returns [EObject current=null] : iv_ruleState= ruleState EOF ;
    public final EObject entryRuleState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleState = null;


        try {
            // InternalArduinoML.g:329:46: (iv_ruleState= ruleState EOF )
            // InternalArduinoML.g:330:2: iv_ruleState= ruleState EOF
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
    // InternalArduinoML.g:336:1: ruleState returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_actions_2_0= ruleAction ) ) ( (lv_actions_3_0= ruleAction ) )* ( (lv_transitions_4_0= ruleTransition ) ) ( (lv_transitions_5_0= ruleTransition ) )* ) ;
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
            // InternalArduinoML.g:342:2: ( ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_actions_2_0= ruleAction ) ) ( (lv_actions_3_0= ruleAction ) )* ( (lv_transitions_4_0= ruleTransition ) ) ( (lv_transitions_5_0= ruleTransition ) )* ) )
            // InternalArduinoML.g:343:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_actions_2_0= ruleAction ) ) ( (lv_actions_3_0= ruleAction ) )* ( (lv_transitions_4_0= ruleTransition ) ) ( (lv_transitions_5_0= ruleTransition ) )* )
            {
            // InternalArduinoML.g:343:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_actions_2_0= ruleAction ) ) ( (lv_actions_3_0= ruleAction ) )* ( (lv_transitions_4_0= ruleTransition ) ) ( (lv_transitions_5_0= ruleTransition ) )* )
            // InternalArduinoML.g:344:3: ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_actions_2_0= ruleAction ) ) ( (lv_actions_3_0= ruleAction ) )* ( (lv_transitions_4_0= ruleTransition ) ) ( (lv_transitions_5_0= ruleTransition ) )*
            {
            // InternalArduinoML.g:344:3: ( (lv_name_0_0= ruleEString ) )
            // InternalArduinoML.g:345:4: (lv_name_0_0= ruleEString )
            {
            // InternalArduinoML.g:345:4: (lv_name_0_0= ruleEString )
            // InternalArduinoML.g:346:5: lv_name_0_0= ruleEString
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

            otherlv_1=(Token)match(input,13,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getStateAccess().getColonKeyword_1());
            		
            // InternalArduinoML.g:367:3: ( (lv_actions_2_0= ruleAction ) )
            // InternalArduinoML.g:368:4: (lv_actions_2_0= ruleAction )
            {
            // InternalArduinoML.g:368:4: (lv_actions_2_0= ruleAction )
            // InternalArduinoML.g:369:5: lv_actions_2_0= ruleAction
            {

            					newCompositeNode(grammarAccess.getStateAccess().getActionsActionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_12);
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

            // InternalArduinoML.g:386:3: ( (lv_actions_3_0= ruleAction ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==19) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalArduinoML.g:387:4: (lv_actions_3_0= ruleAction )
            	    {
            	    // InternalArduinoML.g:387:4: (lv_actions_3_0= ruleAction )
            	    // InternalArduinoML.g:388:5: lv_actions_3_0= ruleAction
            	    {

            	    					newCompositeNode(grammarAccess.getStateAccess().getActionsActionParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_12);
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

            // InternalArduinoML.g:405:3: ( (lv_transitions_4_0= ruleTransition ) )
            // InternalArduinoML.g:406:4: (lv_transitions_4_0= ruleTransition )
            {
            // InternalArduinoML.g:406:4: (lv_transitions_4_0= ruleTransition )
            // InternalArduinoML.g:407:5: lv_transitions_4_0= ruleTransition
            {

            					newCompositeNode(grammarAccess.getStateAccess().getTransitionsTransitionParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_13);
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

            // InternalArduinoML.g:424:3: ( (lv_transitions_5_0= ruleTransition ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==21||LA6_0==25) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalArduinoML.g:425:4: (lv_transitions_5_0= ruleTransition )
            	    {
            	    // InternalArduinoML.g:425:4: (lv_transitions_5_0= ruleTransition )
            	    // InternalArduinoML.g:426:5: lv_transitions_5_0= ruleTransition
            	    {

            	    					newCompositeNode(grammarAccess.getStateAccess().getTransitionsTransitionParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_13);
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
    // InternalArduinoML.g:447:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalArduinoML.g:447:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalArduinoML.g:448:2: iv_ruleEInt= ruleEInt EOF
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
    // InternalArduinoML.g:454:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalArduinoML.g:460:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalArduinoML.g:461:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalArduinoML.g:461:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalArduinoML.g:462:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalArduinoML.g:462:3: (kw= '-' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==16) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalArduinoML.g:463:4: kw= '-'
                    {
                    kw=(Token)match(input,16,FOLLOW_14); 

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
    // InternalArduinoML.g:480:1: entryRuleActuator returns [EObject current=null] : iv_ruleActuator= ruleActuator EOF ;
    public final EObject entryRuleActuator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActuator = null;


        try {
            // InternalArduinoML.g:480:49: (iv_ruleActuator= ruleActuator EOF )
            // InternalArduinoML.g:481:2: iv_ruleActuator= ruleActuator EOF
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
    // InternalArduinoML.g:487:1: ruleActuator returns [EObject current=null] : ( () otherlv_1= 'Actuator' ) ;
    public final EObject ruleActuator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalArduinoML.g:493:2: ( ( () otherlv_1= 'Actuator' ) )
            // InternalArduinoML.g:494:2: ( () otherlv_1= 'Actuator' )
            {
            // InternalArduinoML.g:494:2: ( () otherlv_1= 'Actuator' )
            // InternalArduinoML.g:495:3: () otherlv_1= 'Actuator'
            {
            // InternalArduinoML.g:495:3: ()
            // InternalArduinoML.g:496:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getActuatorAccess().getActuatorAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,17,FOLLOW_2); 

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
    // InternalArduinoML.g:510:1: entryRuleSensor returns [EObject current=null] : iv_ruleSensor= ruleSensor EOF ;
    public final EObject entryRuleSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSensor = null;


        try {
            // InternalArduinoML.g:510:47: (iv_ruleSensor= ruleSensor EOF )
            // InternalArduinoML.g:511:2: iv_ruleSensor= ruleSensor EOF
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
    // InternalArduinoML.g:517:1: ruleSensor returns [EObject current=null] : ( () otherlv_1= 'Sensor' ) ;
    public final EObject ruleSensor() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalArduinoML.g:523:2: ( ( () otherlv_1= 'Sensor' ) )
            // InternalArduinoML.g:524:2: ( () otherlv_1= 'Sensor' )
            {
            // InternalArduinoML.g:524:2: ( () otherlv_1= 'Sensor' )
            // InternalArduinoML.g:525:3: () otherlv_1= 'Sensor'
            {
            // InternalArduinoML.g:525:3: ()
            // InternalArduinoML.g:526:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSensorAccess().getSensorAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,18,FOLLOW_2); 

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
    // InternalArduinoML.g:540:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // InternalArduinoML.g:540:47: (iv_ruleAction= ruleAction EOF )
            // InternalArduinoML.g:541:2: iv_ruleAction= ruleAction EOF
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
    // InternalArduinoML.g:547:1: ruleAction returns [EObject current=null] : (otherlv_0= 'change' ( ( ruleEString ) ) otherlv_2= 'to' ( (lv_value_3_0= ruleSignal ) ) ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Enumerator lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalArduinoML.g:553:2: ( (otherlv_0= 'change' ( ( ruleEString ) ) otherlv_2= 'to' ( (lv_value_3_0= ruleSignal ) ) ) )
            // InternalArduinoML.g:554:2: (otherlv_0= 'change' ( ( ruleEString ) ) otherlv_2= 'to' ( (lv_value_3_0= ruleSignal ) ) )
            {
            // InternalArduinoML.g:554:2: (otherlv_0= 'change' ( ( ruleEString ) ) otherlv_2= 'to' ( (lv_value_3_0= ruleSignal ) ) )
            // InternalArduinoML.g:555:3: otherlv_0= 'change' ( ( ruleEString ) ) otherlv_2= 'to' ( (lv_value_3_0= ruleSignal ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getActionAccess().getChangeKeyword_0());
            		
            // InternalArduinoML.g:559:3: ( ( ruleEString ) )
            // InternalArduinoML.g:560:4: ( ruleEString )
            {
            // InternalArduinoML.g:560:4: ( ruleEString )
            // InternalArduinoML.g:561:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getActionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getActionAccess().getActuatorActuatorCrossReference_1_0());
            				
            pushFollow(FOLLOW_15);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,20,FOLLOW_16); 

            			newLeafNode(otherlv_2, grammarAccess.getActionAccess().getToKeyword_2());
            		
            // InternalArduinoML.g:579:3: ( (lv_value_3_0= ruleSignal ) )
            // InternalArduinoML.g:580:4: (lv_value_3_0= ruleSignal )
            {
            // InternalArduinoML.g:580:4: (lv_value_3_0= ruleSignal )
            // InternalArduinoML.g:581:5: lv_value_3_0= ruleSignal
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
    // InternalArduinoML.g:602:1: entryRuleTransition returns [EObject current=null] : iv_ruleTransition= ruleTransition EOF ;
    public final EObject entryRuleTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransition = null;


        try {
            // InternalArduinoML.g:602:51: (iv_ruleTransition= ruleTransition EOF )
            // InternalArduinoML.g:603:2: iv_ruleTransition= ruleTransition EOF
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
    // InternalArduinoML.g:609:1: ruleTransition returns [EObject current=null] : ( (otherlv_0= 'when' ( ( ruleEString ) ) otherlv_2= 'is' ( (lv_values_3_0= ruleSignal ) ) (otherlv_4= 'and' ( ( ruleEString ) ) otherlv_6= 'is' ( (lv_values_7_0= ruleSignal ) ) )* otherlv_8= 'go to' ( ( ruleEString ) ) ) | (otherlv_10= 'wait' ( (lv_time_11_0= ruleEInt ) ) ( (lv_unit_12_0= ruleTime_unit ) ) otherlv_13= 'then go to' ( ( ruleEString ) ) ) ) ;
    public final EObject ruleTransition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_13=null;
        Enumerator lv_values_3_0 = null;

        Enumerator lv_values_7_0 = null;

        AntlrDatatypeRuleToken lv_time_11_0 = null;

        Enumerator lv_unit_12_0 = null;



        	enterRule();

        try {
            // InternalArduinoML.g:615:2: ( ( (otherlv_0= 'when' ( ( ruleEString ) ) otherlv_2= 'is' ( (lv_values_3_0= ruleSignal ) ) (otherlv_4= 'and' ( ( ruleEString ) ) otherlv_6= 'is' ( (lv_values_7_0= ruleSignal ) ) )* otherlv_8= 'go to' ( ( ruleEString ) ) ) | (otherlv_10= 'wait' ( (lv_time_11_0= ruleEInt ) ) ( (lv_unit_12_0= ruleTime_unit ) ) otherlv_13= 'then go to' ( ( ruleEString ) ) ) ) )
            // InternalArduinoML.g:616:2: ( (otherlv_0= 'when' ( ( ruleEString ) ) otherlv_2= 'is' ( (lv_values_3_0= ruleSignal ) ) (otherlv_4= 'and' ( ( ruleEString ) ) otherlv_6= 'is' ( (lv_values_7_0= ruleSignal ) ) )* otherlv_8= 'go to' ( ( ruleEString ) ) ) | (otherlv_10= 'wait' ( (lv_time_11_0= ruleEInt ) ) ( (lv_unit_12_0= ruleTime_unit ) ) otherlv_13= 'then go to' ( ( ruleEString ) ) ) )
            {
            // InternalArduinoML.g:616:2: ( (otherlv_0= 'when' ( ( ruleEString ) ) otherlv_2= 'is' ( (lv_values_3_0= ruleSignal ) ) (otherlv_4= 'and' ( ( ruleEString ) ) otherlv_6= 'is' ( (lv_values_7_0= ruleSignal ) ) )* otherlv_8= 'go to' ( ( ruleEString ) ) ) | (otherlv_10= 'wait' ( (lv_time_11_0= ruleEInt ) ) ( (lv_unit_12_0= ruleTime_unit ) ) otherlv_13= 'then go to' ( ( ruleEString ) ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==21) ) {
                alt9=1;
            }
            else if ( (LA9_0==25) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalArduinoML.g:617:3: (otherlv_0= 'when' ( ( ruleEString ) ) otherlv_2= 'is' ( (lv_values_3_0= ruleSignal ) ) (otherlv_4= 'and' ( ( ruleEString ) ) otherlv_6= 'is' ( (lv_values_7_0= ruleSignal ) ) )* otherlv_8= 'go to' ( ( ruleEString ) ) )
                    {
                    // InternalArduinoML.g:617:3: (otherlv_0= 'when' ( ( ruleEString ) ) otherlv_2= 'is' ( (lv_values_3_0= ruleSignal ) ) (otherlv_4= 'and' ( ( ruleEString ) ) otherlv_6= 'is' ( (lv_values_7_0= ruleSignal ) ) )* otherlv_8= 'go to' ( ( ruleEString ) ) )
                    // InternalArduinoML.g:618:4: otherlv_0= 'when' ( ( ruleEString ) ) otherlv_2= 'is' ( (lv_values_3_0= ruleSignal ) ) (otherlv_4= 'and' ( ( ruleEString ) ) otherlv_6= 'is' ( (lv_values_7_0= ruleSignal ) ) )* otherlv_8= 'go to' ( ( ruleEString ) )
                    {
                    otherlv_0=(Token)match(input,21,FOLLOW_3); 

                    				newLeafNode(otherlv_0, grammarAccess.getTransitionAccess().getWhenKeyword_0_0());
                    			
                    // InternalArduinoML.g:622:4: ( ( ruleEString ) )
                    // InternalArduinoML.g:623:5: ( ruleEString )
                    {
                    // InternalArduinoML.g:623:5: ( ruleEString )
                    // InternalArduinoML.g:624:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTransitionRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getTransitionAccess().getSensorsSensorCrossReference_0_1_0());
                    					
                    pushFollow(FOLLOW_17);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_2=(Token)match(input,22,FOLLOW_16); 

                    				newLeafNode(otherlv_2, grammarAccess.getTransitionAccess().getIsKeyword_0_2());
                    			
                    // InternalArduinoML.g:642:4: ( (lv_values_3_0= ruleSignal ) )
                    // InternalArduinoML.g:643:5: (lv_values_3_0= ruleSignal )
                    {
                    // InternalArduinoML.g:643:5: (lv_values_3_0= ruleSignal )
                    // InternalArduinoML.g:644:6: lv_values_3_0= ruleSignal
                    {

                    						newCompositeNode(grammarAccess.getTransitionAccess().getValuesSignalEnumRuleCall_0_3_0());
                    					
                    pushFollow(FOLLOW_18);
                    lv_values_3_0=ruleSignal();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTransitionRule());
                    						}
                    						add(
                    							current,
                    							"values",
                    							lv_values_3_0,
                    							"arduinoML.concretesyntax.ArduinoML.Signal");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalArduinoML.g:661:4: (otherlv_4= 'and' ( ( ruleEString ) ) otherlv_6= 'is' ( (lv_values_7_0= ruleSignal ) ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==23) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalArduinoML.g:662:5: otherlv_4= 'and' ( ( ruleEString ) ) otherlv_6= 'is' ( (lv_values_7_0= ruleSignal ) )
                    	    {
                    	    otherlv_4=(Token)match(input,23,FOLLOW_3); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getTransitionAccess().getAndKeyword_0_4_0());
                    	    				
                    	    // InternalArduinoML.g:666:5: ( ( ruleEString ) )
                    	    // InternalArduinoML.g:667:6: ( ruleEString )
                    	    {
                    	    // InternalArduinoML.g:667:6: ( ruleEString )
                    	    // InternalArduinoML.g:668:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getTransitionRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getTransitionAccess().getSensorsSensorCrossReference_0_4_1_0());
                    	    						
                    	    pushFollow(FOLLOW_17);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }

                    	    otherlv_6=(Token)match(input,22,FOLLOW_16); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getTransitionAccess().getIsKeyword_0_4_2());
                    	    				
                    	    // InternalArduinoML.g:686:5: ( (lv_values_7_0= ruleSignal ) )
                    	    // InternalArduinoML.g:687:6: (lv_values_7_0= ruleSignal )
                    	    {
                    	    // InternalArduinoML.g:687:6: (lv_values_7_0= ruleSignal )
                    	    // InternalArduinoML.g:688:7: lv_values_7_0= ruleSignal
                    	    {

                    	    							newCompositeNode(grammarAccess.getTransitionAccess().getValuesSignalEnumRuleCall_0_4_3_0());
                    	    						
                    	    pushFollow(FOLLOW_18);
                    	    lv_values_7_0=ruleSignal();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getTransitionRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"values",
                    	    								lv_values_7_0,
                    	    								"arduinoML.concretesyntax.ArduinoML.Signal");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,24,FOLLOW_3); 

                    				newLeafNode(otherlv_8, grammarAccess.getTransitionAccess().getGoToKeyword_0_5());
                    			
                    // InternalArduinoML.g:710:4: ( ( ruleEString ) )
                    // InternalArduinoML.g:711:5: ( ruleEString )
                    {
                    // InternalArduinoML.g:711:5: ( ruleEString )
                    // InternalArduinoML.g:712:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTransitionRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getTransitionAccess().getNextStateCrossReference_0_6_0());
                    					
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
                    // InternalArduinoML.g:728:3: (otherlv_10= 'wait' ( (lv_time_11_0= ruleEInt ) ) ( (lv_unit_12_0= ruleTime_unit ) ) otherlv_13= 'then go to' ( ( ruleEString ) ) )
                    {
                    // InternalArduinoML.g:728:3: (otherlv_10= 'wait' ( (lv_time_11_0= ruleEInt ) ) ( (lv_unit_12_0= ruleTime_unit ) ) otherlv_13= 'then go to' ( ( ruleEString ) ) )
                    // InternalArduinoML.g:729:4: otherlv_10= 'wait' ( (lv_time_11_0= ruleEInt ) ) ( (lv_unit_12_0= ruleTime_unit ) ) otherlv_13= 'then go to' ( ( ruleEString ) )
                    {
                    otherlv_10=(Token)match(input,25,FOLLOW_10); 

                    				newLeafNode(otherlv_10, grammarAccess.getTransitionAccess().getWaitKeyword_1_0());
                    			
                    // InternalArduinoML.g:733:4: ( (lv_time_11_0= ruleEInt ) )
                    // InternalArduinoML.g:734:5: (lv_time_11_0= ruleEInt )
                    {
                    // InternalArduinoML.g:734:5: (lv_time_11_0= ruleEInt )
                    // InternalArduinoML.g:735:6: lv_time_11_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getTransitionAccess().getTimeEIntParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_19);
                    lv_time_11_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTransitionRule());
                    						}
                    						set(
                    							current,
                    							"time",
                    							lv_time_11_0,
                    							"arduinoML.concretesyntax.ArduinoML.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalArduinoML.g:752:4: ( (lv_unit_12_0= ruleTime_unit ) )
                    // InternalArduinoML.g:753:5: (lv_unit_12_0= ruleTime_unit )
                    {
                    // InternalArduinoML.g:753:5: (lv_unit_12_0= ruleTime_unit )
                    // InternalArduinoML.g:754:6: lv_unit_12_0= ruleTime_unit
                    {

                    						newCompositeNode(grammarAccess.getTransitionAccess().getUnitTime_unitEnumRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_20);
                    lv_unit_12_0=ruleTime_unit();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTransitionRule());
                    						}
                    						set(
                    							current,
                    							"unit",
                    							lv_unit_12_0,
                    							"arduinoML.concretesyntax.ArduinoML.Time_unit");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_13=(Token)match(input,26,FOLLOW_3); 

                    				newLeafNode(otherlv_13, grammarAccess.getTransitionAccess().getThenGoToKeyword_1_3());
                    			
                    // InternalArduinoML.g:775:4: ( ( ruleEString ) )
                    // InternalArduinoML.g:776:5: ( ruleEString )
                    {
                    // InternalArduinoML.g:776:5: ( ruleEString )
                    // InternalArduinoML.g:777:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTransitionRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getTransitionAccess().getNextStateCrossReference_1_4_0());
                    					
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
    // InternalArduinoML.g:796:1: ruleSignal returns [Enumerator current=null] : ( (enumLiteral_0= 'HIGH' ) | (enumLiteral_1= 'LOW' ) ) ;
    public final Enumerator ruleSignal() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalArduinoML.g:802:2: ( ( (enumLiteral_0= 'HIGH' ) | (enumLiteral_1= 'LOW' ) ) )
            // InternalArduinoML.g:803:2: ( (enumLiteral_0= 'HIGH' ) | (enumLiteral_1= 'LOW' ) )
            {
            // InternalArduinoML.g:803:2: ( (enumLiteral_0= 'HIGH' ) | (enumLiteral_1= 'LOW' ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==27) ) {
                alt10=1;
            }
            else if ( (LA10_0==28) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalArduinoML.g:804:3: (enumLiteral_0= 'HIGH' )
                    {
                    // InternalArduinoML.g:804:3: (enumLiteral_0= 'HIGH' )
                    // InternalArduinoML.g:805:4: enumLiteral_0= 'HIGH'
                    {
                    enumLiteral_0=(Token)match(input,27,FOLLOW_2); 

                    				current = grammarAccess.getSignalAccess().getHIGHEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getSignalAccess().getHIGHEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalArduinoML.g:812:3: (enumLiteral_1= 'LOW' )
                    {
                    // InternalArduinoML.g:812:3: (enumLiteral_1= 'LOW' )
                    // InternalArduinoML.g:813:4: enumLiteral_1= 'LOW'
                    {
                    enumLiteral_1=(Token)match(input,28,FOLLOW_2); 

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
    // InternalArduinoML.g:823:1: ruleTime_unit returns [Enumerator current=null] : ( (enumLiteral_0= 'ms' ) | (enumLiteral_1= 's' ) | (enumLiteral_2= 'min' ) ) ;
    public final Enumerator ruleTime_unit() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalArduinoML.g:829:2: ( ( (enumLiteral_0= 'ms' ) | (enumLiteral_1= 's' ) | (enumLiteral_2= 'min' ) ) )
            // InternalArduinoML.g:830:2: ( (enumLiteral_0= 'ms' ) | (enumLiteral_1= 's' ) | (enumLiteral_2= 'min' ) )
            {
            // InternalArduinoML.g:830:2: ( (enumLiteral_0= 'ms' ) | (enumLiteral_1= 's' ) | (enumLiteral_2= 'min' ) )
            int alt11=3;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt11=1;
                }
                break;
            case 30:
                {
                alt11=2;
                }
                break;
            case 31:
                {
                alt11=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalArduinoML.g:831:3: (enumLiteral_0= 'ms' )
                    {
                    // InternalArduinoML.g:831:3: (enumLiteral_0= 'ms' )
                    // InternalArduinoML.g:832:4: enumLiteral_0= 'ms'
                    {
                    enumLiteral_0=(Token)match(input,29,FOLLOW_2); 

                    				current = grammarAccess.getTime_unitAccess().getMsEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTime_unitAccess().getMsEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalArduinoML.g:839:3: (enumLiteral_1= 's' )
                    {
                    // InternalArduinoML.g:839:3: (enumLiteral_1= 's' )
                    // InternalArduinoML.g:840:4: enumLiteral_1= 's'
                    {
                    enumLiteral_1=(Token)match(input,30,FOLLOW_2); 

                    				current = grammarAccess.getTime_unitAccess().getSEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTime_unitAccess().getSEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalArduinoML.g:847:3: (enumLiteral_2= 'min' )
                    {
                    // InternalArduinoML.g:847:3: (enumLiteral_2= 'min' )
                    // InternalArduinoML.g:848:4: enumLiteral_2= 'min'
                    {
                    enumLiteral_2=(Token)match(input,31,FOLLOW_2); 

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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000068000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010040L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000002280000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000002280002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x00000000E0000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000004000000L});

}