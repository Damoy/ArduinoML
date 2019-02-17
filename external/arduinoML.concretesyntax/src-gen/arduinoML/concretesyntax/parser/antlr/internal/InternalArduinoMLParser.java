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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_BOOLEAN_CONSTANT", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'enable'", "'monitoring'", "'app'", "'initial'", "'mode'", "':'", "'bricks'", "'modes'", "'with'", "'debug'", "'state'", "'states'", "'transitions'", "'Actuator'", "'Digital'", "'Analog'", "'change'", "'to'", "'when'", "'is'", "'and'", "'wait'", "'then'", "'go'", "'HIGH'", "'LOW'", "'ms'", "'s'", "'min'", "'inf'", "'einf'", "'equal'", "'esup'", "'sup'"
    };
    public static final int RULE_BOOLEAN_CONSTANT=6;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=7;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=4;
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
    // InternalArduinoML.g:72:1: ruleApp returns [EObject current=null] : ( (otherlv_0= 'enable' otherlv_1= 'monitoring' ( (lv_monitoring_2_0= ruleEBoolean ) ) )? ( (otherlv_3= 'app' ( (lv_name_4_0= ruleEString ) ) otherlv_5= 'initial' otherlv_6= 'mode' ( ( ruleEString ) ) otherlv_8= ':' otherlv_9= 'bricks' otherlv_10= ':' ( (lv_bricks_11_0= ruleBrick ) ) ( (lv_bricks_12_0= ruleBrick ) )* otherlv_13= 'modes' otherlv_14= ':' ( (lv_modes_15_0= ruleMode ) ) ( (lv_modes_16_0= ruleMode ) )* ) | (otherlv_17= 'app' ( (lv_modes_18_0= ruleMode ) ) ) ) ) ;
    public final EObject ruleApp() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_17=null;
        AntlrDatatypeRuleToken lv_monitoring_2_0 = null;

        AntlrDatatypeRuleToken lv_name_4_0 = null;

        EObject lv_bricks_11_0 = null;

        EObject lv_bricks_12_0 = null;

        EObject lv_modes_15_0 = null;

        EObject lv_modes_16_0 = null;

        EObject lv_modes_18_0 = null;



        	enterRule();

        try {
            // InternalArduinoML.g:78:2: ( ( (otherlv_0= 'enable' otherlv_1= 'monitoring' ( (lv_monitoring_2_0= ruleEBoolean ) ) )? ( (otherlv_3= 'app' ( (lv_name_4_0= ruleEString ) ) otherlv_5= 'initial' otherlv_6= 'mode' ( ( ruleEString ) ) otherlv_8= ':' otherlv_9= 'bricks' otherlv_10= ':' ( (lv_bricks_11_0= ruleBrick ) ) ( (lv_bricks_12_0= ruleBrick ) )* otherlv_13= 'modes' otherlv_14= ':' ( (lv_modes_15_0= ruleMode ) ) ( (lv_modes_16_0= ruleMode ) )* ) | (otherlv_17= 'app' ( (lv_modes_18_0= ruleMode ) ) ) ) ) )
            // InternalArduinoML.g:79:2: ( (otherlv_0= 'enable' otherlv_1= 'monitoring' ( (lv_monitoring_2_0= ruleEBoolean ) ) )? ( (otherlv_3= 'app' ( (lv_name_4_0= ruleEString ) ) otherlv_5= 'initial' otherlv_6= 'mode' ( ( ruleEString ) ) otherlv_8= ':' otherlv_9= 'bricks' otherlv_10= ':' ( (lv_bricks_11_0= ruleBrick ) ) ( (lv_bricks_12_0= ruleBrick ) )* otherlv_13= 'modes' otherlv_14= ':' ( (lv_modes_15_0= ruleMode ) ) ( (lv_modes_16_0= ruleMode ) )* ) | (otherlv_17= 'app' ( (lv_modes_18_0= ruleMode ) ) ) ) )
            {
            // InternalArduinoML.g:79:2: ( (otherlv_0= 'enable' otherlv_1= 'monitoring' ( (lv_monitoring_2_0= ruleEBoolean ) ) )? ( (otherlv_3= 'app' ( (lv_name_4_0= ruleEString ) ) otherlv_5= 'initial' otherlv_6= 'mode' ( ( ruleEString ) ) otherlv_8= ':' otherlv_9= 'bricks' otherlv_10= ':' ( (lv_bricks_11_0= ruleBrick ) ) ( (lv_bricks_12_0= ruleBrick ) )* otherlv_13= 'modes' otherlv_14= ':' ( (lv_modes_15_0= ruleMode ) ) ( (lv_modes_16_0= ruleMode ) )* ) | (otherlv_17= 'app' ( (lv_modes_18_0= ruleMode ) ) ) ) )
            // InternalArduinoML.g:80:3: (otherlv_0= 'enable' otherlv_1= 'monitoring' ( (lv_monitoring_2_0= ruleEBoolean ) ) )? ( (otherlv_3= 'app' ( (lv_name_4_0= ruleEString ) ) otherlv_5= 'initial' otherlv_6= 'mode' ( ( ruleEString ) ) otherlv_8= ':' otherlv_9= 'bricks' otherlv_10= ':' ( (lv_bricks_11_0= ruleBrick ) ) ( (lv_bricks_12_0= ruleBrick ) )* otherlv_13= 'modes' otherlv_14= ':' ( (lv_modes_15_0= ruleMode ) ) ( (lv_modes_16_0= ruleMode ) )* ) | (otherlv_17= 'app' ( (lv_modes_18_0= ruleMode ) ) ) )
            {
            // InternalArduinoML.g:80:3: (otherlv_0= 'enable' otherlv_1= 'monitoring' ( (lv_monitoring_2_0= ruleEBoolean ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==12) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalArduinoML.g:81:4: otherlv_0= 'enable' otherlv_1= 'monitoring' ( (lv_monitoring_2_0= ruleEBoolean ) )
                    {
                    otherlv_0=(Token)match(input,12,FOLLOW_3); 

                    				newLeafNode(otherlv_0, grammarAccess.getAppAccess().getEnableKeyword_0_0());
                    			
                    otherlv_1=(Token)match(input,13,FOLLOW_4); 

                    				newLeafNode(otherlv_1, grammarAccess.getAppAccess().getMonitoringKeyword_0_1());
                    			
                    // InternalArduinoML.g:89:4: ( (lv_monitoring_2_0= ruleEBoolean ) )
                    // InternalArduinoML.g:90:5: (lv_monitoring_2_0= ruleEBoolean )
                    {
                    // InternalArduinoML.g:90:5: (lv_monitoring_2_0= ruleEBoolean )
                    // InternalArduinoML.g:91:6: lv_monitoring_2_0= ruleEBoolean
                    {

                    						newCompositeNode(grammarAccess.getAppAccess().getMonitoringEBooleanParserRuleCall_0_2_0());
                    					
                    pushFollow(FOLLOW_5);
                    lv_monitoring_2_0=ruleEBoolean();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAppRule());
                    						}
                    						set(
                    							current,
                    							"monitoring",
                    							lv_monitoring_2_0,
                    							"arduinoML.concretesyntax.ArduinoML.EBoolean");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalArduinoML.g:109:3: ( (otherlv_3= 'app' ( (lv_name_4_0= ruleEString ) ) otherlv_5= 'initial' otherlv_6= 'mode' ( ( ruleEString ) ) otherlv_8= ':' otherlv_9= 'bricks' otherlv_10= ':' ( (lv_bricks_11_0= ruleBrick ) ) ( (lv_bricks_12_0= ruleBrick ) )* otherlv_13= 'modes' otherlv_14= ':' ( (lv_modes_15_0= ruleMode ) ) ( (lv_modes_16_0= ruleMode ) )* ) | (otherlv_17= 'app' ( (lv_modes_18_0= ruleMode ) ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==14) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==RULE_STRING) ) {
                    int LA4_2 = input.LA(3);

                    if ( (LA4_2==15) ) {
                        int LA4_4 = input.LA(4);

                        if ( (LA4_4==22) ) {
                            alt4=2;
                        }
                        else if ( (LA4_4==16) ) {
                            alt4=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 4, 4, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 2, input);

                        throw nvae;
                    }
                }
                else if ( (LA4_1==RULE_ID) ) {
                    int LA4_3 = input.LA(3);

                    if ( (LA4_3==15) ) {
                        int LA4_4 = input.LA(4);

                        if ( (LA4_4==22) ) {
                            alt4=2;
                        }
                        else if ( (LA4_4==16) ) {
                            alt4=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 4, 4, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalArduinoML.g:110:4: (otherlv_3= 'app' ( (lv_name_4_0= ruleEString ) ) otherlv_5= 'initial' otherlv_6= 'mode' ( ( ruleEString ) ) otherlv_8= ':' otherlv_9= 'bricks' otherlv_10= ':' ( (lv_bricks_11_0= ruleBrick ) ) ( (lv_bricks_12_0= ruleBrick ) )* otherlv_13= 'modes' otherlv_14= ':' ( (lv_modes_15_0= ruleMode ) ) ( (lv_modes_16_0= ruleMode ) )* )
                    {
                    // InternalArduinoML.g:110:4: (otherlv_3= 'app' ( (lv_name_4_0= ruleEString ) ) otherlv_5= 'initial' otherlv_6= 'mode' ( ( ruleEString ) ) otherlv_8= ':' otherlv_9= 'bricks' otherlv_10= ':' ( (lv_bricks_11_0= ruleBrick ) ) ( (lv_bricks_12_0= ruleBrick ) )* otherlv_13= 'modes' otherlv_14= ':' ( (lv_modes_15_0= ruleMode ) ) ( (lv_modes_16_0= ruleMode ) )* )
                    // InternalArduinoML.g:111:5: otherlv_3= 'app' ( (lv_name_4_0= ruleEString ) ) otherlv_5= 'initial' otherlv_6= 'mode' ( ( ruleEString ) ) otherlv_8= ':' otherlv_9= 'bricks' otherlv_10= ':' ( (lv_bricks_11_0= ruleBrick ) ) ( (lv_bricks_12_0= ruleBrick ) )* otherlv_13= 'modes' otherlv_14= ':' ( (lv_modes_15_0= ruleMode ) ) ( (lv_modes_16_0= ruleMode ) )*
                    {
                    otherlv_3=(Token)match(input,14,FOLLOW_6); 

                    					newLeafNode(otherlv_3, grammarAccess.getAppAccess().getAppKeyword_1_0_0());
                    				
                    // InternalArduinoML.g:115:5: ( (lv_name_4_0= ruleEString ) )
                    // InternalArduinoML.g:116:6: (lv_name_4_0= ruleEString )
                    {
                    // InternalArduinoML.g:116:6: (lv_name_4_0= ruleEString )
                    // InternalArduinoML.g:117:7: lv_name_4_0= ruleEString
                    {

                    							newCompositeNode(grammarAccess.getAppAccess().getNameEStringParserRuleCall_1_0_1_0());
                    						
                    pushFollow(FOLLOW_7);
                    lv_name_4_0=ruleEString();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getAppRule());
                    							}
                    							set(
                    								current,
                    								"name",
                    								lv_name_4_0,
                    								"arduinoML.concretesyntax.ArduinoML.EString");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    otherlv_5=(Token)match(input,15,FOLLOW_8); 

                    					newLeafNode(otherlv_5, grammarAccess.getAppAccess().getInitialKeyword_1_0_2());
                    				
                    otherlv_6=(Token)match(input,16,FOLLOW_6); 

                    					newLeafNode(otherlv_6, grammarAccess.getAppAccess().getModeKeyword_1_0_3());
                    				
                    // InternalArduinoML.g:142:5: ( ( ruleEString ) )
                    // InternalArduinoML.g:143:6: ( ruleEString )
                    {
                    // InternalArduinoML.g:143:6: ( ruleEString )
                    // InternalArduinoML.g:144:7: ruleEString
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getAppRule());
                    							}
                    						

                    							newCompositeNode(grammarAccess.getAppAccess().getInitial_modeModeCrossReference_1_0_4_0());
                    						
                    pushFollow(FOLLOW_9);
                    ruleEString();

                    state._fsp--;


                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    otherlv_8=(Token)match(input,17,FOLLOW_10); 

                    					newLeafNode(otherlv_8, grammarAccess.getAppAccess().getColonKeyword_1_0_5());
                    				
                    otherlv_9=(Token)match(input,18,FOLLOW_9); 

                    					newLeafNode(otherlv_9, grammarAccess.getAppAccess().getBricksKeyword_1_0_6());
                    				
                    otherlv_10=(Token)match(input,17,FOLLOW_11); 

                    					newLeafNode(otherlv_10, grammarAccess.getAppAccess().getColonKeyword_1_0_7());
                    				
                    // InternalArduinoML.g:170:5: ( (lv_bricks_11_0= ruleBrick ) )
                    // InternalArduinoML.g:171:6: (lv_bricks_11_0= ruleBrick )
                    {
                    // InternalArduinoML.g:171:6: (lv_bricks_11_0= ruleBrick )
                    // InternalArduinoML.g:172:7: lv_bricks_11_0= ruleBrick
                    {

                    							newCompositeNode(grammarAccess.getAppAccess().getBricksBrickParserRuleCall_1_0_8_0());
                    						
                    pushFollow(FOLLOW_12);
                    lv_bricks_11_0=ruleBrick();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getAppRule());
                    							}
                    							add(
                    								current,
                    								"bricks",
                    								lv_bricks_11_0,
                    								"arduinoML.concretesyntax.ArduinoML.Brick");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    // InternalArduinoML.g:189:5: ( (lv_bricks_12_0= ruleBrick ) )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( ((LA2_0>=25 && LA2_0<=27)) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // InternalArduinoML.g:190:6: (lv_bricks_12_0= ruleBrick )
                    	    {
                    	    // InternalArduinoML.g:190:6: (lv_bricks_12_0= ruleBrick )
                    	    // InternalArduinoML.g:191:7: lv_bricks_12_0= ruleBrick
                    	    {

                    	    							newCompositeNode(grammarAccess.getAppAccess().getBricksBrickParserRuleCall_1_0_9_0());
                    	    						
                    	    pushFollow(FOLLOW_12);
                    	    lv_bricks_12_0=ruleBrick();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getAppRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"bricks",
                    	    								lv_bricks_12_0,
                    	    								"arduinoML.concretesyntax.ArduinoML.Brick");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);

                    otherlv_13=(Token)match(input,19,FOLLOW_9); 

                    					newLeafNode(otherlv_13, grammarAccess.getAppAccess().getModesKeyword_1_0_10());
                    				
                    otherlv_14=(Token)match(input,17,FOLLOW_6); 

                    					newLeafNode(otherlv_14, grammarAccess.getAppAccess().getColonKeyword_1_0_11());
                    				
                    // InternalArduinoML.g:216:5: ( (lv_modes_15_0= ruleMode ) )
                    // InternalArduinoML.g:217:6: (lv_modes_15_0= ruleMode )
                    {
                    // InternalArduinoML.g:217:6: (lv_modes_15_0= ruleMode )
                    // InternalArduinoML.g:218:7: lv_modes_15_0= ruleMode
                    {

                    							newCompositeNode(grammarAccess.getAppAccess().getModesModeParserRuleCall_1_0_12_0());
                    						
                    pushFollow(FOLLOW_13);
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

                    // InternalArduinoML.g:235:5: ( (lv_modes_16_0= ruleMode ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( ((LA3_0>=RULE_STRING && LA3_0<=RULE_ID)) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalArduinoML.g:236:6: (lv_modes_16_0= ruleMode )
                    	    {
                    	    // InternalArduinoML.g:236:6: (lv_modes_16_0= ruleMode )
                    	    // InternalArduinoML.g:237:7: lv_modes_16_0= ruleMode
                    	    {

                    	    							newCompositeNode(grammarAccess.getAppAccess().getModesModeParserRuleCall_1_0_13_0());
                    	    						
                    	    pushFollow(FOLLOW_13);
                    	    lv_modes_16_0=ruleMode();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getAppRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"modes",
                    	    								lv_modes_16_0,
                    	    								"arduinoML.concretesyntax.ArduinoML.Mode");
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
                    break;
                case 2 :
                    // InternalArduinoML.g:256:4: (otherlv_17= 'app' ( (lv_modes_18_0= ruleMode ) ) )
                    {
                    // InternalArduinoML.g:256:4: (otherlv_17= 'app' ( (lv_modes_18_0= ruleMode ) ) )
                    // InternalArduinoML.g:257:5: otherlv_17= 'app' ( (lv_modes_18_0= ruleMode ) )
                    {
                    otherlv_17=(Token)match(input,14,FOLLOW_6); 

                    					newLeafNode(otherlv_17, grammarAccess.getAppAccess().getAppKeyword_1_1_0());
                    				
                    // InternalArduinoML.g:261:5: ( (lv_modes_18_0= ruleMode ) )
                    // InternalArduinoML.g:262:6: (lv_modes_18_0= ruleMode )
                    {
                    // InternalArduinoML.g:262:6: (lv_modes_18_0= ruleMode )
                    // InternalArduinoML.g:263:7: lv_modes_18_0= ruleMode
                    {

                    							newCompositeNode(grammarAccess.getAppAccess().getModesModeParserRuleCall_1_1_1_0());
                    						
                    pushFollow(FOLLOW_2);
                    lv_modes_18_0=ruleMode();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getAppRule());
                    							}
                    							add(
                    								current,
                    								"modes",
                    								lv_modes_18_0,
                    								"arduinoML.concretesyntax.ArduinoML.Mode");
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
    // $ANTLR end "ruleApp"


    // $ANTLR start "entryRuleBrick"
    // InternalArduinoML.g:286:1: entryRuleBrick returns [EObject current=null] : iv_ruleBrick= ruleBrick EOF ;
    public final EObject entryRuleBrick() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBrick = null;


        try {
            // InternalArduinoML.g:286:46: (iv_ruleBrick= ruleBrick EOF )
            // InternalArduinoML.g:287:2: iv_ruleBrick= ruleBrick EOF
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
    // InternalArduinoML.g:293:1: ruleBrick returns [EObject current=null] : ( ( (this_Actuator_0= ruleActuator | this_Digital_1= ruleDigital ) ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' ( (lv_pin_4_0= ruleEInt ) ) ) | (this_Analog_5= ruleAnalog ( (lv_name_6_0= ruleEString ) ) otherlv_7= ':' ( (lv_pin_8_0= ruleEInt ) ) (otherlv_9= 'with' otherlv_10= 'debug' ( (lv_debug_11_0= ruleEBoolean ) ) )? ) ) ;
    public final EObject ruleBrick() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        EObject this_Actuator_0 = null;

        EObject this_Digital_1 = null;

        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_pin_4_0 = null;

        EObject this_Analog_5 = null;

        AntlrDatatypeRuleToken lv_name_6_0 = null;

        AntlrDatatypeRuleToken lv_pin_8_0 = null;

        AntlrDatatypeRuleToken lv_debug_11_0 = null;



        	enterRule();

        try {
            // InternalArduinoML.g:299:2: ( ( ( (this_Actuator_0= ruleActuator | this_Digital_1= ruleDigital ) ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' ( (lv_pin_4_0= ruleEInt ) ) ) | (this_Analog_5= ruleAnalog ( (lv_name_6_0= ruleEString ) ) otherlv_7= ':' ( (lv_pin_8_0= ruleEInt ) ) (otherlv_9= 'with' otherlv_10= 'debug' ( (lv_debug_11_0= ruleEBoolean ) ) )? ) ) )
            // InternalArduinoML.g:300:2: ( ( (this_Actuator_0= ruleActuator | this_Digital_1= ruleDigital ) ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' ( (lv_pin_4_0= ruleEInt ) ) ) | (this_Analog_5= ruleAnalog ( (lv_name_6_0= ruleEString ) ) otherlv_7= ':' ( (lv_pin_8_0= ruleEInt ) ) (otherlv_9= 'with' otherlv_10= 'debug' ( (lv_debug_11_0= ruleEBoolean ) ) )? ) )
            {
            // InternalArduinoML.g:300:2: ( ( (this_Actuator_0= ruleActuator | this_Digital_1= ruleDigital ) ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' ( (lv_pin_4_0= ruleEInt ) ) ) | (this_Analog_5= ruleAnalog ( (lv_name_6_0= ruleEString ) ) otherlv_7= ':' ( (lv_pin_8_0= ruleEInt ) ) (otherlv_9= 'with' otherlv_10= 'debug' ( (lv_debug_11_0= ruleEBoolean ) ) )? ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=25 && LA7_0<=26)) ) {
                alt7=1;
            }
            else if ( (LA7_0==27) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalArduinoML.g:301:3: ( (this_Actuator_0= ruleActuator | this_Digital_1= ruleDigital ) ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' ( (lv_pin_4_0= ruleEInt ) ) )
                    {
                    // InternalArduinoML.g:301:3: ( (this_Actuator_0= ruleActuator | this_Digital_1= ruleDigital ) ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' ( (lv_pin_4_0= ruleEInt ) ) )
                    // InternalArduinoML.g:302:4: (this_Actuator_0= ruleActuator | this_Digital_1= ruleDigital ) ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' ( (lv_pin_4_0= ruleEInt ) )
                    {
                    // InternalArduinoML.g:302:4: (this_Actuator_0= ruleActuator | this_Digital_1= ruleDigital )
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==25) ) {
                        alt5=1;
                    }
                    else if ( (LA5_0==26) ) {
                        alt5=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 0, input);

                        throw nvae;
                    }
                    switch (alt5) {
                        case 1 :
                            // InternalArduinoML.g:303:5: this_Actuator_0= ruleActuator
                            {

                            					newCompositeNode(grammarAccess.getBrickAccess().getActuatorParserRuleCall_0_0_0());
                            				
                            pushFollow(FOLLOW_6);
                            this_Actuator_0=ruleActuator();

                            state._fsp--;


                            					current = this_Actuator_0;
                            					afterParserOrEnumRuleCall();
                            				

                            }
                            break;
                        case 2 :
                            // InternalArduinoML.g:312:5: this_Digital_1= ruleDigital
                            {

                            					newCompositeNode(grammarAccess.getBrickAccess().getDigitalParserRuleCall_0_0_1());
                            				
                            pushFollow(FOLLOW_6);
                            this_Digital_1=ruleDigital();

                            state._fsp--;


                            					current = this_Digital_1;
                            					afterParserOrEnumRuleCall();
                            				

                            }
                            break;

                    }

                    // InternalArduinoML.g:321:4: ( (lv_name_2_0= ruleEString ) )
                    // InternalArduinoML.g:322:5: (lv_name_2_0= ruleEString )
                    {
                    // InternalArduinoML.g:322:5: (lv_name_2_0= ruleEString )
                    // InternalArduinoML.g:323:6: lv_name_2_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getBrickAccess().getNameEStringParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_9);
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

                    otherlv_3=(Token)match(input,17,FOLLOW_14); 

                    				newLeafNode(otherlv_3, grammarAccess.getBrickAccess().getColonKeyword_0_2());
                    			
                    // InternalArduinoML.g:344:4: ( (lv_pin_4_0= ruleEInt ) )
                    // InternalArduinoML.g:345:5: (lv_pin_4_0= ruleEInt )
                    {
                    // InternalArduinoML.g:345:5: (lv_pin_4_0= ruleEInt )
                    // InternalArduinoML.g:346:6: lv_pin_4_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getBrickAccess().getPinEIntParserRuleCall_0_3_0());
                    					
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
                    break;
                case 2 :
                    // InternalArduinoML.g:365:3: (this_Analog_5= ruleAnalog ( (lv_name_6_0= ruleEString ) ) otherlv_7= ':' ( (lv_pin_8_0= ruleEInt ) ) (otherlv_9= 'with' otherlv_10= 'debug' ( (lv_debug_11_0= ruleEBoolean ) ) )? )
                    {
                    // InternalArduinoML.g:365:3: (this_Analog_5= ruleAnalog ( (lv_name_6_0= ruleEString ) ) otherlv_7= ':' ( (lv_pin_8_0= ruleEInt ) ) (otherlv_9= 'with' otherlv_10= 'debug' ( (lv_debug_11_0= ruleEBoolean ) ) )? )
                    // InternalArduinoML.g:366:4: this_Analog_5= ruleAnalog ( (lv_name_6_0= ruleEString ) ) otherlv_7= ':' ( (lv_pin_8_0= ruleEInt ) ) (otherlv_9= 'with' otherlv_10= 'debug' ( (lv_debug_11_0= ruleEBoolean ) ) )?
                    {

                    				newCompositeNode(grammarAccess.getBrickAccess().getAnalogParserRuleCall_1_0());
                    			
                    pushFollow(FOLLOW_6);
                    this_Analog_5=ruleAnalog();

                    state._fsp--;


                    				current = this_Analog_5;
                    				afterParserOrEnumRuleCall();
                    			
                    // InternalArduinoML.g:374:4: ( (lv_name_6_0= ruleEString ) )
                    // InternalArduinoML.g:375:5: (lv_name_6_0= ruleEString )
                    {
                    // InternalArduinoML.g:375:5: (lv_name_6_0= ruleEString )
                    // InternalArduinoML.g:376:6: lv_name_6_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getBrickAccess().getNameEStringParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_name_6_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBrickRule());
                    						}
                    						set(
                    							current,
                    							"name",
                    							lv_name_6_0,
                    							"arduinoML.concretesyntax.ArduinoML.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_7=(Token)match(input,17,FOLLOW_14); 

                    				newLeafNode(otherlv_7, grammarAccess.getBrickAccess().getColonKeyword_1_2());
                    			
                    // InternalArduinoML.g:397:4: ( (lv_pin_8_0= ruleEInt ) )
                    // InternalArduinoML.g:398:5: (lv_pin_8_0= ruleEInt )
                    {
                    // InternalArduinoML.g:398:5: (lv_pin_8_0= ruleEInt )
                    // InternalArduinoML.g:399:6: lv_pin_8_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getBrickAccess().getPinEIntParserRuleCall_1_3_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_pin_8_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBrickRule());
                    						}
                    						set(
                    							current,
                    							"pin",
                    							lv_pin_8_0,
                    							"arduinoML.concretesyntax.ArduinoML.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalArduinoML.g:416:4: (otherlv_9= 'with' otherlv_10= 'debug' ( (lv_debug_11_0= ruleEBoolean ) ) )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==20) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // InternalArduinoML.g:417:5: otherlv_9= 'with' otherlv_10= 'debug' ( (lv_debug_11_0= ruleEBoolean ) )
                            {
                            otherlv_9=(Token)match(input,20,FOLLOW_16); 

                            					newLeafNode(otherlv_9, grammarAccess.getBrickAccess().getWithKeyword_1_4_0());
                            				
                            otherlv_10=(Token)match(input,21,FOLLOW_4); 

                            					newLeafNode(otherlv_10, grammarAccess.getBrickAccess().getDebugKeyword_1_4_1());
                            				
                            // InternalArduinoML.g:425:5: ( (lv_debug_11_0= ruleEBoolean ) )
                            // InternalArduinoML.g:426:6: (lv_debug_11_0= ruleEBoolean )
                            {
                            // InternalArduinoML.g:426:6: (lv_debug_11_0= ruleEBoolean )
                            // InternalArduinoML.g:427:7: lv_debug_11_0= ruleEBoolean
                            {

                            							newCompositeNode(grammarAccess.getBrickAccess().getDebugEBooleanParserRuleCall_1_4_2_0());
                            						
                            pushFollow(FOLLOW_2);
                            lv_debug_11_0=ruleEBoolean();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getBrickRule());
                            							}
                            							set(
                            								current,
                            								"debug",
                            								lv_debug_11_0,
                            								"arduinoML.concretesyntax.ArduinoML.EBoolean");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }


                            }
                            break;

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
    // $ANTLR end "ruleBrick"


    // $ANTLR start "entryRuleEString"
    // InternalArduinoML.g:450:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalArduinoML.g:450:47: (iv_ruleEString= ruleEString EOF )
            // InternalArduinoML.g:451:2: iv_ruleEString= ruleEString EOF
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
    // InternalArduinoML.g:457:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalArduinoML.g:463:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalArduinoML.g:464:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalArduinoML.g:464:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_STRING) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_ID) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalArduinoML.g:465:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalArduinoML.g:473:3: this_ID_1= RULE_ID
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


    // $ANTLR start "entryRuleEBoolean"
    // InternalArduinoML.g:484:1: entryRuleEBoolean returns [String current=null] : iv_ruleEBoolean= ruleEBoolean EOF ;
    public final String entryRuleEBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBoolean = null;


        try {
            // InternalArduinoML.g:484:48: (iv_ruleEBoolean= ruleEBoolean EOF )
            // InternalArduinoML.g:485:2: iv_ruleEBoolean= ruleEBoolean EOF
            {
             newCompositeNode(grammarAccess.getEBooleanRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEBoolean=ruleEBoolean();

            state._fsp--;

             current =iv_ruleEBoolean.getText(); 
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
    // $ANTLR end "entryRuleEBoolean"


    // $ANTLR start "ruleEBoolean"
    // InternalArduinoML.g:491:1: ruleEBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_BOOLEAN_CONSTANT_0= RULE_BOOLEAN_CONSTANT ;
    public final AntlrDatatypeRuleToken ruleEBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_BOOLEAN_CONSTANT_0=null;


        	enterRule();

        try {
            // InternalArduinoML.g:497:2: (this_BOOLEAN_CONSTANT_0= RULE_BOOLEAN_CONSTANT )
            // InternalArduinoML.g:498:2: this_BOOLEAN_CONSTANT_0= RULE_BOOLEAN_CONSTANT
            {
            this_BOOLEAN_CONSTANT_0=(Token)match(input,RULE_BOOLEAN_CONSTANT,FOLLOW_2); 

            		current.merge(this_BOOLEAN_CONSTANT_0);
            	

            		newLeafNode(this_BOOLEAN_CONSTANT_0, grammarAccess.getEBooleanAccess().getBOOLEAN_CONSTANTTerminalRuleCall());
            	

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
    // $ANTLR end "ruleEBoolean"


    // $ANTLR start "entryRuleMode"
    // InternalArduinoML.g:508:1: entryRuleMode returns [EObject current=null] : iv_ruleMode= ruleMode EOF ;
    public final EObject entryRuleMode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMode = null;


        try {
            // InternalArduinoML.g:508:45: (iv_ruleMode= ruleMode EOF )
            // InternalArduinoML.g:509:2: iv_ruleMode= ruleMode EOF
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
    // InternalArduinoML.g:515:1: ruleMode returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= 'initial' otherlv_2= 'state' ( ( ruleEString ) ) otherlv_4= ':' (otherlv_5= 'bricks' otherlv_6= ':' ( (lv_bricks_7_0= ruleBrick ) ) ( (lv_bricks_8_0= ruleBrick ) )* )? otherlv_9= 'states' otherlv_10= ':' ( (lv_states_11_0= ruleState ) ) ( (lv_states_12_0= ruleState ) )* (otherlv_13= 'transitions' otherlv_14= ':' ( (lv_transitions_mode_15_0= ruleTransitionMode ) ) ( (lv_transitions_mode_16_0= ruleTransitionMode ) )* )? ) ;
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
            // InternalArduinoML.g:521:2: ( ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= 'initial' otherlv_2= 'state' ( ( ruleEString ) ) otherlv_4= ':' (otherlv_5= 'bricks' otherlv_6= ':' ( (lv_bricks_7_0= ruleBrick ) ) ( (lv_bricks_8_0= ruleBrick ) )* )? otherlv_9= 'states' otherlv_10= ':' ( (lv_states_11_0= ruleState ) ) ( (lv_states_12_0= ruleState ) )* (otherlv_13= 'transitions' otherlv_14= ':' ( (lv_transitions_mode_15_0= ruleTransitionMode ) ) ( (lv_transitions_mode_16_0= ruleTransitionMode ) )* )? ) )
            // InternalArduinoML.g:522:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= 'initial' otherlv_2= 'state' ( ( ruleEString ) ) otherlv_4= ':' (otherlv_5= 'bricks' otherlv_6= ':' ( (lv_bricks_7_0= ruleBrick ) ) ( (lv_bricks_8_0= ruleBrick ) )* )? otherlv_9= 'states' otherlv_10= ':' ( (lv_states_11_0= ruleState ) ) ( (lv_states_12_0= ruleState ) )* (otherlv_13= 'transitions' otherlv_14= ':' ( (lv_transitions_mode_15_0= ruleTransitionMode ) ) ( (lv_transitions_mode_16_0= ruleTransitionMode ) )* )? )
            {
            // InternalArduinoML.g:522:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= 'initial' otherlv_2= 'state' ( ( ruleEString ) ) otherlv_4= ':' (otherlv_5= 'bricks' otherlv_6= ':' ( (lv_bricks_7_0= ruleBrick ) ) ( (lv_bricks_8_0= ruleBrick ) )* )? otherlv_9= 'states' otherlv_10= ':' ( (lv_states_11_0= ruleState ) ) ( (lv_states_12_0= ruleState ) )* (otherlv_13= 'transitions' otherlv_14= ':' ( (lv_transitions_mode_15_0= ruleTransitionMode ) ) ( (lv_transitions_mode_16_0= ruleTransitionMode ) )* )? )
            // InternalArduinoML.g:523:3: ( (lv_name_0_0= ruleEString ) ) otherlv_1= 'initial' otherlv_2= 'state' ( ( ruleEString ) ) otherlv_4= ':' (otherlv_5= 'bricks' otherlv_6= ':' ( (lv_bricks_7_0= ruleBrick ) ) ( (lv_bricks_8_0= ruleBrick ) )* )? otherlv_9= 'states' otherlv_10= ':' ( (lv_states_11_0= ruleState ) ) ( (lv_states_12_0= ruleState ) )* (otherlv_13= 'transitions' otherlv_14= ':' ( (lv_transitions_mode_15_0= ruleTransitionMode ) ) ( (lv_transitions_mode_16_0= ruleTransitionMode ) )* )?
            {
            // InternalArduinoML.g:523:3: ( (lv_name_0_0= ruleEString ) )
            // InternalArduinoML.g:524:4: (lv_name_0_0= ruleEString )
            {
            // InternalArduinoML.g:524:4: (lv_name_0_0= ruleEString )
            // InternalArduinoML.g:525:5: lv_name_0_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getModeAccess().getNameEStringParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_7);
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

            otherlv_1=(Token)match(input,15,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getModeAccess().getInitialKeyword_1());
            		
            otherlv_2=(Token)match(input,22,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getModeAccess().getStateKeyword_2());
            		
            // InternalArduinoML.g:550:3: ( ( ruleEString ) )
            // InternalArduinoML.g:551:4: ( ruleEString )
            {
            // InternalArduinoML.g:551:4: ( ruleEString )
            // InternalArduinoML.g:552:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getModeRule());
            					}
            				

            					newCompositeNode(grammarAccess.getModeAccess().getInitialStateCrossReference_3_0());
            				
            pushFollow(FOLLOW_9);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,17,FOLLOW_18); 

            			newLeafNode(otherlv_4, grammarAccess.getModeAccess().getColonKeyword_4());
            		
            // InternalArduinoML.g:570:3: (otherlv_5= 'bricks' otherlv_6= ':' ( (lv_bricks_7_0= ruleBrick ) ) ( (lv_bricks_8_0= ruleBrick ) )* )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==18) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalArduinoML.g:571:4: otherlv_5= 'bricks' otherlv_6= ':' ( (lv_bricks_7_0= ruleBrick ) ) ( (lv_bricks_8_0= ruleBrick ) )*
                    {
                    otherlv_5=(Token)match(input,18,FOLLOW_9); 

                    				newLeafNode(otherlv_5, grammarAccess.getModeAccess().getBricksKeyword_5_0());
                    			
                    otherlv_6=(Token)match(input,17,FOLLOW_11); 

                    				newLeafNode(otherlv_6, grammarAccess.getModeAccess().getColonKeyword_5_1());
                    			
                    // InternalArduinoML.g:579:4: ( (lv_bricks_7_0= ruleBrick ) )
                    // InternalArduinoML.g:580:5: (lv_bricks_7_0= ruleBrick )
                    {
                    // InternalArduinoML.g:580:5: (lv_bricks_7_0= ruleBrick )
                    // InternalArduinoML.g:581:6: lv_bricks_7_0= ruleBrick
                    {

                    						newCompositeNode(grammarAccess.getModeAccess().getBricksBrickParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_19);
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

                    // InternalArduinoML.g:598:4: ( (lv_bricks_8_0= ruleBrick ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( ((LA9_0>=25 && LA9_0<=27)) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalArduinoML.g:599:5: (lv_bricks_8_0= ruleBrick )
                    	    {
                    	    // InternalArduinoML.g:599:5: (lv_bricks_8_0= ruleBrick )
                    	    // InternalArduinoML.g:600:6: lv_bricks_8_0= ruleBrick
                    	    {

                    	    						newCompositeNode(grammarAccess.getModeAccess().getBricksBrickParserRuleCall_5_3_0());
                    	    					
                    	    pushFollow(FOLLOW_19);
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
                    	    break loop9;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_9=(Token)match(input,23,FOLLOW_9); 

            			newLeafNode(otherlv_9, grammarAccess.getModeAccess().getStatesKeyword_6());
            		
            otherlv_10=(Token)match(input,17,FOLLOW_6); 

            			newLeafNode(otherlv_10, grammarAccess.getModeAccess().getColonKeyword_7());
            		
            // InternalArduinoML.g:626:3: ( (lv_states_11_0= ruleState ) )
            // InternalArduinoML.g:627:4: (lv_states_11_0= ruleState )
            {
            // InternalArduinoML.g:627:4: (lv_states_11_0= ruleState )
            // InternalArduinoML.g:628:5: lv_states_11_0= ruleState
            {

            					newCompositeNode(grammarAccess.getModeAccess().getStatesStateParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_20);
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

            // InternalArduinoML.g:645:3: ( (lv_states_12_0= ruleState ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_STRING) ) {
                    int LA11_2 = input.LA(2);

                    if ( (LA11_2==17) ) {
                        alt11=1;
                    }


                }
                else if ( (LA11_0==RULE_ID) ) {
                    int LA11_3 = input.LA(2);

                    if ( (LA11_3==17) ) {
                        alt11=1;
                    }


                }


                switch (alt11) {
            	case 1 :
            	    // InternalArduinoML.g:646:4: (lv_states_12_0= ruleState )
            	    {
            	    // InternalArduinoML.g:646:4: (lv_states_12_0= ruleState )
            	    // InternalArduinoML.g:647:5: lv_states_12_0= ruleState
            	    {

            	    					newCompositeNode(grammarAccess.getModeAccess().getStatesStateParserRuleCall_9_0());
            	    				
            	    pushFollow(FOLLOW_20);
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
            	    break loop11;
                }
            } while (true);

            // InternalArduinoML.g:664:3: (otherlv_13= 'transitions' otherlv_14= ':' ( (lv_transitions_mode_15_0= ruleTransitionMode ) ) ( (lv_transitions_mode_16_0= ruleTransitionMode ) )* )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==24) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalArduinoML.g:665:4: otherlv_13= 'transitions' otherlv_14= ':' ( (lv_transitions_mode_15_0= ruleTransitionMode ) ) ( (lv_transitions_mode_16_0= ruleTransitionMode ) )*
                    {
                    otherlv_13=(Token)match(input,24,FOLLOW_9); 

                    				newLeafNode(otherlv_13, grammarAccess.getModeAccess().getTransitionsKeyword_10_0());
                    			
                    otherlv_14=(Token)match(input,17,FOLLOW_21); 

                    				newLeafNode(otherlv_14, grammarAccess.getModeAccess().getColonKeyword_10_1());
                    			
                    // InternalArduinoML.g:673:4: ( (lv_transitions_mode_15_0= ruleTransitionMode ) )
                    // InternalArduinoML.g:674:5: (lv_transitions_mode_15_0= ruleTransitionMode )
                    {
                    // InternalArduinoML.g:674:5: (lv_transitions_mode_15_0= ruleTransitionMode )
                    // InternalArduinoML.g:675:6: lv_transitions_mode_15_0= ruleTransitionMode
                    {

                    						newCompositeNode(grammarAccess.getModeAccess().getTransitions_modeTransitionModeParserRuleCall_10_2_0());
                    					
                    pushFollow(FOLLOW_22);
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

                    // InternalArduinoML.g:692:4: ( (lv_transitions_mode_16_0= ruleTransitionMode ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==30||LA12_0==33) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalArduinoML.g:693:5: (lv_transitions_mode_16_0= ruleTransitionMode )
                    	    {
                    	    // InternalArduinoML.g:693:5: (lv_transitions_mode_16_0= ruleTransitionMode )
                    	    // InternalArduinoML.g:694:6: lv_transitions_mode_16_0= ruleTransitionMode
                    	    {

                    	    						newCompositeNode(grammarAccess.getModeAccess().getTransitions_modeTransitionModeParserRuleCall_10_3_0());
                    	    					
                    	    pushFollow(FOLLOW_22);
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
                    	    break loop12;
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
    // InternalArduinoML.g:716:1: entryRuleState returns [EObject current=null] : iv_ruleState= ruleState EOF ;
    public final EObject entryRuleState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleState = null;


        try {
            // InternalArduinoML.g:716:46: (iv_ruleState= ruleState EOF )
            // InternalArduinoML.g:717:2: iv_ruleState= ruleState EOF
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
    // InternalArduinoML.g:723:1: ruleState returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_actions_2_0= ruleAction ) ) ( (lv_actions_3_0= ruleAction ) )* ( (lv_transitions_state_4_0= ruleTransitionState ) ) ( (lv_transitions_state_5_0= ruleTransitionState ) )* ) ;
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
            // InternalArduinoML.g:729:2: ( ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_actions_2_0= ruleAction ) ) ( (lv_actions_3_0= ruleAction ) )* ( (lv_transitions_state_4_0= ruleTransitionState ) ) ( (lv_transitions_state_5_0= ruleTransitionState ) )* ) )
            // InternalArduinoML.g:730:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_actions_2_0= ruleAction ) ) ( (lv_actions_3_0= ruleAction ) )* ( (lv_transitions_state_4_0= ruleTransitionState ) ) ( (lv_transitions_state_5_0= ruleTransitionState ) )* )
            {
            // InternalArduinoML.g:730:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_actions_2_0= ruleAction ) ) ( (lv_actions_3_0= ruleAction ) )* ( (lv_transitions_state_4_0= ruleTransitionState ) ) ( (lv_transitions_state_5_0= ruleTransitionState ) )* )
            // InternalArduinoML.g:731:3: ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_actions_2_0= ruleAction ) ) ( (lv_actions_3_0= ruleAction ) )* ( (lv_transitions_state_4_0= ruleTransitionState ) ) ( (lv_transitions_state_5_0= ruleTransitionState ) )*
            {
            // InternalArduinoML.g:731:3: ( (lv_name_0_0= ruleEString ) )
            // InternalArduinoML.g:732:4: (lv_name_0_0= ruleEString )
            {
            // InternalArduinoML.g:732:4: (lv_name_0_0= ruleEString )
            // InternalArduinoML.g:733:5: lv_name_0_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getStateAccess().getNameEStringParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_9);
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

            otherlv_1=(Token)match(input,17,FOLLOW_23); 

            			newLeafNode(otherlv_1, grammarAccess.getStateAccess().getColonKeyword_1());
            		
            // InternalArduinoML.g:754:3: ( (lv_actions_2_0= ruleAction ) )
            // InternalArduinoML.g:755:4: (lv_actions_2_0= ruleAction )
            {
            // InternalArduinoML.g:755:4: (lv_actions_2_0= ruleAction )
            // InternalArduinoML.g:756:5: lv_actions_2_0= ruleAction
            {

            					newCompositeNode(grammarAccess.getStateAccess().getActionsActionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_24);
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

            // InternalArduinoML.g:773:3: ( (lv_actions_3_0= ruleAction ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==28) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalArduinoML.g:774:4: (lv_actions_3_0= ruleAction )
            	    {
            	    // InternalArduinoML.g:774:4: (lv_actions_3_0= ruleAction )
            	    // InternalArduinoML.g:775:5: lv_actions_3_0= ruleAction
            	    {

            	    					newCompositeNode(grammarAccess.getStateAccess().getActionsActionParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_24);
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
            	    break loop14;
                }
            } while (true);

            // InternalArduinoML.g:792:3: ( (lv_transitions_state_4_0= ruleTransitionState ) )
            // InternalArduinoML.g:793:4: (lv_transitions_state_4_0= ruleTransitionState )
            {
            // InternalArduinoML.g:793:4: (lv_transitions_state_4_0= ruleTransitionState )
            // InternalArduinoML.g:794:5: lv_transitions_state_4_0= ruleTransitionState
            {

            					newCompositeNode(grammarAccess.getStateAccess().getTransitions_stateTransitionStateParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_25);
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

            // InternalArduinoML.g:811:3: ( (lv_transitions_state_5_0= ruleTransitionState ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==30||LA15_0==33) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalArduinoML.g:812:4: (lv_transitions_state_5_0= ruleTransitionState )
            	    {
            	    // InternalArduinoML.g:812:4: (lv_transitions_state_5_0= ruleTransitionState )
            	    // InternalArduinoML.g:813:5: lv_transitions_state_5_0= ruleTransitionState
            	    {

            	    					newCompositeNode(grammarAccess.getStateAccess().getTransitions_stateTransitionStateParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_25);
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
            	    break loop15;
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
    // InternalArduinoML.g:834:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalArduinoML.g:834:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalArduinoML.g:835:2: iv_ruleEInt= ruleEInt EOF
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
    // InternalArduinoML.g:841:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;


        	enterRule();

        try {
            // InternalArduinoML.g:847:2: (this_INT_0= RULE_INT )
            // InternalArduinoML.g:848:2: this_INT_0= RULE_INT
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
    // InternalArduinoML.g:858:1: entryRuleActuator returns [EObject current=null] : iv_ruleActuator= ruleActuator EOF ;
    public final EObject entryRuleActuator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActuator = null;


        try {
            // InternalArduinoML.g:858:49: (iv_ruleActuator= ruleActuator EOF )
            // InternalArduinoML.g:859:2: iv_ruleActuator= ruleActuator EOF
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
    // InternalArduinoML.g:865:1: ruleActuator returns [EObject current=null] : ( () otherlv_1= 'Actuator' ) ;
    public final EObject ruleActuator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalArduinoML.g:871:2: ( ( () otherlv_1= 'Actuator' ) )
            // InternalArduinoML.g:872:2: ( () otherlv_1= 'Actuator' )
            {
            // InternalArduinoML.g:872:2: ( () otherlv_1= 'Actuator' )
            // InternalArduinoML.g:873:3: () otherlv_1= 'Actuator'
            {
            // InternalArduinoML.g:873:3: ()
            // InternalArduinoML.g:874:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getActuatorAccess().getActuatorAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,25,FOLLOW_2); 

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
    // InternalArduinoML.g:888:1: entryRuleDigital returns [EObject current=null] : iv_ruleDigital= ruleDigital EOF ;
    public final EObject entryRuleDigital() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDigital = null;


        try {
            // InternalArduinoML.g:888:48: (iv_ruleDigital= ruleDigital EOF )
            // InternalArduinoML.g:889:2: iv_ruleDigital= ruleDigital EOF
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
    // InternalArduinoML.g:895:1: ruleDigital returns [EObject current=null] : ( () otherlv_1= 'Digital' ) ;
    public final EObject ruleDigital() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalArduinoML.g:901:2: ( ( () otherlv_1= 'Digital' ) )
            // InternalArduinoML.g:902:2: ( () otherlv_1= 'Digital' )
            {
            // InternalArduinoML.g:902:2: ( () otherlv_1= 'Digital' )
            // InternalArduinoML.g:903:3: () otherlv_1= 'Digital'
            {
            // InternalArduinoML.g:903:3: ()
            // InternalArduinoML.g:904:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDigitalAccess().getDigitalAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,26,FOLLOW_2); 

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
    // InternalArduinoML.g:918:1: entryRuleAnalog returns [EObject current=null] : iv_ruleAnalog= ruleAnalog EOF ;
    public final EObject entryRuleAnalog() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnalog = null;


        try {
            // InternalArduinoML.g:918:47: (iv_ruleAnalog= ruleAnalog EOF )
            // InternalArduinoML.g:919:2: iv_ruleAnalog= ruleAnalog EOF
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
    // InternalArduinoML.g:925:1: ruleAnalog returns [EObject current=null] : ( () otherlv_1= 'Analog' ) ;
    public final EObject ruleAnalog() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalArduinoML.g:931:2: ( ( () otherlv_1= 'Analog' ) )
            // InternalArduinoML.g:932:2: ( () otherlv_1= 'Analog' )
            {
            // InternalArduinoML.g:932:2: ( () otherlv_1= 'Analog' )
            // InternalArduinoML.g:933:3: () otherlv_1= 'Analog'
            {
            // InternalArduinoML.g:933:3: ()
            // InternalArduinoML.g:934:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAnalogAccess().getAnalogAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,27,FOLLOW_2); 

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
    // InternalArduinoML.g:948:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // InternalArduinoML.g:948:47: (iv_ruleAction= ruleAction EOF )
            // InternalArduinoML.g:949:2: iv_ruleAction= ruleAction EOF
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
    // InternalArduinoML.g:955:1: ruleAction returns [EObject current=null] : (otherlv_0= 'change' ( ( ruleEString ) ) otherlv_2= 'to' ( (lv_value_3_0= ruleSignal ) ) ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Enumerator lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalArduinoML.g:961:2: ( (otherlv_0= 'change' ( ( ruleEString ) ) otherlv_2= 'to' ( (lv_value_3_0= ruleSignal ) ) ) )
            // InternalArduinoML.g:962:2: (otherlv_0= 'change' ( ( ruleEString ) ) otherlv_2= 'to' ( (lv_value_3_0= ruleSignal ) ) )
            {
            // InternalArduinoML.g:962:2: (otherlv_0= 'change' ( ( ruleEString ) ) otherlv_2= 'to' ( (lv_value_3_0= ruleSignal ) ) )
            // InternalArduinoML.g:963:3: otherlv_0= 'change' ( ( ruleEString ) ) otherlv_2= 'to' ( (lv_value_3_0= ruleSignal ) )
            {
            otherlv_0=(Token)match(input,28,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getActionAccess().getChangeKeyword_0());
            		
            // InternalArduinoML.g:967:3: ( ( ruleEString ) )
            // InternalArduinoML.g:968:4: ( ruleEString )
            {
            // InternalArduinoML.g:968:4: ( ruleEString )
            // InternalArduinoML.g:969:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getActionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getActionAccess().getActuatorActuatorCrossReference_1_0());
            				
            pushFollow(FOLLOW_26);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,29,FOLLOW_27); 

            			newLeafNode(otherlv_2, grammarAccess.getActionAccess().getToKeyword_2());
            		
            // InternalArduinoML.g:987:3: ( (lv_value_3_0= ruleSignal ) )
            // InternalArduinoML.g:988:4: (lv_value_3_0= ruleSignal )
            {
            // InternalArduinoML.g:988:4: (lv_value_3_0= ruleSignal )
            // InternalArduinoML.g:989:5: lv_value_3_0= ruleSignal
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
    // InternalArduinoML.g:1010:1: entryRuleTransitionState returns [EObject current=null] : iv_ruleTransitionState= ruleTransitionState EOF ;
    public final EObject entryRuleTransitionState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransitionState = null;


        try {
            // InternalArduinoML.g:1010:56: (iv_ruleTransitionState= ruleTransitionState EOF )
            // InternalArduinoML.g:1011:2: iv_ruleTransitionState= ruleTransitionState EOF
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
    // InternalArduinoML.g:1017:1: ruleTransitionState returns [EObject current=null] : ( ( (otherlv_0= 'when' ( ( ( ( ruleEString ) ) otherlv_2= 'is' ( (lv_d_values_3_0= ruleSignal ) ) ) | ( ( ( ruleEString ) ) ( (lv_comp_5_0= ruleCompare ) ) ( (lv_a_values_6_0= ruleEInt ) ) ) ) (otherlv_7= 'and' ( ( ( ( ruleEString ) ) otherlv_9= 'is' ( (lv_d_values_10_0= ruleSignal ) ) ) | ( ( ( ruleEString ) ) ( (lv_comp_12_0= ruleCompare ) ) ( (lv_a_values_13_0= ruleEInt ) ) ) ) )* (otherlv_14= 'wait' ( (lv_time_15_0= ruleEInt ) ) ( (lv_unit_16_0= ruleTime_unit ) ) otherlv_17= 'then' )? ) | (otherlv_18= 'wait' ( (lv_time_19_0= ruleEInt ) ) ( (lv_unit_20_0= ruleTime_unit ) ) otherlv_21= 'then' ) ) otherlv_22= 'go' otherlv_23= 'to' otherlv_24= 'state' ( ( ruleEString ) ) ) ;
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
            // InternalArduinoML.g:1023:2: ( ( ( (otherlv_0= 'when' ( ( ( ( ruleEString ) ) otherlv_2= 'is' ( (lv_d_values_3_0= ruleSignal ) ) ) | ( ( ( ruleEString ) ) ( (lv_comp_5_0= ruleCompare ) ) ( (lv_a_values_6_0= ruleEInt ) ) ) ) (otherlv_7= 'and' ( ( ( ( ruleEString ) ) otherlv_9= 'is' ( (lv_d_values_10_0= ruleSignal ) ) ) | ( ( ( ruleEString ) ) ( (lv_comp_12_0= ruleCompare ) ) ( (lv_a_values_13_0= ruleEInt ) ) ) ) )* (otherlv_14= 'wait' ( (lv_time_15_0= ruleEInt ) ) ( (lv_unit_16_0= ruleTime_unit ) ) otherlv_17= 'then' )? ) | (otherlv_18= 'wait' ( (lv_time_19_0= ruleEInt ) ) ( (lv_unit_20_0= ruleTime_unit ) ) otherlv_21= 'then' ) ) otherlv_22= 'go' otherlv_23= 'to' otherlv_24= 'state' ( ( ruleEString ) ) ) )
            // InternalArduinoML.g:1024:2: ( ( (otherlv_0= 'when' ( ( ( ( ruleEString ) ) otherlv_2= 'is' ( (lv_d_values_3_0= ruleSignal ) ) ) | ( ( ( ruleEString ) ) ( (lv_comp_5_0= ruleCompare ) ) ( (lv_a_values_6_0= ruleEInt ) ) ) ) (otherlv_7= 'and' ( ( ( ( ruleEString ) ) otherlv_9= 'is' ( (lv_d_values_10_0= ruleSignal ) ) ) | ( ( ( ruleEString ) ) ( (lv_comp_12_0= ruleCompare ) ) ( (lv_a_values_13_0= ruleEInt ) ) ) ) )* (otherlv_14= 'wait' ( (lv_time_15_0= ruleEInt ) ) ( (lv_unit_16_0= ruleTime_unit ) ) otherlv_17= 'then' )? ) | (otherlv_18= 'wait' ( (lv_time_19_0= ruleEInt ) ) ( (lv_unit_20_0= ruleTime_unit ) ) otherlv_21= 'then' ) ) otherlv_22= 'go' otherlv_23= 'to' otherlv_24= 'state' ( ( ruleEString ) ) )
            {
            // InternalArduinoML.g:1024:2: ( ( (otherlv_0= 'when' ( ( ( ( ruleEString ) ) otherlv_2= 'is' ( (lv_d_values_3_0= ruleSignal ) ) ) | ( ( ( ruleEString ) ) ( (lv_comp_5_0= ruleCompare ) ) ( (lv_a_values_6_0= ruleEInt ) ) ) ) (otherlv_7= 'and' ( ( ( ( ruleEString ) ) otherlv_9= 'is' ( (lv_d_values_10_0= ruleSignal ) ) ) | ( ( ( ruleEString ) ) ( (lv_comp_12_0= ruleCompare ) ) ( (lv_a_values_13_0= ruleEInt ) ) ) ) )* (otherlv_14= 'wait' ( (lv_time_15_0= ruleEInt ) ) ( (lv_unit_16_0= ruleTime_unit ) ) otherlv_17= 'then' )? ) | (otherlv_18= 'wait' ( (lv_time_19_0= ruleEInt ) ) ( (lv_unit_20_0= ruleTime_unit ) ) otherlv_21= 'then' ) ) otherlv_22= 'go' otherlv_23= 'to' otherlv_24= 'state' ( ( ruleEString ) ) )
            // InternalArduinoML.g:1025:3: ( (otherlv_0= 'when' ( ( ( ( ruleEString ) ) otherlv_2= 'is' ( (lv_d_values_3_0= ruleSignal ) ) ) | ( ( ( ruleEString ) ) ( (lv_comp_5_0= ruleCompare ) ) ( (lv_a_values_6_0= ruleEInt ) ) ) ) (otherlv_7= 'and' ( ( ( ( ruleEString ) ) otherlv_9= 'is' ( (lv_d_values_10_0= ruleSignal ) ) ) | ( ( ( ruleEString ) ) ( (lv_comp_12_0= ruleCompare ) ) ( (lv_a_values_13_0= ruleEInt ) ) ) ) )* (otherlv_14= 'wait' ( (lv_time_15_0= ruleEInt ) ) ( (lv_unit_16_0= ruleTime_unit ) ) otherlv_17= 'then' )? ) | (otherlv_18= 'wait' ( (lv_time_19_0= ruleEInt ) ) ( (lv_unit_20_0= ruleTime_unit ) ) otherlv_21= 'then' ) ) otherlv_22= 'go' otherlv_23= 'to' otherlv_24= 'state' ( ( ruleEString ) )
            {
            // InternalArduinoML.g:1025:3: ( (otherlv_0= 'when' ( ( ( ( ruleEString ) ) otherlv_2= 'is' ( (lv_d_values_3_0= ruleSignal ) ) ) | ( ( ( ruleEString ) ) ( (lv_comp_5_0= ruleCompare ) ) ( (lv_a_values_6_0= ruleEInt ) ) ) ) (otherlv_7= 'and' ( ( ( ( ruleEString ) ) otherlv_9= 'is' ( (lv_d_values_10_0= ruleSignal ) ) ) | ( ( ( ruleEString ) ) ( (lv_comp_12_0= ruleCompare ) ) ( (lv_a_values_13_0= ruleEInt ) ) ) ) )* (otherlv_14= 'wait' ( (lv_time_15_0= ruleEInt ) ) ( (lv_unit_16_0= ruleTime_unit ) ) otherlv_17= 'then' )? ) | (otherlv_18= 'wait' ( (lv_time_19_0= ruleEInt ) ) ( (lv_unit_20_0= ruleTime_unit ) ) otherlv_21= 'then' ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==30) ) {
                alt20=1;
            }
            else if ( (LA20_0==33) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalArduinoML.g:1026:4: (otherlv_0= 'when' ( ( ( ( ruleEString ) ) otherlv_2= 'is' ( (lv_d_values_3_0= ruleSignal ) ) ) | ( ( ( ruleEString ) ) ( (lv_comp_5_0= ruleCompare ) ) ( (lv_a_values_6_0= ruleEInt ) ) ) ) (otherlv_7= 'and' ( ( ( ( ruleEString ) ) otherlv_9= 'is' ( (lv_d_values_10_0= ruleSignal ) ) ) | ( ( ( ruleEString ) ) ( (lv_comp_12_0= ruleCompare ) ) ( (lv_a_values_13_0= ruleEInt ) ) ) ) )* (otherlv_14= 'wait' ( (lv_time_15_0= ruleEInt ) ) ( (lv_unit_16_0= ruleTime_unit ) ) otherlv_17= 'then' )? )
                    {
                    // InternalArduinoML.g:1026:4: (otherlv_0= 'when' ( ( ( ( ruleEString ) ) otherlv_2= 'is' ( (lv_d_values_3_0= ruleSignal ) ) ) | ( ( ( ruleEString ) ) ( (lv_comp_5_0= ruleCompare ) ) ( (lv_a_values_6_0= ruleEInt ) ) ) ) (otherlv_7= 'and' ( ( ( ( ruleEString ) ) otherlv_9= 'is' ( (lv_d_values_10_0= ruleSignal ) ) ) | ( ( ( ruleEString ) ) ( (lv_comp_12_0= ruleCompare ) ) ( (lv_a_values_13_0= ruleEInt ) ) ) ) )* (otherlv_14= 'wait' ( (lv_time_15_0= ruleEInt ) ) ( (lv_unit_16_0= ruleTime_unit ) ) otherlv_17= 'then' )? )
                    // InternalArduinoML.g:1027:5: otherlv_0= 'when' ( ( ( ( ruleEString ) ) otherlv_2= 'is' ( (lv_d_values_3_0= ruleSignal ) ) ) | ( ( ( ruleEString ) ) ( (lv_comp_5_0= ruleCompare ) ) ( (lv_a_values_6_0= ruleEInt ) ) ) ) (otherlv_7= 'and' ( ( ( ( ruleEString ) ) otherlv_9= 'is' ( (lv_d_values_10_0= ruleSignal ) ) ) | ( ( ( ruleEString ) ) ( (lv_comp_12_0= ruleCompare ) ) ( (lv_a_values_13_0= ruleEInt ) ) ) ) )* (otherlv_14= 'wait' ( (lv_time_15_0= ruleEInt ) ) ( (lv_unit_16_0= ruleTime_unit ) ) otherlv_17= 'then' )?
                    {
                    otherlv_0=(Token)match(input,30,FOLLOW_6); 

                    					newLeafNode(otherlv_0, grammarAccess.getTransitionStateAccess().getWhenKeyword_0_0_0());
                    				
                    // InternalArduinoML.g:1031:5: ( ( ( ( ruleEString ) ) otherlv_2= 'is' ( (lv_d_values_3_0= ruleSignal ) ) ) | ( ( ( ruleEString ) ) ( (lv_comp_5_0= ruleCompare ) ) ( (lv_a_values_6_0= ruleEInt ) ) ) )
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==RULE_STRING) ) {
                        int LA16_1 = input.LA(2);

                        if ( (LA16_1==31) ) {
                            alt16=1;
                        }
                        else if ( ((LA16_1>=41 && LA16_1<=45)) ) {
                            alt16=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 16, 1, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA16_0==RULE_ID) ) {
                        int LA16_2 = input.LA(2);

                        if ( ((LA16_2>=41 && LA16_2<=45)) ) {
                            alt16=2;
                        }
                        else if ( (LA16_2==31) ) {
                            alt16=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 16, 2, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 16, 0, input);

                        throw nvae;
                    }
                    switch (alt16) {
                        case 1 :
                            // InternalArduinoML.g:1032:6: ( ( ( ruleEString ) ) otherlv_2= 'is' ( (lv_d_values_3_0= ruleSignal ) ) )
                            {
                            // InternalArduinoML.g:1032:6: ( ( ( ruleEString ) ) otherlv_2= 'is' ( (lv_d_values_3_0= ruleSignal ) ) )
                            // InternalArduinoML.g:1033:7: ( ( ruleEString ) ) otherlv_2= 'is' ( (lv_d_values_3_0= ruleSignal ) )
                            {
                            // InternalArduinoML.g:1033:7: ( ( ruleEString ) )
                            // InternalArduinoML.g:1034:8: ( ruleEString )
                            {
                            // InternalArduinoML.g:1034:8: ( ruleEString )
                            // InternalArduinoML.g:1035:9: ruleEString
                            {

                            									if (current==null) {
                            										current = createModelElement(grammarAccess.getTransitionStateRule());
                            									}
                            								

                            									newCompositeNode(grammarAccess.getTransitionStateAccess().getDigitalsDigitalCrossReference_0_0_1_0_0_0());
                            								
                            pushFollow(FOLLOW_28);
                            ruleEString();

                            state._fsp--;


                            									afterParserOrEnumRuleCall();
                            								

                            }


                            }

                            otherlv_2=(Token)match(input,31,FOLLOW_27); 

                            							newLeafNode(otherlv_2, grammarAccess.getTransitionStateAccess().getIsKeyword_0_0_1_0_1());
                            						
                            // InternalArduinoML.g:1053:7: ( (lv_d_values_3_0= ruleSignal ) )
                            // InternalArduinoML.g:1054:8: (lv_d_values_3_0= ruleSignal )
                            {
                            // InternalArduinoML.g:1054:8: (lv_d_values_3_0= ruleSignal )
                            // InternalArduinoML.g:1055:9: lv_d_values_3_0= ruleSignal
                            {

                            									newCompositeNode(grammarAccess.getTransitionStateAccess().getD_valuesSignalEnumRuleCall_0_0_1_0_2_0());
                            								
                            pushFollow(FOLLOW_29);
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
                            // InternalArduinoML.g:1074:6: ( ( ( ruleEString ) ) ( (lv_comp_5_0= ruleCompare ) ) ( (lv_a_values_6_0= ruleEInt ) ) )
                            {
                            // InternalArduinoML.g:1074:6: ( ( ( ruleEString ) ) ( (lv_comp_5_0= ruleCompare ) ) ( (lv_a_values_6_0= ruleEInt ) ) )
                            // InternalArduinoML.g:1075:7: ( ( ruleEString ) ) ( (lv_comp_5_0= ruleCompare ) ) ( (lv_a_values_6_0= ruleEInt ) )
                            {
                            // InternalArduinoML.g:1075:7: ( ( ruleEString ) )
                            // InternalArduinoML.g:1076:8: ( ruleEString )
                            {
                            // InternalArduinoML.g:1076:8: ( ruleEString )
                            // InternalArduinoML.g:1077:9: ruleEString
                            {

                            									if (current==null) {
                            										current = createModelElement(grammarAccess.getTransitionStateRule());
                            									}
                            								

                            									newCompositeNode(grammarAccess.getTransitionStateAccess().getAnalogsAnalogCrossReference_0_0_1_1_0_0());
                            								
                            pushFollow(FOLLOW_30);
                            ruleEString();

                            state._fsp--;


                            									afterParserOrEnumRuleCall();
                            								

                            }


                            }

                            // InternalArduinoML.g:1091:7: ( (lv_comp_5_0= ruleCompare ) )
                            // InternalArduinoML.g:1092:8: (lv_comp_5_0= ruleCompare )
                            {
                            // InternalArduinoML.g:1092:8: (lv_comp_5_0= ruleCompare )
                            // InternalArduinoML.g:1093:9: lv_comp_5_0= ruleCompare
                            {

                            									newCompositeNode(grammarAccess.getTransitionStateAccess().getCompCompareEnumRuleCall_0_0_1_1_1_0());
                            								
                            pushFollow(FOLLOW_14);
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

                            // InternalArduinoML.g:1110:7: ( (lv_a_values_6_0= ruleEInt ) )
                            // InternalArduinoML.g:1111:8: (lv_a_values_6_0= ruleEInt )
                            {
                            // InternalArduinoML.g:1111:8: (lv_a_values_6_0= ruleEInt )
                            // InternalArduinoML.g:1112:9: lv_a_values_6_0= ruleEInt
                            {

                            									newCompositeNode(grammarAccess.getTransitionStateAccess().getA_valuesEIntParserRuleCall_0_0_1_1_2_0());
                            								
                            pushFollow(FOLLOW_29);
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

                    // InternalArduinoML.g:1131:5: (otherlv_7= 'and' ( ( ( ( ruleEString ) ) otherlv_9= 'is' ( (lv_d_values_10_0= ruleSignal ) ) ) | ( ( ( ruleEString ) ) ( (lv_comp_12_0= ruleCompare ) ) ( (lv_a_values_13_0= ruleEInt ) ) ) ) )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==32) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // InternalArduinoML.g:1132:6: otherlv_7= 'and' ( ( ( ( ruleEString ) ) otherlv_9= 'is' ( (lv_d_values_10_0= ruleSignal ) ) ) | ( ( ( ruleEString ) ) ( (lv_comp_12_0= ruleCompare ) ) ( (lv_a_values_13_0= ruleEInt ) ) ) )
                    	    {
                    	    otherlv_7=(Token)match(input,32,FOLLOW_6); 

                    	    						newLeafNode(otherlv_7, grammarAccess.getTransitionStateAccess().getAndKeyword_0_0_2_0());
                    	    					
                    	    // InternalArduinoML.g:1136:6: ( ( ( ( ruleEString ) ) otherlv_9= 'is' ( (lv_d_values_10_0= ruleSignal ) ) ) | ( ( ( ruleEString ) ) ( (lv_comp_12_0= ruleCompare ) ) ( (lv_a_values_13_0= ruleEInt ) ) ) )
                    	    int alt17=2;
                    	    int LA17_0 = input.LA(1);

                    	    if ( (LA17_0==RULE_STRING) ) {
                    	        int LA17_1 = input.LA(2);

                    	        if ( (LA17_1==31) ) {
                    	            alt17=1;
                    	        }
                    	        else if ( ((LA17_1>=41 && LA17_1<=45)) ) {
                    	            alt17=2;
                    	        }
                    	        else {
                    	            NoViableAltException nvae =
                    	                new NoViableAltException("", 17, 1, input);

                    	            throw nvae;
                    	        }
                    	    }
                    	    else if ( (LA17_0==RULE_ID) ) {
                    	        int LA17_2 = input.LA(2);

                    	        if ( ((LA17_2>=41 && LA17_2<=45)) ) {
                    	            alt17=2;
                    	        }
                    	        else if ( (LA17_2==31) ) {
                    	            alt17=1;
                    	        }
                    	        else {
                    	            NoViableAltException nvae =
                    	                new NoViableAltException("", 17, 2, input);

                    	            throw nvae;
                    	        }
                    	    }
                    	    else {
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 17, 0, input);

                    	        throw nvae;
                    	    }
                    	    switch (alt17) {
                    	        case 1 :
                    	            // InternalArduinoML.g:1137:7: ( ( ( ruleEString ) ) otherlv_9= 'is' ( (lv_d_values_10_0= ruleSignal ) ) )
                    	            {
                    	            // InternalArduinoML.g:1137:7: ( ( ( ruleEString ) ) otherlv_9= 'is' ( (lv_d_values_10_0= ruleSignal ) ) )
                    	            // InternalArduinoML.g:1138:8: ( ( ruleEString ) ) otherlv_9= 'is' ( (lv_d_values_10_0= ruleSignal ) )
                    	            {
                    	            // InternalArduinoML.g:1138:8: ( ( ruleEString ) )
                    	            // InternalArduinoML.g:1139:9: ( ruleEString )
                    	            {
                    	            // InternalArduinoML.g:1139:9: ( ruleEString )
                    	            // InternalArduinoML.g:1140:10: ruleEString
                    	            {

                    	            										if (current==null) {
                    	            											current = createModelElement(grammarAccess.getTransitionStateRule());
                    	            										}
                    	            									

                    	            										newCompositeNode(grammarAccess.getTransitionStateAccess().getDigitalsDigitalCrossReference_0_0_2_1_0_0_0());
                    	            									
                    	            pushFollow(FOLLOW_28);
                    	            ruleEString();

                    	            state._fsp--;


                    	            										afterParserOrEnumRuleCall();
                    	            									

                    	            }


                    	            }

                    	            otherlv_9=(Token)match(input,31,FOLLOW_27); 

                    	            								newLeafNode(otherlv_9, grammarAccess.getTransitionStateAccess().getIsKeyword_0_0_2_1_0_1());
                    	            							
                    	            // InternalArduinoML.g:1158:8: ( (lv_d_values_10_0= ruleSignal ) )
                    	            // InternalArduinoML.g:1159:9: (lv_d_values_10_0= ruleSignal )
                    	            {
                    	            // InternalArduinoML.g:1159:9: (lv_d_values_10_0= ruleSignal )
                    	            // InternalArduinoML.g:1160:10: lv_d_values_10_0= ruleSignal
                    	            {

                    	            										newCompositeNode(grammarAccess.getTransitionStateAccess().getD_valuesSignalEnumRuleCall_0_0_2_1_0_2_0());
                    	            									
                    	            pushFollow(FOLLOW_29);
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
                    	            // InternalArduinoML.g:1179:7: ( ( ( ruleEString ) ) ( (lv_comp_12_0= ruleCompare ) ) ( (lv_a_values_13_0= ruleEInt ) ) )
                    	            {
                    	            // InternalArduinoML.g:1179:7: ( ( ( ruleEString ) ) ( (lv_comp_12_0= ruleCompare ) ) ( (lv_a_values_13_0= ruleEInt ) ) )
                    	            // InternalArduinoML.g:1180:8: ( ( ruleEString ) ) ( (lv_comp_12_0= ruleCompare ) ) ( (lv_a_values_13_0= ruleEInt ) )
                    	            {
                    	            // InternalArduinoML.g:1180:8: ( ( ruleEString ) )
                    	            // InternalArduinoML.g:1181:9: ( ruleEString )
                    	            {
                    	            // InternalArduinoML.g:1181:9: ( ruleEString )
                    	            // InternalArduinoML.g:1182:10: ruleEString
                    	            {

                    	            										if (current==null) {
                    	            											current = createModelElement(grammarAccess.getTransitionStateRule());
                    	            										}
                    	            									

                    	            										newCompositeNode(grammarAccess.getTransitionStateAccess().getAnalogsAnalogCrossReference_0_0_2_1_1_0_0());
                    	            									
                    	            pushFollow(FOLLOW_30);
                    	            ruleEString();

                    	            state._fsp--;


                    	            										afterParserOrEnumRuleCall();
                    	            									

                    	            }


                    	            }

                    	            // InternalArduinoML.g:1196:8: ( (lv_comp_12_0= ruleCompare ) )
                    	            // InternalArduinoML.g:1197:9: (lv_comp_12_0= ruleCompare )
                    	            {
                    	            // InternalArduinoML.g:1197:9: (lv_comp_12_0= ruleCompare )
                    	            // InternalArduinoML.g:1198:10: lv_comp_12_0= ruleCompare
                    	            {

                    	            										newCompositeNode(grammarAccess.getTransitionStateAccess().getCompCompareEnumRuleCall_0_0_2_1_1_1_0());
                    	            									
                    	            pushFollow(FOLLOW_14);
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

                    	            // InternalArduinoML.g:1215:8: ( (lv_a_values_13_0= ruleEInt ) )
                    	            // InternalArduinoML.g:1216:9: (lv_a_values_13_0= ruleEInt )
                    	            {
                    	            // InternalArduinoML.g:1216:9: (lv_a_values_13_0= ruleEInt )
                    	            // InternalArduinoML.g:1217:10: lv_a_values_13_0= ruleEInt
                    	            {

                    	            										newCompositeNode(grammarAccess.getTransitionStateAccess().getA_valuesEIntParserRuleCall_0_0_2_1_1_2_0());
                    	            									
                    	            pushFollow(FOLLOW_29);
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
                    	    break loop18;
                        }
                    } while (true);

                    // InternalArduinoML.g:1237:5: (otherlv_14= 'wait' ( (lv_time_15_0= ruleEInt ) ) ( (lv_unit_16_0= ruleTime_unit ) ) otherlv_17= 'then' )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==33) ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // InternalArduinoML.g:1238:6: otherlv_14= 'wait' ( (lv_time_15_0= ruleEInt ) ) ( (lv_unit_16_0= ruleTime_unit ) ) otherlv_17= 'then'
                            {
                            otherlv_14=(Token)match(input,33,FOLLOW_14); 

                            						newLeafNode(otherlv_14, grammarAccess.getTransitionStateAccess().getWaitKeyword_0_0_3_0());
                            					
                            // InternalArduinoML.g:1242:6: ( (lv_time_15_0= ruleEInt ) )
                            // InternalArduinoML.g:1243:7: (lv_time_15_0= ruleEInt )
                            {
                            // InternalArduinoML.g:1243:7: (lv_time_15_0= ruleEInt )
                            // InternalArduinoML.g:1244:8: lv_time_15_0= ruleEInt
                            {

                            								newCompositeNode(grammarAccess.getTransitionStateAccess().getTimeEIntParserRuleCall_0_0_3_1_0());
                            							
                            pushFollow(FOLLOW_31);
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

                            // InternalArduinoML.g:1261:6: ( (lv_unit_16_0= ruleTime_unit ) )
                            // InternalArduinoML.g:1262:7: (lv_unit_16_0= ruleTime_unit )
                            {
                            // InternalArduinoML.g:1262:7: (lv_unit_16_0= ruleTime_unit )
                            // InternalArduinoML.g:1263:8: lv_unit_16_0= ruleTime_unit
                            {

                            								newCompositeNode(grammarAccess.getTransitionStateAccess().getUnitTime_unitEnumRuleCall_0_0_3_2_0());
                            							
                            pushFollow(FOLLOW_32);
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

                            otherlv_17=(Token)match(input,34,FOLLOW_33); 

                            						newLeafNode(otherlv_17, grammarAccess.getTransitionStateAccess().getThenKeyword_0_0_3_3());
                            					

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalArduinoML.g:1287:4: (otherlv_18= 'wait' ( (lv_time_19_0= ruleEInt ) ) ( (lv_unit_20_0= ruleTime_unit ) ) otherlv_21= 'then' )
                    {
                    // InternalArduinoML.g:1287:4: (otherlv_18= 'wait' ( (lv_time_19_0= ruleEInt ) ) ( (lv_unit_20_0= ruleTime_unit ) ) otherlv_21= 'then' )
                    // InternalArduinoML.g:1288:5: otherlv_18= 'wait' ( (lv_time_19_0= ruleEInt ) ) ( (lv_unit_20_0= ruleTime_unit ) ) otherlv_21= 'then'
                    {
                    otherlv_18=(Token)match(input,33,FOLLOW_14); 

                    					newLeafNode(otherlv_18, grammarAccess.getTransitionStateAccess().getWaitKeyword_0_1_0());
                    				
                    // InternalArduinoML.g:1292:5: ( (lv_time_19_0= ruleEInt ) )
                    // InternalArduinoML.g:1293:6: (lv_time_19_0= ruleEInt )
                    {
                    // InternalArduinoML.g:1293:6: (lv_time_19_0= ruleEInt )
                    // InternalArduinoML.g:1294:7: lv_time_19_0= ruleEInt
                    {

                    							newCompositeNode(grammarAccess.getTransitionStateAccess().getTimeEIntParserRuleCall_0_1_1_0());
                    						
                    pushFollow(FOLLOW_31);
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

                    // InternalArduinoML.g:1311:5: ( (lv_unit_20_0= ruleTime_unit ) )
                    // InternalArduinoML.g:1312:6: (lv_unit_20_0= ruleTime_unit )
                    {
                    // InternalArduinoML.g:1312:6: (lv_unit_20_0= ruleTime_unit )
                    // InternalArduinoML.g:1313:7: lv_unit_20_0= ruleTime_unit
                    {

                    							newCompositeNode(grammarAccess.getTransitionStateAccess().getUnitTime_unitEnumRuleCall_0_1_2_0());
                    						
                    pushFollow(FOLLOW_32);
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

                    otherlv_21=(Token)match(input,34,FOLLOW_33); 

                    					newLeafNode(otherlv_21, grammarAccess.getTransitionStateAccess().getThenKeyword_0_1_3());
                    				

                    }


                    }
                    break;

            }

            otherlv_22=(Token)match(input,35,FOLLOW_26); 

            			newLeafNode(otherlv_22, grammarAccess.getTransitionStateAccess().getGoKeyword_1());
            		
            otherlv_23=(Token)match(input,29,FOLLOW_17); 

            			newLeafNode(otherlv_23, grammarAccess.getTransitionStateAccess().getToKeyword_2());
            		
            otherlv_24=(Token)match(input,22,FOLLOW_6); 

            			newLeafNode(otherlv_24, grammarAccess.getTransitionStateAccess().getStateKeyword_3());
            		
            // InternalArduinoML.g:1348:3: ( ( ruleEString ) )
            // InternalArduinoML.g:1349:4: ( ruleEString )
            {
            // InternalArduinoML.g:1349:4: ( ruleEString )
            // InternalArduinoML.g:1350:5: ruleEString
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
    // InternalArduinoML.g:1368:1: entryRuleTransitionMode returns [EObject current=null] : iv_ruleTransitionMode= ruleTransitionMode EOF ;
    public final EObject entryRuleTransitionMode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransitionMode = null;


        try {
            // InternalArduinoML.g:1368:55: (iv_ruleTransitionMode= ruleTransitionMode EOF )
            // InternalArduinoML.g:1369:2: iv_ruleTransitionMode= ruleTransitionMode EOF
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
    // InternalArduinoML.g:1375:1: ruleTransitionMode returns [EObject current=null] : ( ( (otherlv_0= 'when' ( ( ( ( ruleEString ) ) otherlv_2= 'is' ( (lv_d_values_3_0= ruleSignal ) ) ) | ( ( ( ruleEString ) ) ( (lv_comp_5_0= ruleCompare ) ) ( (lv_a_values_6_0= ruleEInt ) ) ) ) (otherlv_7= 'and' ( ( ( ( ruleEString ) ) otherlv_9= 'is' ( (lv_d_values_10_0= ruleSignal ) ) ) | ( ( ( ruleEString ) ) ( (lv_comp_12_0= ruleCompare ) ) ( (lv_a_values_13_0= ruleEInt ) ) ) ) )* (otherlv_14= 'wait' ( (lv_time_15_0= ruleEInt ) ) ( (lv_unit_16_0= ruleTime_unit ) ) otherlv_17= 'then' )? ) | (otherlv_18= 'wait' ( (lv_time_19_0= ruleEInt ) ) ( (lv_unit_20_0= ruleTime_unit ) ) otherlv_21= 'then' ) ) otherlv_22= 'go' otherlv_23= 'to' otherlv_24= 'mode' ( ( ruleEString ) ) ) ;
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
            // InternalArduinoML.g:1381:2: ( ( ( (otherlv_0= 'when' ( ( ( ( ruleEString ) ) otherlv_2= 'is' ( (lv_d_values_3_0= ruleSignal ) ) ) | ( ( ( ruleEString ) ) ( (lv_comp_5_0= ruleCompare ) ) ( (lv_a_values_6_0= ruleEInt ) ) ) ) (otherlv_7= 'and' ( ( ( ( ruleEString ) ) otherlv_9= 'is' ( (lv_d_values_10_0= ruleSignal ) ) ) | ( ( ( ruleEString ) ) ( (lv_comp_12_0= ruleCompare ) ) ( (lv_a_values_13_0= ruleEInt ) ) ) ) )* (otherlv_14= 'wait' ( (lv_time_15_0= ruleEInt ) ) ( (lv_unit_16_0= ruleTime_unit ) ) otherlv_17= 'then' )? ) | (otherlv_18= 'wait' ( (lv_time_19_0= ruleEInt ) ) ( (lv_unit_20_0= ruleTime_unit ) ) otherlv_21= 'then' ) ) otherlv_22= 'go' otherlv_23= 'to' otherlv_24= 'mode' ( ( ruleEString ) ) ) )
            // InternalArduinoML.g:1382:2: ( ( (otherlv_0= 'when' ( ( ( ( ruleEString ) ) otherlv_2= 'is' ( (lv_d_values_3_0= ruleSignal ) ) ) | ( ( ( ruleEString ) ) ( (lv_comp_5_0= ruleCompare ) ) ( (lv_a_values_6_0= ruleEInt ) ) ) ) (otherlv_7= 'and' ( ( ( ( ruleEString ) ) otherlv_9= 'is' ( (lv_d_values_10_0= ruleSignal ) ) ) | ( ( ( ruleEString ) ) ( (lv_comp_12_0= ruleCompare ) ) ( (lv_a_values_13_0= ruleEInt ) ) ) ) )* (otherlv_14= 'wait' ( (lv_time_15_0= ruleEInt ) ) ( (lv_unit_16_0= ruleTime_unit ) ) otherlv_17= 'then' )? ) | (otherlv_18= 'wait' ( (lv_time_19_0= ruleEInt ) ) ( (lv_unit_20_0= ruleTime_unit ) ) otherlv_21= 'then' ) ) otherlv_22= 'go' otherlv_23= 'to' otherlv_24= 'mode' ( ( ruleEString ) ) )
            {
            // InternalArduinoML.g:1382:2: ( ( (otherlv_0= 'when' ( ( ( ( ruleEString ) ) otherlv_2= 'is' ( (lv_d_values_3_0= ruleSignal ) ) ) | ( ( ( ruleEString ) ) ( (lv_comp_5_0= ruleCompare ) ) ( (lv_a_values_6_0= ruleEInt ) ) ) ) (otherlv_7= 'and' ( ( ( ( ruleEString ) ) otherlv_9= 'is' ( (lv_d_values_10_0= ruleSignal ) ) ) | ( ( ( ruleEString ) ) ( (lv_comp_12_0= ruleCompare ) ) ( (lv_a_values_13_0= ruleEInt ) ) ) ) )* (otherlv_14= 'wait' ( (lv_time_15_0= ruleEInt ) ) ( (lv_unit_16_0= ruleTime_unit ) ) otherlv_17= 'then' )? ) | (otherlv_18= 'wait' ( (lv_time_19_0= ruleEInt ) ) ( (lv_unit_20_0= ruleTime_unit ) ) otherlv_21= 'then' ) ) otherlv_22= 'go' otherlv_23= 'to' otherlv_24= 'mode' ( ( ruleEString ) ) )
            // InternalArduinoML.g:1383:3: ( (otherlv_0= 'when' ( ( ( ( ruleEString ) ) otherlv_2= 'is' ( (lv_d_values_3_0= ruleSignal ) ) ) | ( ( ( ruleEString ) ) ( (lv_comp_5_0= ruleCompare ) ) ( (lv_a_values_6_0= ruleEInt ) ) ) ) (otherlv_7= 'and' ( ( ( ( ruleEString ) ) otherlv_9= 'is' ( (lv_d_values_10_0= ruleSignal ) ) ) | ( ( ( ruleEString ) ) ( (lv_comp_12_0= ruleCompare ) ) ( (lv_a_values_13_0= ruleEInt ) ) ) ) )* (otherlv_14= 'wait' ( (lv_time_15_0= ruleEInt ) ) ( (lv_unit_16_0= ruleTime_unit ) ) otherlv_17= 'then' )? ) | (otherlv_18= 'wait' ( (lv_time_19_0= ruleEInt ) ) ( (lv_unit_20_0= ruleTime_unit ) ) otherlv_21= 'then' ) ) otherlv_22= 'go' otherlv_23= 'to' otherlv_24= 'mode' ( ( ruleEString ) )
            {
            // InternalArduinoML.g:1383:3: ( (otherlv_0= 'when' ( ( ( ( ruleEString ) ) otherlv_2= 'is' ( (lv_d_values_3_0= ruleSignal ) ) ) | ( ( ( ruleEString ) ) ( (lv_comp_5_0= ruleCompare ) ) ( (lv_a_values_6_0= ruleEInt ) ) ) ) (otherlv_7= 'and' ( ( ( ( ruleEString ) ) otherlv_9= 'is' ( (lv_d_values_10_0= ruleSignal ) ) ) | ( ( ( ruleEString ) ) ( (lv_comp_12_0= ruleCompare ) ) ( (lv_a_values_13_0= ruleEInt ) ) ) ) )* (otherlv_14= 'wait' ( (lv_time_15_0= ruleEInt ) ) ( (lv_unit_16_0= ruleTime_unit ) ) otherlv_17= 'then' )? ) | (otherlv_18= 'wait' ( (lv_time_19_0= ruleEInt ) ) ( (lv_unit_20_0= ruleTime_unit ) ) otherlv_21= 'then' ) )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==30) ) {
                alt25=1;
            }
            else if ( (LA25_0==33) ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // InternalArduinoML.g:1384:4: (otherlv_0= 'when' ( ( ( ( ruleEString ) ) otherlv_2= 'is' ( (lv_d_values_3_0= ruleSignal ) ) ) | ( ( ( ruleEString ) ) ( (lv_comp_5_0= ruleCompare ) ) ( (lv_a_values_6_0= ruleEInt ) ) ) ) (otherlv_7= 'and' ( ( ( ( ruleEString ) ) otherlv_9= 'is' ( (lv_d_values_10_0= ruleSignal ) ) ) | ( ( ( ruleEString ) ) ( (lv_comp_12_0= ruleCompare ) ) ( (lv_a_values_13_0= ruleEInt ) ) ) ) )* (otherlv_14= 'wait' ( (lv_time_15_0= ruleEInt ) ) ( (lv_unit_16_0= ruleTime_unit ) ) otherlv_17= 'then' )? )
                    {
                    // InternalArduinoML.g:1384:4: (otherlv_0= 'when' ( ( ( ( ruleEString ) ) otherlv_2= 'is' ( (lv_d_values_3_0= ruleSignal ) ) ) | ( ( ( ruleEString ) ) ( (lv_comp_5_0= ruleCompare ) ) ( (lv_a_values_6_0= ruleEInt ) ) ) ) (otherlv_7= 'and' ( ( ( ( ruleEString ) ) otherlv_9= 'is' ( (lv_d_values_10_0= ruleSignal ) ) ) | ( ( ( ruleEString ) ) ( (lv_comp_12_0= ruleCompare ) ) ( (lv_a_values_13_0= ruleEInt ) ) ) ) )* (otherlv_14= 'wait' ( (lv_time_15_0= ruleEInt ) ) ( (lv_unit_16_0= ruleTime_unit ) ) otherlv_17= 'then' )? )
                    // InternalArduinoML.g:1385:5: otherlv_0= 'when' ( ( ( ( ruleEString ) ) otherlv_2= 'is' ( (lv_d_values_3_0= ruleSignal ) ) ) | ( ( ( ruleEString ) ) ( (lv_comp_5_0= ruleCompare ) ) ( (lv_a_values_6_0= ruleEInt ) ) ) ) (otherlv_7= 'and' ( ( ( ( ruleEString ) ) otherlv_9= 'is' ( (lv_d_values_10_0= ruleSignal ) ) ) | ( ( ( ruleEString ) ) ( (lv_comp_12_0= ruleCompare ) ) ( (lv_a_values_13_0= ruleEInt ) ) ) ) )* (otherlv_14= 'wait' ( (lv_time_15_0= ruleEInt ) ) ( (lv_unit_16_0= ruleTime_unit ) ) otherlv_17= 'then' )?
                    {
                    otherlv_0=(Token)match(input,30,FOLLOW_6); 

                    					newLeafNode(otherlv_0, grammarAccess.getTransitionModeAccess().getWhenKeyword_0_0_0());
                    				
                    // InternalArduinoML.g:1389:5: ( ( ( ( ruleEString ) ) otherlv_2= 'is' ( (lv_d_values_3_0= ruleSignal ) ) ) | ( ( ( ruleEString ) ) ( (lv_comp_5_0= ruleCompare ) ) ( (lv_a_values_6_0= ruleEInt ) ) ) )
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==RULE_STRING) ) {
                        int LA21_1 = input.LA(2);

                        if ( (LA21_1==31) ) {
                            alt21=1;
                        }
                        else if ( ((LA21_1>=41 && LA21_1<=45)) ) {
                            alt21=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 21, 1, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA21_0==RULE_ID) ) {
                        int LA21_2 = input.LA(2);

                        if ( ((LA21_2>=41 && LA21_2<=45)) ) {
                            alt21=2;
                        }
                        else if ( (LA21_2==31) ) {
                            alt21=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 21, 2, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 21, 0, input);

                        throw nvae;
                    }
                    switch (alt21) {
                        case 1 :
                            // InternalArduinoML.g:1390:6: ( ( ( ruleEString ) ) otherlv_2= 'is' ( (lv_d_values_3_0= ruleSignal ) ) )
                            {
                            // InternalArduinoML.g:1390:6: ( ( ( ruleEString ) ) otherlv_2= 'is' ( (lv_d_values_3_0= ruleSignal ) ) )
                            // InternalArduinoML.g:1391:7: ( ( ruleEString ) ) otherlv_2= 'is' ( (lv_d_values_3_0= ruleSignal ) )
                            {
                            // InternalArduinoML.g:1391:7: ( ( ruleEString ) )
                            // InternalArduinoML.g:1392:8: ( ruleEString )
                            {
                            // InternalArduinoML.g:1392:8: ( ruleEString )
                            // InternalArduinoML.g:1393:9: ruleEString
                            {

                            									if (current==null) {
                            										current = createModelElement(grammarAccess.getTransitionModeRule());
                            									}
                            								

                            									newCompositeNode(grammarAccess.getTransitionModeAccess().getDigitalsDigitalCrossReference_0_0_1_0_0_0());
                            								
                            pushFollow(FOLLOW_28);
                            ruleEString();

                            state._fsp--;


                            									afterParserOrEnumRuleCall();
                            								

                            }


                            }

                            otherlv_2=(Token)match(input,31,FOLLOW_27); 

                            							newLeafNode(otherlv_2, grammarAccess.getTransitionModeAccess().getIsKeyword_0_0_1_0_1());
                            						
                            // InternalArduinoML.g:1411:7: ( (lv_d_values_3_0= ruleSignal ) )
                            // InternalArduinoML.g:1412:8: (lv_d_values_3_0= ruleSignal )
                            {
                            // InternalArduinoML.g:1412:8: (lv_d_values_3_0= ruleSignal )
                            // InternalArduinoML.g:1413:9: lv_d_values_3_0= ruleSignal
                            {

                            									newCompositeNode(grammarAccess.getTransitionModeAccess().getD_valuesSignalEnumRuleCall_0_0_1_0_2_0());
                            								
                            pushFollow(FOLLOW_29);
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
                            // InternalArduinoML.g:1432:6: ( ( ( ruleEString ) ) ( (lv_comp_5_0= ruleCompare ) ) ( (lv_a_values_6_0= ruleEInt ) ) )
                            {
                            // InternalArduinoML.g:1432:6: ( ( ( ruleEString ) ) ( (lv_comp_5_0= ruleCompare ) ) ( (lv_a_values_6_0= ruleEInt ) ) )
                            // InternalArduinoML.g:1433:7: ( ( ruleEString ) ) ( (lv_comp_5_0= ruleCompare ) ) ( (lv_a_values_6_0= ruleEInt ) )
                            {
                            // InternalArduinoML.g:1433:7: ( ( ruleEString ) )
                            // InternalArduinoML.g:1434:8: ( ruleEString )
                            {
                            // InternalArduinoML.g:1434:8: ( ruleEString )
                            // InternalArduinoML.g:1435:9: ruleEString
                            {

                            									if (current==null) {
                            										current = createModelElement(grammarAccess.getTransitionModeRule());
                            									}
                            								

                            									newCompositeNode(grammarAccess.getTransitionModeAccess().getAnalogsAnalogCrossReference_0_0_1_1_0_0());
                            								
                            pushFollow(FOLLOW_30);
                            ruleEString();

                            state._fsp--;


                            									afterParserOrEnumRuleCall();
                            								

                            }


                            }

                            // InternalArduinoML.g:1449:7: ( (lv_comp_5_0= ruleCompare ) )
                            // InternalArduinoML.g:1450:8: (lv_comp_5_0= ruleCompare )
                            {
                            // InternalArduinoML.g:1450:8: (lv_comp_5_0= ruleCompare )
                            // InternalArduinoML.g:1451:9: lv_comp_5_0= ruleCompare
                            {

                            									newCompositeNode(grammarAccess.getTransitionModeAccess().getCompCompareEnumRuleCall_0_0_1_1_1_0());
                            								
                            pushFollow(FOLLOW_14);
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

                            // InternalArduinoML.g:1468:7: ( (lv_a_values_6_0= ruleEInt ) )
                            // InternalArduinoML.g:1469:8: (lv_a_values_6_0= ruleEInt )
                            {
                            // InternalArduinoML.g:1469:8: (lv_a_values_6_0= ruleEInt )
                            // InternalArduinoML.g:1470:9: lv_a_values_6_0= ruleEInt
                            {

                            									newCompositeNode(grammarAccess.getTransitionModeAccess().getA_valuesEIntParserRuleCall_0_0_1_1_2_0());
                            								
                            pushFollow(FOLLOW_29);
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

                    // InternalArduinoML.g:1489:5: (otherlv_7= 'and' ( ( ( ( ruleEString ) ) otherlv_9= 'is' ( (lv_d_values_10_0= ruleSignal ) ) ) | ( ( ( ruleEString ) ) ( (lv_comp_12_0= ruleCompare ) ) ( (lv_a_values_13_0= ruleEInt ) ) ) ) )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==32) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // InternalArduinoML.g:1490:6: otherlv_7= 'and' ( ( ( ( ruleEString ) ) otherlv_9= 'is' ( (lv_d_values_10_0= ruleSignal ) ) ) | ( ( ( ruleEString ) ) ( (lv_comp_12_0= ruleCompare ) ) ( (lv_a_values_13_0= ruleEInt ) ) ) )
                    	    {
                    	    otherlv_7=(Token)match(input,32,FOLLOW_6); 

                    	    						newLeafNode(otherlv_7, grammarAccess.getTransitionModeAccess().getAndKeyword_0_0_2_0());
                    	    					
                    	    // InternalArduinoML.g:1494:6: ( ( ( ( ruleEString ) ) otherlv_9= 'is' ( (lv_d_values_10_0= ruleSignal ) ) ) | ( ( ( ruleEString ) ) ( (lv_comp_12_0= ruleCompare ) ) ( (lv_a_values_13_0= ruleEInt ) ) ) )
                    	    int alt22=2;
                    	    int LA22_0 = input.LA(1);

                    	    if ( (LA22_0==RULE_STRING) ) {
                    	        int LA22_1 = input.LA(2);

                    	        if ( ((LA22_1>=41 && LA22_1<=45)) ) {
                    	            alt22=2;
                    	        }
                    	        else if ( (LA22_1==31) ) {
                    	            alt22=1;
                    	        }
                    	        else {
                    	            NoViableAltException nvae =
                    	                new NoViableAltException("", 22, 1, input);

                    	            throw nvae;
                    	        }
                    	    }
                    	    else if ( (LA22_0==RULE_ID) ) {
                    	        int LA22_2 = input.LA(2);

                    	        if ( (LA22_2==31) ) {
                    	            alt22=1;
                    	        }
                    	        else if ( ((LA22_2>=41 && LA22_2<=45)) ) {
                    	            alt22=2;
                    	        }
                    	        else {
                    	            NoViableAltException nvae =
                    	                new NoViableAltException("", 22, 2, input);

                    	            throw nvae;
                    	        }
                    	    }
                    	    else {
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 22, 0, input);

                    	        throw nvae;
                    	    }
                    	    switch (alt22) {
                    	        case 1 :
                    	            // InternalArduinoML.g:1495:7: ( ( ( ruleEString ) ) otherlv_9= 'is' ( (lv_d_values_10_0= ruleSignal ) ) )
                    	            {
                    	            // InternalArduinoML.g:1495:7: ( ( ( ruleEString ) ) otherlv_9= 'is' ( (lv_d_values_10_0= ruleSignal ) ) )
                    	            // InternalArduinoML.g:1496:8: ( ( ruleEString ) ) otherlv_9= 'is' ( (lv_d_values_10_0= ruleSignal ) )
                    	            {
                    	            // InternalArduinoML.g:1496:8: ( ( ruleEString ) )
                    	            // InternalArduinoML.g:1497:9: ( ruleEString )
                    	            {
                    	            // InternalArduinoML.g:1497:9: ( ruleEString )
                    	            // InternalArduinoML.g:1498:10: ruleEString
                    	            {

                    	            										if (current==null) {
                    	            											current = createModelElement(grammarAccess.getTransitionModeRule());
                    	            										}
                    	            									

                    	            										newCompositeNode(grammarAccess.getTransitionModeAccess().getDigitalsDigitalCrossReference_0_0_2_1_0_0_0());
                    	            									
                    	            pushFollow(FOLLOW_28);
                    	            ruleEString();

                    	            state._fsp--;


                    	            										afterParserOrEnumRuleCall();
                    	            									

                    	            }


                    	            }

                    	            otherlv_9=(Token)match(input,31,FOLLOW_27); 

                    	            								newLeafNode(otherlv_9, grammarAccess.getTransitionModeAccess().getIsKeyword_0_0_2_1_0_1());
                    	            							
                    	            // InternalArduinoML.g:1516:8: ( (lv_d_values_10_0= ruleSignal ) )
                    	            // InternalArduinoML.g:1517:9: (lv_d_values_10_0= ruleSignal )
                    	            {
                    	            // InternalArduinoML.g:1517:9: (lv_d_values_10_0= ruleSignal )
                    	            // InternalArduinoML.g:1518:10: lv_d_values_10_0= ruleSignal
                    	            {

                    	            										newCompositeNode(grammarAccess.getTransitionModeAccess().getD_valuesSignalEnumRuleCall_0_0_2_1_0_2_0());
                    	            									
                    	            pushFollow(FOLLOW_29);
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
                    	            // InternalArduinoML.g:1537:7: ( ( ( ruleEString ) ) ( (lv_comp_12_0= ruleCompare ) ) ( (lv_a_values_13_0= ruleEInt ) ) )
                    	            {
                    	            // InternalArduinoML.g:1537:7: ( ( ( ruleEString ) ) ( (lv_comp_12_0= ruleCompare ) ) ( (lv_a_values_13_0= ruleEInt ) ) )
                    	            // InternalArduinoML.g:1538:8: ( ( ruleEString ) ) ( (lv_comp_12_0= ruleCompare ) ) ( (lv_a_values_13_0= ruleEInt ) )
                    	            {
                    	            // InternalArduinoML.g:1538:8: ( ( ruleEString ) )
                    	            // InternalArduinoML.g:1539:9: ( ruleEString )
                    	            {
                    	            // InternalArduinoML.g:1539:9: ( ruleEString )
                    	            // InternalArduinoML.g:1540:10: ruleEString
                    	            {

                    	            										if (current==null) {
                    	            											current = createModelElement(grammarAccess.getTransitionModeRule());
                    	            										}
                    	            									

                    	            										newCompositeNode(grammarAccess.getTransitionModeAccess().getAnalogsAnalogCrossReference_0_0_2_1_1_0_0());
                    	            									
                    	            pushFollow(FOLLOW_30);
                    	            ruleEString();

                    	            state._fsp--;


                    	            										afterParserOrEnumRuleCall();
                    	            									

                    	            }


                    	            }

                    	            // InternalArduinoML.g:1554:8: ( (lv_comp_12_0= ruleCompare ) )
                    	            // InternalArduinoML.g:1555:9: (lv_comp_12_0= ruleCompare )
                    	            {
                    	            // InternalArduinoML.g:1555:9: (lv_comp_12_0= ruleCompare )
                    	            // InternalArduinoML.g:1556:10: lv_comp_12_0= ruleCompare
                    	            {

                    	            										newCompositeNode(grammarAccess.getTransitionModeAccess().getCompCompareEnumRuleCall_0_0_2_1_1_1_0());
                    	            									
                    	            pushFollow(FOLLOW_14);
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

                    	            // InternalArduinoML.g:1573:8: ( (lv_a_values_13_0= ruleEInt ) )
                    	            // InternalArduinoML.g:1574:9: (lv_a_values_13_0= ruleEInt )
                    	            {
                    	            // InternalArduinoML.g:1574:9: (lv_a_values_13_0= ruleEInt )
                    	            // InternalArduinoML.g:1575:10: lv_a_values_13_0= ruleEInt
                    	            {

                    	            										newCompositeNode(grammarAccess.getTransitionModeAccess().getA_valuesEIntParserRuleCall_0_0_2_1_1_2_0());
                    	            									
                    	            pushFollow(FOLLOW_29);
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
                    	    break loop23;
                        }
                    } while (true);

                    // InternalArduinoML.g:1595:5: (otherlv_14= 'wait' ( (lv_time_15_0= ruleEInt ) ) ( (lv_unit_16_0= ruleTime_unit ) ) otherlv_17= 'then' )?
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0==33) ) {
                        alt24=1;
                    }
                    switch (alt24) {
                        case 1 :
                            // InternalArduinoML.g:1596:6: otherlv_14= 'wait' ( (lv_time_15_0= ruleEInt ) ) ( (lv_unit_16_0= ruleTime_unit ) ) otherlv_17= 'then'
                            {
                            otherlv_14=(Token)match(input,33,FOLLOW_14); 

                            						newLeafNode(otherlv_14, grammarAccess.getTransitionModeAccess().getWaitKeyword_0_0_3_0());
                            					
                            // InternalArduinoML.g:1600:6: ( (lv_time_15_0= ruleEInt ) )
                            // InternalArduinoML.g:1601:7: (lv_time_15_0= ruleEInt )
                            {
                            // InternalArduinoML.g:1601:7: (lv_time_15_0= ruleEInt )
                            // InternalArduinoML.g:1602:8: lv_time_15_0= ruleEInt
                            {

                            								newCompositeNode(grammarAccess.getTransitionModeAccess().getTimeEIntParserRuleCall_0_0_3_1_0());
                            							
                            pushFollow(FOLLOW_31);
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

                            // InternalArduinoML.g:1619:6: ( (lv_unit_16_0= ruleTime_unit ) )
                            // InternalArduinoML.g:1620:7: (lv_unit_16_0= ruleTime_unit )
                            {
                            // InternalArduinoML.g:1620:7: (lv_unit_16_0= ruleTime_unit )
                            // InternalArduinoML.g:1621:8: lv_unit_16_0= ruleTime_unit
                            {

                            								newCompositeNode(grammarAccess.getTransitionModeAccess().getUnitTime_unitEnumRuleCall_0_0_3_2_0());
                            							
                            pushFollow(FOLLOW_32);
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

                            otherlv_17=(Token)match(input,34,FOLLOW_33); 

                            						newLeafNode(otherlv_17, grammarAccess.getTransitionModeAccess().getThenKeyword_0_0_3_3());
                            					

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalArduinoML.g:1645:4: (otherlv_18= 'wait' ( (lv_time_19_0= ruleEInt ) ) ( (lv_unit_20_0= ruleTime_unit ) ) otherlv_21= 'then' )
                    {
                    // InternalArduinoML.g:1645:4: (otherlv_18= 'wait' ( (lv_time_19_0= ruleEInt ) ) ( (lv_unit_20_0= ruleTime_unit ) ) otherlv_21= 'then' )
                    // InternalArduinoML.g:1646:5: otherlv_18= 'wait' ( (lv_time_19_0= ruleEInt ) ) ( (lv_unit_20_0= ruleTime_unit ) ) otherlv_21= 'then'
                    {
                    otherlv_18=(Token)match(input,33,FOLLOW_14); 

                    					newLeafNode(otherlv_18, grammarAccess.getTransitionModeAccess().getWaitKeyword_0_1_0());
                    				
                    // InternalArduinoML.g:1650:5: ( (lv_time_19_0= ruleEInt ) )
                    // InternalArduinoML.g:1651:6: (lv_time_19_0= ruleEInt )
                    {
                    // InternalArduinoML.g:1651:6: (lv_time_19_0= ruleEInt )
                    // InternalArduinoML.g:1652:7: lv_time_19_0= ruleEInt
                    {

                    							newCompositeNode(grammarAccess.getTransitionModeAccess().getTimeEIntParserRuleCall_0_1_1_0());
                    						
                    pushFollow(FOLLOW_31);
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

                    // InternalArduinoML.g:1669:5: ( (lv_unit_20_0= ruleTime_unit ) )
                    // InternalArduinoML.g:1670:6: (lv_unit_20_0= ruleTime_unit )
                    {
                    // InternalArduinoML.g:1670:6: (lv_unit_20_0= ruleTime_unit )
                    // InternalArduinoML.g:1671:7: lv_unit_20_0= ruleTime_unit
                    {

                    							newCompositeNode(grammarAccess.getTransitionModeAccess().getUnitTime_unitEnumRuleCall_0_1_2_0());
                    						
                    pushFollow(FOLLOW_32);
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

                    otherlv_21=(Token)match(input,34,FOLLOW_33); 

                    					newLeafNode(otherlv_21, grammarAccess.getTransitionModeAccess().getThenKeyword_0_1_3());
                    				

                    }


                    }
                    break;

            }

            otherlv_22=(Token)match(input,35,FOLLOW_26); 

            			newLeafNode(otherlv_22, grammarAccess.getTransitionModeAccess().getGoKeyword_1());
            		
            otherlv_23=(Token)match(input,29,FOLLOW_8); 

            			newLeafNode(otherlv_23, grammarAccess.getTransitionModeAccess().getToKeyword_2());
            		
            otherlv_24=(Token)match(input,16,FOLLOW_6); 

            			newLeafNode(otherlv_24, grammarAccess.getTransitionModeAccess().getModeKeyword_3());
            		
            // InternalArduinoML.g:1706:3: ( ( ruleEString ) )
            // InternalArduinoML.g:1707:4: ( ruleEString )
            {
            // InternalArduinoML.g:1707:4: ( ruleEString )
            // InternalArduinoML.g:1708:5: ruleEString
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
    // InternalArduinoML.g:1726:1: ruleSignal returns [Enumerator current=null] : ( (enumLiteral_0= 'HIGH' ) | (enumLiteral_1= 'LOW' ) ) ;
    public final Enumerator ruleSignal() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalArduinoML.g:1732:2: ( ( (enumLiteral_0= 'HIGH' ) | (enumLiteral_1= 'LOW' ) ) )
            // InternalArduinoML.g:1733:2: ( (enumLiteral_0= 'HIGH' ) | (enumLiteral_1= 'LOW' ) )
            {
            // InternalArduinoML.g:1733:2: ( (enumLiteral_0= 'HIGH' ) | (enumLiteral_1= 'LOW' ) )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==36) ) {
                alt26=1;
            }
            else if ( (LA26_0==37) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // InternalArduinoML.g:1734:3: (enumLiteral_0= 'HIGH' )
                    {
                    // InternalArduinoML.g:1734:3: (enumLiteral_0= 'HIGH' )
                    // InternalArduinoML.g:1735:4: enumLiteral_0= 'HIGH'
                    {
                    enumLiteral_0=(Token)match(input,36,FOLLOW_2); 

                    				current = grammarAccess.getSignalAccess().getHIGHEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getSignalAccess().getHIGHEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalArduinoML.g:1742:3: (enumLiteral_1= 'LOW' )
                    {
                    // InternalArduinoML.g:1742:3: (enumLiteral_1= 'LOW' )
                    // InternalArduinoML.g:1743:4: enumLiteral_1= 'LOW'
                    {
                    enumLiteral_1=(Token)match(input,37,FOLLOW_2); 

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
    // InternalArduinoML.g:1753:1: ruleTime_unit returns [Enumerator current=null] : ( (enumLiteral_0= 'ms' ) | (enumLiteral_1= 's' ) | (enumLiteral_2= 'min' ) ) ;
    public final Enumerator ruleTime_unit() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalArduinoML.g:1759:2: ( ( (enumLiteral_0= 'ms' ) | (enumLiteral_1= 's' ) | (enumLiteral_2= 'min' ) ) )
            // InternalArduinoML.g:1760:2: ( (enumLiteral_0= 'ms' ) | (enumLiteral_1= 's' ) | (enumLiteral_2= 'min' ) )
            {
            // InternalArduinoML.g:1760:2: ( (enumLiteral_0= 'ms' ) | (enumLiteral_1= 's' ) | (enumLiteral_2= 'min' ) )
            int alt27=3;
            switch ( input.LA(1) ) {
            case 38:
                {
                alt27=1;
                }
                break;
            case 39:
                {
                alt27=2;
                }
                break;
            case 40:
                {
                alt27=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // InternalArduinoML.g:1761:3: (enumLiteral_0= 'ms' )
                    {
                    // InternalArduinoML.g:1761:3: (enumLiteral_0= 'ms' )
                    // InternalArduinoML.g:1762:4: enumLiteral_0= 'ms'
                    {
                    enumLiteral_0=(Token)match(input,38,FOLLOW_2); 

                    				current = grammarAccess.getTime_unitAccess().getMsEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTime_unitAccess().getMsEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalArduinoML.g:1769:3: (enumLiteral_1= 's' )
                    {
                    // InternalArduinoML.g:1769:3: (enumLiteral_1= 's' )
                    // InternalArduinoML.g:1770:4: enumLiteral_1= 's'
                    {
                    enumLiteral_1=(Token)match(input,39,FOLLOW_2); 

                    				current = grammarAccess.getTime_unitAccess().getSEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTime_unitAccess().getSEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalArduinoML.g:1777:3: (enumLiteral_2= 'min' )
                    {
                    // InternalArduinoML.g:1777:3: (enumLiteral_2= 'min' )
                    // InternalArduinoML.g:1778:4: enumLiteral_2= 'min'
                    {
                    enumLiteral_2=(Token)match(input,40,FOLLOW_2); 

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
    // InternalArduinoML.g:1788:1: ruleCompare returns [Enumerator current=null] : ( (enumLiteral_0= 'inf' ) | (enumLiteral_1= 'einf' ) | (enumLiteral_2= 'equal' ) | (enumLiteral_3= 'esup' ) | (enumLiteral_4= 'sup' ) ) ;
    public final Enumerator ruleCompare() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalArduinoML.g:1794:2: ( ( (enumLiteral_0= 'inf' ) | (enumLiteral_1= 'einf' ) | (enumLiteral_2= 'equal' ) | (enumLiteral_3= 'esup' ) | (enumLiteral_4= 'sup' ) ) )
            // InternalArduinoML.g:1795:2: ( (enumLiteral_0= 'inf' ) | (enumLiteral_1= 'einf' ) | (enumLiteral_2= 'equal' ) | (enumLiteral_3= 'esup' ) | (enumLiteral_4= 'sup' ) )
            {
            // InternalArduinoML.g:1795:2: ( (enumLiteral_0= 'inf' ) | (enumLiteral_1= 'einf' ) | (enumLiteral_2= 'equal' ) | (enumLiteral_3= 'esup' ) | (enumLiteral_4= 'sup' ) )
            int alt28=5;
            switch ( input.LA(1) ) {
            case 41:
                {
                alt28=1;
                }
                break;
            case 42:
                {
                alt28=2;
                }
                break;
            case 43:
                {
                alt28=3;
                }
                break;
            case 44:
                {
                alt28=4;
                }
                break;
            case 45:
                {
                alt28=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }

            switch (alt28) {
                case 1 :
                    // InternalArduinoML.g:1796:3: (enumLiteral_0= 'inf' )
                    {
                    // InternalArduinoML.g:1796:3: (enumLiteral_0= 'inf' )
                    // InternalArduinoML.g:1797:4: enumLiteral_0= 'inf'
                    {
                    enumLiteral_0=(Token)match(input,41,FOLLOW_2); 

                    				current = grammarAccess.getCompareAccess().getInfEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getCompareAccess().getInfEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalArduinoML.g:1804:3: (enumLiteral_1= 'einf' )
                    {
                    // InternalArduinoML.g:1804:3: (enumLiteral_1= 'einf' )
                    // InternalArduinoML.g:1805:4: enumLiteral_1= 'einf'
                    {
                    enumLiteral_1=(Token)match(input,42,FOLLOW_2); 

                    				current = grammarAccess.getCompareAccess().getEinfEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getCompareAccess().getEinfEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalArduinoML.g:1812:3: (enumLiteral_2= 'equal' )
                    {
                    // InternalArduinoML.g:1812:3: (enumLiteral_2= 'equal' )
                    // InternalArduinoML.g:1813:4: enumLiteral_2= 'equal'
                    {
                    enumLiteral_2=(Token)match(input,43,FOLLOW_2); 

                    				current = grammarAccess.getCompareAccess().getEqualEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getCompareAccess().getEqualEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalArduinoML.g:1820:3: (enumLiteral_3= 'esup' )
                    {
                    // InternalArduinoML.g:1820:3: (enumLiteral_3= 'esup' )
                    // InternalArduinoML.g:1821:4: enumLiteral_3= 'esup'
                    {
                    enumLiteral_3=(Token)match(input,44,FOLLOW_2); 

                    				current = grammarAccess.getCompareAccess().getEsupEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getCompareAccess().getEsupEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalArduinoML.g:1828:3: (enumLiteral_4= 'sup' )
                    {
                    // InternalArduinoML.g:1828:3: (enumLiteral_4= 'sup' )
                    // InternalArduinoML.g:1829:4: enumLiteral_4= 'sup'
                    {
                    enumLiteral_4=(Token)match(input,45,FOLLOW_2); 

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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x000000000E000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x000000000E080000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000840000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x000000000E800000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000001000032L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000240000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000240000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000250000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000250000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000003000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000B00000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x00003E0000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x000001C000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000800000000L});

}