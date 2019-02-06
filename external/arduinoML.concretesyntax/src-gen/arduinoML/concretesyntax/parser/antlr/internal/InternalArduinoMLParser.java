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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'app'", "'initial'", "'state'", "':'", "'bricks'", "'states'", "'mode'", "'modes'", "'transitions'", "'Actuator'", "'Digital'", "'Analog'", "'change'", "'to'", "'when'", "'is'", "'and'", "'wait'", "'then'", "'go'", "'HIGH'", "'LOW'", "'ms'", "'s'", "'min'", "'inf'", "'einf'", "'equal'", "'esup'", "'sup'"
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
    public static final int T__40=40;
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
    // InternalArduinoML.g:72:1: ruleApp returns [EObject current=null] : (this_AppState_0= ruleAppState | this_AppMode_1= ruleAppMode ) ;
    public final EObject ruleApp() throws RecognitionException {
        EObject current = null;

        EObject this_AppState_0 = null;

        EObject this_AppMode_1 = null;



        	enterRule();

        try {
            // InternalArduinoML.g:78:2: ( (this_AppState_0= ruleAppState | this_AppMode_1= ruleAppMode ) )
            // InternalArduinoML.g:79:2: (this_AppState_0= ruleAppState | this_AppMode_1= ruleAppMode )
            {
            // InternalArduinoML.g:79:2: (this_AppState_0= ruleAppState | this_AppMode_1= ruleAppMode )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==11) ) {
                int LA1_1 = input.LA(2);

                if ( (LA1_1==RULE_STRING) ) {
                    int LA1_2 = input.LA(3);

                    if ( (LA1_2==12) ) {
                        int LA1_4 = input.LA(4);

                        if ( (LA1_4==13) ) {
                            alt1=1;
                        }
                        else if ( (LA1_4==17) ) {
                            alt1=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 1, 4, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 1, 2, input);

                        throw nvae;
                    }
                }
                else if ( (LA1_1==RULE_ID) ) {
                    int LA1_3 = input.LA(3);

                    if ( (LA1_3==12) ) {
                        int LA1_4 = input.LA(4);

                        if ( (LA1_4==13) ) {
                            alt1=1;
                        }
                        else if ( (LA1_4==17) ) {
                            alt1=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 1, 4, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 1, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalArduinoML.g:80:3: this_AppState_0= ruleAppState
                    {

                    			newCompositeNode(grammarAccess.getAppAccess().getAppStateParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_AppState_0=ruleAppState();

                    state._fsp--;


                    			current = this_AppState_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalArduinoML.g:89:3: this_AppMode_1= ruleAppMode
                    {

                    			newCompositeNode(grammarAccess.getAppAccess().getAppModeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_AppMode_1=ruleAppMode();

                    state._fsp--;


                    			current = this_AppMode_1;
                    			afterParserOrEnumRuleCall();
                    		

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


    // $ANTLR start "entryRuleAppState"
    // InternalArduinoML.g:101:1: entryRuleAppState returns [EObject current=null] : iv_ruleAppState= ruleAppState EOF ;
    public final EObject entryRuleAppState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAppState = null;


        try {
            // InternalArduinoML.g:101:49: (iv_ruleAppState= ruleAppState EOF )
            // InternalArduinoML.g:102:2: iv_ruleAppState= ruleAppState EOF
            {
             newCompositeNode(grammarAccess.getAppStateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAppState=ruleAppState();

            state._fsp--;

             current =iv_ruleAppState; 
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
    // $ANTLR end "entryRuleAppState"


    // $ANTLR start "ruleAppState"
    // InternalArduinoML.g:108:1: ruleAppState returns [EObject current=null] : ( () (otherlv_1= 'app' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'initial' otherlv_4= 'state' ( ( ruleEString ) ) otherlv_6= ':' otherlv_7= 'bricks' otherlv_8= ':' ( (lv_bricks_9_0= ruleBrick ) ) ( (lv_bricks_10_0= ruleBrick ) )* otherlv_11= 'states' otherlv_12= ':' ( (lv_states_13_0= ruleState ) ) ( (lv_states_14_0= ruleState ) )* ) ) ;
    public final EObject ruleAppState() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_bricks_9_0 = null;

        EObject lv_bricks_10_0 = null;

        EObject lv_states_13_0 = null;

        EObject lv_states_14_0 = null;



        	enterRule();

        try {
            // InternalArduinoML.g:114:2: ( ( () (otherlv_1= 'app' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'initial' otherlv_4= 'state' ( ( ruleEString ) ) otherlv_6= ':' otherlv_7= 'bricks' otherlv_8= ':' ( (lv_bricks_9_0= ruleBrick ) ) ( (lv_bricks_10_0= ruleBrick ) )* otherlv_11= 'states' otherlv_12= ':' ( (lv_states_13_0= ruleState ) ) ( (lv_states_14_0= ruleState ) )* ) ) )
            // InternalArduinoML.g:115:2: ( () (otherlv_1= 'app' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'initial' otherlv_4= 'state' ( ( ruleEString ) ) otherlv_6= ':' otherlv_7= 'bricks' otherlv_8= ':' ( (lv_bricks_9_0= ruleBrick ) ) ( (lv_bricks_10_0= ruleBrick ) )* otherlv_11= 'states' otherlv_12= ':' ( (lv_states_13_0= ruleState ) ) ( (lv_states_14_0= ruleState ) )* ) )
            {
            // InternalArduinoML.g:115:2: ( () (otherlv_1= 'app' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'initial' otherlv_4= 'state' ( ( ruleEString ) ) otherlv_6= ':' otherlv_7= 'bricks' otherlv_8= ':' ( (lv_bricks_9_0= ruleBrick ) ) ( (lv_bricks_10_0= ruleBrick ) )* otherlv_11= 'states' otherlv_12= ':' ( (lv_states_13_0= ruleState ) ) ( (lv_states_14_0= ruleState ) )* ) )
            // InternalArduinoML.g:116:3: () (otherlv_1= 'app' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'initial' otherlv_4= 'state' ( ( ruleEString ) ) otherlv_6= ':' otherlv_7= 'bricks' otherlv_8= ':' ( (lv_bricks_9_0= ruleBrick ) ) ( (lv_bricks_10_0= ruleBrick ) )* otherlv_11= 'states' otherlv_12= ':' ( (lv_states_13_0= ruleState ) ) ( (lv_states_14_0= ruleState ) )* )
            {
            // InternalArduinoML.g:116:3: ()
            // InternalArduinoML.g:117:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAppStateAccess().getAppStateAction_0(),
            					current);
            			

            }

            // InternalArduinoML.g:123:3: (otherlv_1= 'app' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'initial' otherlv_4= 'state' ( ( ruleEString ) ) otherlv_6= ':' otherlv_7= 'bricks' otherlv_8= ':' ( (lv_bricks_9_0= ruleBrick ) ) ( (lv_bricks_10_0= ruleBrick ) )* otherlv_11= 'states' otherlv_12= ':' ( (lv_states_13_0= ruleState ) ) ( (lv_states_14_0= ruleState ) )* )
            // InternalArduinoML.g:124:4: otherlv_1= 'app' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'initial' otherlv_4= 'state' ( ( ruleEString ) ) otherlv_6= ':' otherlv_7= 'bricks' otherlv_8= ':' ( (lv_bricks_9_0= ruleBrick ) ) ( (lv_bricks_10_0= ruleBrick ) )* otherlv_11= 'states' otherlv_12= ':' ( (lv_states_13_0= ruleState ) ) ( (lv_states_14_0= ruleState ) )*
            {
            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            				newLeafNode(otherlv_1, grammarAccess.getAppStateAccess().getAppKeyword_1_0());
            			
            // InternalArduinoML.g:128:4: ( (lv_name_2_0= ruleEString ) )
            // InternalArduinoML.g:129:5: (lv_name_2_0= ruleEString )
            {
            // InternalArduinoML.g:129:5: (lv_name_2_0= ruleEString )
            // InternalArduinoML.g:130:6: lv_name_2_0= ruleEString
            {

            						newCompositeNode(grammarAccess.getAppStateAccess().getNameEStringParserRuleCall_1_1_0());
            					
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getAppStateRule());
            						}
            						set(
            							current,
            							"name",
            							lv_name_2_0,
            							"arduinoML.concretesyntax.ArduinoML.EString");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_5); 

            				newLeafNode(otherlv_3, grammarAccess.getAppStateAccess().getInitialKeyword_1_2());
            			
            otherlv_4=(Token)match(input,13,FOLLOW_3); 

            				newLeafNode(otherlv_4, grammarAccess.getAppStateAccess().getStateKeyword_1_3());
            			
            // InternalArduinoML.g:155:4: ( ( ruleEString ) )
            // InternalArduinoML.g:156:5: ( ruleEString )
            {
            // InternalArduinoML.g:156:5: ( ruleEString )
            // InternalArduinoML.g:157:6: ruleEString
            {

            						if (current==null) {
            							current = createModelElement(grammarAccess.getAppStateRule());
            						}
            					

            						newCompositeNode(grammarAccess.getAppStateAccess().getInitial_stateStateCrossReference_1_4_0());
            					
            pushFollow(FOLLOW_6);
            ruleEString();

            state._fsp--;


            						afterParserOrEnumRuleCall();
            					

            }


            }

            otherlv_6=(Token)match(input,14,FOLLOW_7); 

            				newLeafNode(otherlv_6, grammarAccess.getAppStateAccess().getColonKeyword_1_5());
            			
            otherlv_7=(Token)match(input,15,FOLLOW_6); 

            				newLeafNode(otherlv_7, grammarAccess.getAppStateAccess().getBricksKeyword_1_6());
            			
            otherlv_8=(Token)match(input,14,FOLLOW_8); 

            				newLeafNode(otherlv_8, grammarAccess.getAppStateAccess().getColonKeyword_1_7());
            			
            // InternalArduinoML.g:183:4: ( (lv_bricks_9_0= ruleBrick ) )
            // InternalArduinoML.g:184:5: (lv_bricks_9_0= ruleBrick )
            {
            // InternalArduinoML.g:184:5: (lv_bricks_9_0= ruleBrick )
            // InternalArduinoML.g:185:6: lv_bricks_9_0= ruleBrick
            {

            						newCompositeNode(grammarAccess.getAppStateAccess().getBricksBrickParserRuleCall_1_8_0());
            					
            pushFollow(FOLLOW_9);
            lv_bricks_9_0=ruleBrick();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getAppStateRule());
            						}
            						add(
            							current,
            							"bricks",
            							lv_bricks_9_0,
            							"arduinoML.concretesyntax.ArduinoML.Brick");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            // InternalArduinoML.g:202:4: ( (lv_bricks_10_0= ruleBrick ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=20 && LA2_0<=22)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalArduinoML.g:203:5: (lv_bricks_10_0= ruleBrick )
            	    {
            	    // InternalArduinoML.g:203:5: (lv_bricks_10_0= ruleBrick )
            	    // InternalArduinoML.g:204:6: lv_bricks_10_0= ruleBrick
            	    {

            	    						newCompositeNode(grammarAccess.getAppStateAccess().getBricksBrickParserRuleCall_1_9_0());
            	    					
            	    pushFollow(FOLLOW_9);
            	    lv_bricks_10_0=ruleBrick();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAppStateRule());
            	    						}
            	    						add(
            	    							current,
            	    							"bricks",
            	    							lv_bricks_10_0,
            	    							"arduinoML.concretesyntax.ArduinoML.Brick");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_11=(Token)match(input,16,FOLLOW_6); 

            				newLeafNode(otherlv_11, grammarAccess.getAppStateAccess().getStatesKeyword_1_10());
            			
            otherlv_12=(Token)match(input,14,FOLLOW_3); 

            				newLeafNode(otherlv_12, grammarAccess.getAppStateAccess().getColonKeyword_1_11());
            			
            // InternalArduinoML.g:229:4: ( (lv_states_13_0= ruleState ) )
            // InternalArduinoML.g:230:5: (lv_states_13_0= ruleState )
            {
            // InternalArduinoML.g:230:5: (lv_states_13_0= ruleState )
            // InternalArduinoML.g:231:6: lv_states_13_0= ruleState
            {

            						newCompositeNode(grammarAccess.getAppStateAccess().getStatesStateParserRuleCall_1_12_0());
            					
            pushFollow(FOLLOW_10);
            lv_states_13_0=ruleState();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getAppStateRule());
            						}
            						add(
            							current,
            							"states",
            							lv_states_13_0,
            							"arduinoML.concretesyntax.ArduinoML.State");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            // InternalArduinoML.g:248:4: ( (lv_states_14_0= ruleState ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=RULE_STRING && LA3_0<=RULE_ID)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalArduinoML.g:249:5: (lv_states_14_0= ruleState )
            	    {
            	    // InternalArduinoML.g:249:5: (lv_states_14_0= ruleState )
            	    // InternalArduinoML.g:250:6: lv_states_14_0= ruleState
            	    {

            	    						newCompositeNode(grammarAccess.getAppStateAccess().getStatesStateParserRuleCall_1_13_0());
            	    					
            	    pushFollow(FOLLOW_10);
            	    lv_states_14_0=ruleState();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAppStateRule());
            	    						}
            	    						add(
            	    							current,
            	    							"states",
            	    							lv_states_14_0,
            	    							"arduinoML.concretesyntax.ArduinoML.State");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


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
    // $ANTLR end "ruleAppState"


    // $ANTLR start "entryRuleAppMode"
    // InternalArduinoML.g:272:1: entryRuleAppMode returns [EObject current=null] : iv_ruleAppMode= ruleAppMode EOF ;
    public final EObject entryRuleAppMode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAppMode = null;


        try {
            // InternalArduinoML.g:272:48: (iv_ruleAppMode= ruleAppMode EOF )
            // InternalArduinoML.g:273:2: iv_ruleAppMode= ruleAppMode EOF
            {
             newCompositeNode(grammarAccess.getAppModeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAppMode=ruleAppMode();

            state._fsp--;

             current =iv_ruleAppMode; 
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
    // $ANTLR end "entryRuleAppMode"


    // $ANTLR start "ruleAppMode"
    // InternalArduinoML.g:279:1: ruleAppMode returns [EObject current=null] : ( () (otherlv_1= 'app' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'initial' otherlv_4= 'mode' ( ( ruleEString ) ) otherlv_6= ':' otherlv_7= 'bricks' otherlv_8= ':' ( (lv_bricks_9_0= ruleBrick ) ) ( (lv_bricks_10_0= ruleBrick ) )* otherlv_11= 'modes' otherlv_12= ':' ( (lv_modes_13_0= ruleMode ) ) ( (lv_modes_14_0= ruleMode ) )* ) ) ;
    public final EObject ruleAppMode() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_bricks_9_0 = null;

        EObject lv_bricks_10_0 = null;

        EObject lv_modes_13_0 = null;

        EObject lv_modes_14_0 = null;



        	enterRule();

        try {
            // InternalArduinoML.g:285:2: ( ( () (otherlv_1= 'app' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'initial' otherlv_4= 'mode' ( ( ruleEString ) ) otherlv_6= ':' otherlv_7= 'bricks' otherlv_8= ':' ( (lv_bricks_9_0= ruleBrick ) ) ( (lv_bricks_10_0= ruleBrick ) )* otherlv_11= 'modes' otherlv_12= ':' ( (lv_modes_13_0= ruleMode ) ) ( (lv_modes_14_0= ruleMode ) )* ) ) )
            // InternalArduinoML.g:286:2: ( () (otherlv_1= 'app' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'initial' otherlv_4= 'mode' ( ( ruleEString ) ) otherlv_6= ':' otherlv_7= 'bricks' otherlv_8= ':' ( (lv_bricks_9_0= ruleBrick ) ) ( (lv_bricks_10_0= ruleBrick ) )* otherlv_11= 'modes' otherlv_12= ':' ( (lv_modes_13_0= ruleMode ) ) ( (lv_modes_14_0= ruleMode ) )* ) )
            {
            // InternalArduinoML.g:286:2: ( () (otherlv_1= 'app' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'initial' otherlv_4= 'mode' ( ( ruleEString ) ) otherlv_6= ':' otherlv_7= 'bricks' otherlv_8= ':' ( (lv_bricks_9_0= ruleBrick ) ) ( (lv_bricks_10_0= ruleBrick ) )* otherlv_11= 'modes' otherlv_12= ':' ( (lv_modes_13_0= ruleMode ) ) ( (lv_modes_14_0= ruleMode ) )* ) )
            // InternalArduinoML.g:287:3: () (otherlv_1= 'app' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'initial' otherlv_4= 'mode' ( ( ruleEString ) ) otherlv_6= ':' otherlv_7= 'bricks' otherlv_8= ':' ( (lv_bricks_9_0= ruleBrick ) ) ( (lv_bricks_10_0= ruleBrick ) )* otherlv_11= 'modes' otherlv_12= ':' ( (lv_modes_13_0= ruleMode ) ) ( (lv_modes_14_0= ruleMode ) )* )
            {
            // InternalArduinoML.g:287:3: ()
            // InternalArduinoML.g:288:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAppModeAccess().getAppModeAction_0(),
            					current);
            			

            }

            // InternalArduinoML.g:294:3: (otherlv_1= 'app' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'initial' otherlv_4= 'mode' ( ( ruleEString ) ) otherlv_6= ':' otherlv_7= 'bricks' otherlv_8= ':' ( (lv_bricks_9_0= ruleBrick ) ) ( (lv_bricks_10_0= ruleBrick ) )* otherlv_11= 'modes' otherlv_12= ':' ( (lv_modes_13_0= ruleMode ) ) ( (lv_modes_14_0= ruleMode ) )* )
            // InternalArduinoML.g:295:4: otherlv_1= 'app' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'initial' otherlv_4= 'mode' ( ( ruleEString ) ) otherlv_6= ':' otherlv_7= 'bricks' otherlv_8= ':' ( (lv_bricks_9_0= ruleBrick ) ) ( (lv_bricks_10_0= ruleBrick ) )* otherlv_11= 'modes' otherlv_12= ':' ( (lv_modes_13_0= ruleMode ) ) ( (lv_modes_14_0= ruleMode ) )*
            {
            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            				newLeafNode(otherlv_1, grammarAccess.getAppModeAccess().getAppKeyword_1_0());
            			
            // InternalArduinoML.g:299:4: ( (lv_name_2_0= ruleEString ) )
            // InternalArduinoML.g:300:5: (lv_name_2_0= ruleEString )
            {
            // InternalArduinoML.g:300:5: (lv_name_2_0= ruleEString )
            // InternalArduinoML.g:301:6: lv_name_2_0= ruleEString
            {

            						newCompositeNode(grammarAccess.getAppModeAccess().getNameEStringParserRuleCall_1_1_0());
            					
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getAppModeRule());
            						}
            						set(
            							current,
            							"name",
            							lv_name_2_0,
            							"arduinoML.concretesyntax.ArduinoML.EString");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_11); 

            				newLeafNode(otherlv_3, grammarAccess.getAppModeAccess().getInitialKeyword_1_2());
            			
            otherlv_4=(Token)match(input,17,FOLLOW_3); 

            				newLeafNode(otherlv_4, grammarAccess.getAppModeAccess().getModeKeyword_1_3());
            			
            // InternalArduinoML.g:326:4: ( ( ruleEString ) )
            // InternalArduinoML.g:327:5: ( ruleEString )
            {
            // InternalArduinoML.g:327:5: ( ruleEString )
            // InternalArduinoML.g:328:6: ruleEString
            {

            						if (current==null) {
            							current = createModelElement(grammarAccess.getAppModeRule());
            						}
            					

            						newCompositeNode(grammarAccess.getAppModeAccess().getInitial_modeModeCrossReference_1_4_0());
            					
            pushFollow(FOLLOW_6);
            ruleEString();

            state._fsp--;


            						afterParserOrEnumRuleCall();
            					

            }


            }

            otherlv_6=(Token)match(input,14,FOLLOW_7); 

            				newLeafNode(otherlv_6, grammarAccess.getAppModeAccess().getColonKeyword_1_5());
            			
            otherlv_7=(Token)match(input,15,FOLLOW_6); 

            				newLeafNode(otherlv_7, grammarAccess.getAppModeAccess().getBricksKeyword_1_6());
            			
            otherlv_8=(Token)match(input,14,FOLLOW_8); 

            				newLeafNode(otherlv_8, grammarAccess.getAppModeAccess().getColonKeyword_1_7());
            			
            // InternalArduinoML.g:354:4: ( (lv_bricks_9_0= ruleBrick ) )
            // InternalArduinoML.g:355:5: (lv_bricks_9_0= ruleBrick )
            {
            // InternalArduinoML.g:355:5: (lv_bricks_9_0= ruleBrick )
            // InternalArduinoML.g:356:6: lv_bricks_9_0= ruleBrick
            {

            						newCompositeNode(grammarAccess.getAppModeAccess().getBricksBrickParserRuleCall_1_8_0());
            					
            pushFollow(FOLLOW_12);
            lv_bricks_9_0=ruleBrick();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getAppModeRule());
            						}
            						add(
            							current,
            							"bricks",
            							lv_bricks_9_0,
            							"arduinoML.concretesyntax.ArduinoML.Brick");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            // InternalArduinoML.g:373:4: ( (lv_bricks_10_0= ruleBrick ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=20 && LA4_0<=22)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalArduinoML.g:374:5: (lv_bricks_10_0= ruleBrick )
            	    {
            	    // InternalArduinoML.g:374:5: (lv_bricks_10_0= ruleBrick )
            	    // InternalArduinoML.g:375:6: lv_bricks_10_0= ruleBrick
            	    {

            	    						newCompositeNode(grammarAccess.getAppModeAccess().getBricksBrickParserRuleCall_1_9_0());
            	    					
            	    pushFollow(FOLLOW_12);
            	    lv_bricks_10_0=ruleBrick();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAppModeRule());
            	    						}
            	    						add(
            	    							current,
            	    							"bricks",
            	    							lv_bricks_10_0,
            	    							"arduinoML.concretesyntax.ArduinoML.Brick");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_11=(Token)match(input,18,FOLLOW_6); 

            				newLeafNode(otherlv_11, grammarAccess.getAppModeAccess().getModesKeyword_1_10());
            			
            otherlv_12=(Token)match(input,14,FOLLOW_3); 

            				newLeafNode(otherlv_12, grammarAccess.getAppModeAccess().getColonKeyword_1_11());
            			
            // InternalArduinoML.g:400:4: ( (lv_modes_13_0= ruleMode ) )
            // InternalArduinoML.g:401:5: (lv_modes_13_0= ruleMode )
            {
            // InternalArduinoML.g:401:5: (lv_modes_13_0= ruleMode )
            // InternalArduinoML.g:402:6: lv_modes_13_0= ruleMode
            {

            						newCompositeNode(grammarAccess.getAppModeAccess().getModesModeParserRuleCall_1_12_0());
            					
            pushFollow(FOLLOW_10);
            lv_modes_13_0=ruleMode();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getAppModeRule());
            						}
            						add(
            							current,
            							"modes",
            							lv_modes_13_0,
            							"arduinoML.concretesyntax.ArduinoML.Mode");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            // InternalArduinoML.g:419:4: ( (lv_modes_14_0= ruleMode ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=RULE_STRING && LA5_0<=RULE_ID)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalArduinoML.g:420:5: (lv_modes_14_0= ruleMode )
            	    {
            	    // InternalArduinoML.g:420:5: (lv_modes_14_0= ruleMode )
            	    // InternalArduinoML.g:421:6: lv_modes_14_0= ruleMode
            	    {

            	    						newCompositeNode(grammarAccess.getAppModeAccess().getModesModeParserRuleCall_1_13_0());
            	    					
            	    pushFollow(FOLLOW_10);
            	    lv_modes_14_0=ruleMode();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAppModeRule());
            	    						}
            	    						add(
            	    							current,
            	    							"modes",
            	    							lv_modes_14_0,
            	    							"arduinoML.concretesyntax.ArduinoML.Mode");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


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
    // $ANTLR end "ruleAppMode"


    // $ANTLR start "entryRuleBrick"
    // InternalArduinoML.g:443:1: entryRuleBrick returns [EObject current=null] : iv_ruleBrick= ruleBrick EOF ;
    public final EObject entryRuleBrick() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBrick = null;


        try {
            // InternalArduinoML.g:443:46: (iv_ruleBrick= ruleBrick EOF )
            // InternalArduinoML.g:444:2: iv_ruleBrick= ruleBrick EOF
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
    // InternalArduinoML.g:450:1: ruleBrick returns [EObject current=null] : ( (this_Actuator_0= ruleActuator | this_Digital_1= ruleDigital | this_Analog_2= ruleAnalog ) ( (lv_name_3_0= ruleEString ) ) otherlv_4= ':' ( (lv_pin_5_0= ruleEInt ) ) ) ;
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
            // InternalArduinoML.g:456:2: ( ( (this_Actuator_0= ruleActuator | this_Digital_1= ruleDigital | this_Analog_2= ruleAnalog ) ( (lv_name_3_0= ruleEString ) ) otherlv_4= ':' ( (lv_pin_5_0= ruleEInt ) ) ) )
            // InternalArduinoML.g:457:2: ( (this_Actuator_0= ruleActuator | this_Digital_1= ruleDigital | this_Analog_2= ruleAnalog ) ( (lv_name_3_0= ruleEString ) ) otherlv_4= ':' ( (lv_pin_5_0= ruleEInt ) ) )
            {
            // InternalArduinoML.g:457:2: ( (this_Actuator_0= ruleActuator | this_Digital_1= ruleDigital | this_Analog_2= ruleAnalog ) ( (lv_name_3_0= ruleEString ) ) otherlv_4= ':' ( (lv_pin_5_0= ruleEInt ) ) )
            // InternalArduinoML.g:458:3: (this_Actuator_0= ruleActuator | this_Digital_1= ruleDigital | this_Analog_2= ruleAnalog ) ( (lv_name_3_0= ruleEString ) ) otherlv_4= ':' ( (lv_pin_5_0= ruleEInt ) )
            {
            // InternalArduinoML.g:458:3: (this_Actuator_0= ruleActuator | this_Digital_1= ruleDigital | this_Analog_2= ruleAnalog )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt6=1;
                }
                break;
            case 21:
                {
                alt6=2;
                }
                break;
            case 22:
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
                    // InternalArduinoML.g:459:4: this_Actuator_0= ruleActuator
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
                    // InternalArduinoML.g:468:4: this_Digital_1= ruleDigital
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
                    // InternalArduinoML.g:477:4: this_Analog_2= ruleAnalog
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

            // InternalArduinoML.g:486:3: ( (lv_name_3_0= ruleEString ) )
            // InternalArduinoML.g:487:4: (lv_name_3_0= ruleEString )
            {
            // InternalArduinoML.g:487:4: (lv_name_3_0= ruleEString )
            // InternalArduinoML.g:488:5: lv_name_3_0= ruleEString
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
            		
            // InternalArduinoML.g:509:3: ( (lv_pin_5_0= ruleEInt ) )
            // InternalArduinoML.g:510:4: (lv_pin_5_0= ruleEInt )
            {
            // InternalArduinoML.g:510:4: (lv_pin_5_0= ruleEInt )
            // InternalArduinoML.g:511:5: lv_pin_5_0= ruleEInt
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
    // InternalArduinoML.g:532:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalArduinoML.g:532:47: (iv_ruleEString= ruleEString EOF )
            // InternalArduinoML.g:533:2: iv_ruleEString= ruleEString EOF
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
    // InternalArduinoML.g:539:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalArduinoML.g:545:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalArduinoML.g:546:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalArduinoML.g:546:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
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
                    // InternalArduinoML.g:547:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalArduinoML.g:555:3: this_ID_1= RULE_ID
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
    // InternalArduinoML.g:566:1: entryRuleMode returns [EObject current=null] : iv_ruleMode= ruleMode EOF ;
    public final EObject entryRuleMode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMode = null;


        try {
            // InternalArduinoML.g:566:45: (iv_ruleMode= ruleMode EOF )
            // InternalArduinoML.g:567:2: iv_ruleMode= ruleMode EOF
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
    // InternalArduinoML.g:573:1: ruleMode returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= 'initial' otherlv_2= 'state' ( ( ruleEString ) ) otherlv_4= ':' (otherlv_5= 'bricks' otherlv_6= ':' ( (lv_bricks_7_0= ruleBrick ) ) ( (lv_bricks_8_0= ruleBrick ) )* )? otherlv_9= 'states' otherlv_10= ':' ( (lv_states_11_0= ruleState ) ) ( (lv_states_12_0= ruleState ) )* otherlv_13= 'transitions' otherlv_14= ':' ( (lv_transitions_mode_15_0= ruleTransitionMode ) ) ( (lv_transitions_mode_16_0= ruleTransitionMode ) )* ) ;
    public final EObject ruleMode() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_bricks_7_0 = null;

        EObject lv_bricks_8_0 = null;

        EObject lv_states_11_0 = null;

        EObject lv_states_12_0 = null;

        EObject lv_transitions_mode_15_0 = null;

        EObject lv_transitions_mode_16_0 = null;



        	enterRule();

        try {
            // InternalArduinoML.g:579:2: ( ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= 'initial' otherlv_2= 'state' ( ( ruleEString ) ) otherlv_4= ':' (otherlv_5= 'bricks' otherlv_6= ':' ( (lv_bricks_7_0= ruleBrick ) ) ( (lv_bricks_8_0= ruleBrick ) )* )? otherlv_9= 'states' otherlv_10= ':' ( (lv_states_11_0= ruleState ) ) ( (lv_states_12_0= ruleState ) )* otherlv_13= 'transitions' otherlv_14= ':' ( (lv_transitions_mode_15_0= ruleTransitionMode ) ) ( (lv_transitions_mode_16_0= ruleTransitionMode ) )* ) )
            // InternalArduinoML.g:580:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= 'initial' otherlv_2= 'state' ( ( ruleEString ) ) otherlv_4= ':' (otherlv_5= 'bricks' otherlv_6= ':' ( (lv_bricks_7_0= ruleBrick ) ) ( (lv_bricks_8_0= ruleBrick ) )* )? otherlv_9= 'states' otherlv_10= ':' ( (lv_states_11_0= ruleState ) ) ( (lv_states_12_0= ruleState ) )* otherlv_13= 'transitions' otherlv_14= ':' ( (lv_transitions_mode_15_0= ruleTransitionMode ) ) ( (lv_transitions_mode_16_0= ruleTransitionMode ) )* )
            {
            // InternalArduinoML.g:580:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= 'initial' otherlv_2= 'state' ( ( ruleEString ) ) otherlv_4= ':' (otherlv_5= 'bricks' otherlv_6= ':' ( (lv_bricks_7_0= ruleBrick ) ) ( (lv_bricks_8_0= ruleBrick ) )* )? otherlv_9= 'states' otherlv_10= ':' ( (lv_states_11_0= ruleState ) ) ( (lv_states_12_0= ruleState ) )* otherlv_13= 'transitions' otherlv_14= ':' ( (lv_transitions_mode_15_0= ruleTransitionMode ) ) ( (lv_transitions_mode_16_0= ruleTransitionMode ) )* )
            // InternalArduinoML.g:581:3: ( (lv_name_0_0= ruleEString ) ) otherlv_1= 'initial' otherlv_2= 'state' ( ( ruleEString ) ) otherlv_4= ':' (otherlv_5= 'bricks' otherlv_6= ':' ( (lv_bricks_7_0= ruleBrick ) ) ( (lv_bricks_8_0= ruleBrick ) )* )? otherlv_9= 'states' otherlv_10= ':' ( (lv_states_11_0= ruleState ) ) ( (lv_states_12_0= ruleState ) )* otherlv_13= 'transitions' otherlv_14= ':' ( (lv_transitions_mode_15_0= ruleTransitionMode ) ) ( (lv_transitions_mode_16_0= ruleTransitionMode ) )*
            {
            // InternalArduinoML.g:581:3: ( (lv_name_0_0= ruleEString ) )
            // InternalArduinoML.g:582:4: (lv_name_0_0= ruleEString )
            {
            // InternalArduinoML.g:582:4: (lv_name_0_0= ruleEString )
            // InternalArduinoML.g:583:5: lv_name_0_0= ruleEString
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
            		
            // InternalArduinoML.g:608:3: ( ( ruleEString ) )
            // InternalArduinoML.g:609:4: ( ruleEString )
            {
            // InternalArduinoML.g:609:4: ( ruleEString )
            // InternalArduinoML.g:610:5: ruleEString
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
            		
            // InternalArduinoML.g:628:3: (otherlv_5= 'bricks' otherlv_6= ':' ( (lv_bricks_7_0= ruleBrick ) ) ( (lv_bricks_8_0= ruleBrick ) )* )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==15) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalArduinoML.g:629:4: otherlv_5= 'bricks' otherlv_6= ':' ( (lv_bricks_7_0= ruleBrick ) ) ( (lv_bricks_8_0= ruleBrick ) )*
                    {
                    otherlv_5=(Token)match(input,15,FOLLOW_6); 

                    				newLeafNode(otherlv_5, grammarAccess.getModeAccess().getBricksKeyword_5_0());
                    			
                    otherlv_6=(Token)match(input,14,FOLLOW_8); 

                    				newLeafNode(otherlv_6, grammarAccess.getModeAccess().getColonKeyword_5_1());
                    			
                    // InternalArduinoML.g:637:4: ( (lv_bricks_7_0= ruleBrick ) )
                    // InternalArduinoML.g:638:5: (lv_bricks_7_0= ruleBrick )
                    {
                    // InternalArduinoML.g:638:5: (lv_bricks_7_0= ruleBrick )
                    // InternalArduinoML.g:639:6: lv_bricks_7_0= ruleBrick
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

                    // InternalArduinoML.g:656:4: ( (lv_bricks_8_0= ruleBrick ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( ((LA8_0>=20 && LA8_0<=22)) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalArduinoML.g:657:5: (lv_bricks_8_0= ruleBrick )
                    	    {
                    	    // InternalArduinoML.g:657:5: (lv_bricks_8_0= ruleBrick )
                    	    // InternalArduinoML.g:658:6: lv_bricks_8_0= ruleBrick
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
            		
            // InternalArduinoML.g:684:3: ( (lv_states_11_0= ruleState ) )
            // InternalArduinoML.g:685:4: (lv_states_11_0= ruleState )
            {
            // InternalArduinoML.g:685:4: (lv_states_11_0= ruleState )
            // InternalArduinoML.g:686:5: lv_states_11_0= ruleState
            {

            					newCompositeNode(grammarAccess.getModeAccess().getStatesStateParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_15);
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

            // InternalArduinoML.g:703:3: ( (lv_states_12_0= ruleState ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=RULE_STRING && LA10_0<=RULE_ID)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalArduinoML.g:704:4: (lv_states_12_0= ruleState )
            	    {
            	    // InternalArduinoML.g:704:4: (lv_states_12_0= ruleState )
            	    // InternalArduinoML.g:705:5: lv_states_12_0= ruleState
            	    {

            	    					newCompositeNode(grammarAccess.getModeAccess().getStatesStateParserRuleCall_9_0());
            	    				
            	    pushFollow(FOLLOW_15);
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

            otherlv_13=(Token)match(input,19,FOLLOW_6); 

            			newLeafNode(otherlv_13, grammarAccess.getModeAccess().getTransitionsKeyword_10());
            		
            otherlv_14=(Token)match(input,14,FOLLOW_16); 

            			newLeafNode(otherlv_14, grammarAccess.getModeAccess().getColonKeyword_11());
            		
            // InternalArduinoML.g:730:3: ( (lv_transitions_mode_15_0= ruleTransitionMode ) )
            // InternalArduinoML.g:731:4: (lv_transitions_mode_15_0= ruleTransitionMode )
            {
            // InternalArduinoML.g:731:4: (lv_transitions_mode_15_0= ruleTransitionMode )
            // InternalArduinoML.g:732:5: lv_transitions_mode_15_0= ruleTransitionMode
            {

            					newCompositeNode(grammarAccess.getModeAccess().getTransitions_modeTransitionModeParserRuleCall_12_0());
            				
            pushFollow(FOLLOW_17);
            lv_transitions_mode_15_0=ruleTransitionMode();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getModeRule());
            					}
            					add(
            						current,
            						"transitions_mode",
            						lv_transitions_mode_15_0,
            						"arduinoML.concretesyntax.ArduinoML.TransitionMode");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalArduinoML.g:749:3: ( (lv_transitions_mode_16_0= ruleTransitionMode ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==25||LA11_0==28) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalArduinoML.g:750:4: (lv_transitions_mode_16_0= ruleTransitionMode )
            	    {
            	    // InternalArduinoML.g:750:4: (lv_transitions_mode_16_0= ruleTransitionMode )
            	    // InternalArduinoML.g:751:5: lv_transitions_mode_16_0= ruleTransitionMode
            	    {

            	    					newCompositeNode(grammarAccess.getModeAccess().getTransitions_modeTransitionModeParserRuleCall_13_0());
            	    				
            	    pushFollow(FOLLOW_17);
            	    lv_transitions_mode_16_0=ruleTransitionMode();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModeRule());
            	    					}
            	    					add(
            	    						current,
            	    						"transitions_mode",
            	    						lv_transitions_mode_16_0,
            	    						"arduinoML.concretesyntax.ArduinoML.TransitionMode");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
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
    // InternalArduinoML.g:772:1: entryRuleState returns [EObject current=null] : iv_ruleState= ruleState EOF ;
    public final EObject entryRuleState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleState = null;


        try {
            // InternalArduinoML.g:772:46: (iv_ruleState= ruleState EOF )
            // InternalArduinoML.g:773:2: iv_ruleState= ruleState EOF
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
    // InternalArduinoML.g:779:1: ruleState returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_actions_2_0= ruleAction ) ) ( (lv_actions_3_0= ruleAction ) )* ( (lv_transitions_state_4_0= ruleTransitionState ) ) ( (lv_transitions_state_5_0= ruleTransitionState ) )* ) ;
    public final EObject ruleState() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_actions_2_0 = null;

        EObject lv_actions_3_0 = null;

        EObject lv_transitions_state_4_0 = null;

        EObject lv_transitions_state_5_0 = null;



        	enterRule();

        try {
            // InternalArduinoML.g:785:2: ( ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_actions_2_0= ruleAction ) ) ( (lv_actions_3_0= ruleAction ) )* ( (lv_transitions_state_4_0= ruleTransitionState ) ) ( (lv_transitions_state_5_0= ruleTransitionState ) )* ) )
            // InternalArduinoML.g:786:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_actions_2_0= ruleAction ) ) ( (lv_actions_3_0= ruleAction ) )* ( (lv_transitions_state_4_0= ruleTransitionState ) ) ( (lv_transitions_state_5_0= ruleTransitionState ) )* )
            {
            // InternalArduinoML.g:786:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_actions_2_0= ruleAction ) ) ( (lv_actions_3_0= ruleAction ) )* ( (lv_transitions_state_4_0= ruleTransitionState ) ) ( (lv_transitions_state_5_0= ruleTransitionState ) )* )
            // InternalArduinoML.g:787:3: ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_actions_2_0= ruleAction ) ) ( (lv_actions_3_0= ruleAction ) )* ( (lv_transitions_state_4_0= ruleTransitionState ) ) ( (lv_transitions_state_5_0= ruleTransitionState ) )*
            {
            // InternalArduinoML.g:787:3: ( (lv_name_0_0= ruleEString ) )
            // InternalArduinoML.g:788:4: (lv_name_0_0= ruleEString )
            {
            // InternalArduinoML.g:788:4: (lv_name_0_0= ruleEString )
            // InternalArduinoML.g:789:5: lv_name_0_0= ruleEString
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

            otherlv_1=(Token)match(input,14,FOLLOW_18); 

            			newLeafNode(otherlv_1, grammarAccess.getStateAccess().getColonKeyword_1());
            		
            // InternalArduinoML.g:810:3: ( (lv_actions_2_0= ruleAction ) )
            // InternalArduinoML.g:811:4: (lv_actions_2_0= ruleAction )
            {
            // InternalArduinoML.g:811:4: (lv_actions_2_0= ruleAction )
            // InternalArduinoML.g:812:5: lv_actions_2_0= ruleAction
            {

            					newCompositeNode(grammarAccess.getStateAccess().getActionsActionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_19);
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

            // InternalArduinoML.g:829:3: ( (lv_actions_3_0= ruleAction ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==23) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalArduinoML.g:830:4: (lv_actions_3_0= ruleAction )
            	    {
            	    // InternalArduinoML.g:830:4: (lv_actions_3_0= ruleAction )
            	    // InternalArduinoML.g:831:5: lv_actions_3_0= ruleAction
            	    {

            	    					newCompositeNode(grammarAccess.getStateAccess().getActionsActionParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_19);
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
            	    break loop12;
                }
            } while (true);

            // InternalArduinoML.g:848:3: ( (lv_transitions_state_4_0= ruleTransitionState ) )
            // InternalArduinoML.g:849:4: (lv_transitions_state_4_0= ruleTransitionState )
            {
            // InternalArduinoML.g:849:4: (lv_transitions_state_4_0= ruleTransitionState )
            // InternalArduinoML.g:850:5: lv_transitions_state_4_0= ruleTransitionState
            {

            					newCompositeNode(grammarAccess.getStateAccess().getTransitions_stateTransitionStateParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_20);
            lv_transitions_state_4_0=ruleTransitionState();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStateRule());
            					}
            					add(
            						current,
            						"transitions_state",
            						lv_transitions_state_4_0,
            						"arduinoML.concretesyntax.ArduinoML.TransitionState");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalArduinoML.g:867:3: ( (lv_transitions_state_5_0= ruleTransitionState ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==25||LA13_0==28) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalArduinoML.g:868:4: (lv_transitions_state_5_0= ruleTransitionState )
            	    {
            	    // InternalArduinoML.g:868:4: (lv_transitions_state_5_0= ruleTransitionState )
            	    // InternalArduinoML.g:869:5: lv_transitions_state_5_0= ruleTransitionState
            	    {

            	    					newCompositeNode(grammarAccess.getStateAccess().getTransitions_stateTransitionStateParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_20);
            	    lv_transitions_state_5_0=ruleTransitionState();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getStateRule());
            	    					}
            	    					add(
            	    						current,
            	    						"transitions_state",
            	    						lv_transitions_state_5_0,
            	    						"arduinoML.concretesyntax.ArduinoML.TransitionState");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
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
    // InternalArduinoML.g:890:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalArduinoML.g:890:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalArduinoML.g:891:2: iv_ruleEInt= ruleEInt EOF
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
    // InternalArduinoML.g:897:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;


        	enterRule();

        try {
            // InternalArduinoML.g:903:2: (this_INT_0= RULE_INT )
            // InternalArduinoML.g:904:2: this_INT_0= RULE_INT
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
    // InternalArduinoML.g:914:1: entryRuleActuator returns [EObject current=null] : iv_ruleActuator= ruleActuator EOF ;
    public final EObject entryRuleActuator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActuator = null;


        try {
            // InternalArduinoML.g:914:49: (iv_ruleActuator= ruleActuator EOF )
            // InternalArduinoML.g:915:2: iv_ruleActuator= ruleActuator EOF
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
    // InternalArduinoML.g:921:1: ruleActuator returns [EObject current=null] : ( () otherlv_1= 'Actuator' ) ;
    public final EObject ruleActuator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalArduinoML.g:927:2: ( ( () otherlv_1= 'Actuator' ) )
            // InternalArduinoML.g:928:2: ( () otherlv_1= 'Actuator' )
            {
            // InternalArduinoML.g:928:2: ( () otherlv_1= 'Actuator' )
            // InternalArduinoML.g:929:3: () otherlv_1= 'Actuator'
            {
            // InternalArduinoML.g:929:3: ()
            // InternalArduinoML.g:930:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getActuatorAccess().getActuatorAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,20,FOLLOW_2); 

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
    // InternalArduinoML.g:944:1: entryRuleDigital returns [EObject current=null] : iv_ruleDigital= ruleDigital EOF ;
    public final EObject entryRuleDigital() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDigital = null;


        try {
            // InternalArduinoML.g:944:48: (iv_ruleDigital= ruleDigital EOF )
            // InternalArduinoML.g:945:2: iv_ruleDigital= ruleDigital EOF
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
    // InternalArduinoML.g:951:1: ruleDigital returns [EObject current=null] : ( () otherlv_1= 'Digital' ) ;
    public final EObject ruleDigital() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalArduinoML.g:957:2: ( ( () otherlv_1= 'Digital' ) )
            // InternalArduinoML.g:958:2: ( () otherlv_1= 'Digital' )
            {
            // InternalArduinoML.g:958:2: ( () otherlv_1= 'Digital' )
            // InternalArduinoML.g:959:3: () otherlv_1= 'Digital'
            {
            // InternalArduinoML.g:959:3: ()
            // InternalArduinoML.g:960:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDigitalAccess().getDigitalAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,21,FOLLOW_2); 

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
    // InternalArduinoML.g:974:1: entryRuleAnalog returns [EObject current=null] : iv_ruleAnalog= ruleAnalog EOF ;
    public final EObject entryRuleAnalog() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnalog = null;


        try {
            // InternalArduinoML.g:974:47: (iv_ruleAnalog= ruleAnalog EOF )
            // InternalArduinoML.g:975:2: iv_ruleAnalog= ruleAnalog EOF
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
    // InternalArduinoML.g:981:1: ruleAnalog returns [EObject current=null] : ( () otherlv_1= 'Analog' ) ;
    public final EObject ruleAnalog() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalArduinoML.g:987:2: ( ( () otherlv_1= 'Analog' ) )
            // InternalArduinoML.g:988:2: ( () otherlv_1= 'Analog' )
            {
            // InternalArduinoML.g:988:2: ( () otherlv_1= 'Analog' )
            // InternalArduinoML.g:989:3: () otherlv_1= 'Analog'
            {
            // InternalArduinoML.g:989:3: ()
            // InternalArduinoML.g:990:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAnalogAccess().getAnalogAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,22,FOLLOW_2); 

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
    // InternalArduinoML.g:1004:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // InternalArduinoML.g:1004:47: (iv_ruleAction= ruleAction EOF )
            // InternalArduinoML.g:1005:2: iv_ruleAction= ruleAction EOF
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
    // InternalArduinoML.g:1011:1: ruleAction returns [EObject current=null] : (otherlv_0= 'change' ( ( ruleEString ) ) otherlv_2= 'to' ( (lv_value_3_0= ruleSignal ) ) ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Enumerator lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalArduinoML.g:1017:2: ( (otherlv_0= 'change' ( ( ruleEString ) ) otherlv_2= 'to' ( (lv_value_3_0= ruleSignal ) ) ) )
            // InternalArduinoML.g:1018:2: (otherlv_0= 'change' ( ( ruleEString ) ) otherlv_2= 'to' ( (lv_value_3_0= ruleSignal ) ) )
            {
            // InternalArduinoML.g:1018:2: (otherlv_0= 'change' ( ( ruleEString ) ) otherlv_2= 'to' ( (lv_value_3_0= ruleSignal ) ) )
            // InternalArduinoML.g:1019:3: otherlv_0= 'change' ( ( ruleEString ) ) otherlv_2= 'to' ( (lv_value_3_0= ruleSignal ) )
            {
            otherlv_0=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getActionAccess().getChangeKeyword_0());
            		
            // InternalArduinoML.g:1023:3: ( ( ruleEString ) )
            // InternalArduinoML.g:1024:4: ( ruleEString )
            {
            // InternalArduinoML.g:1024:4: ( ruleEString )
            // InternalArduinoML.g:1025:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getActionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getActionAccess().getActuatorActuatorCrossReference_1_0());
            				
            pushFollow(FOLLOW_21);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,24,FOLLOW_22); 

            			newLeafNode(otherlv_2, grammarAccess.getActionAccess().getToKeyword_2());
            		
            // InternalArduinoML.g:1043:3: ( (lv_value_3_0= ruleSignal ) )
            // InternalArduinoML.g:1044:4: (lv_value_3_0= ruleSignal )
            {
            // InternalArduinoML.g:1044:4: (lv_value_3_0= ruleSignal )
            // InternalArduinoML.g:1045:5: lv_value_3_0= ruleSignal
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


    // $ANTLR start "entryRuleTransitionState"
    // InternalArduinoML.g:1066:1: entryRuleTransitionState returns [EObject current=null] : iv_ruleTransitionState= ruleTransitionState EOF ;
    public final EObject entryRuleTransitionState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransitionState = null;


        try {
            // InternalArduinoML.g:1066:56: (iv_ruleTransitionState= ruleTransitionState EOF )
            // InternalArduinoML.g:1067:2: iv_ruleTransitionState= ruleTransitionState EOF
            {
             newCompositeNode(grammarAccess.getTransitionStateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTransitionState=ruleTransitionState();

            state._fsp--;

             current =iv_ruleTransitionState; 
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
    // $ANTLR end "entryRuleTransitionState"


    // $ANTLR start "ruleTransitionState"
    // InternalArduinoML.g:1073:1: ruleTransitionState returns [EObject current=null] : ( ( (otherlv_0= 'when' ( ( ( ( ruleEString ) ) otherlv_2= 'is' ( (lv_d_values_3_0= ruleSignal ) ) ) | ( ( ( ruleEString ) ) ( (lv_comp_5_0= ruleCompare ) ) ( (lv_a_values_6_0= ruleEInt ) ) ) ) (otherlv_7= 'and' ( ( ( ( ruleEString ) ) otherlv_9= 'is' ( (lv_d_values_10_0= ruleSignal ) ) ) | ( ( ( ruleEString ) ) ( (lv_comp_12_0= ruleCompare ) ) ( (lv_a_values_13_0= ruleEInt ) ) ) ) )* (otherlv_14= 'wait' ( (lv_time_15_0= ruleEInt ) ) ( (lv_unit_16_0= ruleTime_unit ) ) otherlv_17= 'then' )? ) | (otherlv_18= 'wait' ( (lv_time_19_0= ruleEInt ) ) ( (lv_unit_20_0= ruleTime_unit ) ) otherlv_21= 'then' ) ) otherlv_22= 'go' otherlv_23= 'to' otherlv_24= 'state' ( ( ruleEString ) ) ) ;
    public final EObject ruleTransitionState() throws RecognitionException {
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
            // InternalArduinoML.g:1079:2: ( ( ( (otherlv_0= 'when' ( ( ( ( ruleEString ) ) otherlv_2= 'is' ( (lv_d_values_3_0= ruleSignal ) ) ) | ( ( ( ruleEString ) ) ( (lv_comp_5_0= ruleCompare ) ) ( (lv_a_values_6_0= ruleEInt ) ) ) ) (otherlv_7= 'and' ( ( ( ( ruleEString ) ) otherlv_9= 'is' ( (lv_d_values_10_0= ruleSignal ) ) ) | ( ( ( ruleEString ) ) ( (lv_comp_12_0= ruleCompare ) ) ( (lv_a_values_13_0= ruleEInt ) ) ) ) )* (otherlv_14= 'wait' ( (lv_time_15_0= ruleEInt ) ) ( (lv_unit_16_0= ruleTime_unit ) ) otherlv_17= 'then' )? ) | (otherlv_18= 'wait' ( (lv_time_19_0= ruleEInt ) ) ( (lv_unit_20_0= ruleTime_unit ) ) otherlv_21= 'then' ) ) otherlv_22= 'go' otherlv_23= 'to' otherlv_24= 'state' ( ( ruleEString ) ) ) )
            // InternalArduinoML.g:1080:2: ( ( (otherlv_0= 'when' ( ( ( ( ruleEString ) ) otherlv_2= 'is' ( (lv_d_values_3_0= ruleSignal ) ) ) | ( ( ( ruleEString ) ) ( (lv_comp_5_0= ruleCompare ) ) ( (lv_a_values_6_0= ruleEInt ) ) ) ) (otherlv_7= 'and' ( ( ( ( ruleEString ) ) otherlv_9= 'is' ( (lv_d_values_10_0= ruleSignal ) ) ) | ( ( ( ruleEString ) ) ( (lv_comp_12_0= ruleCompare ) ) ( (lv_a_values_13_0= ruleEInt ) ) ) ) )* (otherlv_14= 'wait' ( (lv_time_15_0= ruleEInt ) ) ( (lv_unit_16_0= ruleTime_unit ) ) otherlv_17= 'then' )? ) | (otherlv_18= 'wait' ( (lv_time_19_0= ruleEInt ) ) ( (lv_unit_20_0= ruleTime_unit ) ) otherlv_21= 'then' ) ) otherlv_22= 'go' otherlv_23= 'to' otherlv_24= 'state' ( ( ruleEString ) ) )
            {
            // InternalArduinoML.g:1080:2: ( ( (otherlv_0= 'when' ( ( ( ( ruleEString ) ) otherlv_2= 'is' ( (lv_d_values_3_0= ruleSignal ) ) ) | ( ( ( ruleEString ) ) ( (lv_comp_5_0= ruleCompare ) ) ( (lv_a_values_6_0= ruleEInt ) ) ) ) (otherlv_7= 'and' ( ( ( ( ruleEString ) ) otherlv_9= 'is' ( (lv_d_values_10_0= ruleSignal ) ) ) | ( ( ( ruleEString ) ) ( (lv_comp_12_0= ruleCompare ) ) ( (lv_a_values_13_0= ruleEInt ) ) ) ) )* (otherlv_14= 'wait' ( (lv_time_15_0= ruleEInt ) ) ( (lv_unit_16_0= ruleTime_unit ) ) otherlv_17= 'then' )? ) | (otherlv_18= 'wait' ( (lv_time_19_0= ruleEInt ) ) ( (lv_unit_20_0= ruleTime_unit ) ) otherlv_21= 'then' ) ) otherlv_22= 'go' otherlv_23= 'to' otherlv_24= 'state' ( ( ruleEString ) ) )
            // InternalArduinoML.g:1081:3: ( (otherlv_0= 'when' ( ( ( ( ruleEString ) ) otherlv_2= 'is' ( (lv_d_values_3_0= ruleSignal ) ) ) | ( ( ( ruleEString ) ) ( (lv_comp_5_0= ruleCompare ) ) ( (lv_a_values_6_0= ruleEInt ) ) ) ) (otherlv_7= 'and' ( ( ( ( ruleEString ) ) otherlv_9= 'is' ( (lv_d_values_10_0= ruleSignal ) ) ) | ( ( ( ruleEString ) ) ( (lv_comp_12_0= ruleCompare ) ) ( (lv_a_values_13_0= ruleEInt ) ) ) ) )* (otherlv_14= 'wait' ( (lv_time_15_0= ruleEInt ) ) ( (lv_unit_16_0= ruleTime_unit ) ) otherlv_17= 'then' )? ) | (otherlv_18= 'wait' ( (lv_time_19_0= ruleEInt ) ) ( (lv_unit_20_0= ruleTime_unit ) ) otherlv_21= 'then' ) ) otherlv_22= 'go' otherlv_23= 'to' otherlv_24= 'state' ( ( ruleEString ) )
            {
            // InternalArduinoML.g:1081:3: ( (otherlv_0= 'when' ( ( ( ( ruleEString ) ) otherlv_2= 'is' ( (lv_d_values_3_0= ruleSignal ) ) ) | ( ( ( ruleEString ) ) ( (lv_comp_5_0= ruleCompare ) ) ( (lv_a_values_6_0= ruleEInt ) ) ) ) (otherlv_7= 'and' ( ( ( ( ruleEString ) ) otherlv_9= 'is' ( (lv_d_values_10_0= ruleSignal ) ) ) | ( ( ( ruleEString ) ) ( (lv_comp_12_0= ruleCompare ) ) ( (lv_a_values_13_0= ruleEInt ) ) ) ) )* (otherlv_14= 'wait' ( (lv_time_15_0= ruleEInt ) ) ( (lv_unit_16_0= ruleTime_unit ) ) otherlv_17= 'then' )? ) | (otherlv_18= 'wait' ( (lv_time_19_0= ruleEInt ) ) ( (lv_unit_20_0= ruleTime_unit ) ) otherlv_21= 'then' ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==25) ) {
                alt18=1;
            }
            else if ( (LA18_0==28) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalArduinoML.g:1082:4: (otherlv_0= 'when' ( ( ( ( ruleEString ) ) otherlv_2= 'is' ( (lv_d_values_3_0= ruleSignal ) ) ) | ( ( ( ruleEString ) ) ( (lv_comp_5_0= ruleCompare ) ) ( (lv_a_values_6_0= ruleEInt ) ) ) ) (otherlv_7= 'and' ( ( ( ( ruleEString ) ) otherlv_9= 'is' ( (lv_d_values_10_0= ruleSignal ) ) ) | ( ( ( ruleEString ) ) ( (lv_comp_12_0= ruleCompare ) ) ( (lv_a_values_13_0= ruleEInt ) ) ) ) )* (otherlv_14= 'wait' ( (lv_time_15_0= ruleEInt ) ) ( (lv_unit_16_0= ruleTime_unit ) ) otherlv_17= 'then' )? )
                    {
                    // InternalArduinoML.g:1082:4: (otherlv_0= 'when' ( ( ( ( ruleEString ) ) otherlv_2= 'is' ( (lv_d_values_3_0= ruleSignal ) ) ) | ( ( ( ruleEString ) ) ( (lv_comp_5_0= ruleCompare ) ) ( (lv_a_values_6_0= ruleEInt ) ) ) ) (otherlv_7= 'and' ( ( ( ( ruleEString ) ) otherlv_9= 'is' ( (lv_d_values_10_0= ruleSignal ) ) ) | ( ( ( ruleEString ) ) ( (lv_comp_12_0= ruleCompare ) ) ( (lv_a_values_13_0= ruleEInt ) ) ) ) )* (otherlv_14= 'wait' ( (lv_time_15_0= ruleEInt ) ) ( (lv_unit_16_0= ruleTime_unit ) ) otherlv_17= 'then' )? )
                    // InternalArduinoML.g:1083:5: otherlv_0= 'when' ( ( ( ( ruleEString ) ) otherlv_2= 'is' ( (lv_d_values_3_0= ruleSignal ) ) ) | ( ( ( ruleEString ) ) ( (lv_comp_5_0= ruleCompare ) ) ( (lv_a_values_6_0= ruleEInt ) ) ) ) (otherlv_7= 'and' ( ( ( ( ruleEString ) ) otherlv_9= 'is' ( (lv_d_values_10_0= ruleSignal ) ) ) | ( ( ( ruleEString ) ) ( (lv_comp_12_0= ruleCompare ) ) ( (lv_a_values_13_0= ruleEInt ) ) ) ) )* (otherlv_14= 'wait' ( (lv_time_15_0= ruleEInt ) ) ( (lv_unit_16_0= ruleTime_unit ) ) otherlv_17= 'then' )?
                    {
                    otherlv_0=(Token)match(input,25,FOLLOW_3); 

                    					newLeafNode(otherlv_0, grammarAccess.getTransitionStateAccess().getWhenKeyword_0_0_0());
                    				
                    // InternalArduinoML.g:1087:5: ( ( ( ( ruleEString ) ) otherlv_2= 'is' ( (lv_d_values_3_0= ruleSignal ) ) ) | ( ( ( ruleEString ) ) ( (lv_comp_5_0= ruleCompare ) ) ( (lv_a_values_6_0= ruleEInt ) ) ) )
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==RULE_STRING) ) {
                        int LA14_1 = input.LA(2);

                        if ( ((LA14_1>=36 && LA14_1<=40)) ) {
                            alt14=2;
                        }
                        else if ( (LA14_1==26) ) {
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

                        if ( (LA14_2==26) ) {
                            alt14=1;
                        }
                        else if ( ((LA14_2>=36 && LA14_2<=40)) ) {
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
                            // InternalArduinoML.g:1088:6: ( ( ( ruleEString ) ) otherlv_2= 'is' ( (lv_d_values_3_0= ruleSignal ) ) )
                            {
                            // InternalArduinoML.g:1088:6: ( ( ( ruleEString ) ) otherlv_2= 'is' ( (lv_d_values_3_0= ruleSignal ) ) )
                            // InternalArduinoML.g:1089:7: ( ( ruleEString ) ) otherlv_2= 'is' ( (lv_d_values_3_0= ruleSignal ) )
                            {
                            // InternalArduinoML.g:1089:7: ( ( ruleEString ) )
                            // InternalArduinoML.g:1090:8: ( ruleEString )
                            {
                            // InternalArduinoML.g:1090:8: ( ruleEString )
                            // InternalArduinoML.g:1091:9: ruleEString
                            {

                            									if (current==null) {
                            										current = createModelElement(grammarAccess.getTransitionStateRule());
                            									}
                            								

                            									newCompositeNode(grammarAccess.getTransitionStateAccess().getDigitalsDigitalCrossReference_0_0_1_0_0_0());
                            								
                            pushFollow(FOLLOW_23);
                            ruleEString();

                            state._fsp--;


                            									afterParserOrEnumRuleCall();
                            								

                            }


                            }

                            otherlv_2=(Token)match(input,26,FOLLOW_22); 

                            							newLeafNode(otherlv_2, grammarAccess.getTransitionStateAccess().getIsKeyword_0_0_1_0_1());
                            						
                            // InternalArduinoML.g:1109:7: ( (lv_d_values_3_0= ruleSignal ) )
                            // InternalArduinoML.g:1110:8: (lv_d_values_3_0= ruleSignal )
                            {
                            // InternalArduinoML.g:1110:8: (lv_d_values_3_0= ruleSignal )
                            // InternalArduinoML.g:1111:9: lv_d_values_3_0= ruleSignal
                            {

                            									newCompositeNode(grammarAccess.getTransitionStateAccess().getD_valuesSignalEnumRuleCall_0_0_1_0_2_0());
                            								
                            pushFollow(FOLLOW_24);
                            lv_d_values_3_0=ruleSignal();

                            state._fsp--;


                            									if (current==null) {
                            										current = createModelElementForParent(grammarAccess.getTransitionStateRule());
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
                            // InternalArduinoML.g:1130:6: ( ( ( ruleEString ) ) ( (lv_comp_5_0= ruleCompare ) ) ( (lv_a_values_6_0= ruleEInt ) ) )
                            {
                            // InternalArduinoML.g:1130:6: ( ( ( ruleEString ) ) ( (lv_comp_5_0= ruleCompare ) ) ( (lv_a_values_6_0= ruleEInt ) ) )
                            // InternalArduinoML.g:1131:7: ( ( ruleEString ) ) ( (lv_comp_5_0= ruleCompare ) ) ( (lv_a_values_6_0= ruleEInt ) )
                            {
                            // InternalArduinoML.g:1131:7: ( ( ruleEString ) )
                            // InternalArduinoML.g:1132:8: ( ruleEString )
                            {
                            // InternalArduinoML.g:1132:8: ( ruleEString )
                            // InternalArduinoML.g:1133:9: ruleEString
                            {

                            									if (current==null) {
                            										current = createModelElement(grammarAccess.getTransitionStateRule());
                            									}
                            								

                            									newCompositeNode(grammarAccess.getTransitionStateAccess().getAnalogsAnalogCrossReference_0_0_1_1_0_0());
                            								
                            pushFollow(FOLLOW_25);
                            ruleEString();

                            state._fsp--;


                            									afterParserOrEnumRuleCall();
                            								

                            }


                            }

                            // InternalArduinoML.g:1147:7: ( (lv_comp_5_0= ruleCompare ) )
                            // InternalArduinoML.g:1148:8: (lv_comp_5_0= ruleCompare )
                            {
                            // InternalArduinoML.g:1148:8: (lv_comp_5_0= ruleCompare )
                            // InternalArduinoML.g:1149:9: lv_comp_5_0= ruleCompare
                            {

                            									newCompositeNode(grammarAccess.getTransitionStateAccess().getCompCompareEnumRuleCall_0_0_1_1_1_0());
                            								
                            pushFollow(FOLLOW_13);
                            lv_comp_5_0=ruleCompare();

                            state._fsp--;


                            									if (current==null) {
                            										current = createModelElementForParent(grammarAccess.getTransitionStateRule());
                            									}
                            									add(
                            										current,
                            										"comp",
                            										lv_comp_5_0,
                            										"arduinoML.concretesyntax.ArduinoML.Compare");
                            									afterParserOrEnumRuleCall();
                            								

                            }


                            }

                            // InternalArduinoML.g:1166:7: ( (lv_a_values_6_0= ruleEInt ) )
                            // InternalArduinoML.g:1167:8: (lv_a_values_6_0= ruleEInt )
                            {
                            // InternalArduinoML.g:1167:8: (lv_a_values_6_0= ruleEInt )
                            // InternalArduinoML.g:1168:9: lv_a_values_6_0= ruleEInt
                            {

                            									newCompositeNode(grammarAccess.getTransitionStateAccess().getA_valuesEIntParserRuleCall_0_0_1_1_2_0());
                            								
                            pushFollow(FOLLOW_24);
                            lv_a_values_6_0=ruleEInt();

                            state._fsp--;


                            									if (current==null) {
                            										current = createModelElementForParent(grammarAccess.getTransitionStateRule());
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

                    // InternalArduinoML.g:1187:5: (otherlv_7= 'and' ( ( ( ( ruleEString ) ) otherlv_9= 'is' ( (lv_d_values_10_0= ruleSignal ) ) ) | ( ( ( ruleEString ) ) ( (lv_comp_12_0= ruleCompare ) ) ( (lv_a_values_13_0= ruleEInt ) ) ) ) )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==27) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // InternalArduinoML.g:1188:6: otherlv_7= 'and' ( ( ( ( ruleEString ) ) otherlv_9= 'is' ( (lv_d_values_10_0= ruleSignal ) ) ) | ( ( ( ruleEString ) ) ( (lv_comp_12_0= ruleCompare ) ) ( (lv_a_values_13_0= ruleEInt ) ) ) )
                    	    {
                    	    otherlv_7=(Token)match(input,27,FOLLOW_3); 

                    	    						newLeafNode(otherlv_7, grammarAccess.getTransitionStateAccess().getAndKeyword_0_0_2_0());
                    	    					
                    	    // InternalArduinoML.g:1192:6: ( ( ( ( ruleEString ) ) otherlv_9= 'is' ( (lv_d_values_10_0= ruleSignal ) ) ) | ( ( ( ruleEString ) ) ( (lv_comp_12_0= ruleCompare ) ) ( (lv_a_values_13_0= ruleEInt ) ) ) )
                    	    int alt15=2;
                    	    int LA15_0 = input.LA(1);

                    	    if ( (LA15_0==RULE_STRING) ) {
                    	        int LA15_1 = input.LA(2);

                    	        if ( ((LA15_1>=36 && LA15_1<=40)) ) {
                    	            alt15=2;
                    	        }
                    	        else if ( (LA15_1==26) ) {
                    	            alt15=1;
                    	        }
                    	        else {
                    	            NoViableAltException nvae =
                    	                new NoViableAltException("", 15, 1, input);

                    	            throw nvae;
                    	        }
                    	    }
                    	    else if ( (LA15_0==RULE_ID) ) {
                    	        int LA15_2 = input.LA(2);

                    	        if ( ((LA15_2>=36 && LA15_2<=40)) ) {
                    	            alt15=2;
                    	        }
                    	        else if ( (LA15_2==26) ) {
                    	            alt15=1;
                    	        }
                    	        else {
                    	            NoViableAltException nvae =
                    	                new NoViableAltException("", 15, 2, input);

                    	            throw nvae;
                    	        }
                    	    }
                    	    else {
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 15, 0, input);

                    	        throw nvae;
                    	    }
                    	    switch (alt15) {
                    	        case 1 :
                    	            // InternalArduinoML.g:1193:7: ( ( ( ruleEString ) ) otherlv_9= 'is' ( (lv_d_values_10_0= ruleSignal ) ) )
                    	            {
                    	            // InternalArduinoML.g:1193:7: ( ( ( ruleEString ) ) otherlv_9= 'is' ( (lv_d_values_10_0= ruleSignal ) ) )
                    	            // InternalArduinoML.g:1194:8: ( ( ruleEString ) ) otherlv_9= 'is' ( (lv_d_values_10_0= ruleSignal ) )
                    	            {
                    	            // InternalArduinoML.g:1194:8: ( ( ruleEString ) )
                    	            // InternalArduinoML.g:1195:9: ( ruleEString )
                    	            {
                    	            // InternalArduinoML.g:1195:9: ( ruleEString )
                    	            // InternalArduinoML.g:1196:10: ruleEString
                    	            {

                    	            										if (current==null) {
                    	            											current = createModelElement(grammarAccess.getTransitionStateRule());
                    	            										}
                    	            									

                    	            										newCompositeNode(grammarAccess.getTransitionStateAccess().getDigitalsDigitalCrossReference_0_0_2_1_0_0_0());
                    	            									
                    	            pushFollow(FOLLOW_23);
                    	            ruleEString();

                    	            state._fsp--;


                    	            										afterParserOrEnumRuleCall();
                    	            									

                    	            }


                    	            }

                    	            otherlv_9=(Token)match(input,26,FOLLOW_22); 

                    	            								newLeafNode(otherlv_9, grammarAccess.getTransitionStateAccess().getIsKeyword_0_0_2_1_0_1());
                    	            							
                    	            // InternalArduinoML.g:1214:8: ( (lv_d_values_10_0= ruleSignal ) )
                    	            // InternalArduinoML.g:1215:9: (lv_d_values_10_0= ruleSignal )
                    	            {
                    	            // InternalArduinoML.g:1215:9: (lv_d_values_10_0= ruleSignal )
                    	            // InternalArduinoML.g:1216:10: lv_d_values_10_0= ruleSignal
                    	            {

                    	            										newCompositeNode(grammarAccess.getTransitionStateAccess().getD_valuesSignalEnumRuleCall_0_0_2_1_0_2_0());
                    	            									
                    	            pushFollow(FOLLOW_24);
                    	            lv_d_values_10_0=ruleSignal();

                    	            state._fsp--;


                    	            										if (current==null) {
                    	            											current = createModelElementForParent(grammarAccess.getTransitionStateRule());
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
                    	            // InternalArduinoML.g:1235:7: ( ( ( ruleEString ) ) ( (lv_comp_12_0= ruleCompare ) ) ( (lv_a_values_13_0= ruleEInt ) ) )
                    	            {
                    	            // InternalArduinoML.g:1235:7: ( ( ( ruleEString ) ) ( (lv_comp_12_0= ruleCompare ) ) ( (lv_a_values_13_0= ruleEInt ) ) )
                    	            // InternalArduinoML.g:1236:8: ( ( ruleEString ) ) ( (lv_comp_12_0= ruleCompare ) ) ( (lv_a_values_13_0= ruleEInt ) )
                    	            {
                    	            // InternalArduinoML.g:1236:8: ( ( ruleEString ) )
                    	            // InternalArduinoML.g:1237:9: ( ruleEString )
                    	            {
                    	            // InternalArduinoML.g:1237:9: ( ruleEString )
                    	            // InternalArduinoML.g:1238:10: ruleEString
                    	            {

                    	            										if (current==null) {
                    	            											current = createModelElement(grammarAccess.getTransitionStateRule());
                    	            										}
                    	            									

                    	            										newCompositeNode(grammarAccess.getTransitionStateAccess().getAnalogsAnalogCrossReference_0_0_2_1_1_0_0());
                    	            									
                    	            pushFollow(FOLLOW_25);
                    	            ruleEString();

                    	            state._fsp--;


                    	            										afterParserOrEnumRuleCall();
                    	            									

                    	            }


                    	            }

                    	            // InternalArduinoML.g:1252:8: ( (lv_comp_12_0= ruleCompare ) )
                    	            // InternalArduinoML.g:1253:9: (lv_comp_12_0= ruleCompare )
                    	            {
                    	            // InternalArduinoML.g:1253:9: (lv_comp_12_0= ruleCompare )
                    	            // InternalArduinoML.g:1254:10: lv_comp_12_0= ruleCompare
                    	            {

                    	            										newCompositeNode(grammarAccess.getTransitionStateAccess().getCompCompareEnumRuleCall_0_0_2_1_1_1_0());
                    	            									
                    	            pushFollow(FOLLOW_13);
                    	            lv_comp_12_0=ruleCompare();

                    	            state._fsp--;


                    	            										if (current==null) {
                    	            											current = createModelElementForParent(grammarAccess.getTransitionStateRule());
                    	            										}
                    	            										add(
                    	            											current,
                    	            											"comp",
                    	            											lv_comp_12_0,
                    	            											"arduinoML.concretesyntax.ArduinoML.Compare");
                    	            										afterParserOrEnumRuleCall();
                    	            									

                    	            }


                    	            }

                    	            // InternalArduinoML.g:1271:8: ( (lv_a_values_13_0= ruleEInt ) )
                    	            // InternalArduinoML.g:1272:9: (lv_a_values_13_0= ruleEInt )
                    	            {
                    	            // InternalArduinoML.g:1272:9: (lv_a_values_13_0= ruleEInt )
                    	            // InternalArduinoML.g:1273:10: lv_a_values_13_0= ruleEInt
                    	            {

                    	            										newCompositeNode(grammarAccess.getTransitionStateAccess().getA_valuesEIntParserRuleCall_0_0_2_1_1_2_0());
                    	            									
                    	            pushFollow(FOLLOW_24);
                    	            lv_a_values_13_0=ruleEInt();

                    	            state._fsp--;


                    	            										if (current==null) {
                    	            											current = createModelElementForParent(grammarAccess.getTransitionStateRule());
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
                    	    break loop16;
                        }
                    } while (true);

                    // InternalArduinoML.g:1293:5: (otherlv_14= 'wait' ( (lv_time_15_0= ruleEInt ) ) ( (lv_unit_16_0= ruleTime_unit ) ) otherlv_17= 'then' )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==28) ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // InternalArduinoML.g:1294:6: otherlv_14= 'wait' ( (lv_time_15_0= ruleEInt ) ) ( (lv_unit_16_0= ruleTime_unit ) ) otherlv_17= 'then'
                            {
                            otherlv_14=(Token)match(input,28,FOLLOW_13); 

                            						newLeafNode(otherlv_14, grammarAccess.getTransitionStateAccess().getWaitKeyword_0_0_3_0());
                            					
                            // InternalArduinoML.g:1298:6: ( (lv_time_15_0= ruleEInt ) )
                            // InternalArduinoML.g:1299:7: (lv_time_15_0= ruleEInt )
                            {
                            // InternalArduinoML.g:1299:7: (lv_time_15_0= ruleEInt )
                            // InternalArduinoML.g:1300:8: lv_time_15_0= ruleEInt
                            {

                            								newCompositeNode(grammarAccess.getTransitionStateAccess().getTimeEIntParserRuleCall_0_0_3_1_0());
                            							
                            pushFollow(FOLLOW_26);
                            lv_time_15_0=ruleEInt();

                            state._fsp--;


                            								if (current==null) {
                            									current = createModelElementForParent(grammarAccess.getTransitionStateRule());
                            								}
                            								set(
                            									current,
                            									"time",
                            									lv_time_15_0,
                            									"arduinoML.concretesyntax.ArduinoML.EInt");
                            								afterParserOrEnumRuleCall();
                            							

                            }


                            }

                            // InternalArduinoML.g:1317:6: ( (lv_unit_16_0= ruleTime_unit ) )
                            // InternalArduinoML.g:1318:7: (lv_unit_16_0= ruleTime_unit )
                            {
                            // InternalArduinoML.g:1318:7: (lv_unit_16_0= ruleTime_unit )
                            // InternalArduinoML.g:1319:8: lv_unit_16_0= ruleTime_unit
                            {

                            								newCompositeNode(grammarAccess.getTransitionStateAccess().getUnitTime_unitEnumRuleCall_0_0_3_2_0());
                            							
                            pushFollow(FOLLOW_27);
                            lv_unit_16_0=ruleTime_unit();

                            state._fsp--;


                            								if (current==null) {
                            									current = createModelElementForParent(grammarAccess.getTransitionStateRule());
                            								}
                            								set(
                            									current,
                            									"unit",
                            									lv_unit_16_0,
                            									"arduinoML.concretesyntax.ArduinoML.Time_unit");
                            								afterParserOrEnumRuleCall();
                            							

                            }


                            }

                            otherlv_17=(Token)match(input,29,FOLLOW_28); 

                            						newLeafNode(otherlv_17, grammarAccess.getTransitionStateAccess().getThenKeyword_0_0_3_3());
                            					

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalArduinoML.g:1343:4: (otherlv_18= 'wait' ( (lv_time_19_0= ruleEInt ) ) ( (lv_unit_20_0= ruleTime_unit ) ) otherlv_21= 'then' )
                    {
                    // InternalArduinoML.g:1343:4: (otherlv_18= 'wait' ( (lv_time_19_0= ruleEInt ) ) ( (lv_unit_20_0= ruleTime_unit ) ) otherlv_21= 'then' )
                    // InternalArduinoML.g:1344:5: otherlv_18= 'wait' ( (lv_time_19_0= ruleEInt ) ) ( (lv_unit_20_0= ruleTime_unit ) ) otherlv_21= 'then'
                    {
                    otherlv_18=(Token)match(input,28,FOLLOW_13); 

                    					newLeafNode(otherlv_18, grammarAccess.getTransitionStateAccess().getWaitKeyword_0_1_0());
                    				
                    // InternalArduinoML.g:1348:5: ( (lv_time_19_0= ruleEInt ) )
                    // InternalArduinoML.g:1349:6: (lv_time_19_0= ruleEInt )
                    {
                    // InternalArduinoML.g:1349:6: (lv_time_19_0= ruleEInt )
                    // InternalArduinoML.g:1350:7: lv_time_19_0= ruleEInt
                    {

                    							newCompositeNode(grammarAccess.getTransitionStateAccess().getTimeEIntParserRuleCall_0_1_1_0());
                    						
                    pushFollow(FOLLOW_26);
                    lv_time_19_0=ruleEInt();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getTransitionStateRule());
                    							}
                    							set(
                    								current,
                    								"time",
                    								lv_time_19_0,
                    								"arduinoML.concretesyntax.ArduinoML.EInt");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    // InternalArduinoML.g:1367:5: ( (lv_unit_20_0= ruleTime_unit ) )
                    // InternalArduinoML.g:1368:6: (lv_unit_20_0= ruleTime_unit )
                    {
                    // InternalArduinoML.g:1368:6: (lv_unit_20_0= ruleTime_unit )
                    // InternalArduinoML.g:1369:7: lv_unit_20_0= ruleTime_unit
                    {

                    							newCompositeNode(grammarAccess.getTransitionStateAccess().getUnitTime_unitEnumRuleCall_0_1_2_0());
                    						
                    pushFollow(FOLLOW_27);
                    lv_unit_20_0=ruleTime_unit();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getTransitionStateRule());
                    							}
                    							set(
                    								current,
                    								"unit",
                    								lv_unit_20_0,
                    								"arduinoML.concretesyntax.ArduinoML.Time_unit");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    otherlv_21=(Token)match(input,29,FOLLOW_28); 

                    					newLeafNode(otherlv_21, grammarAccess.getTransitionStateAccess().getThenKeyword_0_1_3());
                    				

                    }


                    }
                    break;

            }

            otherlv_22=(Token)match(input,30,FOLLOW_21); 

            			newLeafNode(otherlv_22, grammarAccess.getTransitionStateAccess().getGoKeyword_1());
            		
            otherlv_23=(Token)match(input,24,FOLLOW_5); 

            			newLeafNode(otherlv_23, grammarAccess.getTransitionStateAccess().getToKeyword_2());
            		
            otherlv_24=(Token)match(input,13,FOLLOW_3); 

            			newLeafNode(otherlv_24, grammarAccess.getTransitionStateAccess().getStateKeyword_3());
            		
            // InternalArduinoML.g:1404:3: ( ( ruleEString ) )
            // InternalArduinoML.g:1405:4: ( ruleEString )
            {
            // InternalArduinoML.g:1405:4: ( ruleEString )
            // InternalArduinoML.g:1406:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTransitionStateRule());
            					}
            				

            					newCompositeNode(grammarAccess.getTransitionStateAccess().getNext_stateStateCrossReference_4_0());
            				
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;


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
    // $ANTLR end "ruleTransitionState"


    // $ANTLR start "entryRuleTransitionMode"
    // InternalArduinoML.g:1424:1: entryRuleTransitionMode returns [EObject current=null] : iv_ruleTransitionMode= ruleTransitionMode EOF ;
    public final EObject entryRuleTransitionMode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransitionMode = null;


        try {
            // InternalArduinoML.g:1424:55: (iv_ruleTransitionMode= ruleTransitionMode EOF )
            // InternalArduinoML.g:1425:2: iv_ruleTransitionMode= ruleTransitionMode EOF
            {
             newCompositeNode(grammarAccess.getTransitionModeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTransitionMode=ruleTransitionMode();

            state._fsp--;

             current =iv_ruleTransitionMode; 
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
    // $ANTLR end "entryRuleTransitionMode"


    // $ANTLR start "ruleTransitionMode"
    // InternalArduinoML.g:1431:1: ruleTransitionMode returns [EObject current=null] : ( ( (otherlv_0= 'when' ( ( ( ( ruleEString ) ) otherlv_2= 'is' ( (lv_d_values_3_0= ruleSignal ) ) ) | ( ( ( ruleEString ) ) ( (lv_comp_5_0= ruleCompare ) ) ( (lv_a_values_6_0= ruleEInt ) ) ) ) (otherlv_7= 'and' ( ( ( ( ruleEString ) ) otherlv_9= 'is' ( (lv_d_values_10_0= ruleSignal ) ) ) | ( ( ( ruleEString ) ) ( (lv_comp_12_0= ruleCompare ) ) ( (lv_a_values_13_0= ruleEInt ) ) ) ) )* (otherlv_14= 'wait' ( (lv_time_15_0= ruleEInt ) ) ( (lv_unit_16_0= ruleTime_unit ) ) otherlv_17= 'then' )? ) | (otherlv_18= 'wait' ( (lv_time_19_0= ruleEInt ) ) ( (lv_unit_20_0= ruleTime_unit ) ) otherlv_21= 'then' ) ) otherlv_22= 'go' otherlv_23= 'to' otherlv_24= 'mode' ( ( ruleEString ) ) ) ;
    public final EObject ruleTransitionMode() throws RecognitionException {
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
            // InternalArduinoML.g:1437:2: ( ( ( (otherlv_0= 'when' ( ( ( ( ruleEString ) ) otherlv_2= 'is' ( (lv_d_values_3_0= ruleSignal ) ) ) | ( ( ( ruleEString ) ) ( (lv_comp_5_0= ruleCompare ) ) ( (lv_a_values_6_0= ruleEInt ) ) ) ) (otherlv_7= 'and' ( ( ( ( ruleEString ) ) otherlv_9= 'is' ( (lv_d_values_10_0= ruleSignal ) ) ) | ( ( ( ruleEString ) ) ( (lv_comp_12_0= ruleCompare ) ) ( (lv_a_values_13_0= ruleEInt ) ) ) ) )* (otherlv_14= 'wait' ( (lv_time_15_0= ruleEInt ) ) ( (lv_unit_16_0= ruleTime_unit ) ) otherlv_17= 'then' )? ) | (otherlv_18= 'wait' ( (lv_time_19_0= ruleEInt ) ) ( (lv_unit_20_0= ruleTime_unit ) ) otherlv_21= 'then' ) ) otherlv_22= 'go' otherlv_23= 'to' otherlv_24= 'mode' ( ( ruleEString ) ) ) )
            // InternalArduinoML.g:1438:2: ( ( (otherlv_0= 'when' ( ( ( ( ruleEString ) ) otherlv_2= 'is' ( (lv_d_values_3_0= ruleSignal ) ) ) | ( ( ( ruleEString ) ) ( (lv_comp_5_0= ruleCompare ) ) ( (lv_a_values_6_0= ruleEInt ) ) ) ) (otherlv_7= 'and' ( ( ( ( ruleEString ) ) otherlv_9= 'is' ( (lv_d_values_10_0= ruleSignal ) ) ) | ( ( ( ruleEString ) ) ( (lv_comp_12_0= ruleCompare ) ) ( (lv_a_values_13_0= ruleEInt ) ) ) ) )* (otherlv_14= 'wait' ( (lv_time_15_0= ruleEInt ) ) ( (lv_unit_16_0= ruleTime_unit ) ) otherlv_17= 'then' )? ) | (otherlv_18= 'wait' ( (lv_time_19_0= ruleEInt ) ) ( (lv_unit_20_0= ruleTime_unit ) ) otherlv_21= 'then' ) ) otherlv_22= 'go' otherlv_23= 'to' otherlv_24= 'mode' ( ( ruleEString ) ) )
            {
            // InternalArduinoML.g:1438:2: ( ( (otherlv_0= 'when' ( ( ( ( ruleEString ) ) otherlv_2= 'is' ( (lv_d_values_3_0= ruleSignal ) ) ) | ( ( ( ruleEString ) ) ( (lv_comp_5_0= ruleCompare ) ) ( (lv_a_values_6_0= ruleEInt ) ) ) ) (otherlv_7= 'and' ( ( ( ( ruleEString ) ) otherlv_9= 'is' ( (lv_d_values_10_0= ruleSignal ) ) ) | ( ( ( ruleEString ) ) ( (lv_comp_12_0= ruleCompare ) ) ( (lv_a_values_13_0= ruleEInt ) ) ) ) )* (otherlv_14= 'wait' ( (lv_time_15_0= ruleEInt ) ) ( (lv_unit_16_0= ruleTime_unit ) ) otherlv_17= 'then' )? ) | (otherlv_18= 'wait' ( (lv_time_19_0= ruleEInt ) ) ( (lv_unit_20_0= ruleTime_unit ) ) otherlv_21= 'then' ) ) otherlv_22= 'go' otherlv_23= 'to' otherlv_24= 'mode' ( ( ruleEString ) ) )
            // InternalArduinoML.g:1439:3: ( (otherlv_0= 'when' ( ( ( ( ruleEString ) ) otherlv_2= 'is' ( (lv_d_values_3_0= ruleSignal ) ) ) | ( ( ( ruleEString ) ) ( (lv_comp_5_0= ruleCompare ) ) ( (lv_a_values_6_0= ruleEInt ) ) ) ) (otherlv_7= 'and' ( ( ( ( ruleEString ) ) otherlv_9= 'is' ( (lv_d_values_10_0= ruleSignal ) ) ) | ( ( ( ruleEString ) ) ( (lv_comp_12_0= ruleCompare ) ) ( (lv_a_values_13_0= ruleEInt ) ) ) ) )* (otherlv_14= 'wait' ( (lv_time_15_0= ruleEInt ) ) ( (lv_unit_16_0= ruleTime_unit ) ) otherlv_17= 'then' )? ) | (otherlv_18= 'wait' ( (lv_time_19_0= ruleEInt ) ) ( (lv_unit_20_0= ruleTime_unit ) ) otherlv_21= 'then' ) ) otherlv_22= 'go' otherlv_23= 'to' otherlv_24= 'mode' ( ( ruleEString ) )
            {
            // InternalArduinoML.g:1439:3: ( (otherlv_0= 'when' ( ( ( ( ruleEString ) ) otherlv_2= 'is' ( (lv_d_values_3_0= ruleSignal ) ) ) | ( ( ( ruleEString ) ) ( (lv_comp_5_0= ruleCompare ) ) ( (lv_a_values_6_0= ruleEInt ) ) ) ) (otherlv_7= 'and' ( ( ( ( ruleEString ) ) otherlv_9= 'is' ( (lv_d_values_10_0= ruleSignal ) ) ) | ( ( ( ruleEString ) ) ( (lv_comp_12_0= ruleCompare ) ) ( (lv_a_values_13_0= ruleEInt ) ) ) ) )* (otherlv_14= 'wait' ( (lv_time_15_0= ruleEInt ) ) ( (lv_unit_16_0= ruleTime_unit ) ) otherlv_17= 'then' )? ) | (otherlv_18= 'wait' ( (lv_time_19_0= ruleEInt ) ) ( (lv_unit_20_0= ruleTime_unit ) ) otherlv_21= 'then' ) )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==25) ) {
                alt23=1;
            }
            else if ( (LA23_0==28) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // InternalArduinoML.g:1440:4: (otherlv_0= 'when' ( ( ( ( ruleEString ) ) otherlv_2= 'is' ( (lv_d_values_3_0= ruleSignal ) ) ) | ( ( ( ruleEString ) ) ( (lv_comp_5_0= ruleCompare ) ) ( (lv_a_values_6_0= ruleEInt ) ) ) ) (otherlv_7= 'and' ( ( ( ( ruleEString ) ) otherlv_9= 'is' ( (lv_d_values_10_0= ruleSignal ) ) ) | ( ( ( ruleEString ) ) ( (lv_comp_12_0= ruleCompare ) ) ( (lv_a_values_13_0= ruleEInt ) ) ) ) )* (otherlv_14= 'wait' ( (lv_time_15_0= ruleEInt ) ) ( (lv_unit_16_0= ruleTime_unit ) ) otherlv_17= 'then' )? )
                    {
                    // InternalArduinoML.g:1440:4: (otherlv_0= 'when' ( ( ( ( ruleEString ) ) otherlv_2= 'is' ( (lv_d_values_3_0= ruleSignal ) ) ) | ( ( ( ruleEString ) ) ( (lv_comp_5_0= ruleCompare ) ) ( (lv_a_values_6_0= ruleEInt ) ) ) ) (otherlv_7= 'and' ( ( ( ( ruleEString ) ) otherlv_9= 'is' ( (lv_d_values_10_0= ruleSignal ) ) ) | ( ( ( ruleEString ) ) ( (lv_comp_12_0= ruleCompare ) ) ( (lv_a_values_13_0= ruleEInt ) ) ) ) )* (otherlv_14= 'wait' ( (lv_time_15_0= ruleEInt ) ) ( (lv_unit_16_0= ruleTime_unit ) ) otherlv_17= 'then' )? )
                    // InternalArduinoML.g:1441:5: otherlv_0= 'when' ( ( ( ( ruleEString ) ) otherlv_2= 'is' ( (lv_d_values_3_0= ruleSignal ) ) ) | ( ( ( ruleEString ) ) ( (lv_comp_5_0= ruleCompare ) ) ( (lv_a_values_6_0= ruleEInt ) ) ) ) (otherlv_7= 'and' ( ( ( ( ruleEString ) ) otherlv_9= 'is' ( (lv_d_values_10_0= ruleSignal ) ) ) | ( ( ( ruleEString ) ) ( (lv_comp_12_0= ruleCompare ) ) ( (lv_a_values_13_0= ruleEInt ) ) ) ) )* (otherlv_14= 'wait' ( (lv_time_15_0= ruleEInt ) ) ( (lv_unit_16_0= ruleTime_unit ) ) otherlv_17= 'then' )?
                    {
                    otherlv_0=(Token)match(input,25,FOLLOW_3); 

                    					newLeafNode(otherlv_0, grammarAccess.getTransitionModeAccess().getWhenKeyword_0_0_0());
                    				
                    // InternalArduinoML.g:1445:5: ( ( ( ( ruleEString ) ) otherlv_2= 'is' ( (lv_d_values_3_0= ruleSignal ) ) ) | ( ( ( ruleEString ) ) ( (lv_comp_5_0= ruleCompare ) ) ( (lv_a_values_6_0= ruleEInt ) ) ) )
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==RULE_STRING) ) {
                        int LA19_1 = input.LA(2);

                        if ( ((LA19_1>=36 && LA19_1<=40)) ) {
                            alt19=2;
                        }
                        else if ( (LA19_1==26) ) {
                            alt19=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 19, 1, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA19_0==RULE_ID) ) {
                        int LA19_2 = input.LA(2);

                        if ( ((LA19_2>=36 && LA19_2<=40)) ) {
                            alt19=2;
                        }
                        else if ( (LA19_2==26) ) {
                            alt19=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 19, 2, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 19, 0, input);

                        throw nvae;
                    }
                    switch (alt19) {
                        case 1 :
                            // InternalArduinoML.g:1446:6: ( ( ( ruleEString ) ) otherlv_2= 'is' ( (lv_d_values_3_0= ruleSignal ) ) )
                            {
                            // InternalArduinoML.g:1446:6: ( ( ( ruleEString ) ) otherlv_2= 'is' ( (lv_d_values_3_0= ruleSignal ) ) )
                            // InternalArduinoML.g:1447:7: ( ( ruleEString ) ) otherlv_2= 'is' ( (lv_d_values_3_0= ruleSignal ) )
                            {
                            // InternalArduinoML.g:1447:7: ( ( ruleEString ) )
                            // InternalArduinoML.g:1448:8: ( ruleEString )
                            {
                            // InternalArduinoML.g:1448:8: ( ruleEString )
                            // InternalArduinoML.g:1449:9: ruleEString
                            {

                            									if (current==null) {
                            										current = createModelElement(grammarAccess.getTransitionModeRule());
                            									}
                            								

                            									newCompositeNode(grammarAccess.getTransitionModeAccess().getDigitalsDigitalCrossReference_0_0_1_0_0_0());
                            								
                            pushFollow(FOLLOW_23);
                            ruleEString();

                            state._fsp--;


                            									afterParserOrEnumRuleCall();
                            								

                            }


                            }

                            otherlv_2=(Token)match(input,26,FOLLOW_22); 

                            							newLeafNode(otherlv_2, grammarAccess.getTransitionModeAccess().getIsKeyword_0_0_1_0_1());
                            						
                            // InternalArduinoML.g:1467:7: ( (lv_d_values_3_0= ruleSignal ) )
                            // InternalArduinoML.g:1468:8: (lv_d_values_3_0= ruleSignal )
                            {
                            // InternalArduinoML.g:1468:8: (lv_d_values_3_0= ruleSignal )
                            // InternalArduinoML.g:1469:9: lv_d_values_3_0= ruleSignal
                            {

                            									newCompositeNode(grammarAccess.getTransitionModeAccess().getD_valuesSignalEnumRuleCall_0_0_1_0_2_0());
                            								
                            pushFollow(FOLLOW_24);
                            lv_d_values_3_0=ruleSignal();

                            state._fsp--;


                            									if (current==null) {
                            										current = createModelElementForParent(grammarAccess.getTransitionModeRule());
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
                            // InternalArduinoML.g:1488:6: ( ( ( ruleEString ) ) ( (lv_comp_5_0= ruleCompare ) ) ( (lv_a_values_6_0= ruleEInt ) ) )
                            {
                            // InternalArduinoML.g:1488:6: ( ( ( ruleEString ) ) ( (lv_comp_5_0= ruleCompare ) ) ( (lv_a_values_6_0= ruleEInt ) ) )
                            // InternalArduinoML.g:1489:7: ( ( ruleEString ) ) ( (lv_comp_5_0= ruleCompare ) ) ( (lv_a_values_6_0= ruleEInt ) )
                            {
                            // InternalArduinoML.g:1489:7: ( ( ruleEString ) )
                            // InternalArduinoML.g:1490:8: ( ruleEString )
                            {
                            // InternalArduinoML.g:1490:8: ( ruleEString )
                            // InternalArduinoML.g:1491:9: ruleEString
                            {

                            									if (current==null) {
                            										current = createModelElement(grammarAccess.getTransitionModeRule());
                            									}
                            								

                            									newCompositeNode(grammarAccess.getTransitionModeAccess().getAnalogsAnalogCrossReference_0_0_1_1_0_0());
                            								
                            pushFollow(FOLLOW_25);
                            ruleEString();

                            state._fsp--;


                            									afterParserOrEnumRuleCall();
                            								

                            }


                            }

                            // InternalArduinoML.g:1505:7: ( (lv_comp_5_0= ruleCompare ) )
                            // InternalArduinoML.g:1506:8: (lv_comp_5_0= ruleCompare )
                            {
                            // InternalArduinoML.g:1506:8: (lv_comp_5_0= ruleCompare )
                            // InternalArduinoML.g:1507:9: lv_comp_5_0= ruleCompare
                            {

                            									newCompositeNode(grammarAccess.getTransitionModeAccess().getCompCompareEnumRuleCall_0_0_1_1_1_0());
                            								
                            pushFollow(FOLLOW_13);
                            lv_comp_5_0=ruleCompare();

                            state._fsp--;


                            									if (current==null) {
                            										current = createModelElementForParent(grammarAccess.getTransitionModeRule());
                            									}
                            									add(
                            										current,
                            										"comp",
                            										lv_comp_5_0,
                            										"arduinoML.concretesyntax.ArduinoML.Compare");
                            									afterParserOrEnumRuleCall();
                            								

                            }


                            }

                            // InternalArduinoML.g:1524:7: ( (lv_a_values_6_0= ruleEInt ) )
                            // InternalArduinoML.g:1525:8: (lv_a_values_6_0= ruleEInt )
                            {
                            // InternalArduinoML.g:1525:8: (lv_a_values_6_0= ruleEInt )
                            // InternalArduinoML.g:1526:9: lv_a_values_6_0= ruleEInt
                            {

                            									newCompositeNode(grammarAccess.getTransitionModeAccess().getA_valuesEIntParserRuleCall_0_0_1_1_2_0());
                            								
                            pushFollow(FOLLOW_24);
                            lv_a_values_6_0=ruleEInt();

                            state._fsp--;


                            									if (current==null) {
                            										current = createModelElementForParent(grammarAccess.getTransitionModeRule());
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

                    // InternalArduinoML.g:1545:5: (otherlv_7= 'and' ( ( ( ( ruleEString ) ) otherlv_9= 'is' ( (lv_d_values_10_0= ruleSignal ) ) ) | ( ( ( ruleEString ) ) ( (lv_comp_12_0= ruleCompare ) ) ( (lv_a_values_13_0= ruleEInt ) ) ) ) )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==27) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // InternalArduinoML.g:1546:6: otherlv_7= 'and' ( ( ( ( ruleEString ) ) otherlv_9= 'is' ( (lv_d_values_10_0= ruleSignal ) ) ) | ( ( ( ruleEString ) ) ( (lv_comp_12_0= ruleCompare ) ) ( (lv_a_values_13_0= ruleEInt ) ) ) )
                    	    {
                    	    otherlv_7=(Token)match(input,27,FOLLOW_3); 

                    	    						newLeafNode(otherlv_7, grammarAccess.getTransitionModeAccess().getAndKeyword_0_0_2_0());
                    	    					
                    	    // InternalArduinoML.g:1550:6: ( ( ( ( ruleEString ) ) otherlv_9= 'is' ( (lv_d_values_10_0= ruleSignal ) ) ) | ( ( ( ruleEString ) ) ( (lv_comp_12_0= ruleCompare ) ) ( (lv_a_values_13_0= ruleEInt ) ) ) )
                    	    int alt20=2;
                    	    int LA20_0 = input.LA(1);

                    	    if ( (LA20_0==RULE_STRING) ) {
                    	        int LA20_1 = input.LA(2);

                    	        if ( (LA20_1==26) ) {
                    	            alt20=1;
                    	        }
                    	        else if ( ((LA20_1>=36 && LA20_1<=40)) ) {
                    	            alt20=2;
                    	        }
                    	        else {
                    	            NoViableAltException nvae =
                    	                new NoViableAltException("", 20, 1, input);

                    	            throw nvae;
                    	        }
                    	    }
                    	    else if ( (LA20_0==RULE_ID) ) {
                    	        int LA20_2 = input.LA(2);

                    	        if ( ((LA20_2>=36 && LA20_2<=40)) ) {
                    	            alt20=2;
                    	        }
                    	        else if ( (LA20_2==26) ) {
                    	            alt20=1;
                    	        }
                    	        else {
                    	            NoViableAltException nvae =
                    	                new NoViableAltException("", 20, 2, input);

                    	            throw nvae;
                    	        }
                    	    }
                    	    else {
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 20, 0, input);

                    	        throw nvae;
                    	    }
                    	    switch (alt20) {
                    	        case 1 :
                    	            // InternalArduinoML.g:1551:7: ( ( ( ruleEString ) ) otherlv_9= 'is' ( (lv_d_values_10_0= ruleSignal ) ) )
                    	            {
                    	            // InternalArduinoML.g:1551:7: ( ( ( ruleEString ) ) otherlv_9= 'is' ( (lv_d_values_10_0= ruleSignal ) ) )
                    	            // InternalArduinoML.g:1552:8: ( ( ruleEString ) ) otherlv_9= 'is' ( (lv_d_values_10_0= ruleSignal ) )
                    	            {
                    	            // InternalArduinoML.g:1552:8: ( ( ruleEString ) )
                    	            // InternalArduinoML.g:1553:9: ( ruleEString )
                    	            {
                    	            // InternalArduinoML.g:1553:9: ( ruleEString )
                    	            // InternalArduinoML.g:1554:10: ruleEString
                    	            {

                    	            										if (current==null) {
                    	            											current = createModelElement(grammarAccess.getTransitionModeRule());
                    	            										}
                    	            									

                    	            										newCompositeNode(grammarAccess.getTransitionModeAccess().getDigitalsDigitalCrossReference_0_0_2_1_0_0_0());
                    	            									
                    	            pushFollow(FOLLOW_23);
                    	            ruleEString();

                    	            state._fsp--;


                    	            										afterParserOrEnumRuleCall();
                    	            									

                    	            }


                    	            }

                    	            otherlv_9=(Token)match(input,26,FOLLOW_22); 

                    	            								newLeafNode(otherlv_9, grammarAccess.getTransitionModeAccess().getIsKeyword_0_0_2_1_0_1());
                    	            							
                    	            // InternalArduinoML.g:1572:8: ( (lv_d_values_10_0= ruleSignal ) )
                    	            // InternalArduinoML.g:1573:9: (lv_d_values_10_0= ruleSignal )
                    	            {
                    	            // InternalArduinoML.g:1573:9: (lv_d_values_10_0= ruleSignal )
                    	            // InternalArduinoML.g:1574:10: lv_d_values_10_0= ruleSignal
                    	            {

                    	            										newCompositeNode(grammarAccess.getTransitionModeAccess().getD_valuesSignalEnumRuleCall_0_0_2_1_0_2_0());
                    	            									
                    	            pushFollow(FOLLOW_24);
                    	            lv_d_values_10_0=ruleSignal();

                    	            state._fsp--;


                    	            										if (current==null) {
                    	            											current = createModelElementForParent(grammarAccess.getTransitionModeRule());
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
                    	            // InternalArduinoML.g:1593:7: ( ( ( ruleEString ) ) ( (lv_comp_12_0= ruleCompare ) ) ( (lv_a_values_13_0= ruleEInt ) ) )
                    	            {
                    	            // InternalArduinoML.g:1593:7: ( ( ( ruleEString ) ) ( (lv_comp_12_0= ruleCompare ) ) ( (lv_a_values_13_0= ruleEInt ) ) )
                    	            // InternalArduinoML.g:1594:8: ( ( ruleEString ) ) ( (lv_comp_12_0= ruleCompare ) ) ( (lv_a_values_13_0= ruleEInt ) )
                    	            {
                    	            // InternalArduinoML.g:1594:8: ( ( ruleEString ) )
                    	            // InternalArduinoML.g:1595:9: ( ruleEString )
                    	            {
                    	            // InternalArduinoML.g:1595:9: ( ruleEString )
                    	            // InternalArduinoML.g:1596:10: ruleEString
                    	            {

                    	            										if (current==null) {
                    	            											current = createModelElement(grammarAccess.getTransitionModeRule());
                    	            										}
                    	            									

                    	            										newCompositeNode(grammarAccess.getTransitionModeAccess().getAnalogsAnalogCrossReference_0_0_2_1_1_0_0());
                    	            									
                    	            pushFollow(FOLLOW_25);
                    	            ruleEString();

                    	            state._fsp--;


                    	            										afterParserOrEnumRuleCall();
                    	            									

                    	            }


                    	            }

                    	            // InternalArduinoML.g:1610:8: ( (lv_comp_12_0= ruleCompare ) )
                    	            // InternalArduinoML.g:1611:9: (lv_comp_12_0= ruleCompare )
                    	            {
                    	            // InternalArduinoML.g:1611:9: (lv_comp_12_0= ruleCompare )
                    	            // InternalArduinoML.g:1612:10: lv_comp_12_0= ruleCompare
                    	            {

                    	            										newCompositeNode(grammarAccess.getTransitionModeAccess().getCompCompareEnumRuleCall_0_0_2_1_1_1_0());
                    	            									
                    	            pushFollow(FOLLOW_13);
                    	            lv_comp_12_0=ruleCompare();

                    	            state._fsp--;


                    	            										if (current==null) {
                    	            											current = createModelElementForParent(grammarAccess.getTransitionModeRule());
                    	            										}
                    	            										add(
                    	            											current,
                    	            											"comp",
                    	            											lv_comp_12_0,
                    	            											"arduinoML.concretesyntax.ArduinoML.Compare");
                    	            										afterParserOrEnumRuleCall();
                    	            									

                    	            }


                    	            }

                    	            // InternalArduinoML.g:1629:8: ( (lv_a_values_13_0= ruleEInt ) )
                    	            // InternalArduinoML.g:1630:9: (lv_a_values_13_0= ruleEInt )
                    	            {
                    	            // InternalArduinoML.g:1630:9: (lv_a_values_13_0= ruleEInt )
                    	            // InternalArduinoML.g:1631:10: lv_a_values_13_0= ruleEInt
                    	            {

                    	            										newCompositeNode(grammarAccess.getTransitionModeAccess().getA_valuesEIntParserRuleCall_0_0_2_1_1_2_0());
                    	            									
                    	            pushFollow(FOLLOW_24);
                    	            lv_a_values_13_0=ruleEInt();

                    	            state._fsp--;


                    	            										if (current==null) {
                    	            											current = createModelElementForParent(grammarAccess.getTransitionModeRule());
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
                    	    break loop21;
                        }
                    } while (true);

                    // InternalArduinoML.g:1651:5: (otherlv_14= 'wait' ( (lv_time_15_0= ruleEInt ) ) ( (lv_unit_16_0= ruleTime_unit ) ) otherlv_17= 'then' )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==28) ) {
                        alt22=1;
                    }
                    switch (alt22) {
                        case 1 :
                            // InternalArduinoML.g:1652:6: otherlv_14= 'wait' ( (lv_time_15_0= ruleEInt ) ) ( (lv_unit_16_0= ruleTime_unit ) ) otherlv_17= 'then'
                            {
                            otherlv_14=(Token)match(input,28,FOLLOW_13); 

                            						newLeafNode(otherlv_14, grammarAccess.getTransitionModeAccess().getWaitKeyword_0_0_3_0());
                            					
                            // InternalArduinoML.g:1656:6: ( (lv_time_15_0= ruleEInt ) )
                            // InternalArduinoML.g:1657:7: (lv_time_15_0= ruleEInt )
                            {
                            // InternalArduinoML.g:1657:7: (lv_time_15_0= ruleEInt )
                            // InternalArduinoML.g:1658:8: lv_time_15_0= ruleEInt
                            {

                            								newCompositeNode(grammarAccess.getTransitionModeAccess().getTimeEIntParserRuleCall_0_0_3_1_0());
                            							
                            pushFollow(FOLLOW_26);
                            lv_time_15_0=ruleEInt();

                            state._fsp--;


                            								if (current==null) {
                            									current = createModelElementForParent(grammarAccess.getTransitionModeRule());
                            								}
                            								set(
                            									current,
                            									"time",
                            									lv_time_15_0,
                            									"arduinoML.concretesyntax.ArduinoML.EInt");
                            								afterParserOrEnumRuleCall();
                            							

                            }


                            }

                            // InternalArduinoML.g:1675:6: ( (lv_unit_16_0= ruleTime_unit ) )
                            // InternalArduinoML.g:1676:7: (lv_unit_16_0= ruleTime_unit )
                            {
                            // InternalArduinoML.g:1676:7: (lv_unit_16_0= ruleTime_unit )
                            // InternalArduinoML.g:1677:8: lv_unit_16_0= ruleTime_unit
                            {

                            								newCompositeNode(grammarAccess.getTransitionModeAccess().getUnitTime_unitEnumRuleCall_0_0_3_2_0());
                            							
                            pushFollow(FOLLOW_27);
                            lv_unit_16_0=ruleTime_unit();

                            state._fsp--;


                            								if (current==null) {
                            									current = createModelElementForParent(grammarAccess.getTransitionModeRule());
                            								}
                            								set(
                            									current,
                            									"unit",
                            									lv_unit_16_0,
                            									"arduinoML.concretesyntax.ArduinoML.Time_unit");
                            								afterParserOrEnumRuleCall();
                            							

                            }


                            }

                            otherlv_17=(Token)match(input,29,FOLLOW_28); 

                            						newLeafNode(otherlv_17, grammarAccess.getTransitionModeAccess().getThenKeyword_0_0_3_3());
                            					

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalArduinoML.g:1701:4: (otherlv_18= 'wait' ( (lv_time_19_0= ruleEInt ) ) ( (lv_unit_20_0= ruleTime_unit ) ) otherlv_21= 'then' )
                    {
                    // InternalArduinoML.g:1701:4: (otherlv_18= 'wait' ( (lv_time_19_0= ruleEInt ) ) ( (lv_unit_20_0= ruleTime_unit ) ) otherlv_21= 'then' )
                    // InternalArduinoML.g:1702:5: otherlv_18= 'wait' ( (lv_time_19_0= ruleEInt ) ) ( (lv_unit_20_0= ruleTime_unit ) ) otherlv_21= 'then'
                    {
                    otherlv_18=(Token)match(input,28,FOLLOW_13); 

                    					newLeafNode(otherlv_18, grammarAccess.getTransitionModeAccess().getWaitKeyword_0_1_0());
                    				
                    // InternalArduinoML.g:1706:5: ( (lv_time_19_0= ruleEInt ) )
                    // InternalArduinoML.g:1707:6: (lv_time_19_0= ruleEInt )
                    {
                    // InternalArduinoML.g:1707:6: (lv_time_19_0= ruleEInt )
                    // InternalArduinoML.g:1708:7: lv_time_19_0= ruleEInt
                    {

                    							newCompositeNode(grammarAccess.getTransitionModeAccess().getTimeEIntParserRuleCall_0_1_1_0());
                    						
                    pushFollow(FOLLOW_26);
                    lv_time_19_0=ruleEInt();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getTransitionModeRule());
                    							}
                    							set(
                    								current,
                    								"time",
                    								lv_time_19_0,
                    								"arduinoML.concretesyntax.ArduinoML.EInt");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    // InternalArduinoML.g:1725:5: ( (lv_unit_20_0= ruleTime_unit ) )
                    // InternalArduinoML.g:1726:6: (lv_unit_20_0= ruleTime_unit )
                    {
                    // InternalArduinoML.g:1726:6: (lv_unit_20_0= ruleTime_unit )
                    // InternalArduinoML.g:1727:7: lv_unit_20_0= ruleTime_unit
                    {

                    							newCompositeNode(grammarAccess.getTransitionModeAccess().getUnitTime_unitEnumRuleCall_0_1_2_0());
                    						
                    pushFollow(FOLLOW_27);
                    lv_unit_20_0=ruleTime_unit();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getTransitionModeRule());
                    							}
                    							set(
                    								current,
                    								"unit",
                    								lv_unit_20_0,
                    								"arduinoML.concretesyntax.ArduinoML.Time_unit");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    otherlv_21=(Token)match(input,29,FOLLOW_28); 

                    					newLeafNode(otherlv_21, grammarAccess.getTransitionModeAccess().getThenKeyword_0_1_3());
                    				

                    }


                    }
                    break;

            }

            otherlv_22=(Token)match(input,30,FOLLOW_21); 

            			newLeafNode(otherlv_22, grammarAccess.getTransitionModeAccess().getGoKeyword_1());
            		
            otherlv_23=(Token)match(input,24,FOLLOW_11); 

            			newLeafNode(otherlv_23, grammarAccess.getTransitionModeAccess().getToKeyword_2());
            		
            otherlv_24=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_24, grammarAccess.getTransitionModeAccess().getModeKeyword_3());
            		
            // InternalArduinoML.g:1762:3: ( ( ruleEString ) )
            // InternalArduinoML.g:1763:4: ( ruleEString )
            {
            // InternalArduinoML.g:1763:4: ( ruleEString )
            // InternalArduinoML.g:1764:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTransitionModeRule());
            					}
            				

            					newCompositeNode(grammarAccess.getTransitionModeAccess().getNext_modeModeCrossReference_4_0());
            				
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;


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
    // $ANTLR end "ruleTransitionMode"


    // $ANTLR start "ruleSignal"
    // InternalArduinoML.g:1782:1: ruleSignal returns [Enumerator current=null] : ( (enumLiteral_0= 'HIGH' ) | (enumLiteral_1= 'LOW' ) ) ;
    public final Enumerator ruleSignal() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalArduinoML.g:1788:2: ( ( (enumLiteral_0= 'HIGH' ) | (enumLiteral_1= 'LOW' ) ) )
            // InternalArduinoML.g:1789:2: ( (enumLiteral_0= 'HIGH' ) | (enumLiteral_1= 'LOW' ) )
            {
            // InternalArduinoML.g:1789:2: ( (enumLiteral_0= 'HIGH' ) | (enumLiteral_1= 'LOW' ) )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==31) ) {
                alt24=1;
            }
            else if ( (LA24_0==32) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // InternalArduinoML.g:1790:3: (enumLiteral_0= 'HIGH' )
                    {
                    // InternalArduinoML.g:1790:3: (enumLiteral_0= 'HIGH' )
                    // InternalArduinoML.g:1791:4: enumLiteral_0= 'HIGH'
                    {
                    enumLiteral_0=(Token)match(input,31,FOLLOW_2); 

                    				current = grammarAccess.getSignalAccess().getHIGHEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getSignalAccess().getHIGHEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalArduinoML.g:1798:3: (enumLiteral_1= 'LOW' )
                    {
                    // InternalArduinoML.g:1798:3: (enumLiteral_1= 'LOW' )
                    // InternalArduinoML.g:1799:4: enumLiteral_1= 'LOW'
                    {
                    enumLiteral_1=(Token)match(input,32,FOLLOW_2); 

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
    // InternalArduinoML.g:1809:1: ruleTime_unit returns [Enumerator current=null] : ( (enumLiteral_0= 'ms' ) | (enumLiteral_1= 's' ) | (enumLiteral_2= 'min' ) ) ;
    public final Enumerator ruleTime_unit() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalArduinoML.g:1815:2: ( ( (enumLiteral_0= 'ms' ) | (enumLiteral_1= 's' ) | (enumLiteral_2= 'min' ) ) )
            // InternalArduinoML.g:1816:2: ( (enumLiteral_0= 'ms' ) | (enumLiteral_1= 's' ) | (enumLiteral_2= 'min' ) )
            {
            // InternalArduinoML.g:1816:2: ( (enumLiteral_0= 'ms' ) | (enumLiteral_1= 's' ) | (enumLiteral_2= 'min' ) )
            int alt25=3;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt25=1;
                }
                break;
            case 34:
                {
                alt25=2;
                }
                break;
            case 35:
                {
                alt25=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // InternalArduinoML.g:1817:3: (enumLiteral_0= 'ms' )
                    {
                    // InternalArduinoML.g:1817:3: (enumLiteral_0= 'ms' )
                    // InternalArduinoML.g:1818:4: enumLiteral_0= 'ms'
                    {
                    enumLiteral_0=(Token)match(input,33,FOLLOW_2); 

                    				current = grammarAccess.getTime_unitAccess().getMsEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTime_unitAccess().getMsEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalArduinoML.g:1825:3: (enumLiteral_1= 's' )
                    {
                    // InternalArduinoML.g:1825:3: (enumLiteral_1= 's' )
                    // InternalArduinoML.g:1826:4: enumLiteral_1= 's'
                    {
                    enumLiteral_1=(Token)match(input,34,FOLLOW_2); 

                    				current = grammarAccess.getTime_unitAccess().getSEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTime_unitAccess().getSEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalArduinoML.g:1833:3: (enumLiteral_2= 'min' )
                    {
                    // InternalArduinoML.g:1833:3: (enumLiteral_2= 'min' )
                    // InternalArduinoML.g:1834:4: enumLiteral_2= 'min'
                    {
                    enumLiteral_2=(Token)match(input,35,FOLLOW_2); 

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
    // InternalArduinoML.g:1844:1: ruleCompare returns [Enumerator current=null] : ( (enumLiteral_0= 'inf' ) | (enumLiteral_1= 'einf' ) | (enumLiteral_2= 'equal' ) | (enumLiteral_3= 'esup' ) | (enumLiteral_4= 'sup' ) ) ;
    public final Enumerator ruleCompare() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalArduinoML.g:1850:2: ( ( (enumLiteral_0= 'inf' ) | (enumLiteral_1= 'einf' ) | (enumLiteral_2= 'equal' ) | (enumLiteral_3= 'esup' ) | (enumLiteral_4= 'sup' ) ) )
            // InternalArduinoML.g:1851:2: ( (enumLiteral_0= 'inf' ) | (enumLiteral_1= 'einf' ) | (enumLiteral_2= 'equal' ) | (enumLiteral_3= 'esup' ) | (enumLiteral_4= 'sup' ) )
            {
            // InternalArduinoML.g:1851:2: ( (enumLiteral_0= 'inf' ) | (enumLiteral_1= 'einf' ) | (enumLiteral_2= 'equal' ) | (enumLiteral_3= 'esup' ) | (enumLiteral_4= 'sup' ) )
            int alt26=5;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt26=1;
                }
                break;
            case 37:
                {
                alt26=2;
                }
                break;
            case 38:
                {
                alt26=3;
                }
                break;
            case 39:
                {
                alt26=4;
                }
                break;
            case 40:
                {
                alt26=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // InternalArduinoML.g:1852:3: (enumLiteral_0= 'inf' )
                    {
                    // InternalArduinoML.g:1852:3: (enumLiteral_0= 'inf' )
                    // InternalArduinoML.g:1853:4: enumLiteral_0= 'inf'
                    {
                    enumLiteral_0=(Token)match(input,36,FOLLOW_2); 

                    				current = grammarAccess.getCompareAccess().getInfEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getCompareAccess().getInfEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalArduinoML.g:1860:3: (enumLiteral_1= 'einf' )
                    {
                    // InternalArduinoML.g:1860:3: (enumLiteral_1= 'einf' )
                    // InternalArduinoML.g:1861:4: enumLiteral_1= 'einf'
                    {
                    enumLiteral_1=(Token)match(input,37,FOLLOW_2); 

                    				current = grammarAccess.getCompareAccess().getEinfEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getCompareAccess().getEinfEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalArduinoML.g:1868:3: (enumLiteral_2= 'equal' )
                    {
                    // InternalArduinoML.g:1868:3: (enumLiteral_2= 'equal' )
                    // InternalArduinoML.g:1869:4: enumLiteral_2= 'equal'
                    {
                    enumLiteral_2=(Token)match(input,38,FOLLOW_2); 

                    				current = grammarAccess.getCompareAccess().getEqualEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getCompareAccess().getEqualEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalArduinoML.g:1876:3: (enumLiteral_3= 'esup' )
                    {
                    // InternalArduinoML.g:1876:3: (enumLiteral_3= 'esup' )
                    // InternalArduinoML.g:1877:4: enumLiteral_3= 'esup'
                    {
                    enumLiteral_3=(Token)match(input,39,FOLLOW_2); 

                    				current = grammarAccess.getCompareAccess().getEsupEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getCompareAccess().getEsupEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalArduinoML.g:1884:3: (enumLiteral_4= 'sup' )
                    {
                    // InternalArduinoML.g:1884:3: (enumLiteral_4= 'sup' )
                    // InternalArduinoML.g:1885:4: enumLiteral_4= 'sup'
                    {
                    enumLiteral_4=(Token)match(input,40,FOLLOW_2); 

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
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000700000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000710000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000740000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000080030L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000012000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000012000002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000012800000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000012800002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000180000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000058000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x000001F000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000E00000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000040000000L});

}