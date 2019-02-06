package arduinoML.concretesyntax.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import arduinoML.concretesyntax.services.ArduinoMLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalArduinoMLParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_STRING", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'HIGH'", "'LOW'", "'ms'", "'s'", "'min'", "'inf'", "'einf'", "'equal'", "'esup'", "'sup'", "'app'", "'initial'", "'state'", "':'", "'bricks'", "'states'", "'mode'", "'modes'", "'transitions'", "'Actuator'", "'Digital'", "'Analog'", "'change'", "'to'", "'go'", "'when'", "'is'", "'and'", "'wait'", "'then'"
    };
    public static final int RULE_STRING=5;
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
    public static final int RULE_ID=6;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=4;
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

    	public void setGrammarAccess(ArduinoMLGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleApp"
    // InternalArduinoML.g:53:1: entryRuleApp : ruleApp EOF ;
    public final void entryRuleApp() throws RecognitionException {
        try {
            // InternalArduinoML.g:54:1: ( ruleApp EOF )
            // InternalArduinoML.g:55:1: ruleApp EOF
            {
             before(grammarAccess.getAppRule()); 
            pushFollow(FOLLOW_1);
            ruleApp();

            state._fsp--;

             after(grammarAccess.getAppRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleApp"


    // $ANTLR start "ruleApp"
    // InternalArduinoML.g:62:1: ruleApp : ( ( rule__App__Alternatives ) ) ;
    public final void ruleApp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:66:2: ( ( ( rule__App__Alternatives ) ) )
            // InternalArduinoML.g:67:2: ( ( rule__App__Alternatives ) )
            {
            // InternalArduinoML.g:67:2: ( ( rule__App__Alternatives ) )
            // InternalArduinoML.g:68:3: ( rule__App__Alternatives )
            {
             before(grammarAccess.getAppAccess().getAlternatives()); 
            // InternalArduinoML.g:69:3: ( rule__App__Alternatives )
            // InternalArduinoML.g:69:4: rule__App__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__App__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAppAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleApp"


    // $ANTLR start "entryRuleAppState"
    // InternalArduinoML.g:78:1: entryRuleAppState : ruleAppState EOF ;
    public final void entryRuleAppState() throws RecognitionException {
        try {
            // InternalArduinoML.g:79:1: ( ruleAppState EOF )
            // InternalArduinoML.g:80:1: ruleAppState EOF
            {
             before(grammarAccess.getAppStateRule()); 
            pushFollow(FOLLOW_1);
            ruleAppState();

            state._fsp--;

             after(grammarAccess.getAppStateRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAppState"


    // $ANTLR start "ruleAppState"
    // InternalArduinoML.g:87:1: ruleAppState : ( ( rule__AppState__Group__0 ) ) ;
    public final void ruleAppState() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:91:2: ( ( ( rule__AppState__Group__0 ) ) )
            // InternalArduinoML.g:92:2: ( ( rule__AppState__Group__0 ) )
            {
            // InternalArduinoML.g:92:2: ( ( rule__AppState__Group__0 ) )
            // InternalArduinoML.g:93:3: ( rule__AppState__Group__0 )
            {
             before(grammarAccess.getAppStateAccess().getGroup()); 
            // InternalArduinoML.g:94:3: ( rule__AppState__Group__0 )
            // InternalArduinoML.g:94:4: rule__AppState__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AppState__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAppStateAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAppState"


    // $ANTLR start "entryRuleAppMode"
    // InternalArduinoML.g:103:1: entryRuleAppMode : ruleAppMode EOF ;
    public final void entryRuleAppMode() throws RecognitionException {
        try {
            // InternalArduinoML.g:104:1: ( ruleAppMode EOF )
            // InternalArduinoML.g:105:1: ruleAppMode EOF
            {
             before(grammarAccess.getAppModeRule()); 
            pushFollow(FOLLOW_1);
            ruleAppMode();

            state._fsp--;

             after(grammarAccess.getAppModeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAppMode"


    // $ANTLR start "ruleAppMode"
    // InternalArduinoML.g:112:1: ruleAppMode : ( ( rule__AppMode__Group__0 ) ) ;
    public final void ruleAppMode() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:116:2: ( ( ( rule__AppMode__Group__0 ) ) )
            // InternalArduinoML.g:117:2: ( ( rule__AppMode__Group__0 ) )
            {
            // InternalArduinoML.g:117:2: ( ( rule__AppMode__Group__0 ) )
            // InternalArduinoML.g:118:3: ( rule__AppMode__Group__0 )
            {
             before(grammarAccess.getAppModeAccess().getGroup()); 
            // InternalArduinoML.g:119:3: ( rule__AppMode__Group__0 )
            // InternalArduinoML.g:119:4: rule__AppMode__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AppMode__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAppModeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAppMode"


    // $ANTLR start "entryRuleBrick"
    // InternalArduinoML.g:128:1: entryRuleBrick : ruleBrick EOF ;
    public final void entryRuleBrick() throws RecognitionException {
        try {
            // InternalArduinoML.g:129:1: ( ruleBrick EOF )
            // InternalArduinoML.g:130:1: ruleBrick EOF
            {
             before(grammarAccess.getBrickRule()); 
            pushFollow(FOLLOW_1);
            ruleBrick();

            state._fsp--;

             after(grammarAccess.getBrickRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBrick"


    // $ANTLR start "ruleBrick"
    // InternalArduinoML.g:137:1: ruleBrick : ( ( rule__Brick__Group__0 ) ) ;
    public final void ruleBrick() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:141:2: ( ( ( rule__Brick__Group__0 ) ) )
            // InternalArduinoML.g:142:2: ( ( rule__Brick__Group__0 ) )
            {
            // InternalArduinoML.g:142:2: ( ( rule__Brick__Group__0 ) )
            // InternalArduinoML.g:143:3: ( rule__Brick__Group__0 )
            {
             before(grammarAccess.getBrickAccess().getGroup()); 
            // InternalArduinoML.g:144:3: ( rule__Brick__Group__0 )
            // InternalArduinoML.g:144:4: rule__Brick__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Brick__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBrickAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBrick"


    // $ANTLR start "entryRuleEString"
    // InternalArduinoML.g:153:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalArduinoML.g:154:1: ( ruleEString EOF )
            // InternalArduinoML.g:155:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalArduinoML.g:162:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:166:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalArduinoML.g:167:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalArduinoML.g:167:2: ( ( rule__EString__Alternatives ) )
            // InternalArduinoML.g:168:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalArduinoML.g:169:3: ( rule__EString__Alternatives )
            // InternalArduinoML.g:169:4: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleMode"
    // InternalArduinoML.g:178:1: entryRuleMode : ruleMode EOF ;
    public final void entryRuleMode() throws RecognitionException {
        try {
            // InternalArduinoML.g:179:1: ( ruleMode EOF )
            // InternalArduinoML.g:180:1: ruleMode EOF
            {
             before(grammarAccess.getModeRule()); 
            pushFollow(FOLLOW_1);
            ruleMode();

            state._fsp--;

             after(grammarAccess.getModeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMode"


    // $ANTLR start "ruleMode"
    // InternalArduinoML.g:187:1: ruleMode : ( ( rule__Mode__Group__0 ) ) ;
    public final void ruleMode() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:191:2: ( ( ( rule__Mode__Group__0 ) ) )
            // InternalArduinoML.g:192:2: ( ( rule__Mode__Group__0 ) )
            {
            // InternalArduinoML.g:192:2: ( ( rule__Mode__Group__0 ) )
            // InternalArduinoML.g:193:3: ( rule__Mode__Group__0 )
            {
             before(grammarAccess.getModeAccess().getGroup()); 
            // InternalArduinoML.g:194:3: ( rule__Mode__Group__0 )
            // InternalArduinoML.g:194:4: rule__Mode__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Mode__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMode"


    // $ANTLR start "entryRuleState"
    // InternalArduinoML.g:203:1: entryRuleState : ruleState EOF ;
    public final void entryRuleState() throws RecognitionException {
        try {
            // InternalArduinoML.g:204:1: ( ruleState EOF )
            // InternalArduinoML.g:205:1: ruleState EOF
            {
             before(grammarAccess.getStateRule()); 
            pushFollow(FOLLOW_1);
            ruleState();

            state._fsp--;

             after(grammarAccess.getStateRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleState"


    // $ANTLR start "ruleState"
    // InternalArduinoML.g:212:1: ruleState : ( ( rule__State__Group__0 ) ) ;
    public final void ruleState() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:216:2: ( ( ( rule__State__Group__0 ) ) )
            // InternalArduinoML.g:217:2: ( ( rule__State__Group__0 ) )
            {
            // InternalArduinoML.g:217:2: ( ( rule__State__Group__0 ) )
            // InternalArduinoML.g:218:3: ( rule__State__Group__0 )
            {
             before(grammarAccess.getStateAccess().getGroup()); 
            // InternalArduinoML.g:219:3: ( rule__State__Group__0 )
            // InternalArduinoML.g:219:4: rule__State__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__State__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStateAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleState"


    // $ANTLR start "entryRuleEInt"
    // InternalArduinoML.g:228:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // InternalArduinoML.g:229:1: ( ruleEInt EOF )
            // InternalArduinoML.g:230:1: ruleEInt EOF
            {
             before(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getEIntRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalArduinoML.g:237:1: ruleEInt : ( RULE_INT ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:241:2: ( ( RULE_INT ) )
            // InternalArduinoML.g:242:2: ( RULE_INT )
            {
            // InternalArduinoML.g:242:2: ( RULE_INT )
            // InternalArduinoML.g:243:3: RULE_INT
            {
             before(grammarAccess.getEIntAccess().getINTTerminalRuleCall()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEIntAccess().getINTTerminalRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleActuator"
    // InternalArduinoML.g:253:1: entryRuleActuator : ruleActuator EOF ;
    public final void entryRuleActuator() throws RecognitionException {
        try {
            // InternalArduinoML.g:254:1: ( ruleActuator EOF )
            // InternalArduinoML.g:255:1: ruleActuator EOF
            {
             before(grammarAccess.getActuatorRule()); 
            pushFollow(FOLLOW_1);
            ruleActuator();

            state._fsp--;

             after(grammarAccess.getActuatorRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleActuator"


    // $ANTLR start "ruleActuator"
    // InternalArduinoML.g:262:1: ruleActuator : ( ( rule__Actuator__Group__0 ) ) ;
    public final void ruleActuator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:266:2: ( ( ( rule__Actuator__Group__0 ) ) )
            // InternalArduinoML.g:267:2: ( ( rule__Actuator__Group__0 ) )
            {
            // InternalArduinoML.g:267:2: ( ( rule__Actuator__Group__0 ) )
            // InternalArduinoML.g:268:3: ( rule__Actuator__Group__0 )
            {
             before(grammarAccess.getActuatorAccess().getGroup()); 
            // InternalArduinoML.g:269:3: ( rule__Actuator__Group__0 )
            // InternalArduinoML.g:269:4: rule__Actuator__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Actuator__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getActuatorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleActuator"


    // $ANTLR start "entryRuleDigital"
    // InternalArduinoML.g:278:1: entryRuleDigital : ruleDigital EOF ;
    public final void entryRuleDigital() throws RecognitionException {
        try {
            // InternalArduinoML.g:279:1: ( ruleDigital EOF )
            // InternalArduinoML.g:280:1: ruleDigital EOF
            {
             before(grammarAccess.getDigitalRule()); 
            pushFollow(FOLLOW_1);
            ruleDigital();

            state._fsp--;

             after(grammarAccess.getDigitalRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDigital"


    // $ANTLR start "ruleDigital"
    // InternalArduinoML.g:287:1: ruleDigital : ( ( rule__Digital__Group__0 ) ) ;
    public final void ruleDigital() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:291:2: ( ( ( rule__Digital__Group__0 ) ) )
            // InternalArduinoML.g:292:2: ( ( rule__Digital__Group__0 ) )
            {
            // InternalArduinoML.g:292:2: ( ( rule__Digital__Group__0 ) )
            // InternalArduinoML.g:293:3: ( rule__Digital__Group__0 )
            {
             before(grammarAccess.getDigitalAccess().getGroup()); 
            // InternalArduinoML.g:294:3: ( rule__Digital__Group__0 )
            // InternalArduinoML.g:294:4: rule__Digital__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Digital__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDigitalAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDigital"


    // $ANTLR start "entryRuleAnalog"
    // InternalArduinoML.g:303:1: entryRuleAnalog : ruleAnalog EOF ;
    public final void entryRuleAnalog() throws RecognitionException {
        try {
            // InternalArduinoML.g:304:1: ( ruleAnalog EOF )
            // InternalArduinoML.g:305:1: ruleAnalog EOF
            {
             before(grammarAccess.getAnalogRule()); 
            pushFollow(FOLLOW_1);
            ruleAnalog();

            state._fsp--;

             after(grammarAccess.getAnalogRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAnalog"


    // $ANTLR start "ruleAnalog"
    // InternalArduinoML.g:312:1: ruleAnalog : ( ( rule__Analog__Group__0 ) ) ;
    public final void ruleAnalog() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:316:2: ( ( ( rule__Analog__Group__0 ) ) )
            // InternalArduinoML.g:317:2: ( ( rule__Analog__Group__0 ) )
            {
            // InternalArduinoML.g:317:2: ( ( rule__Analog__Group__0 ) )
            // InternalArduinoML.g:318:3: ( rule__Analog__Group__0 )
            {
             before(grammarAccess.getAnalogAccess().getGroup()); 
            // InternalArduinoML.g:319:3: ( rule__Analog__Group__0 )
            // InternalArduinoML.g:319:4: rule__Analog__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Analog__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAnalogAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAnalog"


    // $ANTLR start "entryRuleAction"
    // InternalArduinoML.g:328:1: entryRuleAction : ruleAction EOF ;
    public final void entryRuleAction() throws RecognitionException {
        try {
            // InternalArduinoML.g:329:1: ( ruleAction EOF )
            // InternalArduinoML.g:330:1: ruleAction EOF
            {
             before(grammarAccess.getActionRule()); 
            pushFollow(FOLLOW_1);
            ruleAction();

            state._fsp--;

             after(grammarAccess.getActionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAction"


    // $ANTLR start "ruleAction"
    // InternalArduinoML.g:337:1: ruleAction : ( ( rule__Action__Group__0 ) ) ;
    public final void ruleAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:341:2: ( ( ( rule__Action__Group__0 ) ) )
            // InternalArduinoML.g:342:2: ( ( rule__Action__Group__0 ) )
            {
            // InternalArduinoML.g:342:2: ( ( rule__Action__Group__0 ) )
            // InternalArduinoML.g:343:3: ( rule__Action__Group__0 )
            {
             before(grammarAccess.getActionAccess().getGroup()); 
            // InternalArduinoML.g:344:3: ( rule__Action__Group__0 )
            // InternalArduinoML.g:344:4: rule__Action__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Action__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getActionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAction"


    // $ANTLR start "entryRuleTransitionState"
    // InternalArduinoML.g:353:1: entryRuleTransitionState : ruleTransitionState EOF ;
    public final void entryRuleTransitionState() throws RecognitionException {
        try {
            // InternalArduinoML.g:354:1: ( ruleTransitionState EOF )
            // InternalArduinoML.g:355:1: ruleTransitionState EOF
            {
             before(grammarAccess.getTransitionStateRule()); 
            pushFollow(FOLLOW_1);
            ruleTransitionState();

            state._fsp--;

             after(grammarAccess.getTransitionStateRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTransitionState"


    // $ANTLR start "ruleTransitionState"
    // InternalArduinoML.g:362:1: ruleTransitionState : ( ( rule__TransitionState__Group__0 ) ) ;
    public final void ruleTransitionState() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:366:2: ( ( ( rule__TransitionState__Group__0 ) ) )
            // InternalArduinoML.g:367:2: ( ( rule__TransitionState__Group__0 ) )
            {
            // InternalArduinoML.g:367:2: ( ( rule__TransitionState__Group__0 ) )
            // InternalArduinoML.g:368:3: ( rule__TransitionState__Group__0 )
            {
             before(grammarAccess.getTransitionStateAccess().getGroup()); 
            // InternalArduinoML.g:369:3: ( rule__TransitionState__Group__0 )
            // InternalArduinoML.g:369:4: rule__TransitionState__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TransitionState__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTransitionStateAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTransitionState"


    // $ANTLR start "entryRuleTransitionMode"
    // InternalArduinoML.g:378:1: entryRuleTransitionMode : ruleTransitionMode EOF ;
    public final void entryRuleTransitionMode() throws RecognitionException {
        try {
            // InternalArduinoML.g:379:1: ( ruleTransitionMode EOF )
            // InternalArduinoML.g:380:1: ruleTransitionMode EOF
            {
             before(grammarAccess.getTransitionModeRule()); 
            pushFollow(FOLLOW_1);
            ruleTransitionMode();

            state._fsp--;

             after(grammarAccess.getTransitionModeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTransitionMode"


    // $ANTLR start "ruleTransitionMode"
    // InternalArduinoML.g:387:1: ruleTransitionMode : ( ( rule__TransitionMode__Group__0 ) ) ;
    public final void ruleTransitionMode() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:391:2: ( ( ( rule__TransitionMode__Group__0 ) ) )
            // InternalArduinoML.g:392:2: ( ( rule__TransitionMode__Group__0 ) )
            {
            // InternalArduinoML.g:392:2: ( ( rule__TransitionMode__Group__0 ) )
            // InternalArduinoML.g:393:3: ( rule__TransitionMode__Group__0 )
            {
             before(grammarAccess.getTransitionModeAccess().getGroup()); 
            // InternalArduinoML.g:394:3: ( rule__TransitionMode__Group__0 )
            // InternalArduinoML.g:394:4: rule__TransitionMode__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TransitionMode__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTransitionModeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTransitionMode"


    // $ANTLR start "ruleSignal"
    // InternalArduinoML.g:403:1: ruleSignal : ( ( rule__Signal__Alternatives ) ) ;
    public final void ruleSignal() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:407:1: ( ( ( rule__Signal__Alternatives ) ) )
            // InternalArduinoML.g:408:2: ( ( rule__Signal__Alternatives ) )
            {
            // InternalArduinoML.g:408:2: ( ( rule__Signal__Alternatives ) )
            // InternalArduinoML.g:409:3: ( rule__Signal__Alternatives )
            {
             before(grammarAccess.getSignalAccess().getAlternatives()); 
            // InternalArduinoML.g:410:3: ( rule__Signal__Alternatives )
            // InternalArduinoML.g:410:4: rule__Signal__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Signal__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSignalAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSignal"


    // $ANTLR start "ruleTime_unit"
    // InternalArduinoML.g:419:1: ruleTime_unit : ( ( rule__Time_unit__Alternatives ) ) ;
    public final void ruleTime_unit() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:423:1: ( ( ( rule__Time_unit__Alternatives ) ) )
            // InternalArduinoML.g:424:2: ( ( rule__Time_unit__Alternatives ) )
            {
            // InternalArduinoML.g:424:2: ( ( rule__Time_unit__Alternatives ) )
            // InternalArduinoML.g:425:3: ( rule__Time_unit__Alternatives )
            {
             before(grammarAccess.getTime_unitAccess().getAlternatives()); 
            // InternalArduinoML.g:426:3: ( rule__Time_unit__Alternatives )
            // InternalArduinoML.g:426:4: rule__Time_unit__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Time_unit__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTime_unitAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTime_unit"


    // $ANTLR start "ruleCompare"
    // InternalArduinoML.g:435:1: ruleCompare : ( ( rule__Compare__Alternatives ) ) ;
    public final void ruleCompare() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:439:1: ( ( ( rule__Compare__Alternatives ) ) )
            // InternalArduinoML.g:440:2: ( ( rule__Compare__Alternatives ) )
            {
            // InternalArduinoML.g:440:2: ( ( rule__Compare__Alternatives ) )
            // InternalArduinoML.g:441:3: ( rule__Compare__Alternatives )
            {
             before(grammarAccess.getCompareAccess().getAlternatives()); 
            // InternalArduinoML.g:442:3: ( rule__Compare__Alternatives )
            // InternalArduinoML.g:442:4: rule__Compare__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Compare__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getCompareAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCompare"


    // $ANTLR start "rule__App__Alternatives"
    // InternalArduinoML.g:450:1: rule__App__Alternatives : ( ( ruleAppState ) | ( ruleAppMode ) );
    public final void rule__App__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:454:1: ( ( ruleAppState ) | ( ruleAppMode ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==21) ) {
                int LA1_1 = input.LA(2);

                if ( (LA1_1==RULE_STRING) ) {
                    int LA1_2 = input.LA(3);

                    if ( (LA1_2==22) ) {
                        int LA1_4 = input.LA(4);

                        if ( (LA1_4==23) ) {
                            alt1=1;
                        }
                        else if ( (LA1_4==27) ) {
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

                    if ( (LA1_3==22) ) {
                        int LA1_4 = input.LA(4);

                        if ( (LA1_4==23) ) {
                            alt1=1;
                        }
                        else if ( (LA1_4==27) ) {
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
                    // InternalArduinoML.g:455:2: ( ruleAppState )
                    {
                    // InternalArduinoML.g:455:2: ( ruleAppState )
                    // InternalArduinoML.g:456:3: ruleAppState
                    {
                     before(grammarAccess.getAppAccess().getAppStateParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleAppState();

                    state._fsp--;

                     after(grammarAccess.getAppAccess().getAppStateParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalArduinoML.g:461:2: ( ruleAppMode )
                    {
                    // InternalArduinoML.g:461:2: ( ruleAppMode )
                    // InternalArduinoML.g:462:3: ruleAppMode
                    {
                     before(grammarAccess.getAppAccess().getAppModeParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleAppMode();

                    state._fsp--;

                     after(grammarAccess.getAppAccess().getAppModeParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__App__Alternatives"


    // $ANTLR start "rule__Brick__Alternatives_0"
    // InternalArduinoML.g:471:1: rule__Brick__Alternatives_0 : ( ( ruleActuator ) | ( ruleDigital ) | ( ruleAnalog ) );
    public final void rule__Brick__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:475:1: ( ( ruleActuator ) | ( ruleDigital ) | ( ruleAnalog ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt2=1;
                }
                break;
            case 31:
                {
                alt2=2;
                }
                break;
            case 32:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalArduinoML.g:476:2: ( ruleActuator )
                    {
                    // InternalArduinoML.g:476:2: ( ruleActuator )
                    // InternalArduinoML.g:477:3: ruleActuator
                    {
                     before(grammarAccess.getBrickAccess().getActuatorParserRuleCall_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleActuator();

                    state._fsp--;

                     after(grammarAccess.getBrickAccess().getActuatorParserRuleCall_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalArduinoML.g:482:2: ( ruleDigital )
                    {
                    // InternalArduinoML.g:482:2: ( ruleDigital )
                    // InternalArduinoML.g:483:3: ruleDigital
                    {
                     before(grammarAccess.getBrickAccess().getDigitalParserRuleCall_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleDigital();

                    state._fsp--;

                     after(grammarAccess.getBrickAccess().getDigitalParserRuleCall_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalArduinoML.g:488:2: ( ruleAnalog )
                    {
                    // InternalArduinoML.g:488:2: ( ruleAnalog )
                    // InternalArduinoML.g:489:3: ruleAnalog
                    {
                     before(grammarAccess.getBrickAccess().getAnalogParserRuleCall_0_2()); 
                    pushFollow(FOLLOW_2);
                    ruleAnalog();

                    state._fsp--;

                     after(grammarAccess.getBrickAccess().getAnalogParserRuleCall_0_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Brick__Alternatives_0"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalArduinoML.g:498:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:502:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_STRING) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_ID) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalArduinoML.g:503:2: ( RULE_STRING )
                    {
                    // InternalArduinoML.g:503:2: ( RULE_STRING )
                    // InternalArduinoML.g:504:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalArduinoML.g:509:2: ( RULE_ID )
                    {
                    // InternalArduinoML.g:509:2: ( RULE_ID )
                    // InternalArduinoML.g:510:3: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__TransitionState__Alternatives_0"
    // InternalArduinoML.g:519:1: rule__TransitionState__Alternatives_0 : ( ( ( rule__TransitionState__Group_0_0__0 ) ) | ( ( rule__TransitionState__Group_0_1__0 ) ) );
    public final void rule__TransitionState__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:523:1: ( ( ( rule__TransitionState__Group_0_0__0 ) ) | ( ( rule__TransitionState__Group_0_1__0 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==36) ) {
                alt4=1;
            }
            else if ( (LA4_0==39) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalArduinoML.g:524:2: ( ( rule__TransitionState__Group_0_0__0 ) )
                    {
                    // InternalArduinoML.g:524:2: ( ( rule__TransitionState__Group_0_0__0 ) )
                    // InternalArduinoML.g:525:3: ( rule__TransitionState__Group_0_0__0 )
                    {
                     before(grammarAccess.getTransitionStateAccess().getGroup_0_0()); 
                    // InternalArduinoML.g:526:3: ( rule__TransitionState__Group_0_0__0 )
                    // InternalArduinoML.g:526:4: rule__TransitionState__Group_0_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TransitionState__Group_0_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTransitionStateAccess().getGroup_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalArduinoML.g:530:2: ( ( rule__TransitionState__Group_0_1__0 ) )
                    {
                    // InternalArduinoML.g:530:2: ( ( rule__TransitionState__Group_0_1__0 ) )
                    // InternalArduinoML.g:531:3: ( rule__TransitionState__Group_0_1__0 )
                    {
                     before(grammarAccess.getTransitionStateAccess().getGroup_0_1()); 
                    // InternalArduinoML.g:532:3: ( rule__TransitionState__Group_0_1__0 )
                    // InternalArduinoML.g:532:4: rule__TransitionState__Group_0_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TransitionState__Group_0_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTransitionStateAccess().getGroup_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionState__Alternatives_0"


    // $ANTLR start "rule__TransitionState__Alternatives_0_0_1"
    // InternalArduinoML.g:540:1: rule__TransitionState__Alternatives_0_0_1 : ( ( ( rule__TransitionState__Group_0_0_1_0__0 ) ) | ( ( rule__TransitionState__Group_0_0_1_1__0 ) ) );
    public final void rule__TransitionState__Alternatives_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:544:1: ( ( ( rule__TransitionState__Group_0_0_1_0__0 ) ) | ( ( rule__TransitionState__Group_0_0_1_1__0 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_STRING) ) {
                int LA5_1 = input.LA(2);

                if ( ((LA5_1>=16 && LA5_1<=20)) ) {
                    alt5=2;
                }
                else if ( (LA5_1==37) ) {
                    alt5=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA5_0==RULE_ID) ) {
                int LA5_2 = input.LA(2);

                if ( ((LA5_2>=16 && LA5_2<=20)) ) {
                    alt5=2;
                }
                else if ( (LA5_2==37) ) {
                    alt5=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 2, input);

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
                    // InternalArduinoML.g:545:2: ( ( rule__TransitionState__Group_0_0_1_0__0 ) )
                    {
                    // InternalArduinoML.g:545:2: ( ( rule__TransitionState__Group_0_0_1_0__0 ) )
                    // InternalArduinoML.g:546:3: ( rule__TransitionState__Group_0_0_1_0__0 )
                    {
                     before(grammarAccess.getTransitionStateAccess().getGroup_0_0_1_0()); 
                    // InternalArduinoML.g:547:3: ( rule__TransitionState__Group_0_0_1_0__0 )
                    // InternalArduinoML.g:547:4: rule__TransitionState__Group_0_0_1_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TransitionState__Group_0_0_1_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTransitionStateAccess().getGroup_0_0_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalArduinoML.g:551:2: ( ( rule__TransitionState__Group_0_0_1_1__0 ) )
                    {
                    // InternalArduinoML.g:551:2: ( ( rule__TransitionState__Group_0_0_1_1__0 ) )
                    // InternalArduinoML.g:552:3: ( rule__TransitionState__Group_0_0_1_1__0 )
                    {
                     before(grammarAccess.getTransitionStateAccess().getGroup_0_0_1_1()); 
                    // InternalArduinoML.g:553:3: ( rule__TransitionState__Group_0_0_1_1__0 )
                    // InternalArduinoML.g:553:4: rule__TransitionState__Group_0_0_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TransitionState__Group_0_0_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTransitionStateAccess().getGroup_0_0_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionState__Alternatives_0_0_1"


    // $ANTLR start "rule__TransitionState__Alternatives_0_0_2_1"
    // InternalArduinoML.g:561:1: rule__TransitionState__Alternatives_0_0_2_1 : ( ( ( rule__TransitionState__Group_0_0_2_1_0__0 ) ) | ( ( rule__TransitionState__Group_0_0_2_1_1__0 ) ) );
    public final void rule__TransitionState__Alternatives_0_0_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:565:1: ( ( ( rule__TransitionState__Group_0_0_2_1_0__0 ) ) | ( ( rule__TransitionState__Group_0_0_2_1_1__0 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_STRING) ) {
                int LA6_1 = input.LA(2);

                if ( ((LA6_1>=16 && LA6_1<=20)) ) {
                    alt6=2;
                }
                else if ( (LA6_1==37) ) {
                    alt6=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA6_0==RULE_ID) ) {
                int LA6_2 = input.LA(2);

                if ( ((LA6_2>=16 && LA6_2<=20)) ) {
                    alt6=2;
                }
                else if ( (LA6_2==37) ) {
                    alt6=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalArduinoML.g:566:2: ( ( rule__TransitionState__Group_0_0_2_1_0__0 ) )
                    {
                    // InternalArduinoML.g:566:2: ( ( rule__TransitionState__Group_0_0_2_1_0__0 ) )
                    // InternalArduinoML.g:567:3: ( rule__TransitionState__Group_0_0_2_1_0__0 )
                    {
                     before(grammarAccess.getTransitionStateAccess().getGroup_0_0_2_1_0()); 
                    // InternalArduinoML.g:568:3: ( rule__TransitionState__Group_0_0_2_1_0__0 )
                    // InternalArduinoML.g:568:4: rule__TransitionState__Group_0_0_2_1_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TransitionState__Group_0_0_2_1_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTransitionStateAccess().getGroup_0_0_2_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalArduinoML.g:572:2: ( ( rule__TransitionState__Group_0_0_2_1_1__0 ) )
                    {
                    // InternalArduinoML.g:572:2: ( ( rule__TransitionState__Group_0_0_2_1_1__0 ) )
                    // InternalArduinoML.g:573:3: ( rule__TransitionState__Group_0_0_2_1_1__0 )
                    {
                     before(grammarAccess.getTransitionStateAccess().getGroup_0_0_2_1_1()); 
                    // InternalArduinoML.g:574:3: ( rule__TransitionState__Group_0_0_2_1_1__0 )
                    // InternalArduinoML.g:574:4: rule__TransitionState__Group_0_0_2_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TransitionState__Group_0_0_2_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTransitionStateAccess().getGroup_0_0_2_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionState__Alternatives_0_0_2_1"


    // $ANTLR start "rule__TransitionMode__Alternatives_0"
    // InternalArduinoML.g:582:1: rule__TransitionMode__Alternatives_0 : ( ( ( rule__TransitionMode__Group_0_0__0 ) ) | ( ( rule__TransitionMode__Group_0_1__0 ) ) );
    public final void rule__TransitionMode__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:586:1: ( ( ( rule__TransitionMode__Group_0_0__0 ) ) | ( ( rule__TransitionMode__Group_0_1__0 ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==36) ) {
                alt7=1;
            }
            else if ( (LA7_0==39) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalArduinoML.g:587:2: ( ( rule__TransitionMode__Group_0_0__0 ) )
                    {
                    // InternalArduinoML.g:587:2: ( ( rule__TransitionMode__Group_0_0__0 ) )
                    // InternalArduinoML.g:588:3: ( rule__TransitionMode__Group_0_0__0 )
                    {
                     before(grammarAccess.getTransitionModeAccess().getGroup_0_0()); 
                    // InternalArduinoML.g:589:3: ( rule__TransitionMode__Group_0_0__0 )
                    // InternalArduinoML.g:589:4: rule__TransitionMode__Group_0_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TransitionMode__Group_0_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTransitionModeAccess().getGroup_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalArduinoML.g:593:2: ( ( rule__TransitionMode__Group_0_1__0 ) )
                    {
                    // InternalArduinoML.g:593:2: ( ( rule__TransitionMode__Group_0_1__0 ) )
                    // InternalArduinoML.g:594:3: ( rule__TransitionMode__Group_0_1__0 )
                    {
                     before(grammarAccess.getTransitionModeAccess().getGroup_0_1()); 
                    // InternalArduinoML.g:595:3: ( rule__TransitionMode__Group_0_1__0 )
                    // InternalArduinoML.g:595:4: rule__TransitionMode__Group_0_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TransitionMode__Group_0_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTransitionModeAccess().getGroup_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionMode__Alternatives_0"


    // $ANTLR start "rule__TransitionMode__Alternatives_0_0_1"
    // InternalArduinoML.g:603:1: rule__TransitionMode__Alternatives_0_0_1 : ( ( ( rule__TransitionMode__Group_0_0_1_0__0 ) ) | ( ( rule__TransitionMode__Group_0_0_1_1__0 ) ) );
    public final void rule__TransitionMode__Alternatives_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:607:1: ( ( ( rule__TransitionMode__Group_0_0_1_0__0 ) ) | ( ( rule__TransitionMode__Group_0_0_1_1__0 ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_STRING) ) {
                int LA8_1 = input.LA(2);

                if ( ((LA8_1>=16 && LA8_1<=20)) ) {
                    alt8=2;
                }
                else if ( (LA8_1==37) ) {
                    alt8=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA8_0==RULE_ID) ) {
                int LA8_2 = input.LA(2);

                if ( ((LA8_2>=16 && LA8_2<=20)) ) {
                    alt8=2;
                }
                else if ( (LA8_2==37) ) {
                    alt8=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalArduinoML.g:608:2: ( ( rule__TransitionMode__Group_0_0_1_0__0 ) )
                    {
                    // InternalArduinoML.g:608:2: ( ( rule__TransitionMode__Group_0_0_1_0__0 ) )
                    // InternalArduinoML.g:609:3: ( rule__TransitionMode__Group_0_0_1_0__0 )
                    {
                     before(grammarAccess.getTransitionModeAccess().getGroup_0_0_1_0()); 
                    // InternalArduinoML.g:610:3: ( rule__TransitionMode__Group_0_0_1_0__0 )
                    // InternalArduinoML.g:610:4: rule__TransitionMode__Group_0_0_1_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TransitionMode__Group_0_0_1_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTransitionModeAccess().getGroup_0_0_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalArduinoML.g:614:2: ( ( rule__TransitionMode__Group_0_0_1_1__0 ) )
                    {
                    // InternalArduinoML.g:614:2: ( ( rule__TransitionMode__Group_0_0_1_1__0 ) )
                    // InternalArduinoML.g:615:3: ( rule__TransitionMode__Group_0_0_1_1__0 )
                    {
                     before(grammarAccess.getTransitionModeAccess().getGroup_0_0_1_1()); 
                    // InternalArduinoML.g:616:3: ( rule__TransitionMode__Group_0_0_1_1__0 )
                    // InternalArduinoML.g:616:4: rule__TransitionMode__Group_0_0_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TransitionMode__Group_0_0_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTransitionModeAccess().getGroup_0_0_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionMode__Alternatives_0_0_1"


    // $ANTLR start "rule__TransitionMode__Alternatives_0_0_2_1"
    // InternalArduinoML.g:624:1: rule__TransitionMode__Alternatives_0_0_2_1 : ( ( ( rule__TransitionMode__Group_0_0_2_1_0__0 ) ) | ( ( rule__TransitionMode__Group_0_0_2_1_1__0 ) ) );
    public final void rule__TransitionMode__Alternatives_0_0_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:628:1: ( ( ( rule__TransitionMode__Group_0_0_2_1_0__0 ) ) | ( ( rule__TransitionMode__Group_0_0_2_1_1__0 ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_STRING) ) {
                int LA9_1 = input.LA(2);

                if ( ((LA9_1>=16 && LA9_1<=20)) ) {
                    alt9=2;
                }
                else if ( (LA9_1==37) ) {
                    alt9=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA9_0==RULE_ID) ) {
                int LA9_2 = input.LA(2);

                if ( ((LA9_2>=16 && LA9_2<=20)) ) {
                    alt9=2;
                }
                else if ( (LA9_2==37) ) {
                    alt9=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalArduinoML.g:629:2: ( ( rule__TransitionMode__Group_0_0_2_1_0__0 ) )
                    {
                    // InternalArduinoML.g:629:2: ( ( rule__TransitionMode__Group_0_0_2_1_0__0 ) )
                    // InternalArduinoML.g:630:3: ( rule__TransitionMode__Group_0_0_2_1_0__0 )
                    {
                     before(grammarAccess.getTransitionModeAccess().getGroup_0_0_2_1_0()); 
                    // InternalArduinoML.g:631:3: ( rule__TransitionMode__Group_0_0_2_1_0__0 )
                    // InternalArduinoML.g:631:4: rule__TransitionMode__Group_0_0_2_1_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TransitionMode__Group_0_0_2_1_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTransitionModeAccess().getGroup_0_0_2_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalArduinoML.g:635:2: ( ( rule__TransitionMode__Group_0_0_2_1_1__0 ) )
                    {
                    // InternalArduinoML.g:635:2: ( ( rule__TransitionMode__Group_0_0_2_1_1__0 ) )
                    // InternalArduinoML.g:636:3: ( rule__TransitionMode__Group_0_0_2_1_1__0 )
                    {
                     before(grammarAccess.getTransitionModeAccess().getGroup_0_0_2_1_1()); 
                    // InternalArduinoML.g:637:3: ( rule__TransitionMode__Group_0_0_2_1_1__0 )
                    // InternalArduinoML.g:637:4: rule__TransitionMode__Group_0_0_2_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TransitionMode__Group_0_0_2_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTransitionModeAccess().getGroup_0_0_2_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionMode__Alternatives_0_0_2_1"


    // $ANTLR start "rule__Signal__Alternatives"
    // InternalArduinoML.g:645:1: rule__Signal__Alternatives : ( ( ( 'HIGH' ) ) | ( ( 'LOW' ) ) );
    public final void rule__Signal__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:649:1: ( ( ( 'HIGH' ) ) | ( ( 'LOW' ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==11) ) {
                alt10=1;
            }
            else if ( (LA10_0==12) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalArduinoML.g:650:2: ( ( 'HIGH' ) )
                    {
                    // InternalArduinoML.g:650:2: ( ( 'HIGH' ) )
                    // InternalArduinoML.g:651:3: ( 'HIGH' )
                    {
                     before(grammarAccess.getSignalAccess().getHIGHEnumLiteralDeclaration_0()); 
                    // InternalArduinoML.g:652:3: ( 'HIGH' )
                    // InternalArduinoML.g:652:4: 'HIGH'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getSignalAccess().getHIGHEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalArduinoML.g:656:2: ( ( 'LOW' ) )
                    {
                    // InternalArduinoML.g:656:2: ( ( 'LOW' ) )
                    // InternalArduinoML.g:657:3: ( 'LOW' )
                    {
                     before(grammarAccess.getSignalAccess().getLOWEnumLiteralDeclaration_1()); 
                    // InternalArduinoML.g:658:3: ( 'LOW' )
                    // InternalArduinoML.g:658:4: 'LOW'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getSignalAccess().getLOWEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signal__Alternatives"


    // $ANTLR start "rule__Time_unit__Alternatives"
    // InternalArduinoML.g:666:1: rule__Time_unit__Alternatives : ( ( ( 'ms' ) ) | ( ( 's' ) ) | ( ( 'min' ) ) );
    public final void rule__Time_unit__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:670:1: ( ( ( 'ms' ) ) | ( ( 's' ) ) | ( ( 'min' ) ) )
            int alt11=3;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt11=1;
                }
                break;
            case 14:
                {
                alt11=2;
                }
                break;
            case 15:
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
                    // InternalArduinoML.g:671:2: ( ( 'ms' ) )
                    {
                    // InternalArduinoML.g:671:2: ( ( 'ms' ) )
                    // InternalArduinoML.g:672:3: ( 'ms' )
                    {
                     before(grammarAccess.getTime_unitAccess().getMsEnumLiteralDeclaration_0()); 
                    // InternalArduinoML.g:673:3: ( 'ms' )
                    // InternalArduinoML.g:673:4: 'ms'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getTime_unitAccess().getMsEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalArduinoML.g:677:2: ( ( 's' ) )
                    {
                    // InternalArduinoML.g:677:2: ( ( 's' ) )
                    // InternalArduinoML.g:678:3: ( 's' )
                    {
                     before(grammarAccess.getTime_unitAccess().getSEnumLiteralDeclaration_1()); 
                    // InternalArduinoML.g:679:3: ( 's' )
                    // InternalArduinoML.g:679:4: 's'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getTime_unitAccess().getSEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalArduinoML.g:683:2: ( ( 'min' ) )
                    {
                    // InternalArduinoML.g:683:2: ( ( 'min' ) )
                    // InternalArduinoML.g:684:3: ( 'min' )
                    {
                     before(grammarAccess.getTime_unitAccess().getMinEnumLiteralDeclaration_2()); 
                    // InternalArduinoML.g:685:3: ( 'min' )
                    // InternalArduinoML.g:685:4: 'min'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getTime_unitAccess().getMinEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Time_unit__Alternatives"


    // $ANTLR start "rule__Compare__Alternatives"
    // InternalArduinoML.g:693:1: rule__Compare__Alternatives : ( ( ( 'inf' ) ) | ( ( 'einf' ) ) | ( ( 'equal' ) ) | ( ( 'esup' ) ) | ( ( 'sup' ) ) );
    public final void rule__Compare__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:697:1: ( ( ( 'inf' ) ) | ( ( 'einf' ) ) | ( ( 'equal' ) ) | ( ( 'esup' ) ) | ( ( 'sup' ) ) )
            int alt12=5;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt12=1;
                }
                break;
            case 17:
                {
                alt12=2;
                }
                break;
            case 18:
                {
                alt12=3;
                }
                break;
            case 19:
                {
                alt12=4;
                }
                break;
            case 20:
                {
                alt12=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalArduinoML.g:698:2: ( ( 'inf' ) )
                    {
                    // InternalArduinoML.g:698:2: ( ( 'inf' ) )
                    // InternalArduinoML.g:699:3: ( 'inf' )
                    {
                     before(grammarAccess.getCompareAccess().getInfEnumLiteralDeclaration_0()); 
                    // InternalArduinoML.g:700:3: ( 'inf' )
                    // InternalArduinoML.g:700:4: 'inf'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getCompareAccess().getInfEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalArduinoML.g:704:2: ( ( 'einf' ) )
                    {
                    // InternalArduinoML.g:704:2: ( ( 'einf' ) )
                    // InternalArduinoML.g:705:3: ( 'einf' )
                    {
                     before(grammarAccess.getCompareAccess().getEinfEnumLiteralDeclaration_1()); 
                    // InternalArduinoML.g:706:3: ( 'einf' )
                    // InternalArduinoML.g:706:4: 'einf'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getCompareAccess().getEinfEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalArduinoML.g:710:2: ( ( 'equal' ) )
                    {
                    // InternalArduinoML.g:710:2: ( ( 'equal' ) )
                    // InternalArduinoML.g:711:3: ( 'equal' )
                    {
                     before(grammarAccess.getCompareAccess().getEqualEnumLiteralDeclaration_2()); 
                    // InternalArduinoML.g:712:3: ( 'equal' )
                    // InternalArduinoML.g:712:4: 'equal'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getCompareAccess().getEqualEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalArduinoML.g:716:2: ( ( 'esup' ) )
                    {
                    // InternalArduinoML.g:716:2: ( ( 'esup' ) )
                    // InternalArduinoML.g:717:3: ( 'esup' )
                    {
                     before(grammarAccess.getCompareAccess().getEsupEnumLiteralDeclaration_3()); 
                    // InternalArduinoML.g:718:3: ( 'esup' )
                    // InternalArduinoML.g:718:4: 'esup'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getCompareAccess().getEsupEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalArduinoML.g:722:2: ( ( 'sup' ) )
                    {
                    // InternalArduinoML.g:722:2: ( ( 'sup' ) )
                    // InternalArduinoML.g:723:3: ( 'sup' )
                    {
                     before(grammarAccess.getCompareAccess().getSupEnumLiteralDeclaration_4()); 
                    // InternalArduinoML.g:724:3: ( 'sup' )
                    // InternalArduinoML.g:724:4: 'sup'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getCompareAccess().getSupEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compare__Alternatives"


    // $ANTLR start "rule__AppState__Group__0"
    // InternalArduinoML.g:732:1: rule__AppState__Group__0 : rule__AppState__Group__0__Impl rule__AppState__Group__1 ;
    public final void rule__AppState__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:736:1: ( rule__AppState__Group__0__Impl rule__AppState__Group__1 )
            // InternalArduinoML.g:737:2: rule__AppState__Group__0__Impl rule__AppState__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__AppState__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AppState__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AppState__Group__0"


    // $ANTLR start "rule__AppState__Group__0__Impl"
    // InternalArduinoML.g:744:1: rule__AppState__Group__0__Impl : ( () ) ;
    public final void rule__AppState__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:748:1: ( ( () ) )
            // InternalArduinoML.g:749:1: ( () )
            {
            // InternalArduinoML.g:749:1: ( () )
            // InternalArduinoML.g:750:2: ()
            {
             before(grammarAccess.getAppStateAccess().getAppStateAction_0()); 
            // InternalArduinoML.g:751:2: ()
            // InternalArduinoML.g:751:3: 
            {
            }

             after(grammarAccess.getAppStateAccess().getAppStateAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AppState__Group__0__Impl"


    // $ANTLR start "rule__AppState__Group__1"
    // InternalArduinoML.g:759:1: rule__AppState__Group__1 : rule__AppState__Group__1__Impl ;
    public final void rule__AppState__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:763:1: ( rule__AppState__Group__1__Impl )
            // InternalArduinoML.g:764:2: rule__AppState__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AppState__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AppState__Group__1"


    // $ANTLR start "rule__AppState__Group__1__Impl"
    // InternalArduinoML.g:770:1: rule__AppState__Group__1__Impl : ( ( rule__AppState__Group_1__0 ) ) ;
    public final void rule__AppState__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:774:1: ( ( ( rule__AppState__Group_1__0 ) ) )
            // InternalArduinoML.g:775:1: ( ( rule__AppState__Group_1__0 ) )
            {
            // InternalArduinoML.g:775:1: ( ( rule__AppState__Group_1__0 ) )
            // InternalArduinoML.g:776:2: ( rule__AppState__Group_1__0 )
            {
             before(grammarAccess.getAppStateAccess().getGroup_1()); 
            // InternalArduinoML.g:777:2: ( rule__AppState__Group_1__0 )
            // InternalArduinoML.g:777:3: rule__AppState__Group_1__0
            {
            pushFollow(FOLLOW_2);
            rule__AppState__Group_1__0();

            state._fsp--;


            }

             after(grammarAccess.getAppStateAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AppState__Group__1__Impl"


    // $ANTLR start "rule__AppState__Group_1__0"
    // InternalArduinoML.g:786:1: rule__AppState__Group_1__0 : rule__AppState__Group_1__0__Impl rule__AppState__Group_1__1 ;
    public final void rule__AppState__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:790:1: ( rule__AppState__Group_1__0__Impl rule__AppState__Group_1__1 )
            // InternalArduinoML.g:791:2: rule__AppState__Group_1__0__Impl rule__AppState__Group_1__1
            {
            pushFollow(FOLLOW_4);
            rule__AppState__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AppState__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AppState__Group_1__0"


    // $ANTLR start "rule__AppState__Group_1__0__Impl"
    // InternalArduinoML.g:798:1: rule__AppState__Group_1__0__Impl : ( 'app' ) ;
    public final void rule__AppState__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:802:1: ( ( 'app' ) )
            // InternalArduinoML.g:803:1: ( 'app' )
            {
            // InternalArduinoML.g:803:1: ( 'app' )
            // InternalArduinoML.g:804:2: 'app'
            {
             before(grammarAccess.getAppStateAccess().getAppKeyword_1_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getAppStateAccess().getAppKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AppState__Group_1__0__Impl"


    // $ANTLR start "rule__AppState__Group_1__1"
    // InternalArduinoML.g:813:1: rule__AppState__Group_1__1 : rule__AppState__Group_1__1__Impl rule__AppState__Group_1__2 ;
    public final void rule__AppState__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:817:1: ( rule__AppState__Group_1__1__Impl rule__AppState__Group_1__2 )
            // InternalArduinoML.g:818:2: rule__AppState__Group_1__1__Impl rule__AppState__Group_1__2
            {
            pushFollow(FOLLOW_5);
            rule__AppState__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AppState__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AppState__Group_1__1"


    // $ANTLR start "rule__AppState__Group_1__1__Impl"
    // InternalArduinoML.g:825:1: rule__AppState__Group_1__1__Impl : ( ( rule__AppState__NameAssignment_1_1 ) ) ;
    public final void rule__AppState__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:829:1: ( ( ( rule__AppState__NameAssignment_1_1 ) ) )
            // InternalArduinoML.g:830:1: ( ( rule__AppState__NameAssignment_1_1 ) )
            {
            // InternalArduinoML.g:830:1: ( ( rule__AppState__NameAssignment_1_1 ) )
            // InternalArduinoML.g:831:2: ( rule__AppState__NameAssignment_1_1 )
            {
             before(grammarAccess.getAppStateAccess().getNameAssignment_1_1()); 
            // InternalArduinoML.g:832:2: ( rule__AppState__NameAssignment_1_1 )
            // InternalArduinoML.g:832:3: rule__AppState__NameAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__AppState__NameAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getAppStateAccess().getNameAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AppState__Group_1__1__Impl"


    // $ANTLR start "rule__AppState__Group_1__2"
    // InternalArduinoML.g:840:1: rule__AppState__Group_1__2 : rule__AppState__Group_1__2__Impl rule__AppState__Group_1__3 ;
    public final void rule__AppState__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:844:1: ( rule__AppState__Group_1__2__Impl rule__AppState__Group_1__3 )
            // InternalArduinoML.g:845:2: rule__AppState__Group_1__2__Impl rule__AppState__Group_1__3
            {
            pushFollow(FOLLOW_6);
            rule__AppState__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AppState__Group_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AppState__Group_1__2"


    // $ANTLR start "rule__AppState__Group_1__2__Impl"
    // InternalArduinoML.g:852:1: rule__AppState__Group_1__2__Impl : ( 'initial' ) ;
    public final void rule__AppState__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:856:1: ( ( 'initial' ) )
            // InternalArduinoML.g:857:1: ( 'initial' )
            {
            // InternalArduinoML.g:857:1: ( 'initial' )
            // InternalArduinoML.g:858:2: 'initial'
            {
             before(grammarAccess.getAppStateAccess().getInitialKeyword_1_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getAppStateAccess().getInitialKeyword_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AppState__Group_1__2__Impl"


    // $ANTLR start "rule__AppState__Group_1__3"
    // InternalArduinoML.g:867:1: rule__AppState__Group_1__3 : rule__AppState__Group_1__3__Impl rule__AppState__Group_1__4 ;
    public final void rule__AppState__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:871:1: ( rule__AppState__Group_1__3__Impl rule__AppState__Group_1__4 )
            // InternalArduinoML.g:872:2: rule__AppState__Group_1__3__Impl rule__AppState__Group_1__4
            {
            pushFollow(FOLLOW_4);
            rule__AppState__Group_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AppState__Group_1__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AppState__Group_1__3"


    // $ANTLR start "rule__AppState__Group_1__3__Impl"
    // InternalArduinoML.g:879:1: rule__AppState__Group_1__3__Impl : ( 'state' ) ;
    public final void rule__AppState__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:883:1: ( ( 'state' ) )
            // InternalArduinoML.g:884:1: ( 'state' )
            {
            // InternalArduinoML.g:884:1: ( 'state' )
            // InternalArduinoML.g:885:2: 'state'
            {
             before(grammarAccess.getAppStateAccess().getStateKeyword_1_3()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getAppStateAccess().getStateKeyword_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AppState__Group_1__3__Impl"


    // $ANTLR start "rule__AppState__Group_1__4"
    // InternalArduinoML.g:894:1: rule__AppState__Group_1__4 : rule__AppState__Group_1__4__Impl rule__AppState__Group_1__5 ;
    public final void rule__AppState__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:898:1: ( rule__AppState__Group_1__4__Impl rule__AppState__Group_1__5 )
            // InternalArduinoML.g:899:2: rule__AppState__Group_1__4__Impl rule__AppState__Group_1__5
            {
            pushFollow(FOLLOW_7);
            rule__AppState__Group_1__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AppState__Group_1__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AppState__Group_1__4"


    // $ANTLR start "rule__AppState__Group_1__4__Impl"
    // InternalArduinoML.g:906:1: rule__AppState__Group_1__4__Impl : ( ( rule__AppState__Initial_stateAssignment_1_4 ) ) ;
    public final void rule__AppState__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:910:1: ( ( ( rule__AppState__Initial_stateAssignment_1_4 ) ) )
            // InternalArduinoML.g:911:1: ( ( rule__AppState__Initial_stateAssignment_1_4 ) )
            {
            // InternalArduinoML.g:911:1: ( ( rule__AppState__Initial_stateAssignment_1_4 ) )
            // InternalArduinoML.g:912:2: ( rule__AppState__Initial_stateAssignment_1_4 )
            {
             before(grammarAccess.getAppStateAccess().getInitial_stateAssignment_1_4()); 
            // InternalArduinoML.g:913:2: ( rule__AppState__Initial_stateAssignment_1_4 )
            // InternalArduinoML.g:913:3: rule__AppState__Initial_stateAssignment_1_4
            {
            pushFollow(FOLLOW_2);
            rule__AppState__Initial_stateAssignment_1_4();

            state._fsp--;


            }

             after(grammarAccess.getAppStateAccess().getInitial_stateAssignment_1_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AppState__Group_1__4__Impl"


    // $ANTLR start "rule__AppState__Group_1__5"
    // InternalArduinoML.g:921:1: rule__AppState__Group_1__5 : rule__AppState__Group_1__5__Impl rule__AppState__Group_1__6 ;
    public final void rule__AppState__Group_1__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:925:1: ( rule__AppState__Group_1__5__Impl rule__AppState__Group_1__6 )
            // InternalArduinoML.g:926:2: rule__AppState__Group_1__5__Impl rule__AppState__Group_1__6
            {
            pushFollow(FOLLOW_8);
            rule__AppState__Group_1__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AppState__Group_1__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AppState__Group_1__5"


    // $ANTLR start "rule__AppState__Group_1__5__Impl"
    // InternalArduinoML.g:933:1: rule__AppState__Group_1__5__Impl : ( ':' ) ;
    public final void rule__AppState__Group_1__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:937:1: ( ( ':' ) )
            // InternalArduinoML.g:938:1: ( ':' )
            {
            // InternalArduinoML.g:938:1: ( ':' )
            // InternalArduinoML.g:939:2: ':'
            {
             before(grammarAccess.getAppStateAccess().getColonKeyword_1_5()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getAppStateAccess().getColonKeyword_1_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AppState__Group_1__5__Impl"


    // $ANTLR start "rule__AppState__Group_1__6"
    // InternalArduinoML.g:948:1: rule__AppState__Group_1__6 : rule__AppState__Group_1__6__Impl rule__AppState__Group_1__7 ;
    public final void rule__AppState__Group_1__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:952:1: ( rule__AppState__Group_1__6__Impl rule__AppState__Group_1__7 )
            // InternalArduinoML.g:953:2: rule__AppState__Group_1__6__Impl rule__AppState__Group_1__7
            {
            pushFollow(FOLLOW_7);
            rule__AppState__Group_1__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AppState__Group_1__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AppState__Group_1__6"


    // $ANTLR start "rule__AppState__Group_1__6__Impl"
    // InternalArduinoML.g:960:1: rule__AppState__Group_1__6__Impl : ( 'bricks' ) ;
    public final void rule__AppState__Group_1__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:964:1: ( ( 'bricks' ) )
            // InternalArduinoML.g:965:1: ( 'bricks' )
            {
            // InternalArduinoML.g:965:1: ( 'bricks' )
            // InternalArduinoML.g:966:2: 'bricks'
            {
             before(grammarAccess.getAppStateAccess().getBricksKeyword_1_6()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getAppStateAccess().getBricksKeyword_1_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AppState__Group_1__6__Impl"


    // $ANTLR start "rule__AppState__Group_1__7"
    // InternalArduinoML.g:975:1: rule__AppState__Group_1__7 : rule__AppState__Group_1__7__Impl rule__AppState__Group_1__8 ;
    public final void rule__AppState__Group_1__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:979:1: ( rule__AppState__Group_1__7__Impl rule__AppState__Group_1__8 )
            // InternalArduinoML.g:980:2: rule__AppState__Group_1__7__Impl rule__AppState__Group_1__8
            {
            pushFollow(FOLLOW_9);
            rule__AppState__Group_1__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AppState__Group_1__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AppState__Group_1__7"


    // $ANTLR start "rule__AppState__Group_1__7__Impl"
    // InternalArduinoML.g:987:1: rule__AppState__Group_1__7__Impl : ( ':' ) ;
    public final void rule__AppState__Group_1__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:991:1: ( ( ':' ) )
            // InternalArduinoML.g:992:1: ( ':' )
            {
            // InternalArduinoML.g:992:1: ( ':' )
            // InternalArduinoML.g:993:2: ':'
            {
             before(grammarAccess.getAppStateAccess().getColonKeyword_1_7()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getAppStateAccess().getColonKeyword_1_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AppState__Group_1__7__Impl"


    // $ANTLR start "rule__AppState__Group_1__8"
    // InternalArduinoML.g:1002:1: rule__AppState__Group_1__8 : rule__AppState__Group_1__8__Impl rule__AppState__Group_1__9 ;
    public final void rule__AppState__Group_1__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1006:1: ( rule__AppState__Group_1__8__Impl rule__AppState__Group_1__9 )
            // InternalArduinoML.g:1007:2: rule__AppState__Group_1__8__Impl rule__AppState__Group_1__9
            {
            pushFollow(FOLLOW_10);
            rule__AppState__Group_1__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AppState__Group_1__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AppState__Group_1__8"


    // $ANTLR start "rule__AppState__Group_1__8__Impl"
    // InternalArduinoML.g:1014:1: rule__AppState__Group_1__8__Impl : ( ( rule__AppState__BricksAssignment_1_8 ) ) ;
    public final void rule__AppState__Group_1__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1018:1: ( ( ( rule__AppState__BricksAssignment_1_8 ) ) )
            // InternalArduinoML.g:1019:1: ( ( rule__AppState__BricksAssignment_1_8 ) )
            {
            // InternalArduinoML.g:1019:1: ( ( rule__AppState__BricksAssignment_1_8 ) )
            // InternalArduinoML.g:1020:2: ( rule__AppState__BricksAssignment_1_8 )
            {
             before(grammarAccess.getAppStateAccess().getBricksAssignment_1_8()); 
            // InternalArduinoML.g:1021:2: ( rule__AppState__BricksAssignment_1_8 )
            // InternalArduinoML.g:1021:3: rule__AppState__BricksAssignment_1_8
            {
            pushFollow(FOLLOW_2);
            rule__AppState__BricksAssignment_1_8();

            state._fsp--;


            }

             after(grammarAccess.getAppStateAccess().getBricksAssignment_1_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AppState__Group_1__8__Impl"


    // $ANTLR start "rule__AppState__Group_1__9"
    // InternalArduinoML.g:1029:1: rule__AppState__Group_1__9 : rule__AppState__Group_1__9__Impl rule__AppState__Group_1__10 ;
    public final void rule__AppState__Group_1__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1033:1: ( rule__AppState__Group_1__9__Impl rule__AppState__Group_1__10 )
            // InternalArduinoML.g:1034:2: rule__AppState__Group_1__9__Impl rule__AppState__Group_1__10
            {
            pushFollow(FOLLOW_10);
            rule__AppState__Group_1__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AppState__Group_1__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AppState__Group_1__9"


    // $ANTLR start "rule__AppState__Group_1__9__Impl"
    // InternalArduinoML.g:1041:1: rule__AppState__Group_1__9__Impl : ( ( rule__AppState__BricksAssignment_1_9 )* ) ;
    public final void rule__AppState__Group_1__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1045:1: ( ( ( rule__AppState__BricksAssignment_1_9 )* ) )
            // InternalArduinoML.g:1046:1: ( ( rule__AppState__BricksAssignment_1_9 )* )
            {
            // InternalArduinoML.g:1046:1: ( ( rule__AppState__BricksAssignment_1_9 )* )
            // InternalArduinoML.g:1047:2: ( rule__AppState__BricksAssignment_1_9 )*
            {
             before(grammarAccess.getAppStateAccess().getBricksAssignment_1_9()); 
            // InternalArduinoML.g:1048:2: ( rule__AppState__BricksAssignment_1_9 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=30 && LA13_0<=32)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalArduinoML.g:1048:3: rule__AppState__BricksAssignment_1_9
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__AppState__BricksAssignment_1_9();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getAppStateAccess().getBricksAssignment_1_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AppState__Group_1__9__Impl"


    // $ANTLR start "rule__AppState__Group_1__10"
    // InternalArduinoML.g:1056:1: rule__AppState__Group_1__10 : rule__AppState__Group_1__10__Impl rule__AppState__Group_1__11 ;
    public final void rule__AppState__Group_1__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1060:1: ( rule__AppState__Group_1__10__Impl rule__AppState__Group_1__11 )
            // InternalArduinoML.g:1061:2: rule__AppState__Group_1__10__Impl rule__AppState__Group_1__11
            {
            pushFollow(FOLLOW_7);
            rule__AppState__Group_1__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AppState__Group_1__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AppState__Group_1__10"


    // $ANTLR start "rule__AppState__Group_1__10__Impl"
    // InternalArduinoML.g:1068:1: rule__AppState__Group_1__10__Impl : ( 'states' ) ;
    public final void rule__AppState__Group_1__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1072:1: ( ( 'states' ) )
            // InternalArduinoML.g:1073:1: ( 'states' )
            {
            // InternalArduinoML.g:1073:1: ( 'states' )
            // InternalArduinoML.g:1074:2: 'states'
            {
             before(grammarAccess.getAppStateAccess().getStatesKeyword_1_10()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getAppStateAccess().getStatesKeyword_1_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AppState__Group_1__10__Impl"


    // $ANTLR start "rule__AppState__Group_1__11"
    // InternalArduinoML.g:1083:1: rule__AppState__Group_1__11 : rule__AppState__Group_1__11__Impl rule__AppState__Group_1__12 ;
    public final void rule__AppState__Group_1__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1087:1: ( rule__AppState__Group_1__11__Impl rule__AppState__Group_1__12 )
            // InternalArduinoML.g:1088:2: rule__AppState__Group_1__11__Impl rule__AppState__Group_1__12
            {
            pushFollow(FOLLOW_4);
            rule__AppState__Group_1__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AppState__Group_1__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AppState__Group_1__11"


    // $ANTLR start "rule__AppState__Group_1__11__Impl"
    // InternalArduinoML.g:1095:1: rule__AppState__Group_1__11__Impl : ( ':' ) ;
    public final void rule__AppState__Group_1__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1099:1: ( ( ':' ) )
            // InternalArduinoML.g:1100:1: ( ':' )
            {
            // InternalArduinoML.g:1100:1: ( ':' )
            // InternalArduinoML.g:1101:2: ':'
            {
             before(grammarAccess.getAppStateAccess().getColonKeyword_1_11()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getAppStateAccess().getColonKeyword_1_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AppState__Group_1__11__Impl"


    // $ANTLR start "rule__AppState__Group_1__12"
    // InternalArduinoML.g:1110:1: rule__AppState__Group_1__12 : rule__AppState__Group_1__12__Impl rule__AppState__Group_1__13 ;
    public final void rule__AppState__Group_1__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1114:1: ( rule__AppState__Group_1__12__Impl rule__AppState__Group_1__13 )
            // InternalArduinoML.g:1115:2: rule__AppState__Group_1__12__Impl rule__AppState__Group_1__13
            {
            pushFollow(FOLLOW_4);
            rule__AppState__Group_1__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AppState__Group_1__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AppState__Group_1__12"


    // $ANTLR start "rule__AppState__Group_1__12__Impl"
    // InternalArduinoML.g:1122:1: rule__AppState__Group_1__12__Impl : ( ( rule__AppState__StatesAssignment_1_12 ) ) ;
    public final void rule__AppState__Group_1__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1126:1: ( ( ( rule__AppState__StatesAssignment_1_12 ) ) )
            // InternalArduinoML.g:1127:1: ( ( rule__AppState__StatesAssignment_1_12 ) )
            {
            // InternalArduinoML.g:1127:1: ( ( rule__AppState__StatesAssignment_1_12 ) )
            // InternalArduinoML.g:1128:2: ( rule__AppState__StatesAssignment_1_12 )
            {
             before(grammarAccess.getAppStateAccess().getStatesAssignment_1_12()); 
            // InternalArduinoML.g:1129:2: ( rule__AppState__StatesAssignment_1_12 )
            // InternalArduinoML.g:1129:3: rule__AppState__StatesAssignment_1_12
            {
            pushFollow(FOLLOW_2);
            rule__AppState__StatesAssignment_1_12();

            state._fsp--;


            }

             after(grammarAccess.getAppStateAccess().getStatesAssignment_1_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AppState__Group_1__12__Impl"


    // $ANTLR start "rule__AppState__Group_1__13"
    // InternalArduinoML.g:1137:1: rule__AppState__Group_1__13 : rule__AppState__Group_1__13__Impl ;
    public final void rule__AppState__Group_1__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1141:1: ( rule__AppState__Group_1__13__Impl )
            // InternalArduinoML.g:1142:2: rule__AppState__Group_1__13__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AppState__Group_1__13__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AppState__Group_1__13"


    // $ANTLR start "rule__AppState__Group_1__13__Impl"
    // InternalArduinoML.g:1148:1: rule__AppState__Group_1__13__Impl : ( ( rule__AppState__StatesAssignment_1_13 )* ) ;
    public final void rule__AppState__Group_1__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1152:1: ( ( ( rule__AppState__StatesAssignment_1_13 )* ) )
            // InternalArduinoML.g:1153:1: ( ( rule__AppState__StatesAssignment_1_13 )* )
            {
            // InternalArduinoML.g:1153:1: ( ( rule__AppState__StatesAssignment_1_13 )* )
            // InternalArduinoML.g:1154:2: ( rule__AppState__StatesAssignment_1_13 )*
            {
             before(grammarAccess.getAppStateAccess().getStatesAssignment_1_13()); 
            // InternalArduinoML.g:1155:2: ( rule__AppState__StatesAssignment_1_13 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=RULE_STRING && LA14_0<=RULE_ID)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalArduinoML.g:1155:3: rule__AppState__StatesAssignment_1_13
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__AppState__StatesAssignment_1_13();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getAppStateAccess().getStatesAssignment_1_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AppState__Group_1__13__Impl"


    // $ANTLR start "rule__AppMode__Group__0"
    // InternalArduinoML.g:1164:1: rule__AppMode__Group__0 : rule__AppMode__Group__0__Impl rule__AppMode__Group__1 ;
    public final void rule__AppMode__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1168:1: ( rule__AppMode__Group__0__Impl rule__AppMode__Group__1 )
            // InternalArduinoML.g:1169:2: rule__AppMode__Group__0__Impl rule__AppMode__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__AppMode__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AppMode__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AppMode__Group__0"


    // $ANTLR start "rule__AppMode__Group__0__Impl"
    // InternalArduinoML.g:1176:1: rule__AppMode__Group__0__Impl : ( () ) ;
    public final void rule__AppMode__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1180:1: ( ( () ) )
            // InternalArduinoML.g:1181:1: ( () )
            {
            // InternalArduinoML.g:1181:1: ( () )
            // InternalArduinoML.g:1182:2: ()
            {
             before(grammarAccess.getAppModeAccess().getAppModeAction_0()); 
            // InternalArduinoML.g:1183:2: ()
            // InternalArduinoML.g:1183:3: 
            {
            }

             after(grammarAccess.getAppModeAccess().getAppModeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AppMode__Group__0__Impl"


    // $ANTLR start "rule__AppMode__Group__1"
    // InternalArduinoML.g:1191:1: rule__AppMode__Group__1 : rule__AppMode__Group__1__Impl ;
    public final void rule__AppMode__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1195:1: ( rule__AppMode__Group__1__Impl )
            // InternalArduinoML.g:1196:2: rule__AppMode__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AppMode__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AppMode__Group__1"


    // $ANTLR start "rule__AppMode__Group__1__Impl"
    // InternalArduinoML.g:1202:1: rule__AppMode__Group__1__Impl : ( ( rule__AppMode__Group_1__0 ) ) ;
    public final void rule__AppMode__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1206:1: ( ( ( rule__AppMode__Group_1__0 ) ) )
            // InternalArduinoML.g:1207:1: ( ( rule__AppMode__Group_1__0 ) )
            {
            // InternalArduinoML.g:1207:1: ( ( rule__AppMode__Group_1__0 ) )
            // InternalArduinoML.g:1208:2: ( rule__AppMode__Group_1__0 )
            {
             before(grammarAccess.getAppModeAccess().getGroup_1()); 
            // InternalArduinoML.g:1209:2: ( rule__AppMode__Group_1__0 )
            // InternalArduinoML.g:1209:3: rule__AppMode__Group_1__0
            {
            pushFollow(FOLLOW_2);
            rule__AppMode__Group_1__0();

            state._fsp--;


            }

             after(grammarAccess.getAppModeAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AppMode__Group__1__Impl"


    // $ANTLR start "rule__AppMode__Group_1__0"
    // InternalArduinoML.g:1218:1: rule__AppMode__Group_1__0 : rule__AppMode__Group_1__0__Impl rule__AppMode__Group_1__1 ;
    public final void rule__AppMode__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1222:1: ( rule__AppMode__Group_1__0__Impl rule__AppMode__Group_1__1 )
            // InternalArduinoML.g:1223:2: rule__AppMode__Group_1__0__Impl rule__AppMode__Group_1__1
            {
            pushFollow(FOLLOW_4);
            rule__AppMode__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AppMode__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AppMode__Group_1__0"


    // $ANTLR start "rule__AppMode__Group_1__0__Impl"
    // InternalArduinoML.g:1230:1: rule__AppMode__Group_1__0__Impl : ( 'app' ) ;
    public final void rule__AppMode__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1234:1: ( ( 'app' ) )
            // InternalArduinoML.g:1235:1: ( 'app' )
            {
            // InternalArduinoML.g:1235:1: ( 'app' )
            // InternalArduinoML.g:1236:2: 'app'
            {
             before(grammarAccess.getAppModeAccess().getAppKeyword_1_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getAppModeAccess().getAppKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AppMode__Group_1__0__Impl"


    // $ANTLR start "rule__AppMode__Group_1__1"
    // InternalArduinoML.g:1245:1: rule__AppMode__Group_1__1 : rule__AppMode__Group_1__1__Impl rule__AppMode__Group_1__2 ;
    public final void rule__AppMode__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1249:1: ( rule__AppMode__Group_1__1__Impl rule__AppMode__Group_1__2 )
            // InternalArduinoML.g:1250:2: rule__AppMode__Group_1__1__Impl rule__AppMode__Group_1__2
            {
            pushFollow(FOLLOW_5);
            rule__AppMode__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AppMode__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AppMode__Group_1__1"


    // $ANTLR start "rule__AppMode__Group_1__1__Impl"
    // InternalArduinoML.g:1257:1: rule__AppMode__Group_1__1__Impl : ( ( rule__AppMode__NameAssignment_1_1 ) ) ;
    public final void rule__AppMode__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1261:1: ( ( ( rule__AppMode__NameAssignment_1_1 ) ) )
            // InternalArduinoML.g:1262:1: ( ( rule__AppMode__NameAssignment_1_1 ) )
            {
            // InternalArduinoML.g:1262:1: ( ( rule__AppMode__NameAssignment_1_1 ) )
            // InternalArduinoML.g:1263:2: ( rule__AppMode__NameAssignment_1_1 )
            {
             before(grammarAccess.getAppModeAccess().getNameAssignment_1_1()); 
            // InternalArduinoML.g:1264:2: ( rule__AppMode__NameAssignment_1_1 )
            // InternalArduinoML.g:1264:3: rule__AppMode__NameAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__AppMode__NameAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getAppModeAccess().getNameAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AppMode__Group_1__1__Impl"


    // $ANTLR start "rule__AppMode__Group_1__2"
    // InternalArduinoML.g:1272:1: rule__AppMode__Group_1__2 : rule__AppMode__Group_1__2__Impl rule__AppMode__Group_1__3 ;
    public final void rule__AppMode__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1276:1: ( rule__AppMode__Group_1__2__Impl rule__AppMode__Group_1__3 )
            // InternalArduinoML.g:1277:2: rule__AppMode__Group_1__2__Impl rule__AppMode__Group_1__3
            {
            pushFollow(FOLLOW_13);
            rule__AppMode__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AppMode__Group_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AppMode__Group_1__2"


    // $ANTLR start "rule__AppMode__Group_1__2__Impl"
    // InternalArduinoML.g:1284:1: rule__AppMode__Group_1__2__Impl : ( 'initial' ) ;
    public final void rule__AppMode__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1288:1: ( ( 'initial' ) )
            // InternalArduinoML.g:1289:1: ( 'initial' )
            {
            // InternalArduinoML.g:1289:1: ( 'initial' )
            // InternalArduinoML.g:1290:2: 'initial'
            {
             before(grammarAccess.getAppModeAccess().getInitialKeyword_1_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getAppModeAccess().getInitialKeyword_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AppMode__Group_1__2__Impl"


    // $ANTLR start "rule__AppMode__Group_1__3"
    // InternalArduinoML.g:1299:1: rule__AppMode__Group_1__3 : rule__AppMode__Group_1__3__Impl rule__AppMode__Group_1__4 ;
    public final void rule__AppMode__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1303:1: ( rule__AppMode__Group_1__3__Impl rule__AppMode__Group_1__4 )
            // InternalArduinoML.g:1304:2: rule__AppMode__Group_1__3__Impl rule__AppMode__Group_1__4
            {
            pushFollow(FOLLOW_4);
            rule__AppMode__Group_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AppMode__Group_1__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AppMode__Group_1__3"


    // $ANTLR start "rule__AppMode__Group_1__3__Impl"
    // InternalArduinoML.g:1311:1: rule__AppMode__Group_1__3__Impl : ( 'mode' ) ;
    public final void rule__AppMode__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1315:1: ( ( 'mode' ) )
            // InternalArduinoML.g:1316:1: ( 'mode' )
            {
            // InternalArduinoML.g:1316:1: ( 'mode' )
            // InternalArduinoML.g:1317:2: 'mode'
            {
             before(grammarAccess.getAppModeAccess().getModeKeyword_1_3()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getAppModeAccess().getModeKeyword_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AppMode__Group_1__3__Impl"


    // $ANTLR start "rule__AppMode__Group_1__4"
    // InternalArduinoML.g:1326:1: rule__AppMode__Group_1__4 : rule__AppMode__Group_1__4__Impl rule__AppMode__Group_1__5 ;
    public final void rule__AppMode__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1330:1: ( rule__AppMode__Group_1__4__Impl rule__AppMode__Group_1__5 )
            // InternalArduinoML.g:1331:2: rule__AppMode__Group_1__4__Impl rule__AppMode__Group_1__5
            {
            pushFollow(FOLLOW_7);
            rule__AppMode__Group_1__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AppMode__Group_1__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AppMode__Group_1__4"


    // $ANTLR start "rule__AppMode__Group_1__4__Impl"
    // InternalArduinoML.g:1338:1: rule__AppMode__Group_1__4__Impl : ( ( rule__AppMode__Initial_modeAssignment_1_4 ) ) ;
    public final void rule__AppMode__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1342:1: ( ( ( rule__AppMode__Initial_modeAssignment_1_4 ) ) )
            // InternalArduinoML.g:1343:1: ( ( rule__AppMode__Initial_modeAssignment_1_4 ) )
            {
            // InternalArduinoML.g:1343:1: ( ( rule__AppMode__Initial_modeAssignment_1_4 ) )
            // InternalArduinoML.g:1344:2: ( rule__AppMode__Initial_modeAssignment_1_4 )
            {
             before(grammarAccess.getAppModeAccess().getInitial_modeAssignment_1_4()); 
            // InternalArduinoML.g:1345:2: ( rule__AppMode__Initial_modeAssignment_1_4 )
            // InternalArduinoML.g:1345:3: rule__AppMode__Initial_modeAssignment_1_4
            {
            pushFollow(FOLLOW_2);
            rule__AppMode__Initial_modeAssignment_1_4();

            state._fsp--;


            }

             after(grammarAccess.getAppModeAccess().getInitial_modeAssignment_1_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AppMode__Group_1__4__Impl"


    // $ANTLR start "rule__AppMode__Group_1__5"
    // InternalArduinoML.g:1353:1: rule__AppMode__Group_1__5 : rule__AppMode__Group_1__5__Impl rule__AppMode__Group_1__6 ;
    public final void rule__AppMode__Group_1__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1357:1: ( rule__AppMode__Group_1__5__Impl rule__AppMode__Group_1__6 )
            // InternalArduinoML.g:1358:2: rule__AppMode__Group_1__5__Impl rule__AppMode__Group_1__6
            {
            pushFollow(FOLLOW_8);
            rule__AppMode__Group_1__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AppMode__Group_1__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AppMode__Group_1__5"


    // $ANTLR start "rule__AppMode__Group_1__5__Impl"
    // InternalArduinoML.g:1365:1: rule__AppMode__Group_1__5__Impl : ( ':' ) ;
    public final void rule__AppMode__Group_1__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1369:1: ( ( ':' ) )
            // InternalArduinoML.g:1370:1: ( ':' )
            {
            // InternalArduinoML.g:1370:1: ( ':' )
            // InternalArduinoML.g:1371:2: ':'
            {
             before(grammarAccess.getAppModeAccess().getColonKeyword_1_5()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getAppModeAccess().getColonKeyword_1_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AppMode__Group_1__5__Impl"


    // $ANTLR start "rule__AppMode__Group_1__6"
    // InternalArduinoML.g:1380:1: rule__AppMode__Group_1__6 : rule__AppMode__Group_1__6__Impl rule__AppMode__Group_1__7 ;
    public final void rule__AppMode__Group_1__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1384:1: ( rule__AppMode__Group_1__6__Impl rule__AppMode__Group_1__7 )
            // InternalArduinoML.g:1385:2: rule__AppMode__Group_1__6__Impl rule__AppMode__Group_1__7
            {
            pushFollow(FOLLOW_7);
            rule__AppMode__Group_1__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AppMode__Group_1__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AppMode__Group_1__6"


    // $ANTLR start "rule__AppMode__Group_1__6__Impl"
    // InternalArduinoML.g:1392:1: rule__AppMode__Group_1__6__Impl : ( 'bricks' ) ;
    public final void rule__AppMode__Group_1__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1396:1: ( ( 'bricks' ) )
            // InternalArduinoML.g:1397:1: ( 'bricks' )
            {
            // InternalArduinoML.g:1397:1: ( 'bricks' )
            // InternalArduinoML.g:1398:2: 'bricks'
            {
             before(grammarAccess.getAppModeAccess().getBricksKeyword_1_6()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getAppModeAccess().getBricksKeyword_1_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AppMode__Group_1__6__Impl"


    // $ANTLR start "rule__AppMode__Group_1__7"
    // InternalArduinoML.g:1407:1: rule__AppMode__Group_1__7 : rule__AppMode__Group_1__7__Impl rule__AppMode__Group_1__8 ;
    public final void rule__AppMode__Group_1__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1411:1: ( rule__AppMode__Group_1__7__Impl rule__AppMode__Group_1__8 )
            // InternalArduinoML.g:1412:2: rule__AppMode__Group_1__7__Impl rule__AppMode__Group_1__8
            {
            pushFollow(FOLLOW_9);
            rule__AppMode__Group_1__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AppMode__Group_1__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AppMode__Group_1__7"


    // $ANTLR start "rule__AppMode__Group_1__7__Impl"
    // InternalArduinoML.g:1419:1: rule__AppMode__Group_1__7__Impl : ( ':' ) ;
    public final void rule__AppMode__Group_1__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1423:1: ( ( ':' ) )
            // InternalArduinoML.g:1424:1: ( ':' )
            {
            // InternalArduinoML.g:1424:1: ( ':' )
            // InternalArduinoML.g:1425:2: ':'
            {
             before(grammarAccess.getAppModeAccess().getColonKeyword_1_7()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getAppModeAccess().getColonKeyword_1_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AppMode__Group_1__7__Impl"


    // $ANTLR start "rule__AppMode__Group_1__8"
    // InternalArduinoML.g:1434:1: rule__AppMode__Group_1__8 : rule__AppMode__Group_1__8__Impl rule__AppMode__Group_1__9 ;
    public final void rule__AppMode__Group_1__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1438:1: ( rule__AppMode__Group_1__8__Impl rule__AppMode__Group_1__9 )
            // InternalArduinoML.g:1439:2: rule__AppMode__Group_1__8__Impl rule__AppMode__Group_1__9
            {
            pushFollow(FOLLOW_14);
            rule__AppMode__Group_1__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AppMode__Group_1__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AppMode__Group_1__8"


    // $ANTLR start "rule__AppMode__Group_1__8__Impl"
    // InternalArduinoML.g:1446:1: rule__AppMode__Group_1__8__Impl : ( ( rule__AppMode__BricksAssignment_1_8 ) ) ;
    public final void rule__AppMode__Group_1__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1450:1: ( ( ( rule__AppMode__BricksAssignment_1_8 ) ) )
            // InternalArduinoML.g:1451:1: ( ( rule__AppMode__BricksAssignment_1_8 ) )
            {
            // InternalArduinoML.g:1451:1: ( ( rule__AppMode__BricksAssignment_1_8 ) )
            // InternalArduinoML.g:1452:2: ( rule__AppMode__BricksAssignment_1_8 )
            {
             before(grammarAccess.getAppModeAccess().getBricksAssignment_1_8()); 
            // InternalArduinoML.g:1453:2: ( rule__AppMode__BricksAssignment_1_8 )
            // InternalArduinoML.g:1453:3: rule__AppMode__BricksAssignment_1_8
            {
            pushFollow(FOLLOW_2);
            rule__AppMode__BricksAssignment_1_8();

            state._fsp--;


            }

             after(grammarAccess.getAppModeAccess().getBricksAssignment_1_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AppMode__Group_1__8__Impl"


    // $ANTLR start "rule__AppMode__Group_1__9"
    // InternalArduinoML.g:1461:1: rule__AppMode__Group_1__9 : rule__AppMode__Group_1__9__Impl rule__AppMode__Group_1__10 ;
    public final void rule__AppMode__Group_1__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1465:1: ( rule__AppMode__Group_1__9__Impl rule__AppMode__Group_1__10 )
            // InternalArduinoML.g:1466:2: rule__AppMode__Group_1__9__Impl rule__AppMode__Group_1__10
            {
            pushFollow(FOLLOW_14);
            rule__AppMode__Group_1__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AppMode__Group_1__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AppMode__Group_1__9"


    // $ANTLR start "rule__AppMode__Group_1__9__Impl"
    // InternalArduinoML.g:1473:1: rule__AppMode__Group_1__9__Impl : ( ( rule__AppMode__BricksAssignment_1_9 )* ) ;
    public final void rule__AppMode__Group_1__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1477:1: ( ( ( rule__AppMode__BricksAssignment_1_9 )* ) )
            // InternalArduinoML.g:1478:1: ( ( rule__AppMode__BricksAssignment_1_9 )* )
            {
            // InternalArduinoML.g:1478:1: ( ( rule__AppMode__BricksAssignment_1_9 )* )
            // InternalArduinoML.g:1479:2: ( rule__AppMode__BricksAssignment_1_9 )*
            {
             before(grammarAccess.getAppModeAccess().getBricksAssignment_1_9()); 
            // InternalArduinoML.g:1480:2: ( rule__AppMode__BricksAssignment_1_9 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=30 && LA15_0<=32)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalArduinoML.g:1480:3: rule__AppMode__BricksAssignment_1_9
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__AppMode__BricksAssignment_1_9();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getAppModeAccess().getBricksAssignment_1_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AppMode__Group_1__9__Impl"


    // $ANTLR start "rule__AppMode__Group_1__10"
    // InternalArduinoML.g:1488:1: rule__AppMode__Group_1__10 : rule__AppMode__Group_1__10__Impl rule__AppMode__Group_1__11 ;
    public final void rule__AppMode__Group_1__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1492:1: ( rule__AppMode__Group_1__10__Impl rule__AppMode__Group_1__11 )
            // InternalArduinoML.g:1493:2: rule__AppMode__Group_1__10__Impl rule__AppMode__Group_1__11
            {
            pushFollow(FOLLOW_7);
            rule__AppMode__Group_1__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AppMode__Group_1__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AppMode__Group_1__10"


    // $ANTLR start "rule__AppMode__Group_1__10__Impl"
    // InternalArduinoML.g:1500:1: rule__AppMode__Group_1__10__Impl : ( 'modes' ) ;
    public final void rule__AppMode__Group_1__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1504:1: ( ( 'modes' ) )
            // InternalArduinoML.g:1505:1: ( 'modes' )
            {
            // InternalArduinoML.g:1505:1: ( 'modes' )
            // InternalArduinoML.g:1506:2: 'modes'
            {
             before(grammarAccess.getAppModeAccess().getModesKeyword_1_10()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getAppModeAccess().getModesKeyword_1_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AppMode__Group_1__10__Impl"


    // $ANTLR start "rule__AppMode__Group_1__11"
    // InternalArduinoML.g:1515:1: rule__AppMode__Group_1__11 : rule__AppMode__Group_1__11__Impl rule__AppMode__Group_1__12 ;
    public final void rule__AppMode__Group_1__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1519:1: ( rule__AppMode__Group_1__11__Impl rule__AppMode__Group_1__12 )
            // InternalArduinoML.g:1520:2: rule__AppMode__Group_1__11__Impl rule__AppMode__Group_1__12
            {
            pushFollow(FOLLOW_4);
            rule__AppMode__Group_1__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AppMode__Group_1__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AppMode__Group_1__11"


    // $ANTLR start "rule__AppMode__Group_1__11__Impl"
    // InternalArduinoML.g:1527:1: rule__AppMode__Group_1__11__Impl : ( ':' ) ;
    public final void rule__AppMode__Group_1__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1531:1: ( ( ':' ) )
            // InternalArduinoML.g:1532:1: ( ':' )
            {
            // InternalArduinoML.g:1532:1: ( ':' )
            // InternalArduinoML.g:1533:2: ':'
            {
             before(grammarAccess.getAppModeAccess().getColonKeyword_1_11()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getAppModeAccess().getColonKeyword_1_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AppMode__Group_1__11__Impl"


    // $ANTLR start "rule__AppMode__Group_1__12"
    // InternalArduinoML.g:1542:1: rule__AppMode__Group_1__12 : rule__AppMode__Group_1__12__Impl rule__AppMode__Group_1__13 ;
    public final void rule__AppMode__Group_1__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1546:1: ( rule__AppMode__Group_1__12__Impl rule__AppMode__Group_1__13 )
            // InternalArduinoML.g:1547:2: rule__AppMode__Group_1__12__Impl rule__AppMode__Group_1__13
            {
            pushFollow(FOLLOW_4);
            rule__AppMode__Group_1__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AppMode__Group_1__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AppMode__Group_1__12"


    // $ANTLR start "rule__AppMode__Group_1__12__Impl"
    // InternalArduinoML.g:1554:1: rule__AppMode__Group_1__12__Impl : ( ( rule__AppMode__ModesAssignment_1_12 ) ) ;
    public final void rule__AppMode__Group_1__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1558:1: ( ( ( rule__AppMode__ModesAssignment_1_12 ) ) )
            // InternalArduinoML.g:1559:1: ( ( rule__AppMode__ModesAssignment_1_12 ) )
            {
            // InternalArduinoML.g:1559:1: ( ( rule__AppMode__ModesAssignment_1_12 ) )
            // InternalArduinoML.g:1560:2: ( rule__AppMode__ModesAssignment_1_12 )
            {
             before(grammarAccess.getAppModeAccess().getModesAssignment_1_12()); 
            // InternalArduinoML.g:1561:2: ( rule__AppMode__ModesAssignment_1_12 )
            // InternalArduinoML.g:1561:3: rule__AppMode__ModesAssignment_1_12
            {
            pushFollow(FOLLOW_2);
            rule__AppMode__ModesAssignment_1_12();

            state._fsp--;


            }

             after(grammarAccess.getAppModeAccess().getModesAssignment_1_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AppMode__Group_1__12__Impl"


    // $ANTLR start "rule__AppMode__Group_1__13"
    // InternalArduinoML.g:1569:1: rule__AppMode__Group_1__13 : rule__AppMode__Group_1__13__Impl ;
    public final void rule__AppMode__Group_1__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1573:1: ( rule__AppMode__Group_1__13__Impl )
            // InternalArduinoML.g:1574:2: rule__AppMode__Group_1__13__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AppMode__Group_1__13__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AppMode__Group_1__13"


    // $ANTLR start "rule__AppMode__Group_1__13__Impl"
    // InternalArduinoML.g:1580:1: rule__AppMode__Group_1__13__Impl : ( ( rule__AppMode__ModesAssignment_1_13 )* ) ;
    public final void rule__AppMode__Group_1__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1584:1: ( ( ( rule__AppMode__ModesAssignment_1_13 )* ) )
            // InternalArduinoML.g:1585:1: ( ( rule__AppMode__ModesAssignment_1_13 )* )
            {
            // InternalArduinoML.g:1585:1: ( ( rule__AppMode__ModesAssignment_1_13 )* )
            // InternalArduinoML.g:1586:2: ( rule__AppMode__ModesAssignment_1_13 )*
            {
             before(grammarAccess.getAppModeAccess().getModesAssignment_1_13()); 
            // InternalArduinoML.g:1587:2: ( rule__AppMode__ModesAssignment_1_13 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=RULE_STRING && LA16_0<=RULE_ID)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalArduinoML.g:1587:3: rule__AppMode__ModesAssignment_1_13
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__AppMode__ModesAssignment_1_13();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getAppModeAccess().getModesAssignment_1_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AppMode__Group_1__13__Impl"


    // $ANTLR start "rule__Brick__Group__0"
    // InternalArduinoML.g:1596:1: rule__Brick__Group__0 : rule__Brick__Group__0__Impl rule__Brick__Group__1 ;
    public final void rule__Brick__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1600:1: ( rule__Brick__Group__0__Impl rule__Brick__Group__1 )
            // InternalArduinoML.g:1601:2: rule__Brick__Group__0__Impl rule__Brick__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Brick__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Brick__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Brick__Group__0"


    // $ANTLR start "rule__Brick__Group__0__Impl"
    // InternalArduinoML.g:1608:1: rule__Brick__Group__0__Impl : ( ( rule__Brick__Alternatives_0 ) ) ;
    public final void rule__Brick__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1612:1: ( ( ( rule__Brick__Alternatives_0 ) ) )
            // InternalArduinoML.g:1613:1: ( ( rule__Brick__Alternatives_0 ) )
            {
            // InternalArduinoML.g:1613:1: ( ( rule__Brick__Alternatives_0 ) )
            // InternalArduinoML.g:1614:2: ( rule__Brick__Alternatives_0 )
            {
             before(grammarAccess.getBrickAccess().getAlternatives_0()); 
            // InternalArduinoML.g:1615:2: ( rule__Brick__Alternatives_0 )
            // InternalArduinoML.g:1615:3: rule__Brick__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__Brick__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getBrickAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Brick__Group__0__Impl"


    // $ANTLR start "rule__Brick__Group__1"
    // InternalArduinoML.g:1623:1: rule__Brick__Group__1 : rule__Brick__Group__1__Impl rule__Brick__Group__2 ;
    public final void rule__Brick__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1627:1: ( rule__Brick__Group__1__Impl rule__Brick__Group__2 )
            // InternalArduinoML.g:1628:2: rule__Brick__Group__1__Impl rule__Brick__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__Brick__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Brick__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Brick__Group__1"


    // $ANTLR start "rule__Brick__Group__1__Impl"
    // InternalArduinoML.g:1635:1: rule__Brick__Group__1__Impl : ( ( rule__Brick__NameAssignment_1 ) ) ;
    public final void rule__Brick__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1639:1: ( ( ( rule__Brick__NameAssignment_1 ) ) )
            // InternalArduinoML.g:1640:1: ( ( rule__Brick__NameAssignment_1 ) )
            {
            // InternalArduinoML.g:1640:1: ( ( rule__Brick__NameAssignment_1 ) )
            // InternalArduinoML.g:1641:2: ( rule__Brick__NameAssignment_1 )
            {
             before(grammarAccess.getBrickAccess().getNameAssignment_1()); 
            // InternalArduinoML.g:1642:2: ( rule__Brick__NameAssignment_1 )
            // InternalArduinoML.g:1642:3: rule__Brick__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Brick__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getBrickAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Brick__Group__1__Impl"


    // $ANTLR start "rule__Brick__Group__2"
    // InternalArduinoML.g:1650:1: rule__Brick__Group__2 : rule__Brick__Group__2__Impl rule__Brick__Group__3 ;
    public final void rule__Brick__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1654:1: ( rule__Brick__Group__2__Impl rule__Brick__Group__3 )
            // InternalArduinoML.g:1655:2: rule__Brick__Group__2__Impl rule__Brick__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__Brick__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Brick__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Brick__Group__2"


    // $ANTLR start "rule__Brick__Group__2__Impl"
    // InternalArduinoML.g:1662:1: rule__Brick__Group__2__Impl : ( ':' ) ;
    public final void rule__Brick__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1666:1: ( ( ':' ) )
            // InternalArduinoML.g:1667:1: ( ':' )
            {
            // InternalArduinoML.g:1667:1: ( ':' )
            // InternalArduinoML.g:1668:2: ':'
            {
             before(grammarAccess.getBrickAccess().getColonKeyword_2()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getBrickAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Brick__Group__2__Impl"


    // $ANTLR start "rule__Brick__Group__3"
    // InternalArduinoML.g:1677:1: rule__Brick__Group__3 : rule__Brick__Group__3__Impl ;
    public final void rule__Brick__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1681:1: ( rule__Brick__Group__3__Impl )
            // InternalArduinoML.g:1682:2: rule__Brick__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Brick__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Brick__Group__3"


    // $ANTLR start "rule__Brick__Group__3__Impl"
    // InternalArduinoML.g:1688:1: rule__Brick__Group__3__Impl : ( ( rule__Brick__PinAssignment_3 ) ) ;
    public final void rule__Brick__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1692:1: ( ( ( rule__Brick__PinAssignment_3 ) ) )
            // InternalArduinoML.g:1693:1: ( ( rule__Brick__PinAssignment_3 ) )
            {
            // InternalArduinoML.g:1693:1: ( ( rule__Brick__PinAssignment_3 ) )
            // InternalArduinoML.g:1694:2: ( rule__Brick__PinAssignment_3 )
            {
             before(grammarAccess.getBrickAccess().getPinAssignment_3()); 
            // InternalArduinoML.g:1695:2: ( rule__Brick__PinAssignment_3 )
            // InternalArduinoML.g:1695:3: rule__Brick__PinAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Brick__PinAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getBrickAccess().getPinAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Brick__Group__3__Impl"


    // $ANTLR start "rule__Mode__Group__0"
    // InternalArduinoML.g:1704:1: rule__Mode__Group__0 : rule__Mode__Group__0__Impl rule__Mode__Group__1 ;
    public final void rule__Mode__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1708:1: ( rule__Mode__Group__0__Impl rule__Mode__Group__1 )
            // InternalArduinoML.g:1709:2: rule__Mode__Group__0__Impl rule__Mode__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Mode__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mode__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mode__Group__0"


    // $ANTLR start "rule__Mode__Group__0__Impl"
    // InternalArduinoML.g:1716:1: rule__Mode__Group__0__Impl : ( ( rule__Mode__NameAssignment_0 ) ) ;
    public final void rule__Mode__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1720:1: ( ( ( rule__Mode__NameAssignment_0 ) ) )
            // InternalArduinoML.g:1721:1: ( ( rule__Mode__NameAssignment_0 ) )
            {
            // InternalArduinoML.g:1721:1: ( ( rule__Mode__NameAssignment_0 ) )
            // InternalArduinoML.g:1722:2: ( rule__Mode__NameAssignment_0 )
            {
             before(grammarAccess.getModeAccess().getNameAssignment_0()); 
            // InternalArduinoML.g:1723:2: ( rule__Mode__NameAssignment_0 )
            // InternalArduinoML.g:1723:3: rule__Mode__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Mode__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getModeAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mode__Group__0__Impl"


    // $ANTLR start "rule__Mode__Group__1"
    // InternalArduinoML.g:1731:1: rule__Mode__Group__1 : rule__Mode__Group__1__Impl rule__Mode__Group__2 ;
    public final void rule__Mode__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1735:1: ( rule__Mode__Group__1__Impl rule__Mode__Group__2 )
            // InternalArduinoML.g:1736:2: rule__Mode__Group__1__Impl rule__Mode__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Mode__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mode__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mode__Group__1"


    // $ANTLR start "rule__Mode__Group__1__Impl"
    // InternalArduinoML.g:1743:1: rule__Mode__Group__1__Impl : ( 'initial' ) ;
    public final void rule__Mode__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1747:1: ( ( 'initial' ) )
            // InternalArduinoML.g:1748:1: ( 'initial' )
            {
            // InternalArduinoML.g:1748:1: ( 'initial' )
            // InternalArduinoML.g:1749:2: 'initial'
            {
             before(grammarAccess.getModeAccess().getInitialKeyword_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getModeAccess().getInitialKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mode__Group__1__Impl"


    // $ANTLR start "rule__Mode__Group__2"
    // InternalArduinoML.g:1758:1: rule__Mode__Group__2 : rule__Mode__Group__2__Impl rule__Mode__Group__3 ;
    public final void rule__Mode__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1762:1: ( rule__Mode__Group__2__Impl rule__Mode__Group__3 )
            // InternalArduinoML.g:1763:2: rule__Mode__Group__2__Impl rule__Mode__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Mode__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mode__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mode__Group__2"


    // $ANTLR start "rule__Mode__Group__2__Impl"
    // InternalArduinoML.g:1770:1: rule__Mode__Group__2__Impl : ( 'state' ) ;
    public final void rule__Mode__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1774:1: ( ( 'state' ) )
            // InternalArduinoML.g:1775:1: ( 'state' )
            {
            // InternalArduinoML.g:1775:1: ( 'state' )
            // InternalArduinoML.g:1776:2: 'state'
            {
             before(grammarAccess.getModeAccess().getStateKeyword_2()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getModeAccess().getStateKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mode__Group__2__Impl"


    // $ANTLR start "rule__Mode__Group__3"
    // InternalArduinoML.g:1785:1: rule__Mode__Group__3 : rule__Mode__Group__3__Impl rule__Mode__Group__4 ;
    public final void rule__Mode__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1789:1: ( rule__Mode__Group__3__Impl rule__Mode__Group__4 )
            // InternalArduinoML.g:1790:2: rule__Mode__Group__3__Impl rule__Mode__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__Mode__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mode__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mode__Group__3"


    // $ANTLR start "rule__Mode__Group__3__Impl"
    // InternalArduinoML.g:1797:1: rule__Mode__Group__3__Impl : ( ( rule__Mode__InitialAssignment_3 ) ) ;
    public final void rule__Mode__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1801:1: ( ( ( rule__Mode__InitialAssignment_3 ) ) )
            // InternalArduinoML.g:1802:1: ( ( rule__Mode__InitialAssignment_3 ) )
            {
            // InternalArduinoML.g:1802:1: ( ( rule__Mode__InitialAssignment_3 ) )
            // InternalArduinoML.g:1803:2: ( rule__Mode__InitialAssignment_3 )
            {
             before(grammarAccess.getModeAccess().getInitialAssignment_3()); 
            // InternalArduinoML.g:1804:2: ( rule__Mode__InitialAssignment_3 )
            // InternalArduinoML.g:1804:3: rule__Mode__InitialAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Mode__InitialAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getModeAccess().getInitialAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mode__Group__3__Impl"


    // $ANTLR start "rule__Mode__Group__4"
    // InternalArduinoML.g:1812:1: rule__Mode__Group__4 : rule__Mode__Group__4__Impl rule__Mode__Group__5 ;
    public final void rule__Mode__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1816:1: ( rule__Mode__Group__4__Impl rule__Mode__Group__5 )
            // InternalArduinoML.g:1817:2: rule__Mode__Group__4__Impl rule__Mode__Group__5
            {
            pushFollow(FOLLOW_16);
            rule__Mode__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mode__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mode__Group__4"


    // $ANTLR start "rule__Mode__Group__4__Impl"
    // InternalArduinoML.g:1824:1: rule__Mode__Group__4__Impl : ( ':' ) ;
    public final void rule__Mode__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1828:1: ( ( ':' ) )
            // InternalArduinoML.g:1829:1: ( ':' )
            {
            // InternalArduinoML.g:1829:1: ( ':' )
            // InternalArduinoML.g:1830:2: ':'
            {
             before(grammarAccess.getModeAccess().getColonKeyword_4()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getModeAccess().getColonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mode__Group__4__Impl"


    // $ANTLR start "rule__Mode__Group__5"
    // InternalArduinoML.g:1839:1: rule__Mode__Group__5 : rule__Mode__Group__5__Impl rule__Mode__Group__6 ;
    public final void rule__Mode__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1843:1: ( rule__Mode__Group__5__Impl rule__Mode__Group__6 )
            // InternalArduinoML.g:1844:2: rule__Mode__Group__5__Impl rule__Mode__Group__6
            {
            pushFollow(FOLLOW_16);
            rule__Mode__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mode__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mode__Group__5"


    // $ANTLR start "rule__Mode__Group__5__Impl"
    // InternalArduinoML.g:1851:1: rule__Mode__Group__5__Impl : ( ( rule__Mode__Group_5__0 )? ) ;
    public final void rule__Mode__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1855:1: ( ( ( rule__Mode__Group_5__0 )? ) )
            // InternalArduinoML.g:1856:1: ( ( rule__Mode__Group_5__0 )? )
            {
            // InternalArduinoML.g:1856:1: ( ( rule__Mode__Group_5__0 )? )
            // InternalArduinoML.g:1857:2: ( rule__Mode__Group_5__0 )?
            {
             before(grammarAccess.getModeAccess().getGroup_5()); 
            // InternalArduinoML.g:1858:2: ( rule__Mode__Group_5__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==25) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalArduinoML.g:1858:3: rule__Mode__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Mode__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getModeAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mode__Group__5__Impl"


    // $ANTLR start "rule__Mode__Group__6"
    // InternalArduinoML.g:1866:1: rule__Mode__Group__6 : rule__Mode__Group__6__Impl rule__Mode__Group__7 ;
    public final void rule__Mode__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1870:1: ( rule__Mode__Group__6__Impl rule__Mode__Group__7 )
            // InternalArduinoML.g:1871:2: rule__Mode__Group__6__Impl rule__Mode__Group__7
            {
            pushFollow(FOLLOW_7);
            rule__Mode__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mode__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mode__Group__6"


    // $ANTLR start "rule__Mode__Group__6__Impl"
    // InternalArduinoML.g:1878:1: rule__Mode__Group__6__Impl : ( 'states' ) ;
    public final void rule__Mode__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1882:1: ( ( 'states' ) )
            // InternalArduinoML.g:1883:1: ( 'states' )
            {
            // InternalArduinoML.g:1883:1: ( 'states' )
            // InternalArduinoML.g:1884:2: 'states'
            {
             before(grammarAccess.getModeAccess().getStatesKeyword_6()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getModeAccess().getStatesKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mode__Group__6__Impl"


    // $ANTLR start "rule__Mode__Group__7"
    // InternalArduinoML.g:1893:1: rule__Mode__Group__7 : rule__Mode__Group__7__Impl rule__Mode__Group__8 ;
    public final void rule__Mode__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1897:1: ( rule__Mode__Group__7__Impl rule__Mode__Group__8 )
            // InternalArduinoML.g:1898:2: rule__Mode__Group__7__Impl rule__Mode__Group__8
            {
            pushFollow(FOLLOW_4);
            rule__Mode__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mode__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mode__Group__7"


    // $ANTLR start "rule__Mode__Group__7__Impl"
    // InternalArduinoML.g:1905:1: rule__Mode__Group__7__Impl : ( ':' ) ;
    public final void rule__Mode__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1909:1: ( ( ':' ) )
            // InternalArduinoML.g:1910:1: ( ':' )
            {
            // InternalArduinoML.g:1910:1: ( ':' )
            // InternalArduinoML.g:1911:2: ':'
            {
             before(grammarAccess.getModeAccess().getColonKeyword_7()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getModeAccess().getColonKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mode__Group__7__Impl"


    // $ANTLR start "rule__Mode__Group__8"
    // InternalArduinoML.g:1920:1: rule__Mode__Group__8 : rule__Mode__Group__8__Impl rule__Mode__Group__9 ;
    public final void rule__Mode__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1924:1: ( rule__Mode__Group__8__Impl rule__Mode__Group__9 )
            // InternalArduinoML.g:1925:2: rule__Mode__Group__8__Impl rule__Mode__Group__9
            {
            pushFollow(FOLLOW_17);
            rule__Mode__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mode__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mode__Group__8"


    // $ANTLR start "rule__Mode__Group__8__Impl"
    // InternalArduinoML.g:1932:1: rule__Mode__Group__8__Impl : ( ( rule__Mode__StatesAssignment_8 ) ) ;
    public final void rule__Mode__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1936:1: ( ( ( rule__Mode__StatesAssignment_8 ) ) )
            // InternalArduinoML.g:1937:1: ( ( rule__Mode__StatesAssignment_8 ) )
            {
            // InternalArduinoML.g:1937:1: ( ( rule__Mode__StatesAssignment_8 ) )
            // InternalArduinoML.g:1938:2: ( rule__Mode__StatesAssignment_8 )
            {
             before(grammarAccess.getModeAccess().getStatesAssignment_8()); 
            // InternalArduinoML.g:1939:2: ( rule__Mode__StatesAssignment_8 )
            // InternalArduinoML.g:1939:3: rule__Mode__StatesAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__Mode__StatesAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getModeAccess().getStatesAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mode__Group__8__Impl"


    // $ANTLR start "rule__Mode__Group__9"
    // InternalArduinoML.g:1947:1: rule__Mode__Group__9 : rule__Mode__Group__9__Impl rule__Mode__Group__10 ;
    public final void rule__Mode__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1951:1: ( rule__Mode__Group__9__Impl rule__Mode__Group__10 )
            // InternalArduinoML.g:1952:2: rule__Mode__Group__9__Impl rule__Mode__Group__10
            {
            pushFollow(FOLLOW_17);
            rule__Mode__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mode__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mode__Group__9"


    // $ANTLR start "rule__Mode__Group__9__Impl"
    // InternalArduinoML.g:1959:1: rule__Mode__Group__9__Impl : ( ( rule__Mode__StatesAssignment_9 )* ) ;
    public final void rule__Mode__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1963:1: ( ( ( rule__Mode__StatesAssignment_9 )* ) )
            // InternalArduinoML.g:1964:1: ( ( rule__Mode__StatesAssignment_9 )* )
            {
            // InternalArduinoML.g:1964:1: ( ( rule__Mode__StatesAssignment_9 )* )
            // InternalArduinoML.g:1965:2: ( rule__Mode__StatesAssignment_9 )*
            {
             before(grammarAccess.getModeAccess().getStatesAssignment_9()); 
            // InternalArduinoML.g:1966:2: ( rule__Mode__StatesAssignment_9 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=RULE_STRING && LA18_0<=RULE_ID)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalArduinoML.g:1966:3: rule__Mode__StatesAssignment_9
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Mode__StatesAssignment_9();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getModeAccess().getStatesAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mode__Group__9__Impl"


    // $ANTLR start "rule__Mode__Group__10"
    // InternalArduinoML.g:1974:1: rule__Mode__Group__10 : rule__Mode__Group__10__Impl rule__Mode__Group__11 ;
    public final void rule__Mode__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1978:1: ( rule__Mode__Group__10__Impl rule__Mode__Group__11 )
            // InternalArduinoML.g:1979:2: rule__Mode__Group__10__Impl rule__Mode__Group__11
            {
            pushFollow(FOLLOW_7);
            rule__Mode__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mode__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mode__Group__10"


    // $ANTLR start "rule__Mode__Group__10__Impl"
    // InternalArduinoML.g:1986:1: rule__Mode__Group__10__Impl : ( 'transitions' ) ;
    public final void rule__Mode__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1990:1: ( ( 'transitions' ) )
            // InternalArduinoML.g:1991:1: ( 'transitions' )
            {
            // InternalArduinoML.g:1991:1: ( 'transitions' )
            // InternalArduinoML.g:1992:2: 'transitions'
            {
             before(grammarAccess.getModeAccess().getTransitionsKeyword_10()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getModeAccess().getTransitionsKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mode__Group__10__Impl"


    // $ANTLR start "rule__Mode__Group__11"
    // InternalArduinoML.g:2001:1: rule__Mode__Group__11 : rule__Mode__Group__11__Impl rule__Mode__Group__12 ;
    public final void rule__Mode__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2005:1: ( rule__Mode__Group__11__Impl rule__Mode__Group__12 )
            // InternalArduinoML.g:2006:2: rule__Mode__Group__11__Impl rule__Mode__Group__12
            {
            pushFollow(FOLLOW_18);
            rule__Mode__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mode__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mode__Group__11"


    // $ANTLR start "rule__Mode__Group__11__Impl"
    // InternalArduinoML.g:2013:1: rule__Mode__Group__11__Impl : ( ':' ) ;
    public final void rule__Mode__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2017:1: ( ( ':' ) )
            // InternalArduinoML.g:2018:1: ( ':' )
            {
            // InternalArduinoML.g:2018:1: ( ':' )
            // InternalArduinoML.g:2019:2: ':'
            {
             before(grammarAccess.getModeAccess().getColonKeyword_11()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getModeAccess().getColonKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mode__Group__11__Impl"


    // $ANTLR start "rule__Mode__Group__12"
    // InternalArduinoML.g:2028:1: rule__Mode__Group__12 : rule__Mode__Group__12__Impl rule__Mode__Group__13 ;
    public final void rule__Mode__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2032:1: ( rule__Mode__Group__12__Impl rule__Mode__Group__13 )
            // InternalArduinoML.g:2033:2: rule__Mode__Group__12__Impl rule__Mode__Group__13
            {
            pushFollow(FOLLOW_18);
            rule__Mode__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mode__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mode__Group__12"


    // $ANTLR start "rule__Mode__Group__12__Impl"
    // InternalArduinoML.g:2040:1: rule__Mode__Group__12__Impl : ( ( rule__Mode__Transitions_modeAssignment_12 ) ) ;
    public final void rule__Mode__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2044:1: ( ( ( rule__Mode__Transitions_modeAssignment_12 ) ) )
            // InternalArduinoML.g:2045:1: ( ( rule__Mode__Transitions_modeAssignment_12 ) )
            {
            // InternalArduinoML.g:2045:1: ( ( rule__Mode__Transitions_modeAssignment_12 ) )
            // InternalArduinoML.g:2046:2: ( rule__Mode__Transitions_modeAssignment_12 )
            {
             before(grammarAccess.getModeAccess().getTransitions_modeAssignment_12()); 
            // InternalArduinoML.g:2047:2: ( rule__Mode__Transitions_modeAssignment_12 )
            // InternalArduinoML.g:2047:3: rule__Mode__Transitions_modeAssignment_12
            {
            pushFollow(FOLLOW_2);
            rule__Mode__Transitions_modeAssignment_12();

            state._fsp--;


            }

             after(grammarAccess.getModeAccess().getTransitions_modeAssignment_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mode__Group__12__Impl"


    // $ANTLR start "rule__Mode__Group__13"
    // InternalArduinoML.g:2055:1: rule__Mode__Group__13 : rule__Mode__Group__13__Impl ;
    public final void rule__Mode__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2059:1: ( rule__Mode__Group__13__Impl )
            // InternalArduinoML.g:2060:2: rule__Mode__Group__13__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Mode__Group__13__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mode__Group__13"


    // $ANTLR start "rule__Mode__Group__13__Impl"
    // InternalArduinoML.g:2066:1: rule__Mode__Group__13__Impl : ( ( rule__Mode__Transitions_modeAssignment_13 )* ) ;
    public final void rule__Mode__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2070:1: ( ( ( rule__Mode__Transitions_modeAssignment_13 )* ) )
            // InternalArduinoML.g:2071:1: ( ( rule__Mode__Transitions_modeAssignment_13 )* )
            {
            // InternalArduinoML.g:2071:1: ( ( rule__Mode__Transitions_modeAssignment_13 )* )
            // InternalArduinoML.g:2072:2: ( rule__Mode__Transitions_modeAssignment_13 )*
            {
             before(grammarAccess.getModeAccess().getTransitions_modeAssignment_13()); 
            // InternalArduinoML.g:2073:2: ( rule__Mode__Transitions_modeAssignment_13 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==36||LA19_0==39) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalArduinoML.g:2073:3: rule__Mode__Transitions_modeAssignment_13
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__Mode__Transitions_modeAssignment_13();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getModeAccess().getTransitions_modeAssignment_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mode__Group__13__Impl"


    // $ANTLR start "rule__Mode__Group_5__0"
    // InternalArduinoML.g:2082:1: rule__Mode__Group_5__0 : rule__Mode__Group_5__0__Impl rule__Mode__Group_5__1 ;
    public final void rule__Mode__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2086:1: ( rule__Mode__Group_5__0__Impl rule__Mode__Group_5__1 )
            // InternalArduinoML.g:2087:2: rule__Mode__Group_5__0__Impl rule__Mode__Group_5__1
            {
            pushFollow(FOLLOW_7);
            rule__Mode__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mode__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mode__Group_5__0"


    // $ANTLR start "rule__Mode__Group_5__0__Impl"
    // InternalArduinoML.g:2094:1: rule__Mode__Group_5__0__Impl : ( 'bricks' ) ;
    public final void rule__Mode__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2098:1: ( ( 'bricks' ) )
            // InternalArduinoML.g:2099:1: ( 'bricks' )
            {
            // InternalArduinoML.g:2099:1: ( 'bricks' )
            // InternalArduinoML.g:2100:2: 'bricks'
            {
             before(grammarAccess.getModeAccess().getBricksKeyword_5_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getModeAccess().getBricksKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mode__Group_5__0__Impl"


    // $ANTLR start "rule__Mode__Group_5__1"
    // InternalArduinoML.g:2109:1: rule__Mode__Group_5__1 : rule__Mode__Group_5__1__Impl rule__Mode__Group_5__2 ;
    public final void rule__Mode__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2113:1: ( rule__Mode__Group_5__1__Impl rule__Mode__Group_5__2 )
            // InternalArduinoML.g:2114:2: rule__Mode__Group_5__1__Impl rule__Mode__Group_5__2
            {
            pushFollow(FOLLOW_9);
            rule__Mode__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mode__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mode__Group_5__1"


    // $ANTLR start "rule__Mode__Group_5__1__Impl"
    // InternalArduinoML.g:2121:1: rule__Mode__Group_5__1__Impl : ( ':' ) ;
    public final void rule__Mode__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2125:1: ( ( ':' ) )
            // InternalArduinoML.g:2126:1: ( ':' )
            {
            // InternalArduinoML.g:2126:1: ( ':' )
            // InternalArduinoML.g:2127:2: ':'
            {
             before(grammarAccess.getModeAccess().getColonKeyword_5_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getModeAccess().getColonKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mode__Group_5__1__Impl"


    // $ANTLR start "rule__Mode__Group_5__2"
    // InternalArduinoML.g:2136:1: rule__Mode__Group_5__2 : rule__Mode__Group_5__2__Impl rule__Mode__Group_5__3 ;
    public final void rule__Mode__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2140:1: ( rule__Mode__Group_5__2__Impl rule__Mode__Group_5__3 )
            // InternalArduinoML.g:2141:2: rule__Mode__Group_5__2__Impl rule__Mode__Group_5__3
            {
            pushFollow(FOLLOW_9);
            rule__Mode__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mode__Group_5__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mode__Group_5__2"


    // $ANTLR start "rule__Mode__Group_5__2__Impl"
    // InternalArduinoML.g:2148:1: rule__Mode__Group_5__2__Impl : ( ( rule__Mode__BricksAssignment_5_2 ) ) ;
    public final void rule__Mode__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2152:1: ( ( ( rule__Mode__BricksAssignment_5_2 ) ) )
            // InternalArduinoML.g:2153:1: ( ( rule__Mode__BricksAssignment_5_2 ) )
            {
            // InternalArduinoML.g:2153:1: ( ( rule__Mode__BricksAssignment_5_2 ) )
            // InternalArduinoML.g:2154:2: ( rule__Mode__BricksAssignment_5_2 )
            {
             before(grammarAccess.getModeAccess().getBricksAssignment_5_2()); 
            // InternalArduinoML.g:2155:2: ( rule__Mode__BricksAssignment_5_2 )
            // InternalArduinoML.g:2155:3: rule__Mode__BricksAssignment_5_2
            {
            pushFollow(FOLLOW_2);
            rule__Mode__BricksAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getModeAccess().getBricksAssignment_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mode__Group_5__2__Impl"


    // $ANTLR start "rule__Mode__Group_5__3"
    // InternalArduinoML.g:2163:1: rule__Mode__Group_5__3 : rule__Mode__Group_5__3__Impl ;
    public final void rule__Mode__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2167:1: ( rule__Mode__Group_5__3__Impl )
            // InternalArduinoML.g:2168:2: rule__Mode__Group_5__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Mode__Group_5__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mode__Group_5__3"


    // $ANTLR start "rule__Mode__Group_5__3__Impl"
    // InternalArduinoML.g:2174:1: rule__Mode__Group_5__3__Impl : ( ( rule__Mode__BricksAssignment_5_3 )* ) ;
    public final void rule__Mode__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2178:1: ( ( ( rule__Mode__BricksAssignment_5_3 )* ) )
            // InternalArduinoML.g:2179:1: ( ( rule__Mode__BricksAssignment_5_3 )* )
            {
            // InternalArduinoML.g:2179:1: ( ( rule__Mode__BricksAssignment_5_3 )* )
            // InternalArduinoML.g:2180:2: ( rule__Mode__BricksAssignment_5_3 )*
            {
             before(grammarAccess.getModeAccess().getBricksAssignment_5_3()); 
            // InternalArduinoML.g:2181:2: ( rule__Mode__BricksAssignment_5_3 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=30 && LA20_0<=32)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalArduinoML.g:2181:3: rule__Mode__BricksAssignment_5_3
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Mode__BricksAssignment_5_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getModeAccess().getBricksAssignment_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mode__Group_5__3__Impl"


    // $ANTLR start "rule__State__Group__0"
    // InternalArduinoML.g:2190:1: rule__State__Group__0 : rule__State__Group__0__Impl rule__State__Group__1 ;
    public final void rule__State__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2194:1: ( rule__State__Group__0__Impl rule__State__Group__1 )
            // InternalArduinoML.g:2195:2: rule__State__Group__0__Impl rule__State__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__State__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__State__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__0"


    // $ANTLR start "rule__State__Group__0__Impl"
    // InternalArduinoML.g:2202:1: rule__State__Group__0__Impl : ( ( rule__State__NameAssignment_0 ) ) ;
    public final void rule__State__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2206:1: ( ( ( rule__State__NameAssignment_0 ) ) )
            // InternalArduinoML.g:2207:1: ( ( rule__State__NameAssignment_0 ) )
            {
            // InternalArduinoML.g:2207:1: ( ( rule__State__NameAssignment_0 ) )
            // InternalArduinoML.g:2208:2: ( rule__State__NameAssignment_0 )
            {
             before(grammarAccess.getStateAccess().getNameAssignment_0()); 
            // InternalArduinoML.g:2209:2: ( rule__State__NameAssignment_0 )
            // InternalArduinoML.g:2209:3: rule__State__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__State__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getStateAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__0__Impl"


    // $ANTLR start "rule__State__Group__1"
    // InternalArduinoML.g:2217:1: rule__State__Group__1 : rule__State__Group__1__Impl rule__State__Group__2 ;
    public final void rule__State__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2221:1: ( rule__State__Group__1__Impl rule__State__Group__2 )
            // InternalArduinoML.g:2222:2: rule__State__Group__1__Impl rule__State__Group__2
            {
            pushFollow(FOLLOW_20);
            rule__State__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__State__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__1"


    // $ANTLR start "rule__State__Group__1__Impl"
    // InternalArduinoML.g:2229:1: rule__State__Group__1__Impl : ( ':' ) ;
    public final void rule__State__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2233:1: ( ( ':' ) )
            // InternalArduinoML.g:2234:1: ( ':' )
            {
            // InternalArduinoML.g:2234:1: ( ':' )
            // InternalArduinoML.g:2235:2: ':'
            {
             before(grammarAccess.getStateAccess().getColonKeyword_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getStateAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__1__Impl"


    // $ANTLR start "rule__State__Group__2"
    // InternalArduinoML.g:2244:1: rule__State__Group__2 : rule__State__Group__2__Impl rule__State__Group__3 ;
    public final void rule__State__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2248:1: ( rule__State__Group__2__Impl rule__State__Group__3 )
            // InternalArduinoML.g:2249:2: rule__State__Group__2__Impl rule__State__Group__3
            {
            pushFollow(FOLLOW_21);
            rule__State__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__State__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__2"


    // $ANTLR start "rule__State__Group__2__Impl"
    // InternalArduinoML.g:2256:1: rule__State__Group__2__Impl : ( ( rule__State__ActionsAssignment_2 ) ) ;
    public final void rule__State__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2260:1: ( ( ( rule__State__ActionsAssignment_2 ) ) )
            // InternalArduinoML.g:2261:1: ( ( rule__State__ActionsAssignment_2 ) )
            {
            // InternalArduinoML.g:2261:1: ( ( rule__State__ActionsAssignment_2 ) )
            // InternalArduinoML.g:2262:2: ( rule__State__ActionsAssignment_2 )
            {
             before(grammarAccess.getStateAccess().getActionsAssignment_2()); 
            // InternalArduinoML.g:2263:2: ( rule__State__ActionsAssignment_2 )
            // InternalArduinoML.g:2263:3: rule__State__ActionsAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__State__ActionsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getStateAccess().getActionsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__2__Impl"


    // $ANTLR start "rule__State__Group__3"
    // InternalArduinoML.g:2271:1: rule__State__Group__3 : rule__State__Group__3__Impl rule__State__Group__4 ;
    public final void rule__State__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2275:1: ( rule__State__Group__3__Impl rule__State__Group__4 )
            // InternalArduinoML.g:2276:2: rule__State__Group__3__Impl rule__State__Group__4
            {
            pushFollow(FOLLOW_21);
            rule__State__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__State__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__3"


    // $ANTLR start "rule__State__Group__3__Impl"
    // InternalArduinoML.g:2283:1: rule__State__Group__3__Impl : ( ( rule__State__ActionsAssignment_3 )* ) ;
    public final void rule__State__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2287:1: ( ( ( rule__State__ActionsAssignment_3 )* ) )
            // InternalArduinoML.g:2288:1: ( ( rule__State__ActionsAssignment_3 )* )
            {
            // InternalArduinoML.g:2288:1: ( ( rule__State__ActionsAssignment_3 )* )
            // InternalArduinoML.g:2289:2: ( rule__State__ActionsAssignment_3 )*
            {
             before(grammarAccess.getStateAccess().getActionsAssignment_3()); 
            // InternalArduinoML.g:2290:2: ( rule__State__ActionsAssignment_3 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==33) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalArduinoML.g:2290:3: rule__State__ActionsAssignment_3
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__State__ActionsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getStateAccess().getActionsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__3__Impl"


    // $ANTLR start "rule__State__Group__4"
    // InternalArduinoML.g:2298:1: rule__State__Group__4 : rule__State__Group__4__Impl rule__State__Group__5 ;
    public final void rule__State__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2302:1: ( rule__State__Group__4__Impl rule__State__Group__5 )
            // InternalArduinoML.g:2303:2: rule__State__Group__4__Impl rule__State__Group__5
            {
            pushFollow(FOLLOW_21);
            rule__State__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__State__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__4"


    // $ANTLR start "rule__State__Group__4__Impl"
    // InternalArduinoML.g:2310:1: rule__State__Group__4__Impl : ( ( rule__State__Transitions_stateAssignment_4 ) ) ;
    public final void rule__State__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2314:1: ( ( ( rule__State__Transitions_stateAssignment_4 ) ) )
            // InternalArduinoML.g:2315:1: ( ( rule__State__Transitions_stateAssignment_4 ) )
            {
            // InternalArduinoML.g:2315:1: ( ( rule__State__Transitions_stateAssignment_4 ) )
            // InternalArduinoML.g:2316:2: ( rule__State__Transitions_stateAssignment_4 )
            {
             before(grammarAccess.getStateAccess().getTransitions_stateAssignment_4()); 
            // InternalArduinoML.g:2317:2: ( rule__State__Transitions_stateAssignment_4 )
            // InternalArduinoML.g:2317:3: rule__State__Transitions_stateAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__State__Transitions_stateAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getStateAccess().getTransitions_stateAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__4__Impl"


    // $ANTLR start "rule__State__Group__5"
    // InternalArduinoML.g:2325:1: rule__State__Group__5 : rule__State__Group__5__Impl ;
    public final void rule__State__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2329:1: ( rule__State__Group__5__Impl )
            // InternalArduinoML.g:2330:2: rule__State__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__State__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__5"


    // $ANTLR start "rule__State__Group__5__Impl"
    // InternalArduinoML.g:2336:1: rule__State__Group__5__Impl : ( ( rule__State__Transitions_stateAssignment_5 )* ) ;
    public final void rule__State__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2340:1: ( ( ( rule__State__Transitions_stateAssignment_5 )* ) )
            // InternalArduinoML.g:2341:1: ( ( rule__State__Transitions_stateAssignment_5 )* )
            {
            // InternalArduinoML.g:2341:1: ( ( rule__State__Transitions_stateAssignment_5 )* )
            // InternalArduinoML.g:2342:2: ( rule__State__Transitions_stateAssignment_5 )*
            {
             before(grammarAccess.getStateAccess().getTransitions_stateAssignment_5()); 
            // InternalArduinoML.g:2343:2: ( rule__State__Transitions_stateAssignment_5 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==36||LA22_0==39) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalArduinoML.g:2343:3: rule__State__Transitions_stateAssignment_5
            	    {
            	    pushFollow(FOLLOW_23);
            	    rule__State__Transitions_stateAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getStateAccess().getTransitions_stateAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__5__Impl"


    // $ANTLR start "rule__Actuator__Group__0"
    // InternalArduinoML.g:2352:1: rule__Actuator__Group__0 : rule__Actuator__Group__0__Impl rule__Actuator__Group__1 ;
    public final void rule__Actuator__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2356:1: ( rule__Actuator__Group__0__Impl rule__Actuator__Group__1 )
            // InternalArduinoML.g:2357:2: rule__Actuator__Group__0__Impl rule__Actuator__Group__1
            {
            pushFollow(FOLLOW_24);
            rule__Actuator__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Actuator__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actuator__Group__0"


    // $ANTLR start "rule__Actuator__Group__0__Impl"
    // InternalArduinoML.g:2364:1: rule__Actuator__Group__0__Impl : ( () ) ;
    public final void rule__Actuator__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2368:1: ( ( () ) )
            // InternalArduinoML.g:2369:1: ( () )
            {
            // InternalArduinoML.g:2369:1: ( () )
            // InternalArduinoML.g:2370:2: ()
            {
             before(grammarAccess.getActuatorAccess().getActuatorAction_0()); 
            // InternalArduinoML.g:2371:2: ()
            // InternalArduinoML.g:2371:3: 
            {
            }

             after(grammarAccess.getActuatorAccess().getActuatorAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actuator__Group__0__Impl"


    // $ANTLR start "rule__Actuator__Group__1"
    // InternalArduinoML.g:2379:1: rule__Actuator__Group__1 : rule__Actuator__Group__1__Impl ;
    public final void rule__Actuator__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2383:1: ( rule__Actuator__Group__1__Impl )
            // InternalArduinoML.g:2384:2: rule__Actuator__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Actuator__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actuator__Group__1"


    // $ANTLR start "rule__Actuator__Group__1__Impl"
    // InternalArduinoML.g:2390:1: rule__Actuator__Group__1__Impl : ( 'Actuator' ) ;
    public final void rule__Actuator__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2394:1: ( ( 'Actuator' ) )
            // InternalArduinoML.g:2395:1: ( 'Actuator' )
            {
            // InternalArduinoML.g:2395:1: ( 'Actuator' )
            // InternalArduinoML.g:2396:2: 'Actuator'
            {
             before(grammarAccess.getActuatorAccess().getActuatorKeyword_1()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getActuatorAccess().getActuatorKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actuator__Group__1__Impl"


    // $ANTLR start "rule__Digital__Group__0"
    // InternalArduinoML.g:2406:1: rule__Digital__Group__0 : rule__Digital__Group__0__Impl rule__Digital__Group__1 ;
    public final void rule__Digital__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2410:1: ( rule__Digital__Group__0__Impl rule__Digital__Group__1 )
            // InternalArduinoML.g:2411:2: rule__Digital__Group__0__Impl rule__Digital__Group__1
            {
            pushFollow(FOLLOW_25);
            rule__Digital__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Digital__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Digital__Group__0"


    // $ANTLR start "rule__Digital__Group__0__Impl"
    // InternalArduinoML.g:2418:1: rule__Digital__Group__0__Impl : ( () ) ;
    public final void rule__Digital__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2422:1: ( ( () ) )
            // InternalArduinoML.g:2423:1: ( () )
            {
            // InternalArduinoML.g:2423:1: ( () )
            // InternalArduinoML.g:2424:2: ()
            {
             before(grammarAccess.getDigitalAccess().getDigitalAction_0()); 
            // InternalArduinoML.g:2425:2: ()
            // InternalArduinoML.g:2425:3: 
            {
            }

             after(grammarAccess.getDigitalAccess().getDigitalAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Digital__Group__0__Impl"


    // $ANTLR start "rule__Digital__Group__1"
    // InternalArduinoML.g:2433:1: rule__Digital__Group__1 : rule__Digital__Group__1__Impl ;
    public final void rule__Digital__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2437:1: ( rule__Digital__Group__1__Impl )
            // InternalArduinoML.g:2438:2: rule__Digital__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Digital__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Digital__Group__1"


    // $ANTLR start "rule__Digital__Group__1__Impl"
    // InternalArduinoML.g:2444:1: rule__Digital__Group__1__Impl : ( 'Digital' ) ;
    public final void rule__Digital__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2448:1: ( ( 'Digital' ) )
            // InternalArduinoML.g:2449:1: ( 'Digital' )
            {
            // InternalArduinoML.g:2449:1: ( 'Digital' )
            // InternalArduinoML.g:2450:2: 'Digital'
            {
             before(grammarAccess.getDigitalAccess().getDigitalKeyword_1()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getDigitalAccess().getDigitalKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Digital__Group__1__Impl"


    // $ANTLR start "rule__Analog__Group__0"
    // InternalArduinoML.g:2460:1: rule__Analog__Group__0 : rule__Analog__Group__0__Impl rule__Analog__Group__1 ;
    public final void rule__Analog__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2464:1: ( rule__Analog__Group__0__Impl rule__Analog__Group__1 )
            // InternalArduinoML.g:2465:2: rule__Analog__Group__0__Impl rule__Analog__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Analog__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Analog__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Analog__Group__0"


    // $ANTLR start "rule__Analog__Group__0__Impl"
    // InternalArduinoML.g:2472:1: rule__Analog__Group__0__Impl : ( () ) ;
    public final void rule__Analog__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2476:1: ( ( () ) )
            // InternalArduinoML.g:2477:1: ( () )
            {
            // InternalArduinoML.g:2477:1: ( () )
            // InternalArduinoML.g:2478:2: ()
            {
             before(grammarAccess.getAnalogAccess().getAnalogAction_0()); 
            // InternalArduinoML.g:2479:2: ()
            // InternalArduinoML.g:2479:3: 
            {
            }

             after(grammarAccess.getAnalogAccess().getAnalogAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Analog__Group__0__Impl"


    // $ANTLR start "rule__Analog__Group__1"
    // InternalArduinoML.g:2487:1: rule__Analog__Group__1 : rule__Analog__Group__1__Impl ;
    public final void rule__Analog__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2491:1: ( rule__Analog__Group__1__Impl )
            // InternalArduinoML.g:2492:2: rule__Analog__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Analog__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Analog__Group__1"


    // $ANTLR start "rule__Analog__Group__1__Impl"
    // InternalArduinoML.g:2498:1: rule__Analog__Group__1__Impl : ( 'Analog' ) ;
    public final void rule__Analog__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2502:1: ( ( 'Analog' ) )
            // InternalArduinoML.g:2503:1: ( 'Analog' )
            {
            // InternalArduinoML.g:2503:1: ( 'Analog' )
            // InternalArduinoML.g:2504:2: 'Analog'
            {
             before(grammarAccess.getAnalogAccess().getAnalogKeyword_1()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getAnalogAccess().getAnalogKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Analog__Group__1__Impl"


    // $ANTLR start "rule__Action__Group__0"
    // InternalArduinoML.g:2514:1: rule__Action__Group__0 : rule__Action__Group__0__Impl rule__Action__Group__1 ;
    public final void rule__Action__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2518:1: ( rule__Action__Group__0__Impl rule__Action__Group__1 )
            // InternalArduinoML.g:2519:2: rule__Action__Group__0__Impl rule__Action__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Action__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Action__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__0"


    // $ANTLR start "rule__Action__Group__0__Impl"
    // InternalArduinoML.g:2526:1: rule__Action__Group__0__Impl : ( 'change' ) ;
    public final void rule__Action__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2530:1: ( ( 'change' ) )
            // InternalArduinoML.g:2531:1: ( 'change' )
            {
            // InternalArduinoML.g:2531:1: ( 'change' )
            // InternalArduinoML.g:2532:2: 'change'
            {
             before(grammarAccess.getActionAccess().getChangeKeyword_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getActionAccess().getChangeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__0__Impl"


    // $ANTLR start "rule__Action__Group__1"
    // InternalArduinoML.g:2541:1: rule__Action__Group__1 : rule__Action__Group__1__Impl rule__Action__Group__2 ;
    public final void rule__Action__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2545:1: ( rule__Action__Group__1__Impl rule__Action__Group__2 )
            // InternalArduinoML.g:2546:2: rule__Action__Group__1__Impl rule__Action__Group__2
            {
            pushFollow(FOLLOW_26);
            rule__Action__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Action__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__1"


    // $ANTLR start "rule__Action__Group__1__Impl"
    // InternalArduinoML.g:2553:1: rule__Action__Group__1__Impl : ( ( rule__Action__ActuatorAssignment_1 ) ) ;
    public final void rule__Action__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2557:1: ( ( ( rule__Action__ActuatorAssignment_1 ) ) )
            // InternalArduinoML.g:2558:1: ( ( rule__Action__ActuatorAssignment_1 ) )
            {
            // InternalArduinoML.g:2558:1: ( ( rule__Action__ActuatorAssignment_1 ) )
            // InternalArduinoML.g:2559:2: ( rule__Action__ActuatorAssignment_1 )
            {
             before(grammarAccess.getActionAccess().getActuatorAssignment_1()); 
            // InternalArduinoML.g:2560:2: ( rule__Action__ActuatorAssignment_1 )
            // InternalArduinoML.g:2560:3: rule__Action__ActuatorAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Action__ActuatorAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getActionAccess().getActuatorAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__1__Impl"


    // $ANTLR start "rule__Action__Group__2"
    // InternalArduinoML.g:2568:1: rule__Action__Group__2 : rule__Action__Group__2__Impl rule__Action__Group__3 ;
    public final void rule__Action__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2572:1: ( rule__Action__Group__2__Impl rule__Action__Group__3 )
            // InternalArduinoML.g:2573:2: rule__Action__Group__2__Impl rule__Action__Group__3
            {
            pushFollow(FOLLOW_27);
            rule__Action__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Action__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__2"


    // $ANTLR start "rule__Action__Group__2__Impl"
    // InternalArduinoML.g:2580:1: rule__Action__Group__2__Impl : ( 'to' ) ;
    public final void rule__Action__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2584:1: ( ( 'to' ) )
            // InternalArduinoML.g:2585:1: ( 'to' )
            {
            // InternalArduinoML.g:2585:1: ( 'to' )
            // InternalArduinoML.g:2586:2: 'to'
            {
             before(grammarAccess.getActionAccess().getToKeyword_2()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getActionAccess().getToKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__2__Impl"


    // $ANTLR start "rule__Action__Group__3"
    // InternalArduinoML.g:2595:1: rule__Action__Group__3 : rule__Action__Group__3__Impl ;
    public final void rule__Action__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2599:1: ( rule__Action__Group__3__Impl )
            // InternalArduinoML.g:2600:2: rule__Action__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Action__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__3"


    // $ANTLR start "rule__Action__Group__3__Impl"
    // InternalArduinoML.g:2606:1: rule__Action__Group__3__Impl : ( ( rule__Action__ValueAssignment_3 ) ) ;
    public final void rule__Action__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2610:1: ( ( ( rule__Action__ValueAssignment_3 ) ) )
            // InternalArduinoML.g:2611:1: ( ( rule__Action__ValueAssignment_3 ) )
            {
            // InternalArduinoML.g:2611:1: ( ( rule__Action__ValueAssignment_3 ) )
            // InternalArduinoML.g:2612:2: ( rule__Action__ValueAssignment_3 )
            {
             before(grammarAccess.getActionAccess().getValueAssignment_3()); 
            // InternalArduinoML.g:2613:2: ( rule__Action__ValueAssignment_3 )
            // InternalArduinoML.g:2613:3: rule__Action__ValueAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Action__ValueAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getActionAccess().getValueAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__3__Impl"


    // $ANTLR start "rule__TransitionState__Group__0"
    // InternalArduinoML.g:2622:1: rule__TransitionState__Group__0 : rule__TransitionState__Group__0__Impl rule__TransitionState__Group__1 ;
    public final void rule__TransitionState__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2626:1: ( rule__TransitionState__Group__0__Impl rule__TransitionState__Group__1 )
            // InternalArduinoML.g:2627:2: rule__TransitionState__Group__0__Impl rule__TransitionState__Group__1
            {
            pushFollow(FOLLOW_28);
            rule__TransitionState__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TransitionState__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionState__Group__0"


    // $ANTLR start "rule__TransitionState__Group__0__Impl"
    // InternalArduinoML.g:2634:1: rule__TransitionState__Group__0__Impl : ( ( rule__TransitionState__Alternatives_0 ) ) ;
    public final void rule__TransitionState__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2638:1: ( ( ( rule__TransitionState__Alternatives_0 ) ) )
            // InternalArduinoML.g:2639:1: ( ( rule__TransitionState__Alternatives_0 ) )
            {
            // InternalArduinoML.g:2639:1: ( ( rule__TransitionState__Alternatives_0 ) )
            // InternalArduinoML.g:2640:2: ( rule__TransitionState__Alternatives_0 )
            {
             before(grammarAccess.getTransitionStateAccess().getAlternatives_0()); 
            // InternalArduinoML.g:2641:2: ( rule__TransitionState__Alternatives_0 )
            // InternalArduinoML.g:2641:3: rule__TransitionState__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__TransitionState__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getTransitionStateAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionState__Group__0__Impl"


    // $ANTLR start "rule__TransitionState__Group__1"
    // InternalArduinoML.g:2649:1: rule__TransitionState__Group__1 : rule__TransitionState__Group__1__Impl rule__TransitionState__Group__2 ;
    public final void rule__TransitionState__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2653:1: ( rule__TransitionState__Group__1__Impl rule__TransitionState__Group__2 )
            // InternalArduinoML.g:2654:2: rule__TransitionState__Group__1__Impl rule__TransitionState__Group__2
            {
            pushFollow(FOLLOW_26);
            rule__TransitionState__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TransitionState__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionState__Group__1"


    // $ANTLR start "rule__TransitionState__Group__1__Impl"
    // InternalArduinoML.g:2661:1: rule__TransitionState__Group__1__Impl : ( 'go' ) ;
    public final void rule__TransitionState__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2665:1: ( ( 'go' ) )
            // InternalArduinoML.g:2666:1: ( 'go' )
            {
            // InternalArduinoML.g:2666:1: ( 'go' )
            // InternalArduinoML.g:2667:2: 'go'
            {
             before(grammarAccess.getTransitionStateAccess().getGoKeyword_1()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getTransitionStateAccess().getGoKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionState__Group__1__Impl"


    // $ANTLR start "rule__TransitionState__Group__2"
    // InternalArduinoML.g:2676:1: rule__TransitionState__Group__2 : rule__TransitionState__Group__2__Impl rule__TransitionState__Group__3 ;
    public final void rule__TransitionState__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2680:1: ( rule__TransitionState__Group__2__Impl rule__TransitionState__Group__3 )
            // InternalArduinoML.g:2681:2: rule__TransitionState__Group__2__Impl rule__TransitionState__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__TransitionState__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TransitionState__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionState__Group__2"


    // $ANTLR start "rule__TransitionState__Group__2__Impl"
    // InternalArduinoML.g:2688:1: rule__TransitionState__Group__2__Impl : ( 'to' ) ;
    public final void rule__TransitionState__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2692:1: ( ( 'to' ) )
            // InternalArduinoML.g:2693:1: ( 'to' )
            {
            // InternalArduinoML.g:2693:1: ( 'to' )
            // InternalArduinoML.g:2694:2: 'to'
            {
             before(grammarAccess.getTransitionStateAccess().getToKeyword_2()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getTransitionStateAccess().getToKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionState__Group__2__Impl"


    // $ANTLR start "rule__TransitionState__Group__3"
    // InternalArduinoML.g:2703:1: rule__TransitionState__Group__3 : rule__TransitionState__Group__3__Impl rule__TransitionState__Group__4 ;
    public final void rule__TransitionState__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2707:1: ( rule__TransitionState__Group__3__Impl rule__TransitionState__Group__4 )
            // InternalArduinoML.g:2708:2: rule__TransitionState__Group__3__Impl rule__TransitionState__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__TransitionState__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TransitionState__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionState__Group__3"


    // $ANTLR start "rule__TransitionState__Group__3__Impl"
    // InternalArduinoML.g:2715:1: rule__TransitionState__Group__3__Impl : ( 'state' ) ;
    public final void rule__TransitionState__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2719:1: ( ( 'state' ) )
            // InternalArduinoML.g:2720:1: ( 'state' )
            {
            // InternalArduinoML.g:2720:1: ( 'state' )
            // InternalArduinoML.g:2721:2: 'state'
            {
             before(grammarAccess.getTransitionStateAccess().getStateKeyword_3()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getTransitionStateAccess().getStateKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionState__Group__3__Impl"


    // $ANTLR start "rule__TransitionState__Group__4"
    // InternalArduinoML.g:2730:1: rule__TransitionState__Group__4 : rule__TransitionState__Group__4__Impl ;
    public final void rule__TransitionState__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2734:1: ( rule__TransitionState__Group__4__Impl )
            // InternalArduinoML.g:2735:2: rule__TransitionState__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TransitionState__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionState__Group__4"


    // $ANTLR start "rule__TransitionState__Group__4__Impl"
    // InternalArduinoML.g:2741:1: rule__TransitionState__Group__4__Impl : ( ( rule__TransitionState__Next_stateAssignment_4 ) ) ;
    public final void rule__TransitionState__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2745:1: ( ( ( rule__TransitionState__Next_stateAssignment_4 ) ) )
            // InternalArduinoML.g:2746:1: ( ( rule__TransitionState__Next_stateAssignment_4 ) )
            {
            // InternalArduinoML.g:2746:1: ( ( rule__TransitionState__Next_stateAssignment_4 ) )
            // InternalArduinoML.g:2747:2: ( rule__TransitionState__Next_stateAssignment_4 )
            {
             before(grammarAccess.getTransitionStateAccess().getNext_stateAssignment_4()); 
            // InternalArduinoML.g:2748:2: ( rule__TransitionState__Next_stateAssignment_4 )
            // InternalArduinoML.g:2748:3: rule__TransitionState__Next_stateAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__TransitionState__Next_stateAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getTransitionStateAccess().getNext_stateAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionState__Group__4__Impl"


    // $ANTLR start "rule__TransitionState__Group_0_0__0"
    // InternalArduinoML.g:2757:1: rule__TransitionState__Group_0_0__0 : rule__TransitionState__Group_0_0__0__Impl rule__TransitionState__Group_0_0__1 ;
    public final void rule__TransitionState__Group_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2761:1: ( rule__TransitionState__Group_0_0__0__Impl rule__TransitionState__Group_0_0__1 )
            // InternalArduinoML.g:2762:2: rule__TransitionState__Group_0_0__0__Impl rule__TransitionState__Group_0_0__1
            {
            pushFollow(FOLLOW_4);
            rule__TransitionState__Group_0_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TransitionState__Group_0_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionState__Group_0_0__0"


    // $ANTLR start "rule__TransitionState__Group_0_0__0__Impl"
    // InternalArduinoML.g:2769:1: rule__TransitionState__Group_0_0__0__Impl : ( 'when' ) ;
    public final void rule__TransitionState__Group_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2773:1: ( ( 'when' ) )
            // InternalArduinoML.g:2774:1: ( 'when' )
            {
            // InternalArduinoML.g:2774:1: ( 'when' )
            // InternalArduinoML.g:2775:2: 'when'
            {
             before(grammarAccess.getTransitionStateAccess().getWhenKeyword_0_0_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getTransitionStateAccess().getWhenKeyword_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionState__Group_0_0__0__Impl"


    // $ANTLR start "rule__TransitionState__Group_0_0__1"
    // InternalArduinoML.g:2784:1: rule__TransitionState__Group_0_0__1 : rule__TransitionState__Group_0_0__1__Impl rule__TransitionState__Group_0_0__2 ;
    public final void rule__TransitionState__Group_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2788:1: ( rule__TransitionState__Group_0_0__1__Impl rule__TransitionState__Group_0_0__2 )
            // InternalArduinoML.g:2789:2: rule__TransitionState__Group_0_0__1__Impl rule__TransitionState__Group_0_0__2
            {
            pushFollow(FOLLOW_29);
            rule__TransitionState__Group_0_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TransitionState__Group_0_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionState__Group_0_0__1"


    // $ANTLR start "rule__TransitionState__Group_0_0__1__Impl"
    // InternalArduinoML.g:2796:1: rule__TransitionState__Group_0_0__1__Impl : ( ( rule__TransitionState__Alternatives_0_0_1 ) ) ;
    public final void rule__TransitionState__Group_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2800:1: ( ( ( rule__TransitionState__Alternatives_0_0_1 ) ) )
            // InternalArduinoML.g:2801:1: ( ( rule__TransitionState__Alternatives_0_0_1 ) )
            {
            // InternalArduinoML.g:2801:1: ( ( rule__TransitionState__Alternatives_0_0_1 ) )
            // InternalArduinoML.g:2802:2: ( rule__TransitionState__Alternatives_0_0_1 )
            {
             before(grammarAccess.getTransitionStateAccess().getAlternatives_0_0_1()); 
            // InternalArduinoML.g:2803:2: ( rule__TransitionState__Alternatives_0_0_1 )
            // InternalArduinoML.g:2803:3: rule__TransitionState__Alternatives_0_0_1
            {
            pushFollow(FOLLOW_2);
            rule__TransitionState__Alternatives_0_0_1();

            state._fsp--;


            }

             after(grammarAccess.getTransitionStateAccess().getAlternatives_0_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionState__Group_0_0__1__Impl"


    // $ANTLR start "rule__TransitionState__Group_0_0__2"
    // InternalArduinoML.g:2811:1: rule__TransitionState__Group_0_0__2 : rule__TransitionState__Group_0_0__2__Impl rule__TransitionState__Group_0_0__3 ;
    public final void rule__TransitionState__Group_0_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2815:1: ( rule__TransitionState__Group_0_0__2__Impl rule__TransitionState__Group_0_0__3 )
            // InternalArduinoML.g:2816:2: rule__TransitionState__Group_0_0__2__Impl rule__TransitionState__Group_0_0__3
            {
            pushFollow(FOLLOW_29);
            rule__TransitionState__Group_0_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TransitionState__Group_0_0__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionState__Group_0_0__2"


    // $ANTLR start "rule__TransitionState__Group_0_0__2__Impl"
    // InternalArduinoML.g:2823:1: rule__TransitionState__Group_0_0__2__Impl : ( ( rule__TransitionState__Group_0_0_2__0 )* ) ;
    public final void rule__TransitionState__Group_0_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2827:1: ( ( ( rule__TransitionState__Group_0_0_2__0 )* ) )
            // InternalArduinoML.g:2828:1: ( ( rule__TransitionState__Group_0_0_2__0 )* )
            {
            // InternalArduinoML.g:2828:1: ( ( rule__TransitionState__Group_0_0_2__0 )* )
            // InternalArduinoML.g:2829:2: ( rule__TransitionState__Group_0_0_2__0 )*
            {
             before(grammarAccess.getTransitionStateAccess().getGroup_0_0_2()); 
            // InternalArduinoML.g:2830:2: ( rule__TransitionState__Group_0_0_2__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==38) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalArduinoML.g:2830:3: rule__TransitionState__Group_0_0_2__0
            	    {
            	    pushFollow(FOLLOW_30);
            	    rule__TransitionState__Group_0_0_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getTransitionStateAccess().getGroup_0_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionState__Group_0_0__2__Impl"


    // $ANTLR start "rule__TransitionState__Group_0_0__3"
    // InternalArduinoML.g:2838:1: rule__TransitionState__Group_0_0__3 : rule__TransitionState__Group_0_0__3__Impl ;
    public final void rule__TransitionState__Group_0_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2842:1: ( rule__TransitionState__Group_0_0__3__Impl )
            // InternalArduinoML.g:2843:2: rule__TransitionState__Group_0_0__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TransitionState__Group_0_0__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionState__Group_0_0__3"


    // $ANTLR start "rule__TransitionState__Group_0_0__3__Impl"
    // InternalArduinoML.g:2849:1: rule__TransitionState__Group_0_0__3__Impl : ( ( rule__TransitionState__Group_0_0_3__0 )? ) ;
    public final void rule__TransitionState__Group_0_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2853:1: ( ( ( rule__TransitionState__Group_0_0_3__0 )? ) )
            // InternalArduinoML.g:2854:1: ( ( rule__TransitionState__Group_0_0_3__0 )? )
            {
            // InternalArduinoML.g:2854:1: ( ( rule__TransitionState__Group_0_0_3__0 )? )
            // InternalArduinoML.g:2855:2: ( rule__TransitionState__Group_0_0_3__0 )?
            {
             before(grammarAccess.getTransitionStateAccess().getGroup_0_0_3()); 
            // InternalArduinoML.g:2856:2: ( rule__TransitionState__Group_0_0_3__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==39) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalArduinoML.g:2856:3: rule__TransitionState__Group_0_0_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TransitionState__Group_0_0_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTransitionStateAccess().getGroup_0_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionState__Group_0_0__3__Impl"


    // $ANTLR start "rule__TransitionState__Group_0_0_1_0__0"
    // InternalArduinoML.g:2865:1: rule__TransitionState__Group_0_0_1_0__0 : rule__TransitionState__Group_0_0_1_0__0__Impl rule__TransitionState__Group_0_0_1_0__1 ;
    public final void rule__TransitionState__Group_0_0_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2869:1: ( rule__TransitionState__Group_0_0_1_0__0__Impl rule__TransitionState__Group_0_0_1_0__1 )
            // InternalArduinoML.g:2870:2: rule__TransitionState__Group_0_0_1_0__0__Impl rule__TransitionState__Group_0_0_1_0__1
            {
            pushFollow(FOLLOW_31);
            rule__TransitionState__Group_0_0_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TransitionState__Group_0_0_1_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionState__Group_0_0_1_0__0"


    // $ANTLR start "rule__TransitionState__Group_0_0_1_0__0__Impl"
    // InternalArduinoML.g:2877:1: rule__TransitionState__Group_0_0_1_0__0__Impl : ( ( rule__TransitionState__DigitalsAssignment_0_0_1_0_0 ) ) ;
    public final void rule__TransitionState__Group_0_0_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2881:1: ( ( ( rule__TransitionState__DigitalsAssignment_0_0_1_0_0 ) ) )
            // InternalArduinoML.g:2882:1: ( ( rule__TransitionState__DigitalsAssignment_0_0_1_0_0 ) )
            {
            // InternalArduinoML.g:2882:1: ( ( rule__TransitionState__DigitalsAssignment_0_0_1_0_0 ) )
            // InternalArduinoML.g:2883:2: ( rule__TransitionState__DigitalsAssignment_0_0_1_0_0 )
            {
             before(grammarAccess.getTransitionStateAccess().getDigitalsAssignment_0_0_1_0_0()); 
            // InternalArduinoML.g:2884:2: ( rule__TransitionState__DigitalsAssignment_0_0_1_0_0 )
            // InternalArduinoML.g:2884:3: rule__TransitionState__DigitalsAssignment_0_0_1_0_0
            {
            pushFollow(FOLLOW_2);
            rule__TransitionState__DigitalsAssignment_0_0_1_0_0();

            state._fsp--;


            }

             after(grammarAccess.getTransitionStateAccess().getDigitalsAssignment_0_0_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionState__Group_0_0_1_0__0__Impl"


    // $ANTLR start "rule__TransitionState__Group_0_0_1_0__1"
    // InternalArduinoML.g:2892:1: rule__TransitionState__Group_0_0_1_0__1 : rule__TransitionState__Group_0_0_1_0__1__Impl rule__TransitionState__Group_0_0_1_0__2 ;
    public final void rule__TransitionState__Group_0_0_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2896:1: ( rule__TransitionState__Group_0_0_1_0__1__Impl rule__TransitionState__Group_0_0_1_0__2 )
            // InternalArduinoML.g:2897:2: rule__TransitionState__Group_0_0_1_0__1__Impl rule__TransitionState__Group_0_0_1_0__2
            {
            pushFollow(FOLLOW_27);
            rule__TransitionState__Group_0_0_1_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TransitionState__Group_0_0_1_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionState__Group_0_0_1_0__1"


    // $ANTLR start "rule__TransitionState__Group_0_0_1_0__1__Impl"
    // InternalArduinoML.g:2904:1: rule__TransitionState__Group_0_0_1_0__1__Impl : ( 'is' ) ;
    public final void rule__TransitionState__Group_0_0_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2908:1: ( ( 'is' ) )
            // InternalArduinoML.g:2909:1: ( 'is' )
            {
            // InternalArduinoML.g:2909:1: ( 'is' )
            // InternalArduinoML.g:2910:2: 'is'
            {
             before(grammarAccess.getTransitionStateAccess().getIsKeyword_0_0_1_0_1()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getTransitionStateAccess().getIsKeyword_0_0_1_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionState__Group_0_0_1_0__1__Impl"


    // $ANTLR start "rule__TransitionState__Group_0_0_1_0__2"
    // InternalArduinoML.g:2919:1: rule__TransitionState__Group_0_0_1_0__2 : rule__TransitionState__Group_0_0_1_0__2__Impl ;
    public final void rule__TransitionState__Group_0_0_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2923:1: ( rule__TransitionState__Group_0_0_1_0__2__Impl )
            // InternalArduinoML.g:2924:2: rule__TransitionState__Group_0_0_1_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TransitionState__Group_0_0_1_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionState__Group_0_0_1_0__2"


    // $ANTLR start "rule__TransitionState__Group_0_0_1_0__2__Impl"
    // InternalArduinoML.g:2930:1: rule__TransitionState__Group_0_0_1_0__2__Impl : ( ( rule__TransitionState__D_valuesAssignment_0_0_1_0_2 ) ) ;
    public final void rule__TransitionState__Group_0_0_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2934:1: ( ( ( rule__TransitionState__D_valuesAssignment_0_0_1_0_2 ) ) )
            // InternalArduinoML.g:2935:1: ( ( rule__TransitionState__D_valuesAssignment_0_0_1_0_2 ) )
            {
            // InternalArduinoML.g:2935:1: ( ( rule__TransitionState__D_valuesAssignment_0_0_1_0_2 ) )
            // InternalArduinoML.g:2936:2: ( rule__TransitionState__D_valuesAssignment_0_0_1_0_2 )
            {
             before(grammarAccess.getTransitionStateAccess().getD_valuesAssignment_0_0_1_0_2()); 
            // InternalArduinoML.g:2937:2: ( rule__TransitionState__D_valuesAssignment_0_0_1_0_2 )
            // InternalArduinoML.g:2937:3: rule__TransitionState__D_valuesAssignment_0_0_1_0_2
            {
            pushFollow(FOLLOW_2);
            rule__TransitionState__D_valuesAssignment_0_0_1_0_2();

            state._fsp--;


            }

             after(grammarAccess.getTransitionStateAccess().getD_valuesAssignment_0_0_1_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionState__Group_0_0_1_0__2__Impl"


    // $ANTLR start "rule__TransitionState__Group_0_0_1_1__0"
    // InternalArduinoML.g:2946:1: rule__TransitionState__Group_0_0_1_1__0 : rule__TransitionState__Group_0_0_1_1__0__Impl rule__TransitionState__Group_0_0_1_1__1 ;
    public final void rule__TransitionState__Group_0_0_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2950:1: ( rule__TransitionState__Group_0_0_1_1__0__Impl rule__TransitionState__Group_0_0_1_1__1 )
            // InternalArduinoML.g:2951:2: rule__TransitionState__Group_0_0_1_1__0__Impl rule__TransitionState__Group_0_0_1_1__1
            {
            pushFollow(FOLLOW_32);
            rule__TransitionState__Group_0_0_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TransitionState__Group_0_0_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionState__Group_0_0_1_1__0"


    // $ANTLR start "rule__TransitionState__Group_0_0_1_1__0__Impl"
    // InternalArduinoML.g:2958:1: rule__TransitionState__Group_0_0_1_1__0__Impl : ( ( rule__TransitionState__AnalogsAssignment_0_0_1_1_0 ) ) ;
    public final void rule__TransitionState__Group_0_0_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2962:1: ( ( ( rule__TransitionState__AnalogsAssignment_0_0_1_1_0 ) ) )
            // InternalArduinoML.g:2963:1: ( ( rule__TransitionState__AnalogsAssignment_0_0_1_1_0 ) )
            {
            // InternalArduinoML.g:2963:1: ( ( rule__TransitionState__AnalogsAssignment_0_0_1_1_0 ) )
            // InternalArduinoML.g:2964:2: ( rule__TransitionState__AnalogsAssignment_0_0_1_1_0 )
            {
             before(grammarAccess.getTransitionStateAccess().getAnalogsAssignment_0_0_1_1_0()); 
            // InternalArduinoML.g:2965:2: ( rule__TransitionState__AnalogsAssignment_0_0_1_1_0 )
            // InternalArduinoML.g:2965:3: rule__TransitionState__AnalogsAssignment_0_0_1_1_0
            {
            pushFollow(FOLLOW_2);
            rule__TransitionState__AnalogsAssignment_0_0_1_1_0();

            state._fsp--;


            }

             after(grammarAccess.getTransitionStateAccess().getAnalogsAssignment_0_0_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionState__Group_0_0_1_1__0__Impl"


    // $ANTLR start "rule__TransitionState__Group_0_0_1_1__1"
    // InternalArduinoML.g:2973:1: rule__TransitionState__Group_0_0_1_1__1 : rule__TransitionState__Group_0_0_1_1__1__Impl rule__TransitionState__Group_0_0_1_1__2 ;
    public final void rule__TransitionState__Group_0_0_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2977:1: ( rule__TransitionState__Group_0_0_1_1__1__Impl rule__TransitionState__Group_0_0_1_1__2 )
            // InternalArduinoML.g:2978:2: rule__TransitionState__Group_0_0_1_1__1__Impl rule__TransitionState__Group_0_0_1_1__2
            {
            pushFollow(FOLLOW_15);
            rule__TransitionState__Group_0_0_1_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TransitionState__Group_0_0_1_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionState__Group_0_0_1_1__1"


    // $ANTLR start "rule__TransitionState__Group_0_0_1_1__1__Impl"
    // InternalArduinoML.g:2985:1: rule__TransitionState__Group_0_0_1_1__1__Impl : ( ( rule__TransitionState__CompAssignment_0_0_1_1_1 ) ) ;
    public final void rule__TransitionState__Group_0_0_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2989:1: ( ( ( rule__TransitionState__CompAssignment_0_0_1_1_1 ) ) )
            // InternalArduinoML.g:2990:1: ( ( rule__TransitionState__CompAssignment_0_0_1_1_1 ) )
            {
            // InternalArduinoML.g:2990:1: ( ( rule__TransitionState__CompAssignment_0_0_1_1_1 ) )
            // InternalArduinoML.g:2991:2: ( rule__TransitionState__CompAssignment_0_0_1_1_1 )
            {
             before(grammarAccess.getTransitionStateAccess().getCompAssignment_0_0_1_1_1()); 
            // InternalArduinoML.g:2992:2: ( rule__TransitionState__CompAssignment_0_0_1_1_1 )
            // InternalArduinoML.g:2992:3: rule__TransitionState__CompAssignment_0_0_1_1_1
            {
            pushFollow(FOLLOW_2);
            rule__TransitionState__CompAssignment_0_0_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getTransitionStateAccess().getCompAssignment_0_0_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionState__Group_0_0_1_1__1__Impl"


    // $ANTLR start "rule__TransitionState__Group_0_0_1_1__2"
    // InternalArduinoML.g:3000:1: rule__TransitionState__Group_0_0_1_1__2 : rule__TransitionState__Group_0_0_1_1__2__Impl ;
    public final void rule__TransitionState__Group_0_0_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3004:1: ( rule__TransitionState__Group_0_0_1_1__2__Impl )
            // InternalArduinoML.g:3005:2: rule__TransitionState__Group_0_0_1_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TransitionState__Group_0_0_1_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionState__Group_0_0_1_1__2"


    // $ANTLR start "rule__TransitionState__Group_0_0_1_1__2__Impl"
    // InternalArduinoML.g:3011:1: rule__TransitionState__Group_0_0_1_1__2__Impl : ( ( rule__TransitionState__A_valuesAssignment_0_0_1_1_2 ) ) ;
    public final void rule__TransitionState__Group_0_0_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3015:1: ( ( ( rule__TransitionState__A_valuesAssignment_0_0_1_1_2 ) ) )
            // InternalArduinoML.g:3016:1: ( ( rule__TransitionState__A_valuesAssignment_0_0_1_1_2 ) )
            {
            // InternalArduinoML.g:3016:1: ( ( rule__TransitionState__A_valuesAssignment_0_0_1_1_2 ) )
            // InternalArduinoML.g:3017:2: ( rule__TransitionState__A_valuesAssignment_0_0_1_1_2 )
            {
             before(grammarAccess.getTransitionStateAccess().getA_valuesAssignment_0_0_1_1_2()); 
            // InternalArduinoML.g:3018:2: ( rule__TransitionState__A_valuesAssignment_0_0_1_1_2 )
            // InternalArduinoML.g:3018:3: rule__TransitionState__A_valuesAssignment_0_0_1_1_2
            {
            pushFollow(FOLLOW_2);
            rule__TransitionState__A_valuesAssignment_0_0_1_1_2();

            state._fsp--;


            }

             after(grammarAccess.getTransitionStateAccess().getA_valuesAssignment_0_0_1_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionState__Group_0_0_1_1__2__Impl"


    // $ANTLR start "rule__TransitionState__Group_0_0_2__0"
    // InternalArduinoML.g:3027:1: rule__TransitionState__Group_0_0_2__0 : rule__TransitionState__Group_0_0_2__0__Impl rule__TransitionState__Group_0_0_2__1 ;
    public final void rule__TransitionState__Group_0_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3031:1: ( rule__TransitionState__Group_0_0_2__0__Impl rule__TransitionState__Group_0_0_2__1 )
            // InternalArduinoML.g:3032:2: rule__TransitionState__Group_0_0_2__0__Impl rule__TransitionState__Group_0_0_2__1
            {
            pushFollow(FOLLOW_4);
            rule__TransitionState__Group_0_0_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TransitionState__Group_0_0_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionState__Group_0_0_2__0"


    // $ANTLR start "rule__TransitionState__Group_0_0_2__0__Impl"
    // InternalArduinoML.g:3039:1: rule__TransitionState__Group_0_0_2__0__Impl : ( 'and' ) ;
    public final void rule__TransitionState__Group_0_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3043:1: ( ( 'and' ) )
            // InternalArduinoML.g:3044:1: ( 'and' )
            {
            // InternalArduinoML.g:3044:1: ( 'and' )
            // InternalArduinoML.g:3045:2: 'and'
            {
             before(grammarAccess.getTransitionStateAccess().getAndKeyword_0_0_2_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getTransitionStateAccess().getAndKeyword_0_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionState__Group_0_0_2__0__Impl"


    // $ANTLR start "rule__TransitionState__Group_0_0_2__1"
    // InternalArduinoML.g:3054:1: rule__TransitionState__Group_0_0_2__1 : rule__TransitionState__Group_0_0_2__1__Impl ;
    public final void rule__TransitionState__Group_0_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3058:1: ( rule__TransitionState__Group_0_0_2__1__Impl )
            // InternalArduinoML.g:3059:2: rule__TransitionState__Group_0_0_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TransitionState__Group_0_0_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionState__Group_0_0_2__1"


    // $ANTLR start "rule__TransitionState__Group_0_0_2__1__Impl"
    // InternalArduinoML.g:3065:1: rule__TransitionState__Group_0_0_2__1__Impl : ( ( rule__TransitionState__Alternatives_0_0_2_1 ) ) ;
    public final void rule__TransitionState__Group_0_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3069:1: ( ( ( rule__TransitionState__Alternatives_0_0_2_1 ) ) )
            // InternalArduinoML.g:3070:1: ( ( rule__TransitionState__Alternatives_0_0_2_1 ) )
            {
            // InternalArduinoML.g:3070:1: ( ( rule__TransitionState__Alternatives_0_0_2_1 ) )
            // InternalArduinoML.g:3071:2: ( rule__TransitionState__Alternatives_0_0_2_1 )
            {
             before(grammarAccess.getTransitionStateAccess().getAlternatives_0_0_2_1()); 
            // InternalArduinoML.g:3072:2: ( rule__TransitionState__Alternatives_0_0_2_1 )
            // InternalArduinoML.g:3072:3: rule__TransitionState__Alternatives_0_0_2_1
            {
            pushFollow(FOLLOW_2);
            rule__TransitionState__Alternatives_0_0_2_1();

            state._fsp--;


            }

             after(grammarAccess.getTransitionStateAccess().getAlternatives_0_0_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionState__Group_0_0_2__1__Impl"


    // $ANTLR start "rule__TransitionState__Group_0_0_2_1_0__0"
    // InternalArduinoML.g:3081:1: rule__TransitionState__Group_0_0_2_1_0__0 : rule__TransitionState__Group_0_0_2_1_0__0__Impl rule__TransitionState__Group_0_0_2_1_0__1 ;
    public final void rule__TransitionState__Group_0_0_2_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3085:1: ( rule__TransitionState__Group_0_0_2_1_0__0__Impl rule__TransitionState__Group_0_0_2_1_0__1 )
            // InternalArduinoML.g:3086:2: rule__TransitionState__Group_0_0_2_1_0__0__Impl rule__TransitionState__Group_0_0_2_1_0__1
            {
            pushFollow(FOLLOW_31);
            rule__TransitionState__Group_0_0_2_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TransitionState__Group_0_0_2_1_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionState__Group_0_0_2_1_0__0"


    // $ANTLR start "rule__TransitionState__Group_0_0_2_1_0__0__Impl"
    // InternalArduinoML.g:3093:1: rule__TransitionState__Group_0_0_2_1_0__0__Impl : ( ( rule__TransitionState__DigitalsAssignment_0_0_2_1_0_0 ) ) ;
    public final void rule__TransitionState__Group_0_0_2_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3097:1: ( ( ( rule__TransitionState__DigitalsAssignment_0_0_2_1_0_0 ) ) )
            // InternalArduinoML.g:3098:1: ( ( rule__TransitionState__DigitalsAssignment_0_0_2_1_0_0 ) )
            {
            // InternalArduinoML.g:3098:1: ( ( rule__TransitionState__DigitalsAssignment_0_0_2_1_0_0 ) )
            // InternalArduinoML.g:3099:2: ( rule__TransitionState__DigitalsAssignment_0_0_2_1_0_0 )
            {
             before(grammarAccess.getTransitionStateAccess().getDigitalsAssignment_0_0_2_1_0_0()); 
            // InternalArduinoML.g:3100:2: ( rule__TransitionState__DigitalsAssignment_0_0_2_1_0_0 )
            // InternalArduinoML.g:3100:3: rule__TransitionState__DigitalsAssignment_0_0_2_1_0_0
            {
            pushFollow(FOLLOW_2);
            rule__TransitionState__DigitalsAssignment_0_0_2_1_0_0();

            state._fsp--;


            }

             after(grammarAccess.getTransitionStateAccess().getDigitalsAssignment_0_0_2_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionState__Group_0_0_2_1_0__0__Impl"


    // $ANTLR start "rule__TransitionState__Group_0_0_2_1_0__1"
    // InternalArduinoML.g:3108:1: rule__TransitionState__Group_0_0_2_1_0__1 : rule__TransitionState__Group_0_0_2_1_0__1__Impl rule__TransitionState__Group_0_0_2_1_0__2 ;
    public final void rule__TransitionState__Group_0_0_2_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3112:1: ( rule__TransitionState__Group_0_0_2_1_0__1__Impl rule__TransitionState__Group_0_0_2_1_0__2 )
            // InternalArduinoML.g:3113:2: rule__TransitionState__Group_0_0_2_1_0__1__Impl rule__TransitionState__Group_0_0_2_1_0__2
            {
            pushFollow(FOLLOW_27);
            rule__TransitionState__Group_0_0_2_1_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TransitionState__Group_0_0_2_1_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionState__Group_0_0_2_1_0__1"


    // $ANTLR start "rule__TransitionState__Group_0_0_2_1_0__1__Impl"
    // InternalArduinoML.g:3120:1: rule__TransitionState__Group_0_0_2_1_0__1__Impl : ( 'is' ) ;
    public final void rule__TransitionState__Group_0_0_2_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3124:1: ( ( 'is' ) )
            // InternalArduinoML.g:3125:1: ( 'is' )
            {
            // InternalArduinoML.g:3125:1: ( 'is' )
            // InternalArduinoML.g:3126:2: 'is'
            {
             before(grammarAccess.getTransitionStateAccess().getIsKeyword_0_0_2_1_0_1()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getTransitionStateAccess().getIsKeyword_0_0_2_1_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionState__Group_0_0_2_1_0__1__Impl"


    // $ANTLR start "rule__TransitionState__Group_0_0_2_1_0__2"
    // InternalArduinoML.g:3135:1: rule__TransitionState__Group_0_0_2_1_0__2 : rule__TransitionState__Group_0_0_2_1_0__2__Impl ;
    public final void rule__TransitionState__Group_0_0_2_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3139:1: ( rule__TransitionState__Group_0_0_2_1_0__2__Impl )
            // InternalArduinoML.g:3140:2: rule__TransitionState__Group_0_0_2_1_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TransitionState__Group_0_0_2_1_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionState__Group_0_0_2_1_0__2"


    // $ANTLR start "rule__TransitionState__Group_0_0_2_1_0__2__Impl"
    // InternalArduinoML.g:3146:1: rule__TransitionState__Group_0_0_2_1_0__2__Impl : ( ( rule__TransitionState__D_valuesAssignment_0_0_2_1_0_2 ) ) ;
    public final void rule__TransitionState__Group_0_0_2_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3150:1: ( ( ( rule__TransitionState__D_valuesAssignment_0_0_2_1_0_2 ) ) )
            // InternalArduinoML.g:3151:1: ( ( rule__TransitionState__D_valuesAssignment_0_0_2_1_0_2 ) )
            {
            // InternalArduinoML.g:3151:1: ( ( rule__TransitionState__D_valuesAssignment_0_0_2_1_0_2 ) )
            // InternalArduinoML.g:3152:2: ( rule__TransitionState__D_valuesAssignment_0_0_2_1_0_2 )
            {
             before(grammarAccess.getTransitionStateAccess().getD_valuesAssignment_0_0_2_1_0_2()); 
            // InternalArduinoML.g:3153:2: ( rule__TransitionState__D_valuesAssignment_0_0_2_1_0_2 )
            // InternalArduinoML.g:3153:3: rule__TransitionState__D_valuesAssignment_0_0_2_1_0_2
            {
            pushFollow(FOLLOW_2);
            rule__TransitionState__D_valuesAssignment_0_0_2_1_0_2();

            state._fsp--;


            }

             after(grammarAccess.getTransitionStateAccess().getD_valuesAssignment_0_0_2_1_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionState__Group_0_0_2_1_0__2__Impl"


    // $ANTLR start "rule__TransitionState__Group_0_0_2_1_1__0"
    // InternalArduinoML.g:3162:1: rule__TransitionState__Group_0_0_2_1_1__0 : rule__TransitionState__Group_0_0_2_1_1__0__Impl rule__TransitionState__Group_0_0_2_1_1__1 ;
    public final void rule__TransitionState__Group_0_0_2_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3166:1: ( rule__TransitionState__Group_0_0_2_1_1__0__Impl rule__TransitionState__Group_0_0_2_1_1__1 )
            // InternalArduinoML.g:3167:2: rule__TransitionState__Group_0_0_2_1_1__0__Impl rule__TransitionState__Group_0_0_2_1_1__1
            {
            pushFollow(FOLLOW_32);
            rule__TransitionState__Group_0_0_2_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TransitionState__Group_0_0_2_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionState__Group_0_0_2_1_1__0"


    // $ANTLR start "rule__TransitionState__Group_0_0_2_1_1__0__Impl"
    // InternalArduinoML.g:3174:1: rule__TransitionState__Group_0_0_2_1_1__0__Impl : ( ( rule__TransitionState__AnalogsAssignment_0_0_2_1_1_0 ) ) ;
    public final void rule__TransitionState__Group_0_0_2_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3178:1: ( ( ( rule__TransitionState__AnalogsAssignment_0_0_2_1_1_0 ) ) )
            // InternalArduinoML.g:3179:1: ( ( rule__TransitionState__AnalogsAssignment_0_0_2_1_1_0 ) )
            {
            // InternalArduinoML.g:3179:1: ( ( rule__TransitionState__AnalogsAssignment_0_0_2_1_1_0 ) )
            // InternalArduinoML.g:3180:2: ( rule__TransitionState__AnalogsAssignment_0_0_2_1_1_0 )
            {
             before(grammarAccess.getTransitionStateAccess().getAnalogsAssignment_0_0_2_1_1_0()); 
            // InternalArduinoML.g:3181:2: ( rule__TransitionState__AnalogsAssignment_0_0_2_1_1_0 )
            // InternalArduinoML.g:3181:3: rule__TransitionState__AnalogsAssignment_0_0_2_1_1_0
            {
            pushFollow(FOLLOW_2);
            rule__TransitionState__AnalogsAssignment_0_0_2_1_1_0();

            state._fsp--;


            }

             after(grammarAccess.getTransitionStateAccess().getAnalogsAssignment_0_0_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionState__Group_0_0_2_1_1__0__Impl"


    // $ANTLR start "rule__TransitionState__Group_0_0_2_1_1__1"
    // InternalArduinoML.g:3189:1: rule__TransitionState__Group_0_0_2_1_1__1 : rule__TransitionState__Group_0_0_2_1_1__1__Impl rule__TransitionState__Group_0_0_2_1_1__2 ;
    public final void rule__TransitionState__Group_0_0_2_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3193:1: ( rule__TransitionState__Group_0_0_2_1_1__1__Impl rule__TransitionState__Group_0_0_2_1_1__2 )
            // InternalArduinoML.g:3194:2: rule__TransitionState__Group_0_0_2_1_1__1__Impl rule__TransitionState__Group_0_0_2_1_1__2
            {
            pushFollow(FOLLOW_15);
            rule__TransitionState__Group_0_0_2_1_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TransitionState__Group_0_0_2_1_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionState__Group_0_0_2_1_1__1"


    // $ANTLR start "rule__TransitionState__Group_0_0_2_1_1__1__Impl"
    // InternalArduinoML.g:3201:1: rule__TransitionState__Group_0_0_2_1_1__1__Impl : ( ( rule__TransitionState__CompAssignment_0_0_2_1_1_1 ) ) ;
    public final void rule__TransitionState__Group_0_0_2_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3205:1: ( ( ( rule__TransitionState__CompAssignment_0_0_2_1_1_1 ) ) )
            // InternalArduinoML.g:3206:1: ( ( rule__TransitionState__CompAssignment_0_0_2_1_1_1 ) )
            {
            // InternalArduinoML.g:3206:1: ( ( rule__TransitionState__CompAssignment_0_0_2_1_1_1 ) )
            // InternalArduinoML.g:3207:2: ( rule__TransitionState__CompAssignment_0_0_2_1_1_1 )
            {
             before(grammarAccess.getTransitionStateAccess().getCompAssignment_0_0_2_1_1_1()); 
            // InternalArduinoML.g:3208:2: ( rule__TransitionState__CompAssignment_0_0_2_1_1_1 )
            // InternalArduinoML.g:3208:3: rule__TransitionState__CompAssignment_0_0_2_1_1_1
            {
            pushFollow(FOLLOW_2);
            rule__TransitionState__CompAssignment_0_0_2_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getTransitionStateAccess().getCompAssignment_0_0_2_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionState__Group_0_0_2_1_1__1__Impl"


    // $ANTLR start "rule__TransitionState__Group_0_0_2_1_1__2"
    // InternalArduinoML.g:3216:1: rule__TransitionState__Group_0_0_2_1_1__2 : rule__TransitionState__Group_0_0_2_1_1__2__Impl ;
    public final void rule__TransitionState__Group_0_0_2_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3220:1: ( rule__TransitionState__Group_0_0_2_1_1__2__Impl )
            // InternalArduinoML.g:3221:2: rule__TransitionState__Group_0_0_2_1_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TransitionState__Group_0_0_2_1_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionState__Group_0_0_2_1_1__2"


    // $ANTLR start "rule__TransitionState__Group_0_0_2_1_1__2__Impl"
    // InternalArduinoML.g:3227:1: rule__TransitionState__Group_0_0_2_1_1__2__Impl : ( ( rule__TransitionState__A_valuesAssignment_0_0_2_1_1_2 ) ) ;
    public final void rule__TransitionState__Group_0_0_2_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3231:1: ( ( ( rule__TransitionState__A_valuesAssignment_0_0_2_1_1_2 ) ) )
            // InternalArduinoML.g:3232:1: ( ( rule__TransitionState__A_valuesAssignment_0_0_2_1_1_2 ) )
            {
            // InternalArduinoML.g:3232:1: ( ( rule__TransitionState__A_valuesAssignment_0_0_2_1_1_2 ) )
            // InternalArduinoML.g:3233:2: ( rule__TransitionState__A_valuesAssignment_0_0_2_1_1_2 )
            {
             before(grammarAccess.getTransitionStateAccess().getA_valuesAssignment_0_0_2_1_1_2()); 
            // InternalArduinoML.g:3234:2: ( rule__TransitionState__A_valuesAssignment_0_0_2_1_1_2 )
            // InternalArduinoML.g:3234:3: rule__TransitionState__A_valuesAssignment_0_0_2_1_1_2
            {
            pushFollow(FOLLOW_2);
            rule__TransitionState__A_valuesAssignment_0_0_2_1_1_2();

            state._fsp--;


            }

             after(grammarAccess.getTransitionStateAccess().getA_valuesAssignment_0_0_2_1_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionState__Group_0_0_2_1_1__2__Impl"


    // $ANTLR start "rule__TransitionState__Group_0_0_3__0"
    // InternalArduinoML.g:3243:1: rule__TransitionState__Group_0_0_3__0 : rule__TransitionState__Group_0_0_3__0__Impl rule__TransitionState__Group_0_0_3__1 ;
    public final void rule__TransitionState__Group_0_0_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3247:1: ( rule__TransitionState__Group_0_0_3__0__Impl rule__TransitionState__Group_0_0_3__1 )
            // InternalArduinoML.g:3248:2: rule__TransitionState__Group_0_0_3__0__Impl rule__TransitionState__Group_0_0_3__1
            {
            pushFollow(FOLLOW_15);
            rule__TransitionState__Group_0_0_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TransitionState__Group_0_0_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionState__Group_0_0_3__0"


    // $ANTLR start "rule__TransitionState__Group_0_0_3__0__Impl"
    // InternalArduinoML.g:3255:1: rule__TransitionState__Group_0_0_3__0__Impl : ( 'wait' ) ;
    public final void rule__TransitionState__Group_0_0_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3259:1: ( ( 'wait' ) )
            // InternalArduinoML.g:3260:1: ( 'wait' )
            {
            // InternalArduinoML.g:3260:1: ( 'wait' )
            // InternalArduinoML.g:3261:2: 'wait'
            {
             before(grammarAccess.getTransitionStateAccess().getWaitKeyword_0_0_3_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getTransitionStateAccess().getWaitKeyword_0_0_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionState__Group_0_0_3__0__Impl"


    // $ANTLR start "rule__TransitionState__Group_0_0_3__1"
    // InternalArduinoML.g:3270:1: rule__TransitionState__Group_0_0_3__1 : rule__TransitionState__Group_0_0_3__1__Impl rule__TransitionState__Group_0_0_3__2 ;
    public final void rule__TransitionState__Group_0_0_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3274:1: ( rule__TransitionState__Group_0_0_3__1__Impl rule__TransitionState__Group_0_0_3__2 )
            // InternalArduinoML.g:3275:2: rule__TransitionState__Group_0_0_3__1__Impl rule__TransitionState__Group_0_0_3__2
            {
            pushFollow(FOLLOW_33);
            rule__TransitionState__Group_0_0_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TransitionState__Group_0_0_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionState__Group_0_0_3__1"


    // $ANTLR start "rule__TransitionState__Group_0_0_3__1__Impl"
    // InternalArduinoML.g:3282:1: rule__TransitionState__Group_0_0_3__1__Impl : ( ( rule__TransitionState__TimeAssignment_0_0_3_1 ) ) ;
    public final void rule__TransitionState__Group_0_0_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3286:1: ( ( ( rule__TransitionState__TimeAssignment_0_0_3_1 ) ) )
            // InternalArduinoML.g:3287:1: ( ( rule__TransitionState__TimeAssignment_0_0_3_1 ) )
            {
            // InternalArduinoML.g:3287:1: ( ( rule__TransitionState__TimeAssignment_0_0_3_1 ) )
            // InternalArduinoML.g:3288:2: ( rule__TransitionState__TimeAssignment_0_0_3_1 )
            {
             before(grammarAccess.getTransitionStateAccess().getTimeAssignment_0_0_3_1()); 
            // InternalArduinoML.g:3289:2: ( rule__TransitionState__TimeAssignment_0_0_3_1 )
            // InternalArduinoML.g:3289:3: rule__TransitionState__TimeAssignment_0_0_3_1
            {
            pushFollow(FOLLOW_2);
            rule__TransitionState__TimeAssignment_0_0_3_1();

            state._fsp--;


            }

             after(grammarAccess.getTransitionStateAccess().getTimeAssignment_0_0_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionState__Group_0_0_3__1__Impl"


    // $ANTLR start "rule__TransitionState__Group_0_0_3__2"
    // InternalArduinoML.g:3297:1: rule__TransitionState__Group_0_0_3__2 : rule__TransitionState__Group_0_0_3__2__Impl rule__TransitionState__Group_0_0_3__3 ;
    public final void rule__TransitionState__Group_0_0_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3301:1: ( rule__TransitionState__Group_0_0_3__2__Impl rule__TransitionState__Group_0_0_3__3 )
            // InternalArduinoML.g:3302:2: rule__TransitionState__Group_0_0_3__2__Impl rule__TransitionState__Group_0_0_3__3
            {
            pushFollow(FOLLOW_34);
            rule__TransitionState__Group_0_0_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TransitionState__Group_0_0_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionState__Group_0_0_3__2"


    // $ANTLR start "rule__TransitionState__Group_0_0_3__2__Impl"
    // InternalArduinoML.g:3309:1: rule__TransitionState__Group_0_0_3__2__Impl : ( ( rule__TransitionState__UnitAssignment_0_0_3_2 ) ) ;
    public final void rule__TransitionState__Group_0_0_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3313:1: ( ( ( rule__TransitionState__UnitAssignment_0_0_3_2 ) ) )
            // InternalArduinoML.g:3314:1: ( ( rule__TransitionState__UnitAssignment_0_0_3_2 ) )
            {
            // InternalArduinoML.g:3314:1: ( ( rule__TransitionState__UnitAssignment_0_0_3_2 ) )
            // InternalArduinoML.g:3315:2: ( rule__TransitionState__UnitAssignment_0_0_3_2 )
            {
             before(grammarAccess.getTransitionStateAccess().getUnitAssignment_0_0_3_2()); 
            // InternalArduinoML.g:3316:2: ( rule__TransitionState__UnitAssignment_0_0_3_2 )
            // InternalArduinoML.g:3316:3: rule__TransitionState__UnitAssignment_0_0_3_2
            {
            pushFollow(FOLLOW_2);
            rule__TransitionState__UnitAssignment_0_0_3_2();

            state._fsp--;


            }

             after(grammarAccess.getTransitionStateAccess().getUnitAssignment_0_0_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionState__Group_0_0_3__2__Impl"


    // $ANTLR start "rule__TransitionState__Group_0_0_3__3"
    // InternalArduinoML.g:3324:1: rule__TransitionState__Group_0_0_3__3 : rule__TransitionState__Group_0_0_3__3__Impl ;
    public final void rule__TransitionState__Group_0_0_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3328:1: ( rule__TransitionState__Group_0_0_3__3__Impl )
            // InternalArduinoML.g:3329:2: rule__TransitionState__Group_0_0_3__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TransitionState__Group_0_0_3__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionState__Group_0_0_3__3"


    // $ANTLR start "rule__TransitionState__Group_0_0_3__3__Impl"
    // InternalArduinoML.g:3335:1: rule__TransitionState__Group_0_0_3__3__Impl : ( 'then' ) ;
    public final void rule__TransitionState__Group_0_0_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3339:1: ( ( 'then' ) )
            // InternalArduinoML.g:3340:1: ( 'then' )
            {
            // InternalArduinoML.g:3340:1: ( 'then' )
            // InternalArduinoML.g:3341:2: 'then'
            {
             before(grammarAccess.getTransitionStateAccess().getThenKeyword_0_0_3_3()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getTransitionStateAccess().getThenKeyword_0_0_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionState__Group_0_0_3__3__Impl"


    // $ANTLR start "rule__TransitionState__Group_0_1__0"
    // InternalArduinoML.g:3351:1: rule__TransitionState__Group_0_1__0 : rule__TransitionState__Group_0_1__0__Impl rule__TransitionState__Group_0_1__1 ;
    public final void rule__TransitionState__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3355:1: ( rule__TransitionState__Group_0_1__0__Impl rule__TransitionState__Group_0_1__1 )
            // InternalArduinoML.g:3356:2: rule__TransitionState__Group_0_1__0__Impl rule__TransitionState__Group_0_1__1
            {
            pushFollow(FOLLOW_15);
            rule__TransitionState__Group_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TransitionState__Group_0_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionState__Group_0_1__0"


    // $ANTLR start "rule__TransitionState__Group_0_1__0__Impl"
    // InternalArduinoML.g:3363:1: rule__TransitionState__Group_0_1__0__Impl : ( 'wait' ) ;
    public final void rule__TransitionState__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3367:1: ( ( 'wait' ) )
            // InternalArduinoML.g:3368:1: ( 'wait' )
            {
            // InternalArduinoML.g:3368:1: ( 'wait' )
            // InternalArduinoML.g:3369:2: 'wait'
            {
             before(grammarAccess.getTransitionStateAccess().getWaitKeyword_0_1_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getTransitionStateAccess().getWaitKeyword_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionState__Group_0_1__0__Impl"


    // $ANTLR start "rule__TransitionState__Group_0_1__1"
    // InternalArduinoML.g:3378:1: rule__TransitionState__Group_0_1__1 : rule__TransitionState__Group_0_1__1__Impl rule__TransitionState__Group_0_1__2 ;
    public final void rule__TransitionState__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3382:1: ( rule__TransitionState__Group_0_1__1__Impl rule__TransitionState__Group_0_1__2 )
            // InternalArduinoML.g:3383:2: rule__TransitionState__Group_0_1__1__Impl rule__TransitionState__Group_0_1__2
            {
            pushFollow(FOLLOW_33);
            rule__TransitionState__Group_0_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TransitionState__Group_0_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionState__Group_0_1__1"


    // $ANTLR start "rule__TransitionState__Group_0_1__1__Impl"
    // InternalArduinoML.g:3390:1: rule__TransitionState__Group_0_1__1__Impl : ( ( rule__TransitionState__TimeAssignment_0_1_1 ) ) ;
    public final void rule__TransitionState__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3394:1: ( ( ( rule__TransitionState__TimeAssignment_0_1_1 ) ) )
            // InternalArduinoML.g:3395:1: ( ( rule__TransitionState__TimeAssignment_0_1_1 ) )
            {
            // InternalArduinoML.g:3395:1: ( ( rule__TransitionState__TimeAssignment_0_1_1 ) )
            // InternalArduinoML.g:3396:2: ( rule__TransitionState__TimeAssignment_0_1_1 )
            {
             before(grammarAccess.getTransitionStateAccess().getTimeAssignment_0_1_1()); 
            // InternalArduinoML.g:3397:2: ( rule__TransitionState__TimeAssignment_0_1_1 )
            // InternalArduinoML.g:3397:3: rule__TransitionState__TimeAssignment_0_1_1
            {
            pushFollow(FOLLOW_2);
            rule__TransitionState__TimeAssignment_0_1_1();

            state._fsp--;


            }

             after(grammarAccess.getTransitionStateAccess().getTimeAssignment_0_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionState__Group_0_1__1__Impl"


    // $ANTLR start "rule__TransitionState__Group_0_1__2"
    // InternalArduinoML.g:3405:1: rule__TransitionState__Group_0_1__2 : rule__TransitionState__Group_0_1__2__Impl rule__TransitionState__Group_0_1__3 ;
    public final void rule__TransitionState__Group_0_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3409:1: ( rule__TransitionState__Group_0_1__2__Impl rule__TransitionState__Group_0_1__3 )
            // InternalArduinoML.g:3410:2: rule__TransitionState__Group_0_1__2__Impl rule__TransitionState__Group_0_1__3
            {
            pushFollow(FOLLOW_34);
            rule__TransitionState__Group_0_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TransitionState__Group_0_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionState__Group_0_1__2"


    // $ANTLR start "rule__TransitionState__Group_0_1__2__Impl"
    // InternalArduinoML.g:3417:1: rule__TransitionState__Group_0_1__2__Impl : ( ( rule__TransitionState__UnitAssignment_0_1_2 ) ) ;
    public final void rule__TransitionState__Group_0_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3421:1: ( ( ( rule__TransitionState__UnitAssignment_0_1_2 ) ) )
            // InternalArduinoML.g:3422:1: ( ( rule__TransitionState__UnitAssignment_0_1_2 ) )
            {
            // InternalArduinoML.g:3422:1: ( ( rule__TransitionState__UnitAssignment_0_1_2 ) )
            // InternalArduinoML.g:3423:2: ( rule__TransitionState__UnitAssignment_0_1_2 )
            {
             before(grammarAccess.getTransitionStateAccess().getUnitAssignment_0_1_2()); 
            // InternalArduinoML.g:3424:2: ( rule__TransitionState__UnitAssignment_0_1_2 )
            // InternalArduinoML.g:3424:3: rule__TransitionState__UnitAssignment_0_1_2
            {
            pushFollow(FOLLOW_2);
            rule__TransitionState__UnitAssignment_0_1_2();

            state._fsp--;


            }

             after(grammarAccess.getTransitionStateAccess().getUnitAssignment_0_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionState__Group_0_1__2__Impl"


    // $ANTLR start "rule__TransitionState__Group_0_1__3"
    // InternalArduinoML.g:3432:1: rule__TransitionState__Group_0_1__3 : rule__TransitionState__Group_0_1__3__Impl ;
    public final void rule__TransitionState__Group_0_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3436:1: ( rule__TransitionState__Group_0_1__3__Impl )
            // InternalArduinoML.g:3437:2: rule__TransitionState__Group_0_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TransitionState__Group_0_1__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionState__Group_0_1__3"


    // $ANTLR start "rule__TransitionState__Group_0_1__3__Impl"
    // InternalArduinoML.g:3443:1: rule__TransitionState__Group_0_1__3__Impl : ( 'then' ) ;
    public final void rule__TransitionState__Group_0_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3447:1: ( ( 'then' ) )
            // InternalArduinoML.g:3448:1: ( 'then' )
            {
            // InternalArduinoML.g:3448:1: ( 'then' )
            // InternalArduinoML.g:3449:2: 'then'
            {
             before(grammarAccess.getTransitionStateAccess().getThenKeyword_0_1_3()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getTransitionStateAccess().getThenKeyword_0_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionState__Group_0_1__3__Impl"


    // $ANTLR start "rule__TransitionMode__Group__0"
    // InternalArduinoML.g:3459:1: rule__TransitionMode__Group__0 : rule__TransitionMode__Group__0__Impl rule__TransitionMode__Group__1 ;
    public final void rule__TransitionMode__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3463:1: ( rule__TransitionMode__Group__0__Impl rule__TransitionMode__Group__1 )
            // InternalArduinoML.g:3464:2: rule__TransitionMode__Group__0__Impl rule__TransitionMode__Group__1
            {
            pushFollow(FOLLOW_28);
            rule__TransitionMode__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TransitionMode__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionMode__Group__0"


    // $ANTLR start "rule__TransitionMode__Group__0__Impl"
    // InternalArduinoML.g:3471:1: rule__TransitionMode__Group__0__Impl : ( ( rule__TransitionMode__Alternatives_0 ) ) ;
    public final void rule__TransitionMode__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3475:1: ( ( ( rule__TransitionMode__Alternatives_0 ) ) )
            // InternalArduinoML.g:3476:1: ( ( rule__TransitionMode__Alternatives_0 ) )
            {
            // InternalArduinoML.g:3476:1: ( ( rule__TransitionMode__Alternatives_0 ) )
            // InternalArduinoML.g:3477:2: ( rule__TransitionMode__Alternatives_0 )
            {
             before(grammarAccess.getTransitionModeAccess().getAlternatives_0()); 
            // InternalArduinoML.g:3478:2: ( rule__TransitionMode__Alternatives_0 )
            // InternalArduinoML.g:3478:3: rule__TransitionMode__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__TransitionMode__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getTransitionModeAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionMode__Group__0__Impl"


    // $ANTLR start "rule__TransitionMode__Group__1"
    // InternalArduinoML.g:3486:1: rule__TransitionMode__Group__1 : rule__TransitionMode__Group__1__Impl rule__TransitionMode__Group__2 ;
    public final void rule__TransitionMode__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3490:1: ( rule__TransitionMode__Group__1__Impl rule__TransitionMode__Group__2 )
            // InternalArduinoML.g:3491:2: rule__TransitionMode__Group__1__Impl rule__TransitionMode__Group__2
            {
            pushFollow(FOLLOW_26);
            rule__TransitionMode__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TransitionMode__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionMode__Group__1"


    // $ANTLR start "rule__TransitionMode__Group__1__Impl"
    // InternalArduinoML.g:3498:1: rule__TransitionMode__Group__1__Impl : ( 'go' ) ;
    public final void rule__TransitionMode__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3502:1: ( ( 'go' ) )
            // InternalArduinoML.g:3503:1: ( 'go' )
            {
            // InternalArduinoML.g:3503:1: ( 'go' )
            // InternalArduinoML.g:3504:2: 'go'
            {
             before(grammarAccess.getTransitionModeAccess().getGoKeyword_1()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getTransitionModeAccess().getGoKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionMode__Group__1__Impl"


    // $ANTLR start "rule__TransitionMode__Group__2"
    // InternalArduinoML.g:3513:1: rule__TransitionMode__Group__2 : rule__TransitionMode__Group__2__Impl rule__TransitionMode__Group__3 ;
    public final void rule__TransitionMode__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3517:1: ( rule__TransitionMode__Group__2__Impl rule__TransitionMode__Group__3 )
            // InternalArduinoML.g:3518:2: rule__TransitionMode__Group__2__Impl rule__TransitionMode__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__TransitionMode__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TransitionMode__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionMode__Group__2"


    // $ANTLR start "rule__TransitionMode__Group__2__Impl"
    // InternalArduinoML.g:3525:1: rule__TransitionMode__Group__2__Impl : ( 'to' ) ;
    public final void rule__TransitionMode__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3529:1: ( ( 'to' ) )
            // InternalArduinoML.g:3530:1: ( 'to' )
            {
            // InternalArduinoML.g:3530:1: ( 'to' )
            // InternalArduinoML.g:3531:2: 'to'
            {
             before(grammarAccess.getTransitionModeAccess().getToKeyword_2()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getTransitionModeAccess().getToKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionMode__Group__2__Impl"


    // $ANTLR start "rule__TransitionMode__Group__3"
    // InternalArduinoML.g:3540:1: rule__TransitionMode__Group__3 : rule__TransitionMode__Group__3__Impl rule__TransitionMode__Group__4 ;
    public final void rule__TransitionMode__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3544:1: ( rule__TransitionMode__Group__3__Impl rule__TransitionMode__Group__4 )
            // InternalArduinoML.g:3545:2: rule__TransitionMode__Group__3__Impl rule__TransitionMode__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__TransitionMode__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TransitionMode__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionMode__Group__3"


    // $ANTLR start "rule__TransitionMode__Group__3__Impl"
    // InternalArduinoML.g:3552:1: rule__TransitionMode__Group__3__Impl : ( 'mode' ) ;
    public final void rule__TransitionMode__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3556:1: ( ( 'mode' ) )
            // InternalArduinoML.g:3557:1: ( 'mode' )
            {
            // InternalArduinoML.g:3557:1: ( 'mode' )
            // InternalArduinoML.g:3558:2: 'mode'
            {
             before(grammarAccess.getTransitionModeAccess().getModeKeyword_3()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getTransitionModeAccess().getModeKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionMode__Group__3__Impl"


    // $ANTLR start "rule__TransitionMode__Group__4"
    // InternalArduinoML.g:3567:1: rule__TransitionMode__Group__4 : rule__TransitionMode__Group__4__Impl ;
    public final void rule__TransitionMode__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3571:1: ( rule__TransitionMode__Group__4__Impl )
            // InternalArduinoML.g:3572:2: rule__TransitionMode__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TransitionMode__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionMode__Group__4"


    // $ANTLR start "rule__TransitionMode__Group__4__Impl"
    // InternalArduinoML.g:3578:1: rule__TransitionMode__Group__4__Impl : ( ( rule__TransitionMode__Next_modeAssignment_4 ) ) ;
    public final void rule__TransitionMode__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3582:1: ( ( ( rule__TransitionMode__Next_modeAssignment_4 ) ) )
            // InternalArduinoML.g:3583:1: ( ( rule__TransitionMode__Next_modeAssignment_4 ) )
            {
            // InternalArduinoML.g:3583:1: ( ( rule__TransitionMode__Next_modeAssignment_4 ) )
            // InternalArduinoML.g:3584:2: ( rule__TransitionMode__Next_modeAssignment_4 )
            {
             before(grammarAccess.getTransitionModeAccess().getNext_modeAssignment_4()); 
            // InternalArduinoML.g:3585:2: ( rule__TransitionMode__Next_modeAssignment_4 )
            // InternalArduinoML.g:3585:3: rule__TransitionMode__Next_modeAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__TransitionMode__Next_modeAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getTransitionModeAccess().getNext_modeAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionMode__Group__4__Impl"


    // $ANTLR start "rule__TransitionMode__Group_0_0__0"
    // InternalArduinoML.g:3594:1: rule__TransitionMode__Group_0_0__0 : rule__TransitionMode__Group_0_0__0__Impl rule__TransitionMode__Group_0_0__1 ;
    public final void rule__TransitionMode__Group_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3598:1: ( rule__TransitionMode__Group_0_0__0__Impl rule__TransitionMode__Group_0_0__1 )
            // InternalArduinoML.g:3599:2: rule__TransitionMode__Group_0_0__0__Impl rule__TransitionMode__Group_0_0__1
            {
            pushFollow(FOLLOW_4);
            rule__TransitionMode__Group_0_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TransitionMode__Group_0_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionMode__Group_0_0__0"


    // $ANTLR start "rule__TransitionMode__Group_0_0__0__Impl"
    // InternalArduinoML.g:3606:1: rule__TransitionMode__Group_0_0__0__Impl : ( 'when' ) ;
    public final void rule__TransitionMode__Group_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3610:1: ( ( 'when' ) )
            // InternalArduinoML.g:3611:1: ( 'when' )
            {
            // InternalArduinoML.g:3611:1: ( 'when' )
            // InternalArduinoML.g:3612:2: 'when'
            {
             before(grammarAccess.getTransitionModeAccess().getWhenKeyword_0_0_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getTransitionModeAccess().getWhenKeyword_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionMode__Group_0_0__0__Impl"


    // $ANTLR start "rule__TransitionMode__Group_0_0__1"
    // InternalArduinoML.g:3621:1: rule__TransitionMode__Group_0_0__1 : rule__TransitionMode__Group_0_0__1__Impl rule__TransitionMode__Group_0_0__2 ;
    public final void rule__TransitionMode__Group_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3625:1: ( rule__TransitionMode__Group_0_0__1__Impl rule__TransitionMode__Group_0_0__2 )
            // InternalArduinoML.g:3626:2: rule__TransitionMode__Group_0_0__1__Impl rule__TransitionMode__Group_0_0__2
            {
            pushFollow(FOLLOW_29);
            rule__TransitionMode__Group_0_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TransitionMode__Group_0_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionMode__Group_0_0__1"


    // $ANTLR start "rule__TransitionMode__Group_0_0__1__Impl"
    // InternalArduinoML.g:3633:1: rule__TransitionMode__Group_0_0__1__Impl : ( ( rule__TransitionMode__Alternatives_0_0_1 ) ) ;
    public final void rule__TransitionMode__Group_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3637:1: ( ( ( rule__TransitionMode__Alternatives_0_0_1 ) ) )
            // InternalArduinoML.g:3638:1: ( ( rule__TransitionMode__Alternatives_0_0_1 ) )
            {
            // InternalArduinoML.g:3638:1: ( ( rule__TransitionMode__Alternatives_0_0_1 ) )
            // InternalArduinoML.g:3639:2: ( rule__TransitionMode__Alternatives_0_0_1 )
            {
             before(grammarAccess.getTransitionModeAccess().getAlternatives_0_0_1()); 
            // InternalArduinoML.g:3640:2: ( rule__TransitionMode__Alternatives_0_0_1 )
            // InternalArduinoML.g:3640:3: rule__TransitionMode__Alternatives_0_0_1
            {
            pushFollow(FOLLOW_2);
            rule__TransitionMode__Alternatives_0_0_1();

            state._fsp--;


            }

             after(grammarAccess.getTransitionModeAccess().getAlternatives_0_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionMode__Group_0_0__1__Impl"


    // $ANTLR start "rule__TransitionMode__Group_0_0__2"
    // InternalArduinoML.g:3648:1: rule__TransitionMode__Group_0_0__2 : rule__TransitionMode__Group_0_0__2__Impl rule__TransitionMode__Group_0_0__3 ;
    public final void rule__TransitionMode__Group_0_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3652:1: ( rule__TransitionMode__Group_0_0__2__Impl rule__TransitionMode__Group_0_0__3 )
            // InternalArduinoML.g:3653:2: rule__TransitionMode__Group_0_0__2__Impl rule__TransitionMode__Group_0_0__3
            {
            pushFollow(FOLLOW_29);
            rule__TransitionMode__Group_0_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TransitionMode__Group_0_0__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionMode__Group_0_0__2"


    // $ANTLR start "rule__TransitionMode__Group_0_0__2__Impl"
    // InternalArduinoML.g:3660:1: rule__TransitionMode__Group_0_0__2__Impl : ( ( rule__TransitionMode__Group_0_0_2__0 )* ) ;
    public final void rule__TransitionMode__Group_0_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3664:1: ( ( ( rule__TransitionMode__Group_0_0_2__0 )* ) )
            // InternalArduinoML.g:3665:1: ( ( rule__TransitionMode__Group_0_0_2__0 )* )
            {
            // InternalArduinoML.g:3665:1: ( ( rule__TransitionMode__Group_0_0_2__0 )* )
            // InternalArduinoML.g:3666:2: ( rule__TransitionMode__Group_0_0_2__0 )*
            {
             before(grammarAccess.getTransitionModeAccess().getGroup_0_0_2()); 
            // InternalArduinoML.g:3667:2: ( rule__TransitionMode__Group_0_0_2__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==38) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalArduinoML.g:3667:3: rule__TransitionMode__Group_0_0_2__0
            	    {
            	    pushFollow(FOLLOW_30);
            	    rule__TransitionMode__Group_0_0_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

             after(grammarAccess.getTransitionModeAccess().getGroup_0_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionMode__Group_0_0__2__Impl"


    // $ANTLR start "rule__TransitionMode__Group_0_0__3"
    // InternalArduinoML.g:3675:1: rule__TransitionMode__Group_0_0__3 : rule__TransitionMode__Group_0_0__3__Impl ;
    public final void rule__TransitionMode__Group_0_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3679:1: ( rule__TransitionMode__Group_0_0__3__Impl )
            // InternalArduinoML.g:3680:2: rule__TransitionMode__Group_0_0__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TransitionMode__Group_0_0__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionMode__Group_0_0__3"


    // $ANTLR start "rule__TransitionMode__Group_0_0__3__Impl"
    // InternalArduinoML.g:3686:1: rule__TransitionMode__Group_0_0__3__Impl : ( ( rule__TransitionMode__Group_0_0_3__0 )? ) ;
    public final void rule__TransitionMode__Group_0_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3690:1: ( ( ( rule__TransitionMode__Group_0_0_3__0 )? ) )
            // InternalArduinoML.g:3691:1: ( ( rule__TransitionMode__Group_0_0_3__0 )? )
            {
            // InternalArduinoML.g:3691:1: ( ( rule__TransitionMode__Group_0_0_3__0 )? )
            // InternalArduinoML.g:3692:2: ( rule__TransitionMode__Group_0_0_3__0 )?
            {
             before(grammarAccess.getTransitionModeAccess().getGroup_0_0_3()); 
            // InternalArduinoML.g:3693:2: ( rule__TransitionMode__Group_0_0_3__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==39) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalArduinoML.g:3693:3: rule__TransitionMode__Group_0_0_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TransitionMode__Group_0_0_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTransitionModeAccess().getGroup_0_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionMode__Group_0_0__3__Impl"


    // $ANTLR start "rule__TransitionMode__Group_0_0_1_0__0"
    // InternalArduinoML.g:3702:1: rule__TransitionMode__Group_0_0_1_0__0 : rule__TransitionMode__Group_0_0_1_0__0__Impl rule__TransitionMode__Group_0_0_1_0__1 ;
    public final void rule__TransitionMode__Group_0_0_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3706:1: ( rule__TransitionMode__Group_0_0_1_0__0__Impl rule__TransitionMode__Group_0_0_1_0__1 )
            // InternalArduinoML.g:3707:2: rule__TransitionMode__Group_0_0_1_0__0__Impl rule__TransitionMode__Group_0_0_1_0__1
            {
            pushFollow(FOLLOW_31);
            rule__TransitionMode__Group_0_0_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TransitionMode__Group_0_0_1_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionMode__Group_0_0_1_0__0"


    // $ANTLR start "rule__TransitionMode__Group_0_0_1_0__0__Impl"
    // InternalArduinoML.g:3714:1: rule__TransitionMode__Group_0_0_1_0__0__Impl : ( ( rule__TransitionMode__DigitalsAssignment_0_0_1_0_0 ) ) ;
    public final void rule__TransitionMode__Group_0_0_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3718:1: ( ( ( rule__TransitionMode__DigitalsAssignment_0_0_1_0_0 ) ) )
            // InternalArduinoML.g:3719:1: ( ( rule__TransitionMode__DigitalsAssignment_0_0_1_0_0 ) )
            {
            // InternalArduinoML.g:3719:1: ( ( rule__TransitionMode__DigitalsAssignment_0_0_1_0_0 ) )
            // InternalArduinoML.g:3720:2: ( rule__TransitionMode__DigitalsAssignment_0_0_1_0_0 )
            {
             before(grammarAccess.getTransitionModeAccess().getDigitalsAssignment_0_0_1_0_0()); 
            // InternalArduinoML.g:3721:2: ( rule__TransitionMode__DigitalsAssignment_0_0_1_0_0 )
            // InternalArduinoML.g:3721:3: rule__TransitionMode__DigitalsAssignment_0_0_1_0_0
            {
            pushFollow(FOLLOW_2);
            rule__TransitionMode__DigitalsAssignment_0_0_1_0_0();

            state._fsp--;


            }

             after(grammarAccess.getTransitionModeAccess().getDigitalsAssignment_0_0_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionMode__Group_0_0_1_0__0__Impl"


    // $ANTLR start "rule__TransitionMode__Group_0_0_1_0__1"
    // InternalArduinoML.g:3729:1: rule__TransitionMode__Group_0_0_1_0__1 : rule__TransitionMode__Group_0_0_1_0__1__Impl rule__TransitionMode__Group_0_0_1_0__2 ;
    public final void rule__TransitionMode__Group_0_0_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3733:1: ( rule__TransitionMode__Group_0_0_1_0__1__Impl rule__TransitionMode__Group_0_0_1_0__2 )
            // InternalArduinoML.g:3734:2: rule__TransitionMode__Group_0_0_1_0__1__Impl rule__TransitionMode__Group_0_0_1_0__2
            {
            pushFollow(FOLLOW_27);
            rule__TransitionMode__Group_0_0_1_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TransitionMode__Group_0_0_1_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionMode__Group_0_0_1_0__1"


    // $ANTLR start "rule__TransitionMode__Group_0_0_1_0__1__Impl"
    // InternalArduinoML.g:3741:1: rule__TransitionMode__Group_0_0_1_0__1__Impl : ( 'is' ) ;
    public final void rule__TransitionMode__Group_0_0_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3745:1: ( ( 'is' ) )
            // InternalArduinoML.g:3746:1: ( 'is' )
            {
            // InternalArduinoML.g:3746:1: ( 'is' )
            // InternalArduinoML.g:3747:2: 'is'
            {
             before(grammarAccess.getTransitionModeAccess().getIsKeyword_0_0_1_0_1()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getTransitionModeAccess().getIsKeyword_0_0_1_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionMode__Group_0_0_1_0__1__Impl"


    // $ANTLR start "rule__TransitionMode__Group_0_0_1_0__2"
    // InternalArduinoML.g:3756:1: rule__TransitionMode__Group_0_0_1_0__2 : rule__TransitionMode__Group_0_0_1_0__2__Impl ;
    public final void rule__TransitionMode__Group_0_0_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3760:1: ( rule__TransitionMode__Group_0_0_1_0__2__Impl )
            // InternalArduinoML.g:3761:2: rule__TransitionMode__Group_0_0_1_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TransitionMode__Group_0_0_1_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionMode__Group_0_0_1_0__2"


    // $ANTLR start "rule__TransitionMode__Group_0_0_1_0__2__Impl"
    // InternalArduinoML.g:3767:1: rule__TransitionMode__Group_0_0_1_0__2__Impl : ( ( rule__TransitionMode__D_valuesAssignment_0_0_1_0_2 ) ) ;
    public final void rule__TransitionMode__Group_0_0_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3771:1: ( ( ( rule__TransitionMode__D_valuesAssignment_0_0_1_0_2 ) ) )
            // InternalArduinoML.g:3772:1: ( ( rule__TransitionMode__D_valuesAssignment_0_0_1_0_2 ) )
            {
            // InternalArduinoML.g:3772:1: ( ( rule__TransitionMode__D_valuesAssignment_0_0_1_0_2 ) )
            // InternalArduinoML.g:3773:2: ( rule__TransitionMode__D_valuesAssignment_0_0_1_0_2 )
            {
             before(grammarAccess.getTransitionModeAccess().getD_valuesAssignment_0_0_1_0_2()); 
            // InternalArduinoML.g:3774:2: ( rule__TransitionMode__D_valuesAssignment_0_0_1_0_2 )
            // InternalArduinoML.g:3774:3: rule__TransitionMode__D_valuesAssignment_0_0_1_0_2
            {
            pushFollow(FOLLOW_2);
            rule__TransitionMode__D_valuesAssignment_0_0_1_0_2();

            state._fsp--;


            }

             after(grammarAccess.getTransitionModeAccess().getD_valuesAssignment_0_0_1_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionMode__Group_0_0_1_0__2__Impl"


    // $ANTLR start "rule__TransitionMode__Group_0_0_1_1__0"
    // InternalArduinoML.g:3783:1: rule__TransitionMode__Group_0_0_1_1__0 : rule__TransitionMode__Group_0_0_1_1__0__Impl rule__TransitionMode__Group_0_0_1_1__1 ;
    public final void rule__TransitionMode__Group_0_0_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3787:1: ( rule__TransitionMode__Group_0_0_1_1__0__Impl rule__TransitionMode__Group_0_0_1_1__1 )
            // InternalArduinoML.g:3788:2: rule__TransitionMode__Group_0_0_1_1__0__Impl rule__TransitionMode__Group_0_0_1_1__1
            {
            pushFollow(FOLLOW_32);
            rule__TransitionMode__Group_0_0_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TransitionMode__Group_0_0_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionMode__Group_0_0_1_1__0"


    // $ANTLR start "rule__TransitionMode__Group_0_0_1_1__0__Impl"
    // InternalArduinoML.g:3795:1: rule__TransitionMode__Group_0_0_1_1__0__Impl : ( ( rule__TransitionMode__AnalogsAssignment_0_0_1_1_0 ) ) ;
    public final void rule__TransitionMode__Group_0_0_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3799:1: ( ( ( rule__TransitionMode__AnalogsAssignment_0_0_1_1_0 ) ) )
            // InternalArduinoML.g:3800:1: ( ( rule__TransitionMode__AnalogsAssignment_0_0_1_1_0 ) )
            {
            // InternalArduinoML.g:3800:1: ( ( rule__TransitionMode__AnalogsAssignment_0_0_1_1_0 ) )
            // InternalArduinoML.g:3801:2: ( rule__TransitionMode__AnalogsAssignment_0_0_1_1_0 )
            {
             before(grammarAccess.getTransitionModeAccess().getAnalogsAssignment_0_0_1_1_0()); 
            // InternalArduinoML.g:3802:2: ( rule__TransitionMode__AnalogsAssignment_0_0_1_1_0 )
            // InternalArduinoML.g:3802:3: rule__TransitionMode__AnalogsAssignment_0_0_1_1_0
            {
            pushFollow(FOLLOW_2);
            rule__TransitionMode__AnalogsAssignment_0_0_1_1_0();

            state._fsp--;


            }

             after(grammarAccess.getTransitionModeAccess().getAnalogsAssignment_0_0_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionMode__Group_0_0_1_1__0__Impl"


    // $ANTLR start "rule__TransitionMode__Group_0_0_1_1__1"
    // InternalArduinoML.g:3810:1: rule__TransitionMode__Group_0_0_1_1__1 : rule__TransitionMode__Group_0_0_1_1__1__Impl rule__TransitionMode__Group_0_0_1_1__2 ;
    public final void rule__TransitionMode__Group_0_0_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3814:1: ( rule__TransitionMode__Group_0_0_1_1__1__Impl rule__TransitionMode__Group_0_0_1_1__2 )
            // InternalArduinoML.g:3815:2: rule__TransitionMode__Group_0_0_1_1__1__Impl rule__TransitionMode__Group_0_0_1_1__2
            {
            pushFollow(FOLLOW_15);
            rule__TransitionMode__Group_0_0_1_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TransitionMode__Group_0_0_1_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionMode__Group_0_0_1_1__1"


    // $ANTLR start "rule__TransitionMode__Group_0_0_1_1__1__Impl"
    // InternalArduinoML.g:3822:1: rule__TransitionMode__Group_0_0_1_1__1__Impl : ( ( rule__TransitionMode__CompAssignment_0_0_1_1_1 ) ) ;
    public final void rule__TransitionMode__Group_0_0_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3826:1: ( ( ( rule__TransitionMode__CompAssignment_0_0_1_1_1 ) ) )
            // InternalArduinoML.g:3827:1: ( ( rule__TransitionMode__CompAssignment_0_0_1_1_1 ) )
            {
            // InternalArduinoML.g:3827:1: ( ( rule__TransitionMode__CompAssignment_0_0_1_1_1 ) )
            // InternalArduinoML.g:3828:2: ( rule__TransitionMode__CompAssignment_0_0_1_1_1 )
            {
             before(grammarAccess.getTransitionModeAccess().getCompAssignment_0_0_1_1_1()); 
            // InternalArduinoML.g:3829:2: ( rule__TransitionMode__CompAssignment_0_0_1_1_1 )
            // InternalArduinoML.g:3829:3: rule__TransitionMode__CompAssignment_0_0_1_1_1
            {
            pushFollow(FOLLOW_2);
            rule__TransitionMode__CompAssignment_0_0_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getTransitionModeAccess().getCompAssignment_0_0_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionMode__Group_0_0_1_1__1__Impl"


    // $ANTLR start "rule__TransitionMode__Group_0_0_1_1__2"
    // InternalArduinoML.g:3837:1: rule__TransitionMode__Group_0_0_1_1__2 : rule__TransitionMode__Group_0_0_1_1__2__Impl ;
    public final void rule__TransitionMode__Group_0_0_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3841:1: ( rule__TransitionMode__Group_0_0_1_1__2__Impl )
            // InternalArduinoML.g:3842:2: rule__TransitionMode__Group_0_0_1_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TransitionMode__Group_0_0_1_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionMode__Group_0_0_1_1__2"


    // $ANTLR start "rule__TransitionMode__Group_0_0_1_1__2__Impl"
    // InternalArduinoML.g:3848:1: rule__TransitionMode__Group_0_0_1_1__2__Impl : ( ( rule__TransitionMode__A_valuesAssignment_0_0_1_1_2 ) ) ;
    public final void rule__TransitionMode__Group_0_0_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3852:1: ( ( ( rule__TransitionMode__A_valuesAssignment_0_0_1_1_2 ) ) )
            // InternalArduinoML.g:3853:1: ( ( rule__TransitionMode__A_valuesAssignment_0_0_1_1_2 ) )
            {
            // InternalArduinoML.g:3853:1: ( ( rule__TransitionMode__A_valuesAssignment_0_0_1_1_2 ) )
            // InternalArduinoML.g:3854:2: ( rule__TransitionMode__A_valuesAssignment_0_0_1_1_2 )
            {
             before(grammarAccess.getTransitionModeAccess().getA_valuesAssignment_0_0_1_1_2()); 
            // InternalArduinoML.g:3855:2: ( rule__TransitionMode__A_valuesAssignment_0_0_1_1_2 )
            // InternalArduinoML.g:3855:3: rule__TransitionMode__A_valuesAssignment_0_0_1_1_2
            {
            pushFollow(FOLLOW_2);
            rule__TransitionMode__A_valuesAssignment_0_0_1_1_2();

            state._fsp--;


            }

             after(grammarAccess.getTransitionModeAccess().getA_valuesAssignment_0_0_1_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionMode__Group_0_0_1_1__2__Impl"


    // $ANTLR start "rule__TransitionMode__Group_0_0_2__0"
    // InternalArduinoML.g:3864:1: rule__TransitionMode__Group_0_0_2__0 : rule__TransitionMode__Group_0_0_2__0__Impl rule__TransitionMode__Group_0_0_2__1 ;
    public final void rule__TransitionMode__Group_0_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3868:1: ( rule__TransitionMode__Group_0_0_2__0__Impl rule__TransitionMode__Group_0_0_2__1 )
            // InternalArduinoML.g:3869:2: rule__TransitionMode__Group_0_0_2__0__Impl rule__TransitionMode__Group_0_0_2__1
            {
            pushFollow(FOLLOW_4);
            rule__TransitionMode__Group_0_0_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TransitionMode__Group_0_0_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionMode__Group_0_0_2__0"


    // $ANTLR start "rule__TransitionMode__Group_0_0_2__0__Impl"
    // InternalArduinoML.g:3876:1: rule__TransitionMode__Group_0_0_2__0__Impl : ( 'and' ) ;
    public final void rule__TransitionMode__Group_0_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3880:1: ( ( 'and' ) )
            // InternalArduinoML.g:3881:1: ( 'and' )
            {
            // InternalArduinoML.g:3881:1: ( 'and' )
            // InternalArduinoML.g:3882:2: 'and'
            {
             before(grammarAccess.getTransitionModeAccess().getAndKeyword_0_0_2_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getTransitionModeAccess().getAndKeyword_0_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionMode__Group_0_0_2__0__Impl"


    // $ANTLR start "rule__TransitionMode__Group_0_0_2__1"
    // InternalArduinoML.g:3891:1: rule__TransitionMode__Group_0_0_2__1 : rule__TransitionMode__Group_0_0_2__1__Impl ;
    public final void rule__TransitionMode__Group_0_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3895:1: ( rule__TransitionMode__Group_0_0_2__1__Impl )
            // InternalArduinoML.g:3896:2: rule__TransitionMode__Group_0_0_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TransitionMode__Group_0_0_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionMode__Group_0_0_2__1"


    // $ANTLR start "rule__TransitionMode__Group_0_0_2__1__Impl"
    // InternalArduinoML.g:3902:1: rule__TransitionMode__Group_0_0_2__1__Impl : ( ( rule__TransitionMode__Alternatives_0_0_2_1 ) ) ;
    public final void rule__TransitionMode__Group_0_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3906:1: ( ( ( rule__TransitionMode__Alternatives_0_0_2_1 ) ) )
            // InternalArduinoML.g:3907:1: ( ( rule__TransitionMode__Alternatives_0_0_2_1 ) )
            {
            // InternalArduinoML.g:3907:1: ( ( rule__TransitionMode__Alternatives_0_0_2_1 ) )
            // InternalArduinoML.g:3908:2: ( rule__TransitionMode__Alternatives_0_0_2_1 )
            {
             before(grammarAccess.getTransitionModeAccess().getAlternatives_0_0_2_1()); 
            // InternalArduinoML.g:3909:2: ( rule__TransitionMode__Alternatives_0_0_2_1 )
            // InternalArduinoML.g:3909:3: rule__TransitionMode__Alternatives_0_0_2_1
            {
            pushFollow(FOLLOW_2);
            rule__TransitionMode__Alternatives_0_0_2_1();

            state._fsp--;


            }

             after(grammarAccess.getTransitionModeAccess().getAlternatives_0_0_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionMode__Group_0_0_2__1__Impl"


    // $ANTLR start "rule__TransitionMode__Group_0_0_2_1_0__0"
    // InternalArduinoML.g:3918:1: rule__TransitionMode__Group_0_0_2_1_0__0 : rule__TransitionMode__Group_0_0_2_1_0__0__Impl rule__TransitionMode__Group_0_0_2_1_0__1 ;
    public final void rule__TransitionMode__Group_0_0_2_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3922:1: ( rule__TransitionMode__Group_0_0_2_1_0__0__Impl rule__TransitionMode__Group_0_0_2_1_0__1 )
            // InternalArduinoML.g:3923:2: rule__TransitionMode__Group_0_0_2_1_0__0__Impl rule__TransitionMode__Group_0_0_2_1_0__1
            {
            pushFollow(FOLLOW_31);
            rule__TransitionMode__Group_0_0_2_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TransitionMode__Group_0_0_2_1_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionMode__Group_0_0_2_1_0__0"


    // $ANTLR start "rule__TransitionMode__Group_0_0_2_1_0__0__Impl"
    // InternalArduinoML.g:3930:1: rule__TransitionMode__Group_0_0_2_1_0__0__Impl : ( ( rule__TransitionMode__DigitalsAssignment_0_0_2_1_0_0 ) ) ;
    public final void rule__TransitionMode__Group_0_0_2_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3934:1: ( ( ( rule__TransitionMode__DigitalsAssignment_0_0_2_1_0_0 ) ) )
            // InternalArduinoML.g:3935:1: ( ( rule__TransitionMode__DigitalsAssignment_0_0_2_1_0_0 ) )
            {
            // InternalArduinoML.g:3935:1: ( ( rule__TransitionMode__DigitalsAssignment_0_0_2_1_0_0 ) )
            // InternalArduinoML.g:3936:2: ( rule__TransitionMode__DigitalsAssignment_0_0_2_1_0_0 )
            {
             before(grammarAccess.getTransitionModeAccess().getDigitalsAssignment_0_0_2_1_0_0()); 
            // InternalArduinoML.g:3937:2: ( rule__TransitionMode__DigitalsAssignment_0_0_2_1_0_0 )
            // InternalArduinoML.g:3937:3: rule__TransitionMode__DigitalsAssignment_0_0_2_1_0_0
            {
            pushFollow(FOLLOW_2);
            rule__TransitionMode__DigitalsAssignment_0_0_2_1_0_0();

            state._fsp--;


            }

             after(grammarAccess.getTransitionModeAccess().getDigitalsAssignment_0_0_2_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionMode__Group_0_0_2_1_0__0__Impl"


    // $ANTLR start "rule__TransitionMode__Group_0_0_2_1_0__1"
    // InternalArduinoML.g:3945:1: rule__TransitionMode__Group_0_0_2_1_0__1 : rule__TransitionMode__Group_0_0_2_1_0__1__Impl rule__TransitionMode__Group_0_0_2_1_0__2 ;
    public final void rule__TransitionMode__Group_0_0_2_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3949:1: ( rule__TransitionMode__Group_0_0_2_1_0__1__Impl rule__TransitionMode__Group_0_0_2_1_0__2 )
            // InternalArduinoML.g:3950:2: rule__TransitionMode__Group_0_0_2_1_0__1__Impl rule__TransitionMode__Group_0_0_2_1_0__2
            {
            pushFollow(FOLLOW_27);
            rule__TransitionMode__Group_0_0_2_1_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TransitionMode__Group_0_0_2_1_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionMode__Group_0_0_2_1_0__1"


    // $ANTLR start "rule__TransitionMode__Group_0_0_2_1_0__1__Impl"
    // InternalArduinoML.g:3957:1: rule__TransitionMode__Group_0_0_2_1_0__1__Impl : ( 'is' ) ;
    public final void rule__TransitionMode__Group_0_0_2_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3961:1: ( ( 'is' ) )
            // InternalArduinoML.g:3962:1: ( 'is' )
            {
            // InternalArduinoML.g:3962:1: ( 'is' )
            // InternalArduinoML.g:3963:2: 'is'
            {
             before(grammarAccess.getTransitionModeAccess().getIsKeyword_0_0_2_1_0_1()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getTransitionModeAccess().getIsKeyword_0_0_2_1_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionMode__Group_0_0_2_1_0__1__Impl"


    // $ANTLR start "rule__TransitionMode__Group_0_0_2_1_0__2"
    // InternalArduinoML.g:3972:1: rule__TransitionMode__Group_0_0_2_1_0__2 : rule__TransitionMode__Group_0_0_2_1_0__2__Impl ;
    public final void rule__TransitionMode__Group_0_0_2_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3976:1: ( rule__TransitionMode__Group_0_0_2_1_0__2__Impl )
            // InternalArduinoML.g:3977:2: rule__TransitionMode__Group_0_0_2_1_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TransitionMode__Group_0_0_2_1_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionMode__Group_0_0_2_1_0__2"


    // $ANTLR start "rule__TransitionMode__Group_0_0_2_1_0__2__Impl"
    // InternalArduinoML.g:3983:1: rule__TransitionMode__Group_0_0_2_1_0__2__Impl : ( ( rule__TransitionMode__D_valuesAssignment_0_0_2_1_0_2 ) ) ;
    public final void rule__TransitionMode__Group_0_0_2_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3987:1: ( ( ( rule__TransitionMode__D_valuesAssignment_0_0_2_1_0_2 ) ) )
            // InternalArduinoML.g:3988:1: ( ( rule__TransitionMode__D_valuesAssignment_0_0_2_1_0_2 ) )
            {
            // InternalArduinoML.g:3988:1: ( ( rule__TransitionMode__D_valuesAssignment_0_0_2_1_0_2 ) )
            // InternalArduinoML.g:3989:2: ( rule__TransitionMode__D_valuesAssignment_0_0_2_1_0_2 )
            {
             before(grammarAccess.getTransitionModeAccess().getD_valuesAssignment_0_0_2_1_0_2()); 
            // InternalArduinoML.g:3990:2: ( rule__TransitionMode__D_valuesAssignment_0_0_2_1_0_2 )
            // InternalArduinoML.g:3990:3: rule__TransitionMode__D_valuesAssignment_0_0_2_1_0_2
            {
            pushFollow(FOLLOW_2);
            rule__TransitionMode__D_valuesAssignment_0_0_2_1_0_2();

            state._fsp--;


            }

             after(grammarAccess.getTransitionModeAccess().getD_valuesAssignment_0_0_2_1_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionMode__Group_0_0_2_1_0__2__Impl"


    // $ANTLR start "rule__TransitionMode__Group_0_0_2_1_1__0"
    // InternalArduinoML.g:3999:1: rule__TransitionMode__Group_0_0_2_1_1__0 : rule__TransitionMode__Group_0_0_2_1_1__0__Impl rule__TransitionMode__Group_0_0_2_1_1__1 ;
    public final void rule__TransitionMode__Group_0_0_2_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:4003:1: ( rule__TransitionMode__Group_0_0_2_1_1__0__Impl rule__TransitionMode__Group_0_0_2_1_1__1 )
            // InternalArduinoML.g:4004:2: rule__TransitionMode__Group_0_0_2_1_1__0__Impl rule__TransitionMode__Group_0_0_2_1_1__1
            {
            pushFollow(FOLLOW_32);
            rule__TransitionMode__Group_0_0_2_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TransitionMode__Group_0_0_2_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionMode__Group_0_0_2_1_1__0"


    // $ANTLR start "rule__TransitionMode__Group_0_0_2_1_1__0__Impl"
    // InternalArduinoML.g:4011:1: rule__TransitionMode__Group_0_0_2_1_1__0__Impl : ( ( rule__TransitionMode__AnalogsAssignment_0_0_2_1_1_0 ) ) ;
    public final void rule__TransitionMode__Group_0_0_2_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:4015:1: ( ( ( rule__TransitionMode__AnalogsAssignment_0_0_2_1_1_0 ) ) )
            // InternalArduinoML.g:4016:1: ( ( rule__TransitionMode__AnalogsAssignment_0_0_2_1_1_0 ) )
            {
            // InternalArduinoML.g:4016:1: ( ( rule__TransitionMode__AnalogsAssignment_0_0_2_1_1_0 ) )
            // InternalArduinoML.g:4017:2: ( rule__TransitionMode__AnalogsAssignment_0_0_2_1_1_0 )
            {
             before(grammarAccess.getTransitionModeAccess().getAnalogsAssignment_0_0_2_1_1_0()); 
            // InternalArduinoML.g:4018:2: ( rule__TransitionMode__AnalogsAssignment_0_0_2_1_1_0 )
            // InternalArduinoML.g:4018:3: rule__TransitionMode__AnalogsAssignment_0_0_2_1_1_0
            {
            pushFollow(FOLLOW_2);
            rule__TransitionMode__AnalogsAssignment_0_0_2_1_1_0();

            state._fsp--;


            }

             after(grammarAccess.getTransitionModeAccess().getAnalogsAssignment_0_0_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionMode__Group_0_0_2_1_1__0__Impl"


    // $ANTLR start "rule__TransitionMode__Group_0_0_2_1_1__1"
    // InternalArduinoML.g:4026:1: rule__TransitionMode__Group_0_0_2_1_1__1 : rule__TransitionMode__Group_0_0_2_1_1__1__Impl rule__TransitionMode__Group_0_0_2_1_1__2 ;
    public final void rule__TransitionMode__Group_0_0_2_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:4030:1: ( rule__TransitionMode__Group_0_0_2_1_1__1__Impl rule__TransitionMode__Group_0_0_2_1_1__2 )
            // InternalArduinoML.g:4031:2: rule__TransitionMode__Group_0_0_2_1_1__1__Impl rule__TransitionMode__Group_0_0_2_1_1__2
            {
            pushFollow(FOLLOW_15);
            rule__TransitionMode__Group_0_0_2_1_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TransitionMode__Group_0_0_2_1_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionMode__Group_0_0_2_1_1__1"


    // $ANTLR start "rule__TransitionMode__Group_0_0_2_1_1__1__Impl"
    // InternalArduinoML.g:4038:1: rule__TransitionMode__Group_0_0_2_1_1__1__Impl : ( ( rule__TransitionMode__CompAssignment_0_0_2_1_1_1 ) ) ;
    public final void rule__TransitionMode__Group_0_0_2_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:4042:1: ( ( ( rule__TransitionMode__CompAssignment_0_0_2_1_1_1 ) ) )
            // InternalArduinoML.g:4043:1: ( ( rule__TransitionMode__CompAssignment_0_0_2_1_1_1 ) )
            {
            // InternalArduinoML.g:4043:1: ( ( rule__TransitionMode__CompAssignment_0_0_2_1_1_1 ) )
            // InternalArduinoML.g:4044:2: ( rule__TransitionMode__CompAssignment_0_0_2_1_1_1 )
            {
             before(grammarAccess.getTransitionModeAccess().getCompAssignment_0_0_2_1_1_1()); 
            // InternalArduinoML.g:4045:2: ( rule__TransitionMode__CompAssignment_0_0_2_1_1_1 )
            // InternalArduinoML.g:4045:3: rule__TransitionMode__CompAssignment_0_0_2_1_1_1
            {
            pushFollow(FOLLOW_2);
            rule__TransitionMode__CompAssignment_0_0_2_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getTransitionModeAccess().getCompAssignment_0_0_2_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionMode__Group_0_0_2_1_1__1__Impl"


    // $ANTLR start "rule__TransitionMode__Group_0_0_2_1_1__2"
    // InternalArduinoML.g:4053:1: rule__TransitionMode__Group_0_0_2_1_1__2 : rule__TransitionMode__Group_0_0_2_1_1__2__Impl ;
    public final void rule__TransitionMode__Group_0_0_2_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:4057:1: ( rule__TransitionMode__Group_0_0_2_1_1__2__Impl )
            // InternalArduinoML.g:4058:2: rule__TransitionMode__Group_0_0_2_1_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TransitionMode__Group_0_0_2_1_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionMode__Group_0_0_2_1_1__2"


    // $ANTLR start "rule__TransitionMode__Group_0_0_2_1_1__2__Impl"
    // InternalArduinoML.g:4064:1: rule__TransitionMode__Group_0_0_2_1_1__2__Impl : ( ( rule__TransitionMode__A_valuesAssignment_0_0_2_1_1_2 ) ) ;
    public final void rule__TransitionMode__Group_0_0_2_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:4068:1: ( ( ( rule__TransitionMode__A_valuesAssignment_0_0_2_1_1_2 ) ) )
            // InternalArduinoML.g:4069:1: ( ( rule__TransitionMode__A_valuesAssignment_0_0_2_1_1_2 ) )
            {
            // InternalArduinoML.g:4069:1: ( ( rule__TransitionMode__A_valuesAssignment_0_0_2_1_1_2 ) )
            // InternalArduinoML.g:4070:2: ( rule__TransitionMode__A_valuesAssignment_0_0_2_1_1_2 )
            {
             before(grammarAccess.getTransitionModeAccess().getA_valuesAssignment_0_0_2_1_1_2()); 
            // InternalArduinoML.g:4071:2: ( rule__TransitionMode__A_valuesAssignment_0_0_2_1_1_2 )
            // InternalArduinoML.g:4071:3: rule__TransitionMode__A_valuesAssignment_0_0_2_1_1_2
            {
            pushFollow(FOLLOW_2);
            rule__TransitionMode__A_valuesAssignment_0_0_2_1_1_2();

            state._fsp--;


            }

             after(grammarAccess.getTransitionModeAccess().getA_valuesAssignment_0_0_2_1_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionMode__Group_0_0_2_1_1__2__Impl"


    // $ANTLR start "rule__TransitionMode__Group_0_0_3__0"
    // InternalArduinoML.g:4080:1: rule__TransitionMode__Group_0_0_3__0 : rule__TransitionMode__Group_0_0_3__0__Impl rule__TransitionMode__Group_0_0_3__1 ;
    public final void rule__TransitionMode__Group_0_0_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:4084:1: ( rule__TransitionMode__Group_0_0_3__0__Impl rule__TransitionMode__Group_0_0_3__1 )
            // InternalArduinoML.g:4085:2: rule__TransitionMode__Group_0_0_3__0__Impl rule__TransitionMode__Group_0_0_3__1
            {
            pushFollow(FOLLOW_15);
            rule__TransitionMode__Group_0_0_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TransitionMode__Group_0_0_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionMode__Group_0_0_3__0"


    // $ANTLR start "rule__TransitionMode__Group_0_0_3__0__Impl"
    // InternalArduinoML.g:4092:1: rule__TransitionMode__Group_0_0_3__0__Impl : ( 'wait' ) ;
    public final void rule__TransitionMode__Group_0_0_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:4096:1: ( ( 'wait' ) )
            // InternalArduinoML.g:4097:1: ( 'wait' )
            {
            // InternalArduinoML.g:4097:1: ( 'wait' )
            // InternalArduinoML.g:4098:2: 'wait'
            {
             before(grammarAccess.getTransitionModeAccess().getWaitKeyword_0_0_3_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getTransitionModeAccess().getWaitKeyword_0_0_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionMode__Group_0_0_3__0__Impl"


    // $ANTLR start "rule__TransitionMode__Group_0_0_3__1"
    // InternalArduinoML.g:4107:1: rule__TransitionMode__Group_0_0_3__1 : rule__TransitionMode__Group_0_0_3__1__Impl rule__TransitionMode__Group_0_0_3__2 ;
    public final void rule__TransitionMode__Group_0_0_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:4111:1: ( rule__TransitionMode__Group_0_0_3__1__Impl rule__TransitionMode__Group_0_0_3__2 )
            // InternalArduinoML.g:4112:2: rule__TransitionMode__Group_0_0_3__1__Impl rule__TransitionMode__Group_0_0_3__2
            {
            pushFollow(FOLLOW_33);
            rule__TransitionMode__Group_0_0_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TransitionMode__Group_0_0_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionMode__Group_0_0_3__1"


    // $ANTLR start "rule__TransitionMode__Group_0_0_3__1__Impl"
    // InternalArduinoML.g:4119:1: rule__TransitionMode__Group_0_0_3__1__Impl : ( ( rule__TransitionMode__TimeAssignment_0_0_3_1 ) ) ;
    public final void rule__TransitionMode__Group_0_0_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:4123:1: ( ( ( rule__TransitionMode__TimeAssignment_0_0_3_1 ) ) )
            // InternalArduinoML.g:4124:1: ( ( rule__TransitionMode__TimeAssignment_0_0_3_1 ) )
            {
            // InternalArduinoML.g:4124:1: ( ( rule__TransitionMode__TimeAssignment_0_0_3_1 ) )
            // InternalArduinoML.g:4125:2: ( rule__TransitionMode__TimeAssignment_0_0_3_1 )
            {
             before(grammarAccess.getTransitionModeAccess().getTimeAssignment_0_0_3_1()); 
            // InternalArduinoML.g:4126:2: ( rule__TransitionMode__TimeAssignment_0_0_3_1 )
            // InternalArduinoML.g:4126:3: rule__TransitionMode__TimeAssignment_0_0_3_1
            {
            pushFollow(FOLLOW_2);
            rule__TransitionMode__TimeAssignment_0_0_3_1();

            state._fsp--;


            }

             after(grammarAccess.getTransitionModeAccess().getTimeAssignment_0_0_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionMode__Group_0_0_3__1__Impl"


    // $ANTLR start "rule__TransitionMode__Group_0_0_3__2"
    // InternalArduinoML.g:4134:1: rule__TransitionMode__Group_0_0_3__2 : rule__TransitionMode__Group_0_0_3__2__Impl rule__TransitionMode__Group_0_0_3__3 ;
    public final void rule__TransitionMode__Group_0_0_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:4138:1: ( rule__TransitionMode__Group_0_0_3__2__Impl rule__TransitionMode__Group_0_0_3__3 )
            // InternalArduinoML.g:4139:2: rule__TransitionMode__Group_0_0_3__2__Impl rule__TransitionMode__Group_0_0_3__3
            {
            pushFollow(FOLLOW_34);
            rule__TransitionMode__Group_0_0_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TransitionMode__Group_0_0_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionMode__Group_0_0_3__2"


    // $ANTLR start "rule__TransitionMode__Group_0_0_3__2__Impl"
    // InternalArduinoML.g:4146:1: rule__TransitionMode__Group_0_0_3__2__Impl : ( ( rule__TransitionMode__UnitAssignment_0_0_3_2 ) ) ;
    public final void rule__TransitionMode__Group_0_0_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:4150:1: ( ( ( rule__TransitionMode__UnitAssignment_0_0_3_2 ) ) )
            // InternalArduinoML.g:4151:1: ( ( rule__TransitionMode__UnitAssignment_0_0_3_2 ) )
            {
            // InternalArduinoML.g:4151:1: ( ( rule__TransitionMode__UnitAssignment_0_0_3_2 ) )
            // InternalArduinoML.g:4152:2: ( rule__TransitionMode__UnitAssignment_0_0_3_2 )
            {
             before(grammarAccess.getTransitionModeAccess().getUnitAssignment_0_0_3_2()); 
            // InternalArduinoML.g:4153:2: ( rule__TransitionMode__UnitAssignment_0_0_3_2 )
            // InternalArduinoML.g:4153:3: rule__TransitionMode__UnitAssignment_0_0_3_2
            {
            pushFollow(FOLLOW_2);
            rule__TransitionMode__UnitAssignment_0_0_3_2();

            state._fsp--;


            }

             after(grammarAccess.getTransitionModeAccess().getUnitAssignment_0_0_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionMode__Group_0_0_3__2__Impl"


    // $ANTLR start "rule__TransitionMode__Group_0_0_3__3"
    // InternalArduinoML.g:4161:1: rule__TransitionMode__Group_0_0_3__3 : rule__TransitionMode__Group_0_0_3__3__Impl ;
    public final void rule__TransitionMode__Group_0_0_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:4165:1: ( rule__TransitionMode__Group_0_0_3__3__Impl )
            // InternalArduinoML.g:4166:2: rule__TransitionMode__Group_0_0_3__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TransitionMode__Group_0_0_3__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionMode__Group_0_0_3__3"


    // $ANTLR start "rule__TransitionMode__Group_0_0_3__3__Impl"
    // InternalArduinoML.g:4172:1: rule__TransitionMode__Group_0_0_3__3__Impl : ( 'then' ) ;
    public final void rule__TransitionMode__Group_0_0_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:4176:1: ( ( 'then' ) )
            // InternalArduinoML.g:4177:1: ( 'then' )
            {
            // InternalArduinoML.g:4177:1: ( 'then' )
            // InternalArduinoML.g:4178:2: 'then'
            {
             before(grammarAccess.getTransitionModeAccess().getThenKeyword_0_0_3_3()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getTransitionModeAccess().getThenKeyword_0_0_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionMode__Group_0_0_3__3__Impl"


    // $ANTLR start "rule__TransitionMode__Group_0_1__0"
    // InternalArduinoML.g:4188:1: rule__TransitionMode__Group_0_1__0 : rule__TransitionMode__Group_0_1__0__Impl rule__TransitionMode__Group_0_1__1 ;
    public final void rule__TransitionMode__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:4192:1: ( rule__TransitionMode__Group_0_1__0__Impl rule__TransitionMode__Group_0_1__1 )
            // InternalArduinoML.g:4193:2: rule__TransitionMode__Group_0_1__0__Impl rule__TransitionMode__Group_0_1__1
            {
            pushFollow(FOLLOW_15);
            rule__TransitionMode__Group_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TransitionMode__Group_0_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionMode__Group_0_1__0"


    // $ANTLR start "rule__TransitionMode__Group_0_1__0__Impl"
    // InternalArduinoML.g:4200:1: rule__TransitionMode__Group_0_1__0__Impl : ( 'wait' ) ;
    public final void rule__TransitionMode__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:4204:1: ( ( 'wait' ) )
            // InternalArduinoML.g:4205:1: ( 'wait' )
            {
            // InternalArduinoML.g:4205:1: ( 'wait' )
            // InternalArduinoML.g:4206:2: 'wait'
            {
             before(grammarAccess.getTransitionModeAccess().getWaitKeyword_0_1_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getTransitionModeAccess().getWaitKeyword_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionMode__Group_0_1__0__Impl"


    // $ANTLR start "rule__TransitionMode__Group_0_1__1"
    // InternalArduinoML.g:4215:1: rule__TransitionMode__Group_0_1__1 : rule__TransitionMode__Group_0_1__1__Impl rule__TransitionMode__Group_0_1__2 ;
    public final void rule__TransitionMode__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:4219:1: ( rule__TransitionMode__Group_0_1__1__Impl rule__TransitionMode__Group_0_1__2 )
            // InternalArduinoML.g:4220:2: rule__TransitionMode__Group_0_1__1__Impl rule__TransitionMode__Group_0_1__2
            {
            pushFollow(FOLLOW_33);
            rule__TransitionMode__Group_0_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TransitionMode__Group_0_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionMode__Group_0_1__1"


    // $ANTLR start "rule__TransitionMode__Group_0_1__1__Impl"
    // InternalArduinoML.g:4227:1: rule__TransitionMode__Group_0_1__1__Impl : ( ( rule__TransitionMode__TimeAssignment_0_1_1 ) ) ;
    public final void rule__TransitionMode__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:4231:1: ( ( ( rule__TransitionMode__TimeAssignment_0_1_1 ) ) )
            // InternalArduinoML.g:4232:1: ( ( rule__TransitionMode__TimeAssignment_0_1_1 ) )
            {
            // InternalArduinoML.g:4232:1: ( ( rule__TransitionMode__TimeAssignment_0_1_1 ) )
            // InternalArduinoML.g:4233:2: ( rule__TransitionMode__TimeAssignment_0_1_1 )
            {
             before(grammarAccess.getTransitionModeAccess().getTimeAssignment_0_1_1()); 
            // InternalArduinoML.g:4234:2: ( rule__TransitionMode__TimeAssignment_0_1_1 )
            // InternalArduinoML.g:4234:3: rule__TransitionMode__TimeAssignment_0_1_1
            {
            pushFollow(FOLLOW_2);
            rule__TransitionMode__TimeAssignment_0_1_1();

            state._fsp--;


            }

             after(grammarAccess.getTransitionModeAccess().getTimeAssignment_0_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionMode__Group_0_1__1__Impl"


    // $ANTLR start "rule__TransitionMode__Group_0_1__2"
    // InternalArduinoML.g:4242:1: rule__TransitionMode__Group_0_1__2 : rule__TransitionMode__Group_0_1__2__Impl rule__TransitionMode__Group_0_1__3 ;
    public final void rule__TransitionMode__Group_0_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:4246:1: ( rule__TransitionMode__Group_0_1__2__Impl rule__TransitionMode__Group_0_1__3 )
            // InternalArduinoML.g:4247:2: rule__TransitionMode__Group_0_1__2__Impl rule__TransitionMode__Group_0_1__3
            {
            pushFollow(FOLLOW_34);
            rule__TransitionMode__Group_0_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TransitionMode__Group_0_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionMode__Group_0_1__2"


    // $ANTLR start "rule__TransitionMode__Group_0_1__2__Impl"
    // InternalArduinoML.g:4254:1: rule__TransitionMode__Group_0_1__2__Impl : ( ( rule__TransitionMode__UnitAssignment_0_1_2 ) ) ;
    public final void rule__TransitionMode__Group_0_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:4258:1: ( ( ( rule__TransitionMode__UnitAssignment_0_1_2 ) ) )
            // InternalArduinoML.g:4259:1: ( ( rule__TransitionMode__UnitAssignment_0_1_2 ) )
            {
            // InternalArduinoML.g:4259:1: ( ( rule__TransitionMode__UnitAssignment_0_1_2 ) )
            // InternalArduinoML.g:4260:2: ( rule__TransitionMode__UnitAssignment_0_1_2 )
            {
             before(grammarAccess.getTransitionModeAccess().getUnitAssignment_0_1_2()); 
            // InternalArduinoML.g:4261:2: ( rule__TransitionMode__UnitAssignment_0_1_2 )
            // InternalArduinoML.g:4261:3: rule__TransitionMode__UnitAssignment_0_1_2
            {
            pushFollow(FOLLOW_2);
            rule__TransitionMode__UnitAssignment_0_1_2();

            state._fsp--;


            }

             after(grammarAccess.getTransitionModeAccess().getUnitAssignment_0_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionMode__Group_0_1__2__Impl"


    // $ANTLR start "rule__TransitionMode__Group_0_1__3"
    // InternalArduinoML.g:4269:1: rule__TransitionMode__Group_0_1__3 : rule__TransitionMode__Group_0_1__3__Impl ;
    public final void rule__TransitionMode__Group_0_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:4273:1: ( rule__TransitionMode__Group_0_1__3__Impl )
            // InternalArduinoML.g:4274:2: rule__TransitionMode__Group_0_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TransitionMode__Group_0_1__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionMode__Group_0_1__3"


    // $ANTLR start "rule__TransitionMode__Group_0_1__3__Impl"
    // InternalArduinoML.g:4280:1: rule__TransitionMode__Group_0_1__3__Impl : ( 'then' ) ;
    public final void rule__TransitionMode__Group_0_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:4284:1: ( ( 'then' ) )
            // InternalArduinoML.g:4285:1: ( 'then' )
            {
            // InternalArduinoML.g:4285:1: ( 'then' )
            // InternalArduinoML.g:4286:2: 'then'
            {
             before(grammarAccess.getTransitionModeAccess().getThenKeyword_0_1_3()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getTransitionModeAccess().getThenKeyword_0_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionMode__Group_0_1__3__Impl"


    // $ANTLR start "rule__AppState__NameAssignment_1_1"
    // InternalArduinoML.g:4296:1: rule__AppState__NameAssignment_1_1 : ( ruleEString ) ;
    public final void rule__AppState__NameAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:4300:1: ( ( ruleEString ) )
            // InternalArduinoML.g:4301:2: ( ruleEString )
            {
            // InternalArduinoML.g:4301:2: ( ruleEString )
            // InternalArduinoML.g:4302:3: ruleEString
            {
             before(grammarAccess.getAppStateAccess().getNameEStringParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAppStateAccess().getNameEStringParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AppState__NameAssignment_1_1"


    // $ANTLR start "rule__AppState__Initial_stateAssignment_1_4"
    // InternalArduinoML.g:4311:1: rule__AppState__Initial_stateAssignment_1_4 : ( ( ruleEString ) ) ;
    public final void rule__AppState__Initial_stateAssignment_1_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:4315:1: ( ( ( ruleEString ) ) )
            // InternalArduinoML.g:4316:2: ( ( ruleEString ) )
            {
            // InternalArduinoML.g:4316:2: ( ( ruleEString ) )
            // InternalArduinoML.g:4317:3: ( ruleEString )
            {
             before(grammarAccess.getAppStateAccess().getInitial_stateStateCrossReference_1_4_0()); 
            // InternalArduinoML.g:4318:3: ( ruleEString )
            // InternalArduinoML.g:4319:4: ruleEString
            {
             before(grammarAccess.getAppStateAccess().getInitial_stateStateEStringParserRuleCall_1_4_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAppStateAccess().getInitial_stateStateEStringParserRuleCall_1_4_0_1()); 

            }

             after(grammarAccess.getAppStateAccess().getInitial_stateStateCrossReference_1_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AppState__Initial_stateAssignment_1_4"


    // $ANTLR start "rule__AppState__BricksAssignment_1_8"
    // InternalArduinoML.g:4330:1: rule__AppState__BricksAssignment_1_8 : ( ruleBrick ) ;
    public final void rule__AppState__BricksAssignment_1_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:4334:1: ( ( ruleBrick ) )
            // InternalArduinoML.g:4335:2: ( ruleBrick )
            {
            // InternalArduinoML.g:4335:2: ( ruleBrick )
            // InternalArduinoML.g:4336:3: ruleBrick
            {
             before(grammarAccess.getAppStateAccess().getBricksBrickParserRuleCall_1_8_0()); 
            pushFollow(FOLLOW_2);
            ruleBrick();

            state._fsp--;

             after(grammarAccess.getAppStateAccess().getBricksBrickParserRuleCall_1_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AppState__BricksAssignment_1_8"


    // $ANTLR start "rule__AppState__BricksAssignment_1_9"
    // InternalArduinoML.g:4345:1: rule__AppState__BricksAssignment_1_9 : ( ruleBrick ) ;
    public final void rule__AppState__BricksAssignment_1_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:4349:1: ( ( ruleBrick ) )
            // InternalArduinoML.g:4350:2: ( ruleBrick )
            {
            // InternalArduinoML.g:4350:2: ( ruleBrick )
            // InternalArduinoML.g:4351:3: ruleBrick
            {
             before(grammarAccess.getAppStateAccess().getBricksBrickParserRuleCall_1_9_0()); 
            pushFollow(FOLLOW_2);
            ruleBrick();

            state._fsp--;

             after(grammarAccess.getAppStateAccess().getBricksBrickParserRuleCall_1_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AppState__BricksAssignment_1_9"


    // $ANTLR start "rule__AppState__StatesAssignment_1_12"
    // InternalArduinoML.g:4360:1: rule__AppState__StatesAssignment_1_12 : ( ruleState ) ;
    public final void rule__AppState__StatesAssignment_1_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:4364:1: ( ( ruleState ) )
            // InternalArduinoML.g:4365:2: ( ruleState )
            {
            // InternalArduinoML.g:4365:2: ( ruleState )
            // InternalArduinoML.g:4366:3: ruleState
            {
             before(grammarAccess.getAppStateAccess().getStatesStateParserRuleCall_1_12_0()); 
            pushFollow(FOLLOW_2);
            ruleState();

            state._fsp--;

             after(grammarAccess.getAppStateAccess().getStatesStateParserRuleCall_1_12_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AppState__StatesAssignment_1_12"


    // $ANTLR start "rule__AppState__StatesAssignment_1_13"
    // InternalArduinoML.g:4375:1: rule__AppState__StatesAssignment_1_13 : ( ruleState ) ;
    public final void rule__AppState__StatesAssignment_1_13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:4379:1: ( ( ruleState ) )
            // InternalArduinoML.g:4380:2: ( ruleState )
            {
            // InternalArduinoML.g:4380:2: ( ruleState )
            // InternalArduinoML.g:4381:3: ruleState
            {
             before(grammarAccess.getAppStateAccess().getStatesStateParserRuleCall_1_13_0()); 
            pushFollow(FOLLOW_2);
            ruleState();

            state._fsp--;

             after(grammarAccess.getAppStateAccess().getStatesStateParserRuleCall_1_13_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AppState__StatesAssignment_1_13"


    // $ANTLR start "rule__AppMode__NameAssignment_1_1"
    // InternalArduinoML.g:4390:1: rule__AppMode__NameAssignment_1_1 : ( ruleEString ) ;
    public final void rule__AppMode__NameAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:4394:1: ( ( ruleEString ) )
            // InternalArduinoML.g:4395:2: ( ruleEString )
            {
            // InternalArduinoML.g:4395:2: ( ruleEString )
            // InternalArduinoML.g:4396:3: ruleEString
            {
             before(grammarAccess.getAppModeAccess().getNameEStringParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAppModeAccess().getNameEStringParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AppMode__NameAssignment_1_1"


    // $ANTLR start "rule__AppMode__Initial_modeAssignment_1_4"
    // InternalArduinoML.g:4405:1: rule__AppMode__Initial_modeAssignment_1_4 : ( ( ruleEString ) ) ;
    public final void rule__AppMode__Initial_modeAssignment_1_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:4409:1: ( ( ( ruleEString ) ) )
            // InternalArduinoML.g:4410:2: ( ( ruleEString ) )
            {
            // InternalArduinoML.g:4410:2: ( ( ruleEString ) )
            // InternalArduinoML.g:4411:3: ( ruleEString )
            {
             before(grammarAccess.getAppModeAccess().getInitial_modeModeCrossReference_1_4_0()); 
            // InternalArduinoML.g:4412:3: ( ruleEString )
            // InternalArduinoML.g:4413:4: ruleEString
            {
             before(grammarAccess.getAppModeAccess().getInitial_modeModeEStringParserRuleCall_1_4_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAppModeAccess().getInitial_modeModeEStringParserRuleCall_1_4_0_1()); 

            }

             after(grammarAccess.getAppModeAccess().getInitial_modeModeCrossReference_1_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AppMode__Initial_modeAssignment_1_4"


    // $ANTLR start "rule__AppMode__BricksAssignment_1_8"
    // InternalArduinoML.g:4424:1: rule__AppMode__BricksAssignment_1_8 : ( ruleBrick ) ;
    public final void rule__AppMode__BricksAssignment_1_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:4428:1: ( ( ruleBrick ) )
            // InternalArduinoML.g:4429:2: ( ruleBrick )
            {
            // InternalArduinoML.g:4429:2: ( ruleBrick )
            // InternalArduinoML.g:4430:3: ruleBrick
            {
             before(grammarAccess.getAppModeAccess().getBricksBrickParserRuleCall_1_8_0()); 
            pushFollow(FOLLOW_2);
            ruleBrick();

            state._fsp--;

             after(grammarAccess.getAppModeAccess().getBricksBrickParserRuleCall_1_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AppMode__BricksAssignment_1_8"


    // $ANTLR start "rule__AppMode__BricksAssignment_1_9"
    // InternalArduinoML.g:4439:1: rule__AppMode__BricksAssignment_1_9 : ( ruleBrick ) ;
    public final void rule__AppMode__BricksAssignment_1_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:4443:1: ( ( ruleBrick ) )
            // InternalArduinoML.g:4444:2: ( ruleBrick )
            {
            // InternalArduinoML.g:4444:2: ( ruleBrick )
            // InternalArduinoML.g:4445:3: ruleBrick
            {
             before(grammarAccess.getAppModeAccess().getBricksBrickParserRuleCall_1_9_0()); 
            pushFollow(FOLLOW_2);
            ruleBrick();

            state._fsp--;

             after(grammarAccess.getAppModeAccess().getBricksBrickParserRuleCall_1_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AppMode__BricksAssignment_1_9"


    // $ANTLR start "rule__AppMode__ModesAssignment_1_12"
    // InternalArduinoML.g:4454:1: rule__AppMode__ModesAssignment_1_12 : ( ruleMode ) ;
    public final void rule__AppMode__ModesAssignment_1_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:4458:1: ( ( ruleMode ) )
            // InternalArduinoML.g:4459:2: ( ruleMode )
            {
            // InternalArduinoML.g:4459:2: ( ruleMode )
            // InternalArduinoML.g:4460:3: ruleMode
            {
             before(grammarAccess.getAppModeAccess().getModesModeParserRuleCall_1_12_0()); 
            pushFollow(FOLLOW_2);
            ruleMode();

            state._fsp--;

             after(grammarAccess.getAppModeAccess().getModesModeParserRuleCall_1_12_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AppMode__ModesAssignment_1_12"


    // $ANTLR start "rule__AppMode__ModesAssignment_1_13"
    // InternalArduinoML.g:4469:1: rule__AppMode__ModesAssignment_1_13 : ( ruleMode ) ;
    public final void rule__AppMode__ModesAssignment_1_13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:4473:1: ( ( ruleMode ) )
            // InternalArduinoML.g:4474:2: ( ruleMode )
            {
            // InternalArduinoML.g:4474:2: ( ruleMode )
            // InternalArduinoML.g:4475:3: ruleMode
            {
             before(grammarAccess.getAppModeAccess().getModesModeParserRuleCall_1_13_0()); 
            pushFollow(FOLLOW_2);
            ruleMode();

            state._fsp--;

             after(grammarAccess.getAppModeAccess().getModesModeParserRuleCall_1_13_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AppMode__ModesAssignment_1_13"


    // $ANTLR start "rule__Brick__NameAssignment_1"
    // InternalArduinoML.g:4484:1: rule__Brick__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Brick__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:4488:1: ( ( ruleEString ) )
            // InternalArduinoML.g:4489:2: ( ruleEString )
            {
            // InternalArduinoML.g:4489:2: ( ruleEString )
            // InternalArduinoML.g:4490:3: ruleEString
            {
             before(grammarAccess.getBrickAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getBrickAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Brick__NameAssignment_1"


    // $ANTLR start "rule__Brick__PinAssignment_3"
    // InternalArduinoML.g:4499:1: rule__Brick__PinAssignment_3 : ( ruleEInt ) ;
    public final void rule__Brick__PinAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:4503:1: ( ( ruleEInt ) )
            // InternalArduinoML.g:4504:2: ( ruleEInt )
            {
            // InternalArduinoML.g:4504:2: ( ruleEInt )
            // InternalArduinoML.g:4505:3: ruleEInt
            {
             before(grammarAccess.getBrickAccess().getPinEIntParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getBrickAccess().getPinEIntParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Brick__PinAssignment_3"


    // $ANTLR start "rule__Mode__NameAssignment_0"
    // InternalArduinoML.g:4514:1: rule__Mode__NameAssignment_0 : ( ruleEString ) ;
    public final void rule__Mode__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:4518:1: ( ( ruleEString ) )
            // InternalArduinoML.g:4519:2: ( ruleEString )
            {
            // InternalArduinoML.g:4519:2: ( ruleEString )
            // InternalArduinoML.g:4520:3: ruleEString
            {
             before(grammarAccess.getModeAccess().getNameEStringParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getModeAccess().getNameEStringParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mode__NameAssignment_0"


    // $ANTLR start "rule__Mode__InitialAssignment_3"
    // InternalArduinoML.g:4529:1: rule__Mode__InitialAssignment_3 : ( ( ruleEString ) ) ;
    public final void rule__Mode__InitialAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:4533:1: ( ( ( ruleEString ) ) )
            // InternalArduinoML.g:4534:2: ( ( ruleEString ) )
            {
            // InternalArduinoML.g:4534:2: ( ( ruleEString ) )
            // InternalArduinoML.g:4535:3: ( ruleEString )
            {
             before(grammarAccess.getModeAccess().getInitialStateCrossReference_3_0()); 
            // InternalArduinoML.g:4536:3: ( ruleEString )
            // InternalArduinoML.g:4537:4: ruleEString
            {
             before(grammarAccess.getModeAccess().getInitialStateEStringParserRuleCall_3_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getModeAccess().getInitialStateEStringParserRuleCall_3_0_1()); 

            }

             after(grammarAccess.getModeAccess().getInitialStateCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mode__InitialAssignment_3"


    // $ANTLR start "rule__Mode__BricksAssignment_5_2"
    // InternalArduinoML.g:4548:1: rule__Mode__BricksAssignment_5_2 : ( ruleBrick ) ;
    public final void rule__Mode__BricksAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:4552:1: ( ( ruleBrick ) )
            // InternalArduinoML.g:4553:2: ( ruleBrick )
            {
            // InternalArduinoML.g:4553:2: ( ruleBrick )
            // InternalArduinoML.g:4554:3: ruleBrick
            {
             before(grammarAccess.getModeAccess().getBricksBrickParserRuleCall_5_2_0()); 
            pushFollow(FOLLOW_2);
            ruleBrick();

            state._fsp--;

             after(grammarAccess.getModeAccess().getBricksBrickParserRuleCall_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mode__BricksAssignment_5_2"


    // $ANTLR start "rule__Mode__BricksAssignment_5_3"
    // InternalArduinoML.g:4563:1: rule__Mode__BricksAssignment_5_3 : ( ruleBrick ) ;
    public final void rule__Mode__BricksAssignment_5_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:4567:1: ( ( ruleBrick ) )
            // InternalArduinoML.g:4568:2: ( ruleBrick )
            {
            // InternalArduinoML.g:4568:2: ( ruleBrick )
            // InternalArduinoML.g:4569:3: ruleBrick
            {
             before(grammarAccess.getModeAccess().getBricksBrickParserRuleCall_5_3_0()); 
            pushFollow(FOLLOW_2);
            ruleBrick();

            state._fsp--;

             after(grammarAccess.getModeAccess().getBricksBrickParserRuleCall_5_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mode__BricksAssignment_5_3"


    // $ANTLR start "rule__Mode__StatesAssignment_8"
    // InternalArduinoML.g:4578:1: rule__Mode__StatesAssignment_8 : ( ruleState ) ;
    public final void rule__Mode__StatesAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:4582:1: ( ( ruleState ) )
            // InternalArduinoML.g:4583:2: ( ruleState )
            {
            // InternalArduinoML.g:4583:2: ( ruleState )
            // InternalArduinoML.g:4584:3: ruleState
            {
             before(grammarAccess.getModeAccess().getStatesStateParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleState();

            state._fsp--;

             after(grammarAccess.getModeAccess().getStatesStateParserRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mode__StatesAssignment_8"


    // $ANTLR start "rule__Mode__StatesAssignment_9"
    // InternalArduinoML.g:4593:1: rule__Mode__StatesAssignment_9 : ( ruleState ) ;
    public final void rule__Mode__StatesAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:4597:1: ( ( ruleState ) )
            // InternalArduinoML.g:4598:2: ( ruleState )
            {
            // InternalArduinoML.g:4598:2: ( ruleState )
            // InternalArduinoML.g:4599:3: ruleState
            {
             before(grammarAccess.getModeAccess().getStatesStateParserRuleCall_9_0()); 
            pushFollow(FOLLOW_2);
            ruleState();

            state._fsp--;

             after(grammarAccess.getModeAccess().getStatesStateParserRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mode__StatesAssignment_9"


    // $ANTLR start "rule__Mode__Transitions_modeAssignment_12"
    // InternalArduinoML.g:4608:1: rule__Mode__Transitions_modeAssignment_12 : ( ruleTransitionMode ) ;
    public final void rule__Mode__Transitions_modeAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:4612:1: ( ( ruleTransitionMode ) )
            // InternalArduinoML.g:4613:2: ( ruleTransitionMode )
            {
            // InternalArduinoML.g:4613:2: ( ruleTransitionMode )
            // InternalArduinoML.g:4614:3: ruleTransitionMode
            {
             before(grammarAccess.getModeAccess().getTransitions_modeTransitionModeParserRuleCall_12_0()); 
            pushFollow(FOLLOW_2);
            ruleTransitionMode();

            state._fsp--;

             after(grammarAccess.getModeAccess().getTransitions_modeTransitionModeParserRuleCall_12_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mode__Transitions_modeAssignment_12"


    // $ANTLR start "rule__Mode__Transitions_modeAssignment_13"
    // InternalArduinoML.g:4623:1: rule__Mode__Transitions_modeAssignment_13 : ( ruleTransitionMode ) ;
    public final void rule__Mode__Transitions_modeAssignment_13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:4627:1: ( ( ruleTransitionMode ) )
            // InternalArduinoML.g:4628:2: ( ruleTransitionMode )
            {
            // InternalArduinoML.g:4628:2: ( ruleTransitionMode )
            // InternalArduinoML.g:4629:3: ruleTransitionMode
            {
             before(grammarAccess.getModeAccess().getTransitions_modeTransitionModeParserRuleCall_13_0()); 
            pushFollow(FOLLOW_2);
            ruleTransitionMode();

            state._fsp--;

             after(grammarAccess.getModeAccess().getTransitions_modeTransitionModeParserRuleCall_13_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mode__Transitions_modeAssignment_13"


    // $ANTLR start "rule__State__NameAssignment_0"
    // InternalArduinoML.g:4638:1: rule__State__NameAssignment_0 : ( ruleEString ) ;
    public final void rule__State__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:4642:1: ( ( ruleEString ) )
            // InternalArduinoML.g:4643:2: ( ruleEString )
            {
            // InternalArduinoML.g:4643:2: ( ruleEString )
            // InternalArduinoML.g:4644:3: ruleEString
            {
             before(grammarAccess.getStateAccess().getNameEStringParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getStateAccess().getNameEStringParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__NameAssignment_0"


    // $ANTLR start "rule__State__ActionsAssignment_2"
    // InternalArduinoML.g:4653:1: rule__State__ActionsAssignment_2 : ( ruleAction ) ;
    public final void rule__State__ActionsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:4657:1: ( ( ruleAction ) )
            // InternalArduinoML.g:4658:2: ( ruleAction )
            {
            // InternalArduinoML.g:4658:2: ( ruleAction )
            // InternalArduinoML.g:4659:3: ruleAction
            {
             before(grammarAccess.getStateAccess().getActionsActionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAction();

            state._fsp--;

             after(grammarAccess.getStateAccess().getActionsActionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__ActionsAssignment_2"


    // $ANTLR start "rule__State__ActionsAssignment_3"
    // InternalArduinoML.g:4668:1: rule__State__ActionsAssignment_3 : ( ruleAction ) ;
    public final void rule__State__ActionsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:4672:1: ( ( ruleAction ) )
            // InternalArduinoML.g:4673:2: ( ruleAction )
            {
            // InternalArduinoML.g:4673:2: ( ruleAction )
            // InternalArduinoML.g:4674:3: ruleAction
            {
             before(grammarAccess.getStateAccess().getActionsActionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleAction();

            state._fsp--;

             after(grammarAccess.getStateAccess().getActionsActionParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__ActionsAssignment_3"


    // $ANTLR start "rule__State__Transitions_stateAssignment_4"
    // InternalArduinoML.g:4683:1: rule__State__Transitions_stateAssignment_4 : ( ruleTransitionState ) ;
    public final void rule__State__Transitions_stateAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:4687:1: ( ( ruleTransitionState ) )
            // InternalArduinoML.g:4688:2: ( ruleTransitionState )
            {
            // InternalArduinoML.g:4688:2: ( ruleTransitionState )
            // InternalArduinoML.g:4689:3: ruleTransitionState
            {
             before(grammarAccess.getStateAccess().getTransitions_stateTransitionStateParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleTransitionState();

            state._fsp--;

             after(grammarAccess.getStateAccess().getTransitions_stateTransitionStateParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Transitions_stateAssignment_4"


    // $ANTLR start "rule__State__Transitions_stateAssignment_5"
    // InternalArduinoML.g:4698:1: rule__State__Transitions_stateAssignment_5 : ( ruleTransitionState ) ;
    public final void rule__State__Transitions_stateAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:4702:1: ( ( ruleTransitionState ) )
            // InternalArduinoML.g:4703:2: ( ruleTransitionState )
            {
            // InternalArduinoML.g:4703:2: ( ruleTransitionState )
            // InternalArduinoML.g:4704:3: ruleTransitionState
            {
             before(grammarAccess.getStateAccess().getTransitions_stateTransitionStateParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleTransitionState();

            state._fsp--;

             after(grammarAccess.getStateAccess().getTransitions_stateTransitionStateParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Transitions_stateAssignment_5"


    // $ANTLR start "rule__Action__ActuatorAssignment_1"
    // InternalArduinoML.g:4713:1: rule__Action__ActuatorAssignment_1 : ( ( ruleEString ) ) ;
    public final void rule__Action__ActuatorAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:4717:1: ( ( ( ruleEString ) ) )
            // InternalArduinoML.g:4718:2: ( ( ruleEString ) )
            {
            // InternalArduinoML.g:4718:2: ( ( ruleEString ) )
            // InternalArduinoML.g:4719:3: ( ruleEString )
            {
             before(grammarAccess.getActionAccess().getActuatorActuatorCrossReference_1_0()); 
            // InternalArduinoML.g:4720:3: ( ruleEString )
            // InternalArduinoML.g:4721:4: ruleEString
            {
             before(grammarAccess.getActionAccess().getActuatorActuatorEStringParserRuleCall_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getActionAccess().getActuatorActuatorEStringParserRuleCall_1_0_1()); 

            }

             after(grammarAccess.getActionAccess().getActuatorActuatorCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__ActuatorAssignment_1"


    // $ANTLR start "rule__Action__ValueAssignment_3"
    // InternalArduinoML.g:4732:1: rule__Action__ValueAssignment_3 : ( ruleSignal ) ;
    public final void rule__Action__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:4736:1: ( ( ruleSignal ) )
            // InternalArduinoML.g:4737:2: ( ruleSignal )
            {
            // InternalArduinoML.g:4737:2: ( ruleSignal )
            // InternalArduinoML.g:4738:3: ruleSignal
            {
             before(grammarAccess.getActionAccess().getValueSignalEnumRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleSignal();

            state._fsp--;

             after(grammarAccess.getActionAccess().getValueSignalEnumRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__ValueAssignment_3"


    // $ANTLR start "rule__TransitionState__DigitalsAssignment_0_0_1_0_0"
    // InternalArduinoML.g:4747:1: rule__TransitionState__DigitalsAssignment_0_0_1_0_0 : ( ( ruleEString ) ) ;
    public final void rule__TransitionState__DigitalsAssignment_0_0_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:4751:1: ( ( ( ruleEString ) ) )
            // InternalArduinoML.g:4752:2: ( ( ruleEString ) )
            {
            // InternalArduinoML.g:4752:2: ( ( ruleEString ) )
            // InternalArduinoML.g:4753:3: ( ruleEString )
            {
             before(grammarAccess.getTransitionStateAccess().getDigitalsDigitalCrossReference_0_0_1_0_0_0()); 
            // InternalArduinoML.g:4754:3: ( ruleEString )
            // InternalArduinoML.g:4755:4: ruleEString
            {
             before(grammarAccess.getTransitionStateAccess().getDigitalsDigitalEStringParserRuleCall_0_0_1_0_0_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTransitionStateAccess().getDigitalsDigitalEStringParserRuleCall_0_0_1_0_0_0_1()); 

            }

             after(grammarAccess.getTransitionStateAccess().getDigitalsDigitalCrossReference_0_0_1_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionState__DigitalsAssignment_0_0_1_0_0"


    // $ANTLR start "rule__TransitionState__D_valuesAssignment_0_0_1_0_2"
    // InternalArduinoML.g:4766:1: rule__TransitionState__D_valuesAssignment_0_0_1_0_2 : ( ruleSignal ) ;
    public final void rule__TransitionState__D_valuesAssignment_0_0_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:4770:1: ( ( ruleSignal ) )
            // InternalArduinoML.g:4771:2: ( ruleSignal )
            {
            // InternalArduinoML.g:4771:2: ( ruleSignal )
            // InternalArduinoML.g:4772:3: ruleSignal
            {
             before(grammarAccess.getTransitionStateAccess().getD_valuesSignalEnumRuleCall_0_0_1_0_2_0()); 
            pushFollow(FOLLOW_2);
            ruleSignal();

            state._fsp--;

             after(grammarAccess.getTransitionStateAccess().getD_valuesSignalEnumRuleCall_0_0_1_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionState__D_valuesAssignment_0_0_1_0_2"


    // $ANTLR start "rule__TransitionState__AnalogsAssignment_0_0_1_1_0"
    // InternalArduinoML.g:4781:1: rule__TransitionState__AnalogsAssignment_0_0_1_1_0 : ( ( ruleEString ) ) ;
    public final void rule__TransitionState__AnalogsAssignment_0_0_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:4785:1: ( ( ( ruleEString ) ) )
            // InternalArduinoML.g:4786:2: ( ( ruleEString ) )
            {
            // InternalArduinoML.g:4786:2: ( ( ruleEString ) )
            // InternalArduinoML.g:4787:3: ( ruleEString )
            {
             before(grammarAccess.getTransitionStateAccess().getAnalogsAnalogCrossReference_0_0_1_1_0_0()); 
            // InternalArduinoML.g:4788:3: ( ruleEString )
            // InternalArduinoML.g:4789:4: ruleEString
            {
             before(grammarAccess.getTransitionStateAccess().getAnalogsAnalogEStringParserRuleCall_0_0_1_1_0_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTransitionStateAccess().getAnalogsAnalogEStringParserRuleCall_0_0_1_1_0_0_1()); 

            }

             after(grammarAccess.getTransitionStateAccess().getAnalogsAnalogCrossReference_0_0_1_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionState__AnalogsAssignment_0_0_1_1_0"


    // $ANTLR start "rule__TransitionState__CompAssignment_0_0_1_1_1"
    // InternalArduinoML.g:4800:1: rule__TransitionState__CompAssignment_0_0_1_1_1 : ( ruleCompare ) ;
    public final void rule__TransitionState__CompAssignment_0_0_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:4804:1: ( ( ruleCompare ) )
            // InternalArduinoML.g:4805:2: ( ruleCompare )
            {
            // InternalArduinoML.g:4805:2: ( ruleCompare )
            // InternalArduinoML.g:4806:3: ruleCompare
            {
             before(grammarAccess.getTransitionStateAccess().getCompCompareEnumRuleCall_0_0_1_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCompare();

            state._fsp--;

             after(grammarAccess.getTransitionStateAccess().getCompCompareEnumRuleCall_0_0_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionState__CompAssignment_0_0_1_1_1"


    // $ANTLR start "rule__TransitionState__A_valuesAssignment_0_0_1_1_2"
    // InternalArduinoML.g:4815:1: rule__TransitionState__A_valuesAssignment_0_0_1_1_2 : ( ruleEInt ) ;
    public final void rule__TransitionState__A_valuesAssignment_0_0_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:4819:1: ( ( ruleEInt ) )
            // InternalArduinoML.g:4820:2: ( ruleEInt )
            {
            // InternalArduinoML.g:4820:2: ( ruleEInt )
            // InternalArduinoML.g:4821:3: ruleEInt
            {
             before(grammarAccess.getTransitionStateAccess().getA_valuesEIntParserRuleCall_0_0_1_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getTransitionStateAccess().getA_valuesEIntParserRuleCall_0_0_1_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionState__A_valuesAssignment_0_0_1_1_2"


    // $ANTLR start "rule__TransitionState__DigitalsAssignment_0_0_2_1_0_0"
    // InternalArduinoML.g:4830:1: rule__TransitionState__DigitalsAssignment_0_0_2_1_0_0 : ( ( ruleEString ) ) ;
    public final void rule__TransitionState__DigitalsAssignment_0_0_2_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:4834:1: ( ( ( ruleEString ) ) )
            // InternalArduinoML.g:4835:2: ( ( ruleEString ) )
            {
            // InternalArduinoML.g:4835:2: ( ( ruleEString ) )
            // InternalArduinoML.g:4836:3: ( ruleEString )
            {
             before(grammarAccess.getTransitionStateAccess().getDigitalsDigitalCrossReference_0_0_2_1_0_0_0()); 
            // InternalArduinoML.g:4837:3: ( ruleEString )
            // InternalArduinoML.g:4838:4: ruleEString
            {
             before(grammarAccess.getTransitionStateAccess().getDigitalsDigitalEStringParserRuleCall_0_0_2_1_0_0_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTransitionStateAccess().getDigitalsDigitalEStringParserRuleCall_0_0_2_1_0_0_0_1()); 

            }

             after(grammarAccess.getTransitionStateAccess().getDigitalsDigitalCrossReference_0_0_2_1_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionState__DigitalsAssignment_0_0_2_1_0_0"


    // $ANTLR start "rule__TransitionState__D_valuesAssignment_0_0_2_1_0_2"
    // InternalArduinoML.g:4849:1: rule__TransitionState__D_valuesAssignment_0_0_2_1_0_2 : ( ruleSignal ) ;
    public final void rule__TransitionState__D_valuesAssignment_0_0_2_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:4853:1: ( ( ruleSignal ) )
            // InternalArduinoML.g:4854:2: ( ruleSignal )
            {
            // InternalArduinoML.g:4854:2: ( ruleSignal )
            // InternalArduinoML.g:4855:3: ruleSignal
            {
             before(grammarAccess.getTransitionStateAccess().getD_valuesSignalEnumRuleCall_0_0_2_1_0_2_0()); 
            pushFollow(FOLLOW_2);
            ruleSignal();

            state._fsp--;

             after(grammarAccess.getTransitionStateAccess().getD_valuesSignalEnumRuleCall_0_0_2_1_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionState__D_valuesAssignment_0_0_2_1_0_2"


    // $ANTLR start "rule__TransitionState__AnalogsAssignment_0_0_2_1_1_0"
    // InternalArduinoML.g:4864:1: rule__TransitionState__AnalogsAssignment_0_0_2_1_1_0 : ( ( ruleEString ) ) ;
    public final void rule__TransitionState__AnalogsAssignment_0_0_2_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:4868:1: ( ( ( ruleEString ) ) )
            // InternalArduinoML.g:4869:2: ( ( ruleEString ) )
            {
            // InternalArduinoML.g:4869:2: ( ( ruleEString ) )
            // InternalArduinoML.g:4870:3: ( ruleEString )
            {
             before(grammarAccess.getTransitionStateAccess().getAnalogsAnalogCrossReference_0_0_2_1_1_0_0()); 
            // InternalArduinoML.g:4871:3: ( ruleEString )
            // InternalArduinoML.g:4872:4: ruleEString
            {
             before(grammarAccess.getTransitionStateAccess().getAnalogsAnalogEStringParserRuleCall_0_0_2_1_1_0_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTransitionStateAccess().getAnalogsAnalogEStringParserRuleCall_0_0_2_1_1_0_0_1()); 

            }

             after(grammarAccess.getTransitionStateAccess().getAnalogsAnalogCrossReference_0_0_2_1_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionState__AnalogsAssignment_0_0_2_1_1_0"


    // $ANTLR start "rule__TransitionState__CompAssignment_0_0_2_1_1_1"
    // InternalArduinoML.g:4883:1: rule__TransitionState__CompAssignment_0_0_2_1_1_1 : ( ruleCompare ) ;
    public final void rule__TransitionState__CompAssignment_0_0_2_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:4887:1: ( ( ruleCompare ) )
            // InternalArduinoML.g:4888:2: ( ruleCompare )
            {
            // InternalArduinoML.g:4888:2: ( ruleCompare )
            // InternalArduinoML.g:4889:3: ruleCompare
            {
             before(grammarAccess.getTransitionStateAccess().getCompCompareEnumRuleCall_0_0_2_1_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCompare();

            state._fsp--;

             after(grammarAccess.getTransitionStateAccess().getCompCompareEnumRuleCall_0_0_2_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionState__CompAssignment_0_0_2_1_1_1"


    // $ANTLR start "rule__TransitionState__A_valuesAssignment_0_0_2_1_1_2"
    // InternalArduinoML.g:4898:1: rule__TransitionState__A_valuesAssignment_0_0_2_1_1_2 : ( ruleEInt ) ;
    public final void rule__TransitionState__A_valuesAssignment_0_0_2_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:4902:1: ( ( ruleEInt ) )
            // InternalArduinoML.g:4903:2: ( ruleEInt )
            {
            // InternalArduinoML.g:4903:2: ( ruleEInt )
            // InternalArduinoML.g:4904:3: ruleEInt
            {
             before(grammarAccess.getTransitionStateAccess().getA_valuesEIntParserRuleCall_0_0_2_1_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getTransitionStateAccess().getA_valuesEIntParserRuleCall_0_0_2_1_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionState__A_valuesAssignment_0_0_2_1_1_2"


    // $ANTLR start "rule__TransitionState__TimeAssignment_0_0_3_1"
    // InternalArduinoML.g:4913:1: rule__TransitionState__TimeAssignment_0_0_3_1 : ( ruleEInt ) ;
    public final void rule__TransitionState__TimeAssignment_0_0_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:4917:1: ( ( ruleEInt ) )
            // InternalArduinoML.g:4918:2: ( ruleEInt )
            {
            // InternalArduinoML.g:4918:2: ( ruleEInt )
            // InternalArduinoML.g:4919:3: ruleEInt
            {
             before(grammarAccess.getTransitionStateAccess().getTimeEIntParserRuleCall_0_0_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getTransitionStateAccess().getTimeEIntParserRuleCall_0_0_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionState__TimeAssignment_0_0_3_1"


    // $ANTLR start "rule__TransitionState__UnitAssignment_0_0_3_2"
    // InternalArduinoML.g:4928:1: rule__TransitionState__UnitAssignment_0_0_3_2 : ( ruleTime_unit ) ;
    public final void rule__TransitionState__UnitAssignment_0_0_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:4932:1: ( ( ruleTime_unit ) )
            // InternalArduinoML.g:4933:2: ( ruleTime_unit )
            {
            // InternalArduinoML.g:4933:2: ( ruleTime_unit )
            // InternalArduinoML.g:4934:3: ruleTime_unit
            {
             before(grammarAccess.getTransitionStateAccess().getUnitTime_unitEnumRuleCall_0_0_3_2_0()); 
            pushFollow(FOLLOW_2);
            ruleTime_unit();

            state._fsp--;

             after(grammarAccess.getTransitionStateAccess().getUnitTime_unitEnumRuleCall_0_0_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionState__UnitAssignment_0_0_3_2"


    // $ANTLR start "rule__TransitionState__TimeAssignment_0_1_1"
    // InternalArduinoML.g:4943:1: rule__TransitionState__TimeAssignment_0_1_1 : ( ruleEInt ) ;
    public final void rule__TransitionState__TimeAssignment_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:4947:1: ( ( ruleEInt ) )
            // InternalArduinoML.g:4948:2: ( ruleEInt )
            {
            // InternalArduinoML.g:4948:2: ( ruleEInt )
            // InternalArduinoML.g:4949:3: ruleEInt
            {
             before(grammarAccess.getTransitionStateAccess().getTimeEIntParserRuleCall_0_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getTransitionStateAccess().getTimeEIntParserRuleCall_0_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionState__TimeAssignment_0_1_1"


    // $ANTLR start "rule__TransitionState__UnitAssignment_0_1_2"
    // InternalArduinoML.g:4958:1: rule__TransitionState__UnitAssignment_0_1_2 : ( ruleTime_unit ) ;
    public final void rule__TransitionState__UnitAssignment_0_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:4962:1: ( ( ruleTime_unit ) )
            // InternalArduinoML.g:4963:2: ( ruleTime_unit )
            {
            // InternalArduinoML.g:4963:2: ( ruleTime_unit )
            // InternalArduinoML.g:4964:3: ruleTime_unit
            {
             before(grammarAccess.getTransitionStateAccess().getUnitTime_unitEnumRuleCall_0_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleTime_unit();

            state._fsp--;

             after(grammarAccess.getTransitionStateAccess().getUnitTime_unitEnumRuleCall_0_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionState__UnitAssignment_0_1_2"


    // $ANTLR start "rule__TransitionState__Next_stateAssignment_4"
    // InternalArduinoML.g:4973:1: rule__TransitionState__Next_stateAssignment_4 : ( ( ruleEString ) ) ;
    public final void rule__TransitionState__Next_stateAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:4977:1: ( ( ( ruleEString ) ) )
            // InternalArduinoML.g:4978:2: ( ( ruleEString ) )
            {
            // InternalArduinoML.g:4978:2: ( ( ruleEString ) )
            // InternalArduinoML.g:4979:3: ( ruleEString )
            {
             before(grammarAccess.getTransitionStateAccess().getNext_stateStateCrossReference_4_0()); 
            // InternalArduinoML.g:4980:3: ( ruleEString )
            // InternalArduinoML.g:4981:4: ruleEString
            {
             before(grammarAccess.getTransitionStateAccess().getNext_stateStateEStringParserRuleCall_4_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTransitionStateAccess().getNext_stateStateEStringParserRuleCall_4_0_1()); 

            }

             after(grammarAccess.getTransitionStateAccess().getNext_stateStateCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionState__Next_stateAssignment_4"


    // $ANTLR start "rule__TransitionMode__DigitalsAssignment_0_0_1_0_0"
    // InternalArduinoML.g:4992:1: rule__TransitionMode__DigitalsAssignment_0_0_1_0_0 : ( ( ruleEString ) ) ;
    public final void rule__TransitionMode__DigitalsAssignment_0_0_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:4996:1: ( ( ( ruleEString ) ) )
            // InternalArduinoML.g:4997:2: ( ( ruleEString ) )
            {
            // InternalArduinoML.g:4997:2: ( ( ruleEString ) )
            // InternalArduinoML.g:4998:3: ( ruleEString )
            {
             before(grammarAccess.getTransitionModeAccess().getDigitalsDigitalCrossReference_0_0_1_0_0_0()); 
            // InternalArduinoML.g:4999:3: ( ruleEString )
            // InternalArduinoML.g:5000:4: ruleEString
            {
             before(grammarAccess.getTransitionModeAccess().getDigitalsDigitalEStringParserRuleCall_0_0_1_0_0_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTransitionModeAccess().getDigitalsDigitalEStringParserRuleCall_0_0_1_0_0_0_1()); 

            }

             after(grammarAccess.getTransitionModeAccess().getDigitalsDigitalCrossReference_0_0_1_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionMode__DigitalsAssignment_0_0_1_0_0"


    // $ANTLR start "rule__TransitionMode__D_valuesAssignment_0_0_1_0_2"
    // InternalArduinoML.g:5011:1: rule__TransitionMode__D_valuesAssignment_0_0_1_0_2 : ( ruleSignal ) ;
    public final void rule__TransitionMode__D_valuesAssignment_0_0_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:5015:1: ( ( ruleSignal ) )
            // InternalArduinoML.g:5016:2: ( ruleSignal )
            {
            // InternalArduinoML.g:5016:2: ( ruleSignal )
            // InternalArduinoML.g:5017:3: ruleSignal
            {
             before(grammarAccess.getTransitionModeAccess().getD_valuesSignalEnumRuleCall_0_0_1_0_2_0()); 
            pushFollow(FOLLOW_2);
            ruleSignal();

            state._fsp--;

             after(grammarAccess.getTransitionModeAccess().getD_valuesSignalEnumRuleCall_0_0_1_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionMode__D_valuesAssignment_0_0_1_0_2"


    // $ANTLR start "rule__TransitionMode__AnalogsAssignment_0_0_1_1_0"
    // InternalArduinoML.g:5026:1: rule__TransitionMode__AnalogsAssignment_0_0_1_1_0 : ( ( ruleEString ) ) ;
    public final void rule__TransitionMode__AnalogsAssignment_0_0_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:5030:1: ( ( ( ruleEString ) ) )
            // InternalArduinoML.g:5031:2: ( ( ruleEString ) )
            {
            // InternalArduinoML.g:5031:2: ( ( ruleEString ) )
            // InternalArduinoML.g:5032:3: ( ruleEString )
            {
             before(grammarAccess.getTransitionModeAccess().getAnalogsAnalogCrossReference_0_0_1_1_0_0()); 
            // InternalArduinoML.g:5033:3: ( ruleEString )
            // InternalArduinoML.g:5034:4: ruleEString
            {
             before(grammarAccess.getTransitionModeAccess().getAnalogsAnalogEStringParserRuleCall_0_0_1_1_0_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTransitionModeAccess().getAnalogsAnalogEStringParserRuleCall_0_0_1_1_0_0_1()); 

            }

             after(grammarAccess.getTransitionModeAccess().getAnalogsAnalogCrossReference_0_0_1_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionMode__AnalogsAssignment_0_0_1_1_0"


    // $ANTLR start "rule__TransitionMode__CompAssignment_0_0_1_1_1"
    // InternalArduinoML.g:5045:1: rule__TransitionMode__CompAssignment_0_0_1_1_1 : ( ruleCompare ) ;
    public final void rule__TransitionMode__CompAssignment_0_0_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:5049:1: ( ( ruleCompare ) )
            // InternalArduinoML.g:5050:2: ( ruleCompare )
            {
            // InternalArduinoML.g:5050:2: ( ruleCompare )
            // InternalArduinoML.g:5051:3: ruleCompare
            {
             before(grammarAccess.getTransitionModeAccess().getCompCompareEnumRuleCall_0_0_1_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCompare();

            state._fsp--;

             after(grammarAccess.getTransitionModeAccess().getCompCompareEnumRuleCall_0_0_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionMode__CompAssignment_0_0_1_1_1"


    // $ANTLR start "rule__TransitionMode__A_valuesAssignment_0_0_1_1_2"
    // InternalArduinoML.g:5060:1: rule__TransitionMode__A_valuesAssignment_0_0_1_1_2 : ( ruleEInt ) ;
    public final void rule__TransitionMode__A_valuesAssignment_0_0_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:5064:1: ( ( ruleEInt ) )
            // InternalArduinoML.g:5065:2: ( ruleEInt )
            {
            // InternalArduinoML.g:5065:2: ( ruleEInt )
            // InternalArduinoML.g:5066:3: ruleEInt
            {
             before(grammarAccess.getTransitionModeAccess().getA_valuesEIntParserRuleCall_0_0_1_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getTransitionModeAccess().getA_valuesEIntParserRuleCall_0_0_1_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionMode__A_valuesAssignment_0_0_1_1_2"


    // $ANTLR start "rule__TransitionMode__DigitalsAssignment_0_0_2_1_0_0"
    // InternalArduinoML.g:5075:1: rule__TransitionMode__DigitalsAssignment_0_0_2_1_0_0 : ( ( ruleEString ) ) ;
    public final void rule__TransitionMode__DigitalsAssignment_0_0_2_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:5079:1: ( ( ( ruleEString ) ) )
            // InternalArduinoML.g:5080:2: ( ( ruleEString ) )
            {
            // InternalArduinoML.g:5080:2: ( ( ruleEString ) )
            // InternalArduinoML.g:5081:3: ( ruleEString )
            {
             before(grammarAccess.getTransitionModeAccess().getDigitalsDigitalCrossReference_0_0_2_1_0_0_0()); 
            // InternalArduinoML.g:5082:3: ( ruleEString )
            // InternalArduinoML.g:5083:4: ruleEString
            {
             before(grammarAccess.getTransitionModeAccess().getDigitalsDigitalEStringParserRuleCall_0_0_2_1_0_0_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTransitionModeAccess().getDigitalsDigitalEStringParserRuleCall_0_0_2_1_0_0_0_1()); 

            }

             after(grammarAccess.getTransitionModeAccess().getDigitalsDigitalCrossReference_0_0_2_1_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionMode__DigitalsAssignment_0_0_2_1_0_0"


    // $ANTLR start "rule__TransitionMode__D_valuesAssignment_0_0_2_1_0_2"
    // InternalArduinoML.g:5094:1: rule__TransitionMode__D_valuesAssignment_0_0_2_1_0_2 : ( ruleSignal ) ;
    public final void rule__TransitionMode__D_valuesAssignment_0_0_2_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:5098:1: ( ( ruleSignal ) )
            // InternalArduinoML.g:5099:2: ( ruleSignal )
            {
            // InternalArduinoML.g:5099:2: ( ruleSignal )
            // InternalArduinoML.g:5100:3: ruleSignal
            {
             before(grammarAccess.getTransitionModeAccess().getD_valuesSignalEnumRuleCall_0_0_2_1_0_2_0()); 
            pushFollow(FOLLOW_2);
            ruleSignal();

            state._fsp--;

             after(grammarAccess.getTransitionModeAccess().getD_valuesSignalEnumRuleCall_0_0_2_1_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionMode__D_valuesAssignment_0_0_2_1_0_2"


    // $ANTLR start "rule__TransitionMode__AnalogsAssignment_0_0_2_1_1_0"
    // InternalArduinoML.g:5109:1: rule__TransitionMode__AnalogsAssignment_0_0_2_1_1_0 : ( ( ruleEString ) ) ;
    public final void rule__TransitionMode__AnalogsAssignment_0_0_2_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:5113:1: ( ( ( ruleEString ) ) )
            // InternalArduinoML.g:5114:2: ( ( ruleEString ) )
            {
            // InternalArduinoML.g:5114:2: ( ( ruleEString ) )
            // InternalArduinoML.g:5115:3: ( ruleEString )
            {
             before(grammarAccess.getTransitionModeAccess().getAnalogsAnalogCrossReference_0_0_2_1_1_0_0()); 
            // InternalArduinoML.g:5116:3: ( ruleEString )
            // InternalArduinoML.g:5117:4: ruleEString
            {
             before(grammarAccess.getTransitionModeAccess().getAnalogsAnalogEStringParserRuleCall_0_0_2_1_1_0_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTransitionModeAccess().getAnalogsAnalogEStringParserRuleCall_0_0_2_1_1_0_0_1()); 

            }

             after(grammarAccess.getTransitionModeAccess().getAnalogsAnalogCrossReference_0_0_2_1_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionMode__AnalogsAssignment_0_0_2_1_1_0"


    // $ANTLR start "rule__TransitionMode__CompAssignment_0_0_2_1_1_1"
    // InternalArduinoML.g:5128:1: rule__TransitionMode__CompAssignment_0_0_2_1_1_1 : ( ruleCompare ) ;
    public final void rule__TransitionMode__CompAssignment_0_0_2_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:5132:1: ( ( ruleCompare ) )
            // InternalArduinoML.g:5133:2: ( ruleCompare )
            {
            // InternalArduinoML.g:5133:2: ( ruleCompare )
            // InternalArduinoML.g:5134:3: ruleCompare
            {
             before(grammarAccess.getTransitionModeAccess().getCompCompareEnumRuleCall_0_0_2_1_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCompare();

            state._fsp--;

             after(grammarAccess.getTransitionModeAccess().getCompCompareEnumRuleCall_0_0_2_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionMode__CompAssignment_0_0_2_1_1_1"


    // $ANTLR start "rule__TransitionMode__A_valuesAssignment_0_0_2_1_1_2"
    // InternalArduinoML.g:5143:1: rule__TransitionMode__A_valuesAssignment_0_0_2_1_1_2 : ( ruleEInt ) ;
    public final void rule__TransitionMode__A_valuesAssignment_0_0_2_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:5147:1: ( ( ruleEInt ) )
            // InternalArduinoML.g:5148:2: ( ruleEInt )
            {
            // InternalArduinoML.g:5148:2: ( ruleEInt )
            // InternalArduinoML.g:5149:3: ruleEInt
            {
             before(grammarAccess.getTransitionModeAccess().getA_valuesEIntParserRuleCall_0_0_2_1_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getTransitionModeAccess().getA_valuesEIntParserRuleCall_0_0_2_1_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionMode__A_valuesAssignment_0_0_2_1_1_2"


    // $ANTLR start "rule__TransitionMode__TimeAssignment_0_0_3_1"
    // InternalArduinoML.g:5158:1: rule__TransitionMode__TimeAssignment_0_0_3_1 : ( ruleEInt ) ;
    public final void rule__TransitionMode__TimeAssignment_0_0_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:5162:1: ( ( ruleEInt ) )
            // InternalArduinoML.g:5163:2: ( ruleEInt )
            {
            // InternalArduinoML.g:5163:2: ( ruleEInt )
            // InternalArduinoML.g:5164:3: ruleEInt
            {
             before(grammarAccess.getTransitionModeAccess().getTimeEIntParserRuleCall_0_0_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getTransitionModeAccess().getTimeEIntParserRuleCall_0_0_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionMode__TimeAssignment_0_0_3_1"


    // $ANTLR start "rule__TransitionMode__UnitAssignment_0_0_3_2"
    // InternalArduinoML.g:5173:1: rule__TransitionMode__UnitAssignment_0_0_3_2 : ( ruleTime_unit ) ;
    public final void rule__TransitionMode__UnitAssignment_0_0_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:5177:1: ( ( ruleTime_unit ) )
            // InternalArduinoML.g:5178:2: ( ruleTime_unit )
            {
            // InternalArduinoML.g:5178:2: ( ruleTime_unit )
            // InternalArduinoML.g:5179:3: ruleTime_unit
            {
             before(grammarAccess.getTransitionModeAccess().getUnitTime_unitEnumRuleCall_0_0_3_2_0()); 
            pushFollow(FOLLOW_2);
            ruleTime_unit();

            state._fsp--;

             after(grammarAccess.getTransitionModeAccess().getUnitTime_unitEnumRuleCall_0_0_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionMode__UnitAssignment_0_0_3_2"


    // $ANTLR start "rule__TransitionMode__TimeAssignment_0_1_1"
    // InternalArduinoML.g:5188:1: rule__TransitionMode__TimeAssignment_0_1_1 : ( ruleEInt ) ;
    public final void rule__TransitionMode__TimeAssignment_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:5192:1: ( ( ruleEInt ) )
            // InternalArduinoML.g:5193:2: ( ruleEInt )
            {
            // InternalArduinoML.g:5193:2: ( ruleEInt )
            // InternalArduinoML.g:5194:3: ruleEInt
            {
             before(grammarAccess.getTransitionModeAccess().getTimeEIntParserRuleCall_0_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getTransitionModeAccess().getTimeEIntParserRuleCall_0_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionMode__TimeAssignment_0_1_1"


    // $ANTLR start "rule__TransitionMode__UnitAssignment_0_1_2"
    // InternalArduinoML.g:5203:1: rule__TransitionMode__UnitAssignment_0_1_2 : ( ruleTime_unit ) ;
    public final void rule__TransitionMode__UnitAssignment_0_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:5207:1: ( ( ruleTime_unit ) )
            // InternalArduinoML.g:5208:2: ( ruleTime_unit )
            {
            // InternalArduinoML.g:5208:2: ( ruleTime_unit )
            // InternalArduinoML.g:5209:3: ruleTime_unit
            {
             before(grammarAccess.getTransitionModeAccess().getUnitTime_unitEnumRuleCall_0_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleTime_unit();

            state._fsp--;

             after(grammarAccess.getTransitionModeAccess().getUnitTime_unitEnumRuleCall_0_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionMode__UnitAssignment_0_1_2"


    // $ANTLR start "rule__TransitionMode__Next_modeAssignment_4"
    // InternalArduinoML.g:5218:1: rule__TransitionMode__Next_modeAssignment_4 : ( ( ruleEString ) ) ;
    public final void rule__TransitionMode__Next_modeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:5222:1: ( ( ( ruleEString ) ) )
            // InternalArduinoML.g:5223:2: ( ( ruleEString ) )
            {
            // InternalArduinoML.g:5223:2: ( ( ruleEString ) )
            // InternalArduinoML.g:5224:3: ( ruleEString )
            {
             before(grammarAccess.getTransitionModeAccess().getNext_modeModeCrossReference_4_0()); 
            // InternalArduinoML.g:5225:3: ( ruleEString )
            // InternalArduinoML.g:5226:4: ruleEString
            {
             before(grammarAccess.getTransitionModeAccess().getNext_modeModeEStringParserRuleCall_4_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTransitionModeAccess().getNext_modeModeEStringParserRuleCall_4_0_1()); 

            }

             after(grammarAccess.getTransitionModeAccess().getNext_modeModeCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionMode__Next_modeAssignment_4"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000001C0000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000001C4000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000001C0000002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000062L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x00000001D0000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000020000060L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000009000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000009000000002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000009200000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000009200000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x000000C000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x00000000001F0000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x000000000000E000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000010000000000L});

}