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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_STRING", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'HIGH'", "'LOW'", "'ms'", "'s'", "'min'", "'inf'", "'einf'", "'equal'", "'esup'", "'sup'", "'app'", "'initial'", "'state'", "':'", "'bricks'", "'states'", "'mode'", "'modes'", "'Actuator'", "'Digital'", "'Analog'", "'change'", "'to'", "'go'", "'when'", "'is'", "'and'", "'wait'", "'then'"
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


    // $ANTLR start "entryRuleTransition"
    // InternalArduinoML.g:303:1: entryRuleTransition : ruleTransition EOF ;
    public final void entryRuleTransition() throws RecognitionException {
        try {
            // InternalArduinoML.g:304:1: ( ruleTransition EOF )
            // InternalArduinoML.g:305:1: ruleTransition EOF
            {
             before(grammarAccess.getTransitionRule()); 
            pushFollow(FOLLOW_1);
            ruleTransition();

            state._fsp--;

             after(grammarAccess.getTransitionRule()); 
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
    // $ANTLR end "entryRuleTransition"


    // $ANTLR start "ruleTransition"
    // InternalArduinoML.g:312:1: ruleTransition : ( ( rule__Transition__Group__0 ) ) ;
    public final void ruleTransition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:316:2: ( ( ( rule__Transition__Group__0 ) ) )
            // InternalArduinoML.g:317:2: ( ( rule__Transition__Group__0 ) )
            {
            // InternalArduinoML.g:317:2: ( ( rule__Transition__Group__0 ) )
            // InternalArduinoML.g:318:3: ( rule__Transition__Group__0 )
            {
             before(grammarAccess.getTransitionAccess().getGroup()); 
            // InternalArduinoML.g:319:3: ( rule__Transition__Group__0 )
            // InternalArduinoML.g:319:4: rule__Transition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Transition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTransition"


    // $ANTLR start "ruleSignal"
    // InternalArduinoML.g:328:1: ruleSignal : ( ( rule__Signal__Alternatives ) ) ;
    public final void ruleSignal() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:332:1: ( ( ( rule__Signal__Alternatives ) ) )
            // InternalArduinoML.g:333:2: ( ( rule__Signal__Alternatives ) )
            {
            // InternalArduinoML.g:333:2: ( ( rule__Signal__Alternatives ) )
            // InternalArduinoML.g:334:3: ( rule__Signal__Alternatives )
            {
             before(grammarAccess.getSignalAccess().getAlternatives()); 
            // InternalArduinoML.g:335:3: ( rule__Signal__Alternatives )
            // InternalArduinoML.g:335:4: rule__Signal__Alternatives
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
    // InternalArduinoML.g:344:1: ruleTime_unit : ( ( rule__Time_unit__Alternatives ) ) ;
    public final void ruleTime_unit() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:348:1: ( ( ( rule__Time_unit__Alternatives ) ) )
            // InternalArduinoML.g:349:2: ( ( rule__Time_unit__Alternatives ) )
            {
            // InternalArduinoML.g:349:2: ( ( rule__Time_unit__Alternatives ) )
            // InternalArduinoML.g:350:3: ( rule__Time_unit__Alternatives )
            {
             before(grammarAccess.getTime_unitAccess().getAlternatives()); 
            // InternalArduinoML.g:351:3: ( rule__Time_unit__Alternatives )
            // InternalArduinoML.g:351:4: rule__Time_unit__Alternatives
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
    // InternalArduinoML.g:360:1: ruleCompare : ( ( rule__Compare__Alternatives ) ) ;
    public final void ruleCompare() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:364:1: ( ( ( rule__Compare__Alternatives ) ) )
            // InternalArduinoML.g:365:2: ( ( rule__Compare__Alternatives ) )
            {
            // InternalArduinoML.g:365:2: ( ( rule__Compare__Alternatives ) )
            // InternalArduinoML.g:366:3: ( rule__Compare__Alternatives )
            {
             before(grammarAccess.getCompareAccess().getAlternatives()); 
            // InternalArduinoML.g:367:3: ( rule__Compare__Alternatives )
            // InternalArduinoML.g:367:4: rule__Compare__Alternatives
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
    // InternalArduinoML.g:375:1: rule__App__Alternatives : ( ( ( rule__App__Group_0__0 ) ) | ( ( rule__App__Group_1__0 ) ) );
    public final void rule__App__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:379:1: ( ( ( rule__App__Group_0__0 ) ) | ( ( rule__App__Group_1__0 ) ) )
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
                    // InternalArduinoML.g:380:2: ( ( rule__App__Group_0__0 ) )
                    {
                    // InternalArduinoML.g:380:2: ( ( rule__App__Group_0__0 ) )
                    // InternalArduinoML.g:381:3: ( rule__App__Group_0__0 )
                    {
                     before(grammarAccess.getAppAccess().getGroup_0()); 
                    // InternalArduinoML.g:382:3: ( rule__App__Group_0__0 )
                    // InternalArduinoML.g:382:4: rule__App__Group_0__0
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
                    // InternalArduinoML.g:386:2: ( ( rule__App__Group_1__0 ) )
                    {
                    // InternalArduinoML.g:386:2: ( ( rule__App__Group_1__0 ) )
                    // InternalArduinoML.g:387:3: ( rule__App__Group_1__0 )
                    {
                     before(grammarAccess.getAppAccess().getGroup_1()); 
                    // InternalArduinoML.g:388:3: ( rule__App__Group_1__0 )
                    // InternalArduinoML.g:388:4: rule__App__Group_1__0
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
    // InternalArduinoML.g:396:1: rule__Brick__Alternatives_0 : ( ( ruleActuator ) | ( ruleDigital ) | ( ruleAnalog ) );
    public final void rule__Brick__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:400:1: ( ( ruleActuator ) | ( ruleDigital ) | ( ruleAnalog ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt2=1;
                }
                break;
            case 30:
                {
                alt2=2;
                }
                break;
            case 31:
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
                    // InternalArduinoML.g:401:2: ( ruleActuator )
                    {
                    // InternalArduinoML.g:401:2: ( ruleActuator )
                    // InternalArduinoML.g:402:3: ruleActuator
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
                    // InternalArduinoML.g:407:2: ( ruleDigital )
                    {
                    // InternalArduinoML.g:407:2: ( ruleDigital )
                    // InternalArduinoML.g:408:3: ruleDigital
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
                    // InternalArduinoML.g:413:2: ( ruleAnalog )
                    {
                    // InternalArduinoML.g:413:2: ( ruleAnalog )
                    // InternalArduinoML.g:414:3: ruleAnalog
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
    // InternalArduinoML.g:423:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:427:1: ( ( RULE_STRING ) | ( RULE_ID ) )
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
                    // InternalArduinoML.g:428:2: ( RULE_STRING )
                    {
                    // InternalArduinoML.g:428:2: ( RULE_STRING )
                    // InternalArduinoML.g:429:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalArduinoML.g:434:2: ( RULE_ID )
                    {
                    // InternalArduinoML.g:434:2: ( RULE_ID )
                    // InternalArduinoML.g:435:3: RULE_ID
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


    // $ANTLR start "rule__Transition__Alternatives_0"
    // InternalArduinoML.g:444:1: rule__Transition__Alternatives_0 : ( ( ( rule__Transition__Group_0_0__0 ) ) | ( ( rule__Transition__Group_0_1__0 ) ) );
    public final void rule__Transition__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:448:1: ( ( ( rule__Transition__Group_0_0__0 ) ) | ( ( rule__Transition__Group_0_1__0 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==35) ) {
                alt4=1;
            }
            else if ( (LA4_0==38) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalArduinoML.g:449:2: ( ( rule__Transition__Group_0_0__0 ) )
                    {
                    // InternalArduinoML.g:449:2: ( ( rule__Transition__Group_0_0__0 ) )
                    // InternalArduinoML.g:450:3: ( rule__Transition__Group_0_0__0 )
                    {
                     before(grammarAccess.getTransitionAccess().getGroup_0_0()); 
                    // InternalArduinoML.g:451:3: ( rule__Transition__Group_0_0__0 )
                    // InternalArduinoML.g:451:4: rule__Transition__Group_0_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Transition__Group_0_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTransitionAccess().getGroup_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalArduinoML.g:455:2: ( ( rule__Transition__Group_0_1__0 ) )
                    {
                    // InternalArduinoML.g:455:2: ( ( rule__Transition__Group_0_1__0 ) )
                    // InternalArduinoML.g:456:3: ( rule__Transition__Group_0_1__0 )
                    {
                     before(grammarAccess.getTransitionAccess().getGroup_0_1()); 
                    // InternalArduinoML.g:457:3: ( rule__Transition__Group_0_1__0 )
                    // InternalArduinoML.g:457:4: rule__Transition__Group_0_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Transition__Group_0_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTransitionAccess().getGroup_0_1()); 

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
    // $ANTLR end "rule__Transition__Alternatives_0"


    // $ANTLR start "rule__Transition__Alternatives_0_0_1"
    // InternalArduinoML.g:465:1: rule__Transition__Alternatives_0_0_1 : ( ( ( rule__Transition__Group_0_0_1_0__0 ) ) | ( ( rule__Transition__Group_0_0_1_1__0 ) ) );
    public final void rule__Transition__Alternatives_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:469:1: ( ( ( rule__Transition__Group_0_0_1_0__0 ) ) | ( ( rule__Transition__Group_0_0_1_1__0 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_STRING) ) {
                int LA5_1 = input.LA(2);

                if ( ((LA5_1>=16 && LA5_1<=20)) ) {
                    alt5=2;
                }
                else if ( (LA5_1==36) ) {
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
                else if ( (LA5_2==36) ) {
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
                    // InternalArduinoML.g:470:2: ( ( rule__Transition__Group_0_0_1_0__0 ) )
                    {
                    // InternalArduinoML.g:470:2: ( ( rule__Transition__Group_0_0_1_0__0 ) )
                    // InternalArduinoML.g:471:3: ( rule__Transition__Group_0_0_1_0__0 )
                    {
                     before(grammarAccess.getTransitionAccess().getGroup_0_0_1_0()); 
                    // InternalArduinoML.g:472:3: ( rule__Transition__Group_0_0_1_0__0 )
                    // InternalArduinoML.g:472:4: rule__Transition__Group_0_0_1_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Transition__Group_0_0_1_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTransitionAccess().getGroup_0_0_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalArduinoML.g:476:2: ( ( rule__Transition__Group_0_0_1_1__0 ) )
                    {
                    // InternalArduinoML.g:476:2: ( ( rule__Transition__Group_0_0_1_1__0 ) )
                    // InternalArduinoML.g:477:3: ( rule__Transition__Group_0_0_1_1__0 )
                    {
                     before(grammarAccess.getTransitionAccess().getGroup_0_0_1_1()); 
                    // InternalArduinoML.g:478:3: ( rule__Transition__Group_0_0_1_1__0 )
                    // InternalArduinoML.g:478:4: rule__Transition__Group_0_0_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Transition__Group_0_0_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTransitionAccess().getGroup_0_0_1_1()); 

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
    // $ANTLR end "rule__Transition__Alternatives_0_0_1"


    // $ANTLR start "rule__Transition__Alternatives_0_0_2_1"
    // InternalArduinoML.g:486:1: rule__Transition__Alternatives_0_0_2_1 : ( ( ( rule__Transition__Group_0_0_2_1_0__0 ) ) | ( ( rule__Transition__Group_0_0_2_1_1__0 ) ) );
    public final void rule__Transition__Alternatives_0_0_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:490:1: ( ( ( rule__Transition__Group_0_0_2_1_0__0 ) ) | ( ( rule__Transition__Group_0_0_2_1_1__0 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_STRING) ) {
                int LA6_1 = input.LA(2);

                if ( ((LA6_1>=16 && LA6_1<=20)) ) {
                    alt6=2;
                }
                else if ( (LA6_1==36) ) {
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
                else if ( (LA6_2==36) ) {
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
                    // InternalArduinoML.g:491:2: ( ( rule__Transition__Group_0_0_2_1_0__0 ) )
                    {
                    // InternalArduinoML.g:491:2: ( ( rule__Transition__Group_0_0_2_1_0__0 ) )
                    // InternalArduinoML.g:492:3: ( rule__Transition__Group_0_0_2_1_0__0 )
                    {
                     before(grammarAccess.getTransitionAccess().getGroup_0_0_2_1_0()); 
                    // InternalArduinoML.g:493:3: ( rule__Transition__Group_0_0_2_1_0__0 )
                    // InternalArduinoML.g:493:4: rule__Transition__Group_0_0_2_1_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Transition__Group_0_0_2_1_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTransitionAccess().getGroup_0_0_2_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalArduinoML.g:497:2: ( ( rule__Transition__Group_0_0_2_1_1__0 ) )
                    {
                    // InternalArduinoML.g:497:2: ( ( rule__Transition__Group_0_0_2_1_1__0 ) )
                    // InternalArduinoML.g:498:3: ( rule__Transition__Group_0_0_2_1_1__0 )
                    {
                     before(grammarAccess.getTransitionAccess().getGroup_0_0_2_1_1()); 
                    // InternalArduinoML.g:499:3: ( rule__Transition__Group_0_0_2_1_1__0 )
                    // InternalArduinoML.g:499:4: rule__Transition__Group_0_0_2_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Transition__Group_0_0_2_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTransitionAccess().getGroup_0_0_2_1_1()); 

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
    // $ANTLR end "rule__Transition__Alternatives_0_0_2_1"


    // $ANTLR start "rule__Transition__Alternatives_3"
    // InternalArduinoML.g:507:1: rule__Transition__Alternatives_3 : ( ( ( rule__Transition__Group_3_0__0 ) ) | ( ( rule__Transition__Group_3_1__0 ) ) );
    public final void rule__Transition__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:511:1: ( ( ( rule__Transition__Group_3_0__0 ) ) | ( ( rule__Transition__Group_3_1__0 ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==23) ) {
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
                    // InternalArduinoML.g:512:2: ( ( rule__Transition__Group_3_0__0 ) )
                    {
                    // InternalArduinoML.g:512:2: ( ( rule__Transition__Group_3_0__0 ) )
                    // InternalArduinoML.g:513:3: ( rule__Transition__Group_3_0__0 )
                    {
                     before(grammarAccess.getTransitionAccess().getGroup_3_0()); 
                    // InternalArduinoML.g:514:3: ( rule__Transition__Group_3_0__0 )
                    // InternalArduinoML.g:514:4: rule__Transition__Group_3_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Transition__Group_3_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTransitionAccess().getGroup_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalArduinoML.g:518:2: ( ( rule__Transition__Group_3_1__0 ) )
                    {
                    // InternalArduinoML.g:518:2: ( ( rule__Transition__Group_3_1__0 ) )
                    // InternalArduinoML.g:519:3: ( rule__Transition__Group_3_1__0 )
                    {
                     before(grammarAccess.getTransitionAccess().getGroup_3_1()); 
                    // InternalArduinoML.g:520:3: ( rule__Transition__Group_3_1__0 )
                    // InternalArduinoML.g:520:4: rule__Transition__Group_3_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Transition__Group_3_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTransitionAccess().getGroup_3_1()); 

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
    // $ANTLR end "rule__Transition__Alternatives_3"


    // $ANTLR start "rule__Signal__Alternatives"
    // InternalArduinoML.g:528:1: rule__Signal__Alternatives : ( ( ( 'HIGH' ) ) | ( ( 'LOW' ) ) );
    public final void rule__Signal__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:532:1: ( ( ( 'HIGH' ) ) | ( ( 'LOW' ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==11) ) {
                alt8=1;
            }
            else if ( (LA8_0==12) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalArduinoML.g:533:2: ( ( 'HIGH' ) )
                    {
                    // InternalArduinoML.g:533:2: ( ( 'HIGH' ) )
                    // InternalArduinoML.g:534:3: ( 'HIGH' )
                    {
                     before(grammarAccess.getSignalAccess().getHIGHEnumLiteralDeclaration_0()); 
                    // InternalArduinoML.g:535:3: ( 'HIGH' )
                    // InternalArduinoML.g:535:4: 'HIGH'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getSignalAccess().getHIGHEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalArduinoML.g:539:2: ( ( 'LOW' ) )
                    {
                    // InternalArduinoML.g:539:2: ( ( 'LOW' ) )
                    // InternalArduinoML.g:540:3: ( 'LOW' )
                    {
                     before(grammarAccess.getSignalAccess().getLOWEnumLiteralDeclaration_1()); 
                    // InternalArduinoML.g:541:3: ( 'LOW' )
                    // InternalArduinoML.g:541:4: 'LOW'
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
    // InternalArduinoML.g:549:1: rule__Time_unit__Alternatives : ( ( ( 'ms' ) ) | ( ( 's' ) ) | ( ( 'min' ) ) );
    public final void rule__Time_unit__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:553:1: ( ( ( 'ms' ) ) | ( ( 's' ) ) | ( ( 'min' ) ) )
            int alt9=3;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt9=1;
                }
                break;
            case 14:
                {
                alt9=2;
                }
                break;
            case 15:
                {
                alt9=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalArduinoML.g:554:2: ( ( 'ms' ) )
                    {
                    // InternalArduinoML.g:554:2: ( ( 'ms' ) )
                    // InternalArduinoML.g:555:3: ( 'ms' )
                    {
                     before(grammarAccess.getTime_unitAccess().getMsEnumLiteralDeclaration_0()); 
                    // InternalArduinoML.g:556:3: ( 'ms' )
                    // InternalArduinoML.g:556:4: 'ms'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getTime_unitAccess().getMsEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalArduinoML.g:560:2: ( ( 's' ) )
                    {
                    // InternalArduinoML.g:560:2: ( ( 's' ) )
                    // InternalArduinoML.g:561:3: ( 's' )
                    {
                     before(grammarAccess.getTime_unitAccess().getSEnumLiteralDeclaration_1()); 
                    // InternalArduinoML.g:562:3: ( 's' )
                    // InternalArduinoML.g:562:4: 's'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getTime_unitAccess().getSEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalArduinoML.g:566:2: ( ( 'min' ) )
                    {
                    // InternalArduinoML.g:566:2: ( ( 'min' ) )
                    // InternalArduinoML.g:567:3: ( 'min' )
                    {
                     before(grammarAccess.getTime_unitAccess().getMinEnumLiteralDeclaration_2()); 
                    // InternalArduinoML.g:568:3: ( 'min' )
                    // InternalArduinoML.g:568:4: 'min'
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
    // InternalArduinoML.g:576:1: rule__Compare__Alternatives : ( ( ( 'inf' ) ) | ( ( 'einf' ) ) | ( ( 'equal' ) ) | ( ( 'esup' ) ) | ( ( 'sup' ) ) );
    public final void rule__Compare__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:580:1: ( ( ( 'inf' ) ) | ( ( 'einf' ) ) | ( ( 'equal' ) ) | ( ( 'esup' ) ) | ( ( 'sup' ) ) )
            int alt10=5;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt10=1;
                }
                break;
            case 17:
                {
                alt10=2;
                }
                break;
            case 18:
                {
                alt10=3;
                }
                break;
            case 19:
                {
                alt10=4;
                }
                break;
            case 20:
                {
                alt10=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalArduinoML.g:581:2: ( ( 'inf' ) )
                    {
                    // InternalArduinoML.g:581:2: ( ( 'inf' ) )
                    // InternalArduinoML.g:582:3: ( 'inf' )
                    {
                     before(grammarAccess.getCompareAccess().getInfEnumLiteralDeclaration_0()); 
                    // InternalArduinoML.g:583:3: ( 'inf' )
                    // InternalArduinoML.g:583:4: 'inf'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getCompareAccess().getInfEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalArduinoML.g:587:2: ( ( 'einf' ) )
                    {
                    // InternalArduinoML.g:587:2: ( ( 'einf' ) )
                    // InternalArduinoML.g:588:3: ( 'einf' )
                    {
                     before(grammarAccess.getCompareAccess().getEinfEnumLiteralDeclaration_1()); 
                    // InternalArduinoML.g:589:3: ( 'einf' )
                    // InternalArduinoML.g:589:4: 'einf'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getCompareAccess().getEinfEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalArduinoML.g:593:2: ( ( 'equal' ) )
                    {
                    // InternalArduinoML.g:593:2: ( ( 'equal' ) )
                    // InternalArduinoML.g:594:3: ( 'equal' )
                    {
                     before(grammarAccess.getCompareAccess().getEqualEnumLiteralDeclaration_2()); 
                    // InternalArduinoML.g:595:3: ( 'equal' )
                    // InternalArduinoML.g:595:4: 'equal'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getCompareAccess().getEqualEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalArduinoML.g:599:2: ( ( 'esup' ) )
                    {
                    // InternalArduinoML.g:599:2: ( ( 'esup' ) )
                    // InternalArduinoML.g:600:3: ( 'esup' )
                    {
                     before(grammarAccess.getCompareAccess().getEsupEnumLiteralDeclaration_3()); 
                    // InternalArduinoML.g:601:3: ( 'esup' )
                    // InternalArduinoML.g:601:4: 'esup'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getCompareAccess().getEsupEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalArduinoML.g:605:2: ( ( 'sup' ) )
                    {
                    // InternalArduinoML.g:605:2: ( ( 'sup' ) )
                    // InternalArduinoML.g:606:3: ( 'sup' )
                    {
                     before(grammarAccess.getCompareAccess().getSupEnumLiteralDeclaration_4()); 
                    // InternalArduinoML.g:607:3: ( 'sup' )
                    // InternalArduinoML.g:607:4: 'sup'
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
    // InternalArduinoML.g:615:1: rule__App__Group_0__0 : rule__App__Group_0__0__Impl rule__App__Group_0__1 ;
    public final void rule__App__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:619:1: ( rule__App__Group_0__0__Impl rule__App__Group_0__1 )
            // InternalArduinoML.g:620:2: rule__App__Group_0__0__Impl rule__App__Group_0__1
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
    // InternalArduinoML.g:627:1: rule__App__Group_0__0__Impl : ( 'app' ) ;
    public final void rule__App__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:631:1: ( ( 'app' ) )
            // InternalArduinoML.g:632:1: ( 'app' )
            {
            // InternalArduinoML.g:632:1: ( 'app' )
            // InternalArduinoML.g:633:2: 'app'
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
    // InternalArduinoML.g:642:1: rule__App__Group_0__1 : rule__App__Group_0__1__Impl rule__App__Group_0__2 ;
    public final void rule__App__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:646:1: ( rule__App__Group_0__1__Impl rule__App__Group_0__2 )
            // InternalArduinoML.g:647:2: rule__App__Group_0__1__Impl rule__App__Group_0__2
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
    // InternalArduinoML.g:654:1: rule__App__Group_0__1__Impl : ( ( rule__App__NameAssignment_0_1 ) ) ;
    public final void rule__App__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:658:1: ( ( ( rule__App__NameAssignment_0_1 ) ) )
            // InternalArduinoML.g:659:1: ( ( rule__App__NameAssignment_0_1 ) )
            {
            // InternalArduinoML.g:659:1: ( ( rule__App__NameAssignment_0_1 ) )
            // InternalArduinoML.g:660:2: ( rule__App__NameAssignment_0_1 )
            {
             before(grammarAccess.getAppAccess().getNameAssignment_0_1()); 
            // InternalArduinoML.g:661:2: ( rule__App__NameAssignment_0_1 )
            // InternalArduinoML.g:661:3: rule__App__NameAssignment_0_1
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
    // InternalArduinoML.g:669:1: rule__App__Group_0__2 : rule__App__Group_0__2__Impl rule__App__Group_0__3 ;
    public final void rule__App__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:673:1: ( rule__App__Group_0__2__Impl rule__App__Group_0__3 )
            // InternalArduinoML.g:674:2: rule__App__Group_0__2__Impl rule__App__Group_0__3
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
    // InternalArduinoML.g:681:1: rule__App__Group_0__2__Impl : ( 'initial' ) ;
    public final void rule__App__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:685:1: ( ( 'initial' ) )
            // InternalArduinoML.g:686:1: ( 'initial' )
            {
            // InternalArduinoML.g:686:1: ( 'initial' )
            // InternalArduinoML.g:687:2: 'initial'
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
    // InternalArduinoML.g:696:1: rule__App__Group_0__3 : rule__App__Group_0__3__Impl rule__App__Group_0__4 ;
    public final void rule__App__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:700:1: ( rule__App__Group_0__3__Impl rule__App__Group_0__4 )
            // InternalArduinoML.g:701:2: rule__App__Group_0__3__Impl rule__App__Group_0__4
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
    // InternalArduinoML.g:708:1: rule__App__Group_0__3__Impl : ( 'state' ) ;
    public final void rule__App__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:712:1: ( ( 'state' ) )
            // InternalArduinoML.g:713:1: ( 'state' )
            {
            // InternalArduinoML.g:713:1: ( 'state' )
            // InternalArduinoML.g:714:2: 'state'
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
    // InternalArduinoML.g:723:1: rule__App__Group_0__4 : rule__App__Group_0__4__Impl rule__App__Group_0__5 ;
    public final void rule__App__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:727:1: ( rule__App__Group_0__4__Impl rule__App__Group_0__5 )
            // InternalArduinoML.g:728:2: rule__App__Group_0__4__Impl rule__App__Group_0__5
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
    // InternalArduinoML.g:735:1: rule__App__Group_0__4__Impl : ( ( rule__App__Initial_stateAssignment_0_4 ) ) ;
    public final void rule__App__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:739:1: ( ( ( rule__App__Initial_stateAssignment_0_4 ) ) )
            // InternalArduinoML.g:740:1: ( ( rule__App__Initial_stateAssignment_0_4 ) )
            {
            // InternalArduinoML.g:740:1: ( ( rule__App__Initial_stateAssignment_0_4 ) )
            // InternalArduinoML.g:741:2: ( rule__App__Initial_stateAssignment_0_4 )
            {
             before(grammarAccess.getAppAccess().getInitial_stateAssignment_0_4()); 
            // InternalArduinoML.g:742:2: ( rule__App__Initial_stateAssignment_0_4 )
            // InternalArduinoML.g:742:3: rule__App__Initial_stateAssignment_0_4
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
    // InternalArduinoML.g:750:1: rule__App__Group_0__5 : rule__App__Group_0__5__Impl rule__App__Group_0__6 ;
    public final void rule__App__Group_0__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:754:1: ( rule__App__Group_0__5__Impl rule__App__Group_0__6 )
            // InternalArduinoML.g:755:2: rule__App__Group_0__5__Impl rule__App__Group_0__6
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
    // InternalArduinoML.g:762:1: rule__App__Group_0__5__Impl : ( ':' ) ;
    public final void rule__App__Group_0__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:766:1: ( ( ':' ) )
            // InternalArduinoML.g:767:1: ( ':' )
            {
            // InternalArduinoML.g:767:1: ( ':' )
            // InternalArduinoML.g:768:2: ':'
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
    // InternalArduinoML.g:777:1: rule__App__Group_0__6 : rule__App__Group_0__6__Impl rule__App__Group_0__7 ;
    public final void rule__App__Group_0__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:781:1: ( rule__App__Group_0__6__Impl rule__App__Group_0__7 )
            // InternalArduinoML.g:782:2: rule__App__Group_0__6__Impl rule__App__Group_0__7
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
    // InternalArduinoML.g:789:1: rule__App__Group_0__6__Impl : ( 'bricks' ) ;
    public final void rule__App__Group_0__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:793:1: ( ( 'bricks' ) )
            // InternalArduinoML.g:794:1: ( 'bricks' )
            {
            // InternalArduinoML.g:794:1: ( 'bricks' )
            // InternalArduinoML.g:795:2: 'bricks'
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
    // InternalArduinoML.g:804:1: rule__App__Group_0__7 : rule__App__Group_0__7__Impl rule__App__Group_0__8 ;
    public final void rule__App__Group_0__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:808:1: ( rule__App__Group_0__7__Impl rule__App__Group_0__8 )
            // InternalArduinoML.g:809:2: rule__App__Group_0__7__Impl rule__App__Group_0__8
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
    // InternalArduinoML.g:816:1: rule__App__Group_0__7__Impl : ( ':' ) ;
    public final void rule__App__Group_0__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:820:1: ( ( ':' ) )
            // InternalArduinoML.g:821:1: ( ':' )
            {
            // InternalArduinoML.g:821:1: ( ':' )
            // InternalArduinoML.g:822:2: ':'
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
    // InternalArduinoML.g:831:1: rule__App__Group_0__8 : rule__App__Group_0__8__Impl rule__App__Group_0__9 ;
    public final void rule__App__Group_0__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:835:1: ( rule__App__Group_0__8__Impl rule__App__Group_0__9 )
            // InternalArduinoML.g:836:2: rule__App__Group_0__8__Impl rule__App__Group_0__9
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
    // InternalArduinoML.g:843:1: rule__App__Group_0__8__Impl : ( ( rule__App__BricksAssignment_0_8 ) ) ;
    public final void rule__App__Group_0__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:847:1: ( ( ( rule__App__BricksAssignment_0_8 ) ) )
            // InternalArduinoML.g:848:1: ( ( rule__App__BricksAssignment_0_8 ) )
            {
            // InternalArduinoML.g:848:1: ( ( rule__App__BricksAssignment_0_8 ) )
            // InternalArduinoML.g:849:2: ( rule__App__BricksAssignment_0_8 )
            {
             before(grammarAccess.getAppAccess().getBricksAssignment_0_8()); 
            // InternalArduinoML.g:850:2: ( rule__App__BricksAssignment_0_8 )
            // InternalArduinoML.g:850:3: rule__App__BricksAssignment_0_8
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
    // InternalArduinoML.g:858:1: rule__App__Group_0__9 : rule__App__Group_0__9__Impl rule__App__Group_0__10 ;
    public final void rule__App__Group_0__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:862:1: ( rule__App__Group_0__9__Impl rule__App__Group_0__10 )
            // InternalArduinoML.g:863:2: rule__App__Group_0__9__Impl rule__App__Group_0__10
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
    // InternalArduinoML.g:870:1: rule__App__Group_0__9__Impl : ( ( rule__App__BricksAssignment_0_9 )* ) ;
    public final void rule__App__Group_0__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:874:1: ( ( ( rule__App__BricksAssignment_0_9 )* ) )
            // InternalArduinoML.g:875:1: ( ( rule__App__BricksAssignment_0_9 )* )
            {
            // InternalArduinoML.g:875:1: ( ( rule__App__BricksAssignment_0_9 )* )
            // InternalArduinoML.g:876:2: ( rule__App__BricksAssignment_0_9 )*
            {
             before(grammarAccess.getAppAccess().getBricksAssignment_0_9()); 
            // InternalArduinoML.g:877:2: ( rule__App__BricksAssignment_0_9 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=29 && LA11_0<=31)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalArduinoML.g:877:3: rule__App__BricksAssignment_0_9
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__App__BricksAssignment_0_9();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
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
    // InternalArduinoML.g:885:1: rule__App__Group_0__10 : rule__App__Group_0__10__Impl rule__App__Group_0__11 ;
    public final void rule__App__Group_0__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:889:1: ( rule__App__Group_0__10__Impl rule__App__Group_0__11 )
            // InternalArduinoML.g:890:2: rule__App__Group_0__10__Impl rule__App__Group_0__11
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
    // InternalArduinoML.g:897:1: rule__App__Group_0__10__Impl : ( 'states' ) ;
    public final void rule__App__Group_0__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:901:1: ( ( 'states' ) )
            // InternalArduinoML.g:902:1: ( 'states' )
            {
            // InternalArduinoML.g:902:1: ( 'states' )
            // InternalArduinoML.g:903:2: 'states'
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
    // InternalArduinoML.g:912:1: rule__App__Group_0__11 : rule__App__Group_0__11__Impl rule__App__Group_0__12 ;
    public final void rule__App__Group_0__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:916:1: ( rule__App__Group_0__11__Impl rule__App__Group_0__12 )
            // InternalArduinoML.g:917:2: rule__App__Group_0__11__Impl rule__App__Group_0__12
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
    // InternalArduinoML.g:924:1: rule__App__Group_0__11__Impl : ( ':' ) ;
    public final void rule__App__Group_0__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:928:1: ( ( ':' ) )
            // InternalArduinoML.g:929:1: ( ':' )
            {
            // InternalArduinoML.g:929:1: ( ':' )
            // InternalArduinoML.g:930:2: ':'
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
    // InternalArduinoML.g:939:1: rule__App__Group_0__12 : rule__App__Group_0__12__Impl rule__App__Group_0__13 ;
    public final void rule__App__Group_0__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:943:1: ( rule__App__Group_0__12__Impl rule__App__Group_0__13 )
            // InternalArduinoML.g:944:2: rule__App__Group_0__12__Impl rule__App__Group_0__13
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
    // InternalArduinoML.g:951:1: rule__App__Group_0__12__Impl : ( ( rule__App__StatesAssignment_0_12 ) ) ;
    public final void rule__App__Group_0__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:955:1: ( ( ( rule__App__StatesAssignment_0_12 ) ) )
            // InternalArduinoML.g:956:1: ( ( rule__App__StatesAssignment_0_12 ) )
            {
            // InternalArduinoML.g:956:1: ( ( rule__App__StatesAssignment_0_12 ) )
            // InternalArduinoML.g:957:2: ( rule__App__StatesAssignment_0_12 )
            {
             before(grammarAccess.getAppAccess().getStatesAssignment_0_12()); 
            // InternalArduinoML.g:958:2: ( rule__App__StatesAssignment_0_12 )
            // InternalArduinoML.g:958:3: rule__App__StatesAssignment_0_12
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
    // InternalArduinoML.g:966:1: rule__App__Group_0__13 : rule__App__Group_0__13__Impl ;
    public final void rule__App__Group_0__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:970:1: ( rule__App__Group_0__13__Impl )
            // InternalArduinoML.g:971:2: rule__App__Group_0__13__Impl
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
    // InternalArduinoML.g:977:1: rule__App__Group_0__13__Impl : ( ( rule__App__StatesAssignment_0_13 )* ) ;
    public final void rule__App__Group_0__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:981:1: ( ( ( rule__App__StatesAssignment_0_13 )* ) )
            // InternalArduinoML.g:982:1: ( ( rule__App__StatesAssignment_0_13 )* )
            {
            // InternalArduinoML.g:982:1: ( ( rule__App__StatesAssignment_0_13 )* )
            // InternalArduinoML.g:983:2: ( rule__App__StatesAssignment_0_13 )*
            {
             before(grammarAccess.getAppAccess().getStatesAssignment_0_13()); 
            // InternalArduinoML.g:984:2: ( rule__App__StatesAssignment_0_13 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=RULE_STRING && LA12_0<=RULE_ID)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalArduinoML.g:984:3: rule__App__StatesAssignment_0_13
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__App__StatesAssignment_0_13();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
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
    // InternalArduinoML.g:993:1: rule__App__Group_1__0 : rule__App__Group_1__0__Impl rule__App__Group_1__1 ;
    public final void rule__App__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:997:1: ( rule__App__Group_1__0__Impl rule__App__Group_1__1 )
            // InternalArduinoML.g:998:2: rule__App__Group_1__0__Impl rule__App__Group_1__1
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
    // InternalArduinoML.g:1005:1: rule__App__Group_1__0__Impl : ( 'app' ) ;
    public final void rule__App__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1009:1: ( ( 'app' ) )
            // InternalArduinoML.g:1010:1: ( 'app' )
            {
            // InternalArduinoML.g:1010:1: ( 'app' )
            // InternalArduinoML.g:1011:2: 'app'
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
    // InternalArduinoML.g:1020:1: rule__App__Group_1__1 : rule__App__Group_1__1__Impl rule__App__Group_1__2 ;
    public final void rule__App__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1024:1: ( rule__App__Group_1__1__Impl rule__App__Group_1__2 )
            // InternalArduinoML.g:1025:2: rule__App__Group_1__1__Impl rule__App__Group_1__2
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
    // InternalArduinoML.g:1032:1: rule__App__Group_1__1__Impl : ( ( rule__App__NameAssignment_1_1 ) ) ;
    public final void rule__App__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1036:1: ( ( ( rule__App__NameAssignment_1_1 ) ) )
            // InternalArduinoML.g:1037:1: ( ( rule__App__NameAssignment_1_1 ) )
            {
            // InternalArduinoML.g:1037:1: ( ( rule__App__NameAssignment_1_1 ) )
            // InternalArduinoML.g:1038:2: ( rule__App__NameAssignment_1_1 )
            {
             before(grammarAccess.getAppAccess().getNameAssignment_1_1()); 
            // InternalArduinoML.g:1039:2: ( rule__App__NameAssignment_1_1 )
            // InternalArduinoML.g:1039:3: rule__App__NameAssignment_1_1
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
    // InternalArduinoML.g:1047:1: rule__App__Group_1__2 : rule__App__Group_1__2__Impl rule__App__Group_1__3 ;
    public final void rule__App__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1051:1: ( rule__App__Group_1__2__Impl rule__App__Group_1__3 )
            // InternalArduinoML.g:1052:2: rule__App__Group_1__2__Impl rule__App__Group_1__3
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
    // InternalArduinoML.g:1059:1: rule__App__Group_1__2__Impl : ( 'initial' ) ;
    public final void rule__App__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1063:1: ( ( 'initial' ) )
            // InternalArduinoML.g:1064:1: ( 'initial' )
            {
            // InternalArduinoML.g:1064:1: ( 'initial' )
            // InternalArduinoML.g:1065:2: 'initial'
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
    // InternalArduinoML.g:1074:1: rule__App__Group_1__3 : rule__App__Group_1__3__Impl rule__App__Group_1__4 ;
    public final void rule__App__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1078:1: ( rule__App__Group_1__3__Impl rule__App__Group_1__4 )
            // InternalArduinoML.g:1079:2: rule__App__Group_1__3__Impl rule__App__Group_1__4
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
    // InternalArduinoML.g:1086:1: rule__App__Group_1__3__Impl : ( 'mode' ) ;
    public final void rule__App__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1090:1: ( ( 'mode' ) )
            // InternalArduinoML.g:1091:1: ( 'mode' )
            {
            // InternalArduinoML.g:1091:1: ( 'mode' )
            // InternalArduinoML.g:1092:2: 'mode'
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
    // InternalArduinoML.g:1101:1: rule__App__Group_1__4 : rule__App__Group_1__4__Impl rule__App__Group_1__5 ;
    public final void rule__App__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1105:1: ( rule__App__Group_1__4__Impl rule__App__Group_1__5 )
            // InternalArduinoML.g:1106:2: rule__App__Group_1__4__Impl rule__App__Group_1__5
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
    // InternalArduinoML.g:1113:1: rule__App__Group_1__4__Impl : ( ( rule__App__Initial_modeAssignment_1_4 ) ) ;
    public final void rule__App__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1117:1: ( ( ( rule__App__Initial_modeAssignment_1_4 ) ) )
            // InternalArduinoML.g:1118:1: ( ( rule__App__Initial_modeAssignment_1_4 ) )
            {
            // InternalArduinoML.g:1118:1: ( ( rule__App__Initial_modeAssignment_1_4 ) )
            // InternalArduinoML.g:1119:2: ( rule__App__Initial_modeAssignment_1_4 )
            {
             before(grammarAccess.getAppAccess().getInitial_modeAssignment_1_4()); 
            // InternalArduinoML.g:1120:2: ( rule__App__Initial_modeAssignment_1_4 )
            // InternalArduinoML.g:1120:3: rule__App__Initial_modeAssignment_1_4
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
    // InternalArduinoML.g:1128:1: rule__App__Group_1__5 : rule__App__Group_1__5__Impl rule__App__Group_1__6 ;
    public final void rule__App__Group_1__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1132:1: ( rule__App__Group_1__5__Impl rule__App__Group_1__6 )
            // InternalArduinoML.g:1133:2: rule__App__Group_1__5__Impl rule__App__Group_1__6
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
    // InternalArduinoML.g:1140:1: rule__App__Group_1__5__Impl : ( ':' ) ;
    public final void rule__App__Group_1__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1144:1: ( ( ':' ) )
            // InternalArduinoML.g:1145:1: ( ':' )
            {
            // InternalArduinoML.g:1145:1: ( ':' )
            // InternalArduinoML.g:1146:2: ':'
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
    // InternalArduinoML.g:1155:1: rule__App__Group_1__6 : rule__App__Group_1__6__Impl rule__App__Group_1__7 ;
    public final void rule__App__Group_1__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1159:1: ( rule__App__Group_1__6__Impl rule__App__Group_1__7 )
            // InternalArduinoML.g:1160:2: rule__App__Group_1__6__Impl rule__App__Group_1__7
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
    // InternalArduinoML.g:1167:1: rule__App__Group_1__6__Impl : ( 'bricks' ) ;
    public final void rule__App__Group_1__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1171:1: ( ( 'bricks' ) )
            // InternalArduinoML.g:1172:1: ( 'bricks' )
            {
            // InternalArduinoML.g:1172:1: ( 'bricks' )
            // InternalArduinoML.g:1173:2: 'bricks'
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
    // InternalArduinoML.g:1182:1: rule__App__Group_1__7 : rule__App__Group_1__7__Impl rule__App__Group_1__8 ;
    public final void rule__App__Group_1__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1186:1: ( rule__App__Group_1__7__Impl rule__App__Group_1__8 )
            // InternalArduinoML.g:1187:2: rule__App__Group_1__7__Impl rule__App__Group_1__8
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
    // InternalArduinoML.g:1194:1: rule__App__Group_1__7__Impl : ( ':' ) ;
    public final void rule__App__Group_1__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1198:1: ( ( ':' ) )
            // InternalArduinoML.g:1199:1: ( ':' )
            {
            // InternalArduinoML.g:1199:1: ( ':' )
            // InternalArduinoML.g:1200:2: ':'
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
    // InternalArduinoML.g:1209:1: rule__App__Group_1__8 : rule__App__Group_1__8__Impl rule__App__Group_1__9 ;
    public final void rule__App__Group_1__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1213:1: ( rule__App__Group_1__8__Impl rule__App__Group_1__9 )
            // InternalArduinoML.g:1214:2: rule__App__Group_1__8__Impl rule__App__Group_1__9
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
    // InternalArduinoML.g:1221:1: rule__App__Group_1__8__Impl : ( ( rule__App__BricksAssignment_1_8 ) ) ;
    public final void rule__App__Group_1__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1225:1: ( ( ( rule__App__BricksAssignment_1_8 ) ) )
            // InternalArduinoML.g:1226:1: ( ( rule__App__BricksAssignment_1_8 ) )
            {
            // InternalArduinoML.g:1226:1: ( ( rule__App__BricksAssignment_1_8 ) )
            // InternalArduinoML.g:1227:2: ( rule__App__BricksAssignment_1_8 )
            {
             before(grammarAccess.getAppAccess().getBricksAssignment_1_8()); 
            // InternalArduinoML.g:1228:2: ( rule__App__BricksAssignment_1_8 )
            // InternalArduinoML.g:1228:3: rule__App__BricksAssignment_1_8
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
    // InternalArduinoML.g:1236:1: rule__App__Group_1__9 : rule__App__Group_1__9__Impl rule__App__Group_1__10 ;
    public final void rule__App__Group_1__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1240:1: ( rule__App__Group_1__9__Impl rule__App__Group_1__10 )
            // InternalArduinoML.g:1241:2: rule__App__Group_1__9__Impl rule__App__Group_1__10
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
    // InternalArduinoML.g:1248:1: rule__App__Group_1__9__Impl : ( ( rule__App__BricksAssignment_1_9 )* ) ;
    public final void rule__App__Group_1__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1252:1: ( ( ( rule__App__BricksAssignment_1_9 )* ) )
            // InternalArduinoML.g:1253:1: ( ( rule__App__BricksAssignment_1_9 )* )
            {
            // InternalArduinoML.g:1253:1: ( ( rule__App__BricksAssignment_1_9 )* )
            // InternalArduinoML.g:1254:2: ( rule__App__BricksAssignment_1_9 )*
            {
             before(grammarAccess.getAppAccess().getBricksAssignment_1_9()); 
            // InternalArduinoML.g:1255:2: ( rule__App__BricksAssignment_1_9 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=29 && LA13_0<=31)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalArduinoML.g:1255:3: rule__App__BricksAssignment_1_9
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__App__BricksAssignment_1_9();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
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
    // InternalArduinoML.g:1263:1: rule__App__Group_1__10 : rule__App__Group_1__10__Impl rule__App__Group_1__11 ;
    public final void rule__App__Group_1__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1267:1: ( rule__App__Group_1__10__Impl rule__App__Group_1__11 )
            // InternalArduinoML.g:1268:2: rule__App__Group_1__10__Impl rule__App__Group_1__11
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
    // InternalArduinoML.g:1275:1: rule__App__Group_1__10__Impl : ( 'modes' ) ;
    public final void rule__App__Group_1__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1279:1: ( ( 'modes' ) )
            // InternalArduinoML.g:1280:1: ( 'modes' )
            {
            // InternalArduinoML.g:1280:1: ( 'modes' )
            // InternalArduinoML.g:1281:2: 'modes'
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
    // InternalArduinoML.g:1290:1: rule__App__Group_1__11 : rule__App__Group_1__11__Impl rule__App__Group_1__12 ;
    public final void rule__App__Group_1__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1294:1: ( rule__App__Group_1__11__Impl rule__App__Group_1__12 )
            // InternalArduinoML.g:1295:2: rule__App__Group_1__11__Impl rule__App__Group_1__12
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
    // InternalArduinoML.g:1302:1: rule__App__Group_1__11__Impl : ( ':' ) ;
    public final void rule__App__Group_1__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1306:1: ( ( ':' ) )
            // InternalArduinoML.g:1307:1: ( ':' )
            {
            // InternalArduinoML.g:1307:1: ( ':' )
            // InternalArduinoML.g:1308:2: ':'
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
    // InternalArduinoML.g:1317:1: rule__App__Group_1__12 : rule__App__Group_1__12__Impl rule__App__Group_1__13 ;
    public final void rule__App__Group_1__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1321:1: ( rule__App__Group_1__12__Impl rule__App__Group_1__13 )
            // InternalArduinoML.g:1322:2: rule__App__Group_1__12__Impl rule__App__Group_1__13
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
    // InternalArduinoML.g:1329:1: rule__App__Group_1__12__Impl : ( ( rule__App__ModesAssignment_1_12 ) ) ;
    public final void rule__App__Group_1__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1333:1: ( ( ( rule__App__ModesAssignment_1_12 ) ) )
            // InternalArduinoML.g:1334:1: ( ( rule__App__ModesAssignment_1_12 ) )
            {
            // InternalArduinoML.g:1334:1: ( ( rule__App__ModesAssignment_1_12 ) )
            // InternalArduinoML.g:1335:2: ( rule__App__ModesAssignment_1_12 )
            {
             before(grammarAccess.getAppAccess().getModesAssignment_1_12()); 
            // InternalArduinoML.g:1336:2: ( rule__App__ModesAssignment_1_12 )
            // InternalArduinoML.g:1336:3: rule__App__ModesAssignment_1_12
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
    // InternalArduinoML.g:1344:1: rule__App__Group_1__13 : rule__App__Group_1__13__Impl ;
    public final void rule__App__Group_1__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1348:1: ( rule__App__Group_1__13__Impl )
            // InternalArduinoML.g:1349:2: rule__App__Group_1__13__Impl
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
    // InternalArduinoML.g:1355:1: rule__App__Group_1__13__Impl : ( ( rule__App__ModesAssignment_1_13 )* ) ;
    public final void rule__App__Group_1__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1359:1: ( ( ( rule__App__ModesAssignment_1_13 )* ) )
            // InternalArduinoML.g:1360:1: ( ( rule__App__ModesAssignment_1_13 )* )
            {
            // InternalArduinoML.g:1360:1: ( ( rule__App__ModesAssignment_1_13 )* )
            // InternalArduinoML.g:1361:2: ( rule__App__ModesAssignment_1_13 )*
            {
             before(grammarAccess.getAppAccess().getModesAssignment_1_13()); 
            // InternalArduinoML.g:1362:2: ( rule__App__ModesAssignment_1_13 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=RULE_STRING && LA14_0<=RULE_ID)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalArduinoML.g:1362:3: rule__App__ModesAssignment_1_13
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__App__ModesAssignment_1_13();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
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
    // InternalArduinoML.g:1371:1: rule__Brick__Group__0 : rule__Brick__Group__0__Impl rule__Brick__Group__1 ;
    public final void rule__Brick__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1375:1: ( rule__Brick__Group__0__Impl rule__Brick__Group__1 )
            // InternalArduinoML.g:1376:2: rule__Brick__Group__0__Impl rule__Brick__Group__1
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
    // InternalArduinoML.g:1383:1: rule__Brick__Group__0__Impl : ( ( rule__Brick__Alternatives_0 ) ) ;
    public final void rule__Brick__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1387:1: ( ( ( rule__Brick__Alternatives_0 ) ) )
            // InternalArduinoML.g:1388:1: ( ( rule__Brick__Alternatives_0 ) )
            {
            // InternalArduinoML.g:1388:1: ( ( rule__Brick__Alternatives_0 ) )
            // InternalArduinoML.g:1389:2: ( rule__Brick__Alternatives_0 )
            {
             before(grammarAccess.getBrickAccess().getAlternatives_0()); 
            // InternalArduinoML.g:1390:2: ( rule__Brick__Alternatives_0 )
            // InternalArduinoML.g:1390:3: rule__Brick__Alternatives_0
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
    // InternalArduinoML.g:1398:1: rule__Brick__Group__1 : rule__Brick__Group__1__Impl rule__Brick__Group__2 ;
    public final void rule__Brick__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1402:1: ( rule__Brick__Group__1__Impl rule__Brick__Group__2 )
            // InternalArduinoML.g:1403:2: rule__Brick__Group__1__Impl rule__Brick__Group__2
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
    // InternalArduinoML.g:1410:1: rule__Brick__Group__1__Impl : ( ( rule__Brick__NameAssignment_1 ) ) ;
    public final void rule__Brick__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1414:1: ( ( ( rule__Brick__NameAssignment_1 ) ) )
            // InternalArduinoML.g:1415:1: ( ( rule__Brick__NameAssignment_1 ) )
            {
            // InternalArduinoML.g:1415:1: ( ( rule__Brick__NameAssignment_1 ) )
            // InternalArduinoML.g:1416:2: ( rule__Brick__NameAssignment_1 )
            {
             before(grammarAccess.getBrickAccess().getNameAssignment_1()); 
            // InternalArduinoML.g:1417:2: ( rule__Brick__NameAssignment_1 )
            // InternalArduinoML.g:1417:3: rule__Brick__NameAssignment_1
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
    // InternalArduinoML.g:1425:1: rule__Brick__Group__2 : rule__Brick__Group__2__Impl rule__Brick__Group__3 ;
    public final void rule__Brick__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1429:1: ( rule__Brick__Group__2__Impl rule__Brick__Group__3 )
            // InternalArduinoML.g:1430:2: rule__Brick__Group__2__Impl rule__Brick__Group__3
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
    // InternalArduinoML.g:1437:1: rule__Brick__Group__2__Impl : ( ':' ) ;
    public final void rule__Brick__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1441:1: ( ( ':' ) )
            // InternalArduinoML.g:1442:1: ( ':' )
            {
            // InternalArduinoML.g:1442:1: ( ':' )
            // InternalArduinoML.g:1443:2: ':'
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
    // InternalArduinoML.g:1452:1: rule__Brick__Group__3 : rule__Brick__Group__3__Impl ;
    public final void rule__Brick__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1456:1: ( rule__Brick__Group__3__Impl )
            // InternalArduinoML.g:1457:2: rule__Brick__Group__3__Impl
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
    // InternalArduinoML.g:1463:1: rule__Brick__Group__3__Impl : ( ( rule__Brick__PinAssignment_3 ) ) ;
    public final void rule__Brick__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1467:1: ( ( ( rule__Brick__PinAssignment_3 ) ) )
            // InternalArduinoML.g:1468:1: ( ( rule__Brick__PinAssignment_3 ) )
            {
            // InternalArduinoML.g:1468:1: ( ( rule__Brick__PinAssignment_3 ) )
            // InternalArduinoML.g:1469:2: ( rule__Brick__PinAssignment_3 )
            {
             before(grammarAccess.getBrickAccess().getPinAssignment_3()); 
            // InternalArduinoML.g:1470:2: ( rule__Brick__PinAssignment_3 )
            // InternalArduinoML.g:1470:3: rule__Brick__PinAssignment_3
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
    // InternalArduinoML.g:1479:1: rule__Mode__Group__0 : rule__Mode__Group__0__Impl rule__Mode__Group__1 ;
    public final void rule__Mode__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1483:1: ( rule__Mode__Group__0__Impl rule__Mode__Group__1 )
            // InternalArduinoML.g:1484:2: rule__Mode__Group__0__Impl rule__Mode__Group__1
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
    // InternalArduinoML.g:1491:1: rule__Mode__Group__0__Impl : ( ( rule__Mode__NameAssignment_0 ) ) ;
    public final void rule__Mode__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1495:1: ( ( ( rule__Mode__NameAssignment_0 ) ) )
            // InternalArduinoML.g:1496:1: ( ( rule__Mode__NameAssignment_0 ) )
            {
            // InternalArduinoML.g:1496:1: ( ( rule__Mode__NameAssignment_0 ) )
            // InternalArduinoML.g:1497:2: ( rule__Mode__NameAssignment_0 )
            {
             before(grammarAccess.getModeAccess().getNameAssignment_0()); 
            // InternalArduinoML.g:1498:2: ( rule__Mode__NameAssignment_0 )
            // InternalArduinoML.g:1498:3: rule__Mode__NameAssignment_0
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
    // InternalArduinoML.g:1506:1: rule__Mode__Group__1 : rule__Mode__Group__1__Impl rule__Mode__Group__2 ;
    public final void rule__Mode__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1510:1: ( rule__Mode__Group__1__Impl rule__Mode__Group__2 )
            // InternalArduinoML.g:1511:2: rule__Mode__Group__1__Impl rule__Mode__Group__2
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
    // InternalArduinoML.g:1518:1: rule__Mode__Group__1__Impl : ( 'initial' ) ;
    public final void rule__Mode__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1522:1: ( ( 'initial' ) )
            // InternalArduinoML.g:1523:1: ( 'initial' )
            {
            // InternalArduinoML.g:1523:1: ( 'initial' )
            // InternalArduinoML.g:1524:2: 'initial'
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
    // InternalArduinoML.g:1533:1: rule__Mode__Group__2 : rule__Mode__Group__2__Impl rule__Mode__Group__3 ;
    public final void rule__Mode__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1537:1: ( rule__Mode__Group__2__Impl rule__Mode__Group__3 )
            // InternalArduinoML.g:1538:2: rule__Mode__Group__2__Impl rule__Mode__Group__3
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
    // InternalArduinoML.g:1545:1: rule__Mode__Group__2__Impl : ( 'state' ) ;
    public final void rule__Mode__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1549:1: ( ( 'state' ) )
            // InternalArduinoML.g:1550:1: ( 'state' )
            {
            // InternalArduinoML.g:1550:1: ( 'state' )
            // InternalArduinoML.g:1551:2: 'state'
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
    // InternalArduinoML.g:1560:1: rule__Mode__Group__3 : rule__Mode__Group__3__Impl rule__Mode__Group__4 ;
    public final void rule__Mode__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1564:1: ( rule__Mode__Group__3__Impl rule__Mode__Group__4 )
            // InternalArduinoML.g:1565:2: rule__Mode__Group__3__Impl rule__Mode__Group__4
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
    // InternalArduinoML.g:1572:1: rule__Mode__Group__3__Impl : ( ( rule__Mode__InitialAssignment_3 ) ) ;
    public final void rule__Mode__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1576:1: ( ( ( rule__Mode__InitialAssignment_3 ) ) )
            // InternalArduinoML.g:1577:1: ( ( rule__Mode__InitialAssignment_3 ) )
            {
            // InternalArduinoML.g:1577:1: ( ( rule__Mode__InitialAssignment_3 ) )
            // InternalArduinoML.g:1578:2: ( rule__Mode__InitialAssignment_3 )
            {
             before(grammarAccess.getModeAccess().getInitialAssignment_3()); 
            // InternalArduinoML.g:1579:2: ( rule__Mode__InitialAssignment_3 )
            // InternalArduinoML.g:1579:3: rule__Mode__InitialAssignment_3
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
    // InternalArduinoML.g:1587:1: rule__Mode__Group__4 : rule__Mode__Group__4__Impl rule__Mode__Group__5 ;
    public final void rule__Mode__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1591:1: ( rule__Mode__Group__4__Impl rule__Mode__Group__5 )
            // InternalArduinoML.g:1592:2: rule__Mode__Group__4__Impl rule__Mode__Group__5
            {
            pushFollow(FOLLOW_7);
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
    // InternalArduinoML.g:1599:1: rule__Mode__Group__4__Impl : ( ':' ) ;
    public final void rule__Mode__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1603:1: ( ( ':' ) )
            // InternalArduinoML.g:1604:1: ( ':' )
            {
            // InternalArduinoML.g:1604:1: ( ':' )
            // InternalArduinoML.g:1605:2: ':'
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
    // InternalArduinoML.g:1614:1: rule__Mode__Group__5 : rule__Mode__Group__5__Impl rule__Mode__Group__6 ;
    public final void rule__Mode__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1618:1: ( rule__Mode__Group__5__Impl rule__Mode__Group__6 )
            // InternalArduinoML.g:1619:2: rule__Mode__Group__5__Impl rule__Mode__Group__6
            {
            pushFollow(FOLLOW_6);
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
    // InternalArduinoML.g:1626:1: rule__Mode__Group__5__Impl : ( 'bricks' ) ;
    public final void rule__Mode__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1630:1: ( ( 'bricks' ) )
            // InternalArduinoML.g:1631:1: ( 'bricks' )
            {
            // InternalArduinoML.g:1631:1: ( 'bricks' )
            // InternalArduinoML.g:1632:2: 'bricks'
            {
             before(grammarAccess.getModeAccess().getBricksKeyword_5()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getModeAccess().getBricksKeyword_5()); 

            }


            }

        }
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
    // InternalArduinoML.g:1641:1: rule__Mode__Group__6 : rule__Mode__Group__6__Impl rule__Mode__Group__7 ;
    public final void rule__Mode__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1645:1: ( rule__Mode__Group__6__Impl rule__Mode__Group__7 )
            // InternalArduinoML.g:1646:2: rule__Mode__Group__6__Impl rule__Mode__Group__7
            {
            pushFollow(FOLLOW_8);
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
    // InternalArduinoML.g:1653:1: rule__Mode__Group__6__Impl : ( ':' ) ;
    public final void rule__Mode__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1657:1: ( ( ':' ) )
            // InternalArduinoML.g:1658:1: ( ':' )
            {
            // InternalArduinoML.g:1658:1: ( ':' )
            // InternalArduinoML.g:1659:2: ':'
            {
             before(grammarAccess.getModeAccess().getColonKeyword_6()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getModeAccess().getColonKeyword_6()); 

            }


            }

        }
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
    // InternalArduinoML.g:1668:1: rule__Mode__Group__7 : rule__Mode__Group__7__Impl rule__Mode__Group__8 ;
    public final void rule__Mode__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1672:1: ( rule__Mode__Group__7__Impl rule__Mode__Group__8 )
            // InternalArduinoML.g:1673:2: rule__Mode__Group__7__Impl rule__Mode__Group__8
            {
            pushFollow(FOLLOW_9);
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
    // InternalArduinoML.g:1680:1: rule__Mode__Group__7__Impl : ( ( rule__Mode__BricksAssignment_7 ) ) ;
    public final void rule__Mode__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1684:1: ( ( ( rule__Mode__BricksAssignment_7 ) ) )
            // InternalArduinoML.g:1685:1: ( ( rule__Mode__BricksAssignment_7 ) )
            {
            // InternalArduinoML.g:1685:1: ( ( rule__Mode__BricksAssignment_7 ) )
            // InternalArduinoML.g:1686:2: ( rule__Mode__BricksAssignment_7 )
            {
             before(grammarAccess.getModeAccess().getBricksAssignment_7()); 
            // InternalArduinoML.g:1687:2: ( rule__Mode__BricksAssignment_7 )
            // InternalArduinoML.g:1687:3: rule__Mode__BricksAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Mode__BricksAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getModeAccess().getBricksAssignment_7()); 

            }


            }

        }
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
    // InternalArduinoML.g:1695:1: rule__Mode__Group__8 : rule__Mode__Group__8__Impl rule__Mode__Group__9 ;
    public final void rule__Mode__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1699:1: ( rule__Mode__Group__8__Impl rule__Mode__Group__9 )
            // InternalArduinoML.g:1700:2: rule__Mode__Group__8__Impl rule__Mode__Group__9
            {
            pushFollow(FOLLOW_9);
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
    // InternalArduinoML.g:1707:1: rule__Mode__Group__8__Impl : ( ( rule__Mode__BricksAssignment_8 )* ) ;
    public final void rule__Mode__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1711:1: ( ( ( rule__Mode__BricksAssignment_8 )* ) )
            // InternalArduinoML.g:1712:1: ( ( rule__Mode__BricksAssignment_8 )* )
            {
            // InternalArduinoML.g:1712:1: ( ( rule__Mode__BricksAssignment_8 )* )
            // InternalArduinoML.g:1713:2: ( rule__Mode__BricksAssignment_8 )*
            {
             before(grammarAccess.getModeAccess().getBricksAssignment_8()); 
            // InternalArduinoML.g:1714:2: ( rule__Mode__BricksAssignment_8 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=29 && LA15_0<=31)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalArduinoML.g:1714:3: rule__Mode__BricksAssignment_8
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Mode__BricksAssignment_8();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getModeAccess().getBricksAssignment_8()); 

            }


            }

        }
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
    // InternalArduinoML.g:1722:1: rule__Mode__Group__9 : rule__Mode__Group__9__Impl rule__Mode__Group__10 ;
    public final void rule__Mode__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1726:1: ( rule__Mode__Group__9__Impl rule__Mode__Group__10 )
            // InternalArduinoML.g:1727:2: rule__Mode__Group__9__Impl rule__Mode__Group__10
            {
            pushFollow(FOLLOW_6);
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
    // InternalArduinoML.g:1734:1: rule__Mode__Group__9__Impl : ( 'states' ) ;
    public final void rule__Mode__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1738:1: ( ( 'states' ) )
            // InternalArduinoML.g:1739:1: ( 'states' )
            {
            // InternalArduinoML.g:1739:1: ( 'states' )
            // InternalArduinoML.g:1740:2: 'states'
            {
             before(grammarAccess.getModeAccess().getStatesKeyword_9()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getModeAccess().getStatesKeyword_9()); 

            }


            }

        }
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
    // InternalArduinoML.g:1749:1: rule__Mode__Group__10 : rule__Mode__Group__10__Impl rule__Mode__Group__11 ;
    public final void rule__Mode__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1753:1: ( rule__Mode__Group__10__Impl rule__Mode__Group__11 )
            // InternalArduinoML.g:1754:2: rule__Mode__Group__10__Impl rule__Mode__Group__11
            {
            pushFollow(FOLLOW_3);
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
    // InternalArduinoML.g:1761:1: rule__Mode__Group__10__Impl : ( ':' ) ;
    public final void rule__Mode__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1765:1: ( ( ':' ) )
            // InternalArduinoML.g:1766:1: ( ':' )
            {
            // InternalArduinoML.g:1766:1: ( ':' )
            // InternalArduinoML.g:1767:2: ':'
            {
             before(grammarAccess.getModeAccess().getColonKeyword_10()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getModeAccess().getColonKeyword_10()); 

            }


            }

        }
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
    // InternalArduinoML.g:1776:1: rule__Mode__Group__11 : rule__Mode__Group__11__Impl rule__Mode__Group__12 ;
    public final void rule__Mode__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1780:1: ( rule__Mode__Group__11__Impl rule__Mode__Group__12 )
            // InternalArduinoML.g:1781:2: rule__Mode__Group__11__Impl rule__Mode__Group__12
            {
            pushFollow(FOLLOW_3);
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
    // InternalArduinoML.g:1788:1: rule__Mode__Group__11__Impl : ( ( rule__Mode__StatesAssignment_11 ) ) ;
    public final void rule__Mode__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1792:1: ( ( ( rule__Mode__StatesAssignment_11 ) ) )
            // InternalArduinoML.g:1793:1: ( ( rule__Mode__StatesAssignment_11 ) )
            {
            // InternalArduinoML.g:1793:1: ( ( rule__Mode__StatesAssignment_11 ) )
            // InternalArduinoML.g:1794:2: ( rule__Mode__StatesAssignment_11 )
            {
             before(grammarAccess.getModeAccess().getStatesAssignment_11()); 
            // InternalArduinoML.g:1795:2: ( rule__Mode__StatesAssignment_11 )
            // InternalArduinoML.g:1795:3: rule__Mode__StatesAssignment_11
            {
            pushFollow(FOLLOW_2);
            rule__Mode__StatesAssignment_11();

            state._fsp--;


            }

             after(grammarAccess.getModeAccess().getStatesAssignment_11()); 

            }


            }

        }
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
    // InternalArduinoML.g:1803:1: rule__Mode__Group__12 : rule__Mode__Group__12__Impl ;
    public final void rule__Mode__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1807:1: ( rule__Mode__Group__12__Impl )
            // InternalArduinoML.g:1808:2: rule__Mode__Group__12__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Mode__Group__12__Impl();

            state._fsp--;


            }

        }
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
    // InternalArduinoML.g:1814:1: rule__Mode__Group__12__Impl : ( ( rule__Mode__StatesAssignment_12 )* ) ;
    public final void rule__Mode__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1818:1: ( ( ( rule__Mode__StatesAssignment_12 )* ) )
            // InternalArduinoML.g:1819:1: ( ( rule__Mode__StatesAssignment_12 )* )
            {
            // InternalArduinoML.g:1819:1: ( ( rule__Mode__StatesAssignment_12 )* )
            // InternalArduinoML.g:1820:2: ( rule__Mode__StatesAssignment_12 )*
            {
             before(grammarAccess.getModeAccess().getStatesAssignment_12()); 
            // InternalArduinoML.g:1821:2: ( rule__Mode__StatesAssignment_12 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_STRING) ) {
                    int LA16_2 = input.LA(2);

                    if ( (LA16_2==24) ) {
                        alt16=1;
                    }


                }
                else if ( (LA16_0==RULE_ID) ) {
                    int LA16_3 = input.LA(2);

                    if ( (LA16_3==24) ) {
                        alt16=1;
                    }


                }


                switch (alt16) {
            	case 1 :
            	    // InternalArduinoML.g:1821:3: rule__Mode__StatesAssignment_12
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Mode__StatesAssignment_12();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getModeAccess().getStatesAssignment_12()); 

            }


            }

        }
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


    // $ANTLR start "rule__State__Group__0"
    // InternalArduinoML.g:1830:1: rule__State__Group__0 : rule__State__Group__0__Impl rule__State__Group__1 ;
    public final void rule__State__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1834:1: ( rule__State__Group__0__Impl rule__State__Group__1 )
            // InternalArduinoML.g:1835:2: rule__State__Group__0__Impl rule__State__Group__1
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
    // InternalArduinoML.g:1842:1: rule__State__Group__0__Impl : ( ( rule__State__NameAssignment_0 ) ) ;
    public final void rule__State__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1846:1: ( ( ( rule__State__NameAssignment_0 ) ) )
            // InternalArduinoML.g:1847:1: ( ( rule__State__NameAssignment_0 ) )
            {
            // InternalArduinoML.g:1847:1: ( ( rule__State__NameAssignment_0 ) )
            // InternalArduinoML.g:1848:2: ( rule__State__NameAssignment_0 )
            {
             before(grammarAccess.getStateAccess().getNameAssignment_0()); 
            // InternalArduinoML.g:1849:2: ( rule__State__NameAssignment_0 )
            // InternalArduinoML.g:1849:3: rule__State__NameAssignment_0
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
    // InternalArduinoML.g:1857:1: rule__State__Group__1 : rule__State__Group__1__Impl rule__State__Group__2 ;
    public final void rule__State__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1861:1: ( rule__State__Group__1__Impl rule__State__Group__2 )
            // InternalArduinoML.g:1862:2: rule__State__Group__1__Impl rule__State__Group__2
            {
            pushFollow(FOLLOW_15);
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
    // InternalArduinoML.g:1869:1: rule__State__Group__1__Impl : ( ':' ) ;
    public final void rule__State__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1873:1: ( ( ':' ) )
            // InternalArduinoML.g:1874:1: ( ':' )
            {
            // InternalArduinoML.g:1874:1: ( ':' )
            // InternalArduinoML.g:1875:2: ':'
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
    // InternalArduinoML.g:1884:1: rule__State__Group__2 : rule__State__Group__2__Impl rule__State__Group__3 ;
    public final void rule__State__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1888:1: ( rule__State__Group__2__Impl rule__State__Group__3 )
            // InternalArduinoML.g:1889:2: rule__State__Group__2__Impl rule__State__Group__3
            {
            pushFollow(FOLLOW_16);
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
    // InternalArduinoML.g:1896:1: rule__State__Group__2__Impl : ( ( rule__State__ActionsAssignment_2 ) ) ;
    public final void rule__State__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1900:1: ( ( ( rule__State__ActionsAssignment_2 ) ) )
            // InternalArduinoML.g:1901:1: ( ( rule__State__ActionsAssignment_2 ) )
            {
            // InternalArduinoML.g:1901:1: ( ( rule__State__ActionsAssignment_2 ) )
            // InternalArduinoML.g:1902:2: ( rule__State__ActionsAssignment_2 )
            {
             before(grammarAccess.getStateAccess().getActionsAssignment_2()); 
            // InternalArduinoML.g:1903:2: ( rule__State__ActionsAssignment_2 )
            // InternalArduinoML.g:1903:3: rule__State__ActionsAssignment_2
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
    // InternalArduinoML.g:1911:1: rule__State__Group__3 : rule__State__Group__3__Impl rule__State__Group__4 ;
    public final void rule__State__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1915:1: ( rule__State__Group__3__Impl rule__State__Group__4 )
            // InternalArduinoML.g:1916:2: rule__State__Group__3__Impl rule__State__Group__4
            {
            pushFollow(FOLLOW_16);
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
    // InternalArduinoML.g:1923:1: rule__State__Group__3__Impl : ( ( rule__State__ActionsAssignment_3 )* ) ;
    public final void rule__State__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1927:1: ( ( ( rule__State__ActionsAssignment_3 )* ) )
            // InternalArduinoML.g:1928:1: ( ( rule__State__ActionsAssignment_3 )* )
            {
            // InternalArduinoML.g:1928:1: ( ( rule__State__ActionsAssignment_3 )* )
            // InternalArduinoML.g:1929:2: ( rule__State__ActionsAssignment_3 )*
            {
             before(grammarAccess.getStateAccess().getActionsAssignment_3()); 
            // InternalArduinoML.g:1930:2: ( rule__State__ActionsAssignment_3 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==32) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalArduinoML.g:1930:3: rule__State__ActionsAssignment_3
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__State__ActionsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
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
    // InternalArduinoML.g:1938:1: rule__State__Group__4 : rule__State__Group__4__Impl rule__State__Group__5 ;
    public final void rule__State__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1942:1: ( rule__State__Group__4__Impl rule__State__Group__5 )
            // InternalArduinoML.g:1943:2: rule__State__Group__4__Impl rule__State__Group__5
            {
            pushFollow(FOLLOW_16);
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
    // InternalArduinoML.g:1950:1: rule__State__Group__4__Impl : ( ( rule__State__TransitionsAssignment_4 ) ) ;
    public final void rule__State__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1954:1: ( ( ( rule__State__TransitionsAssignment_4 ) ) )
            // InternalArduinoML.g:1955:1: ( ( rule__State__TransitionsAssignment_4 ) )
            {
            // InternalArduinoML.g:1955:1: ( ( rule__State__TransitionsAssignment_4 ) )
            // InternalArduinoML.g:1956:2: ( rule__State__TransitionsAssignment_4 )
            {
             before(grammarAccess.getStateAccess().getTransitionsAssignment_4()); 
            // InternalArduinoML.g:1957:2: ( rule__State__TransitionsAssignment_4 )
            // InternalArduinoML.g:1957:3: rule__State__TransitionsAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__State__TransitionsAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getStateAccess().getTransitionsAssignment_4()); 

            }


            }

        }
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
    // InternalArduinoML.g:1965:1: rule__State__Group__5 : rule__State__Group__5__Impl ;
    public final void rule__State__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1969:1: ( rule__State__Group__5__Impl )
            // InternalArduinoML.g:1970:2: rule__State__Group__5__Impl
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
    // InternalArduinoML.g:1976:1: rule__State__Group__5__Impl : ( ( rule__State__TransitionsAssignment_5 )* ) ;
    public final void rule__State__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1980:1: ( ( ( rule__State__TransitionsAssignment_5 )* ) )
            // InternalArduinoML.g:1981:1: ( ( rule__State__TransitionsAssignment_5 )* )
            {
            // InternalArduinoML.g:1981:1: ( ( rule__State__TransitionsAssignment_5 )* )
            // InternalArduinoML.g:1982:2: ( rule__State__TransitionsAssignment_5 )*
            {
             before(grammarAccess.getStateAccess().getTransitionsAssignment_5()); 
            // InternalArduinoML.g:1983:2: ( rule__State__TransitionsAssignment_5 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==35||LA18_0==38) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalArduinoML.g:1983:3: rule__State__TransitionsAssignment_5
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__State__TransitionsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getStateAccess().getTransitionsAssignment_5()); 

            }


            }

        }
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
    // InternalArduinoML.g:1992:1: rule__Actuator__Group__0 : rule__Actuator__Group__0__Impl rule__Actuator__Group__1 ;
    public final void rule__Actuator__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1996:1: ( rule__Actuator__Group__0__Impl rule__Actuator__Group__1 )
            // InternalArduinoML.g:1997:2: rule__Actuator__Group__0__Impl rule__Actuator__Group__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalArduinoML.g:2004:1: rule__Actuator__Group__0__Impl : ( () ) ;
    public final void rule__Actuator__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2008:1: ( ( () ) )
            // InternalArduinoML.g:2009:1: ( () )
            {
            // InternalArduinoML.g:2009:1: ( () )
            // InternalArduinoML.g:2010:2: ()
            {
             before(grammarAccess.getActuatorAccess().getActuatorAction_0()); 
            // InternalArduinoML.g:2011:2: ()
            // InternalArduinoML.g:2011:3: 
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
    // InternalArduinoML.g:2019:1: rule__Actuator__Group__1 : rule__Actuator__Group__1__Impl ;
    public final void rule__Actuator__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2023:1: ( rule__Actuator__Group__1__Impl )
            // InternalArduinoML.g:2024:2: rule__Actuator__Group__1__Impl
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
    // InternalArduinoML.g:2030:1: rule__Actuator__Group__1__Impl : ( 'Actuator' ) ;
    public final void rule__Actuator__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2034:1: ( ( 'Actuator' ) )
            // InternalArduinoML.g:2035:1: ( 'Actuator' )
            {
            // InternalArduinoML.g:2035:1: ( 'Actuator' )
            // InternalArduinoML.g:2036:2: 'Actuator'
            {
             before(grammarAccess.getActuatorAccess().getActuatorKeyword_1()); 
            match(input,29,FOLLOW_2); 
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
    // InternalArduinoML.g:2046:1: rule__Digital__Group__0 : rule__Digital__Group__0__Impl rule__Digital__Group__1 ;
    public final void rule__Digital__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2050:1: ( rule__Digital__Group__0__Impl rule__Digital__Group__1 )
            // InternalArduinoML.g:2051:2: rule__Digital__Group__0__Impl rule__Digital__Group__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalArduinoML.g:2058:1: rule__Digital__Group__0__Impl : ( () ) ;
    public final void rule__Digital__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2062:1: ( ( () ) )
            // InternalArduinoML.g:2063:1: ( () )
            {
            // InternalArduinoML.g:2063:1: ( () )
            // InternalArduinoML.g:2064:2: ()
            {
             before(grammarAccess.getDigitalAccess().getDigitalAction_0()); 
            // InternalArduinoML.g:2065:2: ()
            // InternalArduinoML.g:2065:3: 
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
    // InternalArduinoML.g:2073:1: rule__Digital__Group__1 : rule__Digital__Group__1__Impl ;
    public final void rule__Digital__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2077:1: ( rule__Digital__Group__1__Impl )
            // InternalArduinoML.g:2078:2: rule__Digital__Group__1__Impl
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
    // InternalArduinoML.g:2084:1: rule__Digital__Group__1__Impl : ( 'Digital' ) ;
    public final void rule__Digital__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2088:1: ( ( 'Digital' ) )
            // InternalArduinoML.g:2089:1: ( 'Digital' )
            {
            // InternalArduinoML.g:2089:1: ( 'Digital' )
            // InternalArduinoML.g:2090:2: 'Digital'
            {
             before(grammarAccess.getDigitalAccess().getDigitalKeyword_1()); 
            match(input,30,FOLLOW_2); 
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
    // InternalArduinoML.g:2100:1: rule__Analog__Group__0 : rule__Analog__Group__0__Impl rule__Analog__Group__1 ;
    public final void rule__Analog__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2104:1: ( rule__Analog__Group__0__Impl rule__Analog__Group__1 )
            // InternalArduinoML.g:2105:2: rule__Analog__Group__0__Impl rule__Analog__Group__1
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
    // InternalArduinoML.g:2112:1: rule__Analog__Group__0__Impl : ( () ) ;
    public final void rule__Analog__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2116:1: ( ( () ) )
            // InternalArduinoML.g:2117:1: ( () )
            {
            // InternalArduinoML.g:2117:1: ( () )
            // InternalArduinoML.g:2118:2: ()
            {
             before(grammarAccess.getAnalogAccess().getAnalogAction_0()); 
            // InternalArduinoML.g:2119:2: ()
            // InternalArduinoML.g:2119:3: 
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
    // InternalArduinoML.g:2127:1: rule__Analog__Group__1 : rule__Analog__Group__1__Impl ;
    public final void rule__Analog__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2131:1: ( rule__Analog__Group__1__Impl )
            // InternalArduinoML.g:2132:2: rule__Analog__Group__1__Impl
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
    // InternalArduinoML.g:2138:1: rule__Analog__Group__1__Impl : ( 'Analog' ) ;
    public final void rule__Analog__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2142:1: ( ( 'Analog' ) )
            // InternalArduinoML.g:2143:1: ( 'Analog' )
            {
            // InternalArduinoML.g:2143:1: ( 'Analog' )
            // InternalArduinoML.g:2144:2: 'Analog'
            {
             before(grammarAccess.getAnalogAccess().getAnalogKeyword_1()); 
            match(input,31,FOLLOW_2); 
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
    // InternalArduinoML.g:2154:1: rule__Action__Group__0 : rule__Action__Group__0__Impl rule__Action__Group__1 ;
    public final void rule__Action__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2158:1: ( rule__Action__Group__0__Impl rule__Action__Group__1 )
            // InternalArduinoML.g:2159:2: rule__Action__Group__0__Impl rule__Action__Group__1
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
    // InternalArduinoML.g:2166:1: rule__Action__Group__0__Impl : ( 'change' ) ;
    public final void rule__Action__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2170:1: ( ( 'change' ) )
            // InternalArduinoML.g:2171:1: ( 'change' )
            {
            // InternalArduinoML.g:2171:1: ( 'change' )
            // InternalArduinoML.g:2172:2: 'change'
            {
             before(grammarAccess.getActionAccess().getChangeKeyword_0()); 
            match(input,32,FOLLOW_2); 
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
    // InternalArduinoML.g:2181:1: rule__Action__Group__1 : rule__Action__Group__1__Impl rule__Action__Group__2 ;
    public final void rule__Action__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2185:1: ( rule__Action__Group__1__Impl rule__Action__Group__2 )
            // InternalArduinoML.g:2186:2: rule__Action__Group__1__Impl rule__Action__Group__2
            {
            pushFollow(FOLLOW_21);
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
    // InternalArduinoML.g:2193:1: rule__Action__Group__1__Impl : ( ( rule__Action__ActuatorAssignment_1 ) ) ;
    public final void rule__Action__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2197:1: ( ( ( rule__Action__ActuatorAssignment_1 ) ) )
            // InternalArduinoML.g:2198:1: ( ( rule__Action__ActuatorAssignment_1 ) )
            {
            // InternalArduinoML.g:2198:1: ( ( rule__Action__ActuatorAssignment_1 ) )
            // InternalArduinoML.g:2199:2: ( rule__Action__ActuatorAssignment_1 )
            {
             before(grammarAccess.getActionAccess().getActuatorAssignment_1()); 
            // InternalArduinoML.g:2200:2: ( rule__Action__ActuatorAssignment_1 )
            // InternalArduinoML.g:2200:3: rule__Action__ActuatorAssignment_1
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
    // InternalArduinoML.g:2208:1: rule__Action__Group__2 : rule__Action__Group__2__Impl rule__Action__Group__3 ;
    public final void rule__Action__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2212:1: ( rule__Action__Group__2__Impl rule__Action__Group__3 )
            // InternalArduinoML.g:2213:2: rule__Action__Group__2__Impl rule__Action__Group__3
            {
            pushFollow(FOLLOW_22);
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
    // InternalArduinoML.g:2220:1: rule__Action__Group__2__Impl : ( 'to' ) ;
    public final void rule__Action__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2224:1: ( ( 'to' ) )
            // InternalArduinoML.g:2225:1: ( 'to' )
            {
            // InternalArduinoML.g:2225:1: ( 'to' )
            // InternalArduinoML.g:2226:2: 'to'
            {
             before(grammarAccess.getActionAccess().getToKeyword_2()); 
            match(input,33,FOLLOW_2); 
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
    // InternalArduinoML.g:2235:1: rule__Action__Group__3 : rule__Action__Group__3__Impl ;
    public final void rule__Action__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2239:1: ( rule__Action__Group__3__Impl )
            // InternalArduinoML.g:2240:2: rule__Action__Group__3__Impl
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
    // InternalArduinoML.g:2246:1: rule__Action__Group__3__Impl : ( ( rule__Action__ValueAssignment_3 ) ) ;
    public final void rule__Action__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2250:1: ( ( ( rule__Action__ValueAssignment_3 ) ) )
            // InternalArduinoML.g:2251:1: ( ( rule__Action__ValueAssignment_3 ) )
            {
            // InternalArduinoML.g:2251:1: ( ( rule__Action__ValueAssignment_3 ) )
            // InternalArduinoML.g:2252:2: ( rule__Action__ValueAssignment_3 )
            {
             before(grammarAccess.getActionAccess().getValueAssignment_3()); 
            // InternalArduinoML.g:2253:2: ( rule__Action__ValueAssignment_3 )
            // InternalArduinoML.g:2253:3: rule__Action__ValueAssignment_3
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


    // $ANTLR start "rule__Transition__Group__0"
    // InternalArduinoML.g:2262:1: rule__Transition__Group__0 : rule__Transition__Group__0__Impl rule__Transition__Group__1 ;
    public final void rule__Transition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2266:1: ( rule__Transition__Group__0__Impl rule__Transition__Group__1 )
            // InternalArduinoML.g:2267:2: rule__Transition__Group__0__Impl rule__Transition__Group__1
            {
            pushFollow(FOLLOW_23);
            rule__Transition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__0"


    // $ANTLR start "rule__Transition__Group__0__Impl"
    // InternalArduinoML.g:2274:1: rule__Transition__Group__0__Impl : ( ( rule__Transition__Alternatives_0 ) ) ;
    public final void rule__Transition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2278:1: ( ( ( rule__Transition__Alternatives_0 ) ) )
            // InternalArduinoML.g:2279:1: ( ( rule__Transition__Alternatives_0 ) )
            {
            // InternalArduinoML.g:2279:1: ( ( rule__Transition__Alternatives_0 ) )
            // InternalArduinoML.g:2280:2: ( rule__Transition__Alternatives_0 )
            {
             before(grammarAccess.getTransitionAccess().getAlternatives_0()); 
            // InternalArduinoML.g:2281:2: ( rule__Transition__Alternatives_0 )
            // InternalArduinoML.g:2281:3: rule__Transition__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__Transition__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__0__Impl"


    // $ANTLR start "rule__Transition__Group__1"
    // InternalArduinoML.g:2289:1: rule__Transition__Group__1 : rule__Transition__Group__1__Impl rule__Transition__Group__2 ;
    public final void rule__Transition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2293:1: ( rule__Transition__Group__1__Impl rule__Transition__Group__2 )
            // InternalArduinoML.g:2294:2: rule__Transition__Group__1__Impl rule__Transition__Group__2
            {
            pushFollow(FOLLOW_21);
            rule__Transition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__1"


    // $ANTLR start "rule__Transition__Group__1__Impl"
    // InternalArduinoML.g:2301:1: rule__Transition__Group__1__Impl : ( 'go' ) ;
    public final void rule__Transition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2305:1: ( ( 'go' ) )
            // InternalArduinoML.g:2306:1: ( 'go' )
            {
            // InternalArduinoML.g:2306:1: ( 'go' )
            // InternalArduinoML.g:2307:2: 'go'
            {
             before(grammarAccess.getTransitionAccess().getGoKeyword_1()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getGoKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__1__Impl"


    // $ANTLR start "rule__Transition__Group__2"
    // InternalArduinoML.g:2316:1: rule__Transition__Group__2 : rule__Transition__Group__2__Impl rule__Transition__Group__3 ;
    public final void rule__Transition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2320:1: ( rule__Transition__Group__2__Impl rule__Transition__Group__3 )
            // InternalArduinoML.g:2321:2: rule__Transition__Group__2__Impl rule__Transition__Group__3
            {
            pushFollow(FOLLOW_24);
            rule__Transition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__2"


    // $ANTLR start "rule__Transition__Group__2__Impl"
    // InternalArduinoML.g:2328:1: rule__Transition__Group__2__Impl : ( 'to' ) ;
    public final void rule__Transition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2332:1: ( ( 'to' ) )
            // InternalArduinoML.g:2333:1: ( 'to' )
            {
            // InternalArduinoML.g:2333:1: ( 'to' )
            // InternalArduinoML.g:2334:2: 'to'
            {
             before(grammarAccess.getTransitionAccess().getToKeyword_2()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getToKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__2__Impl"


    // $ANTLR start "rule__Transition__Group__3"
    // InternalArduinoML.g:2343:1: rule__Transition__Group__3 : rule__Transition__Group__3__Impl ;
    public final void rule__Transition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2347:1: ( rule__Transition__Group__3__Impl )
            // InternalArduinoML.g:2348:2: rule__Transition__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Transition__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__3"


    // $ANTLR start "rule__Transition__Group__3__Impl"
    // InternalArduinoML.g:2354:1: rule__Transition__Group__3__Impl : ( ( rule__Transition__Alternatives_3 ) ) ;
    public final void rule__Transition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2358:1: ( ( ( rule__Transition__Alternatives_3 ) ) )
            // InternalArduinoML.g:2359:1: ( ( rule__Transition__Alternatives_3 ) )
            {
            // InternalArduinoML.g:2359:1: ( ( rule__Transition__Alternatives_3 ) )
            // InternalArduinoML.g:2360:2: ( rule__Transition__Alternatives_3 )
            {
             before(grammarAccess.getTransitionAccess().getAlternatives_3()); 
            // InternalArduinoML.g:2361:2: ( rule__Transition__Alternatives_3 )
            // InternalArduinoML.g:2361:3: rule__Transition__Alternatives_3
            {
            pushFollow(FOLLOW_2);
            rule__Transition__Alternatives_3();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getAlternatives_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__3__Impl"


    // $ANTLR start "rule__Transition__Group_0_0__0"
    // InternalArduinoML.g:2370:1: rule__Transition__Group_0_0__0 : rule__Transition__Group_0_0__0__Impl rule__Transition__Group_0_0__1 ;
    public final void rule__Transition__Group_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2374:1: ( rule__Transition__Group_0_0__0__Impl rule__Transition__Group_0_0__1 )
            // InternalArduinoML.g:2375:2: rule__Transition__Group_0_0__0__Impl rule__Transition__Group_0_0__1
            {
            pushFollow(FOLLOW_3);
            rule__Transition__Group_0_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group_0_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_0_0__0"


    // $ANTLR start "rule__Transition__Group_0_0__0__Impl"
    // InternalArduinoML.g:2382:1: rule__Transition__Group_0_0__0__Impl : ( 'when' ) ;
    public final void rule__Transition__Group_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2386:1: ( ( 'when' ) )
            // InternalArduinoML.g:2387:1: ( 'when' )
            {
            // InternalArduinoML.g:2387:1: ( 'when' )
            // InternalArduinoML.g:2388:2: 'when'
            {
             before(grammarAccess.getTransitionAccess().getWhenKeyword_0_0_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getWhenKeyword_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_0_0__0__Impl"


    // $ANTLR start "rule__Transition__Group_0_0__1"
    // InternalArduinoML.g:2397:1: rule__Transition__Group_0_0__1 : rule__Transition__Group_0_0__1__Impl rule__Transition__Group_0_0__2 ;
    public final void rule__Transition__Group_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2401:1: ( rule__Transition__Group_0_0__1__Impl rule__Transition__Group_0_0__2 )
            // InternalArduinoML.g:2402:2: rule__Transition__Group_0_0__1__Impl rule__Transition__Group_0_0__2
            {
            pushFollow(FOLLOW_25);
            rule__Transition__Group_0_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group_0_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_0_0__1"


    // $ANTLR start "rule__Transition__Group_0_0__1__Impl"
    // InternalArduinoML.g:2409:1: rule__Transition__Group_0_0__1__Impl : ( ( rule__Transition__Alternatives_0_0_1 ) ) ;
    public final void rule__Transition__Group_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2413:1: ( ( ( rule__Transition__Alternatives_0_0_1 ) ) )
            // InternalArduinoML.g:2414:1: ( ( rule__Transition__Alternatives_0_0_1 ) )
            {
            // InternalArduinoML.g:2414:1: ( ( rule__Transition__Alternatives_0_0_1 ) )
            // InternalArduinoML.g:2415:2: ( rule__Transition__Alternatives_0_0_1 )
            {
             before(grammarAccess.getTransitionAccess().getAlternatives_0_0_1()); 
            // InternalArduinoML.g:2416:2: ( rule__Transition__Alternatives_0_0_1 )
            // InternalArduinoML.g:2416:3: rule__Transition__Alternatives_0_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Transition__Alternatives_0_0_1();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getAlternatives_0_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_0_0__1__Impl"


    // $ANTLR start "rule__Transition__Group_0_0__2"
    // InternalArduinoML.g:2424:1: rule__Transition__Group_0_0__2 : rule__Transition__Group_0_0__2__Impl rule__Transition__Group_0_0__3 ;
    public final void rule__Transition__Group_0_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2428:1: ( rule__Transition__Group_0_0__2__Impl rule__Transition__Group_0_0__3 )
            // InternalArduinoML.g:2429:2: rule__Transition__Group_0_0__2__Impl rule__Transition__Group_0_0__3
            {
            pushFollow(FOLLOW_25);
            rule__Transition__Group_0_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group_0_0__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_0_0__2"


    // $ANTLR start "rule__Transition__Group_0_0__2__Impl"
    // InternalArduinoML.g:2436:1: rule__Transition__Group_0_0__2__Impl : ( ( rule__Transition__Group_0_0_2__0 )* ) ;
    public final void rule__Transition__Group_0_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2440:1: ( ( ( rule__Transition__Group_0_0_2__0 )* ) )
            // InternalArduinoML.g:2441:1: ( ( rule__Transition__Group_0_0_2__0 )* )
            {
            // InternalArduinoML.g:2441:1: ( ( rule__Transition__Group_0_0_2__0 )* )
            // InternalArduinoML.g:2442:2: ( rule__Transition__Group_0_0_2__0 )*
            {
             before(grammarAccess.getTransitionAccess().getGroup_0_0_2()); 
            // InternalArduinoML.g:2443:2: ( rule__Transition__Group_0_0_2__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==37) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalArduinoML.g:2443:3: rule__Transition__Group_0_0_2__0
            	    {
            	    pushFollow(FOLLOW_26);
            	    rule__Transition__Group_0_0_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getTransitionAccess().getGroup_0_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_0_0__2__Impl"


    // $ANTLR start "rule__Transition__Group_0_0__3"
    // InternalArduinoML.g:2451:1: rule__Transition__Group_0_0__3 : rule__Transition__Group_0_0__3__Impl ;
    public final void rule__Transition__Group_0_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2455:1: ( rule__Transition__Group_0_0__3__Impl )
            // InternalArduinoML.g:2456:2: rule__Transition__Group_0_0__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Transition__Group_0_0__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_0_0__3"


    // $ANTLR start "rule__Transition__Group_0_0__3__Impl"
    // InternalArduinoML.g:2462:1: rule__Transition__Group_0_0__3__Impl : ( ( rule__Transition__Group_0_0_3__0 )? ) ;
    public final void rule__Transition__Group_0_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2466:1: ( ( ( rule__Transition__Group_0_0_3__0 )? ) )
            // InternalArduinoML.g:2467:1: ( ( rule__Transition__Group_0_0_3__0 )? )
            {
            // InternalArduinoML.g:2467:1: ( ( rule__Transition__Group_0_0_3__0 )? )
            // InternalArduinoML.g:2468:2: ( rule__Transition__Group_0_0_3__0 )?
            {
             before(grammarAccess.getTransitionAccess().getGroup_0_0_3()); 
            // InternalArduinoML.g:2469:2: ( rule__Transition__Group_0_0_3__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==38) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalArduinoML.g:2469:3: rule__Transition__Group_0_0_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Transition__Group_0_0_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTransitionAccess().getGroup_0_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_0_0__3__Impl"


    // $ANTLR start "rule__Transition__Group_0_0_1_0__0"
    // InternalArduinoML.g:2478:1: rule__Transition__Group_0_0_1_0__0 : rule__Transition__Group_0_0_1_0__0__Impl rule__Transition__Group_0_0_1_0__1 ;
    public final void rule__Transition__Group_0_0_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2482:1: ( rule__Transition__Group_0_0_1_0__0__Impl rule__Transition__Group_0_0_1_0__1 )
            // InternalArduinoML.g:2483:2: rule__Transition__Group_0_0_1_0__0__Impl rule__Transition__Group_0_0_1_0__1
            {
            pushFollow(FOLLOW_27);
            rule__Transition__Group_0_0_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group_0_0_1_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_0_0_1_0__0"


    // $ANTLR start "rule__Transition__Group_0_0_1_0__0__Impl"
    // InternalArduinoML.g:2490:1: rule__Transition__Group_0_0_1_0__0__Impl : ( ( rule__Transition__DigitalsAssignment_0_0_1_0_0 ) ) ;
    public final void rule__Transition__Group_0_0_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2494:1: ( ( ( rule__Transition__DigitalsAssignment_0_0_1_0_0 ) ) )
            // InternalArduinoML.g:2495:1: ( ( rule__Transition__DigitalsAssignment_0_0_1_0_0 ) )
            {
            // InternalArduinoML.g:2495:1: ( ( rule__Transition__DigitalsAssignment_0_0_1_0_0 ) )
            // InternalArduinoML.g:2496:2: ( rule__Transition__DigitalsAssignment_0_0_1_0_0 )
            {
             before(grammarAccess.getTransitionAccess().getDigitalsAssignment_0_0_1_0_0()); 
            // InternalArduinoML.g:2497:2: ( rule__Transition__DigitalsAssignment_0_0_1_0_0 )
            // InternalArduinoML.g:2497:3: rule__Transition__DigitalsAssignment_0_0_1_0_0
            {
            pushFollow(FOLLOW_2);
            rule__Transition__DigitalsAssignment_0_0_1_0_0();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getDigitalsAssignment_0_0_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_0_0_1_0__0__Impl"


    // $ANTLR start "rule__Transition__Group_0_0_1_0__1"
    // InternalArduinoML.g:2505:1: rule__Transition__Group_0_0_1_0__1 : rule__Transition__Group_0_0_1_0__1__Impl rule__Transition__Group_0_0_1_0__2 ;
    public final void rule__Transition__Group_0_0_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2509:1: ( rule__Transition__Group_0_0_1_0__1__Impl rule__Transition__Group_0_0_1_0__2 )
            // InternalArduinoML.g:2510:2: rule__Transition__Group_0_0_1_0__1__Impl rule__Transition__Group_0_0_1_0__2
            {
            pushFollow(FOLLOW_22);
            rule__Transition__Group_0_0_1_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group_0_0_1_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_0_0_1_0__1"


    // $ANTLR start "rule__Transition__Group_0_0_1_0__1__Impl"
    // InternalArduinoML.g:2517:1: rule__Transition__Group_0_0_1_0__1__Impl : ( 'is' ) ;
    public final void rule__Transition__Group_0_0_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2521:1: ( ( 'is' ) )
            // InternalArduinoML.g:2522:1: ( 'is' )
            {
            // InternalArduinoML.g:2522:1: ( 'is' )
            // InternalArduinoML.g:2523:2: 'is'
            {
             before(grammarAccess.getTransitionAccess().getIsKeyword_0_0_1_0_1()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getIsKeyword_0_0_1_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_0_0_1_0__1__Impl"


    // $ANTLR start "rule__Transition__Group_0_0_1_0__2"
    // InternalArduinoML.g:2532:1: rule__Transition__Group_0_0_1_0__2 : rule__Transition__Group_0_0_1_0__2__Impl ;
    public final void rule__Transition__Group_0_0_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2536:1: ( rule__Transition__Group_0_0_1_0__2__Impl )
            // InternalArduinoML.g:2537:2: rule__Transition__Group_0_0_1_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Transition__Group_0_0_1_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_0_0_1_0__2"


    // $ANTLR start "rule__Transition__Group_0_0_1_0__2__Impl"
    // InternalArduinoML.g:2543:1: rule__Transition__Group_0_0_1_0__2__Impl : ( ( rule__Transition__D_valuesAssignment_0_0_1_0_2 ) ) ;
    public final void rule__Transition__Group_0_0_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2547:1: ( ( ( rule__Transition__D_valuesAssignment_0_0_1_0_2 ) ) )
            // InternalArduinoML.g:2548:1: ( ( rule__Transition__D_valuesAssignment_0_0_1_0_2 ) )
            {
            // InternalArduinoML.g:2548:1: ( ( rule__Transition__D_valuesAssignment_0_0_1_0_2 ) )
            // InternalArduinoML.g:2549:2: ( rule__Transition__D_valuesAssignment_0_0_1_0_2 )
            {
             before(grammarAccess.getTransitionAccess().getD_valuesAssignment_0_0_1_0_2()); 
            // InternalArduinoML.g:2550:2: ( rule__Transition__D_valuesAssignment_0_0_1_0_2 )
            // InternalArduinoML.g:2550:3: rule__Transition__D_valuesAssignment_0_0_1_0_2
            {
            pushFollow(FOLLOW_2);
            rule__Transition__D_valuesAssignment_0_0_1_0_2();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getD_valuesAssignment_0_0_1_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_0_0_1_0__2__Impl"


    // $ANTLR start "rule__Transition__Group_0_0_1_1__0"
    // InternalArduinoML.g:2559:1: rule__Transition__Group_0_0_1_1__0 : rule__Transition__Group_0_0_1_1__0__Impl rule__Transition__Group_0_0_1_1__1 ;
    public final void rule__Transition__Group_0_0_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2563:1: ( rule__Transition__Group_0_0_1_1__0__Impl rule__Transition__Group_0_0_1_1__1 )
            // InternalArduinoML.g:2564:2: rule__Transition__Group_0_0_1_1__0__Impl rule__Transition__Group_0_0_1_1__1
            {
            pushFollow(FOLLOW_28);
            rule__Transition__Group_0_0_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group_0_0_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_0_0_1_1__0"


    // $ANTLR start "rule__Transition__Group_0_0_1_1__0__Impl"
    // InternalArduinoML.g:2571:1: rule__Transition__Group_0_0_1_1__0__Impl : ( ( rule__Transition__AnalogsAssignment_0_0_1_1_0 ) ) ;
    public final void rule__Transition__Group_0_0_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2575:1: ( ( ( rule__Transition__AnalogsAssignment_0_0_1_1_0 ) ) )
            // InternalArduinoML.g:2576:1: ( ( rule__Transition__AnalogsAssignment_0_0_1_1_0 ) )
            {
            // InternalArduinoML.g:2576:1: ( ( rule__Transition__AnalogsAssignment_0_0_1_1_0 ) )
            // InternalArduinoML.g:2577:2: ( rule__Transition__AnalogsAssignment_0_0_1_1_0 )
            {
             before(grammarAccess.getTransitionAccess().getAnalogsAssignment_0_0_1_1_0()); 
            // InternalArduinoML.g:2578:2: ( rule__Transition__AnalogsAssignment_0_0_1_1_0 )
            // InternalArduinoML.g:2578:3: rule__Transition__AnalogsAssignment_0_0_1_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Transition__AnalogsAssignment_0_0_1_1_0();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getAnalogsAssignment_0_0_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_0_0_1_1__0__Impl"


    // $ANTLR start "rule__Transition__Group_0_0_1_1__1"
    // InternalArduinoML.g:2586:1: rule__Transition__Group_0_0_1_1__1 : rule__Transition__Group_0_0_1_1__1__Impl rule__Transition__Group_0_0_1_1__2 ;
    public final void rule__Transition__Group_0_0_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2590:1: ( rule__Transition__Group_0_0_1_1__1__Impl rule__Transition__Group_0_0_1_1__2 )
            // InternalArduinoML.g:2591:2: rule__Transition__Group_0_0_1_1__1__Impl rule__Transition__Group_0_0_1_1__2
            {
            pushFollow(FOLLOW_14);
            rule__Transition__Group_0_0_1_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group_0_0_1_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_0_0_1_1__1"


    // $ANTLR start "rule__Transition__Group_0_0_1_1__1__Impl"
    // InternalArduinoML.g:2598:1: rule__Transition__Group_0_0_1_1__1__Impl : ( ( rule__Transition__CompAssignment_0_0_1_1_1 ) ) ;
    public final void rule__Transition__Group_0_0_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2602:1: ( ( ( rule__Transition__CompAssignment_0_0_1_1_1 ) ) )
            // InternalArduinoML.g:2603:1: ( ( rule__Transition__CompAssignment_0_0_1_1_1 ) )
            {
            // InternalArduinoML.g:2603:1: ( ( rule__Transition__CompAssignment_0_0_1_1_1 ) )
            // InternalArduinoML.g:2604:2: ( rule__Transition__CompAssignment_0_0_1_1_1 )
            {
             before(grammarAccess.getTransitionAccess().getCompAssignment_0_0_1_1_1()); 
            // InternalArduinoML.g:2605:2: ( rule__Transition__CompAssignment_0_0_1_1_1 )
            // InternalArduinoML.g:2605:3: rule__Transition__CompAssignment_0_0_1_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Transition__CompAssignment_0_0_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getCompAssignment_0_0_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_0_0_1_1__1__Impl"


    // $ANTLR start "rule__Transition__Group_0_0_1_1__2"
    // InternalArduinoML.g:2613:1: rule__Transition__Group_0_0_1_1__2 : rule__Transition__Group_0_0_1_1__2__Impl ;
    public final void rule__Transition__Group_0_0_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2617:1: ( rule__Transition__Group_0_0_1_1__2__Impl )
            // InternalArduinoML.g:2618:2: rule__Transition__Group_0_0_1_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Transition__Group_0_0_1_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_0_0_1_1__2"


    // $ANTLR start "rule__Transition__Group_0_0_1_1__2__Impl"
    // InternalArduinoML.g:2624:1: rule__Transition__Group_0_0_1_1__2__Impl : ( ( rule__Transition__A_valuesAssignment_0_0_1_1_2 ) ) ;
    public final void rule__Transition__Group_0_0_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2628:1: ( ( ( rule__Transition__A_valuesAssignment_0_0_1_1_2 ) ) )
            // InternalArduinoML.g:2629:1: ( ( rule__Transition__A_valuesAssignment_0_0_1_1_2 ) )
            {
            // InternalArduinoML.g:2629:1: ( ( rule__Transition__A_valuesAssignment_0_0_1_1_2 ) )
            // InternalArduinoML.g:2630:2: ( rule__Transition__A_valuesAssignment_0_0_1_1_2 )
            {
             before(grammarAccess.getTransitionAccess().getA_valuesAssignment_0_0_1_1_2()); 
            // InternalArduinoML.g:2631:2: ( rule__Transition__A_valuesAssignment_0_0_1_1_2 )
            // InternalArduinoML.g:2631:3: rule__Transition__A_valuesAssignment_0_0_1_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Transition__A_valuesAssignment_0_0_1_1_2();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getA_valuesAssignment_0_0_1_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_0_0_1_1__2__Impl"


    // $ANTLR start "rule__Transition__Group_0_0_2__0"
    // InternalArduinoML.g:2640:1: rule__Transition__Group_0_0_2__0 : rule__Transition__Group_0_0_2__0__Impl rule__Transition__Group_0_0_2__1 ;
    public final void rule__Transition__Group_0_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2644:1: ( rule__Transition__Group_0_0_2__0__Impl rule__Transition__Group_0_0_2__1 )
            // InternalArduinoML.g:2645:2: rule__Transition__Group_0_0_2__0__Impl rule__Transition__Group_0_0_2__1
            {
            pushFollow(FOLLOW_3);
            rule__Transition__Group_0_0_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group_0_0_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_0_0_2__0"


    // $ANTLR start "rule__Transition__Group_0_0_2__0__Impl"
    // InternalArduinoML.g:2652:1: rule__Transition__Group_0_0_2__0__Impl : ( 'and' ) ;
    public final void rule__Transition__Group_0_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2656:1: ( ( 'and' ) )
            // InternalArduinoML.g:2657:1: ( 'and' )
            {
            // InternalArduinoML.g:2657:1: ( 'and' )
            // InternalArduinoML.g:2658:2: 'and'
            {
             before(grammarAccess.getTransitionAccess().getAndKeyword_0_0_2_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getAndKeyword_0_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_0_0_2__0__Impl"


    // $ANTLR start "rule__Transition__Group_0_0_2__1"
    // InternalArduinoML.g:2667:1: rule__Transition__Group_0_0_2__1 : rule__Transition__Group_0_0_2__1__Impl ;
    public final void rule__Transition__Group_0_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2671:1: ( rule__Transition__Group_0_0_2__1__Impl )
            // InternalArduinoML.g:2672:2: rule__Transition__Group_0_0_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Transition__Group_0_0_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_0_0_2__1"


    // $ANTLR start "rule__Transition__Group_0_0_2__1__Impl"
    // InternalArduinoML.g:2678:1: rule__Transition__Group_0_0_2__1__Impl : ( ( rule__Transition__Alternatives_0_0_2_1 ) ) ;
    public final void rule__Transition__Group_0_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2682:1: ( ( ( rule__Transition__Alternatives_0_0_2_1 ) ) )
            // InternalArduinoML.g:2683:1: ( ( rule__Transition__Alternatives_0_0_2_1 ) )
            {
            // InternalArduinoML.g:2683:1: ( ( rule__Transition__Alternatives_0_0_2_1 ) )
            // InternalArduinoML.g:2684:2: ( rule__Transition__Alternatives_0_0_2_1 )
            {
             before(grammarAccess.getTransitionAccess().getAlternatives_0_0_2_1()); 
            // InternalArduinoML.g:2685:2: ( rule__Transition__Alternatives_0_0_2_1 )
            // InternalArduinoML.g:2685:3: rule__Transition__Alternatives_0_0_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Transition__Alternatives_0_0_2_1();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getAlternatives_0_0_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_0_0_2__1__Impl"


    // $ANTLR start "rule__Transition__Group_0_0_2_1_0__0"
    // InternalArduinoML.g:2694:1: rule__Transition__Group_0_0_2_1_0__0 : rule__Transition__Group_0_0_2_1_0__0__Impl rule__Transition__Group_0_0_2_1_0__1 ;
    public final void rule__Transition__Group_0_0_2_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2698:1: ( rule__Transition__Group_0_0_2_1_0__0__Impl rule__Transition__Group_0_0_2_1_0__1 )
            // InternalArduinoML.g:2699:2: rule__Transition__Group_0_0_2_1_0__0__Impl rule__Transition__Group_0_0_2_1_0__1
            {
            pushFollow(FOLLOW_27);
            rule__Transition__Group_0_0_2_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group_0_0_2_1_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_0_0_2_1_0__0"


    // $ANTLR start "rule__Transition__Group_0_0_2_1_0__0__Impl"
    // InternalArduinoML.g:2706:1: rule__Transition__Group_0_0_2_1_0__0__Impl : ( ( rule__Transition__DigitalsAssignment_0_0_2_1_0_0 ) ) ;
    public final void rule__Transition__Group_0_0_2_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2710:1: ( ( ( rule__Transition__DigitalsAssignment_0_0_2_1_0_0 ) ) )
            // InternalArduinoML.g:2711:1: ( ( rule__Transition__DigitalsAssignment_0_0_2_1_0_0 ) )
            {
            // InternalArduinoML.g:2711:1: ( ( rule__Transition__DigitalsAssignment_0_0_2_1_0_0 ) )
            // InternalArduinoML.g:2712:2: ( rule__Transition__DigitalsAssignment_0_0_2_1_0_0 )
            {
             before(grammarAccess.getTransitionAccess().getDigitalsAssignment_0_0_2_1_0_0()); 
            // InternalArduinoML.g:2713:2: ( rule__Transition__DigitalsAssignment_0_0_2_1_0_0 )
            // InternalArduinoML.g:2713:3: rule__Transition__DigitalsAssignment_0_0_2_1_0_0
            {
            pushFollow(FOLLOW_2);
            rule__Transition__DigitalsAssignment_0_0_2_1_0_0();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getDigitalsAssignment_0_0_2_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_0_0_2_1_0__0__Impl"


    // $ANTLR start "rule__Transition__Group_0_0_2_1_0__1"
    // InternalArduinoML.g:2721:1: rule__Transition__Group_0_0_2_1_0__1 : rule__Transition__Group_0_0_2_1_0__1__Impl rule__Transition__Group_0_0_2_1_0__2 ;
    public final void rule__Transition__Group_0_0_2_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2725:1: ( rule__Transition__Group_0_0_2_1_0__1__Impl rule__Transition__Group_0_0_2_1_0__2 )
            // InternalArduinoML.g:2726:2: rule__Transition__Group_0_0_2_1_0__1__Impl rule__Transition__Group_0_0_2_1_0__2
            {
            pushFollow(FOLLOW_22);
            rule__Transition__Group_0_0_2_1_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group_0_0_2_1_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_0_0_2_1_0__1"


    // $ANTLR start "rule__Transition__Group_0_0_2_1_0__1__Impl"
    // InternalArduinoML.g:2733:1: rule__Transition__Group_0_0_2_1_0__1__Impl : ( 'is' ) ;
    public final void rule__Transition__Group_0_0_2_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2737:1: ( ( 'is' ) )
            // InternalArduinoML.g:2738:1: ( 'is' )
            {
            // InternalArduinoML.g:2738:1: ( 'is' )
            // InternalArduinoML.g:2739:2: 'is'
            {
             before(grammarAccess.getTransitionAccess().getIsKeyword_0_0_2_1_0_1()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getIsKeyword_0_0_2_1_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_0_0_2_1_0__1__Impl"


    // $ANTLR start "rule__Transition__Group_0_0_2_1_0__2"
    // InternalArduinoML.g:2748:1: rule__Transition__Group_0_0_2_1_0__2 : rule__Transition__Group_0_0_2_1_0__2__Impl ;
    public final void rule__Transition__Group_0_0_2_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2752:1: ( rule__Transition__Group_0_0_2_1_0__2__Impl )
            // InternalArduinoML.g:2753:2: rule__Transition__Group_0_0_2_1_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Transition__Group_0_0_2_1_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_0_0_2_1_0__2"


    // $ANTLR start "rule__Transition__Group_0_0_2_1_0__2__Impl"
    // InternalArduinoML.g:2759:1: rule__Transition__Group_0_0_2_1_0__2__Impl : ( ( rule__Transition__D_valuesAssignment_0_0_2_1_0_2 ) ) ;
    public final void rule__Transition__Group_0_0_2_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2763:1: ( ( ( rule__Transition__D_valuesAssignment_0_0_2_1_0_2 ) ) )
            // InternalArduinoML.g:2764:1: ( ( rule__Transition__D_valuesAssignment_0_0_2_1_0_2 ) )
            {
            // InternalArduinoML.g:2764:1: ( ( rule__Transition__D_valuesAssignment_0_0_2_1_0_2 ) )
            // InternalArduinoML.g:2765:2: ( rule__Transition__D_valuesAssignment_0_0_2_1_0_2 )
            {
             before(grammarAccess.getTransitionAccess().getD_valuesAssignment_0_0_2_1_0_2()); 
            // InternalArduinoML.g:2766:2: ( rule__Transition__D_valuesAssignment_0_0_2_1_0_2 )
            // InternalArduinoML.g:2766:3: rule__Transition__D_valuesAssignment_0_0_2_1_0_2
            {
            pushFollow(FOLLOW_2);
            rule__Transition__D_valuesAssignment_0_0_2_1_0_2();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getD_valuesAssignment_0_0_2_1_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_0_0_2_1_0__2__Impl"


    // $ANTLR start "rule__Transition__Group_0_0_2_1_1__0"
    // InternalArduinoML.g:2775:1: rule__Transition__Group_0_0_2_1_1__0 : rule__Transition__Group_0_0_2_1_1__0__Impl rule__Transition__Group_0_0_2_1_1__1 ;
    public final void rule__Transition__Group_0_0_2_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2779:1: ( rule__Transition__Group_0_0_2_1_1__0__Impl rule__Transition__Group_0_0_2_1_1__1 )
            // InternalArduinoML.g:2780:2: rule__Transition__Group_0_0_2_1_1__0__Impl rule__Transition__Group_0_0_2_1_1__1
            {
            pushFollow(FOLLOW_28);
            rule__Transition__Group_0_0_2_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group_0_0_2_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_0_0_2_1_1__0"


    // $ANTLR start "rule__Transition__Group_0_0_2_1_1__0__Impl"
    // InternalArduinoML.g:2787:1: rule__Transition__Group_0_0_2_1_1__0__Impl : ( ( rule__Transition__AnalogsAssignment_0_0_2_1_1_0 ) ) ;
    public final void rule__Transition__Group_0_0_2_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2791:1: ( ( ( rule__Transition__AnalogsAssignment_0_0_2_1_1_0 ) ) )
            // InternalArduinoML.g:2792:1: ( ( rule__Transition__AnalogsAssignment_0_0_2_1_1_0 ) )
            {
            // InternalArduinoML.g:2792:1: ( ( rule__Transition__AnalogsAssignment_0_0_2_1_1_0 ) )
            // InternalArduinoML.g:2793:2: ( rule__Transition__AnalogsAssignment_0_0_2_1_1_0 )
            {
             before(grammarAccess.getTransitionAccess().getAnalogsAssignment_0_0_2_1_1_0()); 
            // InternalArduinoML.g:2794:2: ( rule__Transition__AnalogsAssignment_0_0_2_1_1_0 )
            // InternalArduinoML.g:2794:3: rule__Transition__AnalogsAssignment_0_0_2_1_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Transition__AnalogsAssignment_0_0_2_1_1_0();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getAnalogsAssignment_0_0_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_0_0_2_1_1__0__Impl"


    // $ANTLR start "rule__Transition__Group_0_0_2_1_1__1"
    // InternalArduinoML.g:2802:1: rule__Transition__Group_0_0_2_1_1__1 : rule__Transition__Group_0_0_2_1_1__1__Impl rule__Transition__Group_0_0_2_1_1__2 ;
    public final void rule__Transition__Group_0_0_2_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2806:1: ( rule__Transition__Group_0_0_2_1_1__1__Impl rule__Transition__Group_0_0_2_1_1__2 )
            // InternalArduinoML.g:2807:2: rule__Transition__Group_0_0_2_1_1__1__Impl rule__Transition__Group_0_0_2_1_1__2
            {
            pushFollow(FOLLOW_14);
            rule__Transition__Group_0_0_2_1_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group_0_0_2_1_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_0_0_2_1_1__1"


    // $ANTLR start "rule__Transition__Group_0_0_2_1_1__1__Impl"
    // InternalArduinoML.g:2814:1: rule__Transition__Group_0_0_2_1_1__1__Impl : ( ( rule__Transition__CompAssignment_0_0_2_1_1_1 ) ) ;
    public final void rule__Transition__Group_0_0_2_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2818:1: ( ( ( rule__Transition__CompAssignment_0_0_2_1_1_1 ) ) )
            // InternalArduinoML.g:2819:1: ( ( rule__Transition__CompAssignment_0_0_2_1_1_1 ) )
            {
            // InternalArduinoML.g:2819:1: ( ( rule__Transition__CompAssignment_0_0_2_1_1_1 ) )
            // InternalArduinoML.g:2820:2: ( rule__Transition__CompAssignment_0_0_2_1_1_1 )
            {
             before(grammarAccess.getTransitionAccess().getCompAssignment_0_0_2_1_1_1()); 
            // InternalArduinoML.g:2821:2: ( rule__Transition__CompAssignment_0_0_2_1_1_1 )
            // InternalArduinoML.g:2821:3: rule__Transition__CompAssignment_0_0_2_1_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Transition__CompAssignment_0_0_2_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getCompAssignment_0_0_2_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_0_0_2_1_1__1__Impl"


    // $ANTLR start "rule__Transition__Group_0_0_2_1_1__2"
    // InternalArduinoML.g:2829:1: rule__Transition__Group_0_0_2_1_1__2 : rule__Transition__Group_0_0_2_1_1__2__Impl ;
    public final void rule__Transition__Group_0_0_2_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2833:1: ( rule__Transition__Group_0_0_2_1_1__2__Impl )
            // InternalArduinoML.g:2834:2: rule__Transition__Group_0_0_2_1_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Transition__Group_0_0_2_1_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_0_0_2_1_1__2"


    // $ANTLR start "rule__Transition__Group_0_0_2_1_1__2__Impl"
    // InternalArduinoML.g:2840:1: rule__Transition__Group_0_0_2_1_1__2__Impl : ( ( rule__Transition__A_valuesAssignment_0_0_2_1_1_2 ) ) ;
    public final void rule__Transition__Group_0_0_2_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2844:1: ( ( ( rule__Transition__A_valuesAssignment_0_0_2_1_1_2 ) ) )
            // InternalArduinoML.g:2845:1: ( ( rule__Transition__A_valuesAssignment_0_0_2_1_1_2 ) )
            {
            // InternalArduinoML.g:2845:1: ( ( rule__Transition__A_valuesAssignment_0_0_2_1_1_2 ) )
            // InternalArduinoML.g:2846:2: ( rule__Transition__A_valuesAssignment_0_0_2_1_1_2 )
            {
             before(grammarAccess.getTransitionAccess().getA_valuesAssignment_0_0_2_1_1_2()); 
            // InternalArduinoML.g:2847:2: ( rule__Transition__A_valuesAssignment_0_0_2_1_1_2 )
            // InternalArduinoML.g:2847:3: rule__Transition__A_valuesAssignment_0_0_2_1_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Transition__A_valuesAssignment_0_0_2_1_1_2();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getA_valuesAssignment_0_0_2_1_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_0_0_2_1_1__2__Impl"


    // $ANTLR start "rule__Transition__Group_0_0_3__0"
    // InternalArduinoML.g:2856:1: rule__Transition__Group_0_0_3__0 : rule__Transition__Group_0_0_3__0__Impl rule__Transition__Group_0_0_3__1 ;
    public final void rule__Transition__Group_0_0_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2860:1: ( rule__Transition__Group_0_0_3__0__Impl rule__Transition__Group_0_0_3__1 )
            // InternalArduinoML.g:2861:2: rule__Transition__Group_0_0_3__0__Impl rule__Transition__Group_0_0_3__1
            {
            pushFollow(FOLLOW_14);
            rule__Transition__Group_0_0_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group_0_0_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_0_0_3__0"


    // $ANTLR start "rule__Transition__Group_0_0_3__0__Impl"
    // InternalArduinoML.g:2868:1: rule__Transition__Group_0_0_3__0__Impl : ( 'wait' ) ;
    public final void rule__Transition__Group_0_0_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2872:1: ( ( 'wait' ) )
            // InternalArduinoML.g:2873:1: ( 'wait' )
            {
            // InternalArduinoML.g:2873:1: ( 'wait' )
            // InternalArduinoML.g:2874:2: 'wait'
            {
             before(grammarAccess.getTransitionAccess().getWaitKeyword_0_0_3_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getWaitKeyword_0_0_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_0_0_3__0__Impl"


    // $ANTLR start "rule__Transition__Group_0_0_3__1"
    // InternalArduinoML.g:2883:1: rule__Transition__Group_0_0_3__1 : rule__Transition__Group_0_0_3__1__Impl rule__Transition__Group_0_0_3__2 ;
    public final void rule__Transition__Group_0_0_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2887:1: ( rule__Transition__Group_0_0_3__1__Impl rule__Transition__Group_0_0_3__2 )
            // InternalArduinoML.g:2888:2: rule__Transition__Group_0_0_3__1__Impl rule__Transition__Group_0_0_3__2
            {
            pushFollow(FOLLOW_29);
            rule__Transition__Group_0_0_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group_0_0_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_0_0_3__1"


    // $ANTLR start "rule__Transition__Group_0_0_3__1__Impl"
    // InternalArduinoML.g:2895:1: rule__Transition__Group_0_0_3__1__Impl : ( ( rule__Transition__TimeAssignment_0_0_3_1 ) ) ;
    public final void rule__Transition__Group_0_0_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2899:1: ( ( ( rule__Transition__TimeAssignment_0_0_3_1 ) ) )
            // InternalArduinoML.g:2900:1: ( ( rule__Transition__TimeAssignment_0_0_3_1 ) )
            {
            // InternalArduinoML.g:2900:1: ( ( rule__Transition__TimeAssignment_0_0_3_1 ) )
            // InternalArduinoML.g:2901:2: ( rule__Transition__TimeAssignment_0_0_3_1 )
            {
             before(grammarAccess.getTransitionAccess().getTimeAssignment_0_0_3_1()); 
            // InternalArduinoML.g:2902:2: ( rule__Transition__TimeAssignment_0_0_3_1 )
            // InternalArduinoML.g:2902:3: rule__Transition__TimeAssignment_0_0_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Transition__TimeAssignment_0_0_3_1();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getTimeAssignment_0_0_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_0_0_3__1__Impl"


    // $ANTLR start "rule__Transition__Group_0_0_3__2"
    // InternalArduinoML.g:2910:1: rule__Transition__Group_0_0_3__2 : rule__Transition__Group_0_0_3__2__Impl rule__Transition__Group_0_0_3__3 ;
    public final void rule__Transition__Group_0_0_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2914:1: ( rule__Transition__Group_0_0_3__2__Impl rule__Transition__Group_0_0_3__3 )
            // InternalArduinoML.g:2915:2: rule__Transition__Group_0_0_3__2__Impl rule__Transition__Group_0_0_3__3
            {
            pushFollow(FOLLOW_30);
            rule__Transition__Group_0_0_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group_0_0_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_0_0_3__2"


    // $ANTLR start "rule__Transition__Group_0_0_3__2__Impl"
    // InternalArduinoML.g:2922:1: rule__Transition__Group_0_0_3__2__Impl : ( ( rule__Transition__UnitAssignment_0_0_3_2 ) ) ;
    public final void rule__Transition__Group_0_0_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2926:1: ( ( ( rule__Transition__UnitAssignment_0_0_3_2 ) ) )
            // InternalArduinoML.g:2927:1: ( ( rule__Transition__UnitAssignment_0_0_3_2 ) )
            {
            // InternalArduinoML.g:2927:1: ( ( rule__Transition__UnitAssignment_0_0_3_2 ) )
            // InternalArduinoML.g:2928:2: ( rule__Transition__UnitAssignment_0_0_3_2 )
            {
             before(grammarAccess.getTransitionAccess().getUnitAssignment_0_0_3_2()); 
            // InternalArduinoML.g:2929:2: ( rule__Transition__UnitAssignment_0_0_3_2 )
            // InternalArduinoML.g:2929:3: rule__Transition__UnitAssignment_0_0_3_2
            {
            pushFollow(FOLLOW_2);
            rule__Transition__UnitAssignment_0_0_3_2();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getUnitAssignment_0_0_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_0_0_3__2__Impl"


    // $ANTLR start "rule__Transition__Group_0_0_3__3"
    // InternalArduinoML.g:2937:1: rule__Transition__Group_0_0_3__3 : rule__Transition__Group_0_0_3__3__Impl ;
    public final void rule__Transition__Group_0_0_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2941:1: ( rule__Transition__Group_0_0_3__3__Impl )
            // InternalArduinoML.g:2942:2: rule__Transition__Group_0_0_3__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Transition__Group_0_0_3__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_0_0_3__3"


    // $ANTLR start "rule__Transition__Group_0_0_3__3__Impl"
    // InternalArduinoML.g:2948:1: rule__Transition__Group_0_0_3__3__Impl : ( 'then' ) ;
    public final void rule__Transition__Group_0_0_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2952:1: ( ( 'then' ) )
            // InternalArduinoML.g:2953:1: ( 'then' )
            {
            // InternalArduinoML.g:2953:1: ( 'then' )
            // InternalArduinoML.g:2954:2: 'then'
            {
             before(grammarAccess.getTransitionAccess().getThenKeyword_0_0_3_3()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getThenKeyword_0_0_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_0_0_3__3__Impl"


    // $ANTLR start "rule__Transition__Group_0_1__0"
    // InternalArduinoML.g:2964:1: rule__Transition__Group_0_1__0 : rule__Transition__Group_0_1__0__Impl rule__Transition__Group_0_1__1 ;
    public final void rule__Transition__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2968:1: ( rule__Transition__Group_0_1__0__Impl rule__Transition__Group_0_1__1 )
            // InternalArduinoML.g:2969:2: rule__Transition__Group_0_1__0__Impl rule__Transition__Group_0_1__1
            {
            pushFollow(FOLLOW_14);
            rule__Transition__Group_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group_0_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_0_1__0"


    // $ANTLR start "rule__Transition__Group_0_1__0__Impl"
    // InternalArduinoML.g:2976:1: rule__Transition__Group_0_1__0__Impl : ( 'wait' ) ;
    public final void rule__Transition__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2980:1: ( ( 'wait' ) )
            // InternalArduinoML.g:2981:1: ( 'wait' )
            {
            // InternalArduinoML.g:2981:1: ( 'wait' )
            // InternalArduinoML.g:2982:2: 'wait'
            {
             before(grammarAccess.getTransitionAccess().getWaitKeyword_0_1_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getWaitKeyword_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_0_1__0__Impl"


    // $ANTLR start "rule__Transition__Group_0_1__1"
    // InternalArduinoML.g:2991:1: rule__Transition__Group_0_1__1 : rule__Transition__Group_0_1__1__Impl rule__Transition__Group_0_1__2 ;
    public final void rule__Transition__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2995:1: ( rule__Transition__Group_0_1__1__Impl rule__Transition__Group_0_1__2 )
            // InternalArduinoML.g:2996:2: rule__Transition__Group_0_1__1__Impl rule__Transition__Group_0_1__2
            {
            pushFollow(FOLLOW_29);
            rule__Transition__Group_0_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group_0_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_0_1__1"


    // $ANTLR start "rule__Transition__Group_0_1__1__Impl"
    // InternalArduinoML.g:3003:1: rule__Transition__Group_0_1__1__Impl : ( ( rule__Transition__TimeAssignment_0_1_1 ) ) ;
    public final void rule__Transition__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3007:1: ( ( ( rule__Transition__TimeAssignment_0_1_1 ) ) )
            // InternalArduinoML.g:3008:1: ( ( rule__Transition__TimeAssignment_0_1_1 ) )
            {
            // InternalArduinoML.g:3008:1: ( ( rule__Transition__TimeAssignment_0_1_1 ) )
            // InternalArduinoML.g:3009:2: ( rule__Transition__TimeAssignment_0_1_1 )
            {
             before(grammarAccess.getTransitionAccess().getTimeAssignment_0_1_1()); 
            // InternalArduinoML.g:3010:2: ( rule__Transition__TimeAssignment_0_1_1 )
            // InternalArduinoML.g:3010:3: rule__Transition__TimeAssignment_0_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Transition__TimeAssignment_0_1_1();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getTimeAssignment_0_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_0_1__1__Impl"


    // $ANTLR start "rule__Transition__Group_0_1__2"
    // InternalArduinoML.g:3018:1: rule__Transition__Group_0_1__2 : rule__Transition__Group_0_1__2__Impl rule__Transition__Group_0_1__3 ;
    public final void rule__Transition__Group_0_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3022:1: ( rule__Transition__Group_0_1__2__Impl rule__Transition__Group_0_1__3 )
            // InternalArduinoML.g:3023:2: rule__Transition__Group_0_1__2__Impl rule__Transition__Group_0_1__3
            {
            pushFollow(FOLLOW_30);
            rule__Transition__Group_0_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group_0_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_0_1__2"


    // $ANTLR start "rule__Transition__Group_0_1__2__Impl"
    // InternalArduinoML.g:3030:1: rule__Transition__Group_0_1__2__Impl : ( ( rule__Transition__UnitAssignment_0_1_2 ) ) ;
    public final void rule__Transition__Group_0_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3034:1: ( ( ( rule__Transition__UnitAssignment_0_1_2 ) ) )
            // InternalArduinoML.g:3035:1: ( ( rule__Transition__UnitAssignment_0_1_2 ) )
            {
            // InternalArduinoML.g:3035:1: ( ( rule__Transition__UnitAssignment_0_1_2 ) )
            // InternalArduinoML.g:3036:2: ( rule__Transition__UnitAssignment_0_1_2 )
            {
             before(grammarAccess.getTransitionAccess().getUnitAssignment_0_1_2()); 
            // InternalArduinoML.g:3037:2: ( rule__Transition__UnitAssignment_0_1_2 )
            // InternalArduinoML.g:3037:3: rule__Transition__UnitAssignment_0_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Transition__UnitAssignment_0_1_2();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getUnitAssignment_0_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_0_1__2__Impl"


    // $ANTLR start "rule__Transition__Group_0_1__3"
    // InternalArduinoML.g:3045:1: rule__Transition__Group_0_1__3 : rule__Transition__Group_0_1__3__Impl ;
    public final void rule__Transition__Group_0_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3049:1: ( rule__Transition__Group_0_1__3__Impl )
            // InternalArduinoML.g:3050:2: rule__Transition__Group_0_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Transition__Group_0_1__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_0_1__3"


    // $ANTLR start "rule__Transition__Group_0_1__3__Impl"
    // InternalArduinoML.g:3056:1: rule__Transition__Group_0_1__3__Impl : ( 'then' ) ;
    public final void rule__Transition__Group_0_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3060:1: ( ( 'then' ) )
            // InternalArduinoML.g:3061:1: ( 'then' )
            {
            // InternalArduinoML.g:3061:1: ( 'then' )
            // InternalArduinoML.g:3062:2: 'then'
            {
             before(grammarAccess.getTransitionAccess().getThenKeyword_0_1_3()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getThenKeyword_0_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_0_1__3__Impl"


    // $ANTLR start "rule__Transition__Group_3_0__0"
    // InternalArduinoML.g:3072:1: rule__Transition__Group_3_0__0 : rule__Transition__Group_3_0__0__Impl rule__Transition__Group_3_0__1 ;
    public final void rule__Transition__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3076:1: ( rule__Transition__Group_3_0__0__Impl rule__Transition__Group_3_0__1 )
            // InternalArduinoML.g:3077:2: rule__Transition__Group_3_0__0__Impl rule__Transition__Group_3_0__1
            {
            pushFollow(FOLLOW_3);
            rule__Transition__Group_3_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group_3_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_3_0__0"


    // $ANTLR start "rule__Transition__Group_3_0__0__Impl"
    // InternalArduinoML.g:3084:1: rule__Transition__Group_3_0__0__Impl : ( 'state' ) ;
    public final void rule__Transition__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3088:1: ( ( 'state' ) )
            // InternalArduinoML.g:3089:1: ( 'state' )
            {
            // InternalArduinoML.g:3089:1: ( 'state' )
            // InternalArduinoML.g:3090:2: 'state'
            {
             before(grammarAccess.getTransitionAccess().getStateKeyword_3_0_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getStateKeyword_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_3_0__0__Impl"


    // $ANTLR start "rule__Transition__Group_3_0__1"
    // InternalArduinoML.g:3099:1: rule__Transition__Group_3_0__1 : rule__Transition__Group_3_0__1__Impl ;
    public final void rule__Transition__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3103:1: ( rule__Transition__Group_3_0__1__Impl )
            // InternalArduinoML.g:3104:2: rule__Transition__Group_3_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Transition__Group_3_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_3_0__1"


    // $ANTLR start "rule__Transition__Group_3_0__1__Impl"
    // InternalArduinoML.g:3110:1: rule__Transition__Group_3_0__1__Impl : ( ( rule__Transition__Next_stateAssignment_3_0_1 ) ) ;
    public final void rule__Transition__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3114:1: ( ( ( rule__Transition__Next_stateAssignment_3_0_1 ) ) )
            // InternalArduinoML.g:3115:1: ( ( rule__Transition__Next_stateAssignment_3_0_1 ) )
            {
            // InternalArduinoML.g:3115:1: ( ( rule__Transition__Next_stateAssignment_3_0_1 ) )
            // InternalArduinoML.g:3116:2: ( rule__Transition__Next_stateAssignment_3_0_1 )
            {
             before(grammarAccess.getTransitionAccess().getNext_stateAssignment_3_0_1()); 
            // InternalArduinoML.g:3117:2: ( rule__Transition__Next_stateAssignment_3_0_1 )
            // InternalArduinoML.g:3117:3: rule__Transition__Next_stateAssignment_3_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Transition__Next_stateAssignment_3_0_1();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getNext_stateAssignment_3_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_3_0__1__Impl"


    // $ANTLR start "rule__Transition__Group_3_1__0"
    // InternalArduinoML.g:3126:1: rule__Transition__Group_3_1__0 : rule__Transition__Group_3_1__0__Impl rule__Transition__Group_3_1__1 ;
    public final void rule__Transition__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3130:1: ( rule__Transition__Group_3_1__0__Impl rule__Transition__Group_3_1__1 )
            // InternalArduinoML.g:3131:2: rule__Transition__Group_3_1__0__Impl rule__Transition__Group_3_1__1
            {
            pushFollow(FOLLOW_3);
            rule__Transition__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group_3_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_3_1__0"


    // $ANTLR start "rule__Transition__Group_3_1__0__Impl"
    // InternalArduinoML.g:3138:1: rule__Transition__Group_3_1__0__Impl : ( 'mode' ) ;
    public final void rule__Transition__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3142:1: ( ( 'mode' ) )
            // InternalArduinoML.g:3143:1: ( 'mode' )
            {
            // InternalArduinoML.g:3143:1: ( 'mode' )
            // InternalArduinoML.g:3144:2: 'mode'
            {
             before(grammarAccess.getTransitionAccess().getModeKeyword_3_1_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getModeKeyword_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_3_1__0__Impl"


    // $ANTLR start "rule__Transition__Group_3_1__1"
    // InternalArduinoML.g:3153:1: rule__Transition__Group_3_1__1 : rule__Transition__Group_3_1__1__Impl ;
    public final void rule__Transition__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3157:1: ( rule__Transition__Group_3_1__1__Impl )
            // InternalArduinoML.g:3158:2: rule__Transition__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Transition__Group_3_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_3_1__1"


    // $ANTLR start "rule__Transition__Group_3_1__1__Impl"
    // InternalArduinoML.g:3164:1: rule__Transition__Group_3_1__1__Impl : ( ( rule__Transition__Next_modeAssignment_3_1_1 ) ) ;
    public final void rule__Transition__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3168:1: ( ( ( rule__Transition__Next_modeAssignment_3_1_1 ) ) )
            // InternalArduinoML.g:3169:1: ( ( rule__Transition__Next_modeAssignment_3_1_1 ) )
            {
            // InternalArduinoML.g:3169:1: ( ( rule__Transition__Next_modeAssignment_3_1_1 ) )
            // InternalArduinoML.g:3170:2: ( rule__Transition__Next_modeAssignment_3_1_1 )
            {
             before(grammarAccess.getTransitionAccess().getNext_modeAssignment_3_1_1()); 
            // InternalArduinoML.g:3171:2: ( rule__Transition__Next_modeAssignment_3_1_1 )
            // InternalArduinoML.g:3171:3: rule__Transition__Next_modeAssignment_3_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Transition__Next_modeAssignment_3_1_1();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getNext_modeAssignment_3_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_3_1__1__Impl"


    // $ANTLR start "rule__App__NameAssignment_0_1"
    // InternalArduinoML.g:3180:1: rule__App__NameAssignment_0_1 : ( ruleEString ) ;
    public final void rule__App__NameAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3184:1: ( ( ruleEString ) )
            // InternalArduinoML.g:3185:2: ( ruleEString )
            {
            // InternalArduinoML.g:3185:2: ( ruleEString )
            // InternalArduinoML.g:3186:3: ruleEString
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
    // InternalArduinoML.g:3195:1: rule__App__Initial_stateAssignment_0_4 : ( ( ruleEString ) ) ;
    public final void rule__App__Initial_stateAssignment_0_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3199:1: ( ( ( ruleEString ) ) )
            // InternalArduinoML.g:3200:2: ( ( ruleEString ) )
            {
            // InternalArduinoML.g:3200:2: ( ( ruleEString ) )
            // InternalArduinoML.g:3201:3: ( ruleEString )
            {
             before(grammarAccess.getAppAccess().getInitial_stateStateCrossReference_0_4_0()); 
            // InternalArduinoML.g:3202:3: ( ruleEString )
            // InternalArduinoML.g:3203:4: ruleEString
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
    // InternalArduinoML.g:3214:1: rule__App__BricksAssignment_0_8 : ( ruleBrick ) ;
    public final void rule__App__BricksAssignment_0_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3218:1: ( ( ruleBrick ) )
            // InternalArduinoML.g:3219:2: ( ruleBrick )
            {
            // InternalArduinoML.g:3219:2: ( ruleBrick )
            // InternalArduinoML.g:3220:3: ruleBrick
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
    // InternalArduinoML.g:3229:1: rule__App__BricksAssignment_0_9 : ( ruleBrick ) ;
    public final void rule__App__BricksAssignment_0_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3233:1: ( ( ruleBrick ) )
            // InternalArduinoML.g:3234:2: ( ruleBrick )
            {
            // InternalArduinoML.g:3234:2: ( ruleBrick )
            // InternalArduinoML.g:3235:3: ruleBrick
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
    // InternalArduinoML.g:3244:1: rule__App__StatesAssignment_0_12 : ( ruleState ) ;
    public final void rule__App__StatesAssignment_0_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3248:1: ( ( ruleState ) )
            // InternalArduinoML.g:3249:2: ( ruleState )
            {
            // InternalArduinoML.g:3249:2: ( ruleState )
            // InternalArduinoML.g:3250:3: ruleState
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
    // InternalArduinoML.g:3259:1: rule__App__StatesAssignment_0_13 : ( ruleState ) ;
    public final void rule__App__StatesAssignment_0_13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3263:1: ( ( ruleState ) )
            // InternalArduinoML.g:3264:2: ( ruleState )
            {
            // InternalArduinoML.g:3264:2: ( ruleState )
            // InternalArduinoML.g:3265:3: ruleState
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
    // InternalArduinoML.g:3274:1: rule__App__NameAssignment_1_1 : ( ruleEString ) ;
    public final void rule__App__NameAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3278:1: ( ( ruleEString ) )
            // InternalArduinoML.g:3279:2: ( ruleEString )
            {
            // InternalArduinoML.g:3279:2: ( ruleEString )
            // InternalArduinoML.g:3280:3: ruleEString
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
    // InternalArduinoML.g:3289:1: rule__App__Initial_modeAssignment_1_4 : ( ( ruleEString ) ) ;
    public final void rule__App__Initial_modeAssignment_1_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3293:1: ( ( ( ruleEString ) ) )
            // InternalArduinoML.g:3294:2: ( ( ruleEString ) )
            {
            // InternalArduinoML.g:3294:2: ( ( ruleEString ) )
            // InternalArduinoML.g:3295:3: ( ruleEString )
            {
             before(grammarAccess.getAppAccess().getInitial_modeModeCrossReference_1_4_0()); 
            // InternalArduinoML.g:3296:3: ( ruleEString )
            // InternalArduinoML.g:3297:4: ruleEString
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
    // InternalArduinoML.g:3308:1: rule__App__BricksAssignment_1_8 : ( ruleBrick ) ;
    public final void rule__App__BricksAssignment_1_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3312:1: ( ( ruleBrick ) )
            // InternalArduinoML.g:3313:2: ( ruleBrick )
            {
            // InternalArduinoML.g:3313:2: ( ruleBrick )
            // InternalArduinoML.g:3314:3: ruleBrick
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
    // InternalArduinoML.g:3323:1: rule__App__BricksAssignment_1_9 : ( ruleBrick ) ;
    public final void rule__App__BricksAssignment_1_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3327:1: ( ( ruleBrick ) )
            // InternalArduinoML.g:3328:2: ( ruleBrick )
            {
            // InternalArduinoML.g:3328:2: ( ruleBrick )
            // InternalArduinoML.g:3329:3: ruleBrick
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
    // InternalArduinoML.g:3338:1: rule__App__ModesAssignment_1_12 : ( ruleMode ) ;
    public final void rule__App__ModesAssignment_1_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3342:1: ( ( ruleMode ) )
            // InternalArduinoML.g:3343:2: ( ruleMode )
            {
            // InternalArduinoML.g:3343:2: ( ruleMode )
            // InternalArduinoML.g:3344:3: ruleMode
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
    // InternalArduinoML.g:3353:1: rule__App__ModesAssignment_1_13 : ( ruleMode ) ;
    public final void rule__App__ModesAssignment_1_13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3357:1: ( ( ruleMode ) )
            // InternalArduinoML.g:3358:2: ( ruleMode )
            {
            // InternalArduinoML.g:3358:2: ( ruleMode )
            // InternalArduinoML.g:3359:3: ruleMode
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
    // InternalArduinoML.g:3368:1: rule__Brick__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Brick__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3372:1: ( ( ruleEString ) )
            // InternalArduinoML.g:3373:2: ( ruleEString )
            {
            // InternalArduinoML.g:3373:2: ( ruleEString )
            // InternalArduinoML.g:3374:3: ruleEString
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
    // InternalArduinoML.g:3383:1: rule__Brick__PinAssignment_3 : ( ruleEInt ) ;
    public final void rule__Brick__PinAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3387:1: ( ( ruleEInt ) )
            // InternalArduinoML.g:3388:2: ( ruleEInt )
            {
            // InternalArduinoML.g:3388:2: ( ruleEInt )
            // InternalArduinoML.g:3389:3: ruleEInt
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
    // InternalArduinoML.g:3398:1: rule__Mode__NameAssignment_0 : ( ruleEString ) ;
    public final void rule__Mode__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3402:1: ( ( ruleEString ) )
            // InternalArduinoML.g:3403:2: ( ruleEString )
            {
            // InternalArduinoML.g:3403:2: ( ruleEString )
            // InternalArduinoML.g:3404:3: ruleEString
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
    // InternalArduinoML.g:3413:1: rule__Mode__InitialAssignment_3 : ( ( ruleEString ) ) ;
    public final void rule__Mode__InitialAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3417:1: ( ( ( ruleEString ) ) )
            // InternalArduinoML.g:3418:2: ( ( ruleEString ) )
            {
            // InternalArduinoML.g:3418:2: ( ( ruleEString ) )
            // InternalArduinoML.g:3419:3: ( ruleEString )
            {
             before(grammarAccess.getModeAccess().getInitialStateCrossReference_3_0()); 
            // InternalArduinoML.g:3420:3: ( ruleEString )
            // InternalArduinoML.g:3421:4: ruleEString
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


    // $ANTLR start "rule__Mode__BricksAssignment_7"
    // InternalArduinoML.g:3432:1: rule__Mode__BricksAssignment_7 : ( ruleBrick ) ;
    public final void rule__Mode__BricksAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3436:1: ( ( ruleBrick ) )
            // InternalArduinoML.g:3437:2: ( ruleBrick )
            {
            // InternalArduinoML.g:3437:2: ( ruleBrick )
            // InternalArduinoML.g:3438:3: ruleBrick
            {
             before(grammarAccess.getModeAccess().getBricksBrickParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleBrick();

            state._fsp--;

             after(grammarAccess.getModeAccess().getBricksBrickParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mode__BricksAssignment_7"


    // $ANTLR start "rule__Mode__BricksAssignment_8"
    // InternalArduinoML.g:3447:1: rule__Mode__BricksAssignment_8 : ( ruleBrick ) ;
    public final void rule__Mode__BricksAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3451:1: ( ( ruleBrick ) )
            // InternalArduinoML.g:3452:2: ( ruleBrick )
            {
            // InternalArduinoML.g:3452:2: ( ruleBrick )
            // InternalArduinoML.g:3453:3: ruleBrick
            {
             before(grammarAccess.getModeAccess().getBricksBrickParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleBrick();

            state._fsp--;

             after(grammarAccess.getModeAccess().getBricksBrickParserRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mode__BricksAssignment_8"


    // $ANTLR start "rule__Mode__StatesAssignment_11"
    // InternalArduinoML.g:3462:1: rule__Mode__StatesAssignment_11 : ( ruleState ) ;
    public final void rule__Mode__StatesAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3466:1: ( ( ruleState ) )
            // InternalArduinoML.g:3467:2: ( ruleState )
            {
            // InternalArduinoML.g:3467:2: ( ruleState )
            // InternalArduinoML.g:3468:3: ruleState
            {
             before(grammarAccess.getModeAccess().getStatesStateParserRuleCall_11_0()); 
            pushFollow(FOLLOW_2);
            ruleState();

            state._fsp--;

             after(grammarAccess.getModeAccess().getStatesStateParserRuleCall_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mode__StatesAssignment_11"


    // $ANTLR start "rule__Mode__StatesAssignment_12"
    // InternalArduinoML.g:3477:1: rule__Mode__StatesAssignment_12 : ( ruleState ) ;
    public final void rule__Mode__StatesAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3481:1: ( ( ruleState ) )
            // InternalArduinoML.g:3482:2: ( ruleState )
            {
            // InternalArduinoML.g:3482:2: ( ruleState )
            // InternalArduinoML.g:3483:3: ruleState
            {
             before(grammarAccess.getModeAccess().getStatesStateParserRuleCall_12_0()); 
            pushFollow(FOLLOW_2);
            ruleState();

            state._fsp--;

             after(grammarAccess.getModeAccess().getStatesStateParserRuleCall_12_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mode__StatesAssignment_12"


    // $ANTLR start "rule__State__NameAssignment_0"
    // InternalArduinoML.g:3492:1: rule__State__NameAssignment_0 : ( ruleEString ) ;
    public final void rule__State__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3496:1: ( ( ruleEString ) )
            // InternalArduinoML.g:3497:2: ( ruleEString )
            {
            // InternalArduinoML.g:3497:2: ( ruleEString )
            // InternalArduinoML.g:3498:3: ruleEString
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
    // InternalArduinoML.g:3507:1: rule__State__ActionsAssignment_2 : ( ruleAction ) ;
    public final void rule__State__ActionsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3511:1: ( ( ruleAction ) )
            // InternalArduinoML.g:3512:2: ( ruleAction )
            {
            // InternalArduinoML.g:3512:2: ( ruleAction )
            // InternalArduinoML.g:3513:3: ruleAction
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
    // InternalArduinoML.g:3522:1: rule__State__ActionsAssignment_3 : ( ruleAction ) ;
    public final void rule__State__ActionsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3526:1: ( ( ruleAction ) )
            // InternalArduinoML.g:3527:2: ( ruleAction )
            {
            // InternalArduinoML.g:3527:2: ( ruleAction )
            // InternalArduinoML.g:3528:3: ruleAction
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


    // $ANTLR start "rule__State__TransitionsAssignment_4"
    // InternalArduinoML.g:3537:1: rule__State__TransitionsAssignment_4 : ( ruleTransition ) ;
    public final void rule__State__TransitionsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3541:1: ( ( ruleTransition ) )
            // InternalArduinoML.g:3542:2: ( ruleTransition )
            {
            // InternalArduinoML.g:3542:2: ( ruleTransition )
            // InternalArduinoML.g:3543:3: ruleTransition
            {
             before(grammarAccess.getStateAccess().getTransitionsTransitionParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleTransition();

            state._fsp--;

             after(grammarAccess.getStateAccess().getTransitionsTransitionParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__TransitionsAssignment_4"


    // $ANTLR start "rule__State__TransitionsAssignment_5"
    // InternalArduinoML.g:3552:1: rule__State__TransitionsAssignment_5 : ( ruleTransition ) ;
    public final void rule__State__TransitionsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3556:1: ( ( ruleTransition ) )
            // InternalArduinoML.g:3557:2: ( ruleTransition )
            {
            // InternalArduinoML.g:3557:2: ( ruleTransition )
            // InternalArduinoML.g:3558:3: ruleTransition
            {
             before(grammarAccess.getStateAccess().getTransitionsTransitionParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleTransition();

            state._fsp--;

             after(grammarAccess.getStateAccess().getTransitionsTransitionParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__TransitionsAssignment_5"


    // $ANTLR start "rule__Action__ActuatorAssignment_1"
    // InternalArduinoML.g:3567:1: rule__Action__ActuatorAssignment_1 : ( ( ruleEString ) ) ;
    public final void rule__Action__ActuatorAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3571:1: ( ( ( ruleEString ) ) )
            // InternalArduinoML.g:3572:2: ( ( ruleEString ) )
            {
            // InternalArduinoML.g:3572:2: ( ( ruleEString ) )
            // InternalArduinoML.g:3573:3: ( ruleEString )
            {
             before(grammarAccess.getActionAccess().getActuatorActuatorCrossReference_1_0()); 
            // InternalArduinoML.g:3574:3: ( ruleEString )
            // InternalArduinoML.g:3575:4: ruleEString
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
    // InternalArduinoML.g:3586:1: rule__Action__ValueAssignment_3 : ( ruleSignal ) ;
    public final void rule__Action__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3590:1: ( ( ruleSignal ) )
            // InternalArduinoML.g:3591:2: ( ruleSignal )
            {
            // InternalArduinoML.g:3591:2: ( ruleSignal )
            // InternalArduinoML.g:3592:3: ruleSignal
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


    // $ANTLR start "rule__Transition__DigitalsAssignment_0_0_1_0_0"
    // InternalArduinoML.g:3601:1: rule__Transition__DigitalsAssignment_0_0_1_0_0 : ( ( ruleEString ) ) ;
    public final void rule__Transition__DigitalsAssignment_0_0_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3605:1: ( ( ( ruleEString ) ) )
            // InternalArduinoML.g:3606:2: ( ( ruleEString ) )
            {
            // InternalArduinoML.g:3606:2: ( ( ruleEString ) )
            // InternalArduinoML.g:3607:3: ( ruleEString )
            {
             before(grammarAccess.getTransitionAccess().getDigitalsDigitalCrossReference_0_0_1_0_0_0()); 
            // InternalArduinoML.g:3608:3: ( ruleEString )
            // InternalArduinoML.g:3609:4: ruleEString
            {
             before(grammarAccess.getTransitionAccess().getDigitalsDigitalEStringParserRuleCall_0_0_1_0_0_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTransitionAccess().getDigitalsDigitalEStringParserRuleCall_0_0_1_0_0_0_1()); 

            }

             after(grammarAccess.getTransitionAccess().getDigitalsDigitalCrossReference_0_0_1_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__DigitalsAssignment_0_0_1_0_0"


    // $ANTLR start "rule__Transition__D_valuesAssignment_0_0_1_0_2"
    // InternalArduinoML.g:3620:1: rule__Transition__D_valuesAssignment_0_0_1_0_2 : ( ruleSignal ) ;
    public final void rule__Transition__D_valuesAssignment_0_0_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3624:1: ( ( ruleSignal ) )
            // InternalArduinoML.g:3625:2: ( ruleSignal )
            {
            // InternalArduinoML.g:3625:2: ( ruleSignal )
            // InternalArduinoML.g:3626:3: ruleSignal
            {
             before(grammarAccess.getTransitionAccess().getD_valuesSignalEnumRuleCall_0_0_1_0_2_0()); 
            pushFollow(FOLLOW_2);
            ruleSignal();

            state._fsp--;

             after(grammarAccess.getTransitionAccess().getD_valuesSignalEnumRuleCall_0_0_1_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__D_valuesAssignment_0_0_1_0_2"


    // $ANTLR start "rule__Transition__AnalogsAssignment_0_0_1_1_0"
    // InternalArduinoML.g:3635:1: rule__Transition__AnalogsAssignment_0_0_1_1_0 : ( ( ruleEString ) ) ;
    public final void rule__Transition__AnalogsAssignment_0_0_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3639:1: ( ( ( ruleEString ) ) )
            // InternalArduinoML.g:3640:2: ( ( ruleEString ) )
            {
            // InternalArduinoML.g:3640:2: ( ( ruleEString ) )
            // InternalArduinoML.g:3641:3: ( ruleEString )
            {
             before(grammarAccess.getTransitionAccess().getAnalogsAnalogCrossReference_0_0_1_1_0_0()); 
            // InternalArduinoML.g:3642:3: ( ruleEString )
            // InternalArduinoML.g:3643:4: ruleEString
            {
             before(grammarAccess.getTransitionAccess().getAnalogsAnalogEStringParserRuleCall_0_0_1_1_0_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTransitionAccess().getAnalogsAnalogEStringParserRuleCall_0_0_1_1_0_0_1()); 

            }

             after(grammarAccess.getTransitionAccess().getAnalogsAnalogCrossReference_0_0_1_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__AnalogsAssignment_0_0_1_1_0"


    // $ANTLR start "rule__Transition__CompAssignment_0_0_1_1_1"
    // InternalArduinoML.g:3654:1: rule__Transition__CompAssignment_0_0_1_1_1 : ( ruleCompare ) ;
    public final void rule__Transition__CompAssignment_0_0_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3658:1: ( ( ruleCompare ) )
            // InternalArduinoML.g:3659:2: ( ruleCompare )
            {
            // InternalArduinoML.g:3659:2: ( ruleCompare )
            // InternalArduinoML.g:3660:3: ruleCompare
            {
             before(grammarAccess.getTransitionAccess().getCompCompareEnumRuleCall_0_0_1_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCompare();

            state._fsp--;

             after(grammarAccess.getTransitionAccess().getCompCompareEnumRuleCall_0_0_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__CompAssignment_0_0_1_1_1"


    // $ANTLR start "rule__Transition__A_valuesAssignment_0_0_1_1_2"
    // InternalArduinoML.g:3669:1: rule__Transition__A_valuesAssignment_0_0_1_1_2 : ( ruleEInt ) ;
    public final void rule__Transition__A_valuesAssignment_0_0_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3673:1: ( ( ruleEInt ) )
            // InternalArduinoML.g:3674:2: ( ruleEInt )
            {
            // InternalArduinoML.g:3674:2: ( ruleEInt )
            // InternalArduinoML.g:3675:3: ruleEInt
            {
             before(grammarAccess.getTransitionAccess().getA_valuesEIntParserRuleCall_0_0_1_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getTransitionAccess().getA_valuesEIntParserRuleCall_0_0_1_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__A_valuesAssignment_0_0_1_1_2"


    // $ANTLR start "rule__Transition__DigitalsAssignment_0_0_2_1_0_0"
    // InternalArduinoML.g:3684:1: rule__Transition__DigitalsAssignment_0_0_2_1_0_0 : ( ( ruleEString ) ) ;
    public final void rule__Transition__DigitalsAssignment_0_0_2_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3688:1: ( ( ( ruleEString ) ) )
            // InternalArduinoML.g:3689:2: ( ( ruleEString ) )
            {
            // InternalArduinoML.g:3689:2: ( ( ruleEString ) )
            // InternalArduinoML.g:3690:3: ( ruleEString )
            {
             before(grammarAccess.getTransitionAccess().getDigitalsDigitalCrossReference_0_0_2_1_0_0_0()); 
            // InternalArduinoML.g:3691:3: ( ruleEString )
            // InternalArduinoML.g:3692:4: ruleEString
            {
             before(grammarAccess.getTransitionAccess().getDigitalsDigitalEStringParserRuleCall_0_0_2_1_0_0_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTransitionAccess().getDigitalsDigitalEStringParserRuleCall_0_0_2_1_0_0_0_1()); 

            }

             after(grammarAccess.getTransitionAccess().getDigitalsDigitalCrossReference_0_0_2_1_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__DigitalsAssignment_0_0_2_1_0_0"


    // $ANTLR start "rule__Transition__D_valuesAssignment_0_0_2_1_0_2"
    // InternalArduinoML.g:3703:1: rule__Transition__D_valuesAssignment_0_0_2_1_0_2 : ( ruleSignal ) ;
    public final void rule__Transition__D_valuesAssignment_0_0_2_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3707:1: ( ( ruleSignal ) )
            // InternalArduinoML.g:3708:2: ( ruleSignal )
            {
            // InternalArduinoML.g:3708:2: ( ruleSignal )
            // InternalArduinoML.g:3709:3: ruleSignal
            {
             before(grammarAccess.getTransitionAccess().getD_valuesSignalEnumRuleCall_0_0_2_1_0_2_0()); 
            pushFollow(FOLLOW_2);
            ruleSignal();

            state._fsp--;

             after(grammarAccess.getTransitionAccess().getD_valuesSignalEnumRuleCall_0_0_2_1_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__D_valuesAssignment_0_0_2_1_0_2"


    // $ANTLR start "rule__Transition__AnalogsAssignment_0_0_2_1_1_0"
    // InternalArduinoML.g:3718:1: rule__Transition__AnalogsAssignment_0_0_2_1_1_0 : ( ( ruleEString ) ) ;
    public final void rule__Transition__AnalogsAssignment_0_0_2_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3722:1: ( ( ( ruleEString ) ) )
            // InternalArduinoML.g:3723:2: ( ( ruleEString ) )
            {
            // InternalArduinoML.g:3723:2: ( ( ruleEString ) )
            // InternalArduinoML.g:3724:3: ( ruleEString )
            {
             before(grammarAccess.getTransitionAccess().getAnalogsAnalogCrossReference_0_0_2_1_1_0_0()); 
            // InternalArduinoML.g:3725:3: ( ruleEString )
            // InternalArduinoML.g:3726:4: ruleEString
            {
             before(grammarAccess.getTransitionAccess().getAnalogsAnalogEStringParserRuleCall_0_0_2_1_1_0_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTransitionAccess().getAnalogsAnalogEStringParserRuleCall_0_0_2_1_1_0_0_1()); 

            }

             after(grammarAccess.getTransitionAccess().getAnalogsAnalogCrossReference_0_0_2_1_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__AnalogsAssignment_0_0_2_1_1_0"


    // $ANTLR start "rule__Transition__CompAssignment_0_0_2_1_1_1"
    // InternalArduinoML.g:3737:1: rule__Transition__CompAssignment_0_0_2_1_1_1 : ( ruleCompare ) ;
    public final void rule__Transition__CompAssignment_0_0_2_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3741:1: ( ( ruleCompare ) )
            // InternalArduinoML.g:3742:2: ( ruleCompare )
            {
            // InternalArduinoML.g:3742:2: ( ruleCompare )
            // InternalArduinoML.g:3743:3: ruleCompare
            {
             before(grammarAccess.getTransitionAccess().getCompCompareEnumRuleCall_0_0_2_1_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCompare();

            state._fsp--;

             after(grammarAccess.getTransitionAccess().getCompCompareEnumRuleCall_0_0_2_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__CompAssignment_0_0_2_1_1_1"


    // $ANTLR start "rule__Transition__A_valuesAssignment_0_0_2_1_1_2"
    // InternalArduinoML.g:3752:1: rule__Transition__A_valuesAssignment_0_0_2_1_1_2 : ( ruleEInt ) ;
    public final void rule__Transition__A_valuesAssignment_0_0_2_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3756:1: ( ( ruleEInt ) )
            // InternalArduinoML.g:3757:2: ( ruleEInt )
            {
            // InternalArduinoML.g:3757:2: ( ruleEInt )
            // InternalArduinoML.g:3758:3: ruleEInt
            {
             before(grammarAccess.getTransitionAccess().getA_valuesEIntParserRuleCall_0_0_2_1_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getTransitionAccess().getA_valuesEIntParserRuleCall_0_0_2_1_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__A_valuesAssignment_0_0_2_1_1_2"


    // $ANTLR start "rule__Transition__TimeAssignment_0_0_3_1"
    // InternalArduinoML.g:3767:1: rule__Transition__TimeAssignment_0_0_3_1 : ( ruleEInt ) ;
    public final void rule__Transition__TimeAssignment_0_0_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3771:1: ( ( ruleEInt ) )
            // InternalArduinoML.g:3772:2: ( ruleEInt )
            {
            // InternalArduinoML.g:3772:2: ( ruleEInt )
            // InternalArduinoML.g:3773:3: ruleEInt
            {
             before(grammarAccess.getTransitionAccess().getTimeEIntParserRuleCall_0_0_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getTransitionAccess().getTimeEIntParserRuleCall_0_0_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__TimeAssignment_0_0_3_1"


    // $ANTLR start "rule__Transition__UnitAssignment_0_0_3_2"
    // InternalArduinoML.g:3782:1: rule__Transition__UnitAssignment_0_0_3_2 : ( ruleTime_unit ) ;
    public final void rule__Transition__UnitAssignment_0_0_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3786:1: ( ( ruleTime_unit ) )
            // InternalArduinoML.g:3787:2: ( ruleTime_unit )
            {
            // InternalArduinoML.g:3787:2: ( ruleTime_unit )
            // InternalArduinoML.g:3788:3: ruleTime_unit
            {
             before(grammarAccess.getTransitionAccess().getUnitTime_unitEnumRuleCall_0_0_3_2_0()); 
            pushFollow(FOLLOW_2);
            ruleTime_unit();

            state._fsp--;

             after(grammarAccess.getTransitionAccess().getUnitTime_unitEnumRuleCall_0_0_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__UnitAssignment_0_0_3_2"


    // $ANTLR start "rule__Transition__TimeAssignment_0_1_1"
    // InternalArduinoML.g:3797:1: rule__Transition__TimeAssignment_0_1_1 : ( ruleEInt ) ;
    public final void rule__Transition__TimeAssignment_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3801:1: ( ( ruleEInt ) )
            // InternalArduinoML.g:3802:2: ( ruleEInt )
            {
            // InternalArduinoML.g:3802:2: ( ruleEInt )
            // InternalArduinoML.g:3803:3: ruleEInt
            {
             before(grammarAccess.getTransitionAccess().getTimeEIntParserRuleCall_0_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getTransitionAccess().getTimeEIntParserRuleCall_0_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__TimeAssignment_0_1_1"


    // $ANTLR start "rule__Transition__UnitAssignment_0_1_2"
    // InternalArduinoML.g:3812:1: rule__Transition__UnitAssignment_0_1_2 : ( ruleTime_unit ) ;
    public final void rule__Transition__UnitAssignment_0_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3816:1: ( ( ruleTime_unit ) )
            // InternalArduinoML.g:3817:2: ( ruleTime_unit )
            {
            // InternalArduinoML.g:3817:2: ( ruleTime_unit )
            // InternalArduinoML.g:3818:3: ruleTime_unit
            {
             before(grammarAccess.getTransitionAccess().getUnitTime_unitEnumRuleCall_0_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleTime_unit();

            state._fsp--;

             after(grammarAccess.getTransitionAccess().getUnitTime_unitEnumRuleCall_0_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__UnitAssignment_0_1_2"


    // $ANTLR start "rule__Transition__Next_stateAssignment_3_0_1"
    // InternalArduinoML.g:3827:1: rule__Transition__Next_stateAssignment_3_0_1 : ( ( ruleEString ) ) ;
    public final void rule__Transition__Next_stateAssignment_3_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3831:1: ( ( ( ruleEString ) ) )
            // InternalArduinoML.g:3832:2: ( ( ruleEString ) )
            {
            // InternalArduinoML.g:3832:2: ( ( ruleEString ) )
            // InternalArduinoML.g:3833:3: ( ruleEString )
            {
             before(grammarAccess.getTransitionAccess().getNext_stateStateCrossReference_3_0_1_0()); 
            // InternalArduinoML.g:3834:3: ( ruleEString )
            // InternalArduinoML.g:3835:4: ruleEString
            {
             before(grammarAccess.getTransitionAccess().getNext_stateStateEStringParserRuleCall_3_0_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTransitionAccess().getNext_stateStateEStringParserRuleCall_3_0_1_0_1()); 

            }

             after(grammarAccess.getTransitionAccess().getNext_stateStateCrossReference_3_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Next_stateAssignment_3_0_1"


    // $ANTLR start "rule__Transition__Next_modeAssignment_3_1_1"
    // InternalArduinoML.g:3846:1: rule__Transition__Next_modeAssignment_3_1_1 : ( ( ruleEString ) ) ;
    public final void rule__Transition__Next_modeAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3850:1: ( ( ( ruleEString ) ) )
            // InternalArduinoML.g:3851:2: ( ( ruleEString ) )
            {
            // InternalArduinoML.g:3851:2: ( ( ruleEString ) )
            // InternalArduinoML.g:3852:3: ( ruleEString )
            {
             before(grammarAccess.getTransitionAccess().getNext_modeModeCrossReference_3_1_1_0()); 
            // InternalArduinoML.g:3853:3: ( ruleEString )
            // InternalArduinoML.g:3854:4: ruleEString
            {
             before(grammarAccess.getTransitionAccess().getNext_modeModeEStringParserRuleCall_3_1_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTransitionAccess().getNext_modeModeEStringParserRuleCall_3_1_1_0_1()); 

            }

             after(grammarAccess.getTransitionAccess().getNext_modeModeCrossReference_3_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Next_modeAssignment_3_1_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000000E0000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000000E4000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000E0000002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000062L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x00000000F0000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000004900000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000004900000002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000008800000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000006000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x00000000001F0000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x000000000000E000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000008000000000L});

}