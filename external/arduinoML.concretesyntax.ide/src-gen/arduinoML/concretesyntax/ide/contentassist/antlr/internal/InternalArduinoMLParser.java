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


    // $ANTLR start "entryRuleBrick"
    // InternalArduinoML.g:78:1: entryRuleBrick : ruleBrick EOF ;
    public final void entryRuleBrick() throws RecognitionException {
        try {
            // InternalArduinoML.g:79:1: ( ruleBrick EOF )
            // InternalArduinoML.g:80:1: ruleBrick EOF
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
    // InternalArduinoML.g:87:1: ruleBrick : ( ( rule__Brick__Group__0 ) ) ;
    public final void ruleBrick() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:91:2: ( ( ( rule__Brick__Group__0 ) ) )
            // InternalArduinoML.g:92:2: ( ( rule__Brick__Group__0 ) )
            {
            // InternalArduinoML.g:92:2: ( ( rule__Brick__Group__0 ) )
            // InternalArduinoML.g:93:3: ( rule__Brick__Group__0 )
            {
             before(grammarAccess.getBrickAccess().getGroup()); 
            // InternalArduinoML.g:94:3: ( rule__Brick__Group__0 )
            // InternalArduinoML.g:94:4: rule__Brick__Group__0
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
    // InternalArduinoML.g:103:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalArduinoML.g:104:1: ( ruleEString EOF )
            // InternalArduinoML.g:105:1: ruleEString EOF
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
    // InternalArduinoML.g:112:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:116:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalArduinoML.g:117:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalArduinoML.g:117:2: ( ( rule__EString__Alternatives ) )
            // InternalArduinoML.g:118:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalArduinoML.g:119:3: ( rule__EString__Alternatives )
            // InternalArduinoML.g:119:4: rule__EString__Alternatives
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
    // InternalArduinoML.g:128:1: entryRuleMode : ruleMode EOF ;
    public final void entryRuleMode() throws RecognitionException {
        try {
            // InternalArduinoML.g:129:1: ( ruleMode EOF )
            // InternalArduinoML.g:130:1: ruleMode EOF
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
    // InternalArduinoML.g:137:1: ruleMode : ( ( rule__Mode__Group__0 ) ) ;
    public final void ruleMode() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:141:2: ( ( ( rule__Mode__Group__0 ) ) )
            // InternalArduinoML.g:142:2: ( ( rule__Mode__Group__0 ) )
            {
            // InternalArduinoML.g:142:2: ( ( rule__Mode__Group__0 ) )
            // InternalArduinoML.g:143:3: ( rule__Mode__Group__0 )
            {
             before(grammarAccess.getModeAccess().getGroup()); 
            // InternalArduinoML.g:144:3: ( rule__Mode__Group__0 )
            // InternalArduinoML.g:144:4: rule__Mode__Group__0
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
    // InternalArduinoML.g:153:1: entryRuleState : ruleState EOF ;
    public final void entryRuleState() throws RecognitionException {
        try {
            // InternalArduinoML.g:154:1: ( ruleState EOF )
            // InternalArduinoML.g:155:1: ruleState EOF
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
    // InternalArduinoML.g:162:1: ruleState : ( ( rule__State__Group__0 ) ) ;
    public final void ruleState() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:166:2: ( ( ( rule__State__Group__0 ) ) )
            // InternalArduinoML.g:167:2: ( ( rule__State__Group__0 ) )
            {
            // InternalArduinoML.g:167:2: ( ( rule__State__Group__0 ) )
            // InternalArduinoML.g:168:3: ( rule__State__Group__0 )
            {
             before(grammarAccess.getStateAccess().getGroup()); 
            // InternalArduinoML.g:169:3: ( rule__State__Group__0 )
            // InternalArduinoML.g:169:4: rule__State__Group__0
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
    // InternalArduinoML.g:178:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // InternalArduinoML.g:179:1: ( ruleEInt EOF )
            // InternalArduinoML.g:180:1: ruleEInt EOF
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
    // InternalArduinoML.g:187:1: ruleEInt : ( RULE_INT ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:191:2: ( ( RULE_INT ) )
            // InternalArduinoML.g:192:2: ( RULE_INT )
            {
            // InternalArduinoML.g:192:2: ( RULE_INT )
            // InternalArduinoML.g:193:3: RULE_INT
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
    // InternalArduinoML.g:203:1: entryRuleActuator : ruleActuator EOF ;
    public final void entryRuleActuator() throws RecognitionException {
        try {
            // InternalArduinoML.g:204:1: ( ruleActuator EOF )
            // InternalArduinoML.g:205:1: ruleActuator EOF
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
    // InternalArduinoML.g:212:1: ruleActuator : ( ( rule__Actuator__Group__0 ) ) ;
    public final void ruleActuator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:216:2: ( ( ( rule__Actuator__Group__0 ) ) )
            // InternalArduinoML.g:217:2: ( ( rule__Actuator__Group__0 ) )
            {
            // InternalArduinoML.g:217:2: ( ( rule__Actuator__Group__0 ) )
            // InternalArduinoML.g:218:3: ( rule__Actuator__Group__0 )
            {
             before(grammarAccess.getActuatorAccess().getGroup()); 
            // InternalArduinoML.g:219:3: ( rule__Actuator__Group__0 )
            // InternalArduinoML.g:219:4: rule__Actuator__Group__0
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
    // InternalArduinoML.g:228:1: entryRuleDigital : ruleDigital EOF ;
    public final void entryRuleDigital() throws RecognitionException {
        try {
            // InternalArduinoML.g:229:1: ( ruleDigital EOF )
            // InternalArduinoML.g:230:1: ruleDigital EOF
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
    // InternalArduinoML.g:237:1: ruleDigital : ( ( rule__Digital__Group__0 ) ) ;
    public final void ruleDigital() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:241:2: ( ( ( rule__Digital__Group__0 ) ) )
            // InternalArduinoML.g:242:2: ( ( rule__Digital__Group__0 ) )
            {
            // InternalArduinoML.g:242:2: ( ( rule__Digital__Group__0 ) )
            // InternalArduinoML.g:243:3: ( rule__Digital__Group__0 )
            {
             before(grammarAccess.getDigitalAccess().getGroup()); 
            // InternalArduinoML.g:244:3: ( rule__Digital__Group__0 )
            // InternalArduinoML.g:244:4: rule__Digital__Group__0
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
    // InternalArduinoML.g:253:1: entryRuleAnalog : ruleAnalog EOF ;
    public final void entryRuleAnalog() throws RecognitionException {
        try {
            // InternalArduinoML.g:254:1: ( ruleAnalog EOF )
            // InternalArduinoML.g:255:1: ruleAnalog EOF
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
    // InternalArduinoML.g:262:1: ruleAnalog : ( ( rule__Analog__Group__0 ) ) ;
    public final void ruleAnalog() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:266:2: ( ( ( rule__Analog__Group__0 ) ) )
            // InternalArduinoML.g:267:2: ( ( rule__Analog__Group__0 ) )
            {
            // InternalArduinoML.g:267:2: ( ( rule__Analog__Group__0 ) )
            // InternalArduinoML.g:268:3: ( rule__Analog__Group__0 )
            {
             before(grammarAccess.getAnalogAccess().getGroup()); 
            // InternalArduinoML.g:269:3: ( rule__Analog__Group__0 )
            // InternalArduinoML.g:269:4: rule__Analog__Group__0
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
    // InternalArduinoML.g:278:1: entryRuleAction : ruleAction EOF ;
    public final void entryRuleAction() throws RecognitionException {
        try {
            // InternalArduinoML.g:279:1: ( ruleAction EOF )
            // InternalArduinoML.g:280:1: ruleAction EOF
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
    // InternalArduinoML.g:287:1: ruleAction : ( ( rule__Action__Group__0 ) ) ;
    public final void ruleAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:291:2: ( ( ( rule__Action__Group__0 ) ) )
            // InternalArduinoML.g:292:2: ( ( rule__Action__Group__0 ) )
            {
            // InternalArduinoML.g:292:2: ( ( rule__Action__Group__0 ) )
            // InternalArduinoML.g:293:3: ( rule__Action__Group__0 )
            {
             before(grammarAccess.getActionAccess().getGroup()); 
            // InternalArduinoML.g:294:3: ( rule__Action__Group__0 )
            // InternalArduinoML.g:294:4: rule__Action__Group__0
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
    // InternalArduinoML.g:303:1: entryRuleTransitionState : ruleTransitionState EOF ;
    public final void entryRuleTransitionState() throws RecognitionException {
        try {
            // InternalArduinoML.g:304:1: ( ruleTransitionState EOF )
            // InternalArduinoML.g:305:1: ruleTransitionState EOF
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
    // InternalArduinoML.g:312:1: ruleTransitionState : ( ( rule__TransitionState__Group__0 ) ) ;
    public final void ruleTransitionState() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:316:2: ( ( ( rule__TransitionState__Group__0 ) ) )
            // InternalArduinoML.g:317:2: ( ( rule__TransitionState__Group__0 ) )
            {
            // InternalArduinoML.g:317:2: ( ( rule__TransitionState__Group__0 ) )
            // InternalArduinoML.g:318:3: ( rule__TransitionState__Group__0 )
            {
             before(grammarAccess.getTransitionStateAccess().getGroup()); 
            // InternalArduinoML.g:319:3: ( rule__TransitionState__Group__0 )
            // InternalArduinoML.g:319:4: rule__TransitionState__Group__0
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
    // InternalArduinoML.g:328:1: entryRuleTransitionMode : ruleTransitionMode EOF ;
    public final void entryRuleTransitionMode() throws RecognitionException {
        try {
            // InternalArduinoML.g:329:1: ( ruleTransitionMode EOF )
            // InternalArduinoML.g:330:1: ruleTransitionMode EOF
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
    // InternalArduinoML.g:337:1: ruleTransitionMode : ( ( rule__TransitionMode__Group__0 ) ) ;
    public final void ruleTransitionMode() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:341:2: ( ( ( rule__TransitionMode__Group__0 ) ) )
            // InternalArduinoML.g:342:2: ( ( rule__TransitionMode__Group__0 ) )
            {
            // InternalArduinoML.g:342:2: ( ( rule__TransitionMode__Group__0 ) )
            // InternalArduinoML.g:343:3: ( rule__TransitionMode__Group__0 )
            {
             before(grammarAccess.getTransitionModeAccess().getGroup()); 
            // InternalArduinoML.g:344:3: ( rule__TransitionMode__Group__0 )
            // InternalArduinoML.g:344:4: rule__TransitionMode__Group__0
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
    // InternalArduinoML.g:353:1: ruleSignal : ( ( rule__Signal__Alternatives ) ) ;
    public final void ruleSignal() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:357:1: ( ( ( rule__Signal__Alternatives ) ) )
            // InternalArduinoML.g:358:2: ( ( rule__Signal__Alternatives ) )
            {
            // InternalArduinoML.g:358:2: ( ( rule__Signal__Alternatives ) )
            // InternalArduinoML.g:359:3: ( rule__Signal__Alternatives )
            {
             before(grammarAccess.getSignalAccess().getAlternatives()); 
            // InternalArduinoML.g:360:3: ( rule__Signal__Alternatives )
            // InternalArduinoML.g:360:4: rule__Signal__Alternatives
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
    // InternalArduinoML.g:369:1: ruleTime_unit : ( ( rule__Time_unit__Alternatives ) ) ;
    public final void ruleTime_unit() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:373:1: ( ( ( rule__Time_unit__Alternatives ) ) )
            // InternalArduinoML.g:374:2: ( ( rule__Time_unit__Alternatives ) )
            {
            // InternalArduinoML.g:374:2: ( ( rule__Time_unit__Alternatives ) )
            // InternalArduinoML.g:375:3: ( rule__Time_unit__Alternatives )
            {
             before(grammarAccess.getTime_unitAccess().getAlternatives()); 
            // InternalArduinoML.g:376:3: ( rule__Time_unit__Alternatives )
            // InternalArduinoML.g:376:4: rule__Time_unit__Alternatives
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
    // InternalArduinoML.g:385:1: ruleCompare : ( ( rule__Compare__Alternatives ) ) ;
    public final void ruleCompare() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:389:1: ( ( ( rule__Compare__Alternatives ) ) )
            // InternalArduinoML.g:390:2: ( ( rule__Compare__Alternatives ) )
            {
            // InternalArduinoML.g:390:2: ( ( rule__Compare__Alternatives ) )
            // InternalArduinoML.g:391:3: ( rule__Compare__Alternatives )
            {
             before(grammarAccess.getCompareAccess().getAlternatives()); 
            // InternalArduinoML.g:392:3: ( rule__Compare__Alternatives )
            // InternalArduinoML.g:392:4: rule__Compare__Alternatives
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
    // InternalArduinoML.g:400:1: rule__App__Alternatives : ( ( ( rule__App__Group_0__0 ) ) | ( ( rule__App__Group_1__0 ) ) );
    public final void rule__App__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:404:1: ( ( ( rule__App__Group_0__0 ) ) | ( ( rule__App__Group_1__0 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==21) ) {
                int LA1_1 = input.LA(2);

                if ( (LA1_1==RULE_STRING) ) {
                    int LA1_2 = input.LA(3);

                    if ( (LA1_2==22) ) {
                        int LA1_4 = input.LA(4);

                        if ( (LA1_4==27) ) {
                            alt1=2;
                        }
                        else if ( (LA1_4==23) ) {
                            alt1=1;
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

                        if ( (LA1_4==27) ) {
                            alt1=2;
                        }
                        else if ( (LA1_4==23) ) {
                            alt1=1;
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
                    // InternalArduinoML.g:405:2: ( ( rule__App__Group_0__0 ) )
                    {
                    // InternalArduinoML.g:405:2: ( ( rule__App__Group_0__0 ) )
                    // InternalArduinoML.g:406:3: ( rule__App__Group_0__0 )
                    {
                     before(grammarAccess.getAppAccess().getGroup_0()); 
                    // InternalArduinoML.g:407:3: ( rule__App__Group_0__0 )
                    // InternalArduinoML.g:407:4: rule__App__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__App__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAppAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalArduinoML.g:411:2: ( ( rule__App__Group_1__0 ) )
                    {
                    // InternalArduinoML.g:411:2: ( ( rule__App__Group_1__0 ) )
                    // InternalArduinoML.g:412:3: ( rule__App__Group_1__0 )
                    {
                     before(grammarAccess.getAppAccess().getGroup_1()); 
                    // InternalArduinoML.g:413:3: ( rule__App__Group_1__0 )
                    // InternalArduinoML.g:413:4: rule__App__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__App__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAppAccess().getGroup_1()); 

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
    // InternalArduinoML.g:421:1: rule__Brick__Alternatives_0 : ( ( ruleActuator ) | ( ruleDigital ) | ( ruleAnalog ) );
    public final void rule__Brick__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:425:1: ( ( ruleActuator ) | ( ruleDigital ) | ( ruleAnalog ) )
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
                    // InternalArduinoML.g:426:2: ( ruleActuator )
                    {
                    // InternalArduinoML.g:426:2: ( ruleActuator )
                    // InternalArduinoML.g:427:3: ruleActuator
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
                    // InternalArduinoML.g:432:2: ( ruleDigital )
                    {
                    // InternalArduinoML.g:432:2: ( ruleDigital )
                    // InternalArduinoML.g:433:3: ruleDigital
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
                    // InternalArduinoML.g:438:2: ( ruleAnalog )
                    {
                    // InternalArduinoML.g:438:2: ( ruleAnalog )
                    // InternalArduinoML.g:439:3: ruleAnalog
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
    // InternalArduinoML.g:448:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:452:1: ( ( RULE_STRING ) | ( RULE_ID ) )
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
                    // InternalArduinoML.g:453:2: ( RULE_STRING )
                    {
                    // InternalArduinoML.g:453:2: ( RULE_STRING )
                    // InternalArduinoML.g:454:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalArduinoML.g:459:2: ( RULE_ID )
                    {
                    // InternalArduinoML.g:459:2: ( RULE_ID )
                    // InternalArduinoML.g:460:3: RULE_ID
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
    // InternalArduinoML.g:469:1: rule__TransitionState__Alternatives_0 : ( ( ( rule__TransitionState__Group_0_0__0 ) ) | ( ( rule__TransitionState__Group_0_1__0 ) ) );
    public final void rule__TransitionState__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:473:1: ( ( ( rule__TransitionState__Group_0_0__0 ) ) | ( ( rule__TransitionState__Group_0_1__0 ) ) )
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
                    // InternalArduinoML.g:474:2: ( ( rule__TransitionState__Group_0_0__0 ) )
                    {
                    // InternalArduinoML.g:474:2: ( ( rule__TransitionState__Group_0_0__0 ) )
                    // InternalArduinoML.g:475:3: ( rule__TransitionState__Group_0_0__0 )
                    {
                     before(grammarAccess.getTransitionStateAccess().getGroup_0_0()); 
                    // InternalArduinoML.g:476:3: ( rule__TransitionState__Group_0_0__0 )
                    // InternalArduinoML.g:476:4: rule__TransitionState__Group_0_0__0
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
                    // InternalArduinoML.g:480:2: ( ( rule__TransitionState__Group_0_1__0 ) )
                    {
                    // InternalArduinoML.g:480:2: ( ( rule__TransitionState__Group_0_1__0 ) )
                    // InternalArduinoML.g:481:3: ( rule__TransitionState__Group_0_1__0 )
                    {
                     before(grammarAccess.getTransitionStateAccess().getGroup_0_1()); 
                    // InternalArduinoML.g:482:3: ( rule__TransitionState__Group_0_1__0 )
                    // InternalArduinoML.g:482:4: rule__TransitionState__Group_0_1__0
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
    // InternalArduinoML.g:490:1: rule__TransitionState__Alternatives_0_0_1 : ( ( ( rule__TransitionState__Group_0_0_1_0__0 ) ) | ( ( rule__TransitionState__Group_0_0_1_1__0 ) ) );
    public final void rule__TransitionState__Alternatives_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:494:1: ( ( ( rule__TransitionState__Group_0_0_1_0__0 ) ) | ( ( rule__TransitionState__Group_0_0_1_1__0 ) ) )
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
                    // InternalArduinoML.g:495:2: ( ( rule__TransitionState__Group_0_0_1_0__0 ) )
                    {
                    // InternalArduinoML.g:495:2: ( ( rule__TransitionState__Group_0_0_1_0__0 ) )
                    // InternalArduinoML.g:496:3: ( rule__TransitionState__Group_0_0_1_0__0 )
                    {
                     before(grammarAccess.getTransitionStateAccess().getGroup_0_0_1_0()); 
                    // InternalArduinoML.g:497:3: ( rule__TransitionState__Group_0_0_1_0__0 )
                    // InternalArduinoML.g:497:4: rule__TransitionState__Group_0_0_1_0__0
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
                    // InternalArduinoML.g:501:2: ( ( rule__TransitionState__Group_0_0_1_1__0 ) )
                    {
                    // InternalArduinoML.g:501:2: ( ( rule__TransitionState__Group_0_0_1_1__0 ) )
                    // InternalArduinoML.g:502:3: ( rule__TransitionState__Group_0_0_1_1__0 )
                    {
                     before(grammarAccess.getTransitionStateAccess().getGroup_0_0_1_1()); 
                    // InternalArduinoML.g:503:3: ( rule__TransitionState__Group_0_0_1_1__0 )
                    // InternalArduinoML.g:503:4: rule__TransitionState__Group_0_0_1_1__0
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
    // InternalArduinoML.g:511:1: rule__TransitionState__Alternatives_0_0_2_1 : ( ( ( rule__TransitionState__Group_0_0_2_1_0__0 ) ) | ( ( rule__TransitionState__Group_0_0_2_1_1__0 ) ) );
    public final void rule__TransitionState__Alternatives_0_0_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:515:1: ( ( ( rule__TransitionState__Group_0_0_2_1_0__0 ) ) | ( ( rule__TransitionState__Group_0_0_2_1_1__0 ) ) )
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
                    // InternalArduinoML.g:516:2: ( ( rule__TransitionState__Group_0_0_2_1_0__0 ) )
                    {
                    // InternalArduinoML.g:516:2: ( ( rule__TransitionState__Group_0_0_2_1_0__0 ) )
                    // InternalArduinoML.g:517:3: ( rule__TransitionState__Group_0_0_2_1_0__0 )
                    {
                     before(grammarAccess.getTransitionStateAccess().getGroup_0_0_2_1_0()); 
                    // InternalArduinoML.g:518:3: ( rule__TransitionState__Group_0_0_2_1_0__0 )
                    // InternalArduinoML.g:518:4: rule__TransitionState__Group_0_0_2_1_0__0
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
                    // InternalArduinoML.g:522:2: ( ( rule__TransitionState__Group_0_0_2_1_1__0 ) )
                    {
                    // InternalArduinoML.g:522:2: ( ( rule__TransitionState__Group_0_0_2_1_1__0 ) )
                    // InternalArduinoML.g:523:3: ( rule__TransitionState__Group_0_0_2_1_1__0 )
                    {
                     before(grammarAccess.getTransitionStateAccess().getGroup_0_0_2_1_1()); 
                    // InternalArduinoML.g:524:3: ( rule__TransitionState__Group_0_0_2_1_1__0 )
                    // InternalArduinoML.g:524:4: rule__TransitionState__Group_0_0_2_1_1__0
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
    // InternalArduinoML.g:532:1: rule__TransitionMode__Alternatives_0 : ( ( ( rule__TransitionMode__Group_0_0__0 ) ) | ( ( rule__TransitionMode__Group_0_1__0 ) ) );
    public final void rule__TransitionMode__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:536:1: ( ( ( rule__TransitionMode__Group_0_0__0 ) ) | ( ( rule__TransitionMode__Group_0_1__0 ) ) )
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
                    // InternalArduinoML.g:537:2: ( ( rule__TransitionMode__Group_0_0__0 ) )
                    {
                    // InternalArduinoML.g:537:2: ( ( rule__TransitionMode__Group_0_0__0 ) )
                    // InternalArduinoML.g:538:3: ( rule__TransitionMode__Group_0_0__0 )
                    {
                     before(grammarAccess.getTransitionModeAccess().getGroup_0_0()); 
                    // InternalArduinoML.g:539:3: ( rule__TransitionMode__Group_0_0__0 )
                    // InternalArduinoML.g:539:4: rule__TransitionMode__Group_0_0__0
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
                    // InternalArduinoML.g:543:2: ( ( rule__TransitionMode__Group_0_1__0 ) )
                    {
                    // InternalArduinoML.g:543:2: ( ( rule__TransitionMode__Group_0_1__0 ) )
                    // InternalArduinoML.g:544:3: ( rule__TransitionMode__Group_0_1__0 )
                    {
                     before(grammarAccess.getTransitionModeAccess().getGroup_0_1()); 
                    // InternalArduinoML.g:545:3: ( rule__TransitionMode__Group_0_1__0 )
                    // InternalArduinoML.g:545:4: rule__TransitionMode__Group_0_1__0
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
    // InternalArduinoML.g:553:1: rule__TransitionMode__Alternatives_0_0_1 : ( ( ( rule__TransitionMode__Group_0_0_1_0__0 ) ) | ( ( rule__TransitionMode__Group_0_0_1_1__0 ) ) );
    public final void rule__TransitionMode__Alternatives_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:557:1: ( ( ( rule__TransitionMode__Group_0_0_1_0__0 ) ) | ( ( rule__TransitionMode__Group_0_0_1_1__0 ) ) )
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

                if ( (LA8_2==37) ) {
                    alt8=1;
                }
                else if ( ((LA8_2>=16 && LA8_2<=20)) ) {
                    alt8=2;
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
                    // InternalArduinoML.g:558:2: ( ( rule__TransitionMode__Group_0_0_1_0__0 ) )
                    {
                    // InternalArduinoML.g:558:2: ( ( rule__TransitionMode__Group_0_0_1_0__0 ) )
                    // InternalArduinoML.g:559:3: ( rule__TransitionMode__Group_0_0_1_0__0 )
                    {
                     before(grammarAccess.getTransitionModeAccess().getGroup_0_0_1_0()); 
                    // InternalArduinoML.g:560:3: ( rule__TransitionMode__Group_0_0_1_0__0 )
                    // InternalArduinoML.g:560:4: rule__TransitionMode__Group_0_0_1_0__0
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
                    // InternalArduinoML.g:564:2: ( ( rule__TransitionMode__Group_0_0_1_1__0 ) )
                    {
                    // InternalArduinoML.g:564:2: ( ( rule__TransitionMode__Group_0_0_1_1__0 ) )
                    // InternalArduinoML.g:565:3: ( rule__TransitionMode__Group_0_0_1_1__0 )
                    {
                     before(grammarAccess.getTransitionModeAccess().getGroup_0_0_1_1()); 
                    // InternalArduinoML.g:566:3: ( rule__TransitionMode__Group_0_0_1_1__0 )
                    // InternalArduinoML.g:566:4: rule__TransitionMode__Group_0_0_1_1__0
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
    // InternalArduinoML.g:574:1: rule__TransitionMode__Alternatives_0_0_2_1 : ( ( ( rule__TransitionMode__Group_0_0_2_1_0__0 ) ) | ( ( rule__TransitionMode__Group_0_0_2_1_1__0 ) ) );
    public final void rule__TransitionMode__Alternatives_0_0_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:578:1: ( ( ( rule__TransitionMode__Group_0_0_2_1_0__0 ) ) | ( ( rule__TransitionMode__Group_0_0_2_1_1__0 ) ) )
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
                    // InternalArduinoML.g:579:2: ( ( rule__TransitionMode__Group_0_0_2_1_0__0 ) )
                    {
                    // InternalArduinoML.g:579:2: ( ( rule__TransitionMode__Group_0_0_2_1_0__0 ) )
                    // InternalArduinoML.g:580:3: ( rule__TransitionMode__Group_0_0_2_1_0__0 )
                    {
                     before(grammarAccess.getTransitionModeAccess().getGroup_0_0_2_1_0()); 
                    // InternalArduinoML.g:581:3: ( rule__TransitionMode__Group_0_0_2_1_0__0 )
                    // InternalArduinoML.g:581:4: rule__TransitionMode__Group_0_0_2_1_0__0
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
                    // InternalArduinoML.g:585:2: ( ( rule__TransitionMode__Group_0_0_2_1_1__0 ) )
                    {
                    // InternalArduinoML.g:585:2: ( ( rule__TransitionMode__Group_0_0_2_1_1__0 ) )
                    // InternalArduinoML.g:586:3: ( rule__TransitionMode__Group_0_0_2_1_1__0 )
                    {
                     before(grammarAccess.getTransitionModeAccess().getGroup_0_0_2_1_1()); 
                    // InternalArduinoML.g:587:3: ( rule__TransitionMode__Group_0_0_2_1_1__0 )
                    // InternalArduinoML.g:587:4: rule__TransitionMode__Group_0_0_2_1_1__0
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
    // InternalArduinoML.g:595:1: rule__Signal__Alternatives : ( ( ( 'HIGH' ) ) | ( ( 'LOW' ) ) );
    public final void rule__Signal__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:599:1: ( ( ( 'HIGH' ) ) | ( ( 'LOW' ) ) )
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
                    // InternalArduinoML.g:600:2: ( ( 'HIGH' ) )
                    {
                    // InternalArduinoML.g:600:2: ( ( 'HIGH' ) )
                    // InternalArduinoML.g:601:3: ( 'HIGH' )
                    {
                     before(grammarAccess.getSignalAccess().getHIGHEnumLiteralDeclaration_0()); 
                    // InternalArduinoML.g:602:3: ( 'HIGH' )
                    // InternalArduinoML.g:602:4: 'HIGH'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getSignalAccess().getHIGHEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalArduinoML.g:606:2: ( ( 'LOW' ) )
                    {
                    // InternalArduinoML.g:606:2: ( ( 'LOW' ) )
                    // InternalArduinoML.g:607:3: ( 'LOW' )
                    {
                     before(grammarAccess.getSignalAccess().getLOWEnumLiteralDeclaration_1()); 
                    // InternalArduinoML.g:608:3: ( 'LOW' )
                    // InternalArduinoML.g:608:4: 'LOW'
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
    // InternalArduinoML.g:616:1: rule__Time_unit__Alternatives : ( ( ( 'ms' ) ) | ( ( 's' ) ) | ( ( 'min' ) ) );
    public final void rule__Time_unit__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:620:1: ( ( ( 'ms' ) ) | ( ( 's' ) ) | ( ( 'min' ) ) )
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
                    // InternalArduinoML.g:621:2: ( ( 'ms' ) )
                    {
                    // InternalArduinoML.g:621:2: ( ( 'ms' ) )
                    // InternalArduinoML.g:622:3: ( 'ms' )
                    {
                     before(grammarAccess.getTime_unitAccess().getMsEnumLiteralDeclaration_0()); 
                    // InternalArduinoML.g:623:3: ( 'ms' )
                    // InternalArduinoML.g:623:4: 'ms'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getTime_unitAccess().getMsEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalArduinoML.g:627:2: ( ( 's' ) )
                    {
                    // InternalArduinoML.g:627:2: ( ( 's' ) )
                    // InternalArduinoML.g:628:3: ( 's' )
                    {
                     before(grammarAccess.getTime_unitAccess().getSEnumLiteralDeclaration_1()); 
                    // InternalArduinoML.g:629:3: ( 's' )
                    // InternalArduinoML.g:629:4: 's'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getTime_unitAccess().getSEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalArduinoML.g:633:2: ( ( 'min' ) )
                    {
                    // InternalArduinoML.g:633:2: ( ( 'min' ) )
                    // InternalArduinoML.g:634:3: ( 'min' )
                    {
                     before(grammarAccess.getTime_unitAccess().getMinEnumLiteralDeclaration_2()); 
                    // InternalArduinoML.g:635:3: ( 'min' )
                    // InternalArduinoML.g:635:4: 'min'
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
    // InternalArduinoML.g:643:1: rule__Compare__Alternatives : ( ( ( 'inf' ) ) | ( ( 'einf' ) ) | ( ( 'equal' ) ) | ( ( 'esup' ) ) | ( ( 'sup' ) ) );
    public final void rule__Compare__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:647:1: ( ( ( 'inf' ) ) | ( ( 'einf' ) ) | ( ( 'equal' ) ) | ( ( 'esup' ) ) | ( ( 'sup' ) ) )
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
                    // InternalArduinoML.g:648:2: ( ( 'inf' ) )
                    {
                    // InternalArduinoML.g:648:2: ( ( 'inf' ) )
                    // InternalArduinoML.g:649:3: ( 'inf' )
                    {
                     before(grammarAccess.getCompareAccess().getInfEnumLiteralDeclaration_0()); 
                    // InternalArduinoML.g:650:3: ( 'inf' )
                    // InternalArduinoML.g:650:4: 'inf'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getCompareAccess().getInfEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalArduinoML.g:654:2: ( ( 'einf' ) )
                    {
                    // InternalArduinoML.g:654:2: ( ( 'einf' ) )
                    // InternalArduinoML.g:655:3: ( 'einf' )
                    {
                     before(grammarAccess.getCompareAccess().getEinfEnumLiteralDeclaration_1()); 
                    // InternalArduinoML.g:656:3: ( 'einf' )
                    // InternalArduinoML.g:656:4: 'einf'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getCompareAccess().getEinfEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalArduinoML.g:660:2: ( ( 'equal' ) )
                    {
                    // InternalArduinoML.g:660:2: ( ( 'equal' ) )
                    // InternalArduinoML.g:661:3: ( 'equal' )
                    {
                     before(grammarAccess.getCompareAccess().getEqualEnumLiteralDeclaration_2()); 
                    // InternalArduinoML.g:662:3: ( 'equal' )
                    // InternalArduinoML.g:662:4: 'equal'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getCompareAccess().getEqualEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalArduinoML.g:666:2: ( ( 'esup' ) )
                    {
                    // InternalArduinoML.g:666:2: ( ( 'esup' ) )
                    // InternalArduinoML.g:667:3: ( 'esup' )
                    {
                     before(grammarAccess.getCompareAccess().getEsupEnumLiteralDeclaration_3()); 
                    // InternalArduinoML.g:668:3: ( 'esup' )
                    // InternalArduinoML.g:668:4: 'esup'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getCompareAccess().getEsupEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalArduinoML.g:672:2: ( ( 'sup' ) )
                    {
                    // InternalArduinoML.g:672:2: ( ( 'sup' ) )
                    // InternalArduinoML.g:673:3: ( 'sup' )
                    {
                     before(grammarAccess.getCompareAccess().getSupEnumLiteralDeclaration_4()); 
                    // InternalArduinoML.g:674:3: ( 'sup' )
                    // InternalArduinoML.g:674:4: 'sup'
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


    // $ANTLR start "rule__App__Group_0__0"
    // InternalArduinoML.g:682:1: rule__App__Group_0__0 : rule__App__Group_0__0__Impl rule__App__Group_0__1 ;
    public final void rule__App__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:686:1: ( rule__App__Group_0__0__Impl rule__App__Group_0__1 )
            // InternalArduinoML.g:687:2: rule__App__Group_0__0__Impl rule__App__Group_0__1
            {
            pushFollow(FOLLOW_3);
            rule__App__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__App__Group_0__1();

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
    // $ANTLR end "rule__App__Group_0__0"


    // $ANTLR start "rule__App__Group_0__0__Impl"
    // InternalArduinoML.g:694:1: rule__App__Group_0__0__Impl : ( 'app' ) ;
    public final void rule__App__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:698:1: ( ( 'app' ) )
            // InternalArduinoML.g:699:1: ( 'app' )
            {
            // InternalArduinoML.g:699:1: ( 'app' )
            // InternalArduinoML.g:700:2: 'app'
            {
             before(grammarAccess.getAppAccess().getAppKeyword_0_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getAppAccess().getAppKeyword_0_0()); 

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
    // $ANTLR end "rule__App__Group_0__0__Impl"


    // $ANTLR start "rule__App__Group_0__1"
    // InternalArduinoML.g:709:1: rule__App__Group_0__1 : rule__App__Group_0__1__Impl rule__App__Group_0__2 ;
    public final void rule__App__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:713:1: ( rule__App__Group_0__1__Impl rule__App__Group_0__2 )
            // InternalArduinoML.g:714:2: rule__App__Group_0__1__Impl rule__App__Group_0__2
            {
            pushFollow(FOLLOW_4);
            rule__App__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__App__Group_0__2();

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
    // $ANTLR end "rule__App__Group_0__1"


    // $ANTLR start "rule__App__Group_0__1__Impl"
    // InternalArduinoML.g:721:1: rule__App__Group_0__1__Impl : ( ( rule__App__NameAssignment_0_1 ) ) ;
    public final void rule__App__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:725:1: ( ( ( rule__App__NameAssignment_0_1 ) ) )
            // InternalArduinoML.g:726:1: ( ( rule__App__NameAssignment_0_1 ) )
            {
            // InternalArduinoML.g:726:1: ( ( rule__App__NameAssignment_0_1 ) )
            // InternalArduinoML.g:727:2: ( rule__App__NameAssignment_0_1 )
            {
             before(grammarAccess.getAppAccess().getNameAssignment_0_1()); 
            // InternalArduinoML.g:728:2: ( rule__App__NameAssignment_0_1 )
            // InternalArduinoML.g:728:3: rule__App__NameAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__App__NameAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getAppAccess().getNameAssignment_0_1()); 

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
    // $ANTLR end "rule__App__Group_0__1__Impl"


    // $ANTLR start "rule__App__Group_0__2"
    // InternalArduinoML.g:736:1: rule__App__Group_0__2 : rule__App__Group_0__2__Impl rule__App__Group_0__3 ;
    public final void rule__App__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:740:1: ( rule__App__Group_0__2__Impl rule__App__Group_0__3 )
            // InternalArduinoML.g:741:2: rule__App__Group_0__2__Impl rule__App__Group_0__3
            {
            pushFollow(FOLLOW_5);
            rule__App__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__App__Group_0__3();

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
    // $ANTLR end "rule__App__Group_0__2"


    // $ANTLR start "rule__App__Group_0__2__Impl"
    // InternalArduinoML.g:748:1: rule__App__Group_0__2__Impl : ( 'initial' ) ;
    public final void rule__App__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:752:1: ( ( 'initial' ) )
            // InternalArduinoML.g:753:1: ( 'initial' )
            {
            // InternalArduinoML.g:753:1: ( 'initial' )
            // InternalArduinoML.g:754:2: 'initial'
            {
             before(grammarAccess.getAppAccess().getInitialKeyword_0_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getAppAccess().getInitialKeyword_0_2()); 

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
    // $ANTLR end "rule__App__Group_0__2__Impl"


    // $ANTLR start "rule__App__Group_0__3"
    // InternalArduinoML.g:763:1: rule__App__Group_0__3 : rule__App__Group_0__3__Impl rule__App__Group_0__4 ;
    public final void rule__App__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:767:1: ( rule__App__Group_0__3__Impl rule__App__Group_0__4 )
            // InternalArduinoML.g:768:2: rule__App__Group_0__3__Impl rule__App__Group_0__4
            {
            pushFollow(FOLLOW_3);
            rule__App__Group_0__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__App__Group_0__4();

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
    // $ANTLR end "rule__App__Group_0__3"


    // $ANTLR start "rule__App__Group_0__3__Impl"
    // InternalArduinoML.g:775:1: rule__App__Group_0__3__Impl : ( 'state' ) ;
    public final void rule__App__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:779:1: ( ( 'state' ) )
            // InternalArduinoML.g:780:1: ( 'state' )
            {
            // InternalArduinoML.g:780:1: ( 'state' )
            // InternalArduinoML.g:781:2: 'state'
            {
             before(grammarAccess.getAppAccess().getStateKeyword_0_3()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getAppAccess().getStateKeyword_0_3()); 

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
    // $ANTLR end "rule__App__Group_0__3__Impl"


    // $ANTLR start "rule__App__Group_0__4"
    // InternalArduinoML.g:790:1: rule__App__Group_0__4 : rule__App__Group_0__4__Impl rule__App__Group_0__5 ;
    public final void rule__App__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:794:1: ( rule__App__Group_0__4__Impl rule__App__Group_0__5 )
            // InternalArduinoML.g:795:2: rule__App__Group_0__4__Impl rule__App__Group_0__5
            {
            pushFollow(FOLLOW_6);
            rule__App__Group_0__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__App__Group_0__5();

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
    // $ANTLR end "rule__App__Group_0__4"


    // $ANTLR start "rule__App__Group_0__4__Impl"
    // InternalArduinoML.g:802:1: rule__App__Group_0__4__Impl : ( ( rule__App__Initial_stateAssignment_0_4 ) ) ;
    public final void rule__App__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:806:1: ( ( ( rule__App__Initial_stateAssignment_0_4 ) ) )
            // InternalArduinoML.g:807:1: ( ( rule__App__Initial_stateAssignment_0_4 ) )
            {
            // InternalArduinoML.g:807:1: ( ( rule__App__Initial_stateAssignment_0_4 ) )
            // InternalArduinoML.g:808:2: ( rule__App__Initial_stateAssignment_0_4 )
            {
             before(grammarAccess.getAppAccess().getInitial_stateAssignment_0_4()); 
            // InternalArduinoML.g:809:2: ( rule__App__Initial_stateAssignment_0_4 )
            // InternalArduinoML.g:809:3: rule__App__Initial_stateAssignment_0_4
            {
            pushFollow(FOLLOW_2);
            rule__App__Initial_stateAssignment_0_4();

            state._fsp--;


            }

             after(grammarAccess.getAppAccess().getInitial_stateAssignment_0_4()); 

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
    // $ANTLR end "rule__App__Group_0__4__Impl"


    // $ANTLR start "rule__App__Group_0__5"
    // InternalArduinoML.g:817:1: rule__App__Group_0__5 : rule__App__Group_0__5__Impl rule__App__Group_0__6 ;
    public final void rule__App__Group_0__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:821:1: ( rule__App__Group_0__5__Impl rule__App__Group_0__6 )
            // InternalArduinoML.g:822:2: rule__App__Group_0__5__Impl rule__App__Group_0__6
            {
            pushFollow(FOLLOW_7);
            rule__App__Group_0__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__App__Group_0__6();

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
    // $ANTLR end "rule__App__Group_0__5"


    // $ANTLR start "rule__App__Group_0__5__Impl"
    // InternalArduinoML.g:829:1: rule__App__Group_0__5__Impl : ( ':' ) ;
    public final void rule__App__Group_0__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:833:1: ( ( ':' ) )
            // InternalArduinoML.g:834:1: ( ':' )
            {
            // InternalArduinoML.g:834:1: ( ':' )
            // InternalArduinoML.g:835:2: ':'
            {
             before(grammarAccess.getAppAccess().getColonKeyword_0_5()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getAppAccess().getColonKeyword_0_5()); 

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
    // $ANTLR end "rule__App__Group_0__5__Impl"


    // $ANTLR start "rule__App__Group_0__6"
    // InternalArduinoML.g:844:1: rule__App__Group_0__6 : rule__App__Group_0__6__Impl rule__App__Group_0__7 ;
    public final void rule__App__Group_0__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:848:1: ( rule__App__Group_0__6__Impl rule__App__Group_0__7 )
            // InternalArduinoML.g:849:2: rule__App__Group_0__6__Impl rule__App__Group_0__7
            {
            pushFollow(FOLLOW_6);
            rule__App__Group_0__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__App__Group_0__7();

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
    // $ANTLR end "rule__App__Group_0__6"


    // $ANTLR start "rule__App__Group_0__6__Impl"
    // InternalArduinoML.g:856:1: rule__App__Group_0__6__Impl : ( 'bricks' ) ;
    public final void rule__App__Group_0__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:860:1: ( ( 'bricks' ) )
            // InternalArduinoML.g:861:1: ( 'bricks' )
            {
            // InternalArduinoML.g:861:1: ( 'bricks' )
            // InternalArduinoML.g:862:2: 'bricks'
            {
             before(grammarAccess.getAppAccess().getBricksKeyword_0_6()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getAppAccess().getBricksKeyword_0_6()); 

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
    // $ANTLR end "rule__App__Group_0__6__Impl"


    // $ANTLR start "rule__App__Group_0__7"
    // InternalArduinoML.g:871:1: rule__App__Group_0__7 : rule__App__Group_0__7__Impl rule__App__Group_0__8 ;
    public final void rule__App__Group_0__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:875:1: ( rule__App__Group_0__7__Impl rule__App__Group_0__8 )
            // InternalArduinoML.g:876:2: rule__App__Group_0__7__Impl rule__App__Group_0__8
            {
            pushFollow(FOLLOW_8);
            rule__App__Group_0__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__App__Group_0__8();

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
    // $ANTLR end "rule__App__Group_0__7"


    // $ANTLR start "rule__App__Group_0__7__Impl"
    // InternalArduinoML.g:883:1: rule__App__Group_0__7__Impl : ( ':' ) ;
    public final void rule__App__Group_0__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:887:1: ( ( ':' ) )
            // InternalArduinoML.g:888:1: ( ':' )
            {
            // InternalArduinoML.g:888:1: ( ':' )
            // InternalArduinoML.g:889:2: ':'
            {
             before(grammarAccess.getAppAccess().getColonKeyword_0_7()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getAppAccess().getColonKeyword_0_7()); 

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
    // $ANTLR end "rule__App__Group_0__7__Impl"


    // $ANTLR start "rule__App__Group_0__8"
    // InternalArduinoML.g:898:1: rule__App__Group_0__8 : rule__App__Group_0__8__Impl rule__App__Group_0__9 ;
    public final void rule__App__Group_0__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:902:1: ( rule__App__Group_0__8__Impl rule__App__Group_0__9 )
            // InternalArduinoML.g:903:2: rule__App__Group_0__8__Impl rule__App__Group_0__9
            {
            pushFollow(FOLLOW_9);
            rule__App__Group_0__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__App__Group_0__9();

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
    // $ANTLR end "rule__App__Group_0__8"


    // $ANTLR start "rule__App__Group_0__8__Impl"
    // InternalArduinoML.g:910:1: rule__App__Group_0__8__Impl : ( ( rule__App__BricksAssignment_0_8 ) ) ;
    public final void rule__App__Group_0__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:914:1: ( ( ( rule__App__BricksAssignment_0_8 ) ) )
            // InternalArduinoML.g:915:1: ( ( rule__App__BricksAssignment_0_8 ) )
            {
            // InternalArduinoML.g:915:1: ( ( rule__App__BricksAssignment_0_8 ) )
            // InternalArduinoML.g:916:2: ( rule__App__BricksAssignment_0_8 )
            {
             before(grammarAccess.getAppAccess().getBricksAssignment_0_8()); 
            // InternalArduinoML.g:917:2: ( rule__App__BricksAssignment_0_8 )
            // InternalArduinoML.g:917:3: rule__App__BricksAssignment_0_8
            {
            pushFollow(FOLLOW_2);
            rule__App__BricksAssignment_0_8();

            state._fsp--;


            }

             after(grammarAccess.getAppAccess().getBricksAssignment_0_8()); 

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
    // $ANTLR end "rule__App__Group_0__8__Impl"


    // $ANTLR start "rule__App__Group_0__9"
    // InternalArduinoML.g:925:1: rule__App__Group_0__9 : rule__App__Group_0__9__Impl rule__App__Group_0__10 ;
    public final void rule__App__Group_0__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:929:1: ( rule__App__Group_0__9__Impl rule__App__Group_0__10 )
            // InternalArduinoML.g:930:2: rule__App__Group_0__9__Impl rule__App__Group_0__10
            {
            pushFollow(FOLLOW_9);
            rule__App__Group_0__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__App__Group_0__10();

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
    // $ANTLR end "rule__App__Group_0__9"


    // $ANTLR start "rule__App__Group_0__9__Impl"
    // InternalArduinoML.g:937:1: rule__App__Group_0__9__Impl : ( ( rule__App__BricksAssignment_0_9 )* ) ;
    public final void rule__App__Group_0__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:941:1: ( ( ( rule__App__BricksAssignment_0_9 )* ) )
            // InternalArduinoML.g:942:1: ( ( rule__App__BricksAssignment_0_9 )* )
            {
            // InternalArduinoML.g:942:1: ( ( rule__App__BricksAssignment_0_9 )* )
            // InternalArduinoML.g:943:2: ( rule__App__BricksAssignment_0_9 )*
            {
             before(grammarAccess.getAppAccess().getBricksAssignment_0_9()); 
            // InternalArduinoML.g:944:2: ( rule__App__BricksAssignment_0_9 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=30 && LA13_0<=32)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalArduinoML.g:944:3: rule__App__BricksAssignment_0_9
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__App__BricksAssignment_0_9();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getAppAccess().getBricksAssignment_0_9()); 

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
    // $ANTLR end "rule__App__Group_0__9__Impl"


    // $ANTLR start "rule__App__Group_0__10"
    // InternalArduinoML.g:952:1: rule__App__Group_0__10 : rule__App__Group_0__10__Impl rule__App__Group_0__11 ;
    public final void rule__App__Group_0__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:956:1: ( rule__App__Group_0__10__Impl rule__App__Group_0__11 )
            // InternalArduinoML.g:957:2: rule__App__Group_0__10__Impl rule__App__Group_0__11
            {
            pushFollow(FOLLOW_6);
            rule__App__Group_0__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__App__Group_0__11();

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
    // $ANTLR end "rule__App__Group_0__10"


    // $ANTLR start "rule__App__Group_0__10__Impl"
    // InternalArduinoML.g:964:1: rule__App__Group_0__10__Impl : ( 'states' ) ;
    public final void rule__App__Group_0__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:968:1: ( ( 'states' ) )
            // InternalArduinoML.g:969:1: ( 'states' )
            {
            // InternalArduinoML.g:969:1: ( 'states' )
            // InternalArduinoML.g:970:2: 'states'
            {
             before(grammarAccess.getAppAccess().getStatesKeyword_0_10()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getAppAccess().getStatesKeyword_0_10()); 

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
    // $ANTLR end "rule__App__Group_0__10__Impl"


    // $ANTLR start "rule__App__Group_0__11"
    // InternalArduinoML.g:979:1: rule__App__Group_0__11 : rule__App__Group_0__11__Impl rule__App__Group_0__12 ;
    public final void rule__App__Group_0__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:983:1: ( rule__App__Group_0__11__Impl rule__App__Group_0__12 )
            // InternalArduinoML.g:984:2: rule__App__Group_0__11__Impl rule__App__Group_0__12
            {
            pushFollow(FOLLOW_3);
            rule__App__Group_0__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__App__Group_0__12();

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
    // $ANTLR end "rule__App__Group_0__11"


    // $ANTLR start "rule__App__Group_0__11__Impl"
    // InternalArduinoML.g:991:1: rule__App__Group_0__11__Impl : ( ':' ) ;
    public final void rule__App__Group_0__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:995:1: ( ( ':' ) )
            // InternalArduinoML.g:996:1: ( ':' )
            {
            // InternalArduinoML.g:996:1: ( ':' )
            // InternalArduinoML.g:997:2: ':'
            {
             before(grammarAccess.getAppAccess().getColonKeyword_0_11()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getAppAccess().getColonKeyword_0_11()); 

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
    // $ANTLR end "rule__App__Group_0__11__Impl"


    // $ANTLR start "rule__App__Group_0__12"
    // InternalArduinoML.g:1006:1: rule__App__Group_0__12 : rule__App__Group_0__12__Impl rule__App__Group_0__13 ;
    public final void rule__App__Group_0__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1010:1: ( rule__App__Group_0__12__Impl rule__App__Group_0__13 )
            // InternalArduinoML.g:1011:2: rule__App__Group_0__12__Impl rule__App__Group_0__13
            {
            pushFollow(FOLLOW_3);
            rule__App__Group_0__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__App__Group_0__13();

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
    // $ANTLR end "rule__App__Group_0__12"


    // $ANTLR start "rule__App__Group_0__12__Impl"
    // InternalArduinoML.g:1018:1: rule__App__Group_0__12__Impl : ( ( rule__App__StatesAssignment_0_12 ) ) ;
    public final void rule__App__Group_0__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1022:1: ( ( ( rule__App__StatesAssignment_0_12 ) ) )
            // InternalArduinoML.g:1023:1: ( ( rule__App__StatesAssignment_0_12 ) )
            {
            // InternalArduinoML.g:1023:1: ( ( rule__App__StatesAssignment_0_12 ) )
            // InternalArduinoML.g:1024:2: ( rule__App__StatesAssignment_0_12 )
            {
             before(grammarAccess.getAppAccess().getStatesAssignment_0_12()); 
            // InternalArduinoML.g:1025:2: ( rule__App__StatesAssignment_0_12 )
            // InternalArduinoML.g:1025:3: rule__App__StatesAssignment_0_12
            {
            pushFollow(FOLLOW_2);
            rule__App__StatesAssignment_0_12();

            state._fsp--;


            }

             after(grammarAccess.getAppAccess().getStatesAssignment_0_12()); 

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
    // $ANTLR end "rule__App__Group_0__12__Impl"


    // $ANTLR start "rule__App__Group_0__13"
    // InternalArduinoML.g:1033:1: rule__App__Group_0__13 : rule__App__Group_0__13__Impl ;
    public final void rule__App__Group_0__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1037:1: ( rule__App__Group_0__13__Impl )
            // InternalArduinoML.g:1038:2: rule__App__Group_0__13__Impl
            {
            pushFollow(FOLLOW_2);
            rule__App__Group_0__13__Impl();

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
    // $ANTLR end "rule__App__Group_0__13"


    // $ANTLR start "rule__App__Group_0__13__Impl"
    // InternalArduinoML.g:1044:1: rule__App__Group_0__13__Impl : ( ( rule__App__StatesAssignment_0_13 )* ) ;
    public final void rule__App__Group_0__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1048:1: ( ( ( rule__App__StatesAssignment_0_13 )* ) )
            // InternalArduinoML.g:1049:1: ( ( rule__App__StatesAssignment_0_13 )* )
            {
            // InternalArduinoML.g:1049:1: ( ( rule__App__StatesAssignment_0_13 )* )
            // InternalArduinoML.g:1050:2: ( rule__App__StatesAssignment_0_13 )*
            {
             before(grammarAccess.getAppAccess().getStatesAssignment_0_13()); 
            // InternalArduinoML.g:1051:2: ( rule__App__StatesAssignment_0_13 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=RULE_STRING && LA14_0<=RULE_ID)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalArduinoML.g:1051:3: rule__App__StatesAssignment_0_13
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__App__StatesAssignment_0_13();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getAppAccess().getStatesAssignment_0_13()); 

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
    // $ANTLR end "rule__App__Group_0__13__Impl"


    // $ANTLR start "rule__App__Group_1__0"
    // InternalArduinoML.g:1060:1: rule__App__Group_1__0 : rule__App__Group_1__0__Impl rule__App__Group_1__1 ;
    public final void rule__App__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1064:1: ( rule__App__Group_1__0__Impl rule__App__Group_1__1 )
            // InternalArduinoML.g:1065:2: rule__App__Group_1__0__Impl rule__App__Group_1__1
            {
            pushFollow(FOLLOW_3);
            rule__App__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__App__Group_1__1();

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
    // $ANTLR end "rule__App__Group_1__0"


    // $ANTLR start "rule__App__Group_1__0__Impl"
    // InternalArduinoML.g:1072:1: rule__App__Group_1__0__Impl : ( 'app' ) ;
    public final void rule__App__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1076:1: ( ( 'app' ) )
            // InternalArduinoML.g:1077:1: ( 'app' )
            {
            // InternalArduinoML.g:1077:1: ( 'app' )
            // InternalArduinoML.g:1078:2: 'app'
            {
             before(grammarAccess.getAppAccess().getAppKeyword_1_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getAppAccess().getAppKeyword_1_0()); 

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
    // $ANTLR end "rule__App__Group_1__0__Impl"


    // $ANTLR start "rule__App__Group_1__1"
    // InternalArduinoML.g:1087:1: rule__App__Group_1__1 : rule__App__Group_1__1__Impl rule__App__Group_1__2 ;
    public final void rule__App__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1091:1: ( rule__App__Group_1__1__Impl rule__App__Group_1__2 )
            // InternalArduinoML.g:1092:2: rule__App__Group_1__1__Impl rule__App__Group_1__2
            {
            pushFollow(FOLLOW_4);
            rule__App__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__App__Group_1__2();

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
    // $ANTLR end "rule__App__Group_1__1"


    // $ANTLR start "rule__App__Group_1__1__Impl"
    // InternalArduinoML.g:1099:1: rule__App__Group_1__1__Impl : ( ( rule__App__NameAssignment_1_1 ) ) ;
    public final void rule__App__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1103:1: ( ( ( rule__App__NameAssignment_1_1 ) ) )
            // InternalArduinoML.g:1104:1: ( ( rule__App__NameAssignment_1_1 ) )
            {
            // InternalArduinoML.g:1104:1: ( ( rule__App__NameAssignment_1_1 ) )
            // InternalArduinoML.g:1105:2: ( rule__App__NameAssignment_1_1 )
            {
             before(grammarAccess.getAppAccess().getNameAssignment_1_1()); 
            // InternalArduinoML.g:1106:2: ( rule__App__NameAssignment_1_1 )
            // InternalArduinoML.g:1106:3: rule__App__NameAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__App__NameAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getAppAccess().getNameAssignment_1_1()); 

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
    // $ANTLR end "rule__App__Group_1__1__Impl"


    // $ANTLR start "rule__App__Group_1__2"
    // InternalArduinoML.g:1114:1: rule__App__Group_1__2 : rule__App__Group_1__2__Impl rule__App__Group_1__3 ;
    public final void rule__App__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1118:1: ( rule__App__Group_1__2__Impl rule__App__Group_1__3 )
            // InternalArduinoML.g:1119:2: rule__App__Group_1__2__Impl rule__App__Group_1__3
            {
            pushFollow(FOLLOW_12);
            rule__App__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__App__Group_1__3();

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
    // $ANTLR end "rule__App__Group_1__2"


    // $ANTLR start "rule__App__Group_1__2__Impl"
    // InternalArduinoML.g:1126:1: rule__App__Group_1__2__Impl : ( 'initial' ) ;
    public final void rule__App__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1130:1: ( ( 'initial' ) )
            // InternalArduinoML.g:1131:1: ( 'initial' )
            {
            // InternalArduinoML.g:1131:1: ( 'initial' )
            // InternalArduinoML.g:1132:2: 'initial'
            {
             before(grammarAccess.getAppAccess().getInitialKeyword_1_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getAppAccess().getInitialKeyword_1_2()); 

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
    // $ANTLR end "rule__App__Group_1__2__Impl"


    // $ANTLR start "rule__App__Group_1__3"
    // InternalArduinoML.g:1141:1: rule__App__Group_1__3 : rule__App__Group_1__3__Impl rule__App__Group_1__4 ;
    public final void rule__App__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1145:1: ( rule__App__Group_1__3__Impl rule__App__Group_1__4 )
            // InternalArduinoML.g:1146:2: rule__App__Group_1__3__Impl rule__App__Group_1__4
            {
            pushFollow(FOLLOW_3);
            rule__App__Group_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__App__Group_1__4();

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
    // $ANTLR end "rule__App__Group_1__3"


    // $ANTLR start "rule__App__Group_1__3__Impl"
    // InternalArduinoML.g:1153:1: rule__App__Group_1__3__Impl : ( 'mode' ) ;
    public final void rule__App__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1157:1: ( ( 'mode' ) )
            // InternalArduinoML.g:1158:1: ( 'mode' )
            {
            // InternalArduinoML.g:1158:1: ( 'mode' )
            // InternalArduinoML.g:1159:2: 'mode'
            {
             before(grammarAccess.getAppAccess().getModeKeyword_1_3()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getAppAccess().getModeKeyword_1_3()); 

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
    // $ANTLR end "rule__App__Group_1__3__Impl"


    // $ANTLR start "rule__App__Group_1__4"
    // InternalArduinoML.g:1168:1: rule__App__Group_1__4 : rule__App__Group_1__4__Impl rule__App__Group_1__5 ;
    public final void rule__App__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1172:1: ( rule__App__Group_1__4__Impl rule__App__Group_1__5 )
            // InternalArduinoML.g:1173:2: rule__App__Group_1__4__Impl rule__App__Group_1__5
            {
            pushFollow(FOLLOW_6);
            rule__App__Group_1__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__App__Group_1__5();

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
    // $ANTLR end "rule__App__Group_1__4"


    // $ANTLR start "rule__App__Group_1__4__Impl"
    // InternalArduinoML.g:1180:1: rule__App__Group_1__4__Impl : ( ( rule__App__Initial_modeAssignment_1_4 ) ) ;
    public final void rule__App__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1184:1: ( ( ( rule__App__Initial_modeAssignment_1_4 ) ) )
            // InternalArduinoML.g:1185:1: ( ( rule__App__Initial_modeAssignment_1_4 ) )
            {
            // InternalArduinoML.g:1185:1: ( ( rule__App__Initial_modeAssignment_1_4 ) )
            // InternalArduinoML.g:1186:2: ( rule__App__Initial_modeAssignment_1_4 )
            {
             before(grammarAccess.getAppAccess().getInitial_modeAssignment_1_4()); 
            // InternalArduinoML.g:1187:2: ( rule__App__Initial_modeAssignment_1_4 )
            // InternalArduinoML.g:1187:3: rule__App__Initial_modeAssignment_1_4
            {
            pushFollow(FOLLOW_2);
            rule__App__Initial_modeAssignment_1_4();

            state._fsp--;


            }

             after(grammarAccess.getAppAccess().getInitial_modeAssignment_1_4()); 

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
    // $ANTLR end "rule__App__Group_1__4__Impl"


    // $ANTLR start "rule__App__Group_1__5"
    // InternalArduinoML.g:1195:1: rule__App__Group_1__5 : rule__App__Group_1__5__Impl rule__App__Group_1__6 ;
    public final void rule__App__Group_1__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1199:1: ( rule__App__Group_1__5__Impl rule__App__Group_1__6 )
            // InternalArduinoML.g:1200:2: rule__App__Group_1__5__Impl rule__App__Group_1__6
            {
            pushFollow(FOLLOW_7);
            rule__App__Group_1__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__App__Group_1__6();

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
    // $ANTLR end "rule__App__Group_1__5"


    // $ANTLR start "rule__App__Group_1__5__Impl"
    // InternalArduinoML.g:1207:1: rule__App__Group_1__5__Impl : ( ':' ) ;
    public final void rule__App__Group_1__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1211:1: ( ( ':' ) )
            // InternalArduinoML.g:1212:1: ( ':' )
            {
            // InternalArduinoML.g:1212:1: ( ':' )
            // InternalArduinoML.g:1213:2: ':'
            {
             before(grammarAccess.getAppAccess().getColonKeyword_1_5()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getAppAccess().getColonKeyword_1_5()); 

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
    // $ANTLR end "rule__App__Group_1__5__Impl"


    // $ANTLR start "rule__App__Group_1__6"
    // InternalArduinoML.g:1222:1: rule__App__Group_1__6 : rule__App__Group_1__6__Impl rule__App__Group_1__7 ;
    public final void rule__App__Group_1__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1226:1: ( rule__App__Group_1__6__Impl rule__App__Group_1__7 )
            // InternalArduinoML.g:1227:2: rule__App__Group_1__6__Impl rule__App__Group_1__7
            {
            pushFollow(FOLLOW_6);
            rule__App__Group_1__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__App__Group_1__7();

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
    // $ANTLR end "rule__App__Group_1__6"


    // $ANTLR start "rule__App__Group_1__6__Impl"
    // InternalArduinoML.g:1234:1: rule__App__Group_1__6__Impl : ( 'bricks' ) ;
    public final void rule__App__Group_1__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1238:1: ( ( 'bricks' ) )
            // InternalArduinoML.g:1239:1: ( 'bricks' )
            {
            // InternalArduinoML.g:1239:1: ( 'bricks' )
            // InternalArduinoML.g:1240:2: 'bricks'
            {
             before(grammarAccess.getAppAccess().getBricksKeyword_1_6()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getAppAccess().getBricksKeyword_1_6()); 

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
    // $ANTLR end "rule__App__Group_1__6__Impl"


    // $ANTLR start "rule__App__Group_1__7"
    // InternalArduinoML.g:1249:1: rule__App__Group_1__7 : rule__App__Group_1__7__Impl rule__App__Group_1__8 ;
    public final void rule__App__Group_1__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1253:1: ( rule__App__Group_1__7__Impl rule__App__Group_1__8 )
            // InternalArduinoML.g:1254:2: rule__App__Group_1__7__Impl rule__App__Group_1__8
            {
            pushFollow(FOLLOW_8);
            rule__App__Group_1__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__App__Group_1__8();

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
    // $ANTLR end "rule__App__Group_1__7"


    // $ANTLR start "rule__App__Group_1__7__Impl"
    // InternalArduinoML.g:1261:1: rule__App__Group_1__7__Impl : ( ':' ) ;
    public final void rule__App__Group_1__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1265:1: ( ( ':' ) )
            // InternalArduinoML.g:1266:1: ( ':' )
            {
            // InternalArduinoML.g:1266:1: ( ':' )
            // InternalArduinoML.g:1267:2: ':'
            {
             before(grammarAccess.getAppAccess().getColonKeyword_1_7()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getAppAccess().getColonKeyword_1_7()); 

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
    // $ANTLR end "rule__App__Group_1__7__Impl"


    // $ANTLR start "rule__App__Group_1__8"
    // InternalArduinoML.g:1276:1: rule__App__Group_1__8 : rule__App__Group_1__8__Impl rule__App__Group_1__9 ;
    public final void rule__App__Group_1__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1280:1: ( rule__App__Group_1__8__Impl rule__App__Group_1__9 )
            // InternalArduinoML.g:1281:2: rule__App__Group_1__8__Impl rule__App__Group_1__9
            {
            pushFollow(FOLLOW_13);
            rule__App__Group_1__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__App__Group_1__9();

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
    // $ANTLR end "rule__App__Group_1__8"


    // $ANTLR start "rule__App__Group_1__8__Impl"
    // InternalArduinoML.g:1288:1: rule__App__Group_1__8__Impl : ( ( rule__App__BricksAssignment_1_8 ) ) ;
    public final void rule__App__Group_1__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1292:1: ( ( ( rule__App__BricksAssignment_1_8 ) ) )
            // InternalArduinoML.g:1293:1: ( ( rule__App__BricksAssignment_1_8 ) )
            {
            // InternalArduinoML.g:1293:1: ( ( rule__App__BricksAssignment_1_8 ) )
            // InternalArduinoML.g:1294:2: ( rule__App__BricksAssignment_1_8 )
            {
             before(grammarAccess.getAppAccess().getBricksAssignment_1_8()); 
            // InternalArduinoML.g:1295:2: ( rule__App__BricksAssignment_1_8 )
            // InternalArduinoML.g:1295:3: rule__App__BricksAssignment_1_8
            {
            pushFollow(FOLLOW_2);
            rule__App__BricksAssignment_1_8();

            state._fsp--;


            }

             after(grammarAccess.getAppAccess().getBricksAssignment_1_8()); 

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
    // $ANTLR end "rule__App__Group_1__8__Impl"


    // $ANTLR start "rule__App__Group_1__9"
    // InternalArduinoML.g:1303:1: rule__App__Group_1__9 : rule__App__Group_1__9__Impl rule__App__Group_1__10 ;
    public final void rule__App__Group_1__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1307:1: ( rule__App__Group_1__9__Impl rule__App__Group_1__10 )
            // InternalArduinoML.g:1308:2: rule__App__Group_1__9__Impl rule__App__Group_1__10
            {
            pushFollow(FOLLOW_13);
            rule__App__Group_1__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__App__Group_1__10();

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
    // $ANTLR end "rule__App__Group_1__9"


    // $ANTLR start "rule__App__Group_1__9__Impl"
    // InternalArduinoML.g:1315:1: rule__App__Group_1__9__Impl : ( ( rule__App__BricksAssignment_1_9 )* ) ;
    public final void rule__App__Group_1__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1319:1: ( ( ( rule__App__BricksAssignment_1_9 )* ) )
            // InternalArduinoML.g:1320:1: ( ( rule__App__BricksAssignment_1_9 )* )
            {
            // InternalArduinoML.g:1320:1: ( ( rule__App__BricksAssignment_1_9 )* )
            // InternalArduinoML.g:1321:2: ( rule__App__BricksAssignment_1_9 )*
            {
             before(grammarAccess.getAppAccess().getBricksAssignment_1_9()); 
            // InternalArduinoML.g:1322:2: ( rule__App__BricksAssignment_1_9 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=30 && LA15_0<=32)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalArduinoML.g:1322:3: rule__App__BricksAssignment_1_9
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__App__BricksAssignment_1_9();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getAppAccess().getBricksAssignment_1_9()); 

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
    // $ANTLR end "rule__App__Group_1__9__Impl"


    // $ANTLR start "rule__App__Group_1__10"
    // InternalArduinoML.g:1330:1: rule__App__Group_1__10 : rule__App__Group_1__10__Impl rule__App__Group_1__11 ;
    public final void rule__App__Group_1__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1334:1: ( rule__App__Group_1__10__Impl rule__App__Group_1__11 )
            // InternalArduinoML.g:1335:2: rule__App__Group_1__10__Impl rule__App__Group_1__11
            {
            pushFollow(FOLLOW_6);
            rule__App__Group_1__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__App__Group_1__11();

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
    // $ANTLR end "rule__App__Group_1__10"


    // $ANTLR start "rule__App__Group_1__10__Impl"
    // InternalArduinoML.g:1342:1: rule__App__Group_1__10__Impl : ( 'modes' ) ;
    public final void rule__App__Group_1__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1346:1: ( ( 'modes' ) )
            // InternalArduinoML.g:1347:1: ( 'modes' )
            {
            // InternalArduinoML.g:1347:1: ( 'modes' )
            // InternalArduinoML.g:1348:2: 'modes'
            {
             before(grammarAccess.getAppAccess().getModesKeyword_1_10()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getAppAccess().getModesKeyword_1_10()); 

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
    // $ANTLR end "rule__App__Group_1__10__Impl"


    // $ANTLR start "rule__App__Group_1__11"
    // InternalArduinoML.g:1357:1: rule__App__Group_1__11 : rule__App__Group_1__11__Impl rule__App__Group_1__12 ;
    public final void rule__App__Group_1__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1361:1: ( rule__App__Group_1__11__Impl rule__App__Group_1__12 )
            // InternalArduinoML.g:1362:2: rule__App__Group_1__11__Impl rule__App__Group_1__12
            {
            pushFollow(FOLLOW_3);
            rule__App__Group_1__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__App__Group_1__12();

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
    // $ANTLR end "rule__App__Group_1__11"


    // $ANTLR start "rule__App__Group_1__11__Impl"
    // InternalArduinoML.g:1369:1: rule__App__Group_1__11__Impl : ( ':' ) ;
    public final void rule__App__Group_1__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1373:1: ( ( ':' ) )
            // InternalArduinoML.g:1374:1: ( ':' )
            {
            // InternalArduinoML.g:1374:1: ( ':' )
            // InternalArduinoML.g:1375:2: ':'
            {
             before(grammarAccess.getAppAccess().getColonKeyword_1_11()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getAppAccess().getColonKeyword_1_11()); 

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
    // $ANTLR end "rule__App__Group_1__11__Impl"


    // $ANTLR start "rule__App__Group_1__12"
    // InternalArduinoML.g:1384:1: rule__App__Group_1__12 : rule__App__Group_1__12__Impl rule__App__Group_1__13 ;
    public final void rule__App__Group_1__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1388:1: ( rule__App__Group_1__12__Impl rule__App__Group_1__13 )
            // InternalArduinoML.g:1389:2: rule__App__Group_1__12__Impl rule__App__Group_1__13
            {
            pushFollow(FOLLOW_3);
            rule__App__Group_1__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__App__Group_1__13();

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
    // $ANTLR end "rule__App__Group_1__12"


    // $ANTLR start "rule__App__Group_1__12__Impl"
    // InternalArduinoML.g:1396:1: rule__App__Group_1__12__Impl : ( ( rule__App__ModesAssignment_1_12 ) ) ;
    public final void rule__App__Group_1__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1400:1: ( ( ( rule__App__ModesAssignment_1_12 ) ) )
            // InternalArduinoML.g:1401:1: ( ( rule__App__ModesAssignment_1_12 ) )
            {
            // InternalArduinoML.g:1401:1: ( ( rule__App__ModesAssignment_1_12 ) )
            // InternalArduinoML.g:1402:2: ( rule__App__ModesAssignment_1_12 )
            {
             before(grammarAccess.getAppAccess().getModesAssignment_1_12()); 
            // InternalArduinoML.g:1403:2: ( rule__App__ModesAssignment_1_12 )
            // InternalArduinoML.g:1403:3: rule__App__ModesAssignment_1_12
            {
            pushFollow(FOLLOW_2);
            rule__App__ModesAssignment_1_12();

            state._fsp--;


            }

             after(grammarAccess.getAppAccess().getModesAssignment_1_12()); 

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
    // $ANTLR end "rule__App__Group_1__12__Impl"


    // $ANTLR start "rule__App__Group_1__13"
    // InternalArduinoML.g:1411:1: rule__App__Group_1__13 : rule__App__Group_1__13__Impl ;
    public final void rule__App__Group_1__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1415:1: ( rule__App__Group_1__13__Impl )
            // InternalArduinoML.g:1416:2: rule__App__Group_1__13__Impl
            {
            pushFollow(FOLLOW_2);
            rule__App__Group_1__13__Impl();

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
    // $ANTLR end "rule__App__Group_1__13"


    // $ANTLR start "rule__App__Group_1__13__Impl"
    // InternalArduinoML.g:1422:1: rule__App__Group_1__13__Impl : ( ( rule__App__ModesAssignment_1_13 )* ) ;
    public final void rule__App__Group_1__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1426:1: ( ( ( rule__App__ModesAssignment_1_13 )* ) )
            // InternalArduinoML.g:1427:1: ( ( rule__App__ModesAssignment_1_13 )* )
            {
            // InternalArduinoML.g:1427:1: ( ( rule__App__ModesAssignment_1_13 )* )
            // InternalArduinoML.g:1428:2: ( rule__App__ModesAssignment_1_13 )*
            {
             before(grammarAccess.getAppAccess().getModesAssignment_1_13()); 
            // InternalArduinoML.g:1429:2: ( rule__App__ModesAssignment_1_13 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=RULE_STRING && LA16_0<=RULE_ID)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalArduinoML.g:1429:3: rule__App__ModesAssignment_1_13
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__App__ModesAssignment_1_13();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getAppAccess().getModesAssignment_1_13()); 

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
    // $ANTLR end "rule__App__Group_1__13__Impl"


    // $ANTLR start "rule__Brick__Group__0"
    // InternalArduinoML.g:1438:1: rule__Brick__Group__0 : rule__Brick__Group__0__Impl rule__Brick__Group__1 ;
    public final void rule__Brick__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1442:1: ( rule__Brick__Group__0__Impl rule__Brick__Group__1 )
            // InternalArduinoML.g:1443:2: rule__Brick__Group__0__Impl rule__Brick__Group__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalArduinoML.g:1450:1: rule__Brick__Group__0__Impl : ( ( rule__Brick__Alternatives_0 ) ) ;
    public final void rule__Brick__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1454:1: ( ( ( rule__Brick__Alternatives_0 ) ) )
            // InternalArduinoML.g:1455:1: ( ( rule__Brick__Alternatives_0 ) )
            {
            // InternalArduinoML.g:1455:1: ( ( rule__Brick__Alternatives_0 ) )
            // InternalArduinoML.g:1456:2: ( rule__Brick__Alternatives_0 )
            {
             before(grammarAccess.getBrickAccess().getAlternatives_0()); 
            // InternalArduinoML.g:1457:2: ( rule__Brick__Alternatives_0 )
            // InternalArduinoML.g:1457:3: rule__Brick__Alternatives_0
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
    // InternalArduinoML.g:1465:1: rule__Brick__Group__1 : rule__Brick__Group__1__Impl rule__Brick__Group__2 ;
    public final void rule__Brick__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1469:1: ( rule__Brick__Group__1__Impl rule__Brick__Group__2 )
            // InternalArduinoML.g:1470:2: rule__Brick__Group__1__Impl rule__Brick__Group__2
            {
            pushFollow(FOLLOW_6);
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
    // InternalArduinoML.g:1477:1: rule__Brick__Group__1__Impl : ( ( rule__Brick__NameAssignment_1 ) ) ;
    public final void rule__Brick__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1481:1: ( ( ( rule__Brick__NameAssignment_1 ) ) )
            // InternalArduinoML.g:1482:1: ( ( rule__Brick__NameAssignment_1 ) )
            {
            // InternalArduinoML.g:1482:1: ( ( rule__Brick__NameAssignment_1 ) )
            // InternalArduinoML.g:1483:2: ( rule__Brick__NameAssignment_1 )
            {
             before(grammarAccess.getBrickAccess().getNameAssignment_1()); 
            // InternalArduinoML.g:1484:2: ( rule__Brick__NameAssignment_1 )
            // InternalArduinoML.g:1484:3: rule__Brick__NameAssignment_1
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
    // InternalArduinoML.g:1492:1: rule__Brick__Group__2 : rule__Brick__Group__2__Impl rule__Brick__Group__3 ;
    public final void rule__Brick__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1496:1: ( rule__Brick__Group__2__Impl rule__Brick__Group__3 )
            // InternalArduinoML.g:1497:2: rule__Brick__Group__2__Impl rule__Brick__Group__3
            {
            pushFollow(FOLLOW_14);
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
    // InternalArduinoML.g:1504:1: rule__Brick__Group__2__Impl : ( ':' ) ;
    public final void rule__Brick__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1508:1: ( ( ':' ) )
            // InternalArduinoML.g:1509:1: ( ':' )
            {
            // InternalArduinoML.g:1509:1: ( ':' )
            // InternalArduinoML.g:1510:2: ':'
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
    // InternalArduinoML.g:1519:1: rule__Brick__Group__3 : rule__Brick__Group__3__Impl ;
    public final void rule__Brick__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1523:1: ( rule__Brick__Group__3__Impl )
            // InternalArduinoML.g:1524:2: rule__Brick__Group__3__Impl
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
    // InternalArduinoML.g:1530:1: rule__Brick__Group__3__Impl : ( ( rule__Brick__PinAssignment_3 ) ) ;
    public final void rule__Brick__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1534:1: ( ( ( rule__Brick__PinAssignment_3 ) ) )
            // InternalArduinoML.g:1535:1: ( ( rule__Brick__PinAssignment_3 ) )
            {
            // InternalArduinoML.g:1535:1: ( ( rule__Brick__PinAssignment_3 ) )
            // InternalArduinoML.g:1536:2: ( rule__Brick__PinAssignment_3 )
            {
             before(grammarAccess.getBrickAccess().getPinAssignment_3()); 
            // InternalArduinoML.g:1537:2: ( rule__Brick__PinAssignment_3 )
            // InternalArduinoML.g:1537:3: rule__Brick__PinAssignment_3
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
    // InternalArduinoML.g:1546:1: rule__Mode__Group__0 : rule__Mode__Group__0__Impl rule__Mode__Group__1 ;
    public final void rule__Mode__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1550:1: ( rule__Mode__Group__0__Impl rule__Mode__Group__1 )
            // InternalArduinoML.g:1551:2: rule__Mode__Group__0__Impl rule__Mode__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalArduinoML.g:1558:1: rule__Mode__Group__0__Impl : ( ( rule__Mode__NameAssignment_0 ) ) ;
    public final void rule__Mode__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1562:1: ( ( ( rule__Mode__NameAssignment_0 ) ) )
            // InternalArduinoML.g:1563:1: ( ( rule__Mode__NameAssignment_0 ) )
            {
            // InternalArduinoML.g:1563:1: ( ( rule__Mode__NameAssignment_0 ) )
            // InternalArduinoML.g:1564:2: ( rule__Mode__NameAssignment_0 )
            {
             before(grammarAccess.getModeAccess().getNameAssignment_0()); 
            // InternalArduinoML.g:1565:2: ( rule__Mode__NameAssignment_0 )
            // InternalArduinoML.g:1565:3: rule__Mode__NameAssignment_0
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
    // InternalArduinoML.g:1573:1: rule__Mode__Group__1 : rule__Mode__Group__1__Impl rule__Mode__Group__2 ;
    public final void rule__Mode__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1577:1: ( rule__Mode__Group__1__Impl rule__Mode__Group__2 )
            // InternalArduinoML.g:1578:2: rule__Mode__Group__1__Impl rule__Mode__Group__2
            {
            pushFollow(FOLLOW_5);
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
    // InternalArduinoML.g:1585:1: rule__Mode__Group__1__Impl : ( 'initial' ) ;
    public final void rule__Mode__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1589:1: ( ( 'initial' ) )
            // InternalArduinoML.g:1590:1: ( 'initial' )
            {
            // InternalArduinoML.g:1590:1: ( 'initial' )
            // InternalArduinoML.g:1591:2: 'initial'
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
    // InternalArduinoML.g:1600:1: rule__Mode__Group__2 : rule__Mode__Group__2__Impl rule__Mode__Group__3 ;
    public final void rule__Mode__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1604:1: ( rule__Mode__Group__2__Impl rule__Mode__Group__3 )
            // InternalArduinoML.g:1605:2: rule__Mode__Group__2__Impl rule__Mode__Group__3
            {
            pushFollow(FOLLOW_3);
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
    // InternalArduinoML.g:1612:1: rule__Mode__Group__2__Impl : ( 'state' ) ;
    public final void rule__Mode__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1616:1: ( ( 'state' ) )
            // InternalArduinoML.g:1617:1: ( 'state' )
            {
            // InternalArduinoML.g:1617:1: ( 'state' )
            // InternalArduinoML.g:1618:2: 'state'
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
    // InternalArduinoML.g:1627:1: rule__Mode__Group__3 : rule__Mode__Group__3__Impl rule__Mode__Group__4 ;
    public final void rule__Mode__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1631:1: ( rule__Mode__Group__3__Impl rule__Mode__Group__4 )
            // InternalArduinoML.g:1632:2: rule__Mode__Group__3__Impl rule__Mode__Group__4
            {
            pushFollow(FOLLOW_6);
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
    // InternalArduinoML.g:1639:1: rule__Mode__Group__3__Impl : ( ( rule__Mode__InitialAssignment_3 ) ) ;
    public final void rule__Mode__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1643:1: ( ( ( rule__Mode__InitialAssignment_3 ) ) )
            // InternalArduinoML.g:1644:1: ( ( rule__Mode__InitialAssignment_3 ) )
            {
            // InternalArduinoML.g:1644:1: ( ( rule__Mode__InitialAssignment_3 ) )
            // InternalArduinoML.g:1645:2: ( rule__Mode__InitialAssignment_3 )
            {
             before(grammarAccess.getModeAccess().getInitialAssignment_3()); 
            // InternalArduinoML.g:1646:2: ( rule__Mode__InitialAssignment_3 )
            // InternalArduinoML.g:1646:3: rule__Mode__InitialAssignment_3
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
    // InternalArduinoML.g:1654:1: rule__Mode__Group__4 : rule__Mode__Group__4__Impl rule__Mode__Group__5 ;
    public final void rule__Mode__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1658:1: ( rule__Mode__Group__4__Impl rule__Mode__Group__5 )
            // InternalArduinoML.g:1659:2: rule__Mode__Group__4__Impl rule__Mode__Group__5
            {
            pushFollow(FOLLOW_15);
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
    // InternalArduinoML.g:1666:1: rule__Mode__Group__4__Impl : ( ':' ) ;
    public final void rule__Mode__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1670:1: ( ( ':' ) )
            // InternalArduinoML.g:1671:1: ( ':' )
            {
            // InternalArduinoML.g:1671:1: ( ':' )
            // InternalArduinoML.g:1672:2: ':'
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
    // InternalArduinoML.g:1681:1: rule__Mode__Group__5 : rule__Mode__Group__5__Impl rule__Mode__Group__6 ;
    public final void rule__Mode__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1685:1: ( rule__Mode__Group__5__Impl rule__Mode__Group__6 )
            // InternalArduinoML.g:1686:2: rule__Mode__Group__5__Impl rule__Mode__Group__6
            {
            pushFollow(FOLLOW_15);
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
    // InternalArduinoML.g:1693:1: rule__Mode__Group__5__Impl : ( ( rule__Mode__Group_5__0 )? ) ;
    public final void rule__Mode__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1697:1: ( ( ( rule__Mode__Group_5__0 )? ) )
            // InternalArduinoML.g:1698:1: ( ( rule__Mode__Group_5__0 )? )
            {
            // InternalArduinoML.g:1698:1: ( ( rule__Mode__Group_5__0 )? )
            // InternalArduinoML.g:1699:2: ( rule__Mode__Group_5__0 )?
            {
             before(grammarAccess.getModeAccess().getGroup_5()); 
            // InternalArduinoML.g:1700:2: ( rule__Mode__Group_5__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==25) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalArduinoML.g:1700:3: rule__Mode__Group_5__0
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
    // InternalArduinoML.g:1708:1: rule__Mode__Group__6 : rule__Mode__Group__6__Impl rule__Mode__Group__7 ;
    public final void rule__Mode__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1712:1: ( rule__Mode__Group__6__Impl rule__Mode__Group__7 )
            // InternalArduinoML.g:1713:2: rule__Mode__Group__6__Impl rule__Mode__Group__7
            {
            pushFollow(FOLLOW_6);
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
    // InternalArduinoML.g:1720:1: rule__Mode__Group__6__Impl : ( 'states' ) ;
    public final void rule__Mode__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1724:1: ( ( 'states' ) )
            // InternalArduinoML.g:1725:1: ( 'states' )
            {
            // InternalArduinoML.g:1725:1: ( 'states' )
            // InternalArduinoML.g:1726:2: 'states'
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
    // InternalArduinoML.g:1735:1: rule__Mode__Group__7 : rule__Mode__Group__7__Impl rule__Mode__Group__8 ;
    public final void rule__Mode__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1739:1: ( rule__Mode__Group__7__Impl rule__Mode__Group__8 )
            // InternalArduinoML.g:1740:2: rule__Mode__Group__7__Impl rule__Mode__Group__8
            {
            pushFollow(FOLLOW_3);
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
    // InternalArduinoML.g:1747:1: rule__Mode__Group__7__Impl : ( ':' ) ;
    public final void rule__Mode__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1751:1: ( ( ':' ) )
            // InternalArduinoML.g:1752:1: ( ':' )
            {
            // InternalArduinoML.g:1752:1: ( ':' )
            // InternalArduinoML.g:1753:2: ':'
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
    // InternalArduinoML.g:1762:1: rule__Mode__Group__8 : rule__Mode__Group__8__Impl rule__Mode__Group__9 ;
    public final void rule__Mode__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1766:1: ( rule__Mode__Group__8__Impl rule__Mode__Group__9 )
            // InternalArduinoML.g:1767:2: rule__Mode__Group__8__Impl rule__Mode__Group__9
            {
            pushFollow(FOLLOW_16);
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
    // InternalArduinoML.g:1774:1: rule__Mode__Group__8__Impl : ( ( rule__Mode__StatesAssignment_8 ) ) ;
    public final void rule__Mode__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1778:1: ( ( ( rule__Mode__StatesAssignment_8 ) ) )
            // InternalArduinoML.g:1779:1: ( ( rule__Mode__StatesAssignment_8 ) )
            {
            // InternalArduinoML.g:1779:1: ( ( rule__Mode__StatesAssignment_8 ) )
            // InternalArduinoML.g:1780:2: ( rule__Mode__StatesAssignment_8 )
            {
             before(grammarAccess.getModeAccess().getStatesAssignment_8()); 
            // InternalArduinoML.g:1781:2: ( rule__Mode__StatesAssignment_8 )
            // InternalArduinoML.g:1781:3: rule__Mode__StatesAssignment_8
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
    // InternalArduinoML.g:1789:1: rule__Mode__Group__9 : rule__Mode__Group__9__Impl rule__Mode__Group__10 ;
    public final void rule__Mode__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1793:1: ( rule__Mode__Group__9__Impl rule__Mode__Group__10 )
            // InternalArduinoML.g:1794:2: rule__Mode__Group__9__Impl rule__Mode__Group__10
            {
            pushFollow(FOLLOW_16);
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
    // InternalArduinoML.g:1801:1: rule__Mode__Group__9__Impl : ( ( rule__Mode__StatesAssignment_9 )* ) ;
    public final void rule__Mode__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1805:1: ( ( ( rule__Mode__StatesAssignment_9 )* ) )
            // InternalArduinoML.g:1806:1: ( ( rule__Mode__StatesAssignment_9 )* )
            {
            // InternalArduinoML.g:1806:1: ( ( rule__Mode__StatesAssignment_9 )* )
            // InternalArduinoML.g:1807:2: ( rule__Mode__StatesAssignment_9 )*
            {
             before(grammarAccess.getModeAccess().getStatesAssignment_9()); 
            // InternalArduinoML.g:1808:2: ( rule__Mode__StatesAssignment_9 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=RULE_STRING && LA18_0<=RULE_ID)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalArduinoML.g:1808:3: rule__Mode__StatesAssignment_9
            	    {
            	    pushFollow(FOLLOW_11);
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
    // InternalArduinoML.g:1816:1: rule__Mode__Group__10 : rule__Mode__Group__10__Impl rule__Mode__Group__11 ;
    public final void rule__Mode__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1820:1: ( rule__Mode__Group__10__Impl rule__Mode__Group__11 )
            // InternalArduinoML.g:1821:2: rule__Mode__Group__10__Impl rule__Mode__Group__11
            {
            pushFollow(FOLLOW_6);
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
    // InternalArduinoML.g:1828:1: rule__Mode__Group__10__Impl : ( 'transitions' ) ;
    public final void rule__Mode__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1832:1: ( ( 'transitions' ) )
            // InternalArduinoML.g:1833:1: ( 'transitions' )
            {
            // InternalArduinoML.g:1833:1: ( 'transitions' )
            // InternalArduinoML.g:1834:2: 'transitions'
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
    // InternalArduinoML.g:1843:1: rule__Mode__Group__11 : rule__Mode__Group__11__Impl rule__Mode__Group__12 ;
    public final void rule__Mode__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1847:1: ( rule__Mode__Group__11__Impl rule__Mode__Group__12 )
            // InternalArduinoML.g:1848:2: rule__Mode__Group__11__Impl rule__Mode__Group__12
            {
            pushFollow(FOLLOW_17);
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
    // InternalArduinoML.g:1855:1: rule__Mode__Group__11__Impl : ( ':' ) ;
    public final void rule__Mode__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1859:1: ( ( ':' ) )
            // InternalArduinoML.g:1860:1: ( ':' )
            {
            // InternalArduinoML.g:1860:1: ( ':' )
            // InternalArduinoML.g:1861:2: ':'
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
    // InternalArduinoML.g:1870:1: rule__Mode__Group__12 : rule__Mode__Group__12__Impl rule__Mode__Group__13 ;
    public final void rule__Mode__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1874:1: ( rule__Mode__Group__12__Impl rule__Mode__Group__13 )
            // InternalArduinoML.g:1875:2: rule__Mode__Group__12__Impl rule__Mode__Group__13
            {
            pushFollow(FOLLOW_17);
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
    // InternalArduinoML.g:1882:1: rule__Mode__Group__12__Impl : ( ( rule__Mode__Transitions_modeAssignment_12 ) ) ;
    public final void rule__Mode__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1886:1: ( ( ( rule__Mode__Transitions_modeAssignment_12 ) ) )
            // InternalArduinoML.g:1887:1: ( ( rule__Mode__Transitions_modeAssignment_12 ) )
            {
            // InternalArduinoML.g:1887:1: ( ( rule__Mode__Transitions_modeAssignment_12 ) )
            // InternalArduinoML.g:1888:2: ( rule__Mode__Transitions_modeAssignment_12 )
            {
             before(grammarAccess.getModeAccess().getTransitions_modeAssignment_12()); 
            // InternalArduinoML.g:1889:2: ( rule__Mode__Transitions_modeAssignment_12 )
            // InternalArduinoML.g:1889:3: rule__Mode__Transitions_modeAssignment_12
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
    // InternalArduinoML.g:1897:1: rule__Mode__Group__13 : rule__Mode__Group__13__Impl ;
    public final void rule__Mode__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1901:1: ( rule__Mode__Group__13__Impl )
            // InternalArduinoML.g:1902:2: rule__Mode__Group__13__Impl
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
    // InternalArduinoML.g:1908:1: rule__Mode__Group__13__Impl : ( ( rule__Mode__Transitions_modeAssignment_13 )* ) ;
    public final void rule__Mode__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1912:1: ( ( ( rule__Mode__Transitions_modeAssignment_13 )* ) )
            // InternalArduinoML.g:1913:1: ( ( rule__Mode__Transitions_modeAssignment_13 )* )
            {
            // InternalArduinoML.g:1913:1: ( ( rule__Mode__Transitions_modeAssignment_13 )* )
            // InternalArduinoML.g:1914:2: ( rule__Mode__Transitions_modeAssignment_13 )*
            {
             before(grammarAccess.getModeAccess().getTransitions_modeAssignment_13()); 
            // InternalArduinoML.g:1915:2: ( rule__Mode__Transitions_modeAssignment_13 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==36||LA19_0==39) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalArduinoML.g:1915:3: rule__Mode__Transitions_modeAssignment_13
            	    {
            	    pushFollow(FOLLOW_18);
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
    // InternalArduinoML.g:1924:1: rule__Mode__Group_5__0 : rule__Mode__Group_5__0__Impl rule__Mode__Group_5__1 ;
    public final void rule__Mode__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1928:1: ( rule__Mode__Group_5__0__Impl rule__Mode__Group_5__1 )
            // InternalArduinoML.g:1929:2: rule__Mode__Group_5__0__Impl rule__Mode__Group_5__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalArduinoML.g:1936:1: rule__Mode__Group_5__0__Impl : ( 'bricks' ) ;
    public final void rule__Mode__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1940:1: ( ( 'bricks' ) )
            // InternalArduinoML.g:1941:1: ( 'bricks' )
            {
            // InternalArduinoML.g:1941:1: ( 'bricks' )
            // InternalArduinoML.g:1942:2: 'bricks'
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
    // InternalArduinoML.g:1951:1: rule__Mode__Group_5__1 : rule__Mode__Group_5__1__Impl rule__Mode__Group_5__2 ;
    public final void rule__Mode__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1955:1: ( rule__Mode__Group_5__1__Impl rule__Mode__Group_5__2 )
            // InternalArduinoML.g:1956:2: rule__Mode__Group_5__1__Impl rule__Mode__Group_5__2
            {
            pushFollow(FOLLOW_8);
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
    // InternalArduinoML.g:1963:1: rule__Mode__Group_5__1__Impl : ( ':' ) ;
    public final void rule__Mode__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1967:1: ( ( ':' ) )
            // InternalArduinoML.g:1968:1: ( ':' )
            {
            // InternalArduinoML.g:1968:1: ( ':' )
            // InternalArduinoML.g:1969:2: ':'
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
    // InternalArduinoML.g:1978:1: rule__Mode__Group_5__2 : rule__Mode__Group_5__2__Impl rule__Mode__Group_5__3 ;
    public final void rule__Mode__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1982:1: ( rule__Mode__Group_5__2__Impl rule__Mode__Group_5__3 )
            // InternalArduinoML.g:1983:2: rule__Mode__Group_5__2__Impl rule__Mode__Group_5__3
            {
            pushFollow(FOLLOW_8);
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
    // InternalArduinoML.g:1990:1: rule__Mode__Group_5__2__Impl : ( ( rule__Mode__BricksAssignment_5_2 ) ) ;
    public final void rule__Mode__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1994:1: ( ( ( rule__Mode__BricksAssignment_5_2 ) ) )
            // InternalArduinoML.g:1995:1: ( ( rule__Mode__BricksAssignment_5_2 ) )
            {
            // InternalArduinoML.g:1995:1: ( ( rule__Mode__BricksAssignment_5_2 ) )
            // InternalArduinoML.g:1996:2: ( rule__Mode__BricksAssignment_5_2 )
            {
             before(grammarAccess.getModeAccess().getBricksAssignment_5_2()); 
            // InternalArduinoML.g:1997:2: ( rule__Mode__BricksAssignment_5_2 )
            // InternalArduinoML.g:1997:3: rule__Mode__BricksAssignment_5_2
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
    // InternalArduinoML.g:2005:1: rule__Mode__Group_5__3 : rule__Mode__Group_5__3__Impl ;
    public final void rule__Mode__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2009:1: ( rule__Mode__Group_5__3__Impl )
            // InternalArduinoML.g:2010:2: rule__Mode__Group_5__3__Impl
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
    // InternalArduinoML.g:2016:1: rule__Mode__Group_5__3__Impl : ( ( rule__Mode__BricksAssignment_5_3 )* ) ;
    public final void rule__Mode__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2020:1: ( ( ( rule__Mode__BricksAssignment_5_3 )* ) )
            // InternalArduinoML.g:2021:1: ( ( rule__Mode__BricksAssignment_5_3 )* )
            {
            // InternalArduinoML.g:2021:1: ( ( rule__Mode__BricksAssignment_5_3 )* )
            // InternalArduinoML.g:2022:2: ( rule__Mode__BricksAssignment_5_3 )*
            {
             before(grammarAccess.getModeAccess().getBricksAssignment_5_3()); 
            // InternalArduinoML.g:2023:2: ( rule__Mode__BricksAssignment_5_3 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=30 && LA20_0<=32)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalArduinoML.g:2023:3: rule__Mode__BricksAssignment_5_3
            	    {
            	    pushFollow(FOLLOW_10);
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
    // InternalArduinoML.g:2032:1: rule__State__Group__0 : rule__State__Group__0__Impl rule__State__Group__1 ;
    public final void rule__State__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2036:1: ( rule__State__Group__0__Impl rule__State__Group__1 )
            // InternalArduinoML.g:2037:2: rule__State__Group__0__Impl rule__State__Group__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalArduinoML.g:2044:1: rule__State__Group__0__Impl : ( ( rule__State__NameAssignment_0 ) ) ;
    public final void rule__State__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2048:1: ( ( ( rule__State__NameAssignment_0 ) ) )
            // InternalArduinoML.g:2049:1: ( ( rule__State__NameAssignment_0 ) )
            {
            // InternalArduinoML.g:2049:1: ( ( rule__State__NameAssignment_0 ) )
            // InternalArduinoML.g:2050:2: ( rule__State__NameAssignment_0 )
            {
             before(grammarAccess.getStateAccess().getNameAssignment_0()); 
            // InternalArduinoML.g:2051:2: ( rule__State__NameAssignment_0 )
            // InternalArduinoML.g:2051:3: rule__State__NameAssignment_0
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
    // InternalArduinoML.g:2059:1: rule__State__Group__1 : rule__State__Group__1__Impl rule__State__Group__2 ;
    public final void rule__State__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2063:1: ( rule__State__Group__1__Impl rule__State__Group__2 )
            // InternalArduinoML.g:2064:2: rule__State__Group__1__Impl rule__State__Group__2
            {
            pushFollow(FOLLOW_19);
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
    // InternalArduinoML.g:2071:1: rule__State__Group__1__Impl : ( ':' ) ;
    public final void rule__State__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2075:1: ( ( ':' ) )
            // InternalArduinoML.g:2076:1: ( ':' )
            {
            // InternalArduinoML.g:2076:1: ( ':' )
            // InternalArduinoML.g:2077:2: ':'
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
    // InternalArduinoML.g:2086:1: rule__State__Group__2 : rule__State__Group__2__Impl rule__State__Group__3 ;
    public final void rule__State__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2090:1: ( rule__State__Group__2__Impl rule__State__Group__3 )
            // InternalArduinoML.g:2091:2: rule__State__Group__2__Impl rule__State__Group__3
            {
            pushFollow(FOLLOW_20);
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
    // InternalArduinoML.g:2098:1: rule__State__Group__2__Impl : ( ( rule__State__ActionsAssignment_2 ) ) ;
    public final void rule__State__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2102:1: ( ( ( rule__State__ActionsAssignment_2 ) ) )
            // InternalArduinoML.g:2103:1: ( ( rule__State__ActionsAssignment_2 ) )
            {
            // InternalArduinoML.g:2103:1: ( ( rule__State__ActionsAssignment_2 ) )
            // InternalArduinoML.g:2104:2: ( rule__State__ActionsAssignment_2 )
            {
             before(grammarAccess.getStateAccess().getActionsAssignment_2()); 
            // InternalArduinoML.g:2105:2: ( rule__State__ActionsAssignment_2 )
            // InternalArduinoML.g:2105:3: rule__State__ActionsAssignment_2
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
    // InternalArduinoML.g:2113:1: rule__State__Group__3 : rule__State__Group__3__Impl rule__State__Group__4 ;
    public final void rule__State__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2117:1: ( rule__State__Group__3__Impl rule__State__Group__4 )
            // InternalArduinoML.g:2118:2: rule__State__Group__3__Impl rule__State__Group__4
            {
            pushFollow(FOLLOW_20);
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
    // InternalArduinoML.g:2125:1: rule__State__Group__3__Impl : ( ( rule__State__ActionsAssignment_3 )* ) ;
    public final void rule__State__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2129:1: ( ( ( rule__State__ActionsAssignment_3 )* ) )
            // InternalArduinoML.g:2130:1: ( ( rule__State__ActionsAssignment_3 )* )
            {
            // InternalArduinoML.g:2130:1: ( ( rule__State__ActionsAssignment_3 )* )
            // InternalArduinoML.g:2131:2: ( rule__State__ActionsAssignment_3 )*
            {
             before(grammarAccess.getStateAccess().getActionsAssignment_3()); 
            // InternalArduinoML.g:2132:2: ( rule__State__ActionsAssignment_3 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==33) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalArduinoML.g:2132:3: rule__State__ActionsAssignment_3
            	    {
            	    pushFollow(FOLLOW_21);
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
    // InternalArduinoML.g:2140:1: rule__State__Group__4 : rule__State__Group__4__Impl rule__State__Group__5 ;
    public final void rule__State__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2144:1: ( rule__State__Group__4__Impl rule__State__Group__5 )
            // InternalArduinoML.g:2145:2: rule__State__Group__4__Impl rule__State__Group__5
            {
            pushFollow(FOLLOW_20);
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
    // InternalArduinoML.g:2152:1: rule__State__Group__4__Impl : ( ( rule__State__Transitions_stateAssignment_4 ) ) ;
    public final void rule__State__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2156:1: ( ( ( rule__State__Transitions_stateAssignment_4 ) ) )
            // InternalArduinoML.g:2157:1: ( ( rule__State__Transitions_stateAssignment_4 ) )
            {
            // InternalArduinoML.g:2157:1: ( ( rule__State__Transitions_stateAssignment_4 ) )
            // InternalArduinoML.g:2158:2: ( rule__State__Transitions_stateAssignment_4 )
            {
             before(grammarAccess.getStateAccess().getTransitions_stateAssignment_4()); 
            // InternalArduinoML.g:2159:2: ( rule__State__Transitions_stateAssignment_4 )
            // InternalArduinoML.g:2159:3: rule__State__Transitions_stateAssignment_4
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
    // InternalArduinoML.g:2167:1: rule__State__Group__5 : rule__State__Group__5__Impl ;
    public final void rule__State__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2171:1: ( rule__State__Group__5__Impl )
            // InternalArduinoML.g:2172:2: rule__State__Group__5__Impl
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
    // InternalArduinoML.g:2178:1: rule__State__Group__5__Impl : ( ( rule__State__Transitions_stateAssignment_5 )* ) ;
    public final void rule__State__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2182:1: ( ( ( rule__State__Transitions_stateAssignment_5 )* ) )
            // InternalArduinoML.g:2183:1: ( ( rule__State__Transitions_stateAssignment_5 )* )
            {
            // InternalArduinoML.g:2183:1: ( ( rule__State__Transitions_stateAssignment_5 )* )
            // InternalArduinoML.g:2184:2: ( rule__State__Transitions_stateAssignment_5 )*
            {
             before(grammarAccess.getStateAccess().getTransitions_stateAssignment_5()); 
            // InternalArduinoML.g:2185:2: ( rule__State__Transitions_stateAssignment_5 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==36||LA22_0==39) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalArduinoML.g:2185:3: rule__State__Transitions_stateAssignment_5
            	    {
            	    pushFollow(FOLLOW_22);
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
    // InternalArduinoML.g:2194:1: rule__Actuator__Group__0 : rule__Actuator__Group__0__Impl rule__Actuator__Group__1 ;
    public final void rule__Actuator__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2198:1: ( rule__Actuator__Group__0__Impl rule__Actuator__Group__1 )
            // InternalArduinoML.g:2199:2: rule__Actuator__Group__0__Impl rule__Actuator__Group__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalArduinoML.g:2206:1: rule__Actuator__Group__0__Impl : ( () ) ;
    public final void rule__Actuator__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2210:1: ( ( () ) )
            // InternalArduinoML.g:2211:1: ( () )
            {
            // InternalArduinoML.g:2211:1: ( () )
            // InternalArduinoML.g:2212:2: ()
            {
             before(grammarAccess.getActuatorAccess().getActuatorAction_0()); 
            // InternalArduinoML.g:2213:2: ()
            // InternalArduinoML.g:2213:3: 
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
    // InternalArduinoML.g:2221:1: rule__Actuator__Group__1 : rule__Actuator__Group__1__Impl ;
    public final void rule__Actuator__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2225:1: ( rule__Actuator__Group__1__Impl )
            // InternalArduinoML.g:2226:2: rule__Actuator__Group__1__Impl
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
    // InternalArduinoML.g:2232:1: rule__Actuator__Group__1__Impl : ( 'Actuator' ) ;
    public final void rule__Actuator__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2236:1: ( ( 'Actuator' ) )
            // InternalArduinoML.g:2237:1: ( 'Actuator' )
            {
            // InternalArduinoML.g:2237:1: ( 'Actuator' )
            // InternalArduinoML.g:2238:2: 'Actuator'
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
    // InternalArduinoML.g:2248:1: rule__Digital__Group__0 : rule__Digital__Group__0__Impl rule__Digital__Group__1 ;
    public final void rule__Digital__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2252:1: ( rule__Digital__Group__0__Impl rule__Digital__Group__1 )
            // InternalArduinoML.g:2253:2: rule__Digital__Group__0__Impl rule__Digital__Group__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalArduinoML.g:2260:1: rule__Digital__Group__0__Impl : ( () ) ;
    public final void rule__Digital__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2264:1: ( ( () ) )
            // InternalArduinoML.g:2265:1: ( () )
            {
            // InternalArduinoML.g:2265:1: ( () )
            // InternalArduinoML.g:2266:2: ()
            {
             before(grammarAccess.getDigitalAccess().getDigitalAction_0()); 
            // InternalArduinoML.g:2267:2: ()
            // InternalArduinoML.g:2267:3: 
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
    // InternalArduinoML.g:2275:1: rule__Digital__Group__1 : rule__Digital__Group__1__Impl ;
    public final void rule__Digital__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2279:1: ( rule__Digital__Group__1__Impl )
            // InternalArduinoML.g:2280:2: rule__Digital__Group__1__Impl
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
    // InternalArduinoML.g:2286:1: rule__Digital__Group__1__Impl : ( 'Digital' ) ;
    public final void rule__Digital__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2290:1: ( ( 'Digital' ) )
            // InternalArduinoML.g:2291:1: ( 'Digital' )
            {
            // InternalArduinoML.g:2291:1: ( 'Digital' )
            // InternalArduinoML.g:2292:2: 'Digital'
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
    // InternalArduinoML.g:2302:1: rule__Analog__Group__0 : rule__Analog__Group__0__Impl rule__Analog__Group__1 ;
    public final void rule__Analog__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2306:1: ( rule__Analog__Group__0__Impl rule__Analog__Group__1 )
            // InternalArduinoML.g:2307:2: rule__Analog__Group__0__Impl rule__Analog__Group__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalArduinoML.g:2314:1: rule__Analog__Group__0__Impl : ( () ) ;
    public final void rule__Analog__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2318:1: ( ( () ) )
            // InternalArduinoML.g:2319:1: ( () )
            {
            // InternalArduinoML.g:2319:1: ( () )
            // InternalArduinoML.g:2320:2: ()
            {
             before(grammarAccess.getAnalogAccess().getAnalogAction_0()); 
            // InternalArduinoML.g:2321:2: ()
            // InternalArduinoML.g:2321:3: 
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
    // InternalArduinoML.g:2329:1: rule__Analog__Group__1 : rule__Analog__Group__1__Impl ;
    public final void rule__Analog__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2333:1: ( rule__Analog__Group__1__Impl )
            // InternalArduinoML.g:2334:2: rule__Analog__Group__1__Impl
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
    // InternalArduinoML.g:2340:1: rule__Analog__Group__1__Impl : ( 'Analog' ) ;
    public final void rule__Analog__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2344:1: ( ( 'Analog' ) )
            // InternalArduinoML.g:2345:1: ( 'Analog' )
            {
            // InternalArduinoML.g:2345:1: ( 'Analog' )
            // InternalArduinoML.g:2346:2: 'Analog'
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
    // InternalArduinoML.g:2356:1: rule__Action__Group__0 : rule__Action__Group__0__Impl rule__Action__Group__1 ;
    public final void rule__Action__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2360:1: ( rule__Action__Group__0__Impl rule__Action__Group__1 )
            // InternalArduinoML.g:2361:2: rule__Action__Group__0__Impl rule__Action__Group__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalArduinoML.g:2368:1: rule__Action__Group__0__Impl : ( 'change' ) ;
    public final void rule__Action__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2372:1: ( ( 'change' ) )
            // InternalArduinoML.g:2373:1: ( 'change' )
            {
            // InternalArduinoML.g:2373:1: ( 'change' )
            // InternalArduinoML.g:2374:2: 'change'
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
    // InternalArduinoML.g:2383:1: rule__Action__Group__1 : rule__Action__Group__1__Impl rule__Action__Group__2 ;
    public final void rule__Action__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2387:1: ( rule__Action__Group__1__Impl rule__Action__Group__2 )
            // InternalArduinoML.g:2388:2: rule__Action__Group__1__Impl rule__Action__Group__2
            {
            pushFollow(FOLLOW_25);
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
    // InternalArduinoML.g:2395:1: rule__Action__Group__1__Impl : ( ( rule__Action__ActuatorAssignment_1 ) ) ;
    public final void rule__Action__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2399:1: ( ( ( rule__Action__ActuatorAssignment_1 ) ) )
            // InternalArduinoML.g:2400:1: ( ( rule__Action__ActuatorAssignment_1 ) )
            {
            // InternalArduinoML.g:2400:1: ( ( rule__Action__ActuatorAssignment_1 ) )
            // InternalArduinoML.g:2401:2: ( rule__Action__ActuatorAssignment_1 )
            {
             before(grammarAccess.getActionAccess().getActuatorAssignment_1()); 
            // InternalArduinoML.g:2402:2: ( rule__Action__ActuatorAssignment_1 )
            // InternalArduinoML.g:2402:3: rule__Action__ActuatorAssignment_1
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
    // InternalArduinoML.g:2410:1: rule__Action__Group__2 : rule__Action__Group__2__Impl rule__Action__Group__3 ;
    public final void rule__Action__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2414:1: ( rule__Action__Group__2__Impl rule__Action__Group__3 )
            // InternalArduinoML.g:2415:2: rule__Action__Group__2__Impl rule__Action__Group__3
            {
            pushFollow(FOLLOW_26);
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
    // InternalArduinoML.g:2422:1: rule__Action__Group__2__Impl : ( 'to' ) ;
    public final void rule__Action__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2426:1: ( ( 'to' ) )
            // InternalArduinoML.g:2427:1: ( 'to' )
            {
            // InternalArduinoML.g:2427:1: ( 'to' )
            // InternalArduinoML.g:2428:2: 'to'
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
    // InternalArduinoML.g:2437:1: rule__Action__Group__3 : rule__Action__Group__3__Impl ;
    public final void rule__Action__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2441:1: ( rule__Action__Group__3__Impl )
            // InternalArduinoML.g:2442:2: rule__Action__Group__3__Impl
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
    // InternalArduinoML.g:2448:1: rule__Action__Group__3__Impl : ( ( rule__Action__ValueAssignment_3 ) ) ;
    public final void rule__Action__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2452:1: ( ( ( rule__Action__ValueAssignment_3 ) ) )
            // InternalArduinoML.g:2453:1: ( ( rule__Action__ValueAssignment_3 ) )
            {
            // InternalArduinoML.g:2453:1: ( ( rule__Action__ValueAssignment_3 ) )
            // InternalArduinoML.g:2454:2: ( rule__Action__ValueAssignment_3 )
            {
             before(grammarAccess.getActionAccess().getValueAssignment_3()); 
            // InternalArduinoML.g:2455:2: ( rule__Action__ValueAssignment_3 )
            // InternalArduinoML.g:2455:3: rule__Action__ValueAssignment_3
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
    // InternalArduinoML.g:2464:1: rule__TransitionState__Group__0 : rule__TransitionState__Group__0__Impl rule__TransitionState__Group__1 ;
    public final void rule__TransitionState__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2468:1: ( rule__TransitionState__Group__0__Impl rule__TransitionState__Group__1 )
            // InternalArduinoML.g:2469:2: rule__TransitionState__Group__0__Impl rule__TransitionState__Group__1
            {
            pushFollow(FOLLOW_27);
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
    // InternalArduinoML.g:2476:1: rule__TransitionState__Group__0__Impl : ( ( rule__TransitionState__Alternatives_0 ) ) ;
    public final void rule__TransitionState__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2480:1: ( ( ( rule__TransitionState__Alternatives_0 ) ) )
            // InternalArduinoML.g:2481:1: ( ( rule__TransitionState__Alternatives_0 ) )
            {
            // InternalArduinoML.g:2481:1: ( ( rule__TransitionState__Alternatives_0 ) )
            // InternalArduinoML.g:2482:2: ( rule__TransitionState__Alternatives_0 )
            {
             before(grammarAccess.getTransitionStateAccess().getAlternatives_0()); 
            // InternalArduinoML.g:2483:2: ( rule__TransitionState__Alternatives_0 )
            // InternalArduinoML.g:2483:3: rule__TransitionState__Alternatives_0
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
    // InternalArduinoML.g:2491:1: rule__TransitionState__Group__1 : rule__TransitionState__Group__1__Impl rule__TransitionState__Group__2 ;
    public final void rule__TransitionState__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2495:1: ( rule__TransitionState__Group__1__Impl rule__TransitionState__Group__2 )
            // InternalArduinoML.g:2496:2: rule__TransitionState__Group__1__Impl rule__TransitionState__Group__2
            {
            pushFollow(FOLLOW_25);
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
    // InternalArduinoML.g:2503:1: rule__TransitionState__Group__1__Impl : ( 'go' ) ;
    public final void rule__TransitionState__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2507:1: ( ( 'go' ) )
            // InternalArduinoML.g:2508:1: ( 'go' )
            {
            // InternalArduinoML.g:2508:1: ( 'go' )
            // InternalArduinoML.g:2509:2: 'go'
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
    // InternalArduinoML.g:2518:1: rule__TransitionState__Group__2 : rule__TransitionState__Group__2__Impl rule__TransitionState__Group__3 ;
    public final void rule__TransitionState__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2522:1: ( rule__TransitionState__Group__2__Impl rule__TransitionState__Group__3 )
            // InternalArduinoML.g:2523:2: rule__TransitionState__Group__2__Impl rule__TransitionState__Group__3
            {
            pushFollow(FOLLOW_5);
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
    // InternalArduinoML.g:2530:1: rule__TransitionState__Group__2__Impl : ( 'to' ) ;
    public final void rule__TransitionState__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2534:1: ( ( 'to' ) )
            // InternalArduinoML.g:2535:1: ( 'to' )
            {
            // InternalArduinoML.g:2535:1: ( 'to' )
            // InternalArduinoML.g:2536:2: 'to'
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
    // InternalArduinoML.g:2545:1: rule__TransitionState__Group__3 : rule__TransitionState__Group__3__Impl rule__TransitionState__Group__4 ;
    public final void rule__TransitionState__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2549:1: ( rule__TransitionState__Group__3__Impl rule__TransitionState__Group__4 )
            // InternalArduinoML.g:2550:2: rule__TransitionState__Group__3__Impl rule__TransitionState__Group__4
            {
            pushFollow(FOLLOW_3);
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
    // InternalArduinoML.g:2557:1: rule__TransitionState__Group__3__Impl : ( 'state' ) ;
    public final void rule__TransitionState__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2561:1: ( ( 'state' ) )
            // InternalArduinoML.g:2562:1: ( 'state' )
            {
            // InternalArduinoML.g:2562:1: ( 'state' )
            // InternalArduinoML.g:2563:2: 'state'
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
    // InternalArduinoML.g:2572:1: rule__TransitionState__Group__4 : rule__TransitionState__Group__4__Impl ;
    public final void rule__TransitionState__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2576:1: ( rule__TransitionState__Group__4__Impl )
            // InternalArduinoML.g:2577:2: rule__TransitionState__Group__4__Impl
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
    // InternalArduinoML.g:2583:1: rule__TransitionState__Group__4__Impl : ( ( rule__TransitionState__Next_stateAssignment_4 ) ) ;
    public final void rule__TransitionState__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2587:1: ( ( ( rule__TransitionState__Next_stateAssignment_4 ) ) )
            // InternalArduinoML.g:2588:1: ( ( rule__TransitionState__Next_stateAssignment_4 ) )
            {
            // InternalArduinoML.g:2588:1: ( ( rule__TransitionState__Next_stateAssignment_4 ) )
            // InternalArduinoML.g:2589:2: ( rule__TransitionState__Next_stateAssignment_4 )
            {
             before(grammarAccess.getTransitionStateAccess().getNext_stateAssignment_4()); 
            // InternalArduinoML.g:2590:2: ( rule__TransitionState__Next_stateAssignment_4 )
            // InternalArduinoML.g:2590:3: rule__TransitionState__Next_stateAssignment_4
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
    // InternalArduinoML.g:2599:1: rule__TransitionState__Group_0_0__0 : rule__TransitionState__Group_0_0__0__Impl rule__TransitionState__Group_0_0__1 ;
    public final void rule__TransitionState__Group_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2603:1: ( rule__TransitionState__Group_0_0__0__Impl rule__TransitionState__Group_0_0__1 )
            // InternalArduinoML.g:2604:2: rule__TransitionState__Group_0_0__0__Impl rule__TransitionState__Group_0_0__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalArduinoML.g:2611:1: rule__TransitionState__Group_0_0__0__Impl : ( 'when' ) ;
    public final void rule__TransitionState__Group_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2615:1: ( ( 'when' ) )
            // InternalArduinoML.g:2616:1: ( 'when' )
            {
            // InternalArduinoML.g:2616:1: ( 'when' )
            // InternalArduinoML.g:2617:2: 'when'
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
    // InternalArduinoML.g:2626:1: rule__TransitionState__Group_0_0__1 : rule__TransitionState__Group_0_0__1__Impl rule__TransitionState__Group_0_0__2 ;
    public final void rule__TransitionState__Group_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2630:1: ( rule__TransitionState__Group_0_0__1__Impl rule__TransitionState__Group_0_0__2 )
            // InternalArduinoML.g:2631:2: rule__TransitionState__Group_0_0__1__Impl rule__TransitionState__Group_0_0__2
            {
            pushFollow(FOLLOW_28);
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
    // InternalArduinoML.g:2638:1: rule__TransitionState__Group_0_0__1__Impl : ( ( rule__TransitionState__Alternatives_0_0_1 ) ) ;
    public final void rule__TransitionState__Group_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2642:1: ( ( ( rule__TransitionState__Alternatives_0_0_1 ) ) )
            // InternalArduinoML.g:2643:1: ( ( rule__TransitionState__Alternatives_0_0_1 ) )
            {
            // InternalArduinoML.g:2643:1: ( ( rule__TransitionState__Alternatives_0_0_1 ) )
            // InternalArduinoML.g:2644:2: ( rule__TransitionState__Alternatives_0_0_1 )
            {
             before(grammarAccess.getTransitionStateAccess().getAlternatives_0_0_1()); 
            // InternalArduinoML.g:2645:2: ( rule__TransitionState__Alternatives_0_0_1 )
            // InternalArduinoML.g:2645:3: rule__TransitionState__Alternatives_0_0_1
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
    // InternalArduinoML.g:2653:1: rule__TransitionState__Group_0_0__2 : rule__TransitionState__Group_0_0__2__Impl rule__TransitionState__Group_0_0__3 ;
    public final void rule__TransitionState__Group_0_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2657:1: ( rule__TransitionState__Group_0_0__2__Impl rule__TransitionState__Group_0_0__3 )
            // InternalArduinoML.g:2658:2: rule__TransitionState__Group_0_0__2__Impl rule__TransitionState__Group_0_0__3
            {
            pushFollow(FOLLOW_28);
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
    // InternalArduinoML.g:2665:1: rule__TransitionState__Group_0_0__2__Impl : ( ( rule__TransitionState__Group_0_0_2__0 )* ) ;
    public final void rule__TransitionState__Group_0_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2669:1: ( ( ( rule__TransitionState__Group_0_0_2__0 )* ) )
            // InternalArduinoML.g:2670:1: ( ( rule__TransitionState__Group_0_0_2__0 )* )
            {
            // InternalArduinoML.g:2670:1: ( ( rule__TransitionState__Group_0_0_2__0 )* )
            // InternalArduinoML.g:2671:2: ( rule__TransitionState__Group_0_0_2__0 )*
            {
             before(grammarAccess.getTransitionStateAccess().getGroup_0_0_2()); 
            // InternalArduinoML.g:2672:2: ( rule__TransitionState__Group_0_0_2__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==38) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalArduinoML.g:2672:3: rule__TransitionState__Group_0_0_2__0
            	    {
            	    pushFollow(FOLLOW_29);
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
    // InternalArduinoML.g:2680:1: rule__TransitionState__Group_0_0__3 : rule__TransitionState__Group_0_0__3__Impl ;
    public final void rule__TransitionState__Group_0_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2684:1: ( rule__TransitionState__Group_0_0__3__Impl )
            // InternalArduinoML.g:2685:2: rule__TransitionState__Group_0_0__3__Impl
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
    // InternalArduinoML.g:2691:1: rule__TransitionState__Group_0_0__3__Impl : ( ( rule__TransitionState__Group_0_0_3__0 )? ) ;
    public final void rule__TransitionState__Group_0_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2695:1: ( ( ( rule__TransitionState__Group_0_0_3__0 )? ) )
            // InternalArduinoML.g:2696:1: ( ( rule__TransitionState__Group_0_0_3__0 )? )
            {
            // InternalArduinoML.g:2696:1: ( ( rule__TransitionState__Group_0_0_3__0 )? )
            // InternalArduinoML.g:2697:2: ( rule__TransitionState__Group_0_0_3__0 )?
            {
             before(grammarAccess.getTransitionStateAccess().getGroup_0_0_3()); 
            // InternalArduinoML.g:2698:2: ( rule__TransitionState__Group_0_0_3__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==39) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalArduinoML.g:2698:3: rule__TransitionState__Group_0_0_3__0
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
    // InternalArduinoML.g:2707:1: rule__TransitionState__Group_0_0_1_0__0 : rule__TransitionState__Group_0_0_1_0__0__Impl rule__TransitionState__Group_0_0_1_0__1 ;
    public final void rule__TransitionState__Group_0_0_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2711:1: ( rule__TransitionState__Group_0_0_1_0__0__Impl rule__TransitionState__Group_0_0_1_0__1 )
            // InternalArduinoML.g:2712:2: rule__TransitionState__Group_0_0_1_0__0__Impl rule__TransitionState__Group_0_0_1_0__1
            {
            pushFollow(FOLLOW_30);
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
    // InternalArduinoML.g:2719:1: rule__TransitionState__Group_0_0_1_0__0__Impl : ( ( rule__TransitionState__DigitalsAssignment_0_0_1_0_0 ) ) ;
    public final void rule__TransitionState__Group_0_0_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2723:1: ( ( ( rule__TransitionState__DigitalsAssignment_0_0_1_0_0 ) ) )
            // InternalArduinoML.g:2724:1: ( ( rule__TransitionState__DigitalsAssignment_0_0_1_0_0 ) )
            {
            // InternalArduinoML.g:2724:1: ( ( rule__TransitionState__DigitalsAssignment_0_0_1_0_0 ) )
            // InternalArduinoML.g:2725:2: ( rule__TransitionState__DigitalsAssignment_0_0_1_0_0 )
            {
             before(grammarAccess.getTransitionStateAccess().getDigitalsAssignment_0_0_1_0_0()); 
            // InternalArduinoML.g:2726:2: ( rule__TransitionState__DigitalsAssignment_0_0_1_0_0 )
            // InternalArduinoML.g:2726:3: rule__TransitionState__DigitalsAssignment_0_0_1_0_0
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
    // InternalArduinoML.g:2734:1: rule__TransitionState__Group_0_0_1_0__1 : rule__TransitionState__Group_0_0_1_0__1__Impl rule__TransitionState__Group_0_0_1_0__2 ;
    public final void rule__TransitionState__Group_0_0_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2738:1: ( rule__TransitionState__Group_0_0_1_0__1__Impl rule__TransitionState__Group_0_0_1_0__2 )
            // InternalArduinoML.g:2739:2: rule__TransitionState__Group_0_0_1_0__1__Impl rule__TransitionState__Group_0_0_1_0__2
            {
            pushFollow(FOLLOW_26);
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
    // InternalArduinoML.g:2746:1: rule__TransitionState__Group_0_0_1_0__1__Impl : ( 'is' ) ;
    public final void rule__TransitionState__Group_0_0_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2750:1: ( ( 'is' ) )
            // InternalArduinoML.g:2751:1: ( 'is' )
            {
            // InternalArduinoML.g:2751:1: ( 'is' )
            // InternalArduinoML.g:2752:2: 'is'
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
    // InternalArduinoML.g:2761:1: rule__TransitionState__Group_0_0_1_0__2 : rule__TransitionState__Group_0_0_1_0__2__Impl ;
    public final void rule__TransitionState__Group_0_0_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2765:1: ( rule__TransitionState__Group_0_0_1_0__2__Impl )
            // InternalArduinoML.g:2766:2: rule__TransitionState__Group_0_0_1_0__2__Impl
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
    // InternalArduinoML.g:2772:1: rule__TransitionState__Group_0_0_1_0__2__Impl : ( ( rule__TransitionState__D_valuesAssignment_0_0_1_0_2 ) ) ;
    public final void rule__TransitionState__Group_0_0_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2776:1: ( ( ( rule__TransitionState__D_valuesAssignment_0_0_1_0_2 ) ) )
            // InternalArduinoML.g:2777:1: ( ( rule__TransitionState__D_valuesAssignment_0_0_1_0_2 ) )
            {
            // InternalArduinoML.g:2777:1: ( ( rule__TransitionState__D_valuesAssignment_0_0_1_0_2 ) )
            // InternalArduinoML.g:2778:2: ( rule__TransitionState__D_valuesAssignment_0_0_1_0_2 )
            {
             before(grammarAccess.getTransitionStateAccess().getD_valuesAssignment_0_0_1_0_2()); 
            // InternalArduinoML.g:2779:2: ( rule__TransitionState__D_valuesAssignment_0_0_1_0_2 )
            // InternalArduinoML.g:2779:3: rule__TransitionState__D_valuesAssignment_0_0_1_0_2
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
    // InternalArduinoML.g:2788:1: rule__TransitionState__Group_0_0_1_1__0 : rule__TransitionState__Group_0_0_1_1__0__Impl rule__TransitionState__Group_0_0_1_1__1 ;
    public final void rule__TransitionState__Group_0_0_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2792:1: ( rule__TransitionState__Group_0_0_1_1__0__Impl rule__TransitionState__Group_0_0_1_1__1 )
            // InternalArduinoML.g:2793:2: rule__TransitionState__Group_0_0_1_1__0__Impl rule__TransitionState__Group_0_0_1_1__1
            {
            pushFollow(FOLLOW_31);
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
    // InternalArduinoML.g:2800:1: rule__TransitionState__Group_0_0_1_1__0__Impl : ( ( rule__TransitionState__AnalogsAssignment_0_0_1_1_0 ) ) ;
    public final void rule__TransitionState__Group_0_0_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2804:1: ( ( ( rule__TransitionState__AnalogsAssignment_0_0_1_1_0 ) ) )
            // InternalArduinoML.g:2805:1: ( ( rule__TransitionState__AnalogsAssignment_0_0_1_1_0 ) )
            {
            // InternalArduinoML.g:2805:1: ( ( rule__TransitionState__AnalogsAssignment_0_0_1_1_0 ) )
            // InternalArduinoML.g:2806:2: ( rule__TransitionState__AnalogsAssignment_0_0_1_1_0 )
            {
             before(grammarAccess.getTransitionStateAccess().getAnalogsAssignment_0_0_1_1_0()); 
            // InternalArduinoML.g:2807:2: ( rule__TransitionState__AnalogsAssignment_0_0_1_1_0 )
            // InternalArduinoML.g:2807:3: rule__TransitionState__AnalogsAssignment_0_0_1_1_0
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
    // InternalArduinoML.g:2815:1: rule__TransitionState__Group_0_0_1_1__1 : rule__TransitionState__Group_0_0_1_1__1__Impl rule__TransitionState__Group_0_0_1_1__2 ;
    public final void rule__TransitionState__Group_0_0_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2819:1: ( rule__TransitionState__Group_0_0_1_1__1__Impl rule__TransitionState__Group_0_0_1_1__2 )
            // InternalArduinoML.g:2820:2: rule__TransitionState__Group_0_0_1_1__1__Impl rule__TransitionState__Group_0_0_1_1__2
            {
            pushFollow(FOLLOW_14);
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
    // InternalArduinoML.g:2827:1: rule__TransitionState__Group_0_0_1_1__1__Impl : ( ( rule__TransitionState__CompAssignment_0_0_1_1_1 ) ) ;
    public final void rule__TransitionState__Group_0_0_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2831:1: ( ( ( rule__TransitionState__CompAssignment_0_0_1_1_1 ) ) )
            // InternalArduinoML.g:2832:1: ( ( rule__TransitionState__CompAssignment_0_0_1_1_1 ) )
            {
            // InternalArduinoML.g:2832:1: ( ( rule__TransitionState__CompAssignment_0_0_1_1_1 ) )
            // InternalArduinoML.g:2833:2: ( rule__TransitionState__CompAssignment_0_0_1_1_1 )
            {
             before(grammarAccess.getTransitionStateAccess().getCompAssignment_0_0_1_1_1()); 
            // InternalArduinoML.g:2834:2: ( rule__TransitionState__CompAssignment_0_0_1_1_1 )
            // InternalArduinoML.g:2834:3: rule__TransitionState__CompAssignment_0_0_1_1_1
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
    // InternalArduinoML.g:2842:1: rule__TransitionState__Group_0_0_1_1__2 : rule__TransitionState__Group_0_0_1_1__2__Impl ;
    public final void rule__TransitionState__Group_0_0_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2846:1: ( rule__TransitionState__Group_0_0_1_1__2__Impl )
            // InternalArduinoML.g:2847:2: rule__TransitionState__Group_0_0_1_1__2__Impl
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
    // InternalArduinoML.g:2853:1: rule__TransitionState__Group_0_0_1_1__2__Impl : ( ( rule__TransitionState__A_valuesAssignment_0_0_1_1_2 ) ) ;
    public final void rule__TransitionState__Group_0_0_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2857:1: ( ( ( rule__TransitionState__A_valuesAssignment_0_0_1_1_2 ) ) )
            // InternalArduinoML.g:2858:1: ( ( rule__TransitionState__A_valuesAssignment_0_0_1_1_2 ) )
            {
            // InternalArduinoML.g:2858:1: ( ( rule__TransitionState__A_valuesAssignment_0_0_1_1_2 ) )
            // InternalArduinoML.g:2859:2: ( rule__TransitionState__A_valuesAssignment_0_0_1_1_2 )
            {
             before(grammarAccess.getTransitionStateAccess().getA_valuesAssignment_0_0_1_1_2()); 
            // InternalArduinoML.g:2860:2: ( rule__TransitionState__A_valuesAssignment_0_0_1_1_2 )
            // InternalArduinoML.g:2860:3: rule__TransitionState__A_valuesAssignment_0_0_1_1_2
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
    // InternalArduinoML.g:2869:1: rule__TransitionState__Group_0_0_2__0 : rule__TransitionState__Group_0_0_2__0__Impl rule__TransitionState__Group_0_0_2__1 ;
    public final void rule__TransitionState__Group_0_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2873:1: ( rule__TransitionState__Group_0_0_2__0__Impl rule__TransitionState__Group_0_0_2__1 )
            // InternalArduinoML.g:2874:2: rule__TransitionState__Group_0_0_2__0__Impl rule__TransitionState__Group_0_0_2__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalArduinoML.g:2881:1: rule__TransitionState__Group_0_0_2__0__Impl : ( 'and' ) ;
    public final void rule__TransitionState__Group_0_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2885:1: ( ( 'and' ) )
            // InternalArduinoML.g:2886:1: ( 'and' )
            {
            // InternalArduinoML.g:2886:1: ( 'and' )
            // InternalArduinoML.g:2887:2: 'and'
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
    // InternalArduinoML.g:2896:1: rule__TransitionState__Group_0_0_2__1 : rule__TransitionState__Group_0_0_2__1__Impl ;
    public final void rule__TransitionState__Group_0_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2900:1: ( rule__TransitionState__Group_0_0_2__1__Impl )
            // InternalArduinoML.g:2901:2: rule__TransitionState__Group_0_0_2__1__Impl
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
    // InternalArduinoML.g:2907:1: rule__TransitionState__Group_0_0_2__1__Impl : ( ( rule__TransitionState__Alternatives_0_0_2_1 ) ) ;
    public final void rule__TransitionState__Group_0_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2911:1: ( ( ( rule__TransitionState__Alternatives_0_0_2_1 ) ) )
            // InternalArduinoML.g:2912:1: ( ( rule__TransitionState__Alternatives_0_0_2_1 ) )
            {
            // InternalArduinoML.g:2912:1: ( ( rule__TransitionState__Alternatives_0_0_2_1 ) )
            // InternalArduinoML.g:2913:2: ( rule__TransitionState__Alternatives_0_0_2_1 )
            {
             before(grammarAccess.getTransitionStateAccess().getAlternatives_0_0_2_1()); 
            // InternalArduinoML.g:2914:2: ( rule__TransitionState__Alternatives_0_0_2_1 )
            // InternalArduinoML.g:2914:3: rule__TransitionState__Alternatives_0_0_2_1
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
    // InternalArduinoML.g:2923:1: rule__TransitionState__Group_0_0_2_1_0__0 : rule__TransitionState__Group_0_0_2_1_0__0__Impl rule__TransitionState__Group_0_0_2_1_0__1 ;
    public final void rule__TransitionState__Group_0_0_2_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2927:1: ( rule__TransitionState__Group_0_0_2_1_0__0__Impl rule__TransitionState__Group_0_0_2_1_0__1 )
            // InternalArduinoML.g:2928:2: rule__TransitionState__Group_0_0_2_1_0__0__Impl rule__TransitionState__Group_0_0_2_1_0__1
            {
            pushFollow(FOLLOW_30);
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
    // InternalArduinoML.g:2935:1: rule__TransitionState__Group_0_0_2_1_0__0__Impl : ( ( rule__TransitionState__DigitalsAssignment_0_0_2_1_0_0 ) ) ;
    public final void rule__TransitionState__Group_0_0_2_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2939:1: ( ( ( rule__TransitionState__DigitalsAssignment_0_0_2_1_0_0 ) ) )
            // InternalArduinoML.g:2940:1: ( ( rule__TransitionState__DigitalsAssignment_0_0_2_1_0_0 ) )
            {
            // InternalArduinoML.g:2940:1: ( ( rule__TransitionState__DigitalsAssignment_0_0_2_1_0_0 ) )
            // InternalArduinoML.g:2941:2: ( rule__TransitionState__DigitalsAssignment_0_0_2_1_0_0 )
            {
             before(grammarAccess.getTransitionStateAccess().getDigitalsAssignment_0_0_2_1_0_0()); 
            // InternalArduinoML.g:2942:2: ( rule__TransitionState__DigitalsAssignment_0_0_2_1_0_0 )
            // InternalArduinoML.g:2942:3: rule__TransitionState__DigitalsAssignment_0_0_2_1_0_0
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
    // InternalArduinoML.g:2950:1: rule__TransitionState__Group_0_0_2_1_0__1 : rule__TransitionState__Group_0_0_2_1_0__1__Impl rule__TransitionState__Group_0_0_2_1_0__2 ;
    public final void rule__TransitionState__Group_0_0_2_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2954:1: ( rule__TransitionState__Group_0_0_2_1_0__1__Impl rule__TransitionState__Group_0_0_2_1_0__2 )
            // InternalArduinoML.g:2955:2: rule__TransitionState__Group_0_0_2_1_0__1__Impl rule__TransitionState__Group_0_0_2_1_0__2
            {
            pushFollow(FOLLOW_26);
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
    // InternalArduinoML.g:2962:1: rule__TransitionState__Group_0_0_2_1_0__1__Impl : ( 'is' ) ;
    public final void rule__TransitionState__Group_0_0_2_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2966:1: ( ( 'is' ) )
            // InternalArduinoML.g:2967:1: ( 'is' )
            {
            // InternalArduinoML.g:2967:1: ( 'is' )
            // InternalArduinoML.g:2968:2: 'is'
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
    // InternalArduinoML.g:2977:1: rule__TransitionState__Group_0_0_2_1_0__2 : rule__TransitionState__Group_0_0_2_1_0__2__Impl ;
    public final void rule__TransitionState__Group_0_0_2_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2981:1: ( rule__TransitionState__Group_0_0_2_1_0__2__Impl )
            // InternalArduinoML.g:2982:2: rule__TransitionState__Group_0_0_2_1_0__2__Impl
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
    // InternalArduinoML.g:2988:1: rule__TransitionState__Group_0_0_2_1_0__2__Impl : ( ( rule__TransitionState__D_valuesAssignment_0_0_2_1_0_2 ) ) ;
    public final void rule__TransitionState__Group_0_0_2_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2992:1: ( ( ( rule__TransitionState__D_valuesAssignment_0_0_2_1_0_2 ) ) )
            // InternalArduinoML.g:2993:1: ( ( rule__TransitionState__D_valuesAssignment_0_0_2_1_0_2 ) )
            {
            // InternalArduinoML.g:2993:1: ( ( rule__TransitionState__D_valuesAssignment_0_0_2_1_0_2 ) )
            // InternalArduinoML.g:2994:2: ( rule__TransitionState__D_valuesAssignment_0_0_2_1_0_2 )
            {
             before(grammarAccess.getTransitionStateAccess().getD_valuesAssignment_0_0_2_1_0_2()); 
            // InternalArduinoML.g:2995:2: ( rule__TransitionState__D_valuesAssignment_0_0_2_1_0_2 )
            // InternalArduinoML.g:2995:3: rule__TransitionState__D_valuesAssignment_0_0_2_1_0_2
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
    // InternalArduinoML.g:3004:1: rule__TransitionState__Group_0_0_2_1_1__0 : rule__TransitionState__Group_0_0_2_1_1__0__Impl rule__TransitionState__Group_0_0_2_1_1__1 ;
    public final void rule__TransitionState__Group_0_0_2_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3008:1: ( rule__TransitionState__Group_0_0_2_1_1__0__Impl rule__TransitionState__Group_0_0_2_1_1__1 )
            // InternalArduinoML.g:3009:2: rule__TransitionState__Group_0_0_2_1_1__0__Impl rule__TransitionState__Group_0_0_2_1_1__1
            {
            pushFollow(FOLLOW_31);
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
    // InternalArduinoML.g:3016:1: rule__TransitionState__Group_0_0_2_1_1__0__Impl : ( ( rule__TransitionState__AnalogsAssignment_0_0_2_1_1_0 ) ) ;
    public final void rule__TransitionState__Group_0_0_2_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3020:1: ( ( ( rule__TransitionState__AnalogsAssignment_0_0_2_1_1_0 ) ) )
            // InternalArduinoML.g:3021:1: ( ( rule__TransitionState__AnalogsAssignment_0_0_2_1_1_0 ) )
            {
            // InternalArduinoML.g:3021:1: ( ( rule__TransitionState__AnalogsAssignment_0_0_2_1_1_0 ) )
            // InternalArduinoML.g:3022:2: ( rule__TransitionState__AnalogsAssignment_0_0_2_1_1_0 )
            {
             before(grammarAccess.getTransitionStateAccess().getAnalogsAssignment_0_0_2_1_1_0()); 
            // InternalArduinoML.g:3023:2: ( rule__TransitionState__AnalogsAssignment_0_0_2_1_1_0 )
            // InternalArduinoML.g:3023:3: rule__TransitionState__AnalogsAssignment_0_0_2_1_1_0
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
    // InternalArduinoML.g:3031:1: rule__TransitionState__Group_0_0_2_1_1__1 : rule__TransitionState__Group_0_0_2_1_1__1__Impl rule__TransitionState__Group_0_0_2_1_1__2 ;
    public final void rule__TransitionState__Group_0_0_2_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3035:1: ( rule__TransitionState__Group_0_0_2_1_1__1__Impl rule__TransitionState__Group_0_0_2_1_1__2 )
            // InternalArduinoML.g:3036:2: rule__TransitionState__Group_0_0_2_1_1__1__Impl rule__TransitionState__Group_0_0_2_1_1__2
            {
            pushFollow(FOLLOW_14);
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
    // InternalArduinoML.g:3043:1: rule__TransitionState__Group_0_0_2_1_1__1__Impl : ( ( rule__TransitionState__CompAssignment_0_0_2_1_1_1 ) ) ;
    public final void rule__TransitionState__Group_0_0_2_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3047:1: ( ( ( rule__TransitionState__CompAssignment_0_0_2_1_1_1 ) ) )
            // InternalArduinoML.g:3048:1: ( ( rule__TransitionState__CompAssignment_0_0_2_1_1_1 ) )
            {
            // InternalArduinoML.g:3048:1: ( ( rule__TransitionState__CompAssignment_0_0_2_1_1_1 ) )
            // InternalArduinoML.g:3049:2: ( rule__TransitionState__CompAssignment_0_0_2_1_1_1 )
            {
             before(grammarAccess.getTransitionStateAccess().getCompAssignment_0_0_2_1_1_1()); 
            // InternalArduinoML.g:3050:2: ( rule__TransitionState__CompAssignment_0_0_2_1_1_1 )
            // InternalArduinoML.g:3050:3: rule__TransitionState__CompAssignment_0_0_2_1_1_1
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
    // InternalArduinoML.g:3058:1: rule__TransitionState__Group_0_0_2_1_1__2 : rule__TransitionState__Group_0_0_2_1_1__2__Impl ;
    public final void rule__TransitionState__Group_0_0_2_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3062:1: ( rule__TransitionState__Group_0_0_2_1_1__2__Impl )
            // InternalArduinoML.g:3063:2: rule__TransitionState__Group_0_0_2_1_1__2__Impl
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
    // InternalArduinoML.g:3069:1: rule__TransitionState__Group_0_0_2_1_1__2__Impl : ( ( rule__TransitionState__A_valuesAssignment_0_0_2_1_1_2 ) ) ;
    public final void rule__TransitionState__Group_0_0_2_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3073:1: ( ( ( rule__TransitionState__A_valuesAssignment_0_0_2_1_1_2 ) ) )
            // InternalArduinoML.g:3074:1: ( ( rule__TransitionState__A_valuesAssignment_0_0_2_1_1_2 ) )
            {
            // InternalArduinoML.g:3074:1: ( ( rule__TransitionState__A_valuesAssignment_0_0_2_1_1_2 ) )
            // InternalArduinoML.g:3075:2: ( rule__TransitionState__A_valuesAssignment_0_0_2_1_1_2 )
            {
             before(grammarAccess.getTransitionStateAccess().getA_valuesAssignment_0_0_2_1_1_2()); 
            // InternalArduinoML.g:3076:2: ( rule__TransitionState__A_valuesAssignment_0_0_2_1_1_2 )
            // InternalArduinoML.g:3076:3: rule__TransitionState__A_valuesAssignment_0_0_2_1_1_2
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
    // InternalArduinoML.g:3085:1: rule__TransitionState__Group_0_0_3__0 : rule__TransitionState__Group_0_0_3__0__Impl rule__TransitionState__Group_0_0_3__1 ;
    public final void rule__TransitionState__Group_0_0_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3089:1: ( rule__TransitionState__Group_0_0_3__0__Impl rule__TransitionState__Group_0_0_3__1 )
            // InternalArduinoML.g:3090:2: rule__TransitionState__Group_0_0_3__0__Impl rule__TransitionState__Group_0_0_3__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalArduinoML.g:3097:1: rule__TransitionState__Group_0_0_3__0__Impl : ( 'wait' ) ;
    public final void rule__TransitionState__Group_0_0_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3101:1: ( ( 'wait' ) )
            // InternalArduinoML.g:3102:1: ( 'wait' )
            {
            // InternalArduinoML.g:3102:1: ( 'wait' )
            // InternalArduinoML.g:3103:2: 'wait'
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
    // InternalArduinoML.g:3112:1: rule__TransitionState__Group_0_0_3__1 : rule__TransitionState__Group_0_0_3__1__Impl rule__TransitionState__Group_0_0_3__2 ;
    public final void rule__TransitionState__Group_0_0_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3116:1: ( rule__TransitionState__Group_0_0_3__1__Impl rule__TransitionState__Group_0_0_3__2 )
            // InternalArduinoML.g:3117:2: rule__TransitionState__Group_0_0_3__1__Impl rule__TransitionState__Group_0_0_3__2
            {
            pushFollow(FOLLOW_32);
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
    // InternalArduinoML.g:3124:1: rule__TransitionState__Group_0_0_3__1__Impl : ( ( rule__TransitionState__TimeAssignment_0_0_3_1 ) ) ;
    public final void rule__TransitionState__Group_0_0_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3128:1: ( ( ( rule__TransitionState__TimeAssignment_0_0_3_1 ) ) )
            // InternalArduinoML.g:3129:1: ( ( rule__TransitionState__TimeAssignment_0_0_3_1 ) )
            {
            // InternalArduinoML.g:3129:1: ( ( rule__TransitionState__TimeAssignment_0_0_3_1 ) )
            // InternalArduinoML.g:3130:2: ( rule__TransitionState__TimeAssignment_0_0_3_1 )
            {
             before(grammarAccess.getTransitionStateAccess().getTimeAssignment_0_0_3_1()); 
            // InternalArduinoML.g:3131:2: ( rule__TransitionState__TimeAssignment_0_0_3_1 )
            // InternalArduinoML.g:3131:3: rule__TransitionState__TimeAssignment_0_0_3_1
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
    // InternalArduinoML.g:3139:1: rule__TransitionState__Group_0_0_3__2 : rule__TransitionState__Group_0_0_3__2__Impl rule__TransitionState__Group_0_0_3__3 ;
    public final void rule__TransitionState__Group_0_0_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3143:1: ( rule__TransitionState__Group_0_0_3__2__Impl rule__TransitionState__Group_0_0_3__3 )
            // InternalArduinoML.g:3144:2: rule__TransitionState__Group_0_0_3__2__Impl rule__TransitionState__Group_0_0_3__3
            {
            pushFollow(FOLLOW_33);
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
    // InternalArduinoML.g:3151:1: rule__TransitionState__Group_0_0_3__2__Impl : ( ( rule__TransitionState__UnitAssignment_0_0_3_2 ) ) ;
    public final void rule__TransitionState__Group_0_0_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3155:1: ( ( ( rule__TransitionState__UnitAssignment_0_0_3_2 ) ) )
            // InternalArduinoML.g:3156:1: ( ( rule__TransitionState__UnitAssignment_0_0_3_2 ) )
            {
            // InternalArduinoML.g:3156:1: ( ( rule__TransitionState__UnitAssignment_0_0_3_2 ) )
            // InternalArduinoML.g:3157:2: ( rule__TransitionState__UnitAssignment_0_0_3_2 )
            {
             before(grammarAccess.getTransitionStateAccess().getUnitAssignment_0_0_3_2()); 
            // InternalArduinoML.g:3158:2: ( rule__TransitionState__UnitAssignment_0_0_3_2 )
            // InternalArduinoML.g:3158:3: rule__TransitionState__UnitAssignment_0_0_3_2
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
    // InternalArduinoML.g:3166:1: rule__TransitionState__Group_0_0_3__3 : rule__TransitionState__Group_0_0_3__3__Impl ;
    public final void rule__TransitionState__Group_0_0_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3170:1: ( rule__TransitionState__Group_0_0_3__3__Impl )
            // InternalArduinoML.g:3171:2: rule__TransitionState__Group_0_0_3__3__Impl
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
    // InternalArduinoML.g:3177:1: rule__TransitionState__Group_0_0_3__3__Impl : ( 'then' ) ;
    public final void rule__TransitionState__Group_0_0_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3181:1: ( ( 'then' ) )
            // InternalArduinoML.g:3182:1: ( 'then' )
            {
            // InternalArduinoML.g:3182:1: ( 'then' )
            // InternalArduinoML.g:3183:2: 'then'
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
    // InternalArduinoML.g:3193:1: rule__TransitionState__Group_0_1__0 : rule__TransitionState__Group_0_1__0__Impl rule__TransitionState__Group_0_1__1 ;
    public final void rule__TransitionState__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3197:1: ( rule__TransitionState__Group_0_1__0__Impl rule__TransitionState__Group_0_1__1 )
            // InternalArduinoML.g:3198:2: rule__TransitionState__Group_0_1__0__Impl rule__TransitionState__Group_0_1__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalArduinoML.g:3205:1: rule__TransitionState__Group_0_1__0__Impl : ( 'wait' ) ;
    public final void rule__TransitionState__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3209:1: ( ( 'wait' ) )
            // InternalArduinoML.g:3210:1: ( 'wait' )
            {
            // InternalArduinoML.g:3210:1: ( 'wait' )
            // InternalArduinoML.g:3211:2: 'wait'
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
    // InternalArduinoML.g:3220:1: rule__TransitionState__Group_0_1__1 : rule__TransitionState__Group_0_1__1__Impl rule__TransitionState__Group_0_1__2 ;
    public final void rule__TransitionState__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3224:1: ( rule__TransitionState__Group_0_1__1__Impl rule__TransitionState__Group_0_1__2 )
            // InternalArduinoML.g:3225:2: rule__TransitionState__Group_0_1__1__Impl rule__TransitionState__Group_0_1__2
            {
            pushFollow(FOLLOW_32);
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
    // InternalArduinoML.g:3232:1: rule__TransitionState__Group_0_1__1__Impl : ( ( rule__TransitionState__TimeAssignment_0_1_1 ) ) ;
    public final void rule__TransitionState__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3236:1: ( ( ( rule__TransitionState__TimeAssignment_0_1_1 ) ) )
            // InternalArduinoML.g:3237:1: ( ( rule__TransitionState__TimeAssignment_0_1_1 ) )
            {
            // InternalArduinoML.g:3237:1: ( ( rule__TransitionState__TimeAssignment_0_1_1 ) )
            // InternalArduinoML.g:3238:2: ( rule__TransitionState__TimeAssignment_0_1_1 )
            {
             before(grammarAccess.getTransitionStateAccess().getTimeAssignment_0_1_1()); 
            // InternalArduinoML.g:3239:2: ( rule__TransitionState__TimeAssignment_0_1_1 )
            // InternalArduinoML.g:3239:3: rule__TransitionState__TimeAssignment_0_1_1
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
    // InternalArduinoML.g:3247:1: rule__TransitionState__Group_0_1__2 : rule__TransitionState__Group_0_1__2__Impl rule__TransitionState__Group_0_1__3 ;
    public final void rule__TransitionState__Group_0_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3251:1: ( rule__TransitionState__Group_0_1__2__Impl rule__TransitionState__Group_0_1__3 )
            // InternalArduinoML.g:3252:2: rule__TransitionState__Group_0_1__2__Impl rule__TransitionState__Group_0_1__3
            {
            pushFollow(FOLLOW_33);
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
    // InternalArduinoML.g:3259:1: rule__TransitionState__Group_0_1__2__Impl : ( ( rule__TransitionState__UnitAssignment_0_1_2 ) ) ;
    public final void rule__TransitionState__Group_0_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3263:1: ( ( ( rule__TransitionState__UnitAssignment_0_1_2 ) ) )
            // InternalArduinoML.g:3264:1: ( ( rule__TransitionState__UnitAssignment_0_1_2 ) )
            {
            // InternalArduinoML.g:3264:1: ( ( rule__TransitionState__UnitAssignment_0_1_2 ) )
            // InternalArduinoML.g:3265:2: ( rule__TransitionState__UnitAssignment_0_1_2 )
            {
             before(grammarAccess.getTransitionStateAccess().getUnitAssignment_0_1_2()); 
            // InternalArduinoML.g:3266:2: ( rule__TransitionState__UnitAssignment_0_1_2 )
            // InternalArduinoML.g:3266:3: rule__TransitionState__UnitAssignment_0_1_2
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
    // InternalArduinoML.g:3274:1: rule__TransitionState__Group_0_1__3 : rule__TransitionState__Group_0_1__3__Impl ;
    public final void rule__TransitionState__Group_0_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3278:1: ( rule__TransitionState__Group_0_1__3__Impl )
            // InternalArduinoML.g:3279:2: rule__TransitionState__Group_0_1__3__Impl
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
    // InternalArduinoML.g:3285:1: rule__TransitionState__Group_0_1__3__Impl : ( 'then' ) ;
    public final void rule__TransitionState__Group_0_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3289:1: ( ( 'then' ) )
            // InternalArduinoML.g:3290:1: ( 'then' )
            {
            // InternalArduinoML.g:3290:1: ( 'then' )
            // InternalArduinoML.g:3291:2: 'then'
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
    // InternalArduinoML.g:3301:1: rule__TransitionMode__Group__0 : rule__TransitionMode__Group__0__Impl rule__TransitionMode__Group__1 ;
    public final void rule__TransitionMode__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3305:1: ( rule__TransitionMode__Group__0__Impl rule__TransitionMode__Group__1 )
            // InternalArduinoML.g:3306:2: rule__TransitionMode__Group__0__Impl rule__TransitionMode__Group__1
            {
            pushFollow(FOLLOW_27);
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
    // InternalArduinoML.g:3313:1: rule__TransitionMode__Group__0__Impl : ( ( rule__TransitionMode__Alternatives_0 ) ) ;
    public final void rule__TransitionMode__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3317:1: ( ( ( rule__TransitionMode__Alternatives_0 ) ) )
            // InternalArduinoML.g:3318:1: ( ( rule__TransitionMode__Alternatives_0 ) )
            {
            // InternalArduinoML.g:3318:1: ( ( rule__TransitionMode__Alternatives_0 ) )
            // InternalArduinoML.g:3319:2: ( rule__TransitionMode__Alternatives_0 )
            {
             before(grammarAccess.getTransitionModeAccess().getAlternatives_0()); 
            // InternalArduinoML.g:3320:2: ( rule__TransitionMode__Alternatives_0 )
            // InternalArduinoML.g:3320:3: rule__TransitionMode__Alternatives_0
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
    // InternalArduinoML.g:3328:1: rule__TransitionMode__Group__1 : rule__TransitionMode__Group__1__Impl rule__TransitionMode__Group__2 ;
    public final void rule__TransitionMode__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3332:1: ( rule__TransitionMode__Group__1__Impl rule__TransitionMode__Group__2 )
            // InternalArduinoML.g:3333:2: rule__TransitionMode__Group__1__Impl rule__TransitionMode__Group__2
            {
            pushFollow(FOLLOW_25);
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
    // InternalArduinoML.g:3340:1: rule__TransitionMode__Group__1__Impl : ( 'go' ) ;
    public final void rule__TransitionMode__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3344:1: ( ( 'go' ) )
            // InternalArduinoML.g:3345:1: ( 'go' )
            {
            // InternalArduinoML.g:3345:1: ( 'go' )
            // InternalArduinoML.g:3346:2: 'go'
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
    // InternalArduinoML.g:3355:1: rule__TransitionMode__Group__2 : rule__TransitionMode__Group__2__Impl rule__TransitionMode__Group__3 ;
    public final void rule__TransitionMode__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3359:1: ( rule__TransitionMode__Group__2__Impl rule__TransitionMode__Group__3 )
            // InternalArduinoML.g:3360:2: rule__TransitionMode__Group__2__Impl rule__TransitionMode__Group__3
            {
            pushFollow(FOLLOW_12);
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
    // InternalArduinoML.g:3367:1: rule__TransitionMode__Group__2__Impl : ( 'to' ) ;
    public final void rule__TransitionMode__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3371:1: ( ( 'to' ) )
            // InternalArduinoML.g:3372:1: ( 'to' )
            {
            // InternalArduinoML.g:3372:1: ( 'to' )
            // InternalArduinoML.g:3373:2: 'to'
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
    // InternalArduinoML.g:3382:1: rule__TransitionMode__Group__3 : rule__TransitionMode__Group__3__Impl rule__TransitionMode__Group__4 ;
    public final void rule__TransitionMode__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3386:1: ( rule__TransitionMode__Group__3__Impl rule__TransitionMode__Group__4 )
            // InternalArduinoML.g:3387:2: rule__TransitionMode__Group__3__Impl rule__TransitionMode__Group__4
            {
            pushFollow(FOLLOW_3);
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
    // InternalArduinoML.g:3394:1: rule__TransitionMode__Group__3__Impl : ( 'mode' ) ;
    public final void rule__TransitionMode__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3398:1: ( ( 'mode' ) )
            // InternalArduinoML.g:3399:1: ( 'mode' )
            {
            // InternalArduinoML.g:3399:1: ( 'mode' )
            // InternalArduinoML.g:3400:2: 'mode'
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
    // InternalArduinoML.g:3409:1: rule__TransitionMode__Group__4 : rule__TransitionMode__Group__4__Impl ;
    public final void rule__TransitionMode__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3413:1: ( rule__TransitionMode__Group__4__Impl )
            // InternalArduinoML.g:3414:2: rule__TransitionMode__Group__4__Impl
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
    // InternalArduinoML.g:3420:1: rule__TransitionMode__Group__4__Impl : ( ( rule__TransitionMode__Next_modeAssignment_4 ) ) ;
    public final void rule__TransitionMode__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3424:1: ( ( ( rule__TransitionMode__Next_modeAssignment_4 ) ) )
            // InternalArduinoML.g:3425:1: ( ( rule__TransitionMode__Next_modeAssignment_4 ) )
            {
            // InternalArduinoML.g:3425:1: ( ( rule__TransitionMode__Next_modeAssignment_4 ) )
            // InternalArduinoML.g:3426:2: ( rule__TransitionMode__Next_modeAssignment_4 )
            {
             before(grammarAccess.getTransitionModeAccess().getNext_modeAssignment_4()); 
            // InternalArduinoML.g:3427:2: ( rule__TransitionMode__Next_modeAssignment_4 )
            // InternalArduinoML.g:3427:3: rule__TransitionMode__Next_modeAssignment_4
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
    // InternalArduinoML.g:3436:1: rule__TransitionMode__Group_0_0__0 : rule__TransitionMode__Group_0_0__0__Impl rule__TransitionMode__Group_0_0__1 ;
    public final void rule__TransitionMode__Group_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3440:1: ( rule__TransitionMode__Group_0_0__0__Impl rule__TransitionMode__Group_0_0__1 )
            // InternalArduinoML.g:3441:2: rule__TransitionMode__Group_0_0__0__Impl rule__TransitionMode__Group_0_0__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalArduinoML.g:3448:1: rule__TransitionMode__Group_0_0__0__Impl : ( 'when' ) ;
    public final void rule__TransitionMode__Group_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3452:1: ( ( 'when' ) )
            // InternalArduinoML.g:3453:1: ( 'when' )
            {
            // InternalArduinoML.g:3453:1: ( 'when' )
            // InternalArduinoML.g:3454:2: 'when'
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
    // InternalArduinoML.g:3463:1: rule__TransitionMode__Group_0_0__1 : rule__TransitionMode__Group_0_0__1__Impl rule__TransitionMode__Group_0_0__2 ;
    public final void rule__TransitionMode__Group_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3467:1: ( rule__TransitionMode__Group_0_0__1__Impl rule__TransitionMode__Group_0_0__2 )
            // InternalArduinoML.g:3468:2: rule__TransitionMode__Group_0_0__1__Impl rule__TransitionMode__Group_0_0__2
            {
            pushFollow(FOLLOW_28);
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
    // InternalArduinoML.g:3475:1: rule__TransitionMode__Group_0_0__1__Impl : ( ( rule__TransitionMode__Alternatives_0_0_1 ) ) ;
    public final void rule__TransitionMode__Group_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3479:1: ( ( ( rule__TransitionMode__Alternatives_0_0_1 ) ) )
            // InternalArduinoML.g:3480:1: ( ( rule__TransitionMode__Alternatives_0_0_1 ) )
            {
            // InternalArduinoML.g:3480:1: ( ( rule__TransitionMode__Alternatives_0_0_1 ) )
            // InternalArduinoML.g:3481:2: ( rule__TransitionMode__Alternatives_0_0_1 )
            {
             before(grammarAccess.getTransitionModeAccess().getAlternatives_0_0_1()); 
            // InternalArduinoML.g:3482:2: ( rule__TransitionMode__Alternatives_0_0_1 )
            // InternalArduinoML.g:3482:3: rule__TransitionMode__Alternatives_0_0_1
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
    // InternalArduinoML.g:3490:1: rule__TransitionMode__Group_0_0__2 : rule__TransitionMode__Group_0_0__2__Impl rule__TransitionMode__Group_0_0__3 ;
    public final void rule__TransitionMode__Group_0_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3494:1: ( rule__TransitionMode__Group_0_0__2__Impl rule__TransitionMode__Group_0_0__3 )
            // InternalArduinoML.g:3495:2: rule__TransitionMode__Group_0_0__2__Impl rule__TransitionMode__Group_0_0__3
            {
            pushFollow(FOLLOW_28);
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
    // InternalArduinoML.g:3502:1: rule__TransitionMode__Group_0_0__2__Impl : ( ( rule__TransitionMode__Group_0_0_2__0 )* ) ;
    public final void rule__TransitionMode__Group_0_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3506:1: ( ( ( rule__TransitionMode__Group_0_0_2__0 )* ) )
            // InternalArduinoML.g:3507:1: ( ( rule__TransitionMode__Group_0_0_2__0 )* )
            {
            // InternalArduinoML.g:3507:1: ( ( rule__TransitionMode__Group_0_0_2__0 )* )
            // InternalArduinoML.g:3508:2: ( rule__TransitionMode__Group_0_0_2__0 )*
            {
             before(grammarAccess.getTransitionModeAccess().getGroup_0_0_2()); 
            // InternalArduinoML.g:3509:2: ( rule__TransitionMode__Group_0_0_2__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==38) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalArduinoML.g:3509:3: rule__TransitionMode__Group_0_0_2__0
            	    {
            	    pushFollow(FOLLOW_29);
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
    // InternalArduinoML.g:3517:1: rule__TransitionMode__Group_0_0__3 : rule__TransitionMode__Group_0_0__3__Impl ;
    public final void rule__TransitionMode__Group_0_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3521:1: ( rule__TransitionMode__Group_0_0__3__Impl )
            // InternalArduinoML.g:3522:2: rule__TransitionMode__Group_0_0__3__Impl
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
    // InternalArduinoML.g:3528:1: rule__TransitionMode__Group_0_0__3__Impl : ( ( rule__TransitionMode__Group_0_0_3__0 )? ) ;
    public final void rule__TransitionMode__Group_0_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3532:1: ( ( ( rule__TransitionMode__Group_0_0_3__0 )? ) )
            // InternalArduinoML.g:3533:1: ( ( rule__TransitionMode__Group_0_0_3__0 )? )
            {
            // InternalArduinoML.g:3533:1: ( ( rule__TransitionMode__Group_0_0_3__0 )? )
            // InternalArduinoML.g:3534:2: ( rule__TransitionMode__Group_0_0_3__0 )?
            {
             before(grammarAccess.getTransitionModeAccess().getGroup_0_0_3()); 
            // InternalArduinoML.g:3535:2: ( rule__TransitionMode__Group_0_0_3__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==39) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalArduinoML.g:3535:3: rule__TransitionMode__Group_0_0_3__0
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
    // InternalArduinoML.g:3544:1: rule__TransitionMode__Group_0_0_1_0__0 : rule__TransitionMode__Group_0_0_1_0__0__Impl rule__TransitionMode__Group_0_0_1_0__1 ;
    public final void rule__TransitionMode__Group_0_0_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3548:1: ( rule__TransitionMode__Group_0_0_1_0__0__Impl rule__TransitionMode__Group_0_0_1_0__1 )
            // InternalArduinoML.g:3549:2: rule__TransitionMode__Group_0_0_1_0__0__Impl rule__TransitionMode__Group_0_0_1_0__1
            {
            pushFollow(FOLLOW_30);
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
    // InternalArduinoML.g:3556:1: rule__TransitionMode__Group_0_0_1_0__0__Impl : ( ( rule__TransitionMode__DigitalsAssignment_0_0_1_0_0 ) ) ;
    public final void rule__TransitionMode__Group_0_0_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3560:1: ( ( ( rule__TransitionMode__DigitalsAssignment_0_0_1_0_0 ) ) )
            // InternalArduinoML.g:3561:1: ( ( rule__TransitionMode__DigitalsAssignment_0_0_1_0_0 ) )
            {
            // InternalArduinoML.g:3561:1: ( ( rule__TransitionMode__DigitalsAssignment_0_0_1_0_0 ) )
            // InternalArduinoML.g:3562:2: ( rule__TransitionMode__DigitalsAssignment_0_0_1_0_0 )
            {
             before(grammarAccess.getTransitionModeAccess().getDigitalsAssignment_0_0_1_0_0()); 
            // InternalArduinoML.g:3563:2: ( rule__TransitionMode__DigitalsAssignment_0_0_1_0_0 )
            // InternalArduinoML.g:3563:3: rule__TransitionMode__DigitalsAssignment_0_0_1_0_0
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
    // InternalArduinoML.g:3571:1: rule__TransitionMode__Group_0_0_1_0__1 : rule__TransitionMode__Group_0_0_1_0__1__Impl rule__TransitionMode__Group_0_0_1_0__2 ;
    public final void rule__TransitionMode__Group_0_0_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3575:1: ( rule__TransitionMode__Group_0_0_1_0__1__Impl rule__TransitionMode__Group_0_0_1_0__2 )
            // InternalArduinoML.g:3576:2: rule__TransitionMode__Group_0_0_1_0__1__Impl rule__TransitionMode__Group_0_0_1_0__2
            {
            pushFollow(FOLLOW_26);
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
    // InternalArduinoML.g:3583:1: rule__TransitionMode__Group_0_0_1_0__1__Impl : ( 'is' ) ;
    public final void rule__TransitionMode__Group_0_0_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3587:1: ( ( 'is' ) )
            // InternalArduinoML.g:3588:1: ( 'is' )
            {
            // InternalArduinoML.g:3588:1: ( 'is' )
            // InternalArduinoML.g:3589:2: 'is'
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
    // InternalArduinoML.g:3598:1: rule__TransitionMode__Group_0_0_1_0__2 : rule__TransitionMode__Group_0_0_1_0__2__Impl ;
    public final void rule__TransitionMode__Group_0_0_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3602:1: ( rule__TransitionMode__Group_0_0_1_0__2__Impl )
            // InternalArduinoML.g:3603:2: rule__TransitionMode__Group_0_0_1_0__2__Impl
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
    // InternalArduinoML.g:3609:1: rule__TransitionMode__Group_0_0_1_0__2__Impl : ( ( rule__TransitionMode__D_valuesAssignment_0_0_1_0_2 ) ) ;
    public final void rule__TransitionMode__Group_0_0_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3613:1: ( ( ( rule__TransitionMode__D_valuesAssignment_0_0_1_0_2 ) ) )
            // InternalArduinoML.g:3614:1: ( ( rule__TransitionMode__D_valuesAssignment_0_0_1_0_2 ) )
            {
            // InternalArduinoML.g:3614:1: ( ( rule__TransitionMode__D_valuesAssignment_0_0_1_0_2 ) )
            // InternalArduinoML.g:3615:2: ( rule__TransitionMode__D_valuesAssignment_0_0_1_0_2 )
            {
             before(grammarAccess.getTransitionModeAccess().getD_valuesAssignment_0_0_1_0_2()); 
            // InternalArduinoML.g:3616:2: ( rule__TransitionMode__D_valuesAssignment_0_0_1_0_2 )
            // InternalArduinoML.g:3616:3: rule__TransitionMode__D_valuesAssignment_0_0_1_0_2
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
    // InternalArduinoML.g:3625:1: rule__TransitionMode__Group_0_0_1_1__0 : rule__TransitionMode__Group_0_0_1_1__0__Impl rule__TransitionMode__Group_0_0_1_1__1 ;
    public final void rule__TransitionMode__Group_0_0_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3629:1: ( rule__TransitionMode__Group_0_0_1_1__0__Impl rule__TransitionMode__Group_0_0_1_1__1 )
            // InternalArduinoML.g:3630:2: rule__TransitionMode__Group_0_0_1_1__0__Impl rule__TransitionMode__Group_0_0_1_1__1
            {
            pushFollow(FOLLOW_31);
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
    // InternalArduinoML.g:3637:1: rule__TransitionMode__Group_0_0_1_1__0__Impl : ( ( rule__TransitionMode__AnalogsAssignment_0_0_1_1_0 ) ) ;
    public final void rule__TransitionMode__Group_0_0_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3641:1: ( ( ( rule__TransitionMode__AnalogsAssignment_0_0_1_1_0 ) ) )
            // InternalArduinoML.g:3642:1: ( ( rule__TransitionMode__AnalogsAssignment_0_0_1_1_0 ) )
            {
            // InternalArduinoML.g:3642:1: ( ( rule__TransitionMode__AnalogsAssignment_0_0_1_1_0 ) )
            // InternalArduinoML.g:3643:2: ( rule__TransitionMode__AnalogsAssignment_0_0_1_1_0 )
            {
             before(grammarAccess.getTransitionModeAccess().getAnalogsAssignment_0_0_1_1_0()); 
            // InternalArduinoML.g:3644:2: ( rule__TransitionMode__AnalogsAssignment_0_0_1_1_0 )
            // InternalArduinoML.g:3644:3: rule__TransitionMode__AnalogsAssignment_0_0_1_1_0
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
    // InternalArduinoML.g:3652:1: rule__TransitionMode__Group_0_0_1_1__1 : rule__TransitionMode__Group_0_0_1_1__1__Impl rule__TransitionMode__Group_0_0_1_1__2 ;
    public final void rule__TransitionMode__Group_0_0_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3656:1: ( rule__TransitionMode__Group_0_0_1_1__1__Impl rule__TransitionMode__Group_0_0_1_1__2 )
            // InternalArduinoML.g:3657:2: rule__TransitionMode__Group_0_0_1_1__1__Impl rule__TransitionMode__Group_0_0_1_1__2
            {
            pushFollow(FOLLOW_14);
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
    // InternalArduinoML.g:3664:1: rule__TransitionMode__Group_0_0_1_1__1__Impl : ( ( rule__TransitionMode__CompAssignment_0_0_1_1_1 ) ) ;
    public final void rule__TransitionMode__Group_0_0_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3668:1: ( ( ( rule__TransitionMode__CompAssignment_0_0_1_1_1 ) ) )
            // InternalArduinoML.g:3669:1: ( ( rule__TransitionMode__CompAssignment_0_0_1_1_1 ) )
            {
            // InternalArduinoML.g:3669:1: ( ( rule__TransitionMode__CompAssignment_0_0_1_1_1 ) )
            // InternalArduinoML.g:3670:2: ( rule__TransitionMode__CompAssignment_0_0_1_1_1 )
            {
             before(grammarAccess.getTransitionModeAccess().getCompAssignment_0_0_1_1_1()); 
            // InternalArduinoML.g:3671:2: ( rule__TransitionMode__CompAssignment_0_0_1_1_1 )
            // InternalArduinoML.g:3671:3: rule__TransitionMode__CompAssignment_0_0_1_1_1
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
    // InternalArduinoML.g:3679:1: rule__TransitionMode__Group_0_0_1_1__2 : rule__TransitionMode__Group_0_0_1_1__2__Impl ;
    public final void rule__TransitionMode__Group_0_0_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3683:1: ( rule__TransitionMode__Group_0_0_1_1__2__Impl )
            // InternalArduinoML.g:3684:2: rule__TransitionMode__Group_0_0_1_1__2__Impl
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
    // InternalArduinoML.g:3690:1: rule__TransitionMode__Group_0_0_1_1__2__Impl : ( ( rule__TransitionMode__A_valuesAssignment_0_0_1_1_2 ) ) ;
    public final void rule__TransitionMode__Group_0_0_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3694:1: ( ( ( rule__TransitionMode__A_valuesAssignment_0_0_1_1_2 ) ) )
            // InternalArduinoML.g:3695:1: ( ( rule__TransitionMode__A_valuesAssignment_0_0_1_1_2 ) )
            {
            // InternalArduinoML.g:3695:1: ( ( rule__TransitionMode__A_valuesAssignment_0_0_1_1_2 ) )
            // InternalArduinoML.g:3696:2: ( rule__TransitionMode__A_valuesAssignment_0_0_1_1_2 )
            {
             before(grammarAccess.getTransitionModeAccess().getA_valuesAssignment_0_0_1_1_2()); 
            // InternalArduinoML.g:3697:2: ( rule__TransitionMode__A_valuesAssignment_0_0_1_1_2 )
            // InternalArduinoML.g:3697:3: rule__TransitionMode__A_valuesAssignment_0_0_1_1_2
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
    // InternalArduinoML.g:3706:1: rule__TransitionMode__Group_0_0_2__0 : rule__TransitionMode__Group_0_0_2__0__Impl rule__TransitionMode__Group_0_0_2__1 ;
    public final void rule__TransitionMode__Group_0_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3710:1: ( rule__TransitionMode__Group_0_0_2__0__Impl rule__TransitionMode__Group_0_0_2__1 )
            // InternalArduinoML.g:3711:2: rule__TransitionMode__Group_0_0_2__0__Impl rule__TransitionMode__Group_0_0_2__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalArduinoML.g:3718:1: rule__TransitionMode__Group_0_0_2__0__Impl : ( 'and' ) ;
    public final void rule__TransitionMode__Group_0_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3722:1: ( ( 'and' ) )
            // InternalArduinoML.g:3723:1: ( 'and' )
            {
            // InternalArduinoML.g:3723:1: ( 'and' )
            // InternalArduinoML.g:3724:2: 'and'
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
    // InternalArduinoML.g:3733:1: rule__TransitionMode__Group_0_0_2__1 : rule__TransitionMode__Group_0_0_2__1__Impl ;
    public final void rule__TransitionMode__Group_0_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3737:1: ( rule__TransitionMode__Group_0_0_2__1__Impl )
            // InternalArduinoML.g:3738:2: rule__TransitionMode__Group_0_0_2__1__Impl
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
    // InternalArduinoML.g:3744:1: rule__TransitionMode__Group_0_0_2__1__Impl : ( ( rule__TransitionMode__Alternatives_0_0_2_1 ) ) ;
    public final void rule__TransitionMode__Group_0_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3748:1: ( ( ( rule__TransitionMode__Alternatives_0_0_2_1 ) ) )
            // InternalArduinoML.g:3749:1: ( ( rule__TransitionMode__Alternatives_0_0_2_1 ) )
            {
            // InternalArduinoML.g:3749:1: ( ( rule__TransitionMode__Alternatives_0_0_2_1 ) )
            // InternalArduinoML.g:3750:2: ( rule__TransitionMode__Alternatives_0_0_2_1 )
            {
             before(grammarAccess.getTransitionModeAccess().getAlternatives_0_0_2_1()); 
            // InternalArduinoML.g:3751:2: ( rule__TransitionMode__Alternatives_0_0_2_1 )
            // InternalArduinoML.g:3751:3: rule__TransitionMode__Alternatives_0_0_2_1
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
    // InternalArduinoML.g:3760:1: rule__TransitionMode__Group_0_0_2_1_0__0 : rule__TransitionMode__Group_0_0_2_1_0__0__Impl rule__TransitionMode__Group_0_0_2_1_0__1 ;
    public final void rule__TransitionMode__Group_0_0_2_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3764:1: ( rule__TransitionMode__Group_0_0_2_1_0__0__Impl rule__TransitionMode__Group_0_0_2_1_0__1 )
            // InternalArduinoML.g:3765:2: rule__TransitionMode__Group_0_0_2_1_0__0__Impl rule__TransitionMode__Group_0_0_2_1_0__1
            {
            pushFollow(FOLLOW_30);
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
    // InternalArduinoML.g:3772:1: rule__TransitionMode__Group_0_0_2_1_0__0__Impl : ( ( rule__TransitionMode__DigitalsAssignment_0_0_2_1_0_0 ) ) ;
    public final void rule__TransitionMode__Group_0_0_2_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3776:1: ( ( ( rule__TransitionMode__DigitalsAssignment_0_0_2_1_0_0 ) ) )
            // InternalArduinoML.g:3777:1: ( ( rule__TransitionMode__DigitalsAssignment_0_0_2_1_0_0 ) )
            {
            // InternalArduinoML.g:3777:1: ( ( rule__TransitionMode__DigitalsAssignment_0_0_2_1_0_0 ) )
            // InternalArduinoML.g:3778:2: ( rule__TransitionMode__DigitalsAssignment_0_0_2_1_0_0 )
            {
             before(grammarAccess.getTransitionModeAccess().getDigitalsAssignment_0_0_2_1_0_0()); 
            // InternalArduinoML.g:3779:2: ( rule__TransitionMode__DigitalsAssignment_0_0_2_1_0_0 )
            // InternalArduinoML.g:3779:3: rule__TransitionMode__DigitalsAssignment_0_0_2_1_0_0
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
    // InternalArduinoML.g:3787:1: rule__TransitionMode__Group_0_0_2_1_0__1 : rule__TransitionMode__Group_0_0_2_1_0__1__Impl rule__TransitionMode__Group_0_0_2_1_0__2 ;
    public final void rule__TransitionMode__Group_0_0_2_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3791:1: ( rule__TransitionMode__Group_0_0_2_1_0__1__Impl rule__TransitionMode__Group_0_0_2_1_0__2 )
            // InternalArduinoML.g:3792:2: rule__TransitionMode__Group_0_0_2_1_0__1__Impl rule__TransitionMode__Group_0_0_2_1_0__2
            {
            pushFollow(FOLLOW_26);
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
    // InternalArduinoML.g:3799:1: rule__TransitionMode__Group_0_0_2_1_0__1__Impl : ( 'is' ) ;
    public final void rule__TransitionMode__Group_0_0_2_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3803:1: ( ( 'is' ) )
            // InternalArduinoML.g:3804:1: ( 'is' )
            {
            // InternalArduinoML.g:3804:1: ( 'is' )
            // InternalArduinoML.g:3805:2: 'is'
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
    // InternalArduinoML.g:3814:1: rule__TransitionMode__Group_0_0_2_1_0__2 : rule__TransitionMode__Group_0_0_2_1_0__2__Impl ;
    public final void rule__TransitionMode__Group_0_0_2_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3818:1: ( rule__TransitionMode__Group_0_0_2_1_0__2__Impl )
            // InternalArduinoML.g:3819:2: rule__TransitionMode__Group_0_0_2_1_0__2__Impl
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
    // InternalArduinoML.g:3825:1: rule__TransitionMode__Group_0_0_2_1_0__2__Impl : ( ( rule__TransitionMode__D_valuesAssignment_0_0_2_1_0_2 ) ) ;
    public final void rule__TransitionMode__Group_0_0_2_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3829:1: ( ( ( rule__TransitionMode__D_valuesAssignment_0_0_2_1_0_2 ) ) )
            // InternalArduinoML.g:3830:1: ( ( rule__TransitionMode__D_valuesAssignment_0_0_2_1_0_2 ) )
            {
            // InternalArduinoML.g:3830:1: ( ( rule__TransitionMode__D_valuesAssignment_0_0_2_1_0_2 ) )
            // InternalArduinoML.g:3831:2: ( rule__TransitionMode__D_valuesAssignment_0_0_2_1_0_2 )
            {
             before(grammarAccess.getTransitionModeAccess().getD_valuesAssignment_0_0_2_1_0_2()); 
            // InternalArduinoML.g:3832:2: ( rule__TransitionMode__D_valuesAssignment_0_0_2_1_0_2 )
            // InternalArduinoML.g:3832:3: rule__TransitionMode__D_valuesAssignment_0_0_2_1_0_2
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
    // InternalArduinoML.g:3841:1: rule__TransitionMode__Group_0_0_2_1_1__0 : rule__TransitionMode__Group_0_0_2_1_1__0__Impl rule__TransitionMode__Group_0_0_2_1_1__1 ;
    public final void rule__TransitionMode__Group_0_0_2_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3845:1: ( rule__TransitionMode__Group_0_0_2_1_1__0__Impl rule__TransitionMode__Group_0_0_2_1_1__1 )
            // InternalArduinoML.g:3846:2: rule__TransitionMode__Group_0_0_2_1_1__0__Impl rule__TransitionMode__Group_0_0_2_1_1__1
            {
            pushFollow(FOLLOW_31);
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
    // InternalArduinoML.g:3853:1: rule__TransitionMode__Group_0_0_2_1_1__0__Impl : ( ( rule__TransitionMode__AnalogsAssignment_0_0_2_1_1_0 ) ) ;
    public final void rule__TransitionMode__Group_0_0_2_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3857:1: ( ( ( rule__TransitionMode__AnalogsAssignment_0_0_2_1_1_0 ) ) )
            // InternalArduinoML.g:3858:1: ( ( rule__TransitionMode__AnalogsAssignment_0_0_2_1_1_0 ) )
            {
            // InternalArduinoML.g:3858:1: ( ( rule__TransitionMode__AnalogsAssignment_0_0_2_1_1_0 ) )
            // InternalArduinoML.g:3859:2: ( rule__TransitionMode__AnalogsAssignment_0_0_2_1_1_0 )
            {
             before(grammarAccess.getTransitionModeAccess().getAnalogsAssignment_0_0_2_1_1_0()); 
            // InternalArduinoML.g:3860:2: ( rule__TransitionMode__AnalogsAssignment_0_0_2_1_1_0 )
            // InternalArduinoML.g:3860:3: rule__TransitionMode__AnalogsAssignment_0_0_2_1_1_0
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
    // InternalArduinoML.g:3868:1: rule__TransitionMode__Group_0_0_2_1_1__1 : rule__TransitionMode__Group_0_0_2_1_1__1__Impl rule__TransitionMode__Group_0_0_2_1_1__2 ;
    public final void rule__TransitionMode__Group_0_0_2_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3872:1: ( rule__TransitionMode__Group_0_0_2_1_1__1__Impl rule__TransitionMode__Group_0_0_2_1_1__2 )
            // InternalArduinoML.g:3873:2: rule__TransitionMode__Group_0_0_2_1_1__1__Impl rule__TransitionMode__Group_0_0_2_1_1__2
            {
            pushFollow(FOLLOW_14);
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
    // InternalArduinoML.g:3880:1: rule__TransitionMode__Group_0_0_2_1_1__1__Impl : ( ( rule__TransitionMode__CompAssignment_0_0_2_1_1_1 ) ) ;
    public final void rule__TransitionMode__Group_0_0_2_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3884:1: ( ( ( rule__TransitionMode__CompAssignment_0_0_2_1_1_1 ) ) )
            // InternalArduinoML.g:3885:1: ( ( rule__TransitionMode__CompAssignment_0_0_2_1_1_1 ) )
            {
            // InternalArduinoML.g:3885:1: ( ( rule__TransitionMode__CompAssignment_0_0_2_1_1_1 ) )
            // InternalArduinoML.g:3886:2: ( rule__TransitionMode__CompAssignment_0_0_2_1_1_1 )
            {
             before(grammarAccess.getTransitionModeAccess().getCompAssignment_0_0_2_1_1_1()); 
            // InternalArduinoML.g:3887:2: ( rule__TransitionMode__CompAssignment_0_0_2_1_1_1 )
            // InternalArduinoML.g:3887:3: rule__TransitionMode__CompAssignment_0_0_2_1_1_1
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
    // InternalArduinoML.g:3895:1: rule__TransitionMode__Group_0_0_2_1_1__2 : rule__TransitionMode__Group_0_0_2_1_1__2__Impl ;
    public final void rule__TransitionMode__Group_0_0_2_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3899:1: ( rule__TransitionMode__Group_0_0_2_1_1__2__Impl )
            // InternalArduinoML.g:3900:2: rule__TransitionMode__Group_0_0_2_1_1__2__Impl
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
    // InternalArduinoML.g:3906:1: rule__TransitionMode__Group_0_0_2_1_1__2__Impl : ( ( rule__TransitionMode__A_valuesAssignment_0_0_2_1_1_2 ) ) ;
    public final void rule__TransitionMode__Group_0_0_2_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3910:1: ( ( ( rule__TransitionMode__A_valuesAssignment_0_0_2_1_1_2 ) ) )
            // InternalArduinoML.g:3911:1: ( ( rule__TransitionMode__A_valuesAssignment_0_0_2_1_1_2 ) )
            {
            // InternalArduinoML.g:3911:1: ( ( rule__TransitionMode__A_valuesAssignment_0_0_2_1_1_2 ) )
            // InternalArduinoML.g:3912:2: ( rule__TransitionMode__A_valuesAssignment_0_0_2_1_1_2 )
            {
             before(grammarAccess.getTransitionModeAccess().getA_valuesAssignment_0_0_2_1_1_2()); 
            // InternalArduinoML.g:3913:2: ( rule__TransitionMode__A_valuesAssignment_0_0_2_1_1_2 )
            // InternalArduinoML.g:3913:3: rule__TransitionMode__A_valuesAssignment_0_0_2_1_1_2
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
    // InternalArduinoML.g:3922:1: rule__TransitionMode__Group_0_0_3__0 : rule__TransitionMode__Group_0_0_3__0__Impl rule__TransitionMode__Group_0_0_3__1 ;
    public final void rule__TransitionMode__Group_0_0_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3926:1: ( rule__TransitionMode__Group_0_0_3__0__Impl rule__TransitionMode__Group_0_0_3__1 )
            // InternalArduinoML.g:3927:2: rule__TransitionMode__Group_0_0_3__0__Impl rule__TransitionMode__Group_0_0_3__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalArduinoML.g:3934:1: rule__TransitionMode__Group_0_0_3__0__Impl : ( 'wait' ) ;
    public final void rule__TransitionMode__Group_0_0_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3938:1: ( ( 'wait' ) )
            // InternalArduinoML.g:3939:1: ( 'wait' )
            {
            // InternalArduinoML.g:3939:1: ( 'wait' )
            // InternalArduinoML.g:3940:2: 'wait'
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
    // InternalArduinoML.g:3949:1: rule__TransitionMode__Group_0_0_3__1 : rule__TransitionMode__Group_0_0_3__1__Impl rule__TransitionMode__Group_0_0_3__2 ;
    public final void rule__TransitionMode__Group_0_0_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3953:1: ( rule__TransitionMode__Group_0_0_3__1__Impl rule__TransitionMode__Group_0_0_3__2 )
            // InternalArduinoML.g:3954:2: rule__TransitionMode__Group_0_0_3__1__Impl rule__TransitionMode__Group_0_0_3__2
            {
            pushFollow(FOLLOW_32);
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
    // InternalArduinoML.g:3961:1: rule__TransitionMode__Group_0_0_3__1__Impl : ( ( rule__TransitionMode__TimeAssignment_0_0_3_1 ) ) ;
    public final void rule__TransitionMode__Group_0_0_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3965:1: ( ( ( rule__TransitionMode__TimeAssignment_0_0_3_1 ) ) )
            // InternalArduinoML.g:3966:1: ( ( rule__TransitionMode__TimeAssignment_0_0_3_1 ) )
            {
            // InternalArduinoML.g:3966:1: ( ( rule__TransitionMode__TimeAssignment_0_0_3_1 ) )
            // InternalArduinoML.g:3967:2: ( rule__TransitionMode__TimeAssignment_0_0_3_1 )
            {
             before(grammarAccess.getTransitionModeAccess().getTimeAssignment_0_0_3_1()); 
            // InternalArduinoML.g:3968:2: ( rule__TransitionMode__TimeAssignment_0_0_3_1 )
            // InternalArduinoML.g:3968:3: rule__TransitionMode__TimeAssignment_0_0_3_1
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
    // InternalArduinoML.g:3976:1: rule__TransitionMode__Group_0_0_3__2 : rule__TransitionMode__Group_0_0_3__2__Impl rule__TransitionMode__Group_0_0_3__3 ;
    public final void rule__TransitionMode__Group_0_0_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3980:1: ( rule__TransitionMode__Group_0_0_3__2__Impl rule__TransitionMode__Group_0_0_3__3 )
            // InternalArduinoML.g:3981:2: rule__TransitionMode__Group_0_0_3__2__Impl rule__TransitionMode__Group_0_0_3__3
            {
            pushFollow(FOLLOW_33);
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
    // InternalArduinoML.g:3988:1: rule__TransitionMode__Group_0_0_3__2__Impl : ( ( rule__TransitionMode__UnitAssignment_0_0_3_2 ) ) ;
    public final void rule__TransitionMode__Group_0_0_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3992:1: ( ( ( rule__TransitionMode__UnitAssignment_0_0_3_2 ) ) )
            // InternalArduinoML.g:3993:1: ( ( rule__TransitionMode__UnitAssignment_0_0_3_2 ) )
            {
            // InternalArduinoML.g:3993:1: ( ( rule__TransitionMode__UnitAssignment_0_0_3_2 ) )
            // InternalArduinoML.g:3994:2: ( rule__TransitionMode__UnitAssignment_0_0_3_2 )
            {
             before(grammarAccess.getTransitionModeAccess().getUnitAssignment_0_0_3_2()); 
            // InternalArduinoML.g:3995:2: ( rule__TransitionMode__UnitAssignment_0_0_3_2 )
            // InternalArduinoML.g:3995:3: rule__TransitionMode__UnitAssignment_0_0_3_2
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
    // InternalArduinoML.g:4003:1: rule__TransitionMode__Group_0_0_3__3 : rule__TransitionMode__Group_0_0_3__3__Impl ;
    public final void rule__TransitionMode__Group_0_0_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:4007:1: ( rule__TransitionMode__Group_0_0_3__3__Impl )
            // InternalArduinoML.g:4008:2: rule__TransitionMode__Group_0_0_3__3__Impl
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
    // InternalArduinoML.g:4014:1: rule__TransitionMode__Group_0_0_3__3__Impl : ( 'then' ) ;
    public final void rule__TransitionMode__Group_0_0_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:4018:1: ( ( 'then' ) )
            // InternalArduinoML.g:4019:1: ( 'then' )
            {
            // InternalArduinoML.g:4019:1: ( 'then' )
            // InternalArduinoML.g:4020:2: 'then'
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
    // InternalArduinoML.g:4030:1: rule__TransitionMode__Group_0_1__0 : rule__TransitionMode__Group_0_1__0__Impl rule__TransitionMode__Group_0_1__1 ;
    public final void rule__TransitionMode__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:4034:1: ( rule__TransitionMode__Group_0_1__0__Impl rule__TransitionMode__Group_0_1__1 )
            // InternalArduinoML.g:4035:2: rule__TransitionMode__Group_0_1__0__Impl rule__TransitionMode__Group_0_1__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalArduinoML.g:4042:1: rule__TransitionMode__Group_0_1__0__Impl : ( 'wait' ) ;
    public final void rule__TransitionMode__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:4046:1: ( ( 'wait' ) )
            // InternalArduinoML.g:4047:1: ( 'wait' )
            {
            // InternalArduinoML.g:4047:1: ( 'wait' )
            // InternalArduinoML.g:4048:2: 'wait'
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
    // InternalArduinoML.g:4057:1: rule__TransitionMode__Group_0_1__1 : rule__TransitionMode__Group_0_1__1__Impl rule__TransitionMode__Group_0_1__2 ;
    public final void rule__TransitionMode__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:4061:1: ( rule__TransitionMode__Group_0_1__1__Impl rule__TransitionMode__Group_0_1__2 )
            // InternalArduinoML.g:4062:2: rule__TransitionMode__Group_0_1__1__Impl rule__TransitionMode__Group_0_1__2
            {
            pushFollow(FOLLOW_32);
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
    // InternalArduinoML.g:4069:1: rule__TransitionMode__Group_0_1__1__Impl : ( ( rule__TransitionMode__TimeAssignment_0_1_1 ) ) ;
    public final void rule__TransitionMode__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:4073:1: ( ( ( rule__TransitionMode__TimeAssignment_0_1_1 ) ) )
            // InternalArduinoML.g:4074:1: ( ( rule__TransitionMode__TimeAssignment_0_1_1 ) )
            {
            // InternalArduinoML.g:4074:1: ( ( rule__TransitionMode__TimeAssignment_0_1_1 ) )
            // InternalArduinoML.g:4075:2: ( rule__TransitionMode__TimeAssignment_0_1_1 )
            {
             before(grammarAccess.getTransitionModeAccess().getTimeAssignment_0_1_1()); 
            // InternalArduinoML.g:4076:2: ( rule__TransitionMode__TimeAssignment_0_1_1 )
            // InternalArduinoML.g:4076:3: rule__TransitionMode__TimeAssignment_0_1_1
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
    // InternalArduinoML.g:4084:1: rule__TransitionMode__Group_0_1__2 : rule__TransitionMode__Group_0_1__2__Impl rule__TransitionMode__Group_0_1__3 ;
    public final void rule__TransitionMode__Group_0_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:4088:1: ( rule__TransitionMode__Group_0_1__2__Impl rule__TransitionMode__Group_0_1__3 )
            // InternalArduinoML.g:4089:2: rule__TransitionMode__Group_0_1__2__Impl rule__TransitionMode__Group_0_1__3
            {
            pushFollow(FOLLOW_33);
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
    // InternalArduinoML.g:4096:1: rule__TransitionMode__Group_0_1__2__Impl : ( ( rule__TransitionMode__UnitAssignment_0_1_2 ) ) ;
    public final void rule__TransitionMode__Group_0_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:4100:1: ( ( ( rule__TransitionMode__UnitAssignment_0_1_2 ) ) )
            // InternalArduinoML.g:4101:1: ( ( rule__TransitionMode__UnitAssignment_0_1_2 ) )
            {
            // InternalArduinoML.g:4101:1: ( ( rule__TransitionMode__UnitAssignment_0_1_2 ) )
            // InternalArduinoML.g:4102:2: ( rule__TransitionMode__UnitAssignment_0_1_2 )
            {
             before(grammarAccess.getTransitionModeAccess().getUnitAssignment_0_1_2()); 
            // InternalArduinoML.g:4103:2: ( rule__TransitionMode__UnitAssignment_0_1_2 )
            // InternalArduinoML.g:4103:3: rule__TransitionMode__UnitAssignment_0_1_2
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
    // InternalArduinoML.g:4111:1: rule__TransitionMode__Group_0_1__3 : rule__TransitionMode__Group_0_1__3__Impl ;
    public final void rule__TransitionMode__Group_0_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:4115:1: ( rule__TransitionMode__Group_0_1__3__Impl )
            // InternalArduinoML.g:4116:2: rule__TransitionMode__Group_0_1__3__Impl
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
    // InternalArduinoML.g:4122:1: rule__TransitionMode__Group_0_1__3__Impl : ( 'then' ) ;
    public final void rule__TransitionMode__Group_0_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:4126:1: ( ( 'then' ) )
            // InternalArduinoML.g:4127:1: ( 'then' )
            {
            // InternalArduinoML.g:4127:1: ( 'then' )
            // InternalArduinoML.g:4128:2: 'then'
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


    // $ANTLR start "rule__App__NameAssignment_0_1"
    // InternalArduinoML.g:4138:1: rule__App__NameAssignment_0_1 : ( ruleEString ) ;
    public final void rule__App__NameAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:4142:1: ( ( ruleEString ) )
            // InternalArduinoML.g:4143:2: ( ruleEString )
            {
            // InternalArduinoML.g:4143:2: ( ruleEString )
            // InternalArduinoML.g:4144:3: ruleEString
            {
             before(grammarAccess.getAppAccess().getNameEStringParserRuleCall_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAppAccess().getNameEStringParserRuleCall_0_1_0()); 

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
    // $ANTLR end "rule__App__NameAssignment_0_1"


    // $ANTLR start "rule__App__Initial_stateAssignment_0_4"
    // InternalArduinoML.g:4153:1: rule__App__Initial_stateAssignment_0_4 : ( ( ruleEString ) ) ;
    public final void rule__App__Initial_stateAssignment_0_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:4157:1: ( ( ( ruleEString ) ) )
            // InternalArduinoML.g:4158:2: ( ( ruleEString ) )
            {
            // InternalArduinoML.g:4158:2: ( ( ruleEString ) )
            // InternalArduinoML.g:4159:3: ( ruleEString )
            {
             before(grammarAccess.getAppAccess().getInitial_stateStateCrossReference_0_4_0()); 
            // InternalArduinoML.g:4160:3: ( ruleEString )
            // InternalArduinoML.g:4161:4: ruleEString
            {
             before(grammarAccess.getAppAccess().getInitial_stateStateEStringParserRuleCall_0_4_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAppAccess().getInitial_stateStateEStringParserRuleCall_0_4_0_1()); 

            }

             after(grammarAccess.getAppAccess().getInitial_stateStateCrossReference_0_4_0()); 

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
    // $ANTLR end "rule__App__Initial_stateAssignment_0_4"


    // $ANTLR start "rule__App__BricksAssignment_0_8"
    // InternalArduinoML.g:4172:1: rule__App__BricksAssignment_0_8 : ( ruleBrick ) ;
    public final void rule__App__BricksAssignment_0_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:4176:1: ( ( ruleBrick ) )
            // InternalArduinoML.g:4177:2: ( ruleBrick )
            {
            // InternalArduinoML.g:4177:2: ( ruleBrick )
            // InternalArduinoML.g:4178:3: ruleBrick
            {
             before(grammarAccess.getAppAccess().getBricksBrickParserRuleCall_0_8_0()); 
            pushFollow(FOLLOW_2);
            ruleBrick();

            state._fsp--;

             after(grammarAccess.getAppAccess().getBricksBrickParserRuleCall_0_8_0()); 

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
    // $ANTLR end "rule__App__BricksAssignment_0_8"


    // $ANTLR start "rule__App__BricksAssignment_0_9"
    // InternalArduinoML.g:4187:1: rule__App__BricksAssignment_0_9 : ( ruleBrick ) ;
    public final void rule__App__BricksAssignment_0_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:4191:1: ( ( ruleBrick ) )
            // InternalArduinoML.g:4192:2: ( ruleBrick )
            {
            // InternalArduinoML.g:4192:2: ( ruleBrick )
            // InternalArduinoML.g:4193:3: ruleBrick
            {
             before(grammarAccess.getAppAccess().getBricksBrickParserRuleCall_0_9_0()); 
            pushFollow(FOLLOW_2);
            ruleBrick();

            state._fsp--;

             after(grammarAccess.getAppAccess().getBricksBrickParserRuleCall_0_9_0()); 

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
    // $ANTLR end "rule__App__BricksAssignment_0_9"


    // $ANTLR start "rule__App__StatesAssignment_0_12"
    // InternalArduinoML.g:4202:1: rule__App__StatesAssignment_0_12 : ( ruleState ) ;
    public final void rule__App__StatesAssignment_0_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:4206:1: ( ( ruleState ) )
            // InternalArduinoML.g:4207:2: ( ruleState )
            {
            // InternalArduinoML.g:4207:2: ( ruleState )
            // InternalArduinoML.g:4208:3: ruleState
            {
             before(grammarAccess.getAppAccess().getStatesStateParserRuleCall_0_12_0()); 
            pushFollow(FOLLOW_2);
            ruleState();

            state._fsp--;

             after(grammarAccess.getAppAccess().getStatesStateParserRuleCall_0_12_0()); 

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
    // $ANTLR end "rule__App__StatesAssignment_0_12"


    // $ANTLR start "rule__App__StatesAssignment_0_13"
    // InternalArduinoML.g:4217:1: rule__App__StatesAssignment_0_13 : ( ruleState ) ;
    public final void rule__App__StatesAssignment_0_13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:4221:1: ( ( ruleState ) )
            // InternalArduinoML.g:4222:2: ( ruleState )
            {
            // InternalArduinoML.g:4222:2: ( ruleState )
            // InternalArduinoML.g:4223:3: ruleState
            {
             before(grammarAccess.getAppAccess().getStatesStateParserRuleCall_0_13_0()); 
            pushFollow(FOLLOW_2);
            ruleState();

            state._fsp--;

             after(grammarAccess.getAppAccess().getStatesStateParserRuleCall_0_13_0()); 

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
    // $ANTLR end "rule__App__StatesAssignment_0_13"


    // $ANTLR start "rule__App__NameAssignment_1_1"
    // InternalArduinoML.g:4232:1: rule__App__NameAssignment_1_1 : ( ruleEString ) ;
    public final void rule__App__NameAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:4236:1: ( ( ruleEString ) )
            // InternalArduinoML.g:4237:2: ( ruleEString )
            {
            // InternalArduinoML.g:4237:2: ( ruleEString )
            // InternalArduinoML.g:4238:3: ruleEString
            {
             before(grammarAccess.getAppAccess().getNameEStringParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAppAccess().getNameEStringParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__App__NameAssignment_1_1"


    // $ANTLR start "rule__App__Initial_modeAssignment_1_4"
    // InternalArduinoML.g:4247:1: rule__App__Initial_modeAssignment_1_4 : ( ( ruleEString ) ) ;
    public final void rule__App__Initial_modeAssignment_1_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:4251:1: ( ( ( ruleEString ) ) )
            // InternalArduinoML.g:4252:2: ( ( ruleEString ) )
            {
            // InternalArduinoML.g:4252:2: ( ( ruleEString ) )
            // InternalArduinoML.g:4253:3: ( ruleEString )
            {
             before(grammarAccess.getAppAccess().getInitial_modeModeCrossReference_1_4_0()); 
            // InternalArduinoML.g:4254:3: ( ruleEString )
            // InternalArduinoML.g:4255:4: ruleEString
            {
             before(grammarAccess.getAppAccess().getInitial_modeModeEStringParserRuleCall_1_4_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAppAccess().getInitial_modeModeEStringParserRuleCall_1_4_0_1()); 

            }

             after(grammarAccess.getAppAccess().getInitial_modeModeCrossReference_1_4_0()); 

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
    // $ANTLR end "rule__App__Initial_modeAssignment_1_4"


    // $ANTLR start "rule__App__BricksAssignment_1_8"
    // InternalArduinoML.g:4266:1: rule__App__BricksAssignment_1_8 : ( ruleBrick ) ;
    public final void rule__App__BricksAssignment_1_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:4270:1: ( ( ruleBrick ) )
            // InternalArduinoML.g:4271:2: ( ruleBrick )
            {
            // InternalArduinoML.g:4271:2: ( ruleBrick )
            // InternalArduinoML.g:4272:3: ruleBrick
            {
             before(grammarAccess.getAppAccess().getBricksBrickParserRuleCall_1_8_0()); 
            pushFollow(FOLLOW_2);
            ruleBrick();

            state._fsp--;

             after(grammarAccess.getAppAccess().getBricksBrickParserRuleCall_1_8_0()); 

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
    // $ANTLR end "rule__App__BricksAssignment_1_8"


    // $ANTLR start "rule__App__BricksAssignment_1_9"
    // InternalArduinoML.g:4281:1: rule__App__BricksAssignment_1_9 : ( ruleBrick ) ;
    public final void rule__App__BricksAssignment_1_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:4285:1: ( ( ruleBrick ) )
            // InternalArduinoML.g:4286:2: ( ruleBrick )
            {
            // InternalArduinoML.g:4286:2: ( ruleBrick )
            // InternalArduinoML.g:4287:3: ruleBrick
            {
             before(grammarAccess.getAppAccess().getBricksBrickParserRuleCall_1_9_0()); 
            pushFollow(FOLLOW_2);
            ruleBrick();

            state._fsp--;

             after(grammarAccess.getAppAccess().getBricksBrickParserRuleCall_1_9_0()); 

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
    // $ANTLR end "rule__App__BricksAssignment_1_9"


    // $ANTLR start "rule__App__ModesAssignment_1_12"
    // InternalArduinoML.g:4296:1: rule__App__ModesAssignment_1_12 : ( ruleMode ) ;
    public final void rule__App__ModesAssignment_1_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:4300:1: ( ( ruleMode ) )
            // InternalArduinoML.g:4301:2: ( ruleMode )
            {
            // InternalArduinoML.g:4301:2: ( ruleMode )
            // InternalArduinoML.g:4302:3: ruleMode
            {
             before(grammarAccess.getAppAccess().getModesModeParserRuleCall_1_12_0()); 
            pushFollow(FOLLOW_2);
            ruleMode();

            state._fsp--;

             after(grammarAccess.getAppAccess().getModesModeParserRuleCall_1_12_0()); 

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
    // $ANTLR end "rule__App__ModesAssignment_1_12"


    // $ANTLR start "rule__App__ModesAssignment_1_13"
    // InternalArduinoML.g:4311:1: rule__App__ModesAssignment_1_13 : ( ruleMode ) ;
    public final void rule__App__ModesAssignment_1_13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:4315:1: ( ( ruleMode ) )
            // InternalArduinoML.g:4316:2: ( ruleMode )
            {
            // InternalArduinoML.g:4316:2: ( ruleMode )
            // InternalArduinoML.g:4317:3: ruleMode
            {
             before(grammarAccess.getAppAccess().getModesModeParserRuleCall_1_13_0()); 
            pushFollow(FOLLOW_2);
            ruleMode();

            state._fsp--;

             after(grammarAccess.getAppAccess().getModesModeParserRuleCall_1_13_0()); 

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
    // $ANTLR end "rule__App__ModesAssignment_1_13"


    // $ANTLR start "rule__Brick__NameAssignment_1"
    // InternalArduinoML.g:4326:1: rule__Brick__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Brick__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:4330:1: ( ( ruleEString ) )
            // InternalArduinoML.g:4331:2: ( ruleEString )
            {
            // InternalArduinoML.g:4331:2: ( ruleEString )
            // InternalArduinoML.g:4332:3: ruleEString
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
    // InternalArduinoML.g:4341:1: rule__Brick__PinAssignment_3 : ( ruleEInt ) ;
    public final void rule__Brick__PinAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:4345:1: ( ( ruleEInt ) )
            // InternalArduinoML.g:4346:2: ( ruleEInt )
            {
            // InternalArduinoML.g:4346:2: ( ruleEInt )
            // InternalArduinoML.g:4347:3: ruleEInt
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
    // InternalArduinoML.g:4356:1: rule__Mode__NameAssignment_0 : ( ruleEString ) ;
    public final void rule__Mode__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:4360:1: ( ( ruleEString ) )
            // InternalArduinoML.g:4361:2: ( ruleEString )
            {
            // InternalArduinoML.g:4361:2: ( ruleEString )
            // InternalArduinoML.g:4362:3: ruleEString
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
    // InternalArduinoML.g:4371:1: rule__Mode__InitialAssignment_3 : ( ( ruleEString ) ) ;
    public final void rule__Mode__InitialAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:4375:1: ( ( ( ruleEString ) ) )
            // InternalArduinoML.g:4376:2: ( ( ruleEString ) )
            {
            // InternalArduinoML.g:4376:2: ( ( ruleEString ) )
            // InternalArduinoML.g:4377:3: ( ruleEString )
            {
             before(grammarAccess.getModeAccess().getInitialStateCrossReference_3_0()); 
            // InternalArduinoML.g:4378:3: ( ruleEString )
            // InternalArduinoML.g:4379:4: ruleEString
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
    // InternalArduinoML.g:4390:1: rule__Mode__BricksAssignment_5_2 : ( ruleBrick ) ;
    public final void rule__Mode__BricksAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:4394:1: ( ( ruleBrick ) )
            // InternalArduinoML.g:4395:2: ( ruleBrick )
            {
            // InternalArduinoML.g:4395:2: ( ruleBrick )
            // InternalArduinoML.g:4396:3: ruleBrick
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
    // InternalArduinoML.g:4405:1: rule__Mode__BricksAssignment_5_3 : ( ruleBrick ) ;
    public final void rule__Mode__BricksAssignment_5_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:4409:1: ( ( ruleBrick ) )
            // InternalArduinoML.g:4410:2: ( ruleBrick )
            {
            // InternalArduinoML.g:4410:2: ( ruleBrick )
            // InternalArduinoML.g:4411:3: ruleBrick
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
    // InternalArduinoML.g:4420:1: rule__Mode__StatesAssignment_8 : ( ruleState ) ;
    public final void rule__Mode__StatesAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:4424:1: ( ( ruleState ) )
            // InternalArduinoML.g:4425:2: ( ruleState )
            {
            // InternalArduinoML.g:4425:2: ( ruleState )
            // InternalArduinoML.g:4426:3: ruleState
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
    // InternalArduinoML.g:4435:1: rule__Mode__StatesAssignment_9 : ( ruleState ) ;
    public final void rule__Mode__StatesAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:4439:1: ( ( ruleState ) )
            // InternalArduinoML.g:4440:2: ( ruleState )
            {
            // InternalArduinoML.g:4440:2: ( ruleState )
            // InternalArduinoML.g:4441:3: ruleState
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
    // InternalArduinoML.g:4450:1: rule__Mode__Transitions_modeAssignment_12 : ( ruleTransitionMode ) ;
    public final void rule__Mode__Transitions_modeAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:4454:1: ( ( ruleTransitionMode ) )
            // InternalArduinoML.g:4455:2: ( ruleTransitionMode )
            {
            // InternalArduinoML.g:4455:2: ( ruleTransitionMode )
            // InternalArduinoML.g:4456:3: ruleTransitionMode
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
    // InternalArduinoML.g:4465:1: rule__Mode__Transitions_modeAssignment_13 : ( ruleTransitionMode ) ;
    public final void rule__Mode__Transitions_modeAssignment_13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:4469:1: ( ( ruleTransitionMode ) )
            // InternalArduinoML.g:4470:2: ( ruleTransitionMode )
            {
            // InternalArduinoML.g:4470:2: ( ruleTransitionMode )
            // InternalArduinoML.g:4471:3: ruleTransitionMode
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
    // InternalArduinoML.g:4480:1: rule__State__NameAssignment_0 : ( ruleEString ) ;
    public final void rule__State__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:4484:1: ( ( ruleEString ) )
            // InternalArduinoML.g:4485:2: ( ruleEString )
            {
            // InternalArduinoML.g:4485:2: ( ruleEString )
            // InternalArduinoML.g:4486:3: ruleEString
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
    // InternalArduinoML.g:4495:1: rule__State__ActionsAssignment_2 : ( ruleAction ) ;
    public final void rule__State__ActionsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:4499:1: ( ( ruleAction ) )
            // InternalArduinoML.g:4500:2: ( ruleAction )
            {
            // InternalArduinoML.g:4500:2: ( ruleAction )
            // InternalArduinoML.g:4501:3: ruleAction
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
    // InternalArduinoML.g:4510:1: rule__State__ActionsAssignment_3 : ( ruleAction ) ;
    public final void rule__State__ActionsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:4514:1: ( ( ruleAction ) )
            // InternalArduinoML.g:4515:2: ( ruleAction )
            {
            // InternalArduinoML.g:4515:2: ( ruleAction )
            // InternalArduinoML.g:4516:3: ruleAction
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
    // InternalArduinoML.g:4525:1: rule__State__Transitions_stateAssignment_4 : ( ruleTransitionState ) ;
    public final void rule__State__Transitions_stateAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:4529:1: ( ( ruleTransitionState ) )
            // InternalArduinoML.g:4530:2: ( ruleTransitionState )
            {
            // InternalArduinoML.g:4530:2: ( ruleTransitionState )
            // InternalArduinoML.g:4531:3: ruleTransitionState
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
    // InternalArduinoML.g:4540:1: rule__State__Transitions_stateAssignment_5 : ( ruleTransitionState ) ;
    public final void rule__State__Transitions_stateAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:4544:1: ( ( ruleTransitionState ) )
            // InternalArduinoML.g:4545:2: ( ruleTransitionState )
            {
            // InternalArduinoML.g:4545:2: ( ruleTransitionState )
            // InternalArduinoML.g:4546:3: ruleTransitionState
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
    // InternalArduinoML.g:4555:1: rule__Action__ActuatorAssignment_1 : ( ( ruleEString ) ) ;
    public final void rule__Action__ActuatorAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:4559:1: ( ( ( ruleEString ) ) )
            // InternalArduinoML.g:4560:2: ( ( ruleEString ) )
            {
            // InternalArduinoML.g:4560:2: ( ( ruleEString ) )
            // InternalArduinoML.g:4561:3: ( ruleEString )
            {
             before(grammarAccess.getActionAccess().getActuatorActuatorCrossReference_1_0()); 
            // InternalArduinoML.g:4562:3: ( ruleEString )
            // InternalArduinoML.g:4563:4: ruleEString
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
    // InternalArduinoML.g:4574:1: rule__Action__ValueAssignment_3 : ( ruleSignal ) ;
    public final void rule__Action__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:4578:1: ( ( ruleSignal ) )
            // InternalArduinoML.g:4579:2: ( ruleSignal )
            {
            // InternalArduinoML.g:4579:2: ( ruleSignal )
            // InternalArduinoML.g:4580:3: ruleSignal
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
    // InternalArduinoML.g:4589:1: rule__TransitionState__DigitalsAssignment_0_0_1_0_0 : ( ( ruleEString ) ) ;
    public final void rule__TransitionState__DigitalsAssignment_0_0_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:4593:1: ( ( ( ruleEString ) ) )
            // InternalArduinoML.g:4594:2: ( ( ruleEString ) )
            {
            // InternalArduinoML.g:4594:2: ( ( ruleEString ) )
            // InternalArduinoML.g:4595:3: ( ruleEString )
            {
             before(grammarAccess.getTransitionStateAccess().getDigitalsDigitalCrossReference_0_0_1_0_0_0()); 
            // InternalArduinoML.g:4596:3: ( ruleEString )
            // InternalArduinoML.g:4597:4: ruleEString
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
    // InternalArduinoML.g:4608:1: rule__TransitionState__D_valuesAssignment_0_0_1_0_2 : ( ruleSignal ) ;
    public final void rule__TransitionState__D_valuesAssignment_0_0_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:4612:1: ( ( ruleSignal ) )
            // InternalArduinoML.g:4613:2: ( ruleSignal )
            {
            // InternalArduinoML.g:4613:2: ( ruleSignal )
            // InternalArduinoML.g:4614:3: ruleSignal
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
    // InternalArduinoML.g:4623:1: rule__TransitionState__AnalogsAssignment_0_0_1_1_0 : ( ( ruleEString ) ) ;
    public final void rule__TransitionState__AnalogsAssignment_0_0_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:4627:1: ( ( ( ruleEString ) ) )
            // InternalArduinoML.g:4628:2: ( ( ruleEString ) )
            {
            // InternalArduinoML.g:4628:2: ( ( ruleEString ) )
            // InternalArduinoML.g:4629:3: ( ruleEString )
            {
             before(grammarAccess.getTransitionStateAccess().getAnalogsAnalogCrossReference_0_0_1_1_0_0()); 
            // InternalArduinoML.g:4630:3: ( ruleEString )
            // InternalArduinoML.g:4631:4: ruleEString
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
    // InternalArduinoML.g:4642:1: rule__TransitionState__CompAssignment_0_0_1_1_1 : ( ruleCompare ) ;
    public final void rule__TransitionState__CompAssignment_0_0_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:4646:1: ( ( ruleCompare ) )
            // InternalArduinoML.g:4647:2: ( ruleCompare )
            {
            // InternalArduinoML.g:4647:2: ( ruleCompare )
            // InternalArduinoML.g:4648:3: ruleCompare
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
    // InternalArduinoML.g:4657:1: rule__TransitionState__A_valuesAssignment_0_0_1_1_2 : ( ruleEInt ) ;
    public final void rule__TransitionState__A_valuesAssignment_0_0_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:4661:1: ( ( ruleEInt ) )
            // InternalArduinoML.g:4662:2: ( ruleEInt )
            {
            // InternalArduinoML.g:4662:2: ( ruleEInt )
            // InternalArduinoML.g:4663:3: ruleEInt
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
    // InternalArduinoML.g:4672:1: rule__TransitionState__DigitalsAssignment_0_0_2_1_0_0 : ( ( ruleEString ) ) ;
    public final void rule__TransitionState__DigitalsAssignment_0_0_2_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:4676:1: ( ( ( ruleEString ) ) )
            // InternalArduinoML.g:4677:2: ( ( ruleEString ) )
            {
            // InternalArduinoML.g:4677:2: ( ( ruleEString ) )
            // InternalArduinoML.g:4678:3: ( ruleEString )
            {
             before(grammarAccess.getTransitionStateAccess().getDigitalsDigitalCrossReference_0_0_2_1_0_0_0()); 
            // InternalArduinoML.g:4679:3: ( ruleEString )
            // InternalArduinoML.g:4680:4: ruleEString
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
    // InternalArduinoML.g:4691:1: rule__TransitionState__D_valuesAssignment_0_0_2_1_0_2 : ( ruleSignal ) ;
    public final void rule__TransitionState__D_valuesAssignment_0_0_2_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:4695:1: ( ( ruleSignal ) )
            // InternalArduinoML.g:4696:2: ( ruleSignal )
            {
            // InternalArduinoML.g:4696:2: ( ruleSignal )
            // InternalArduinoML.g:4697:3: ruleSignal
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
    // InternalArduinoML.g:4706:1: rule__TransitionState__AnalogsAssignment_0_0_2_1_1_0 : ( ( ruleEString ) ) ;
    public final void rule__TransitionState__AnalogsAssignment_0_0_2_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:4710:1: ( ( ( ruleEString ) ) )
            // InternalArduinoML.g:4711:2: ( ( ruleEString ) )
            {
            // InternalArduinoML.g:4711:2: ( ( ruleEString ) )
            // InternalArduinoML.g:4712:3: ( ruleEString )
            {
             before(grammarAccess.getTransitionStateAccess().getAnalogsAnalogCrossReference_0_0_2_1_1_0_0()); 
            // InternalArduinoML.g:4713:3: ( ruleEString )
            // InternalArduinoML.g:4714:4: ruleEString
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
    // InternalArduinoML.g:4725:1: rule__TransitionState__CompAssignment_0_0_2_1_1_1 : ( ruleCompare ) ;
    public final void rule__TransitionState__CompAssignment_0_0_2_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:4729:1: ( ( ruleCompare ) )
            // InternalArduinoML.g:4730:2: ( ruleCompare )
            {
            // InternalArduinoML.g:4730:2: ( ruleCompare )
            // InternalArduinoML.g:4731:3: ruleCompare
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
    // InternalArduinoML.g:4740:1: rule__TransitionState__A_valuesAssignment_0_0_2_1_1_2 : ( ruleEInt ) ;
    public final void rule__TransitionState__A_valuesAssignment_0_0_2_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:4744:1: ( ( ruleEInt ) )
            // InternalArduinoML.g:4745:2: ( ruleEInt )
            {
            // InternalArduinoML.g:4745:2: ( ruleEInt )
            // InternalArduinoML.g:4746:3: ruleEInt
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
    // InternalArduinoML.g:4755:1: rule__TransitionState__TimeAssignment_0_0_3_1 : ( ruleEInt ) ;
    public final void rule__TransitionState__TimeAssignment_0_0_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:4759:1: ( ( ruleEInt ) )
            // InternalArduinoML.g:4760:2: ( ruleEInt )
            {
            // InternalArduinoML.g:4760:2: ( ruleEInt )
            // InternalArduinoML.g:4761:3: ruleEInt
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
    // InternalArduinoML.g:4770:1: rule__TransitionState__UnitAssignment_0_0_3_2 : ( ruleTime_unit ) ;
    public final void rule__TransitionState__UnitAssignment_0_0_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:4774:1: ( ( ruleTime_unit ) )
            // InternalArduinoML.g:4775:2: ( ruleTime_unit )
            {
            // InternalArduinoML.g:4775:2: ( ruleTime_unit )
            // InternalArduinoML.g:4776:3: ruleTime_unit
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
    // InternalArduinoML.g:4785:1: rule__TransitionState__TimeAssignment_0_1_1 : ( ruleEInt ) ;
    public final void rule__TransitionState__TimeAssignment_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:4789:1: ( ( ruleEInt ) )
            // InternalArduinoML.g:4790:2: ( ruleEInt )
            {
            // InternalArduinoML.g:4790:2: ( ruleEInt )
            // InternalArduinoML.g:4791:3: ruleEInt
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
    // InternalArduinoML.g:4800:1: rule__TransitionState__UnitAssignment_0_1_2 : ( ruleTime_unit ) ;
    public final void rule__TransitionState__UnitAssignment_0_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:4804:1: ( ( ruleTime_unit ) )
            // InternalArduinoML.g:4805:2: ( ruleTime_unit )
            {
            // InternalArduinoML.g:4805:2: ( ruleTime_unit )
            // InternalArduinoML.g:4806:3: ruleTime_unit
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
    // InternalArduinoML.g:4815:1: rule__TransitionState__Next_stateAssignment_4 : ( ( ruleEString ) ) ;
    public final void rule__TransitionState__Next_stateAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:4819:1: ( ( ( ruleEString ) ) )
            // InternalArduinoML.g:4820:2: ( ( ruleEString ) )
            {
            // InternalArduinoML.g:4820:2: ( ( ruleEString ) )
            // InternalArduinoML.g:4821:3: ( ruleEString )
            {
             before(grammarAccess.getTransitionStateAccess().getNext_stateStateCrossReference_4_0()); 
            // InternalArduinoML.g:4822:3: ( ruleEString )
            // InternalArduinoML.g:4823:4: ruleEString
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
    // InternalArduinoML.g:4834:1: rule__TransitionMode__DigitalsAssignment_0_0_1_0_0 : ( ( ruleEString ) ) ;
    public final void rule__TransitionMode__DigitalsAssignment_0_0_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:4838:1: ( ( ( ruleEString ) ) )
            // InternalArduinoML.g:4839:2: ( ( ruleEString ) )
            {
            // InternalArduinoML.g:4839:2: ( ( ruleEString ) )
            // InternalArduinoML.g:4840:3: ( ruleEString )
            {
             before(grammarAccess.getTransitionModeAccess().getDigitalsDigitalCrossReference_0_0_1_0_0_0()); 
            // InternalArduinoML.g:4841:3: ( ruleEString )
            // InternalArduinoML.g:4842:4: ruleEString
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
    // InternalArduinoML.g:4853:1: rule__TransitionMode__D_valuesAssignment_0_0_1_0_2 : ( ruleSignal ) ;
    public final void rule__TransitionMode__D_valuesAssignment_0_0_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:4857:1: ( ( ruleSignal ) )
            // InternalArduinoML.g:4858:2: ( ruleSignal )
            {
            // InternalArduinoML.g:4858:2: ( ruleSignal )
            // InternalArduinoML.g:4859:3: ruleSignal
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
    // InternalArduinoML.g:4868:1: rule__TransitionMode__AnalogsAssignment_0_0_1_1_0 : ( ( ruleEString ) ) ;
    public final void rule__TransitionMode__AnalogsAssignment_0_0_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:4872:1: ( ( ( ruleEString ) ) )
            // InternalArduinoML.g:4873:2: ( ( ruleEString ) )
            {
            // InternalArduinoML.g:4873:2: ( ( ruleEString ) )
            // InternalArduinoML.g:4874:3: ( ruleEString )
            {
             before(grammarAccess.getTransitionModeAccess().getAnalogsAnalogCrossReference_0_0_1_1_0_0()); 
            // InternalArduinoML.g:4875:3: ( ruleEString )
            // InternalArduinoML.g:4876:4: ruleEString
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
    // InternalArduinoML.g:4887:1: rule__TransitionMode__CompAssignment_0_0_1_1_1 : ( ruleCompare ) ;
    public final void rule__TransitionMode__CompAssignment_0_0_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:4891:1: ( ( ruleCompare ) )
            // InternalArduinoML.g:4892:2: ( ruleCompare )
            {
            // InternalArduinoML.g:4892:2: ( ruleCompare )
            // InternalArduinoML.g:4893:3: ruleCompare
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
    // InternalArduinoML.g:4902:1: rule__TransitionMode__A_valuesAssignment_0_0_1_1_2 : ( ruleEInt ) ;
    public final void rule__TransitionMode__A_valuesAssignment_0_0_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:4906:1: ( ( ruleEInt ) )
            // InternalArduinoML.g:4907:2: ( ruleEInt )
            {
            // InternalArduinoML.g:4907:2: ( ruleEInt )
            // InternalArduinoML.g:4908:3: ruleEInt
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
    // InternalArduinoML.g:4917:1: rule__TransitionMode__DigitalsAssignment_0_0_2_1_0_0 : ( ( ruleEString ) ) ;
    public final void rule__TransitionMode__DigitalsAssignment_0_0_2_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:4921:1: ( ( ( ruleEString ) ) )
            // InternalArduinoML.g:4922:2: ( ( ruleEString ) )
            {
            // InternalArduinoML.g:4922:2: ( ( ruleEString ) )
            // InternalArduinoML.g:4923:3: ( ruleEString )
            {
             before(grammarAccess.getTransitionModeAccess().getDigitalsDigitalCrossReference_0_0_2_1_0_0_0()); 
            // InternalArduinoML.g:4924:3: ( ruleEString )
            // InternalArduinoML.g:4925:4: ruleEString
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
    // InternalArduinoML.g:4936:1: rule__TransitionMode__D_valuesAssignment_0_0_2_1_0_2 : ( ruleSignal ) ;
    public final void rule__TransitionMode__D_valuesAssignment_0_0_2_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:4940:1: ( ( ruleSignal ) )
            // InternalArduinoML.g:4941:2: ( ruleSignal )
            {
            // InternalArduinoML.g:4941:2: ( ruleSignal )
            // InternalArduinoML.g:4942:3: ruleSignal
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
    // InternalArduinoML.g:4951:1: rule__TransitionMode__AnalogsAssignment_0_0_2_1_1_0 : ( ( ruleEString ) ) ;
    public final void rule__TransitionMode__AnalogsAssignment_0_0_2_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:4955:1: ( ( ( ruleEString ) ) )
            // InternalArduinoML.g:4956:2: ( ( ruleEString ) )
            {
            // InternalArduinoML.g:4956:2: ( ( ruleEString ) )
            // InternalArduinoML.g:4957:3: ( ruleEString )
            {
             before(grammarAccess.getTransitionModeAccess().getAnalogsAnalogCrossReference_0_0_2_1_1_0_0()); 
            // InternalArduinoML.g:4958:3: ( ruleEString )
            // InternalArduinoML.g:4959:4: ruleEString
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
    // InternalArduinoML.g:4970:1: rule__TransitionMode__CompAssignment_0_0_2_1_1_1 : ( ruleCompare ) ;
    public final void rule__TransitionMode__CompAssignment_0_0_2_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:4974:1: ( ( ruleCompare ) )
            // InternalArduinoML.g:4975:2: ( ruleCompare )
            {
            // InternalArduinoML.g:4975:2: ( ruleCompare )
            // InternalArduinoML.g:4976:3: ruleCompare
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
    // InternalArduinoML.g:4985:1: rule__TransitionMode__A_valuesAssignment_0_0_2_1_1_2 : ( ruleEInt ) ;
    public final void rule__TransitionMode__A_valuesAssignment_0_0_2_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:4989:1: ( ( ruleEInt ) )
            // InternalArduinoML.g:4990:2: ( ruleEInt )
            {
            // InternalArduinoML.g:4990:2: ( ruleEInt )
            // InternalArduinoML.g:4991:3: ruleEInt
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
    // InternalArduinoML.g:5000:1: rule__TransitionMode__TimeAssignment_0_0_3_1 : ( ruleEInt ) ;
    public final void rule__TransitionMode__TimeAssignment_0_0_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:5004:1: ( ( ruleEInt ) )
            // InternalArduinoML.g:5005:2: ( ruleEInt )
            {
            // InternalArduinoML.g:5005:2: ( ruleEInt )
            // InternalArduinoML.g:5006:3: ruleEInt
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
    // InternalArduinoML.g:5015:1: rule__TransitionMode__UnitAssignment_0_0_3_2 : ( ruleTime_unit ) ;
    public final void rule__TransitionMode__UnitAssignment_0_0_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:5019:1: ( ( ruleTime_unit ) )
            // InternalArduinoML.g:5020:2: ( ruleTime_unit )
            {
            // InternalArduinoML.g:5020:2: ( ruleTime_unit )
            // InternalArduinoML.g:5021:3: ruleTime_unit
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
    // InternalArduinoML.g:5030:1: rule__TransitionMode__TimeAssignment_0_1_1 : ( ruleEInt ) ;
    public final void rule__TransitionMode__TimeAssignment_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:5034:1: ( ( ruleEInt ) )
            // InternalArduinoML.g:5035:2: ( ruleEInt )
            {
            // InternalArduinoML.g:5035:2: ( ruleEInt )
            // InternalArduinoML.g:5036:3: ruleEInt
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
    // InternalArduinoML.g:5045:1: rule__TransitionMode__UnitAssignment_0_1_2 : ( ruleTime_unit ) ;
    public final void rule__TransitionMode__UnitAssignment_0_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:5049:1: ( ( ruleTime_unit ) )
            // InternalArduinoML.g:5050:2: ( ruleTime_unit )
            {
            // InternalArduinoML.g:5050:2: ( ruleTime_unit )
            // InternalArduinoML.g:5051:3: ruleTime_unit
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
    // InternalArduinoML.g:5060:1: rule__TransitionMode__Next_modeAssignment_4 : ( ( ruleEString ) ) ;
    public final void rule__TransitionMode__Next_modeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:5064:1: ( ( ( ruleEString ) ) )
            // InternalArduinoML.g:5065:2: ( ( ruleEString ) )
            {
            // InternalArduinoML.g:5065:2: ( ( ruleEString ) )
            // InternalArduinoML.g:5066:3: ( ruleEString )
            {
             before(grammarAccess.getTransitionModeAccess().getNext_modeModeCrossReference_4_0()); 
            // InternalArduinoML.g:5067:3: ( ruleEString )
            // InternalArduinoML.g:5068:4: ruleEString
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000001C0000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000001C4000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000001C0000002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000062L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x00000001D0000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000020000060L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000009000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000009000000002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000009200000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000009200000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x000000C000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x00000000001F0000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x000000000000E000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000010000000000L});

}