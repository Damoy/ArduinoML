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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'app'", "'initial'", "'mode'", "':'", "'bricks'", "'modes'", "'state'", "'states'", "'transitions'", "'Actuator'", "'Digital'", "'Analog'", "'change'", "'to'", "'when'", "'is'", "'and'", "'wait'", "'then'", "'go'", "'HIGH'", "'LOW'", "'ms'", "'s'", "'min'", "'inf'", "'einf'", "'equal'", "'esup'", "'sup'"
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
    // InternalArduinoML.g:72:1: ruleApp returns [EObject current=null] : ( (otherlv_0= 'app' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'initial' otherlv_3= 'mode' ( ( ruleEString ) ) otherlv_5= ':' otherlv_6= 'bricks' otherlv_7= ':' ( (lv_bricks_8_0= ruleBrick ) ) ( (lv_bricks_9_0= ruleBrick ) )* otherlv_10= 'modes' otherlv_11= ':' ( (lv_modes_12_0= ruleMode ) ) ( (lv_modes_13_0= ruleMode ) )* ) | (otherlv_14= 'app' ( (lv_modes_15_0= ruleMode ) ) ) ) ;
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
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_bricks_8_0 = null;

        EObject lv_bricks_9_0 = null;

        EObject lv_modes_12_0 = null;

        EObject lv_modes_13_0 = null;

        EObject lv_modes_15_0 = null;



        	enterRule();

        try {
            // InternalArduinoML.g:78:2: ( ( (otherlv_0= 'app' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'initial' otherlv_3= 'mode' ( ( ruleEString ) ) otherlv_5= ':' otherlv_6= 'bricks' otherlv_7= ':' ( (lv_bricks_8_0= ruleBrick ) ) ( (lv_bricks_9_0= ruleBrick ) )* otherlv_10= 'modes' otherlv_11= ':' ( (lv_modes_12_0= ruleMode ) ) ( (lv_modes_13_0= ruleMode ) )* ) | (otherlv_14= 'app' ( (lv_modes_15_0= ruleMode ) ) ) ) )
            // InternalArduinoML.g:79:2: ( (otherlv_0= 'app' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'initial' otherlv_3= 'mode' ( ( ruleEString ) ) otherlv_5= ':' otherlv_6= 'bricks' otherlv_7= ':' ( (lv_bricks_8_0= ruleBrick ) ) ( (lv_bricks_9_0= ruleBrick ) )* otherlv_10= 'modes' otherlv_11= ':' ( (lv_modes_12_0= ruleMode ) ) ( (lv_modes_13_0= ruleMode ) )* ) | (otherlv_14= 'app' ( (lv_modes_15_0= ruleMode ) ) ) )
            {
            // InternalArduinoML.g:79:2: ( (otherlv_0= 'app' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'initial' otherlv_3= 'mode' ( ( ruleEString ) ) otherlv_5= ':' otherlv_6= 'bricks' otherlv_7= ':' ( (lv_bricks_8_0= ruleBrick ) ) ( (lv_bricks_9_0= ruleBrick ) )* otherlv_10= 'modes' otherlv_11= ':' ( (lv_modes_12_0= ruleMode ) ) ( (lv_modes_13_0= ruleMode ) )* ) | (otherlv_14= 'app' ( (lv_modes_15_0= ruleMode ) ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==11) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==RULE_STRING) ) {
                    int LA3_2 = input.LA(3);

                    if ( (LA3_2==12) ) {
                        int LA3_4 = input.LA(4);

                        if ( (LA3_4==17) ) {
                            alt3=2;
                        }
                        else if ( (LA3_4==13) ) {
                            alt3=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 3, 4, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 2, input);

                        throw nvae;
                    }
                }
                else if ( (LA3_1==RULE_ID) ) {
                    int LA3_3 = input.LA(3);

                    if ( (LA3_3==12) ) {
                        int LA3_4 = input.LA(4);

                        if ( (LA3_4==17) ) {
                            alt3=2;
                        }
                        else if ( (LA3_4==13) ) {
                            alt3=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 3, 4, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalArduinoML.g:80:3: (otherlv_0= 'app' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'initial' otherlv_3= 'mode' ( ( ruleEString ) ) otherlv_5= ':' otherlv_6= 'bricks' otherlv_7= ':' ( (lv_bricks_8_0= ruleBrick ) ) ( (lv_bricks_9_0= ruleBrick ) )* otherlv_10= 'modes' otherlv_11= ':' ( (lv_modes_12_0= ruleMode ) ) ( (lv_modes_13_0= ruleMode ) )* )
                    {
                    // InternalArduinoML.g:80:3: (otherlv_0= 'app' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'initial' otherlv_3= 'mode' ( ( ruleEString ) ) otherlv_5= ':' otherlv_6= 'bricks' otherlv_7= ':' ( (lv_bricks_8_0= ruleBrick ) ) ( (lv_bricks_9_0= ruleBrick ) )* otherlv_10= 'modes' otherlv_11= ':' ( (lv_modes_12_0= ruleMode ) ) ( (lv_modes_13_0= ruleMode ) )* )
                    // InternalArduinoML.g:81:4: otherlv_0= 'app' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'initial' otherlv_3= 'mode' ( ( ruleEString ) ) otherlv_5= ':' otherlv_6= 'bricks' otherlv_7= ':' ( (lv_bricks_8_0= ruleBrick ) ) ( (lv_bricks_9_0= ruleBrick ) )* otherlv_10= 'modes' otherlv_11= ':' ( (lv_modes_12_0= ruleMode ) ) ( (lv_modes_13_0= ruleMode ) )*
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

                    				newLeafNode(otherlv_3, grammarAccess.getAppAccess().getModeKeyword_0_3());
                    			
                    // InternalArduinoML.g:112:4: ( ( ruleEString ) )
                    // InternalArduinoML.g:113:5: ( ruleEString )
                    {
                    // InternalArduinoML.g:113:5: ( ruleEString )
                    // InternalArduinoML.g:114:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAppRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getAppAccess().getInitial_modeModeCrossReference_0_4_0());
                    					
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

                        if ( ((LA1_0>=20 && LA1_0<=22)) ) {
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

                    				newLeafNode(otherlv_10, grammarAccess.getAppAccess().getModesKeyword_0_10());
                    			
                    otherlv_11=(Token)match(input,14,FOLLOW_3); 

                    				newLeafNode(otherlv_11, grammarAccess.getAppAccess().getColonKeyword_0_11());
                    			
                    // InternalArduinoML.g:186:4: ( (lv_modes_12_0= ruleMode ) )
                    // InternalArduinoML.g:187:5: (lv_modes_12_0= ruleMode )
                    {
                    // InternalArduinoML.g:187:5: (lv_modes_12_0= ruleMode )
                    // InternalArduinoML.g:188:6: lv_modes_12_0= ruleMode
                    {

                    						newCompositeNode(grammarAccess.getAppAccess().getModesModeParserRuleCall_0_12_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_modes_12_0=ruleMode();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAppRule());
                    						}
                    						add(
                    							current,
                    							"modes",
                    							lv_modes_12_0,
                    							"arduinoML.concretesyntax.ArduinoML.Mode");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalArduinoML.g:205:4: ( (lv_modes_13_0= ruleMode ) )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( ((LA2_0>=RULE_STRING && LA2_0<=RULE_ID)) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // InternalArduinoML.g:206:5: (lv_modes_13_0= ruleMode )
                    	    {
                    	    // InternalArduinoML.g:206:5: (lv_modes_13_0= ruleMode )
                    	    // InternalArduinoML.g:207:6: lv_modes_13_0= ruleMode
                    	    {

                    	    						newCompositeNode(grammarAccess.getAppAccess().getModesModeParserRuleCall_0_13_0());
                    	    					
                    	    pushFollow(FOLLOW_10);
                    	    lv_modes_13_0=ruleMode();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getAppRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"modes",
                    	    							lv_modes_13_0,
                    	    							"arduinoML.concretesyntax.ArduinoML.Mode");
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
                    // InternalArduinoML.g:226:3: (otherlv_14= 'app' ( (lv_modes_15_0= ruleMode ) ) )
                    {
                    // InternalArduinoML.g:226:3: (otherlv_14= 'app' ( (lv_modes_15_0= ruleMode ) ) )
                    // InternalArduinoML.g:227:4: otherlv_14= 'app' ( (lv_modes_15_0= ruleMode ) )
                    {
                    otherlv_14=(Token)match(input,11,FOLLOW_3); 

                    				newLeafNode(otherlv_14, grammarAccess.getAppAccess().getAppKeyword_1_0());
                    			
                    // InternalArduinoML.g:231:4: ( (lv_modes_15_0= ruleMode ) )
                    // InternalArduinoML.g:232:5: (lv_modes_15_0= ruleMode )
                    {
                    // InternalArduinoML.g:232:5: (lv_modes_15_0= ruleMode )
                    // InternalArduinoML.g:233:6: lv_modes_15_0= ruleMode
                    {

                    						newCompositeNode(grammarAccess.getAppAccess().getModesModeParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_modes_15_0=ruleMode();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAppRule());
                    						}
                    						add(
                    							current,
                    							"modes",
                    							lv_modes_15_0,
                    							"arduinoML.concretesyntax.ArduinoML.Mode");
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
    // $ANTLR end "ruleApp"


    // $ANTLR start "entryRuleBrick"
    // InternalArduinoML.g:255:1: entryRuleBrick returns [EObject current=null] : iv_ruleBrick= ruleBrick EOF ;
    public final EObject entryRuleBrick() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBrick = null;


        try {
            // InternalArduinoML.g:255:46: (iv_ruleBrick= ruleBrick EOF )
            // InternalArduinoML.g:256:2: iv_ruleBrick= ruleBrick EOF
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
    // InternalArduinoML.g:262:1: ruleBrick returns [EObject current=null] : ( (this_Actuator_0= ruleActuator | this_Digital_1= ruleDigital | this_Analog_2= ruleAnalog ) ( (lv_name_3_0= ruleEString ) ) otherlv_4= ':' ( (lv_pin_5_0= ruleEInt ) ) ) ;
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
            // InternalArduinoML.g:268:2: ( ( (this_Actuator_0= ruleActuator | this_Digital_1= ruleDigital | this_Analog_2= ruleAnalog ) ( (lv_name_3_0= ruleEString ) ) otherlv_4= ':' ( (lv_pin_5_0= ruleEInt ) ) ) )
            // InternalArduinoML.g:269:2: ( (this_Actuator_0= ruleActuator | this_Digital_1= ruleDigital | this_Analog_2= ruleAnalog ) ( (lv_name_3_0= ruleEString ) ) otherlv_4= ':' ( (lv_pin_5_0= ruleEInt ) ) )
            {
            // InternalArduinoML.g:269:2: ( (this_Actuator_0= ruleActuator | this_Digital_1= ruleDigital | this_Analog_2= ruleAnalog ) ( (lv_name_3_0= ruleEString ) ) otherlv_4= ':' ( (lv_pin_5_0= ruleEInt ) ) )
            // InternalArduinoML.g:270:3: (this_Actuator_0= ruleActuator | this_Digital_1= ruleDigital | this_Analog_2= ruleAnalog ) ( (lv_name_3_0= ruleEString ) ) otherlv_4= ':' ( (lv_pin_5_0= ruleEInt ) )
            {
            // InternalArduinoML.g:270:3: (this_Actuator_0= ruleActuator | this_Digital_1= ruleDigital | this_Analog_2= ruleAnalog )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt4=1;
                }
                break;
            case 21:
                {
                alt4=2;
                }
                break;
            case 22:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalArduinoML.g:271:4: this_Actuator_0= ruleActuator
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
                    // InternalArduinoML.g:280:4: this_Digital_1= ruleDigital
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
                    // InternalArduinoML.g:289:4: this_Analog_2= ruleAnalog
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

            // InternalArduinoML.g:298:3: ( (lv_name_3_0= ruleEString ) )
            // InternalArduinoML.g:299:4: (lv_name_3_0= ruleEString )
            {
            // InternalArduinoML.g:299:4: (lv_name_3_0= ruleEString )
            // InternalArduinoML.g:300:5: lv_name_3_0= ruleEString
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

            otherlv_4=(Token)match(input,14,FOLLOW_11); 

            			newLeafNode(otherlv_4, grammarAccess.getBrickAccess().getColonKeyword_2());
            		
            // InternalArduinoML.g:321:3: ( (lv_pin_5_0= ruleEInt ) )
            // InternalArduinoML.g:322:4: (lv_pin_5_0= ruleEInt )
            {
            // InternalArduinoML.g:322:4: (lv_pin_5_0= ruleEInt )
            // InternalArduinoML.g:323:5: lv_pin_5_0= ruleEInt
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
    // InternalArduinoML.g:344:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalArduinoML.g:344:47: (iv_ruleEString= ruleEString EOF )
            // InternalArduinoML.g:345:2: iv_ruleEString= ruleEString EOF
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
    // InternalArduinoML.g:351:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalArduinoML.g:357:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalArduinoML.g:358:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalArduinoML.g:358:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_STRING) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_ID) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalArduinoML.g:359:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalArduinoML.g:367:3: this_ID_1= RULE_ID
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
    // InternalArduinoML.g:378:1: entryRuleMode returns [EObject current=null] : iv_ruleMode= ruleMode EOF ;
    public final EObject entryRuleMode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMode = null;


        try {
            // InternalArduinoML.g:378:45: (iv_ruleMode= ruleMode EOF )
            // InternalArduinoML.g:379:2: iv_ruleMode= ruleMode EOF
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
    // InternalArduinoML.g:385:1: ruleMode returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= 'initial' otherlv_2= 'state' ( ( ruleEString ) ) otherlv_4= ':' (otherlv_5= 'bricks' otherlv_6= ':' ( (lv_bricks_7_0= ruleBrick ) ) ( (lv_bricks_8_0= ruleBrick ) )* )? otherlv_9= 'states' otherlv_10= ':' ( (lv_states_11_0= ruleState ) ) ( (lv_states_12_0= ruleState ) )* (otherlv_13= 'transitions' otherlv_14= ':' ( (lv_transitions_mode_15_0= ruleTransitionMode ) ) ( (lv_transitions_mode_16_0= ruleTransitionMode ) )* )? ) ;
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
            // InternalArduinoML.g:391:2: ( ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= 'initial' otherlv_2= 'state' ( ( ruleEString ) ) otherlv_4= ':' (otherlv_5= 'bricks' otherlv_6= ':' ( (lv_bricks_7_0= ruleBrick ) ) ( (lv_bricks_8_0= ruleBrick ) )* )? otherlv_9= 'states' otherlv_10= ':' ( (lv_states_11_0= ruleState ) ) ( (lv_states_12_0= ruleState ) )* (otherlv_13= 'transitions' otherlv_14= ':' ( (lv_transitions_mode_15_0= ruleTransitionMode ) ) ( (lv_transitions_mode_16_0= ruleTransitionMode ) )* )? ) )
            // InternalArduinoML.g:392:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= 'initial' otherlv_2= 'state' ( ( ruleEString ) ) otherlv_4= ':' (otherlv_5= 'bricks' otherlv_6= ':' ( (lv_bricks_7_0= ruleBrick ) ) ( (lv_bricks_8_0= ruleBrick ) )* )? otherlv_9= 'states' otherlv_10= ':' ( (lv_states_11_0= ruleState ) ) ( (lv_states_12_0= ruleState ) )* (otherlv_13= 'transitions' otherlv_14= ':' ( (lv_transitions_mode_15_0= ruleTransitionMode ) ) ( (lv_transitions_mode_16_0= ruleTransitionMode ) )* )? )
            {
            // InternalArduinoML.g:392:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= 'initial' otherlv_2= 'state' ( ( ruleEString ) ) otherlv_4= ':' (otherlv_5= 'bricks' otherlv_6= ':' ( (lv_bricks_7_0= ruleBrick ) ) ( (lv_bricks_8_0= ruleBrick ) )* )? otherlv_9= 'states' otherlv_10= ':' ( (lv_states_11_0= ruleState ) ) ( (lv_states_12_0= ruleState ) )* (otherlv_13= 'transitions' otherlv_14= ':' ( (lv_transitions_mode_15_0= ruleTransitionMode ) ) ( (lv_transitions_mode_16_0= ruleTransitionMode ) )* )? )
            // InternalArduinoML.g:393:3: ( (lv_name_0_0= ruleEString ) ) otherlv_1= 'initial' otherlv_2= 'state' ( ( ruleEString ) ) otherlv_4= ':' (otherlv_5= 'bricks' otherlv_6= ':' ( (lv_bricks_7_0= ruleBrick ) ) ( (lv_bricks_8_0= ruleBrick ) )* )? otherlv_9= 'states' otherlv_10= ':' ( (lv_states_11_0= ruleState ) ) ( (lv_states_12_0= ruleState ) )* (otherlv_13= 'transitions' otherlv_14= ':' ( (lv_transitions_mode_15_0= ruleTransitionMode ) ) ( (lv_transitions_mode_16_0= ruleTransitionMode ) )* )?
            {
            // InternalArduinoML.g:393:3: ( (lv_name_0_0= ruleEString ) )
            // InternalArduinoML.g:394:4: (lv_name_0_0= ruleEString )
            {
            // InternalArduinoML.g:394:4: (lv_name_0_0= ruleEString )
            // InternalArduinoML.g:395:5: lv_name_0_0= ruleEString
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

            otherlv_1=(Token)match(input,12,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getModeAccess().getInitialKeyword_1());
            		
            otherlv_2=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getModeAccess().getStateKeyword_2());
            		
            // InternalArduinoML.g:420:3: ( ( ruleEString ) )
            // InternalArduinoML.g:421:4: ( ruleEString )
            {
            // InternalArduinoML.g:421:4: ( ruleEString )
            // InternalArduinoML.g:422:5: ruleEString
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

            otherlv_4=(Token)match(input,14,FOLLOW_13); 

            			newLeafNode(otherlv_4, grammarAccess.getModeAccess().getColonKeyword_4());
            		
            // InternalArduinoML.g:440:3: (otherlv_5= 'bricks' otherlv_6= ':' ( (lv_bricks_7_0= ruleBrick ) ) ( (lv_bricks_8_0= ruleBrick ) )* )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==15) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalArduinoML.g:441:4: otherlv_5= 'bricks' otherlv_6= ':' ( (lv_bricks_7_0= ruleBrick ) ) ( (lv_bricks_8_0= ruleBrick ) )*
                    {
                    otherlv_5=(Token)match(input,15,FOLLOW_6); 

                    				newLeafNode(otherlv_5, grammarAccess.getModeAccess().getBricksKeyword_5_0());
                    			
                    otherlv_6=(Token)match(input,14,FOLLOW_8); 

                    				newLeafNode(otherlv_6, grammarAccess.getModeAccess().getColonKeyword_5_1());
                    			
                    // InternalArduinoML.g:449:4: ( (lv_bricks_7_0= ruleBrick ) )
                    // InternalArduinoML.g:450:5: (lv_bricks_7_0= ruleBrick )
                    {
                    // InternalArduinoML.g:450:5: (lv_bricks_7_0= ruleBrick )
                    // InternalArduinoML.g:451:6: lv_bricks_7_0= ruleBrick
                    {

                    						newCompositeNode(grammarAccess.getModeAccess().getBricksBrickParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_14);
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

                    // InternalArduinoML.g:468:4: ( (lv_bricks_8_0= ruleBrick ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( ((LA6_0>=20 && LA6_0<=22)) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalArduinoML.g:469:5: (lv_bricks_8_0= ruleBrick )
                    	    {
                    	    // InternalArduinoML.g:469:5: (lv_bricks_8_0= ruleBrick )
                    	    // InternalArduinoML.g:470:6: lv_bricks_8_0= ruleBrick
                    	    {

                    	    						newCompositeNode(grammarAccess.getModeAccess().getBricksBrickParserRuleCall_5_3_0());
                    	    					
                    	    pushFollow(FOLLOW_14);
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
                    	    break loop6;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_9=(Token)match(input,18,FOLLOW_6); 

            			newLeafNode(otherlv_9, grammarAccess.getModeAccess().getStatesKeyword_6());
            		
            otherlv_10=(Token)match(input,14,FOLLOW_3); 

            			newLeafNode(otherlv_10, grammarAccess.getModeAccess().getColonKeyword_7());
            		
            // InternalArduinoML.g:496:3: ( (lv_states_11_0= ruleState ) )
            // InternalArduinoML.g:497:4: (lv_states_11_0= ruleState )
            {
            // InternalArduinoML.g:497:4: (lv_states_11_0= ruleState )
            // InternalArduinoML.g:498:5: lv_states_11_0= ruleState
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

            // InternalArduinoML.g:515:3: ( (lv_states_12_0= ruleState ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_STRING) ) {
                    int LA8_2 = input.LA(2);

                    if ( (LA8_2==14) ) {
                        alt8=1;
                    }


                }
                else if ( (LA8_0==RULE_ID) ) {
                    int LA8_3 = input.LA(2);

                    if ( (LA8_3==14) ) {
                        alt8=1;
                    }


                }


                switch (alt8) {
            	case 1 :
            	    // InternalArduinoML.g:516:4: (lv_states_12_0= ruleState )
            	    {
            	    // InternalArduinoML.g:516:4: (lv_states_12_0= ruleState )
            	    // InternalArduinoML.g:517:5: lv_states_12_0= ruleState
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
            	    break loop8;
                }
            } while (true);

            // InternalArduinoML.g:534:3: (otherlv_13= 'transitions' otherlv_14= ':' ( (lv_transitions_mode_15_0= ruleTransitionMode ) ) ( (lv_transitions_mode_16_0= ruleTransitionMode ) )* )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==19) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalArduinoML.g:535:4: otherlv_13= 'transitions' otherlv_14= ':' ( (lv_transitions_mode_15_0= ruleTransitionMode ) ) ( (lv_transitions_mode_16_0= ruleTransitionMode ) )*
                    {
                    otherlv_13=(Token)match(input,19,FOLLOW_6); 

                    				newLeafNode(otherlv_13, grammarAccess.getModeAccess().getTransitionsKeyword_10_0());
                    			
                    otherlv_14=(Token)match(input,14,FOLLOW_16); 

                    				newLeafNode(otherlv_14, grammarAccess.getModeAccess().getColonKeyword_10_1());
                    			
                    // InternalArduinoML.g:543:4: ( (lv_transitions_mode_15_0= ruleTransitionMode ) )
                    // InternalArduinoML.g:544:5: (lv_transitions_mode_15_0= ruleTransitionMode )
                    {
                    // InternalArduinoML.g:544:5: (lv_transitions_mode_15_0= ruleTransitionMode )
                    // InternalArduinoML.g:545:6: lv_transitions_mode_15_0= ruleTransitionMode
                    {

                    						newCompositeNode(grammarAccess.getModeAccess().getTransitions_modeTransitionModeParserRuleCall_10_2_0());
                    					
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

                    // InternalArduinoML.g:562:4: ( (lv_transitions_mode_16_0= ruleTransitionMode ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==25||LA9_0==28) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalArduinoML.g:563:5: (lv_transitions_mode_16_0= ruleTransitionMode )
                    	    {
                    	    // InternalArduinoML.g:563:5: (lv_transitions_mode_16_0= ruleTransitionMode )
                    	    // InternalArduinoML.g:564:6: lv_transitions_mode_16_0= ruleTransitionMode
                    	    {

                    	    						newCompositeNode(grammarAccess.getModeAccess().getTransitions_modeTransitionModeParserRuleCall_10_3_0());
                    	    					
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
                    	    break loop9;
                        }
                    } while (true);


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
    // $ANTLR end "ruleMode"


    // $ANTLR start "entryRuleState"
    // InternalArduinoML.g:586:1: entryRuleState returns [EObject current=null] : iv_ruleState= ruleState EOF ;
    public final EObject entryRuleState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleState = null;


        try {
            // InternalArduinoML.g:586:46: (iv_ruleState= ruleState EOF )
            // InternalArduinoML.g:587:2: iv_ruleState= ruleState EOF
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
    // InternalArduinoML.g:593:1: ruleState returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_actions_2_0= ruleAction ) ) ( (lv_actions_3_0= ruleAction ) )* ( (lv_transitions_state_4_0= ruleTransitionState ) ) ( (lv_transitions_state_5_0= ruleTransitionState ) )* ) ;
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
            // InternalArduinoML.g:599:2: ( ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_actions_2_0= ruleAction ) ) ( (lv_actions_3_0= ruleAction ) )* ( (lv_transitions_state_4_0= ruleTransitionState ) ) ( (lv_transitions_state_5_0= ruleTransitionState ) )* ) )
            // InternalArduinoML.g:600:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_actions_2_0= ruleAction ) ) ( (lv_actions_3_0= ruleAction ) )* ( (lv_transitions_state_4_0= ruleTransitionState ) ) ( (lv_transitions_state_5_0= ruleTransitionState ) )* )
            {
            // InternalArduinoML.g:600:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_actions_2_0= ruleAction ) ) ( (lv_actions_3_0= ruleAction ) )* ( (lv_transitions_state_4_0= ruleTransitionState ) ) ( (lv_transitions_state_5_0= ruleTransitionState ) )* )
            // InternalArduinoML.g:601:3: ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_actions_2_0= ruleAction ) ) ( (lv_actions_3_0= ruleAction ) )* ( (lv_transitions_state_4_0= ruleTransitionState ) ) ( (lv_transitions_state_5_0= ruleTransitionState ) )*
            {
            // InternalArduinoML.g:601:3: ( (lv_name_0_0= ruleEString ) )
            // InternalArduinoML.g:602:4: (lv_name_0_0= ruleEString )
            {
            // InternalArduinoML.g:602:4: (lv_name_0_0= ruleEString )
            // InternalArduinoML.g:603:5: lv_name_0_0= ruleEString
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
            		
            // InternalArduinoML.g:624:3: ( (lv_actions_2_0= ruleAction ) )
            // InternalArduinoML.g:625:4: (lv_actions_2_0= ruleAction )
            {
            // InternalArduinoML.g:625:4: (lv_actions_2_0= ruleAction )
            // InternalArduinoML.g:626:5: lv_actions_2_0= ruleAction
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

            // InternalArduinoML.g:643:3: ( (lv_actions_3_0= ruleAction ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==23) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalArduinoML.g:644:4: (lv_actions_3_0= ruleAction )
            	    {
            	    // InternalArduinoML.g:644:4: (lv_actions_3_0= ruleAction )
            	    // InternalArduinoML.g:645:5: lv_actions_3_0= ruleAction
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
            	    break loop11;
                }
            } while (true);

            // InternalArduinoML.g:662:3: ( (lv_transitions_state_4_0= ruleTransitionState ) )
            // InternalArduinoML.g:663:4: (lv_transitions_state_4_0= ruleTransitionState )
            {
            // InternalArduinoML.g:663:4: (lv_transitions_state_4_0= ruleTransitionState )
            // InternalArduinoML.g:664:5: lv_transitions_state_4_0= ruleTransitionState
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

            // InternalArduinoML.g:681:3: ( (lv_transitions_state_5_0= ruleTransitionState ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==25||LA12_0==28) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalArduinoML.g:682:4: (lv_transitions_state_5_0= ruleTransitionState )
            	    {
            	    // InternalArduinoML.g:682:4: (lv_transitions_state_5_0= ruleTransitionState )
            	    // InternalArduinoML.g:683:5: lv_transitions_state_5_0= ruleTransitionState
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
    // InternalArduinoML.g:704:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalArduinoML.g:704:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalArduinoML.g:705:2: iv_ruleEInt= ruleEInt EOF
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
    // InternalArduinoML.g:711:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;


        	enterRule();

        try {
            // InternalArduinoML.g:717:2: (this_INT_0= RULE_INT )
            // InternalArduinoML.g:718:2: this_INT_0= RULE_INT
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
    // InternalArduinoML.g:728:1: entryRuleActuator returns [EObject current=null] : iv_ruleActuator= ruleActuator EOF ;
    public final EObject entryRuleActuator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActuator = null;


        try {
            // InternalArduinoML.g:728:49: (iv_ruleActuator= ruleActuator EOF )
            // InternalArduinoML.g:729:2: iv_ruleActuator= ruleActuator EOF
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
    // InternalArduinoML.g:735:1: ruleActuator returns [EObject current=null] : ( () otherlv_1= 'Actuator' ) ;
    public final EObject ruleActuator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalArduinoML.g:741:2: ( ( () otherlv_1= 'Actuator' ) )
            // InternalArduinoML.g:742:2: ( () otherlv_1= 'Actuator' )
            {
            // InternalArduinoML.g:742:2: ( () otherlv_1= 'Actuator' )
            // InternalArduinoML.g:743:3: () otherlv_1= 'Actuator'
            {
            // InternalArduinoML.g:743:3: ()
            // InternalArduinoML.g:744:4: 
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
    // InternalArduinoML.g:758:1: entryRuleDigital returns [EObject current=null] : iv_ruleDigital= ruleDigital EOF ;
    public final EObject entryRuleDigital() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDigital = null;


        try {
            // InternalArduinoML.g:758:48: (iv_ruleDigital= ruleDigital EOF )
            // InternalArduinoML.g:759:2: iv_ruleDigital= ruleDigital EOF
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
    // InternalArduinoML.g:765:1: ruleDigital returns [EObject current=null] : ( () otherlv_1= 'Digital' ) ;
    public final EObject ruleDigital() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalArduinoML.g:771:2: ( ( () otherlv_1= 'Digital' ) )
            // InternalArduinoML.g:772:2: ( () otherlv_1= 'Digital' )
            {
            // InternalArduinoML.g:772:2: ( () otherlv_1= 'Digital' )
            // InternalArduinoML.g:773:3: () otherlv_1= 'Digital'
            {
            // InternalArduinoML.g:773:3: ()
            // InternalArduinoML.g:774:4: 
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
    // InternalArduinoML.g:788:1: entryRuleAnalog returns [EObject current=null] : iv_ruleAnalog= ruleAnalog EOF ;
    public final EObject entryRuleAnalog() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnalog = null;


        try {
            // InternalArduinoML.g:788:47: (iv_ruleAnalog= ruleAnalog EOF )
            // InternalArduinoML.g:789:2: iv_ruleAnalog= ruleAnalog EOF
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
    // InternalArduinoML.g:795:1: ruleAnalog returns [EObject current=null] : ( () otherlv_1= 'Analog' ) ;
    public final EObject ruleAnalog() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalArduinoML.g:801:2: ( ( () otherlv_1= 'Analog' ) )
            // InternalArduinoML.g:802:2: ( () otherlv_1= 'Analog' )
            {
            // InternalArduinoML.g:802:2: ( () otherlv_1= 'Analog' )
            // InternalArduinoML.g:803:3: () otherlv_1= 'Analog'
            {
            // InternalArduinoML.g:803:3: ()
            // InternalArduinoML.g:804:4: 
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
    // InternalArduinoML.g:818:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // InternalArduinoML.g:818:47: (iv_ruleAction= ruleAction EOF )
            // InternalArduinoML.g:819:2: iv_ruleAction= ruleAction EOF
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
    // InternalArduinoML.g:825:1: ruleAction returns [EObject current=null] : (otherlv_0= 'change' ( ( ruleEString ) ) otherlv_2= 'to' ( (lv_value_3_0= ruleSignal ) ) ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Enumerator lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalArduinoML.g:831:2: ( (otherlv_0= 'change' ( ( ruleEString ) ) otherlv_2= 'to' ( (lv_value_3_0= ruleSignal ) ) ) )
            // InternalArduinoML.g:832:2: (otherlv_0= 'change' ( ( ruleEString ) ) otherlv_2= 'to' ( (lv_value_3_0= ruleSignal ) ) )
            {
            // InternalArduinoML.g:832:2: (otherlv_0= 'change' ( ( ruleEString ) ) otherlv_2= 'to' ( (lv_value_3_0= ruleSignal ) ) )
            // InternalArduinoML.g:833:3: otherlv_0= 'change' ( ( ruleEString ) ) otherlv_2= 'to' ( (lv_value_3_0= ruleSignal ) )
            {
            otherlv_0=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getActionAccess().getChangeKeyword_0());
            		
            // InternalArduinoML.g:837:3: ( ( ruleEString ) )
            // InternalArduinoML.g:838:4: ( ruleEString )
            {
            // InternalArduinoML.g:838:4: ( ruleEString )
            // InternalArduinoML.g:839:5: ruleEString
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
            		
            // InternalArduinoML.g:857:3: ( (lv_value_3_0= ruleSignal ) )
            // InternalArduinoML.g:858:4: (lv_value_3_0= ruleSignal )
            {
            // InternalArduinoML.g:858:4: (lv_value_3_0= ruleSignal )
            // InternalArduinoML.g:859:5: lv_value_3_0= ruleSignal
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
    // InternalArduinoML.g:880:1: entryRuleTransitionState returns [EObject current=null] : iv_ruleTransitionState= ruleTransitionState EOF ;
    public final EObject entryRuleTransitionState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransitionState = null;


        try {
            // InternalArduinoML.g:880:56: (iv_ruleTransitionState= ruleTransitionState EOF )
            // InternalArduinoML.g:881:2: iv_ruleTransitionState= ruleTransitionState EOF
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
    // InternalArduinoML.g:887:1: ruleTransitionState returns [EObject current=null] : ( ( (otherlv_0= 'when' ( ( ( ( ruleEString ) ) otherlv_2= 'is' ( (lv_d_values_3_0= ruleSignal ) ) ) | ( ( ( ruleEString ) ) ( (lv_comp_5_0= ruleCompare ) ) ( (lv_a_values_6_0= ruleEInt ) ) ) ) (otherlv_7= 'and' ( ( ( ( ruleEString ) ) otherlv_9= 'is' ( (lv_d_values_10_0= ruleSignal ) ) ) | ( ( ( ruleEString ) ) ( (lv_comp_12_0= ruleCompare ) ) ( (lv_a_values_13_0= ruleEInt ) ) ) ) )* (otherlv_14= 'wait' ( (lv_time_15_0= ruleEInt ) ) ( (lv_unit_16_0= ruleTime_unit ) ) otherlv_17= 'then' )? ) | (otherlv_18= 'wait' ( (lv_time_19_0= ruleEInt ) ) ( (lv_unit_20_0= ruleTime_unit ) ) otherlv_21= 'then' ) ) otherlv_22= 'go' otherlv_23= 'to' otherlv_24= 'state' ( ( ruleEString ) ) ) ;
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
            // InternalArduinoML.g:893:2: ( ( ( (otherlv_0= 'when' ( ( ( ( ruleEString ) ) otherlv_2= 'is' ( (lv_d_values_3_0= ruleSignal ) ) ) | ( ( ( ruleEString ) ) ( (lv_comp_5_0= ruleCompare ) ) ( (lv_a_values_6_0= ruleEInt ) ) ) ) (otherlv_7= 'and' ( ( ( ( ruleEString ) ) otherlv_9= 'is' ( (lv_d_values_10_0= ruleSignal ) ) ) | ( ( ( ruleEString ) ) ( (lv_comp_12_0= ruleCompare ) ) ( (lv_a_values_13_0= ruleEInt ) ) ) ) )* (otherlv_14= 'wait' ( (lv_time_15_0= ruleEInt ) ) ( (lv_unit_16_0= ruleTime_unit ) ) otherlv_17= 'then' )? ) | (otherlv_18= 'wait' ( (lv_time_19_0= ruleEInt ) ) ( (lv_unit_20_0= ruleTime_unit ) ) otherlv_21= 'then' ) ) otherlv_22= 'go' otherlv_23= 'to' otherlv_24= 'state' ( ( ruleEString ) ) ) )
            // InternalArduinoML.g:894:2: ( ( (otherlv_0= 'when' ( ( ( ( ruleEString ) ) otherlv_2= 'is' ( (lv_d_values_3_0= ruleSignal ) ) ) | ( ( ( ruleEString ) ) ( (lv_comp_5_0= ruleCompare ) ) ( (lv_a_values_6_0= ruleEInt ) ) ) ) (otherlv_7= 'and' ( ( ( ( ruleEString ) ) otherlv_9= 'is' ( (lv_d_values_10_0= ruleSignal ) ) ) | ( ( ( ruleEString ) ) ( (lv_comp_12_0= ruleCompare ) ) ( (lv_a_values_13_0= ruleEInt ) ) ) ) )* (otherlv_14= 'wait' ( (lv_time_15_0= ruleEInt ) ) ( (lv_unit_16_0= ruleTime_unit ) ) otherlv_17= 'then' )? ) | (otherlv_18= 'wait' ( (lv_time_19_0= ruleEInt ) ) ( (lv_unit_20_0= ruleTime_unit ) ) otherlv_21= 'then' ) ) otherlv_22= 'go' otherlv_23= 'to' otherlv_24= 'state' ( ( ruleEString ) ) )
            {
            // InternalArduinoML.g:894:2: ( ( (otherlv_0= 'when' ( ( ( ( ruleEString ) ) otherlv_2= 'is' ( (lv_d_values_3_0= ruleSignal ) ) ) | ( ( ( ruleEString ) ) ( (lv_comp_5_0= ruleCompare ) ) ( (lv_a_values_6_0= ruleEInt ) ) ) ) (otherlv_7= 'and' ( ( ( ( ruleEString ) ) otherlv_9= 'is' ( (lv_d_values_10_0= ruleSignal ) ) ) | ( ( ( ruleEString ) ) ( (lv_comp_12_0= ruleCompare ) ) ( (lv_a_values_13_0= ruleEInt ) ) ) ) )* (otherlv_14= 'wait' ( (lv_time_15_0= ruleEInt ) ) ( (lv_unit_16_0= ruleTime_unit ) ) otherlv_17= 'then' )? ) | (otherlv_18= 'wait' ( (lv_time_19_0= ruleEInt ) ) ( (lv_unit_20_0= ruleTime_unit ) ) otherlv_21= 'then' ) ) otherlv_22= 'go' otherlv_23= 'to' otherlv_24= 'state' ( ( ruleEString ) ) )
            // InternalArduinoML.g:895:3: ( (otherlv_0= 'when' ( ( ( ( ruleEString ) ) otherlv_2= 'is' ( (lv_d_values_3_0= ruleSignal ) ) ) | ( ( ( ruleEString ) ) ( (lv_comp_5_0= ruleCompare ) ) ( (lv_a_values_6_0= ruleEInt ) ) ) ) (otherlv_7= 'and' ( ( ( ( ruleEString ) ) otherlv_9= 'is' ( (lv_d_values_10_0= ruleSignal ) ) ) | ( ( ( ruleEString ) ) ( (lv_comp_12_0= ruleCompare ) ) ( (lv_a_values_13_0= ruleEInt ) ) ) ) )* (otherlv_14= 'wait' ( (lv_time_15_0= ruleEInt ) ) ( (lv_unit_16_0= ruleTime_unit ) ) otherlv_17= 'then' )? ) | (otherlv_18= 'wait' ( (lv_time_19_0= ruleEInt ) ) ( (lv_unit_20_0= ruleTime_unit ) ) otherlv_21= 'then' ) ) otherlv_22= 'go' otherlv_23= 'to' otherlv_24= 'state' ( ( ruleEString ) )
            {
            // InternalArduinoML.g:895:3: ( (otherlv_0= 'when' ( ( ( ( ruleEString ) ) otherlv_2= 'is' ( (lv_d_values_3_0= ruleSignal ) ) ) | ( ( ( ruleEString ) ) ( (lv_comp_5_0= ruleCompare ) ) ( (lv_a_values_6_0= ruleEInt ) ) ) ) (otherlv_7= 'and' ( ( ( ( ruleEString ) ) otherlv_9= 'is' ( (lv_d_values_10_0= ruleSignal ) ) ) | ( ( ( ruleEString ) ) ( (lv_comp_12_0= ruleCompare ) ) ( (lv_a_values_13_0= ruleEInt ) ) ) ) )* (otherlv_14= 'wait' ( (lv_time_15_0= ruleEInt ) ) ( (lv_unit_16_0= ruleTime_unit ) ) otherlv_17= 'then' )? ) | (otherlv_18= 'wait' ( (lv_time_19_0= ruleEInt ) ) ( (lv_unit_20_0= ruleTime_unit ) ) otherlv_21= 'then' ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==25) ) {
                alt17=1;
            }
            else if ( (LA17_0==28) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalArduinoML.g:896:4: (otherlv_0= 'when' ( ( ( ( ruleEString ) ) otherlv_2= 'is' ( (lv_d_values_3_0= ruleSignal ) ) ) | ( ( ( ruleEString ) ) ( (lv_comp_5_0= ruleCompare ) ) ( (lv_a_values_6_0= ruleEInt ) ) ) ) (otherlv_7= 'and' ( ( ( ( ruleEString ) ) otherlv_9= 'is' ( (lv_d_values_10_0= ruleSignal ) ) ) | ( ( ( ruleEString ) ) ( (lv_comp_12_0= ruleCompare ) ) ( (lv_a_values_13_0= ruleEInt ) ) ) ) )* (otherlv_14= 'wait' ( (lv_time_15_0= ruleEInt ) ) ( (lv_unit_16_0= ruleTime_unit ) ) otherlv_17= 'then' )? )
                    {
                    // InternalArduinoML.g:896:4: (otherlv_0= 'when' ( ( ( ( ruleEString ) ) otherlv_2= 'is' ( (lv_d_values_3_0= ruleSignal ) ) ) | ( ( ( ruleEString ) ) ( (lv_comp_5_0= ruleCompare ) ) ( (lv_a_values_6_0= ruleEInt ) ) ) ) (otherlv_7= 'and' ( ( ( ( ruleEString ) ) otherlv_9= 'is' ( (lv_d_values_10_0= ruleSignal ) ) ) | ( ( ( ruleEString ) ) ( (lv_comp_12_0= ruleCompare ) ) ( (lv_a_values_13_0= ruleEInt ) ) ) ) )* (otherlv_14= 'wait' ( (lv_time_15_0= ruleEInt ) ) ( (lv_unit_16_0= ruleTime_unit ) ) otherlv_17= 'then' )? )
                    // InternalArduinoML.g:897:5: otherlv_0= 'when' ( ( ( ( ruleEString ) ) otherlv_2= 'is' ( (lv_d_values_3_0= ruleSignal ) ) ) | ( ( ( ruleEString ) ) ( (lv_comp_5_0= ruleCompare ) ) ( (lv_a_values_6_0= ruleEInt ) ) ) ) (otherlv_7= 'and' ( ( ( ( ruleEString ) ) otherlv_9= 'is' ( (lv_d_values_10_0= ruleSignal ) ) ) | ( ( ( ruleEString ) ) ( (lv_comp_12_0= ruleCompare ) ) ( (lv_a_values_13_0= ruleEInt ) ) ) ) )* (otherlv_14= 'wait' ( (lv_time_15_0= ruleEInt ) ) ( (lv_unit_16_0= ruleTime_unit ) ) otherlv_17= 'then' )?
                    {
                    otherlv_0=(Token)match(input,25,FOLLOW_3); 

                    					newLeafNode(otherlv_0, grammarAccess.getTransitionStateAccess().getWhenKeyword_0_0_0());
                    				
                    // InternalArduinoML.g:901:5: ( ( ( ( ruleEString ) ) otherlv_2= 'is' ( (lv_d_values_3_0= ruleSignal ) ) ) | ( ( ( ruleEString ) ) ( (lv_comp_5_0= ruleCompare ) ) ( (lv_a_values_6_0= ruleEInt ) ) ) )
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==RULE_STRING) ) {
                        int LA13_1 = input.LA(2);

                        if ( ((LA13_1>=36 && LA13_1<=40)) ) {
                            alt13=2;
                        }
                        else if ( (LA13_1==26) ) {
                            alt13=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 13, 1, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA13_0==RULE_ID) ) {
                        int LA13_2 = input.LA(2);

                        if ( ((LA13_2>=36 && LA13_2<=40)) ) {
                            alt13=2;
                        }
                        else if ( (LA13_2==26) ) {
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
                            // InternalArduinoML.g:902:6: ( ( ( ruleEString ) ) otherlv_2= 'is' ( (lv_d_values_3_0= ruleSignal ) ) )
                            {
                            // InternalArduinoML.g:902:6: ( ( ( ruleEString ) ) otherlv_2= 'is' ( (lv_d_values_3_0= ruleSignal ) ) )
                            // InternalArduinoML.g:903:7: ( ( ruleEString ) ) otherlv_2= 'is' ( (lv_d_values_3_0= ruleSignal ) )
                            {
                            // InternalArduinoML.g:903:7: ( ( ruleEString ) )
                            // InternalArduinoML.g:904:8: ( ruleEString )
                            {
                            // InternalArduinoML.g:904:8: ( ruleEString )
                            // InternalArduinoML.g:905:9: ruleEString
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
                            						
                            // InternalArduinoML.g:923:7: ( (lv_d_values_3_0= ruleSignal ) )
                            // InternalArduinoML.g:924:8: (lv_d_values_3_0= ruleSignal )
                            {
                            // InternalArduinoML.g:924:8: (lv_d_values_3_0= ruleSignal )
                            // InternalArduinoML.g:925:9: lv_d_values_3_0= ruleSignal
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
                            // InternalArduinoML.g:944:6: ( ( ( ruleEString ) ) ( (lv_comp_5_0= ruleCompare ) ) ( (lv_a_values_6_0= ruleEInt ) ) )
                            {
                            // InternalArduinoML.g:944:6: ( ( ( ruleEString ) ) ( (lv_comp_5_0= ruleCompare ) ) ( (lv_a_values_6_0= ruleEInt ) ) )
                            // InternalArduinoML.g:945:7: ( ( ruleEString ) ) ( (lv_comp_5_0= ruleCompare ) ) ( (lv_a_values_6_0= ruleEInt ) )
                            {
                            // InternalArduinoML.g:945:7: ( ( ruleEString ) )
                            // InternalArduinoML.g:946:8: ( ruleEString )
                            {
                            // InternalArduinoML.g:946:8: ( ruleEString )
                            // InternalArduinoML.g:947:9: ruleEString
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

                            // InternalArduinoML.g:961:7: ( (lv_comp_5_0= ruleCompare ) )
                            // InternalArduinoML.g:962:8: (lv_comp_5_0= ruleCompare )
                            {
                            // InternalArduinoML.g:962:8: (lv_comp_5_0= ruleCompare )
                            // InternalArduinoML.g:963:9: lv_comp_5_0= ruleCompare
                            {

                            									newCompositeNode(grammarAccess.getTransitionStateAccess().getCompCompareEnumRuleCall_0_0_1_1_1_0());
                            								
                            pushFollow(FOLLOW_11);
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

                            // InternalArduinoML.g:980:7: ( (lv_a_values_6_0= ruleEInt ) )
                            // InternalArduinoML.g:981:8: (lv_a_values_6_0= ruleEInt )
                            {
                            // InternalArduinoML.g:981:8: (lv_a_values_6_0= ruleEInt )
                            // InternalArduinoML.g:982:9: lv_a_values_6_0= ruleEInt
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

                    // InternalArduinoML.g:1001:5: (otherlv_7= 'and' ( ( ( ( ruleEString ) ) otherlv_9= 'is' ( (lv_d_values_10_0= ruleSignal ) ) ) | ( ( ( ruleEString ) ) ( (lv_comp_12_0= ruleCompare ) ) ( (lv_a_values_13_0= ruleEInt ) ) ) ) )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==27) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // InternalArduinoML.g:1002:6: otherlv_7= 'and' ( ( ( ( ruleEString ) ) otherlv_9= 'is' ( (lv_d_values_10_0= ruleSignal ) ) ) | ( ( ( ruleEString ) ) ( (lv_comp_12_0= ruleCompare ) ) ( (lv_a_values_13_0= ruleEInt ) ) ) )
                    	    {
                    	    otherlv_7=(Token)match(input,27,FOLLOW_3); 

                    	    						newLeafNode(otherlv_7, grammarAccess.getTransitionStateAccess().getAndKeyword_0_0_2_0());
                    	    					
                    	    // InternalArduinoML.g:1006:6: ( ( ( ( ruleEString ) ) otherlv_9= 'is' ( (lv_d_values_10_0= ruleSignal ) ) ) | ( ( ( ruleEString ) ) ( (lv_comp_12_0= ruleCompare ) ) ( (lv_a_values_13_0= ruleEInt ) ) ) )
                    	    int alt14=2;
                    	    int LA14_0 = input.LA(1);

                    	    if ( (LA14_0==RULE_STRING) ) {
                    	        int LA14_1 = input.LA(2);

                    	        if ( (LA14_1==26) ) {
                    	            alt14=1;
                    	        }
                    	        else if ( ((LA14_1>=36 && LA14_1<=40)) ) {
                    	            alt14=2;
                    	        }
                    	        else {
                    	            NoViableAltException nvae =
                    	                new NoViableAltException("", 14, 1, input);

                    	            throw nvae;
                    	        }
                    	    }
                    	    else if ( (LA14_0==RULE_ID) ) {
                    	        int LA14_2 = input.LA(2);

                    	        if ( ((LA14_2>=36 && LA14_2<=40)) ) {
                    	            alt14=2;
                    	        }
                    	        else if ( (LA14_2==26) ) {
                    	            alt14=1;
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
                    	            // InternalArduinoML.g:1007:7: ( ( ( ruleEString ) ) otherlv_9= 'is' ( (lv_d_values_10_0= ruleSignal ) ) )
                    	            {
                    	            // InternalArduinoML.g:1007:7: ( ( ( ruleEString ) ) otherlv_9= 'is' ( (lv_d_values_10_0= ruleSignal ) ) )
                    	            // InternalArduinoML.g:1008:8: ( ( ruleEString ) ) otherlv_9= 'is' ( (lv_d_values_10_0= ruleSignal ) )
                    	            {
                    	            // InternalArduinoML.g:1008:8: ( ( ruleEString ) )
                    	            // InternalArduinoML.g:1009:9: ( ruleEString )
                    	            {
                    	            // InternalArduinoML.g:1009:9: ( ruleEString )
                    	            // InternalArduinoML.g:1010:10: ruleEString
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
                    	            							
                    	            // InternalArduinoML.g:1028:8: ( (lv_d_values_10_0= ruleSignal ) )
                    	            // InternalArduinoML.g:1029:9: (lv_d_values_10_0= ruleSignal )
                    	            {
                    	            // InternalArduinoML.g:1029:9: (lv_d_values_10_0= ruleSignal )
                    	            // InternalArduinoML.g:1030:10: lv_d_values_10_0= ruleSignal
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
                    	            // InternalArduinoML.g:1049:7: ( ( ( ruleEString ) ) ( (lv_comp_12_0= ruleCompare ) ) ( (lv_a_values_13_0= ruleEInt ) ) )
                    	            {
                    	            // InternalArduinoML.g:1049:7: ( ( ( ruleEString ) ) ( (lv_comp_12_0= ruleCompare ) ) ( (lv_a_values_13_0= ruleEInt ) ) )
                    	            // InternalArduinoML.g:1050:8: ( ( ruleEString ) ) ( (lv_comp_12_0= ruleCompare ) ) ( (lv_a_values_13_0= ruleEInt ) )
                    	            {
                    	            // InternalArduinoML.g:1050:8: ( ( ruleEString ) )
                    	            // InternalArduinoML.g:1051:9: ( ruleEString )
                    	            {
                    	            // InternalArduinoML.g:1051:9: ( ruleEString )
                    	            // InternalArduinoML.g:1052:10: ruleEString
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

                    	            // InternalArduinoML.g:1066:8: ( (lv_comp_12_0= ruleCompare ) )
                    	            // InternalArduinoML.g:1067:9: (lv_comp_12_0= ruleCompare )
                    	            {
                    	            // InternalArduinoML.g:1067:9: (lv_comp_12_0= ruleCompare )
                    	            // InternalArduinoML.g:1068:10: lv_comp_12_0= ruleCompare
                    	            {

                    	            										newCompositeNode(grammarAccess.getTransitionStateAccess().getCompCompareEnumRuleCall_0_0_2_1_1_1_0());
                    	            									
                    	            pushFollow(FOLLOW_11);
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

                    	            // InternalArduinoML.g:1085:8: ( (lv_a_values_13_0= ruleEInt ) )
                    	            // InternalArduinoML.g:1086:9: (lv_a_values_13_0= ruleEInt )
                    	            {
                    	            // InternalArduinoML.g:1086:9: (lv_a_values_13_0= ruleEInt )
                    	            // InternalArduinoML.g:1087:10: lv_a_values_13_0= ruleEInt
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
                    	    break loop15;
                        }
                    } while (true);

                    // InternalArduinoML.g:1107:5: (otherlv_14= 'wait' ( (lv_time_15_0= ruleEInt ) ) ( (lv_unit_16_0= ruleTime_unit ) ) otherlv_17= 'then' )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==28) ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // InternalArduinoML.g:1108:6: otherlv_14= 'wait' ( (lv_time_15_0= ruleEInt ) ) ( (lv_unit_16_0= ruleTime_unit ) ) otherlv_17= 'then'
                            {
                            otherlv_14=(Token)match(input,28,FOLLOW_11); 

                            						newLeafNode(otherlv_14, grammarAccess.getTransitionStateAccess().getWaitKeyword_0_0_3_0());
                            					
                            // InternalArduinoML.g:1112:6: ( (lv_time_15_0= ruleEInt ) )
                            // InternalArduinoML.g:1113:7: (lv_time_15_0= ruleEInt )
                            {
                            // InternalArduinoML.g:1113:7: (lv_time_15_0= ruleEInt )
                            // InternalArduinoML.g:1114:8: lv_time_15_0= ruleEInt
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

                            // InternalArduinoML.g:1131:6: ( (lv_unit_16_0= ruleTime_unit ) )
                            // InternalArduinoML.g:1132:7: (lv_unit_16_0= ruleTime_unit )
                            {
                            // InternalArduinoML.g:1132:7: (lv_unit_16_0= ruleTime_unit )
                            // InternalArduinoML.g:1133:8: lv_unit_16_0= ruleTime_unit
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
                    // InternalArduinoML.g:1157:4: (otherlv_18= 'wait' ( (lv_time_19_0= ruleEInt ) ) ( (lv_unit_20_0= ruleTime_unit ) ) otherlv_21= 'then' )
                    {
                    // InternalArduinoML.g:1157:4: (otherlv_18= 'wait' ( (lv_time_19_0= ruleEInt ) ) ( (lv_unit_20_0= ruleTime_unit ) ) otherlv_21= 'then' )
                    // InternalArduinoML.g:1158:5: otherlv_18= 'wait' ( (lv_time_19_0= ruleEInt ) ) ( (lv_unit_20_0= ruleTime_unit ) ) otherlv_21= 'then'
                    {
                    otherlv_18=(Token)match(input,28,FOLLOW_11); 

                    					newLeafNode(otherlv_18, grammarAccess.getTransitionStateAccess().getWaitKeyword_0_1_0());
                    				
                    // InternalArduinoML.g:1162:5: ( (lv_time_19_0= ruleEInt ) )
                    // InternalArduinoML.g:1163:6: (lv_time_19_0= ruleEInt )
                    {
                    // InternalArduinoML.g:1163:6: (lv_time_19_0= ruleEInt )
                    // InternalArduinoML.g:1164:7: lv_time_19_0= ruleEInt
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

                    // InternalArduinoML.g:1181:5: ( (lv_unit_20_0= ruleTime_unit ) )
                    // InternalArduinoML.g:1182:6: (lv_unit_20_0= ruleTime_unit )
                    {
                    // InternalArduinoML.g:1182:6: (lv_unit_20_0= ruleTime_unit )
                    // InternalArduinoML.g:1183:7: lv_unit_20_0= ruleTime_unit
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
            		
            otherlv_23=(Token)match(input,24,FOLLOW_12); 

            			newLeafNode(otherlv_23, grammarAccess.getTransitionStateAccess().getToKeyword_2());
            		
            otherlv_24=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_24, grammarAccess.getTransitionStateAccess().getStateKeyword_3());
            		
            // InternalArduinoML.g:1218:3: ( ( ruleEString ) )
            // InternalArduinoML.g:1219:4: ( ruleEString )
            {
            // InternalArduinoML.g:1219:4: ( ruleEString )
            // InternalArduinoML.g:1220:5: ruleEString
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
    // InternalArduinoML.g:1238:1: entryRuleTransitionMode returns [EObject current=null] : iv_ruleTransitionMode= ruleTransitionMode EOF ;
    public final EObject entryRuleTransitionMode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransitionMode = null;


        try {
            // InternalArduinoML.g:1238:55: (iv_ruleTransitionMode= ruleTransitionMode EOF )
            // InternalArduinoML.g:1239:2: iv_ruleTransitionMode= ruleTransitionMode EOF
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
    // InternalArduinoML.g:1245:1: ruleTransitionMode returns [EObject current=null] : ( ( (otherlv_0= 'when' ( ( ( ( ruleEString ) ) otherlv_2= 'is' ( (lv_d_values_3_0= ruleSignal ) ) ) | ( ( ( ruleEString ) ) ( (lv_comp_5_0= ruleCompare ) ) ( (lv_a_values_6_0= ruleEInt ) ) ) ) (otherlv_7= 'and' ( ( ( ( ruleEString ) ) otherlv_9= 'is' ( (lv_d_values_10_0= ruleSignal ) ) ) | ( ( ( ruleEString ) ) ( (lv_comp_12_0= ruleCompare ) ) ( (lv_a_values_13_0= ruleEInt ) ) ) ) )* (otherlv_14= 'wait' ( (lv_time_15_0= ruleEInt ) ) ( (lv_unit_16_0= ruleTime_unit ) ) otherlv_17= 'then' )? ) | (otherlv_18= 'wait' ( (lv_time_19_0= ruleEInt ) ) ( (lv_unit_20_0= ruleTime_unit ) ) otherlv_21= 'then' ) ) otherlv_22= 'go' otherlv_23= 'to' otherlv_24= 'mode' ( ( ruleEString ) ) ) ;
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
            // InternalArduinoML.g:1251:2: ( ( ( (otherlv_0= 'when' ( ( ( ( ruleEString ) ) otherlv_2= 'is' ( (lv_d_values_3_0= ruleSignal ) ) ) | ( ( ( ruleEString ) ) ( (lv_comp_5_0= ruleCompare ) ) ( (lv_a_values_6_0= ruleEInt ) ) ) ) (otherlv_7= 'and' ( ( ( ( ruleEString ) ) otherlv_9= 'is' ( (lv_d_values_10_0= ruleSignal ) ) ) | ( ( ( ruleEString ) ) ( (lv_comp_12_0= ruleCompare ) ) ( (lv_a_values_13_0= ruleEInt ) ) ) ) )* (otherlv_14= 'wait' ( (lv_time_15_0= ruleEInt ) ) ( (lv_unit_16_0= ruleTime_unit ) ) otherlv_17= 'then' )? ) | (otherlv_18= 'wait' ( (lv_time_19_0= ruleEInt ) ) ( (lv_unit_20_0= ruleTime_unit ) ) otherlv_21= 'then' ) ) otherlv_22= 'go' otherlv_23= 'to' otherlv_24= 'mode' ( ( ruleEString ) ) ) )
            // InternalArduinoML.g:1252:2: ( ( (otherlv_0= 'when' ( ( ( ( ruleEString ) ) otherlv_2= 'is' ( (lv_d_values_3_0= ruleSignal ) ) ) | ( ( ( ruleEString ) ) ( (lv_comp_5_0= ruleCompare ) ) ( (lv_a_values_6_0= ruleEInt ) ) ) ) (otherlv_7= 'and' ( ( ( ( ruleEString ) ) otherlv_9= 'is' ( (lv_d_values_10_0= ruleSignal ) ) ) | ( ( ( ruleEString ) ) ( (lv_comp_12_0= ruleCompare ) ) ( (lv_a_values_13_0= ruleEInt ) ) ) ) )* (otherlv_14= 'wait' ( (lv_time_15_0= ruleEInt ) ) ( (lv_unit_16_0= ruleTime_unit ) ) otherlv_17= 'then' )? ) | (otherlv_18= 'wait' ( (lv_time_19_0= ruleEInt ) ) ( (lv_unit_20_0= ruleTime_unit ) ) otherlv_21= 'then' ) ) otherlv_22= 'go' otherlv_23= 'to' otherlv_24= 'mode' ( ( ruleEString ) ) )
            {
            // InternalArduinoML.g:1252:2: ( ( (otherlv_0= 'when' ( ( ( ( ruleEString ) ) otherlv_2= 'is' ( (lv_d_values_3_0= ruleSignal ) ) ) | ( ( ( ruleEString ) ) ( (lv_comp_5_0= ruleCompare ) ) ( (lv_a_values_6_0= ruleEInt ) ) ) ) (otherlv_7= 'and' ( ( ( ( ruleEString ) ) otherlv_9= 'is' ( (lv_d_values_10_0= ruleSignal ) ) ) | ( ( ( ruleEString ) ) ( (lv_comp_12_0= ruleCompare ) ) ( (lv_a_values_13_0= ruleEInt ) ) ) ) )* (otherlv_14= 'wait' ( (lv_time_15_0= ruleEInt ) ) ( (lv_unit_16_0= ruleTime_unit ) ) otherlv_17= 'then' )? ) | (otherlv_18= 'wait' ( (lv_time_19_0= ruleEInt ) ) ( (lv_unit_20_0= ruleTime_unit ) ) otherlv_21= 'then' ) ) otherlv_22= 'go' otherlv_23= 'to' otherlv_24= 'mode' ( ( ruleEString ) ) )
            // InternalArduinoML.g:1253:3: ( (otherlv_0= 'when' ( ( ( ( ruleEString ) ) otherlv_2= 'is' ( (lv_d_values_3_0= ruleSignal ) ) ) | ( ( ( ruleEString ) ) ( (lv_comp_5_0= ruleCompare ) ) ( (lv_a_values_6_0= ruleEInt ) ) ) ) (otherlv_7= 'and' ( ( ( ( ruleEString ) ) otherlv_9= 'is' ( (lv_d_values_10_0= ruleSignal ) ) ) | ( ( ( ruleEString ) ) ( (lv_comp_12_0= ruleCompare ) ) ( (lv_a_values_13_0= ruleEInt ) ) ) ) )* (otherlv_14= 'wait' ( (lv_time_15_0= ruleEInt ) ) ( (lv_unit_16_0= ruleTime_unit ) ) otherlv_17= 'then' )? ) | (otherlv_18= 'wait' ( (lv_time_19_0= ruleEInt ) ) ( (lv_unit_20_0= ruleTime_unit ) ) otherlv_21= 'then' ) ) otherlv_22= 'go' otherlv_23= 'to' otherlv_24= 'mode' ( ( ruleEString ) )
            {
            // InternalArduinoML.g:1253:3: ( (otherlv_0= 'when' ( ( ( ( ruleEString ) ) otherlv_2= 'is' ( (lv_d_values_3_0= ruleSignal ) ) ) | ( ( ( ruleEString ) ) ( (lv_comp_5_0= ruleCompare ) ) ( (lv_a_values_6_0= ruleEInt ) ) ) ) (otherlv_7= 'and' ( ( ( ( ruleEString ) ) otherlv_9= 'is' ( (lv_d_values_10_0= ruleSignal ) ) ) | ( ( ( ruleEString ) ) ( (lv_comp_12_0= ruleCompare ) ) ( (lv_a_values_13_0= ruleEInt ) ) ) ) )* (otherlv_14= 'wait' ( (lv_time_15_0= ruleEInt ) ) ( (lv_unit_16_0= ruleTime_unit ) ) otherlv_17= 'then' )? ) | (otherlv_18= 'wait' ( (lv_time_19_0= ruleEInt ) ) ( (lv_unit_20_0= ruleTime_unit ) ) otherlv_21= 'then' ) )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==25) ) {
                alt22=1;
            }
            else if ( (LA22_0==28) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // InternalArduinoML.g:1254:4: (otherlv_0= 'when' ( ( ( ( ruleEString ) ) otherlv_2= 'is' ( (lv_d_values_3_0= ruleSignal ) ) ) | ( ( ( ruleEString ) ) ( (lv_comp_5_0= ruleCompare ) ) ( (lv_a_values_6_0= ruleEInt ) ) ) ) (otherlv_7= 'and' ( ( ( ( ruleEString ) ) otherlv_9= 'is' ( (lv_d_values_10_0= ruleSignal ) ) ) | ( ( ( ruleEString ) ) ( (lv_comp_12_0= ruleCompare ) ) ( (lv_a_values_13_0= ruleEInt ) ) ) ) )* (otherlv_14= 'wait' ( (lv_time_15_0= ruleEInt ) ) ( (lv_unit_16_0= ruleTime_unit ) ) otherlv_17= 'then' )? )
                    {
                    // InternalArduinoML.g:1254:4: (otherlv_0= 'when' ( ( ( ( ruleEString ) ) otherlv_2= 'is' ( (lv_d_values_3_0= ruleSignal ) ) ) | ( ( ( ruleEString ) ) ( (lv_comp_5_0= ruleCompare ) ) ( (lv_a_values_6_0= ruleEInt ) ) ) ) (otherlv_7= 'and' ( ( ( ( ruleEString ) ) otherlv_9= 'is' ( (lv_d_values_10_0= ruleSignal ) ) ) | ( ( ( ruleEString ) ) ( (lv_comp_12_0= ruleCompare ) ) ( (lv_a_values_13_0= ruleEInt ) ) ) ) )* (otherlv_14= 'wait' ( (lv_time_15_0= ruleEInt ) ) ( (lv_unit_16_0= ruleTime_unit ) ) otherlv_17= 'then' )? )
                    // InternalArduinoML.g:1255:5: otherlv_0= 'when' ( ( ( ( ruleEString ) ) otherlv_2= 'is' ( (lv_d_values_3_0= ruleSignal ) ) ) | ( ( ( ruleEString ) ) ( (lv_comp_5_0= ruleCompare ) ) ( (lv_a_values_6_0= ruleEInt ) ) ) ) (otherlv_7= 'and' ( ( ( ( ruleEString ) ) otherlv_9= 'is' ( (lv_d_values_10_0= ruleSignal ) ) ) | ( ( ( ruleEString ) ) ( (lv_comp_12_0= ruleCompare ) ) ( (lv_a_values_13_0= ruleEInt ) ) ) ) )* (otherlv_14= 'wait' ( (lv_time_15_0= ruleEInt ) ) ( (lv_unit_16_0= ruleTime_unit ) ) otherlv_17= 'then' )?
                    {
                    otherlv_0=(Token)match(input,25,FOLLOW_3); 

                    					newLeafNode(otherlv_0, grammarAccess.getTransitionModeAccess().getWhenKeyword_0_0_0());
                    				
                    // InternalArduinoML.g:1259:5: ( ( ( ( ruleEString ) ) otherlv_2= 'is' ( (lv_d_values_3_0= ruleSignal ) ) ) | ( ( ( ruleEString ) ) ( (lv_comp_5_0= ruleCompare ) ) ( (lv_a_values_6_0= ruleEInt ) ) ) )
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==RULE_STRING) ) {
                        int LA18_1 = input.LA(2);

                        if ( (LA18_1==26) ) {
                            alt18=1;
                        }
                        else if ( ((LA18_1>=36 && LA18_1<=40)) ) {
                            alt18=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 18, 1, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA18_0==RULE_ID) ) {
                        int LA18_2 = input.LA(2);

                        if ( ((LA18_2>=36 && LA18_2<=40)) ) {
                            alt18=2;
                        }
                        else if ( (LA18_2==26) ) {
                            alt18=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 18, 2, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 18, 0, input);

                        throw nvae;
                    }
                    switch (alt18) {
                        case 1 :
                            // InternalArduinoML.g:1260:6: ( ( ( ruleEString ) ) otherlv_2= 'is' ( (lv_d_values_3_0= ruleSignal ) ) )
                            {
                            // InternalArduinoML.g:1260:6: ( ( ( ruleEString ) ) otherlv_2= 'is' ( (lv_d_values_3_0= ruleSignal ) ) )
                            // InternalArduinoML.g:1261:7: ( ( ruleEString ) ) otherlv_2= 'is' ( (lv_d_values_3_0= ruleSignal ) )
                            {
                            // InternalArduinoML.g:1261:7: ( ( ruleEString ) )
                            // InternalArduinoML.g:1262:8: ( ruleEString )
                            {
                            // InternalArduinoML.g:1262:8: ( ruleEString )
                            // InternalArduinoML.g:1263:9: ruleEString
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
                            						
                            // InternalArduinoML.g:1281:7: ( (lv_d_values_3_0= ruleSignal ) )
                            // InternalArduinoML.g:1282:8: (lv_d_values_3_0= ruleSignal )
                            {
                            // InternalArduinoML.g:1282:8: (lv_d_values_3_0= ruleSignal )
                            // InternalArduinoML.g:1283:9: lv_d_values_3_0= ruleSignal
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
                            // InternalArduinoML.g:1302:6: ( ( ( ruleEString ) ) ( (lv_comp_5_0= ruleCompare ) ) ( (lv_a_values_6_0= ruleEInt ) ) )
                            {
                            // InternalArduinoML.g:1302:6: ( ( ( ruleEString ) ) ( (lv_comp_5_0= ruleCompare ) ) ( (lv_a_values_6_0= ruleEInt ) ) )
                            // InternalArduinoML.g:1303:7: ( ( ruleEString ) ) ( (lv_comp_5_0= ruleCompare ) ) ( (lv_a_values_6_0= ruleEInt ) )
                            {
                            // InternalArduinoML.g:1303:7: ( ( ruleEString ) )
                            // InternalArduinoML.g:1304:8: ( ruleEString )
                            {
                            // InternalArduinoML.g:1304:8: ( ruleEString )
                            // InternalArduinoML.g:1305:9: ruleEString
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

                            // InternalArduinoML.g:1319:7: ( (lv_comp_5_0= ruleCompare ) )
                            // InternalArduinoML.g:1320:8: (lv_comp_5_0= ruleCompare )
                            {
                            // InternalArduinoML.g:1320:8: (lv_comp_5_0= ruleCompare )
                            // InternalArduinoML.g:1321:9: lv_comp_5_0= ruleCompare
                            {

                            									newCompositeNode(grammarAccess.getTransitionModeAccess().getCompCompareEnumRuleCall_0_0_1_1_1_0());
                            								
                            pushFollow(FOLLOW_11);
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

                            // InternalArduinoML.g:1338:7: ( (lv_a_values_6_0= ruleEInt ) )
                            // InternalArduinoML.g:1339:8: (lv_a_values_6_0= ruleEInt )
                            {
                            // InternalArduinoML.g:1339:8: (lv_a_values_6_0= ruleEInt )
                            // InternalArduinoML.g:1340:9: lv_a_values_6_0= ruleEInt
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

                    // InternalArduinoML.g:1359:5: (otherlv_7= 'and' ( ( ( ( ruleEString ) ) otherlv_9= 'is' ( (lv_d_values_10_0= ruleSignal ) ) ) | ( ( ( ruleEString ) ) ( (lv_comp_12_0= ruleCompare ) ) ( (lv_a_values_13_0= ruleEInt ) ) ) ) )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==27) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // InternalArduinoML.g:1360:6: otherlv_7= 'and' ( ( ( ( ruleEString ) ) otherlv_9= 'is' ( (lv_d_values_10_0= ruleSignal ) ) ) | ( ( ( ruleEString ) ) ( (lv_comp_12_0= ruleCompare ) ) ( (lv_a_values_13_0= ruleEInt ) ) ) )
                    	    {
                    	    otherlv_7=(Token)match(input,27,FOLLOW_3); 

                    	    						newLeafNode(otherlv_7, grammarAccess.getTransitionModeAccess().getAndKeyword_0_0_2_0());
                    	    					
                    	    // InternalArduinoML.g:1364:6: ( ( ( ( ruleEString ) ) otherlv_9= 'is' ( (lv_d_values_10_0= ruleSignal ) ) ) | ( ( ( ruleEString ) ) ( (lv_comp_12_0= ruleCompare ) ) ( (lv_a_values_13_0= ruleEInt ) ) ) )
                    	    int alt19=2;
                    	    int LA19_0 = input.LA(1);

                    	    if ( (LA19_0==RULE_STRING) ) {
                    	        int LA19_1 = input.LA(2);

                    	        if ( (LA19_1==26) ) {
                    	            alt19=1;
                    	        }
                    	        else if ( ((LA19_1>=36 && LA19_1<=40)) ) {
                    	            alt19=2;
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
                    	            // InternalArduinoML.g:1365:7: ( ( ( ruleEString ) ) otherlv_9= 'is' ( (lv_d_values_10_0= ruleSignal ) ) )
                    	            {
                    	            // InternalArduinoML.g:1365:7: ( ( ( ruleEString ) ) otherlv_9= 'is' ( (lv_d_values_10_0= ruleSignal ) ) )
                    	            // InternalArduinoML.g:1366:8: ( ( ruleEString ) ) otherlv_9= 'is' ( (lv_d_values_10_0= ruleSignal ) )
                    	            {
                    	            // InternalArduinoML.g:1366:8: ( ( ruleEString ) )
                    	            // InternalArduinoML.g:1367:9: ( ruleEString )
                    	            {
                    	            // InternalArduinoML.g:1367:9: ( ruleEString )
                    	            // InternalArduinoML.g:1368:10: ruleEString
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
                    	            							
                    	            // InternalArduinoML.g:1386:8: ( (lv_d_values_10_0= ruleSignal ) )
                    	            // InternalArduinoML.g:1387:9: (lv_d_values_10_0= ruleSignal )
                    	            {
                    	            // InternalArduinoML.g:1387:9: (lv_d_values_10_0= ruleSignal )
                    	            // InternalArduinoML.g:1388:10: lv_d_values_10_0= ruleSignal
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
                    	            // InternalArduinoML.g:1407:7: ( ( ( ruleEString ) ) ( (lv_comp_12_0= ruleCompare ) ) ( (lv_a_values_13_0= ruleEInt ) ) )
                    	            {
                    	            // InternalArduinoML.g:1407:7: ( ( ( ruleEString ) ) ( (lv_comp_12_0= ruleCompare ) ) ( (lv_a_values_13_0= ruleEInt ) ) )
                    	            // InternalArduinoML.g:1408:8: ( ( ruleEString ) ) ( (lv_comp_12_0= ruleCompare ) ) ( (lv_a_values_13_0= ruleEInt ) )
                    	            {
                    	            // InternalArduinoML.g:1408:8: ( ( ruleEString ) )
                    	            // InternalArduinoML.g:1409:9: ( ruleEString )
                    	            {
                    	            // InternalArduinoML.g:1409:9: ( ruleEString )
                    	            // InternalArduinoML.g:1410:10: ruleEString
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

                    	            // InternalArduinoML.g:1424:8: ( (lv_comp_12_0= ruleCompare ) )
                    	            // InternalArduinoML.g:1425:9: (lv_comp_12_0= ruleCompare )
                    	            {
                    	            // InternalArduinoML.g:1425:9: (lv_comp_12_0= ruleCompare )
                    	            // InternalArduinoML.g:1426:10: lv_comp_12_0= ruleCompare
                    	            {

                    	            										newCompositeNode(grammarAccess.getTransitionModeAccess().getCompCompareEnumRuleCall_0_0_2_1_1_1_0());
                    	            									
                    	            pushFollow(FOLLOW_11);
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

                    	            // InternalArduinoML.g:1443:8: ( (lv_a_values_13_0= ruleEInt ) )
                    	            // InternalArduinoML.g:1444:9: (lv_a_values_13_0= ruleEInt )
                    	            {
                    	            // InternalArduinoML.g:1444:9: (lv_a_values_13_0= ruleEInt )
                    	            // InternalArduinoML.g:1445:10: lv_a_values_13_0= ruleEInt
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
                    	    break loop20;
                        }
                    } while (true);

                    // InternalArduinoML.g:1465:5: (otherlv_14= 'wait' ( (lv_time_15_0= ruleEInt ) ) ( (lv_unit_16_0= ruleTime_unit ) ) otherlv_17= 'then' )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==28) ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // InternalArduinoML.g:1466:6: otherlv_14= 'wait' ( (lv_time_15_0= ruleEInt ) ) ( (lv_unit_16_0= ruleTime_unit ) ) otherlv_17= 'then'
                            {
                            otherlv_14=(Token)match(input,28,FOLLOW_11); 

                            						newLeafNode(otherlv_14, grammarAccess.getTransitionModeAccess().getWaitKeyword_0_0_3_0());
                            					
                            // InternalArduinoML.g:1470:6: ( (lv_time_15_0= ruleEInt ) )
                            // InternalArduinoML.g:1471:7: (lv_time_15_0= ruleEInt )
                            {
                            // InternalArduinoML.g:1471:7: (lv_time_15_0= ruleEInt )
                            // InternalArduinoML.g:1472:8: lv_time_15_0= ruleEInt
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

                            // InternalArduinoML.g:1489:6: ( (lv_unit_16_0= ruleTime_unit ) )
                            // InternalArduinoML.g:1490:7: (lv_unit_16_0= ruleTime_unit )
                            {
                            // InternalArduinoML.g:1490:7: (lv_unit_16_0= ruleTime_unit )
                            // InternalArduinoML.g:1491:8: lv_unit_16_0= ruleTime_unit
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
                    // InternalArduinoML.g:1515:4: (otherlv_18= 'wait' ( (lv_time_19_0= ruleEInt ) ) ( (lv_unit_20_0= ruleTime_unit ) ) otherlv_21= 'then' )
                    {
                    // InternalArduinoML.g:1515:4: (otherlv_18= 'wait' ( (lv_time_19_0= ruleEInt ) ) ( (lv_unit_20_0= ruleTime_unit ) ) otherlv_21= 'then' )
                    // InternalArduinoML.g:1516:5: otherlv_18= 'wait' ( (lv_time_19_0= ruleEInt ) ) ( (lv_unit_20_0= ruleTime_unit ) ) otherlv_21= 'then'
                    {
                    otherlv_18=(Token)match(input,28,FOLLOW_11); 

                    					newLeafNode(otherlv_18, grammarAccess.getTransitionModeAccess().getWaitKeyword_0_1_0());
                    				
                    // InternalArduinoML.g:1520:5: ( (lv_time_19_0= ruleEInt ) )
                    // InternalArduinoML.g:1521:6: (lv_time_19_0= ruleEInt )
                    {
                    // InternalArduinoML.g:1521:6: (lv_time_19_0= ruleEInt )
                    // InternalArduinoML.g:1522:7: lv_time_19_0= ruleEInt
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

                    // InternalArduinoML.g:1539:5: ( (lv_unit_20_0= ruleTime_unit ) )
                    // InternalArduinoML.g:1540:6: (lv_unit_20_0= ruleTime_unit )
                    {
                    // InternalArduinoML.g:1540:6: (lv_unit_20_0= ruleTime_unit )
                    // InternalArduinoML.g:1541:7: lv_unit_20_0= ruleTime_unit
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
            		
            otherlv_23=(Token)match(input,24,FOLLOW_5); 

            			newLeafNode(otherlv_23, grammarAccess.getTransitionModeAccess().getToKeyword_2());
            		
            otherlv_24=(Token)match(input,13,FOLLOW_3); 

            			newLeafNode(otherlv_24, grammarAccess.getTransitionModeAccess().getModeKeyword_3());
            		
            // InternalArduinoML.g:1576:3: ( ( ruleEString ) )
            // InternalArduinoML.g:1577:4: ( ruleEString )
            {
            // InternalArduinoML.g:1577:4: ( ruleEString )
            // InternalArduinoML.g:1578:5: ruleEString
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
    // InternalArduinoML.g:1596:1: ruleSignal returns [Enumerator current=null] : ( (enumLiteral_0= 'HIGH' ) | (enumLiteral_1= 'LOW' ) ) ;
    public final Enumerator ruleSignal() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalArduinoML.g:1602:2: ( ( (enumLiteral_0= 'HIGH' ) | (enumLiteral_1= 'LOW' ) ) )
            // InternalArduinoML.g:1603:2: ( (enumLiteral_0= 'HIGH' ) | (enumLiteral_1= 'LOW' ) )
            {
            // InternalArduinoML.g:1603:2: ( (enumLiteral_0= 'HIGH' ) | (enumLiteral_1= 'LOW' ) )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==31) ) {
                alt23=1;
            }
            else if ( (LA23_0==32) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // InternalArduinoML.g:1604:3: (enumLiteral_0= 'HIGH' )
                    {
                    // InternalArduinoML.g:1604:3: (enumLiteral_0= 'HIGH' )
                    // InternalArduinoML.g:1605:4: enumLiteral_0= 'HIGH'
                    {
                    enumLiteral_0=(Token)match(input,31,FOLLOW_2); 

                    				current = grammarAccess.getSignalAccess().getHIGHEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getSignalAccess().getHIGHEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalArduinoML.g:1612:3: (enumLiteral_1= 'LOW' )
                    {
                    // InternalArduinoML.g:1612:3: (enumLiteral_1= 'LOW' )
                    // InternalArduinoML.g:1613:4: enumLiteral_1= 'LOW'
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
    // InternalArduinoML.g:1623:1: ruleTime_unit returns [Enumerator current=null] : ( (enumLiteral_0= 'ms' ) | (enumLiteral_1= 's' ) | (enumLiteral_2= 'min' ) ) ;
    public final Enumerator ruleTime_unit() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalArduinoML.g:1629:2: ( ( (enumLiteral_0= 'ms' ) | (enumLiteral_1= 's' ) | (enumLiteral_2= 'min' ) ) )
            // InternalArduinoML.g:1630:2: ( (enumLiteral_0= 'ms' ) | (enumLiteral_1= 's' ) | (enumLiteral_2= 'min' ) )
            {
            // InternalArduinoML.g:1630:2: ( (enumLiteral_0= 'ms' ) | (enumLiteral_1= 's' ) | (enumLiteral_2= 'min' ) )
            int alt24=3;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt24=1;
                }
                break;
            case 34:
                {
                alt24=2;
                }
                break;
            case 35:
                {
                alt24=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // InternalArduinoML.g:1631:3: (enumLiteral_0= 'ms' )
                    {
                    // InternalArduinoML.g:1631:3: (enumLiteral_0= 'ms' )
                    // InternalArduinoML.g:1632:4: enumLiteral_0= 'ms'
                    {
                    enumLiteral_0=(Token)match(input,33,FOLLOW_2); 

                    				current = grammarAccess.getTime_unitAccess().getMsEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTime_unitAccess().getMsEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalArduinoML.g:1639:3: (enumLiteral_1= 's' )
                    {
                    // InternalArduinoML.g:1639:3: (enumLiteral_1= 's' )
                    // InternalArduinoML.g:1640:4: enumLiteral_1= 's'
                    {
                    enumLiteral_1=(Token)match(input,34,FOLLOW_2); 

                    				current = grammarAccess.getTime_unitAccess().getSEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTime_unitAccess().getSEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalArduinoML.g:1647:3: (enumLiteral_2= 'min' )
                    {
                    // InternalArduinoML.g:1647:3: (enumLiteral_2= 'min' )
                    // InternalArduinoML.g:1648:4: enumLiteral_2= 'min'
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
    // InternalArduinoML.g:1658:1: ruleCompare returns [Enumerator current=null] : ( (enumLiteral_0= 'inf' ) | (enumLiteral_1= 'einf' ) | (enumLiteral_2= 'equal' ) | (enumLiteral_3= 'esup' ) | (enumLiteral_4= 'sup' ) ) ;
    public final Enumerator ruleCompare() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalArduinoML.g:1664:2: ( ( (enumLiteral_0= 'inf' ) | (enumLiteral_1= 'einf' ) | (enumLiteral_2= 'equal' ) | (enumLiteral_3= 'esup' ) | (enumLiteral_4= 'sup' ) ) )
            // InternalArduinoML.g:1665:2: ( (enumLiteral_0= 'inf' ) | (enumLiteral_1= 'einf' ) | (enumLiteral_2= 'equal' ) | (enumLiteral_3= 'esup' ) | (enumLiteral_4= 'sup' ) )
            {
            // InternalArduinoML.g:1665:2: ( (enumLiteral_0= 'inf' ) | (enumLiteral_1= 'einf' ) | (enumLiteral_2= 'equal' ) | (enumLiteral_3= 'esup' ) | (enumLiteral_4= 'sup' ) )
            int alt25=5;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt25=1;
                }
                break;
            case 37:
                {
                alt25=2;
                }
                break;
            case 38:
                {
                alt25=3;
                }
                break;
            case 39:
                {
                alt25=4;
                }
                break;
            case 40:
                {
                alt25=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // InternalArduinoML.g:1666:3: (enumLiteral_0= 'inf' )
                    {
                    // InternalArduinoML.g:1666:3: (enumLiteral_0= 'inf' )
                    // InternalArduinoML.g:1667:4: enumLiteral_0= 'inf'
                    {
                    enumLiteral_0=(Token)match(input,36,FOLLOW_2); 

                    				current = grammarAccess.getCompareAccess().getInfEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getCompareAccess().getInfEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalArduinoML.g:1674:3: (enumLiteral_1= 'einf' )
                    {
                    // InternalArduinoML.g:1674:3: (enumLiteral_1= 'einf' )
                    // InternalArduinoML.g:1675:4: enumLiteral_1= 'einf'
                    {
                    enumLiteral_1=(Token)match(input,37,FOLLOW_2); 

                    				current = grammarAccess.getCompareAccess().getEinfEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getCompareAccess().getEinfEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalArduinoML.g:1682:3: (enumLiteral_2= 'equal' )
                    {
                    // InternalArduinoML.g:1682:3: (enumLiteral_2= 'equal' )
                    // InternalArduinoML.g:1683:4: enumLiteral_2= 'equal'
                    {
                    enumLiteral_2=(Token)match(input,38,FOLLOW_2); 

                    				current = grammarAccess.getCompareAccess().getEqualEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getCompareAccess().getEqualEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalArduinoML.g:1690:3: (enumLiteral_3= 'esup' )
                    {
                    // InternalArduinoML.g:1690:3: (enumLiteral_3= 'esup' )
                    // InternalArduinoML.g:1691:4: enumLiteral_3= 'esup'
                    {
                    enumLiteral_3=(Token)match(input,39,FOLLOW_2); 

                    				current = grammarAccess.getCompareAccess().getEsupEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getCompareAccess().getEsupEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalArduinoML.g:1698:3: (enumLiteral_4= 'sup' )
                    {
                    // InternalArduinoML.g:1698:3: (enumLiteral_4= 'sup' )
                    // InternalArduinoML.g:1699:4: enumLiteral_4= 'sup'
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
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000048000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000740000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000080032L});
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