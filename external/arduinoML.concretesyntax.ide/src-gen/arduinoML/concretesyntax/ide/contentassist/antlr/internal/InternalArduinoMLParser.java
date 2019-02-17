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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_BOOLEAN_CONSTANT", "RULE_INT", "RULE_STRING", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'HIGH'", "'LOW'", "'ms'", "'s'", "'min'", "'inf'", "'einf'", "'equal'", "'esup'", "'sup'", "'enable'", "'monitoring'", "'app'", "'initial'", "'mode'", "':'", "'bricks'", "'modes'", "'with'", "'debug'", "'state'", "'states'", "'transitions'", "'Actuator'", "'Digital'", "'Analog'", "'change'", "'to'", "'go'", "'when'", "'is'", "'and'", "'wait'", "'then'"
    };
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
    // InternalArduinoML.g:62:1: ruleApp : ( ( rule__App__Group__0 ) ) ;
    public final void ruleApp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:66:2: ( ( ( rule__App__Group__0 ) ) )
            // InternalArduinoML.g:67:2: ( ( rule__App__Group__0 ) )
            {
            // InternalArduinoML.g:67:2: ( ( rule__App__Group__0 ) )
            // InternalArduinoML.g:68:3: ( rule__App__Group__0 )
            {
             before(grammarAccess.getAppAccess().getGroup()); 
            // InternalArduinoML.g:69:3: ( rule__App__Group__0 )
            // InternalArduinoML.g:69:4: rule__App__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__App__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAppAccess().getGroup()); 

            }


            }

        }
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
    // InternalArduinoML.g:87:1: ruleBrick : ( ( rule__Brick__Alternatives ) ) ;
    public final void ruleBrick() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:91:2: ( ( ( rule__Brick__Alternatives ) ) )
            // InternalArduinoML.g:92:2: ( ( rule__Brick__Alternatives ) )
            {
            // InternalArduinoML.g:92:2: ( ( rule__Brick__Alternatives ) )
            // InternalArduinoML.g:93:3: ( rule__Brick__Alternatives )
            {
             before(grammarAccess.getBrickAccess().getAlternatives()); 
            // InternalArduinoML.g:94:3: ( rule__Brick__Alternatives )
            // InternalArduinoML.g:94:4: rule__Brick__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Brick__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBrickAccess().getAlternatives()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleEBoolean"
    // InternalArduinoML.g:128:1: entryRuleEBoolean : ruleEBoolean EOF ;
    public final void entryRuleEBoolean() throws RecognitionException {
        try {
            // InternalArduinoML.g:129:1: ( ruleEBoolean EOF )
            // InternalArduinoML.g:130:1: ruleEBoolean EOF
            {
             before(grammarAccess.getEBooleanRule()); 
            pushFollow(FOLLOW_1);
            ruleEBoolean();

            state._fsp--;

             after(grammarAccess.getEBooleanRule()); 
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
    // $ANTLR end "entryRuleEBoolean"


    // $ANTLR start "ruleEBoolean"
    // InternalArduinoML.g:137:1: ruleEBoolean : ( RULE_BOOLEAN_CONSTANT ) ;
    public final void ruleEBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:141:2: ( ( RULE_BOOLEAN_CONSTANT ) )
            // InternalArduinoML.g:142:2: ( RULE_BOOLEAN_CONSTANT )
            {
            // InternalArduinoML.g:142:2: ( RULE_BOOLEAN_CONSTANT )
            // InternalArduinoML.g:143:3: RULE_BOOLEAN_CONSTANT
            {
             before(grammarAccess.getEBooleanAccess().getBOOLEAN_CONSTANTTerminalRuleCall()); 
            match(input,RULE_BOOLEAN_CONSTANT,FOLLOW_2); 
             after(grammarAccess.getEBooleanAccess().getBOOLEAN_CONSTANTTerminalRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEBoolean"


    // $ANTLR start "entryRuleMode"
    // InternalArduinoML.g:153:1: entryRuleMode : ruleMode EOF ;
    public final void entryRuleMode() throws RecognitionException {
        try {
            // InternalArduinoML.g:154:1: ( ruleMode EOF )
            // InternalArduinoML.g:155:1: ruleMode EOF
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
    // InternalArduinoML.g:162:1: ruleMode : ( ( rule__Mode__Group__0 ) ) ;
    public final void ruleMode() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:166:2: ( ( ( rule__Mode__Group__0 ) ) )
            // InternalArduinoML.g:167:2: ( ( rule__Mode__Group__0 ) )
            {
            // InternalArduinoML.g:167:2: ( ( rule__Mode__Group__0 ) )
            // InternalArduinoML.g:168:3: ( rule__Mode__Group__0 )
            {
             before(grammarAccess.getModeAccess().getGroup()); 
            // InternalArduinoML.g:169:3: ( rule__Mode__Group__0 )
            // InternalArduinoML.g:169:4: rule__Mode__Group__0
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
    // InternalArduinoML.g:178:1: entryRuleState : ruleState EOF ;
    public final void entryRuleState() throws RecognitionException {
        try {
            // InternalArduinoML.g:179:1: ( ruleState EOF )
            // InternalArduinoML.g:180:1: ruleState EOF
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
    // InternalArduinoML.g:187:1: ruleState : ( ( rule__State__Group__0 ) ) ;
    public final void ruleState() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:191:2: ( ( ( rule__State__Group__0 ) ) )
            // InternalArduinoML.g:192:2: ( ( rule__State__Group__0 ) )
            {
            // InternalArduinoML.g:192:2: ( ( rule__State__Group__0 ) )
            // InternalArduinoML.g:193:3: ( rule__State__Group__0 )
            {
             before(grammarAccess.getStateAccess().getGroup()); 
            // InternalArduinoML.g:194:3: ( rule__State__Group__0 )
            // InternalArduinoML.g:194:4: rule__State__Group__0
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
    // InternalArduinoML.g:203:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // InternalArduinoML.g:204:1: ( ruleEInt EOF )
            // InternalArduinoML.g:205:1: ruleEInt EOF
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
    // InternalArduinoML.g:212:1: ruleEInt : ( RULE_INT ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:216:2: ( ( RULE_INT ) )
            // InternalArduinoML.g:217:2: ( RULE_INT )
            {
            // InternalArduinoML.g:217:2: ( RULE_INT )
            // InternalArduinoML.g:218:3: RULE_INT
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
    // InternalArduinoML.g:228:1: entryRuleActuator : ruleActuator EOF ;
    public final void entryRuleActuator() throws RecognitionException {
        try {
            // InternalArduinoML.g:229:1: ( ruleActuator EOF )
            // InternalArduinoML.g:230:1: ruleActuator EOF
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
    // InternalArduinoML.g:237:1: ruleActuator : ( ( rule__Actuator__Group__0 ) ) ;
    public final void ruleActuator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:241:2: ( ( ( rule__Actuator__Group__0 ) ) )
            // InternalArduinoML.g:242:2: ( ( rule__Actuator__Group__0 ) )
            {
            // InternalArduinoML.g:242:2: ( ( rule__Actuator__Group__0 ) )
            // InternalArduinoML.g:243:3: ( rule__Actuator__Group__0 )
            {
             before(grammarAccess.getActuatorAccess().getGroup()); 
            // InternalArduinoML.g:244:3: ( rule__Actuator__Group__0 )
            // InternalArduinoML.g:244:4: rule__Actuator__Group__0
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
    // InternalArduinoML.g:253:1: entryRuleDigital : ruleDigital EOF ;
    public final void entryRuleDigital() throws RecognitionException {
        try {
            // InternalArduinoML.g:254:1: ( ruleDigital EOF )
            // InternalArduinoML.g:255:1: ruleDigital EOF
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
    // InternalArduinoML.g:262:1: ruleDigital : ( ( rule__Digital__Group__0 ) ) ;
    public final void ruleDigital() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:266:2: ( ( ( rule__Digital__Group__0 ) ) )
            // InternalArduinoML.g:267:2: ( ( rule__Digital__Group__0 ) )
            {
            // InternalArduinoML.g:267:2: ( ( rule__Digital__Group__0 ) )
            // InternalArduinoML.g:268:3: ( rule__Digital__Group__0 )
            {
             before(grammarAccess.getDigitalAccess().getGroup()); 
            // InternalArduinoML.g:269:3: ( rule__Digital__Group__0 )
            // InternalArduinoML.g:269:4: rule__Digital__Group__0
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
    // InternalArduinoML.g:278:1: entryRuleAnalog : ruleAnalog EOF ;
    public final void entryRuleAnalog() throws RecognitionException {
        try {
            // InternalArduinoML.g:279:1: ( ruleAnalog EOF )
            // InternalArduinoML.g:280:1: ruleAnalog EOF
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
    // InternalArduinoML.g:287:1: ruleAnalog : ( ( rule__Analog__Group__0 ) ) ;
    public final void ruleAnalog() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:291:2: ( ( ( rule__Analog__Group__0 ) ) )
            // InternalArduinoML.g:292:2: ( ( rule__Analog__Group__0 ) )
            {
            // InternalArduinoML.g:292:2: ( ( rule__Analog__Group__0 ) )
            // InternalArduinoML.g:293:3: ( rule__Analog__Group__0 )
            {
             before(grammarAccess.getAnalogAccess().getGroup()); 
            // InternalArduinoML.g:294:3: ( rule__Analog__Group__0 )
            // InternalArduinoML.g:294:4: rule__Analog__Group__0
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
    // InternalArduinoML.g:303:1: entryRuleAction : ruleAction EOF ;
    public final void entryRuleAction() throws RecognitionException {
        try {
            // InternalArduinoML.g:304:1: ( ruleAction EOF )
            // InternalArduinoML.g:305:1: ruleAction EOF
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
    // InternalArduinoML.g:312:1: ruleAction : ( ( rule__Action__Group__0 ) ) ;
    public final void ruleAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:316:2: ( ( ( rule__Action__Group__0 ) ) )
            // InternalArduinoML.g:317:2: ( ( rule__Action__Group__0 ) )
            {
            // InternalArduinoML.g:317:2: ( ( rule__Action__Group__0 ) )
            // InternalArduinoML.g:318:3: ( rule__Action__Group__0 )
            {
             before(grammarAccess.getActionAccess().getGroup()); 
            // InternalArduinoML.g:319:3: ( rule__Action__Group__0 )
            // InternalArduinoML.g:319:4: rule__Action__Group__0
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
    // InternalArduinoML.g:328:1: entryRuleTransitionState : ruleTransitionState EOF ;
    public final void entryRuleTransitionState() throws RecognitionException {
        try {
            // InternalArduinoML.g:329:1: ( ruleTransitionState EOF )
            // InternalArduinoML.g:330:1: ruleTransitionState EOF
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
    // InternalArduinoML.g:337:1: ruleTransitionState : ( ( rule__TransitionState__Group__0 ) ) ;
    public final void ruleTransitionState() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:341:2: ( ( ( rule__TransitionState__Group__0 ) ) )
            // InternalArduinoML.g:342:2: ( ( rule__TransitionState__Group__0 ) )
            {
            // InternalArduinoML.g:342:2: ( ( rule__TransitionState__Group__0 ) )
            // InternalArduinoML.g:343:3: ( rule__TransitionState__Group__0 )
            {
             before(grammarAccess.getTransitionStateAccess().getGroup()); 
            // InternalArduinoML.g:344:3: ( rule__TransitionState__Group__0 )
            // InternalArduinoML.g:344:4: rule__TransitionState__Group__0
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
    // InternalArduinoML.g:353:1: entryRuleTransitionMode : ruleTransitionMode EOF ;
    public final void entryRuleTransitionMode() throws RecognitionException {
        try {
            // InternalArduinoML.g:354:1: ( ruleTransitionMode EOF )
            // InternalArduinoML.g:355:1: ruleTransitionMode EOF
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
    // InternalArduinoML.g:362:1: ruleTransitionMode : ( ( rule__TransitionMode__Group__0 ) ) ;
    public final void ruleTransitionMode() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:366:2: ( ( ( rule__TransitionMode__Group__0 ) ) )
            // InternalArduinoML.g:367:2: ( ( rule__TransitionMode__Group__0 ) )
            {
            // InternalArduinoML.g:367:2: ( ( rule__TransitionMode__Group__0 ) )
            // InternalArduinoML.g:368:3: ( rule__TransitionMode__Group__0 )
            {
             before(grammarAccess.getTransitionModeAccess().getGroup()); 
            // InternalArduinoML.g:369:3: ( rule__TransitionMode__Group__0 )
            // InternalArduinoML.g:369:4: rule__TransitionMode__Group__0
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
    // InternalArduinoML.g:378:1: ruleSignal : ( ( rule__Signal__Alternatives ) ) ;
    public final void ruleSignal() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:382:1: ( ( ( rule__Signal__Alternatives ) ) )
            // InternalArduinoML.g:383:2: ( ( rule__Signal__Alternatives ) )
            {
            // InternalArduinoML.g:383:2: ( ( rule__Signal__Alternatives ) )
            // InternalArduinoML.g:384:3: ( rule__Signal__Alternatives )
            {
             before(grammarAccess.getSignalAccess().getAlternatives()); 
            // InternalArduinoML.g:385:3: ( rule__Signal__Alternatives )
            // InternalArduinoML.g:385:4: rule__Signal__Alternatives
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
    // InternalArduinoML.g:394:1: ruleTime_unit : ( ( rule__Time_unit__Alternatives ) ) ;
    public final void ruleTime_unit() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:398:1: ( ( ( rule__Time_unit__Alternatives ) ) )
            // InternalArduinoML.g:399:2: ( ( rule__Time_unit__Alternatives ) )
            {
            // InternalArduinoML.g:399:2: ( ( rule__Time_unit__Alternatives ) )
            // InternalArduinoML.g:400:3: ( rule__Time_unit__Alternatives )
            {
             before(grammarAccess.getTime_unitAccess().getAlternatives()); 
            // InternalArduinoML.g:401:3: ( rule__Time_unit__Alternatives )
            // InternalArduinoML.g:401:4: rule__Time_unit__Alternatives
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
    // InternalArduinoML.g:410:1: ruleCompare : ( ( rule__Compare__Alternatives ) ) ;
    public final void ruleCompare() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:414:1: ( ( ( rule__Compare__Alternatives ) ) )
            // InternalArduinoML.g:415:2: ( ( rule__Compare__Alternatives ) )
            {
            // InternalArduinoML.g:415:2: ( ( rule__Compare__Alternatives ) )
            // InternalArduinoML.g:416:3: ( rule__Compare__Alternatives )
            {
             before(grammarAccess.getCompareAccess().getAlternatives()); 
            // InternalArduinoML.g:417:3: ( rule__Compare__Alternatives )
            // InternalArduinoML.g:417:4: rule__Compare__Alternatives
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


    // $ANTLR start "rule__App__Alternatives_1"
    // InternalArduinoML.g:425:1: rule__App__Alternatives_1 : ( ( ( rule__App__Group_1_0__0 ) ) | ( ( rule__App__Group_1_1__0 ) ) );
    public final void rule__App__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:429:1: ( ( ( rule__App__Group_1_0__0 ) ) | ( ( rule__App__Group_1_1__0 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==24) ) {
                int LA1_1 = input.LA(2);

                if ( (LA1_1==RULE_STRING) ) {
                    int LA1_2 = input.LA(3);

                    if ( (LA1_2==25) ) {
                        int LA1_4 = input.LA(4);

                        if ( (LA1_4==32) ) {
                            alt1=2;
                        }
                        else if ( (LA1_4==26) ) {
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

                    if ( (LA1_3==25) ) {
                        int LA1_4 = input.LA(4);

                        if ( (LA1_4==32) ) {
                            alt1=2;
                        }
                        else if ( (LA1_4==26) ) {
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
                    // InternalArduinoML.g:430:2: ( ( rule__App__Group_1_0__0 ) )
                    {
                    // InternalArduinoML.g:430:2: ( ( rule__App__Group_1_0__0 ) )
                    // InternalArduinoML.g:431:3: ( rule__App__Group_1_0__0 )
                    {
                     before(grammarAccess.getAppAccess().getGroup_1_0()); 
                    // InternalArduinoML.g:432:3: ( rule__App__Group_1_0__0 )
                    // InternalArduinoML.g:432:4: rule__App__Group_1_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__App__Group_1_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAppAccess().getGroup_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalArduinoML.g:436:2: ( ( rule__App__Group_1_1__0 ) )
                    {
                    // InternalArduinoML.g:436:2: ( ( rule__App__Group_1_1__0 ) )
                    // InternalArduinoML.g:437:3: ( rule__App__Group_1_1__0 )
                    {
                     before(grammarAccess.getAppAccess().getGroup_1_1()); 
                    // InternalArduinoML.g:438:3: ( rule__App__Group_1_1__0 )
                    // InternalArduinoML.g:438:4: rule__App__Group_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__App__Group_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAppAccess().getGroup_1_1()); 

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
    // $ANTLR end "rule__App__Alternatives_1"


    // $ANTLR start "rule__Brick__Alternatives"
    // InternalArduinoML.g:446:1: rule__Brick__Alternatives : ( ( ( rule__Brick__Group_0__0 ) ) | ( ( rule__Brick__Group_1__0 ) ) );
    public final void rule__Brick__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:450:1: ( ( ( rule__Brick__Group_0__0 ) ) | ( ( rule__Brick__Group_1__0 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=35 && LA2_0<=36)) ) {
                alt2=1;
            }
            else if ( (LA2_0==37) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalArduinoML.g:451:2: ( ( rule__Brick__Group_0__0 ) )
                    {
                    // InternalArduinoML.g:451:2: ( ( rule__Brick__Group_0__0 ) )
                    // InternalArduinoML.g:452:3: ( rule__Brick__Group_0__0 )
                    {
                     before(grammarAccess.getBrickAccess().getGroup_0()); 
                    // InternalArduinoML.g:453:3: ( rule__Brick__Group_0__0 )
                    // InternalArduinoML.g:453:4: rule__Brick__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Brick__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getBrickAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalArduinoML.g:457:2: ( ( rule__Brick__Group_1__0 ) )
                    {
                    // InternalArduinoML.g:457:2: ( ( rule__Brick__Group_1__0 ) )
                    // InternalArduinoML.g:458:3: ( rule__Brick__Group_1__0 )
                    {
                     before(grammarAccess.getBrickAccess().getGroup_1()); 
                    // InternalArduinoML.g:459:3: ( rule__Brick__Group_1__0 )
                    // InternalArduinoML.g:459:4: rule__Brick__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Brick__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getBrickAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Brick__Alternatives"


    // $ANTLR start "rule__Brick__Alternatives_0_0"
    // InternalArduinoML.g:467:1: rule__Brick__Alternatives_0_0 : ( ( ruleActuator ) | ( ruleDigital ) );
    public final void rule__Brick__Alternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:471:1: ( ( ruleActuator ) | ( ruleDigital ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==35) ) {
                alt3=1;
            }
            else if ( (LA3_0==36) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalArduinoML.g:472:2: ( ruleActuator )
                    {
                    // InternalArduinoML.g:472:2: ( ruleActuator )
                    // InternalArduinoML.g:473:3: ruleActuator
                    {
                     before(grammarAccess.getBrickAccess().getActuatorParserRuleCall_0_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleActuator();

                    state._fsp--;

                     after(grammarAccess.getBrickAccess().getActuatorParserRuleCall_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalArduinoML.g:478:2: ( ruleDigital )
                    {
                    // InternalArduinoML.g:478:2: ( ruleDigital )
                    // InternalArduinoML.g:479:3: ruleDigital
                    {
                     before(grammarAccess.getBrickAccess().getDigitalParserRuleCall_0_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleDigital();

                    state._fsp--;

                     after(grammarAccess.getBrickAccess().getDigitalParserRuleCall_0_0_1()); 

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
    // $ANTLR end "rule__Brick__Alternatives_0_0"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalArduinoML.g:488:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:492:1: ( ( RULE_STRING ) | ( RULE_ID ) )
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
                    // InternalArduinoML.g:493:2: ( RULE_STRING )
                    {
                    // InternalArduinoML.g:493:2: ( RULE_STRING )
                    // InternalArduinoML.g:494:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalArduinoML.g:499:2: ( RULE_ID )
                    {
                    // InternalArduinoML.g:499:2: ( RULE_ID )
                    // InternalArduinoML.g:500:3: RULE_ID
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
    // InternalArduinoML.g:509:1: rule__TransitionState__Alternatives_0 : ( ( ( rule__TransitionState__Group_0_0__0 ) ) | ( ( rule__TransitionState__Group_0_1__0 ) ) );
    public final void rule__TransitionState__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:513:1: ( ( ( rule__TransitionState__Group_0_0__0 ) ) | ( ( rule__TransitionState__Group_0_1__0 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==41) ) {
                alt5=1;
            }
            else if ( (LA5_0==44) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalArduinoML.g:514:2: ( ( rule__TransitionState__Group_0_0__0 ) )
                    {
                    // InternalArduinoML.g:514:2: ( ( rule__TransitionState__Group_0_0__0 ) )
                    // InternalArduinoML.g:515:3: ( rule__TransitionState__Group_0_0__0 )
                    {
                     before(grammarAccess.getTransitionStateAccess().getGroup_0_0()); 
                    // InternalArduinoML.g:516:3: ( rule__TransitionState__Group_0_0__0 )
                    // InternalArduinoML.g:516:4: rule__TransitionState__Group_0_0__0
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
                    // InternalArduinoML.g:520:2: ( ( rule__TransitionState__Group_0_1__0 ) )
                    {
                    // InternalArduinoML.g:520:2: ( ( rule__TransitionState__Group_0_1__0 ) )
                    // InternalArduinoML.g:521:3: ( rule__TransitionState__Group_0_1__0 )
                    {
                     before(grammarAccess.getTransitionStateAccess().getGroup_0_1()); 
                    // InternalArduinoML.g:522:3: ( rule__TransitionState__Group_0_1__0 )
                    // InternalArduinoML.g:522:4: rule__TransitionState__Group_0_1__0
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
    // InternalArduinoML.g:530:1: rule__TransitionState__Alternatives_0_0_1 : ( ( ( rule__TransitionState__Group_0_0_1_0__0 ) ) | ( ( rule__TransitionState__Group_0_0_1_1__0 ) ) );
    public final void rule__TransitionState__Alternatives_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:534:1: ( ( ( rule__TransitionState__Group_0_0_1_0__0 ) ) | ( ( rule__TransitionState__Group_0_0_1_1__0 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_STRING) ) {
                int LA6_1 = input.LA(2);

                if ( ((LA6_1>=17 && LA6_1<=21)) ) {
                    alt6=2;
                }
                else if ( (LA6_1==42) ) {
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

                if ( ((LA6_2>=17 && LA6_2<=21)) ) {
                    alt6=2;
                }
                else if ( (LA6_2==42) ) {
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
                    // InternalArduinoML.g:535:2: ( ( rule__TransitionState__Group_0_0_1_0__0 ) )
                    {
                    // InternalArduinoML.g:535:2: ( ( rule__TransitionState__Group_0_0_1_0__0 ) )
                    // InternalArduinoML.g:536:3: ( rule__TransitionState__Group_0_0_1_0__0 )
                    {
                     before(grammarAccess.getTransitionStateAccess().getGroup_0_0_1_0()); 
                    // InternalArduinoML.g:537:3: ( rule__TransitionState__Group_0_0_1_0__0 )
                    // InternalArduinoML.g:537:4: rule__TransitionState__Group_0_0_1_0__0
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
                    // InternalArduinoML.g:541:2: ( ( rule__TransitionState__Group_0_0_1_1__0 ) )
                    {
                    // InternalArduinoML.g:541:2: ( ( rule__TransitionState__Group_0_0_1_1__0 ) )
                    // InternalArduinoML.g:542:3: ( rule__TransitionState__Group_0_0_1_1__0 )
                    {
                     before(grammarAccess.getTransitionStateAccess().getGroup_0_0_1_1()); 
                    // InternalArduinoML.g:543:3: ( rule__TransitionState__Group_0_0_1_1__0 )
                    // InternalArduinoML.g:543:4: rule__TransitionState__Group_0_0_1_1__0
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
    // InternalArduinoML.g:551:1: rule__TransitionState__Alternatives_0_0_2_1 : ( ( ( rule__TransitionState__Group_0_0_2_1_0__0 ) ) | ( ( rule__TransitionState__Group_0_0_2_1_1__0 ) ) );
    public final void rule__TransitionState__Alternatives_0_0_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:555:1: ( ( ( rule__TransitionState__Group_0_0_2_1_0__0 ) ) | ( ( rule__TransitionState__Group_0_0_2_1_1__0 ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_STRING) ) {
                int LA7_1 = input.LA(2);

                if ( ((LA7_1>=17 && LA7_1<=21)) ) {
                    alt7=2;
                }
                else if ( (LA7_1==42) ) {
                    alt7=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA7_0==RULE_ID) ) {
                int LA7_2 = input.LA(2);

                if ( ((LA7_2>=17 && LA7_2<=21)) ) {
                    alt7=2;
                }
                else if ( (LA7_2==42) ) {
                    alt7=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalArduinoML.g:556:2: ( ( rule__TransitionState__Group_0_0_2_1_0__0 ) )
                    {
                    // InternalArduinoML.g:556:2: ( ( rule__TransitionState__Group_0_0_2_1_0__0 ) )
                    // InternalArduinoML.g:557:3: ( rule__TransitionState__Group_0_0_2_1_0__0 )
                    {
                     before(grammarAccess.getTransitionStateAccess().getGroup_0_0_2_1_0()); 
                    // InternalArduinoML.g:558:3: ( rule__TransitionState__Group_0_0_2_1_0__0 )
                    // InternalArduinoML.g:558:4: rule__TransitionState__Group_0_0_2_1_0__0
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
                    // InternalArduinoML.g:562:2: ( ( rule__TransitionState__Group_0_0_2_1_1__0 ) )
                    {
                    // InternalArduinoML.g:562:2: ( ( rule__TransitionState__Group_0_0_2_1_1__0 ) )
                    // InternalArduinoML.g:563:3: ( rule__TransitionState__Group_0_0_2_1_1__0 )
                    {
                     before(grammarAccess.getTransitionStateAccess().getGroup_0_0_2_1_1()); 
                    // InternalArduinoML.g:564:3: ( rule__TransitionState__Group_0_0_2_1_1__0 )
                    // InternalArduinoML.g:564:4: rule__TransitionState__Group_0_0_2_1_1__0
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
    // InternalArduinoML.g:572:1: rule__TransitionMode__Alternatives_0 : ( ( ( rule__TransitionMode__Group_0_0__0 ) ) | ( ( rule__TransitionMode__Group_0_1__0 ) ) );
    public final void rule__TransitionMode__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:576:1: ( ( ( rule__TransitionMode__Group_0_0__0 ) ) | ( ( rule__TransitionMode__Group_0_1__0 ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==41) ) {
                alt8=1;
            }
            else if ( (LA8_0==44) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalArduinoML.g:577:2: ( ( rule__TransitionMode__Group_0_0__0 ) )
                    {
                    // InternalArduinoML.g:577:2: ( ( rule__TransitionMode__Group_0_0__0 ) )
                    // InternalArduinoML.g:578:3: ( rule__TransitionMode__Group_0_0__0 )
                    {
                     before(grammarAccess.getTransitionModeAccess().getGroup_0_0()); 
                    // InternalArduinoML.g:579:3: ( rule__TransitionMode__Group_0_0__0 )
                    // InternalArduinoML.g:579:4: rule__TransitionMode__Group_0_0__0
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
                    // InternalArduinoML.g:583:2: ( ( rule__TransitionMode__Group_0_1__0 ) )
                    {
                    // InternalArduinoML.g:583:2: ( ( rule__TransitionMode__Group_0_1__0 ) )
                    // InternalArduinoML.g:584:3: ( rule__TransitionMode__Group_0_1__0 )
                    {
                     before(grammarAccess.getTransitionModeAccess().getGroup_0_1()); 
                    // InternalArduinoML.g:585:3: ( rule__TransitionMode__Group_0_1__0 )
                    // InternalArduinoML.g:585:4: rule__TransitionMode__Group_0_1__0
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
    // InternalArduinoML.g:593:1: rule__TransitionMode__Alternatives_0_0_1 : ( ( ( rule__TransitionMode__Group_0_0_1_0__0 ) ) | ( ( rule__TransitionMode__Group_0_0_1_1__0 ) ) );
    public final void rule__TransitionMode__Alternatives_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:597:1: ( ( ( rule__TransitionMode__Group_0_0_1_0__0 ) ) | ( ( rule__TransitionMode__Group_0_0_1_1__0 ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_STRING) ) {
                int LA9_1 = input.LA(2);

                if ( ((LA9_1>=17 && LA9_1<=21)) ) {
                    alt9=2;
                }
                else if ( (LA9_1==42) ) {
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

                if ( ((LA9_2>=17 && LA9_2<=21)) ) {
                    alt9=2;
                }
                else if ( (LA9_2==42) ) {
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
                    // InternalArduinoML.g:598:2: ( ( rule__TransitionMode__Group_0_0_1_0__0 ) )
                    {
                    // InternalArduinoML.g:598:2: ( ( rule__TransitionMode__Group_0_0_1_0__0 ) )
                    // InternalArduinoML.g:599:3: ( rule__TransitionMode__Group_0_0_1_0__0 )
                    {
                     before(grammarAccess.getTransitionModeAccess().getGroup_0_0_1_0()); 
                    // InternalArduinoML.g:600:3: ( rule__TransitionMode__Group_0_0_1_0__0 )
                    // InternalArduinoML.g:600:4: rule__TransitionMode__Group_0_0_1_0__0
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
                    // InternalArduinoML.g:604:2: ( ( rule__TransitionMode__Group_0_0_1_1__0 ) )
                    {
                    // InternalArduinoML.g:604:2: ( ( rule__TransitionMode__Group_0_0_1_1__0 ) )
                    // InternalArduinoML.g:605:3: ( rule__TransitionMode__Group_0_0_1_1__0 )
                    {
                     before(grammarAccess.getTransitionModeAccess().getGroup_0_0_1_1()); 
                    // InternalArduinoML.g:606:3: ( rule__TransitionMode__Group_0_0_1_1__0 )
                    // InternalArduinoML.g:606:4: rule__TransitionMode__Group_0_0_1_1__0
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
    // InternalArduinoML.g:614:1: rule__TransitionMode__Alternatives_0_0_2_1 : ( ( ( rule__TransitionMode__Group_0_0_2_1_0__0 ) ) | ( ( rule__TransitionMode__Group_0_0_2_1_1__0 ) ) );
    public final void rule__TransitionMode__Alternatives_0_0_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:618:1: ( ( ( rule__TransitionMode__Group_0_0_2_1_0__0 ) ) | ( ( rule__TransitionMode__Group_0_0_2_1_1__0 ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_STRING) ) {
                int LA10_1 = input.LA(2);

                if ( (LA10_1==42) ) {
                    alt10=1;
                }
                else if ( ((LA10_1>=17 && LA10_1<=21)) ) {
                    alt10=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA10_0==RULE_ID) ) {
                int LA10_2 = input.LA(2);

                if ( ((LA10_2>=17 && LA10_2<=21)) ) {
                    alt10=2;
                }
                else if ( (LA10_2==42) ) {
                    alt10=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalArduinoML.g:619:2: ( ( rule__TransitionMode__Group_0_0_2_1_0__0 ) )
                    {
                    // InternalArduinoML.g:619:2: ( ( rule__TransitionMode__Group_0_0_2_1_0__0 ) )
                    // InternalArduinoML.g:620:3: ( rule__TransitionMode__Group_0_0_2_1_0__0 )
                    {
                     before(grammarAccess.getTransitionModeAccess().getGroup_0_0_2_1_0()); 
                    // InternalArduinoML.g:621:3: ( rule__TransitionMode__Group_0_0_2_1_0__0 )
                    // InternalArduinoML.g:621:4: rule__TransitionMode__Group_0_0_2_1_0__0
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
                    // InternalArduinoML.g:625:2: ( ( rule__TransitionMode__Group_0_0_2_1_1__0 ) )
                    {
                    // InternalArduinoML.g:625:2: ( ( rule__TransitionMode__Group_0_0_2_1_1__0 ) )
                    // InternalArduinoML.g:626:3: ( rule__TransitionMode__Group_0_0_2_1_1__0 )
                    {
                     before(grammarAccess.getTransitionModeAccess().getGroup_0_0_2_1_1()); 
                    // InternalArduinoML.g:627:3: ( rule__TransitionMode__Group_0_0_2_1_1__0 )
                    // InternalArduinoML.g:627:4: rule__TransitionMode__Group_0_0_2_1_1__0
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
    // InternalArduinoML.g:635:1: rule__Signal__Alternatives : ( ( ( 'HIGH' ) ) | ( ( 'LOW' ) ) );
    public final void rule__Signal__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:639:1: ( ( ( 'HIGH' ) ) | ( ( 'LOW' ) ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==12) ) {
                alt11=1;
            }
            else if ( (LA11_0==13) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalArduinoML.g:640:2: ( ( 'HIGH' ) )
                    {
                    // InternalArduinoML.g:640:2: ( ( 'HIGH' ) )
                    // InternalArduinoML.g:641:3: ( 'HIGH' )
                    {
                     before(grammarAccess.getSignalAccess().getHIGHEnumLiteralDeclaration_0()); 
                    // InternalArduinoML.g:642:3: ( 'HIGH' )
                    // InternalArduinoML.g:642:4: 'HIGH'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getSignalAccess().getHIGHEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalArduinoML.g:646:2: ( ( 'LOW' ) )
                    {
                    // InternalArduinoML.g:646:2: ( ( 'LOW' ) )
                    // InternalArduinoML.g:647:3: ( 'LOW' )
                    {
                     before(grammarAccess.getSignalAccess().getLOWEnumLiteralDeclaration_1()); 
                    // InternalArduinoML.g:648:3: ( 'LOW' )
                    // InternalArduinoML.g:648:4: 'LOW'
                    {
                    match(input,13,FOLLOW_2); 

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
    // InternalArduinoML.g:656:1: rule__Time_unit__Alternatives : ( ( ( 'ms' ) ) | ( ( 's' ) ) | ( ( 'min' ) ) );
    public final void rule__Time_unit__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:660:1: ( ( ( 'ms' ) ) | ( ( 's' ) ) | ( ( 'min' ) ) )
            int alt12=3;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt12=1;
                }
                break;
            case 15:
                {
                alt12=2;
                }
                break;
            case 16:
                {
                alt12=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalArduinoML.g:661:2: ( ( 'ms' ) )
                    {
                    // InternalArduinoML.g:661:2: ( ( 'ms' ) )
                    // InternalArduinoML.g:662:3: ( 'ms' )
                    {
                     before(grammarAccess.getTime_unitAccess().getMsEnumLiteralDeclaration_0()); 
                    // InternalArduinoML.g:663:3: ( 'ms' )
                    // InternalArduinoML.g:663:4: 'ms'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getTime_unitAccess().getMsEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalArduinoML.g:667:2: ( ( 's' ) )
                    {
                    // InternalArduinoML.g:667:2: ( ( 's' ) )
                    // InternalArduinoML.g:668:3: ( 's' )
                    {
                     before(grammarAccess.getTime_unitAccess().getSEnumLiteralDeclaration_1()); 
                    // InternalArduinoML.g:669:3: ( 's' )
                    // InternalArduinoML.g:669:4: 's'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getTime_unitAccess().getSEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalArduinoML.g:673:2: ( ( 'min' ) )
                    {
                    // InternalArduinoML.g:673:2: ( ( 'min' ) )
                    // InternalArduinoML.g:674:3: ( 'min' )
                    {
                     before(grammarAccess.getTime_unitAccess().getMinEnumLiteralDeclaration_2()); 
                    // InternalArduinoML.g:675:3: ( 'min' )
                    // InternalArduinoML.g:675:4: 'min'
                    {
                    match(input,16,FOLLOW_2); 

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
    // InternalArduinoML.g:683:1: rule__Compare__Alternatives : ( ( ( 'inf' ) ) | ( ( 'einf' ) ) | ( ( 'equal' ) ) | ( ( 'esup' ) ) | ( ( 'sup' ) ) );
    public final void rule__Compare__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:687:1: ( ( ( 'inf' ) ) | ( ( 'einf' ) ) | ( ( 'equal' ) ) | ( ( 'esup' ) ) | ( ( 'sup' ) ) )
            int alt13=5;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt13=1;
                }
                break;
            case 18:
                {
                alt13=2;
                }
                break;
            case 19:
                {
                alt13=3;
                }
                break;
            case 20:
                {
                alt13=4;
                }
                break;
            case 21:
                {
                alt13=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalArduinoML.g:688:2: ( ( 'inf' ) )
                    {
                    // InternalArduinoML.g:688:2: ( ( 'inf' ) )
                    // InternalArduinoML.g:689:3: ( 'inf' )
                    {
                     before(grammarAccess.getCompareAccess().getInfEnumLiteralDeclaration_0()); 
                    // InternalArduinoML.g:690:3: ( 'inf' )
                    // InternalArduinoML.g:690:4: 'inf'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getCompareAccess().getInfEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalArduinoML.g:694:2: ( ( 'einf' ) )
                    {
                    // InternalArduinoML.g:694:2: ( ( 'einf' ) )
                    // InternalArduinoML.g:695:3: ( 'einf' )
                    {
                     before(grammarAccess.getCompareAccess().getEinfEnumLiteralDeclaration_1()); 
                    // InternalArduinoML.g:696:3: ( 'einf' )
                    // InternalArduinoML.g:696:4: 'einf'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getCompareAccess().getEinfEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalArduinoML.g:700:2: ( ( 'equal' ) )
                    {
                    // InternalArduinoML.g:700:2: ( ( 'equal' ) )
                    // InternalArduinoML.g:701:3: ( 'equal' )
                    {
                     before(grammarAccess.getCompareAccess().getEqualEnumLiteralDeclaration_2()); 
                    // InternalArduinoML.g:702:3: ( 'equal' )
                    // InternalArduinoML.g:702:4: 'equal'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getCompareAccess().getEqualEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalArduinoML.g:706:2: ( ( 'esup' ) )
                    {
                    // InternalArduinoML.g:706:2: ( ( 'esup' ) )
                    // InternalArduinoML.g:707:3: ( 'esup' )
                    {
                     before(grammarAccess.getCompareAccess().getEsupEnumLiteralDeclaration_3()); 
                    // InternalArduinoML.g:708:3: ( 'esup' )
                    // InternalArduinoML.g:708:4: 'esup'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getCompareAccess().getEsupEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalArduinoML.g:712:2: ( ( 'sup' ) )
                    {
                    // InternalArduinoML.g:712:2: ( ( 'sup' ) )
                    // InternalArduinoML.g:713:3: ( 'sup' )
                    {
                     before(grammarAccess.getCompareAccess().getSupEnumLiteralDeclaration_4()); 
                    // InternalArduinoML.g:714:3: ( 'sup' )
                    // InternalArduinoML.g:714:4: 'sup'
                    {
                    match(input,21,FOLLOW_2); 

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


    // $ANTLR start "rule__App__Group__0"
    // InternalArduinoML.g:722:1: rule__App__Group__0 : rule__App__Group__0__Impl rule__App__Group__1 ;
    public final void rule__App__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:726:1: ( rule__App__Group__0__Impl rule__App__Group__1 )
            // InternalArduinoML.g:727:2: rule__App__Group__0__Impl rule__App__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__App__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__App__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__App__Group__0"


    // $ANTLR start "rule__App__Group__0__Impl"
    // InternalArduinoML.g:734:1: rule__App__Group__0__Impl : ( ( rule__App__Group_0__0 )? ) ;
    public final void rule__App__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:738:1: ( ( ( rule__App__Group_0__0 )? ) )
            // InternalArduinoML.g:739:1: ( ( rule__App__Group_0__0 )? )
            {
            // InternalArduinoML.g:739:1: ( ( rule__App__Group_0__0 )? )
            // InternalArduinoML.g:740:2: ( rule__App__Group_0__0 )?
            {
             before(grammarAccess.getAppAccess().getGroup_0()); 
            // InternalArduinoML.g:741:2: ( rule__App__Group_0__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==22) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalArduinoML.g:741:3: rule__App__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__App__Group_0__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAppAccess().getGroup_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__App__Group__0__Impl"


    // $ANTLR start "rule__App__Group__1"
    // InternalArduinoML.g:749:1: rule__App__Group__1 : rule__App__Group__1__Impl ;
    public final void rule__App__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:753:1: ( rule__App__Group__1__Impl )
            // InternalArduinoML.g:754:2: rule__App__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__App__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__App__Group__1"


    // $ANTLR start "rule__App__Group__1__Impl"
    // InternalArduinoML.g:760:1: rule__App__Group__1__Impl : ( ( rule__App__Alternatives_1 ) ) ;
    public final void rule__App__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:764:1: ( ( ( rule__App__Alternatives_1 ) ) )
            // InternalArduinoML.g:765:1: ( ( rule__App__Alternatives_1 ) )
            {
            // InternalArduinoML.g:765:1: ( ( rule__App__Alternatives_1 ) )
            // InternalArduinoML.g:766:2: ( rule__App__Alternatives_1 )
            {
             before(grammarAccess.getAppAccess().getAlternatives_1()); 
            // InternalArduinoML.g:767:2: ( rule__App__Alternatives_1 )
            // InternalArduinoML.g:767:3: rule__App__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__App__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getAppAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__App__Group__1__Impl"


    // $ANTLR start "rule__App__Group_0__0"
    // InternalArduinoML.g:776:1: rule__App__Group_0__0 : rule__App__Group_0__0__Impl rule__App__Group_0__1 ;
    public final void rule__App__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:780:1: ( rule__App__Group_0__0__Impl rule__App__Group_0__1 )
            // InternalArduinoML.g:781:2: rule__App__Group_0__0__Impl rule__App__Group_0__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalArduinoML.g:788:1: rule__App__Group_0__0__Impl : ( 'enable' ) ;
    public final void rule__App__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:792:1: ( ( 'enable' ) )
            // InternalArduinoML.g:793:1: ( 'enable' )
            {
            // InternalArduinoML.g:793:1: ( 'enable' )
            // InternalArduinoML.g:794:2: 'enable'
            {
             before(grammarAccess.getAppAccess().getEnableKeyword_0_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getAppAccess().getEnableKeyword_0_0()); 

            }


            }

        }
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
    // InternalArduinoML.g:803:1: rule__App__Group_0__1 : rule__App__Group_0__1__Impl rule__App__Group_0__2 ;
    public final void rule__App__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:807:1: ( rule__App__Group_0__1__Impl rule__App__Group_0__2 )
            // InternalArduinoML.g:808:2: rule__App__Group_0__1__Impl rule__App__Group_0__2
            {
            pushFollow(FOLLOW_5);
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
    // InternalArduinoML.g:815:1: rule__App__Group_0__1__Impl : ( 'monitoring' ) ;
    public final void rule__App__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:819:1: ( ( 'monitoring' ) )
            // InternalArduinoML.g:820:1: ( 'monitoring' )
            {
            // InternalArduinoML.g:820:1: ( 'monitoring' )
            // InternalArduinoML.g:821:2: 'monitoring'
            {
             before(grammarAccess.getAppAccess().getMonitoringKeyword_0_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getAppAccess().getMonitoringKeyword_0_1()); 

            }


            }

        }
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
    // InternalArduinoML.g:830:1: rule__App__Group_0__2 : rule__App__Group_0__2__Impl ;
    public final void rule__App__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:834:1: ( rule__App__Group_0__2__Impl )
            // InternalArduinoML.g:835:2: rule__App__Group_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__App__Group_0__2__Impl();

            state._fsp--;


            }

        }
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
    // InternalArduinoML.g:841:1: rule__App__Group_0__2__Impl : ( ( rule__App__MonitoringAssignment_0_2 ) ) ;
    public final void rule__App__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:845:1: ( ( ( rule__App__MonitoringAssignment_0_2 ) ) )
            // InternalArduinoML.g:846:1: ( ( rule__App__MonitoringAssignment_0_2 ) )
            {
            // InternalArduinoML.g:846:1: ( ( rule__App__MonitoringAssignment_0_2 ) )
            // InternalArduinoML.g:847:2: ( rule__App__MonitoringAssignment_0_2 )
            {
             before(grammarAccess.getAppAccess().getMonitoringAssignment_0_2()); 
            // InternalArduinoML.g:848:2: ( rule__App__MonitoringAssignment_0_2 )
            // InternalArduinoML.g:848:3: rule__App__MonitoringAssignment_0_2
            {
            pushFollow(FOLLOW_2);
            rule__App__MonitoringAssignment_0_2();

            state._fsp--;


            }

             after(grammarAccess.getAppAccess().getMonitoringAssignment_0_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__App__Group_1_0__0"
    // InternalArduinoML.g:857:1: rule__App__Group_1_0__0 : rule__App__Group_1_0__0__Impl rule__App__Group_1_0__1 ;
    public final void rule__App__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:861:1: ( rule__App__Group_1_0__0__Impl rule__App__Group_1_0__1 )
            // InternalArduinoML.g:862:2: rule__App__Group_1_0__0__Impl rule__App__Group_1_0__1
            {
            pushFollow(FOLLOW_6);
            rule__App__Group_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__App__Group_1_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__App__Group_1_0__0"


    // $ANTLR start "rule__App__Group_1_0__0__Impl"
    // InternalArduinoML.g:869:1: rule__App__Group_1_0__0__Impl : ( 'app' ) ;
    public final void rule__App__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:873:1: ( ( 'app' ) )
            // InternalArduinoML.g:874:1: ( 'app' )
            {
            // InternalArduinoML.g:874:1: ( 'app' )
            // InternalArduinoML.g:875:2: 'app'
            {
             before(grammarAccess.getAppAccess().getAppKeyword_1_0_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getAppAccess().getAppKeyword_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__App__Group_1_0__0__Impl"


    // $ANTLR start "rule__App__Group_1_0__1"
    // InternalArduinoML.g:884:1: rule__App__Group_1_0__1 : rule__App__Group_1_0__1__Impl rule__App__Group_1_0__2 ;
    public final void rule__App__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:888:1: ( rule__App__Group_1_0__1__Impl rule__App__Group_1_0__2 )
            // InternalArduinoML.g:889:2: rule__App__Group_1_0__1__Impl rule__App__Group_1_0__2
            {
            pushFollow(FOLLOW_7);
            rule__App__Group_1_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__App__Group_1_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__App__Group_1_0__1"


    // $ANTLR start "rule__App__Group_1_0__1__Impl"
    // InternalArduinoML.g:896:1: rule__App__Group_1_0__1__Impl : ( ( rule__App__NameAssignment_1_0_1 ) ) ;
    public final void rule__App__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:900:1: ( ( ( rule__App__NameAssignment_1_0_1 ) ) )
            // InternalArduinoML.g:901:1: ( ( rule__App__NameAssignment_1_0_1 ) )
            {
            // InternalArduinoML.g:901:1: ( ( rule__App__NameAssignment_1_0_1 ) )
            // InternalArduinoML.g:902:2: ( rule__App__NameAssignment_1_0_1 )
            {
             before(grammarAccess.getAppAccess().getNameAssignment_1_0_1()); 
            // InternalArduinoML.g:903:2: ( rule__App__NameAssignment_1_0_1 )
            // InternalArduinoML.g:903:3: rule__App__NameAssignment_1_0_1
            {
            pushFollow(FOLLOW_2);
            rule__App__NameAssignment_1_0_1();

            state._fsp--;


            }

             after(grammarAccess.getAppAccess().getNameAssignment_1_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__App__Group_1_0__1__Impl"


    // $ANTLR start "rule__App__Group_1_0__2"
    // InternalArduinoML.g:911:1: rule__App__Group_1_0__2 : rule__App__Group_1_0__2__Impl rule__App__Group_1_0__3 ;
    public final void rule__App__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:915:1: ( rule__App__Group_1_0__2__Impl rule__App__Group_1_0__3 )
            // InternalArduinoML.g:916:2: rule__App__Group_1_0__2__Impl rule__App__Group_1_0__3
            {
            pushFollow(FOLLOW_8);
            rule__App__Group_1_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__App__Group_1_0__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__App__Group_1_0__2"


    // $ANTLR start "rule__App__Group_1_0__2__Impl"
    // InternalArduinoML.g:923:1: rule__App__Group_1_0__2__Impl : ( 'initial' ) ;
    public final void rule__App__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:927:1: ( ( 'initial' ) )
            // InternalArduinoML.g:928:1: ( 'initial' )
            {
            // InternalArduinoML.g:928:1: ( 'initial' )
            // InternalArduinoML.g:929:2: 'initial'
            {
             before(grammarAccess.getAppAccess().getInitialKeyword_1_0_2()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getAppAccess().getInitialKeyword_1_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__App__Group_1_0__2__Impl"


    // $ANTLR start "rule__App__Group_1_0__3"
    // InternalArduinoML.g:938:1: rule__App__Group_1_0__3 : rule__App__Group_1_0__3__Impl rule__App__Group_1_0__4 ;
    public final void rule__App__Group_1_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:942:1: ( rule__App__Group_1_0__3__Impl rule__App__Group_1_0__4 )
            // InternalArduinoML.g:943:2: rule__App__Group_1_0__3__Impl rule__App__Group_1_0__4
            {
            pushFollow(FOLLOW_6);
            rule__App__Group_1_0__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__App__Group_1_0__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__App__Group_1_0__3"


    // $ANTLR start "rule__App__Group_1_0__3__Impl"
    // InternalArduinoML.g:950:1: rule__App__Group_1_0__3__Impl : ( 'mode' ) ;
    public final void rule__App__Group_1_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:954:1: ( ( 'mode' ) )
            // InternalArduinoML.g:955:1: ( 'mode' )
            {
            // InternalArduinoML.g:955:1: ( 'mode' )
            // InternalArduinoML.g:956:2: 'mode'
            {
             before(grammarAccess.getAppAccess().getModeKeyword_1_0_3()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getAppAccess().getModeKeyword_1_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__App__Group_1_0__3__Impl"


    // $ANTLR start "rule__App__Group_1_0__4"
    // InternalArduinoML.g:965:1: rule__App__Group_1_0__4 : rule__App__Group_1_0__4__Impl rule__App__Group_1_0__5 ;
    public final void rule__App__Group_1_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:969:1: ( rule__App__Group_1_0__4__Impl rule__App__Group_1_0__5 )
            // InternalArduinoML.g:970:2: rule__App__Group_1_0__4__Impl rule__App__Group_1_0__5
            {
            pushFollow(FOLLOW_9);
            rule__App__Group_1_0__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__App__Group_1_0__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__App__Group_1_0__4"


    // $ANTLR start "rule__App__Group_1_0__4__Impl"
    // InternalArduinoML.g:977:1: rule__App__Group_1_0__4__Impl : ( ( rule__App__Initial_modeAssignment_1_0_4 ) ) ;
    public final void rule__App__Group_1_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:981:1: ( ( ( rule__App__Initial_modeAssignment_1_0_4 ) ) )
            // InternalArduinoML.g:982:1: ( ( rule__App__Initial_modeAssignment_1_0_4 ) )
            {
            // InternalArduinoML.g:982:1: ( ( rule__App__Initial_modeAssignment_1_0_4 ) )
            // InternalArduinoML.g:983:2: ( rule__App__Initial_modeAssignment_1_0_4 )
            {
             before(grammarAccess.getAppAccess().getInitial_modeAssignment_1_0_4()); 
            // InternalArduinoML.g:984:2: ( rule__App__Initial_modeAssignment_1_0_4 )
            // InternalArduinoML.g:984:3: rule__App__Initial_modeAssignment_1_0_4
            {
            pushFollow(FOLLOW_2);
            rule__App__Initial_modeAssignment_1_0_4();

            state._fsp--;


            }

             after(grammarAccess.getAppAccess().getInitial_modeAssignment_1_0_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__App__Group_1_0__4__Impl"


    // $ANTLR start "rule__App__Group_1_0__5"
    // InternalArduinoML.g:992:1: rule__App__Group_1_0__5 : rule__App__Group_1_0__5__Impl rule__App__Group_1_0__6 ;
    public final void rule__App__Group_1_0__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:996:1: ( rule__App__Group_1_0__5__Impl rule__App__Group_1_0__6 )
            // InternalArduinoML.g:997:2: rule__App__Group_1_0__5__Impl rule__App__Group_1_0__6
            {
            pushFollow(FOLLOW_10);
            rule__App__Group_1_0__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__App__Group_1_0__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__App__Group_1_0__5"


    // $ANTLR start "rule__App__Group_1_0__5__Impl"
    // InternalArduinoML.g:1004:1: rule__App__Group_1_0__5__Impl : ( ':' ) ;
    public final void rule__App__Group_1_0__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1008:1: ( ( ':' ) )
            // InternalArduinoML.g:1009:1: ( ':' )
            {
            // InternalArduinoML.g:1009:1: ( ':' )
            // InternalArduinoML.g:1010:2: ':'
            {
             before(grammarAccess.getAppAccess().getColonKeyword_1_0_5()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getAppAccess().getColonKeyword_1_0_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__App__Group_1_0__5__Impl"


    // $ANTLR start "rule__App__Group_1_0__6"
    // InternalArduinoML.g:1019:1: rule__App__Group_1_0__6 : rule__App__Group_1_0__6__Impl rule__App__Group_1_0__7 ;
    public final void rule__App__Group_1_0__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1023:1: ( rule__App__Group_1_0__6__Impl rule__App__Group_1_0__7 )
            // InternalArduinoML.g:1024:2: rule__App__Group_1_0__6__Impl rule__App__Group_1_0__7
            {
            pushFollow(FOLLOW_9);
            rule__App__Group_1_0__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__App__Group_1_0__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__App__Group_1_0__6"


    // $ANTLR start "rule__App__Group_1_0__6__Impl"
    // InternalArduinoML.g:1031:1: rule__App__Group_1_0__6__Impl : ( 'bricks' ) ;
    public final void rule__App__Group_1_0__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1035:1: ( ( 'bricks' ) )
            // InternalArduinoML.g:1036:1: ( 'bricks' )
            {
            // InternalArduinoML.g:1036:1: ( 'bricks' )
            // InternalArduinoML.g:1037:2: 'bricks'
            {
             before(grammarAccess.getAppAccess().getBricksKeyword_1_0_6()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getAppAccess().getBricksKeyword_1_0_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__App__Group_1_0__6__Impl"


    // $ANTLR start "rule__App__Group_1_0__7"
    // InternalArduinoML.g:1046:1: rule__App__Group_1_0__7 : rule__App__Group_1_0__7__Impl rule__App__Group_1_0__8 ;
    public final void rule__App__Group_1_0__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1050:1: ( rule__App__Group_1_0__7__Impl rule__App__Group_1_0__8 )
            // InternalArduinoML.g:1051:2: rule__App__Group_1_0__7__Impl rule__App__Group_1_0__8
            {
            pushFollow(FOLLOW_11);
            rule__App__Group_1_0__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__App__Group_1_0__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__App__Group_1_0__7"


    // $ANTLR start "rule__App__Group_1_0__7__Impl"
    // InternalArduinoML.g:1058:1: rule__App__Group_1_0__7__Impl : ( ':' ) ;
    public final void rule__App__Group_1_0__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1062:1: ( ( ':' ) )
            // InternalArduinoML.g:1063:1: ( ':' )
            {
            // InternalArduinoML.g:1063:1: ( ':' )
            // InternalArduinoML.g:1064:2: ':'
            {
             before(grammarAccess.getAppAccess().getColonKeyword_1_0_7()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getAppAccess().getColonKeyword_1_0_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__App__Group_1_0__7__Impl"


    // $ANTLR start "rule__App__Group_1_0__8"
    // InternalArduinoML.g:1073:1: rule__App__Group_1_0__8 : rule__App__Group_1_0__8__Impl rule__App__Group_1_0__9 ;
    public final void rule__App__Group_1_0__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1077:1: ( rule__App__Group_1_0__8__Impl rule__App__Group_1_0__9 )
            // InternalArduinoML.g:1078:2: rule__App__Group_1_0__8__Impl rule__App__Group_1_0__9
            {
            pushFollow(FOLLOW_12);
            rule__App__Group_1_0__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__App__Group_1_0__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__App__Group_1_0__8"


    // $ANTLR start "rule__App__Group_1_0__8__Impl"
    // InternalArduinoML.g:1085:1: rule__App__Group_1_0__8__Impl : ( ( rule__App__BricksAssignment_1_0_8 ) ) ;
    public final void rule__App__Group_1_0__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1089:1: ( ( ( rule__App__BricksAssignment_1_0_8 ) ) )
            // InternalArduinoML.g:1090:1: ( ( rule__App__BricksAssignment_1_0_8 ) )
            {
            // InternalArduinoML.g:1090:1: ( ( rule__App__BricksAssignment_1_0_8 ) )
            // InternalArduinoML.g:1091:2: ( rule__App__BricksAssignment_1_0_8 )
            {
             before(grammarAccess.getAppAccess().getBricksAssignment_1_0_8()); 
            // InternalArduinoML.g:1092:2: ( rule__App__BricksAssignment_1_0_8 )
            // InternalArduinoML.g:1092:3: rule__App__BricksAssignment_1_0_8
            {
            pushFollow(FOLLOW_2);
            rule__App__BricksAssignment_1_0_8();

            state._fsp--;


            }

             after(grammarAccess.getAppAccess().getBricksAssignment_1_0_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__App__Group_1_0__8__Impl"


    // $ANTLR start "rule__App__Group_1_0__9"
    // InternalArduinoML.g:1100:1: rule__App__Group_1_0__9 : rule__App__Group_1_0__9__Impl rule__App__Group_1_0__10 ;
    public final void rule__App__Group_1_0__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1104:1: ( rule__App__Group_1_0__9__Impl rule__App__Group_1_0__10 )
            // InternalArduinoML.g:1105:2: rule__App__Group_1_0__9__Impl rule__App__Group_1_0__10
            {
            pushFollow(FOLLOW_12);
            rule__App__Group_1_0__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__App__Group_1_0__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__App__Group_1_0__9"


    // $ANTLR start "rule__App__Group_1_0__9__Impl"
    // InternalArduinoML.g:1112:1: rule__App__Group_1_0__9__Impl : ( ( rule__App__BricksAssignment_1_0_9 )* ) ;
    public final void rule__App__Group_1_0__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1116:1: ( ( ( rule__App__BricksAssignment_1_0_9 )* ) )
            // InternalArduinoML.g:1117:1: ( ( rule__App__BricksAssignment_1_0_9 )* )
            {
            // InternalArduinoML.g:1117:1: ( ( rule__App__BricksAssignment_1_0_9 )* )
            // InternalArduinoML.g:1118:2: ( rule__App__BricksAssignment_1_0_9 )*
            {
             before(grammarAccess.getAppAccess().getBricksAssignment_1_0_9()); 
            // InternalArduinoML.g:1119:2: ( rule__App__BricksAssignment_1_0_9 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=35 && LA15_0<=37)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalArduinoML.g:1119:3: rule__App__BricksAssignment_1_0_9
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__App__BricksAssignment_1_0_9();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getAppAccess().getBricksAssignment_1_0_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__App__Group_1_0__9__Impl"


    // $ANTLR start "rule__App__Group_1_0__10"
    // InternalArduinoML.g:1127:1: rule__App__Group_1_0__10 : rule__App__Group_1_0__10__Impl rule__App__Group_1_0__11 ;
    public final void rule__App__Group_1_0__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1131:1: ( rule__App__Group_1_0__10__Impl rule__App__Group_1_0__11 )
            // InternalArduinoML.g:1132:2: rule__App__Group_1_0__10__Impl rule__App__Group_1_0__11
            {
            pushFollow(FOLLOW_9);
            rule__App__Group_1_0__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__App__Group_1_0__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__App__Group_1_0__10"


    // $ANTLR start "rule__App__Group_1_0__10__Impl"
    // InternalArduinoML.g:1139:1: rule__App__Group_1_0__10__Impl : ( 'modes' ) ;
    public final void rule__App__Group_1_0__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1143:1: ( ( 'modes' ) )
            // InternalArduinoML.g:1144:1: ( 'modes' )
            {
            // InternalArduinoML.g:1144:1: ( 'modes' )
            // InternalArduinoML.g:1145:2: 'modes'
            {
             before(grammarAccess.getAppAccess().getModesKeyword_1_0_10()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getAppAccess().getModesKeyword_1_0_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__App__Group_1_0__10__Impl"


    // $ANTLR start "rule__App__Group_1_0__11"
    // InternalArduinoML.g:1154:1: rule__App__Group_1_0__11 : rule__App__Group_1_0__11__Impl rule__App__Group_1_0__12 ;
    public final void rule__App__Group_1_0__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1158:1: ( rule__App__Group_1_0__11__Impl rule__App__Group_1_0__12 )
            // InternalArduinoML.g:1159:2: rule__App__Group_1_0__11__Impl rule__App__Group_1_0__12
            {
            pushFollow(FOLLOW_6);
            rule__App__Group_1_0__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__App__Group_1_0__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__App__Group_1_0__11"


    // $ANTLR start "rule__App__Group_1_0__11__Impl"
    // InternalArduinoML.g:1166:1: rule__App__Group_1_0__11__Impl : ( ':' ) ;
    public final void rule__App__Group_1_0__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1170:1: ( ( ':' ) )
            // InternalArduinoML.g:1171:1: ( ':' )
            {
            // InternalArduinoML.g:1171:1: ( ':' )
            // InternalArduinoML.g:1172:2: ':'
            {
             before(grammarAccess.getAppAccess().getColonKeyword_1_0_11()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getAppAccess().getColonKeyword_1_0_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__App__Group_1_0__11__Impl"


    // $ANTLR start "rule__App__Group_1_0__12"
    // InternalArduinoML.g:1181:1: rule__App__Group_1_0__12 : rule__App__Group_1_0__12__Impl rule__App__Group_1_0__13 ;
    public final void rule__App__Group_1_0__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1185:1: ( rule__App__Group_1_0__12__Impl rule__App__Group_1_0__13 )
            // InternalArduinoML.g:1186:2: rule__App__Group_1_0__12__Impl rule__App__Group_1_0__13
            {
            pushFollow(FOLLOW_6);
            rule__App__Group_1_0__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__App__Group_1_0__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__App__Group_1_0__12"


    // $ANTLR start "rule__App__Group_1_0__12__Impl"
    // InternalArduinoML.g:1193:1: rule__App__Group_1_0__12__Impl : ( ( rule__App__ModesAssignment_1_0_12 ) ) ;
    public final void rule__App__Group_1_0__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1197:1: ( ( ( rule__App__ModesAssignment_1_0_12 ) ) )
            // InternalArduinoML.g:1198:1: ( ( rule__App__ModesAssignment_1_0_12 ) )
            {
            // InternalArduinoML.g:1198:1: ( ( rule__App__ModesAssignment_1_0_12 ) )
            // InternalArduinoML.g:1199:2: ( rule__App__ModesAssignment_1_0_12 )
            {
             before(grammarAccess.getAppAccess().getModesAssignment_1_0_12()); 
            // InternalArduinoML.g:1200:2: ( rule__App__ModesAssignment_1_0_12 )
            // InternalArduinoML.g:1200:3: rule__App__ModesAssignment_1_0_12
            {
            pushFollow(FOLLOW_2);
            rule__App__ModesAssignment_1_0_12();

            state._fsp--;


            }

             after(grammarAccess.getAppAccess().getModesAssignment_1_0_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__App__Group_1_0__12__Impl"


    // $ANTLR start "rule__App__Group_1_0__13"
    // InternalArduinoML.g:1208:1: rule__App__Group_1_0__13 : rule__App__Group_1_0__13__Impl ;
    public final void rule__App__Group_1_0__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1212:1: ( rule__App__Group_1_0__13__Impl )
            // InternalArduinoML.g:1213:2: rule__App__Group_1_0__13__Impl
            {
            pushFollow(FOLLOW_2);
            rule__App__Group_1_0__13__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__App__Group_1_0__13"


    // $ANTLR start "rule__App__Group_1_0__13__Impl"
    // InternalArduinoML.g:1219:1: rule__App__Group_1_0__13__Impl : ( ( rule__App__ModesAssignment_1_0_13 )* ) ;
    public final void rule__App__Group_1_0__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1223:1: ( ( ( rule__App__ModesAssignment_1_0_13 )* ) )
            // InternalArduinoML.g:1224:1: ( ( rule__App__ModesAssignment_1_0_13 )* )
            {
            // InternalArduinoML.g:1224:1: ( ( rule__App__ModesAssignment_1_0_13 )* )
            // InternalArduinoML.g:1225:2: ( rule__App__ModesAssignment_1_0_13 )*
            {
             before(grammarAccess.getAppAccess().getModesAssignment_1_0_13()); 
            // InternalArduinoML.g:1226:2: ( rule__App__ModesAssignment_1_0_13 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=RULE_STRING && LA16_0<=RULE_ID)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalArduinoML.g:1226:3: rule__App__ModesAssignment_1_0_13
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__App__ModesAssignment_1_0_13();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getAppAccess().getModesAssignment_1_0_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__App__Group_1_0__13__Impl"


    // $ANTLR start "rule__App__Group_1_1__0"
    // InternalArduinoML.g:1235:1: rule__App__Group_1_1__0 : rule__App__Group_1_1__0__Impl rule__App__Group_1_1__1 ;
    public final void rule__App__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1239:1: ( rule__App__Group_1_1__0__Impl rule__App__Group_1_1__1 )
            // InternalArduinoML.g:1240:2: rule__App__Group_1_1__0__Impl rule__App__Group_1_1__1
            {
            pushFollow(FOLLOW_6);
            rule__App__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__App__Group_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__App__Group_1_1__0"


    // $ANTLR start "rule__App__Group_1_1__0__Impl"
    // InternalArduinoML.g:1247:1: rule__App__Group_1_1__0__Impl : ( 'app' ) ;
    public final void rule__App__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1251:1: ( ( 'app' ) )
            // InternalArduinoML.g:1252:1: ( 'app' )
            {
            // InternalArduinoML.g:1252:1: ( 'app' )
            // InternalArduinoML.g:1253:2: 'app'
            {
             before(grammarAccess.getAppAccess().getAppKeyword_1_1_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getAppAccess().getAppKeyword_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__App__Group_1_1__0__Impl"


    // $ANTLR start "rule__App__Group_1_1__1"
    // InternalArduinoML.g:1262:1: rule__App__Group_1_1__1 : rule__App__Group_1_1__1__Impl ;
    public final void rule__App__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1266:1: ( rule__App__Group_1_1__1__Impl )
            // InternalArduinoML.g:1267:2: rule__App__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__App__Group_1_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__App__Group_1_1__1"


    // $ANTLR start "rule__App__Group_1_1__1__Impl"
    // InternalArduinoML.g:1273:1: rule__App__Group_1_1__1__Impl : ( ( rule__App__ModesAssignment_1_1_1 ) ) ;
    public final void rule__App__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1277:1: ( ( ( rule__App__ModesAssignment_1_1_1 ) ) )
            // InternalArduinoML.g:1278:1: ( ( rule__App__ModesAssignment_1_1_1 ) )
            {
            // InternalArduinoML.g:1278:1: ( ( rule__App__ModesAssignment_1_1_1 ) )
            // InternalArduinoML.g:1279:2: ( rule__App__ModesAssignment_1_1_1 )
            {
             before(grammarAccess.getAppAccess().getModesAssignment_1_1_1()); 
            // InternalArduinoML.g:1280:2: ( rule__App__ModesAssignment_1_1_1 )
            // InternalArduinoML.g:1280:3: rule__App__ModesAssignment_1_1_1
            {
            pushFollow(FOLLOW_2);
            rule__App__ModesAssignment_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getAppAccess().getModesAssignment_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__App__Group_1_1__1__Impl"


    // $ANTLR start "rule__Brick__Group_0__0"
    // InternalArduinoML.g:1289:1: rule__Brick__Group_0__0 : rule__Brick__Group_0__0__Impl rule__Brick__Group_0__1 ;
    public final void rule__Brick__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1293:1: ( rule__Brick__Group_0__0__Impl rule__Brick__Group_0__1 )
            // InternalArduinoML.g:1294:2: rule__Brick__Group_0__0__Impl rule__Brick__Group_0__1
            {
            pushFollow(FOLLOW_6);
            rule__Brick__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Brick__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Brick__Group_0__0"


    // $ANTLR start "rule__Brick__Group_0__0__Impl"
    // InternalArduinoML.g:1301:1: rule__Brick__Group_0__0__Impl : ( ( rule__Brick__Alternatives_0_0 ) ) ;
    public final void rule__Brick__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1305:1: ( ( ( rule__Brick__Alternatives_0_0 ) ) )
            // InternalArduinoML.g:1306:1: ( ( rule__Brick__Alternatives_0_0 ) )
            {
            // InternalArduinoML.g:1306:1: ( ( rule__Brick__Alternatives_0_0 ) )
            // InternalArduinoML.g:1307:2: ( rule__Brick__Alternatives_0_0 )
            {
             before(grammarAccess.getBrickAccess().getAlternatives_0_0()); 
            // InternalArduinoML.g:1308:2: ( rule__Brick__Alternatives_0_0 )
            // InternalArduinoML.g:1308:3: rule__Brick__Alternatives_0_0
            {
            pushFollow(FOLLOW_2);
            rule__Brick__Alternatives_0_0();

            state._fsp--;


            }

             after(grammarAccess.getBrickAccess().getAlternatives_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Brick__Group_0__0__Impl"


    // $ANTLR start "rule__Brick__Group_0__1"
    // InternalArduinoML.g:1316:1: rule__Brick__Group_0__1 : rule__Brick__Group_0__1__Impl rule__Brick__Group_0__2 ;
    public final void rule__Brick__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1320:1: ( rule__Brick__Group_0__1__Impl rule__Brick__Group_0__2 )
            // InternalArduinoML.g:1321:2: rule__Brick__Group_0__1__Impl rule__Brick__Group_0__2
            {
            pushFollow(FOLLOW_9);
            rule__Brick__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Brick__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Brick__Group_0__1"


    // $ANTLR start "rule__Brick__Group_0__1__Impl"
    // InternalArduinoML.g:1328:1: rule__Brick__Group_0__1__Impl : ( ( rule__Brick__NameAssignment_0_1 ) ) ;
    public final void rule__Brick__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1332:1: ( ( ( rule__Brick__NameAssignment_0_1 ) ) )
            // InternalArduinoML.g:1333:1: ( ( rule__Brick__NameAssignment_0_1 ) )
            {
            // InternalArduinoML.g:1333:1: ( ( rule__Brick__NameAssignment_0_1 ) )
            // InternalArduinoML.g:1334:2: ( rule__Brick__NameAssignment_0_1 )
            {
             before(grammarAccess.getBrickAccess().getNameAssignment_0_1()); 
            // InternalArduinoML.g:1335:2: ( rule__Brick__NameAssignment_0_1 )
            // InternalArduinoML.g:1335:3: rule__Brick__NameAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Brick__NameAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getBrickAccess().getNameAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Brick__Group_0__1__Impl"


    // $ANTLR start "rule__Brick__Group_0__2"
    // InternalArduinoML.g:1343:1: rule__Brick__Group_0__2 : rule__Brick__Group_0__2__Impl rule__Brick__Group_0__3 ;
    public final void rule__Brick__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1347:1: ( rule__Brick__Group_0__2__Impl rule__Brick__Group_0__3 )
            // InternalArduinoML.g:1348:2: rule__Brick__Group_0__2__Impl rule__Brick__Group_0__3
            {
            pushFollow(FOLLOW_15);
            rule__Brick__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Brick__Group_0__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Brick__Group_0__2"


    // $ANTLR start "rule__Brick__Group_0__2__Impl"
    // InternalArduinoML.g:1355:1: rule__Brick__Group_0__2__Impl : ( ':' ) ;
    public final void rule__Brick__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1359:1: ( ( ':' ) )
            // InternalArduinoML.g:1360:1: ( ':' )
            {
            // InternalArduinoML.g:1360:1: ( ':' )
            // InternalArduinoML.g:1361:2: ':'
            {
             before(grammarAccess.getBrickAccess().getColonKeyword_0_2()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getBrickAccess().getColonKeyword_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Brick__Group_0__2__Impl"


    // $ANTLR start "rule__Brick__Group_0__3"
    // InternalArduinoML.g:1370:1: rule__Brick__Group_0__3 : rule__Brick__Group_0__3__Impl ;
    public final void rule__Brick__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1374:1: ( rule__Brick__Group_0__3__Impl )
            // InternalArduinoML.g:1375:2: rule__Brick__Group_0__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Brick__Group_0__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Brick__Group_0__3"


    // $ANTLR start "rule__Brick__Group_0__3__Impl"
    // InternalArduinoML.g:1381:1: rule__Brick__Group_0__3__Impl : ( ( rule__Brick__PinAssignment_0_3 ) ) ;
    public final void rule__Brick__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1385:1: ( ( ( rule__Brick__PinAssignment_0_3 ) ) )
            // InternalArduinoML.g:1386:1: ( ( rule__Brick__PinAssignment_0_3 ) )
            {
            // InternalArduinoML.g:1386:1: ( ( rule__Brick__PinAssignment_0_3 ) )
            // InternalArduinoML.g:1387:2: ( rule__Brick__PinAssignment_0_3 )
            {
             before(grammarAccess.getBrickAccess().getPinAssignment_0_3()); 
            // InternalArduinoML.g:1388:2: ( rule__Brick__PinAssignment_0_3 )
            // InternalArduinoML.g:1388:3: rule__Brick__PinAssignment_0_3
            {
            pushFollow(FOLLOW_2);
            rule__Brick__PinAssignment_0_3();

            state._fsp--;


            }

             after(grammarAccess.getBrickAccess().getPinAssignment_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Brick__Group_0__3__Impl"


    // $ANTLR start "rule__Brick__Group_1__0"
    // InternalArduinoML.g:1397:1: rule__Brick__Group_1__0 : rule__Brick__Group_1__0__Impl rule__Brick__Group_1__1 ;
    public final void rule__Brick__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1401:1: ( rule__Brick__Group_1__0__Impl rule__Brick__Group_1__1 )
            // InternalArduinoML.g:1402:2: rule__Brick__Group_1__0__Impl rule__Brick__Group_1__1
            {
            pushFollow(FOLLOW_6);
            rule__Brick__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Brick__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Brick__Group_1__0"


    // $ANTLR start "rule__Brick__Group_1__0__Impl"
    // InternalArduinoML.g:1409:1: rule__Brick__Group_1__0__Impl : ( ruleAnalog ) ;
    public final void rule__Brick__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1413:1: ( ( ruleAnalog ) )
            // InternalArduinoML.g:1414:1: ( ruleAnalog )
            {
            // InternalArduinoML.g:1414:1: ( ruleAnalog )
            // InternalArduinoML.g:1415:2: ruleAnalog
            {
             before(grammarAccess.getBrickAccess().getAnalogParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAnalog();

            state._fsp--;

             after(grammarAccess.getBrickAccess().getAnalogParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Brick__Group_1__0__Impl"


    // $ANTLR start "rule__Brick__Group_1__1"
    // InternalArduinoML.g:1424:1: rule__Brick__Group_1__1 : rule__Brick__Group_1__1__Impl rule__Brick__Group_1__2 ;
    public final void rule__Brick__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1428:1: ( rule__Brick__Group_1__1__Impl rule__Brick__Group_1__2 )
            // InternalArduinoML.g:1429:2: rule__Brick__Group_1__1__Impl rule__Brick__Group_1__2
            {
            pushFollow(FOLLOW_9);
            rule__Brick__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Brick__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Brick__Group_1__1"


    // $ANTLR start "rule__Brick__Group_1__1__Impl"
    // InternalArduinoML.g:1436:1: rule__Brick__Group_1__1__Impl : ( ( rule__Brick__NameAssignment_1_1 ) ) ;
    public final void rule__Brick__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1440:1: ( ( ( rule__Brick__NameAssignment_1_1 ) ) )
            // InternalArduinoML.g:1441:1: ( ( rule__Brick__NameAssignment_1_1 ) )
            {
            // InternalArduinoML.g:1441:1: ( ( rule__Brick__NameAssignment_1_1 ) )
            // InternalArduinoML.g:1442:2: ( rule__Brick__NameAssignment_1_1 )
            {
             before(grammarAccess.getBrickAccess().getNameAssignment_1_1()); 
            // InternalArduinoML.g:1443:2: ( rule__Brick__NameAssignment_1_1 )
            // InternalArduinoML.g:1443:3: rule__Brick__NameAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Brick__NameAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getBrickAccess().getNameAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Brick__Group_1__1__Impl"


    // $ANTLR start "rule__Brick__Group_1__2"
    // InternalArduinoML.g:1451:1: rule__Brick__Group_1__2 : rule__Brick__Group_1__2__Impl rule__Brick__Group_1__3 ;
    public final void rule__Brick__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1455:1: ( rule__Brick__Group_1__2__Impl rule__Brick__Group_1__3 )
            // InternalArduinoML.g:1456:2: rule__Brick__Group_1__2__Impl rule__Brick__Group_1__3
            {
            pushFollow(FOLLOW_15);
            rule__Brick__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Brick__Group_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Brick__Group_1__2"


    // $ANTLR start "rule__Brick__Group_1__2__Impl"
    // InternalArduinoML.g:1463:1: rule__Brick__Group_1__2__Impl : ( ':' ) ;
    public final void rule__Brick__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1467:1: ( ( ':' ) )
            // InternalArduinoML.g:1468:1: ( ':' )
            {
            // InternalArduinoML.g:1468:1: ( ':' )
            // InternalArduinoML.g:1469:2: ':'
            {
             before(grammarAccess.getBrickAccess().getColonKeyword_1_2()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getBrickAccess().getColonKeyword_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Brick__Group_1__2__Impl"


    // $ANTLR start "rule__Brick__Group_1__3"
    // InternalArduinoML.g:1478:1: rule__Brick__Group_1__3 : rule__Brick__Group_1__3__Impl rule__Brick__Group_1__4 ;
    public final void rule__Brick__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1482:1: ( rule__Brick__Group_1__3__Impl rule__Brick__Group_1__4 )
            // InternalArduinoML.g:1483:2: rule__Brick__Group_1__3__Impl rule__Brick__Group_1__4
            {
            pushFollow(FOLLOW_16);
            rule__Brick__Group_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Brick__Group_1__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Brick__Group_1__3"


    // $ANTLR start "rule__Brick__Group_1__3__Impl"
    // InternalArduinoML.g:1490:1: rule__Brick__Group_1__3__Impl : ( ( rule__Brick__PinAssignment_1_3 ) ) ;
    public final void rule__Brick__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1494:1: ( ( ( rule__Brick__PinAssignment_1_3 ) ) )
            // InternalArduinoML.g:1495:1: ( ( rule__Brick__PinAssignment_1_3 ) )
            {
            // InternalArduinoML.g:1495:1: ( ( rule__Brick__PinAssignment_1_3 ) )
            // InternalArduinoML.g:1496:2: ( rule__Brick__PinAssignment_1_3 )
            {
             before(grammarAccess.getBrickAccess().getPinAssignment_1_3()); 
            // InternalArduinoML.g:1497:2: ( rule__Brick__PinAssignment_1_3 )
            // InternalArduinoML.g:1497:3: rule__Brick__PinAssignment_1_3
            {
            pushFollow(FOLLOW_2);
            rule__Brick__PinAssignment_1_3();

            state._fsp--;


            }

             after(grammarAccess.getBrickAccess().getPinAssignment_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Brick__Group_1__3__Impl"


    // $ANTLR start "rule__Brick__Group_1__4"
    // InternalArduinoML.g:1505:1: rule__Brick__Group_1__4 : rule__Brick__Group_1__4__Impl ;
    public final void rule__Brick__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1509:1: ( rule__Brick__Group_1__4__Impl )
            // InternalArduinoML.g:1510:2: rule__Brick__Group_1__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Brick__Group_1__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Brick__Group_1__4"


    // $ANTLR start "rule__Brick__Group_1__4__Impl"
    // InternalArduinoML.g:1516:1: rule__Brick__Group_1__4__Impl : ( ( rule__Brick__Group_1_4__0 )? ) ;
    public final void rule__Brick__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1520:1: ( ( ( rule__Brick__Group_1_4__0 )? ) )
            // InternalArduinoML.g:1521:1: ( ( rule__Brick__Group_1_4__0 )? )
            {
            // InternalArduinoML.g:1521:1: ( ( rule__Brick__Group_1_4__0 )? )
            // InternalArduinoML.g:1522:2: ( rule__Brick__Group_1_4__0 )?
            {
             before(grammarAccess.getBrickAccess().getGroup_1_4()); 
            // InternalArduinoML.g:1523:2: ( rule__Brick__Group_1_4__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==30) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalArduinoML.g:1523:3: rule__Brick__Group_1_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Brick__Group_1_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBrickAccess().getGroup_1_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Brick__Group_1__4__Impl"


    // $ANTLR start "rule__Brick__Group_1_4__0"
    // InternalArduinoML.g:1532:1: rule__Brick__Group_1_4__0 : rule__Brick__Group_1_4__0__Impl rule__Brick__Group_1_4__1 ;
    public final void rule__Brick__Group_1_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1536:1: ( rule__Brick__Group_1_4__0__Impl rule__Brick__Group_1_4__1 )
            // InternalArduinoML.g:1537:2: rule__Brick__Group_1_4__0__Impl rule__Brick__Group_1_4__1
            {
            pushFollow(FOLLOW_17);
            rule__Brick__Group_1_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Brick__Group_1_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Brick__Group_1_4__0"


    // $ANTLR start "rule__Brick__Group_1_4__0__Impl"
    // InternalArduinoML.g:1544:1: rule__Brick__Group_1_4__0__Impl : ( 'with' ) ;
    public final void rule__Brick__Group_1_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1548:1: ( ( 'with' ) )
            // InternalArduinoML.g:1549:1: ( 'with' )
            {
            // InternalArduinoML.g:1549:1: ( 'with' )
            // InternalArduinoML.g:1550:2: 'with'
            {
             before(grammarAccess.getBrickAccess().getWithKeyword_1_4_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getBrickAccess().getWithKeyword_1_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Brick__Group_1_4__0__Impl"


    // $ANTLR start "rule__Brick__Group_1_4__1"
    // InternalArduinoML.g:1559:1: rule__Brick__Group_1_4__1 : rule__Brick__Group_1_4__1__Impl rule__Brick__Group_1_4__2 ;
    public final void rule__Brick__Group_1_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1563:1: ( rule__Brick__Group_1_4__1__Impl rule__Brick__Group_1_4__2 )
            // InternalArduinoML.g:1564:2: rule__Brick__Group_1_4__1__Impl rule__Brick__Group_1_4__2
            {
            pushFollow(FOLLOW_5);
            rule__Brick__Group_1_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Brick__Group_1_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Brick__Group_1_4__1"


    // $ANTLR start "rule__Brick__Group_1_4__1__Impl"
    // InternalArduinoML.g:1571:1: rule__Brick__Group_1_4__1__Impl : ( 'debug' ) ;
    public final void rule__Brick__Group_1_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1575:1: ( ( 'debug' ) )
            // InternalArduinoML.g:1576:1: ( 'debug' )
            {
            // InternalArduinoML.g:1576:1: ( 'debug' )
            // InternalArduinoML.g:1577:2: 'debug'
            {
             before(grammarAccess.getBrickAccess().getDebugKeyword_1_4_1()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getBrickAccess().getDebugKeyword_1_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Brick__Group_1_4__1__Impl"


    // $ANTLR start "rule__Brick__Group_1_4__2"
    // InternalArduinoML.g:1586:1: rule__Brick__Group_1_4__2 : rule__Brick__Group_1_4__2__Impl ;
    public final void rule__Brick__Group_1_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1590:1: ( rule__Brick__Group_1_4__2__Impl )
            // InternalArduinoML.g:1591:2: rule__Brick__Group_1_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Brick__Group_1_4__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Brick__Group_1_4__2"


    // $ANTLR start "rule__Brick__Group_1_4__2__Impl"
    // InternalArduinoML.g:1597:1: rule__Brick__Group_1_4__2__Impl : ( ( rule__Brick__DebugAssignment_1_4_2 ) ) ;
    public final void rule__Brick__Group_1_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1601:1: ( ( ( rule__Brick__DebugAssignment_1_4_2 ) ) )
            // InternalArduinoML.g:1602:1: ( ( rule__Brick__DebugAssignment_1_4_2 ) )
            {
            // InternalArduinoML.g:1602:1: ( ( rule__Brick__DebugAssignment_1_4_2 ) )
            // InternalArduinoML.g:1603:2: ( rule__Brick__DebugAssignment_1_4_2 )
            {
             before(grammarAccess.getBrickAccess().getDebugAssignment_1_4_2()); 
            // InternalArduinoML.g:1604:2: ( rule__Brick__DebugAssignment_1_4_2 )
            // InternalArduinoML.g:1604:3: rule__Brick__DebugAssignment_1_4_2
            {
            pushFollow(FOLLOW_2);
            rule__Brick__DebugAssignment_1_4_2();

            state._fsp--;


            }

             after(grammarAccess.getBrickAccess().getDebugAssignment_1_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Brick__Group_1_4__2__Impl"


    // $ANTLR start "rule__Mode__Group__0"
    // InternalArduinoML.g:1613:1: rule__Mode__Group__0 : rule__Mode__Group__0__Impl rule__Mode__Group__1 ;
    public final void rule__Mode__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1617:1: ( rule__Mode__Group__0__Impl rule__Mode__Group__1 )
            // InternalArduinoML.g:1618:2: rule__Mode__Group__0__Impl rule__Mode__Group__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalArduinoML.g:1625:1: rule__Mode__Group__0__Impl : ( ( rule__Mode__NameAssignment_0 ) ) ;
    public final void rule__Mode__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1629:1: ( ( ( rule__Mode__NameAssignment_0 ) ) )
            // InternalArduinoML.g:1630:1: ( ( rule__Mode__NameAssignment_0 ) )
            {
            // InternalArduinoML.g:1630:1: ( ( rule__Mode__NameAssignment_0 ) )
            // InternalArduinoML.g:1631:2: ( rule__Mode__NameAssignment_0 )
            {
             before(grammarAccess.getModeAccess().getNameAssignment_0()); 
            // InternalArduinoML.g:1632:2: ( rule__Mode__NameAssignment_0 )
            // InternalArduinoML.g:1632:3: rule__Mode__NameAssignment_0
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
    // InternalArduinoML.g:1640:1: rule__Mode__Group__1 : rule__Mode__Group__1__Impl rule__Mode__Group__2 ;
    public final void rule__Mode__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1644:1: ( rule__Mode__Group__1__Impl rule__Mode__Group__2 )
            // InternalArduinoML.g:1645:2: rule__Mode__Group__1__Impl rule__Mode__Group__2
            {
            pushFollow(FOLLOW_18);
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
    // InternalArduinoML.g:1652:1: rule__Mode__Group__1__Impl : ( 'initial' ) ;
    public final void rule__Mode__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1656:1: ( ( 'initial' ) )
            // InternalArduinoML.g:1657:1: ( 'initial' )
            {
            // InternalArduinoML.g:1657:1: ( 'initial' )
            // InternalArduinoML.g:1658:2: 'initial'
            {
             before(grammarAccess.getModeAccess().getInitialKeyword_1()); 
            match(input,25,FOLLOW_2); 
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
    // InternalArduinoML.g:1667:1: rule__Mode__Group__2 : rule__Mode__Group__2__Impl rule__Mode__Group__3 ;
    public final void rule__Mode__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1671:1: ( rule__Mode__Group__2__Impl rule__Mode__Group__3 )
            // InternalArduinoML.g:1672:2: rule__Mode__Group__2__Impl rule__Mode__Group__3
            {
            pushFollow(FOLLOW_6);
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
    // InternalArduinoML.g:1679:1: rule__Mode__Group__2__Impl : ( 'state' ) ;
    public final void rule__Mode__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1683:1: ( ( 'state' ) )
            // InternalArduinoML.g:1684:1: ( 'state' )
            {
            // InternalArduinoML.g:1684:1: ( 'state' )
            // InternalArduinoML.g:1685:2: 'state'
            {
             before(grammarAccess.getModeAccess().getStateKeyword_2()); 
            match(input,32,FOLLOW_2); 
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
    // InternalArduinoML.g:1694:1: rule__Mode__Group__3 : rule__Mode__Group__3__Impl rule__Mode__Group__4 ;
    public final void rule__Mode__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1698:1: ( rule__Mode__Group__3__Impl rule__Mode__Group__4 )
            // InternalArduinoML.g:1699:2: rule__Mode__Group__3__Impl rule__Mode__Group__4
            {
            pushFollow(FOLLOW_9);
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
    // InternalArduinoML.g:1706:1: rule__Mode__Group__3__Impl : ( ( rule__Mode__InitialAssignment_3 ) ) ;
    public final void rule__Mode__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1710:1: ( ( ( rule__Mode__InitialAssignment_3 ) ) )
            // InternalArduinoML.g:1711:1: ( ( rule__Mode__InitialAssignment_3 ) )
            {
            // InternalArduinoML.g:1711:1: ( ( rule__Mode__InitialAssignment_3 ) )
            // InternalArduinoML.g:1712:2: ( rule__Mode__InitialAssignment_3 )
            {
             before(grammarAccess.getModeAccess().getInitialAssignment_3()); 
            // InternalArduinoML.g:1713:2: ( rule__Mode__InitialAssignment_3 )
            // InternalArduinoML.g:1713:3: rule__Mode__InitialAssignment_3
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
    // InternalArduinoML.g:1721:1: rule__Mode__Group__4 : rule__Mode__Group__4__Impl rule__Mode__Group__5 ;
    public final void rule__Mode__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1725:1: ( rule__Mode__Group__4__Impl rule__Mode__Group__5 )
            // InternalArduinoML.g:1726:2: rule__Mode__Group__4__Impl rule__Mode__Group__5
            {
            pushFollow(FOLLOW_19);
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
    // InternalArduinoML.g:1733:1: rule__Mode__Group__4__Impl : ( ':' ) ;
    public final void rule__Mode__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1737:1: ( ( ':' ) )
            // InternalArduinoML.g:1738:1: ( ':' )
            {
            // InternalArduinoML.g:1738:1: ( ':' )
            // InternalArduinoML.g:1739:2: ':'
            {
             before(grammarAccess.getModeAccess().getColonKeyword_4()); 
            match(input,27,FOLLOW_2); 
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
    // InternalArduinoML.g:1748:1: rule__Mode__Group__5 : rule__Mode__Group__5__Impl rule__Mode__Group__6 ;
    public final void rule__Mode__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1752:1: ( rule__Mode__Group__5__Impl rule__Mode__Group__6 )
            // InternalArduinoML.g:1753:2: rule__Mode__Group__5__Impl rule__Mode__Group__6
            {
            pushFollow(FOLLOW_19);
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
    // InternalArduinoML.g:1760:1: rule__Mode__Group__5__Impl : ( ( rule__Mode__Group_5__0 )? ) ;
    public final void rule__Mode__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1764:1: ( ( ( rule__Mode__Group_5__0 )? ) )
            // InternalArduinoML.g:1765:1: ( ( rule__Mode__Group_5__0 )? )
            {
            // InternalArduinoML.g:1765:1: ( ( rule__Mode__Group_5__0 )? )
            // InternalArduinoML.g:1766:2: ( rule__Mode__Group_5__0 )?
            {
             before(grammarAccess.getModeAccess().getGroup_5()); 
            // InternalArduinoML.g:1767:2: ( rule__Mode__Group_5__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==28) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalArduinoML.g:1767:3: rule__Mode__Group_5__0
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
    // InternalArduinoML.g:1775:1: rule__Mode__Group__6 : rule__Mode__Group__6__Impl rule__Mode__Group__7 ;
    public final void rule__Mode__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1779:1: ( rule__Mode__Group__6__Impl rule__Mode__Group__7 )
            // InternalArduinoML.g:1780:2: rule__Mode__Group__6__Impl rule__Mode__Group__7
            {
            pushFollow(FOLLOW_9);
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
    // InternalArduinoML.g:1787:1: rule__Mode__Group__6__Impl : ( 'states' ) ;
    public final void rule__Mode__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1791:1: ( ( 'states' ) )
            // InternalArduinoML.g:1792:1: ( 'states' )
            {
            // InternalArduinoML.g:1792:1: ( 'states' )
            // InternalArduinoML.g:1793:2: 'states'
            {
             before(grammarAccess.getModeAccess().getStatesKeyword_6()); 
            match(input,33,FOLLOW_2); 
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
    // InternalArduinoML.g:1802:1: rule__Mode__Group__7 : rule__Mode__Group__7__Impl rule__Mode__Group__8 ;
    public final void rule__Mode__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1806:1: ( rule__Mode__Group__7__Impl rule__Mode__Group__8 )
            // InternalArduinoML.g:1807:2: rule__Mode__Group__7__Impl rule__Mode__Group__8
            {
            pushFollow(FOLLOW_6);
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
    // InternalArduinoML.g:1814:1: rule__Mode__Group__7__Impl : ( ':' ) ;
    public final void rule__Mode__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1818:1: ( ( ':' ) )
            // InternalArduinoML.g:1819:1: ( ':' )
            {
            // InternalArduinoML.g:1819:1: ( ':' )
            // InternalArduinoML.g:1820:2: ':'
            {
             before(grammarAccess.getModeAccess().getColonKeyword_7()); 
            match(input,27,FOLLOW_2); 
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
    // InternalArduinoML.g:1829:1: rule__Mode__Group__8 : rule__Mode__Group__8__Impl rule__Mode__Group__9 ;
    public final void rule__Mode__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1833:1: ( rule__Mode__Group__8__Impl rule__Mode__Group__9 )
            // InternalArduinoML.g:1834:2: rule__Mode__Group__8__Impl rule__Mode__Group__9
            {
            pushFollow(FOLLOW_20);
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
    // InternalArduinoML.g:1841:1: rule__Mode__Group__8__Impl : ( ( rule__Mode__StatesAssignment_8 ) ) ;
    public final void rule__Mode__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1845:1: ( ( ( rule__Mode__StatesAssignment_8 ) ) )
            // InternalArduinoML.g:1846:1: ( ( rule__Mode__StatesAssignment_8 ) )
            {
            // InternalArduinoML.g:1846:1: ( ( rule__Mode__StatesAssignment_8 ) )
            // InternalArduinoML.g:1847:2: ( rule__Mode__StatesAssignment_8 )
            {
             before(grammarAccess.getModeAccess().getStatesAssignment_8()); 
            // InternalArduinoML.g:1848:2: ( rule__Mode__StatesAssignment_8 )
            // InternalArduinoML.g:1848:3: rule__Mode__StatesAssignment_8
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
    // InternalArduinoML.g:1856:1: rule__Mode__Group__9 : rule__Mode__Group__9__Impl rule__Mode__Group__10 ;
    public final void rule__Mode__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1860:1: ( rule__Mode__Group__9__Impl rule__Mode__Group__10 )
            // InternalArduinoML.g:1861:2: rule__Mode__Group__9__Impl rule__Mode__Group__10
            {
            pushFollow(FOLLOW_20);
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
    // InternalArduinoML.g:1868:1: rule__Mode__Group__9__Impl : ( ( rule__Mode__StatesAssignment_9 )* ) ;
    public final void rule__Mode__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1872:1: ( ( ( rule__Mode__StatesAssignment_9 )* ) )
            // InternalArduinoML.g:1873:1: ( ( rule__Mode__StatesAssignment_9 )* )
            {
            // InternalArduinoML.g:1873:1: ( ( rule__Mode__StatesAssignment_9 )* )
            // InternalArduinoML.g:1874:2: ( rule__Mode__StatesAssignment_9 )*
            {
             before(grammarAccess.getModeAccess().getStatesAssignment_9()); 
            // InternalArduinoML.g:1875:2: ( rule__Mode__StatesAssignment_9 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_STRING) ) {
                    int LA19_2 = input.LA(2);

                    if ( (LA19_2==27) ) {
                        alt19=1;
                    }


                }
                else if ( (LA19_0==RULE_ID) ) {
                    int LA19_3 = input.LA(2);

                    if ( (LA19_3==27) ) {
                        alt19=1;
                    }


                }


                switch (alt19) {
            	case 1 :
            	    // InternalArduinoML.g:1875:3: rule__Mode__StatesAssignment_9
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__Mode__StatesAssignment_9();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
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
    // InternalArduinoML.g:1883:1: rule__Mode__Group__10 : rule__Mode__Group__10__Impl ;
    public final void rule__Mode__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1887:1: ( rule__Mode__Group__10__Impl )
            // InternalArduinoML.g:1888:2: rule__Mode__Group__10__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Mode__Group__10__Impl();

            state._fsp--;


            }

        }
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
    // InternalArduinoML.g:1894:1: rule__Mode__Group__10__Impl : ( ( rule__Mode__Group_10__0 )? ) ;
    public final void rule__Mode__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1898:1: ( ( ( rule__Mode__Group_10__0 )? ) )
            // InternalArduinoML.g:1899:1: ( ( rule__Mode__Group_10__0 )? )
            {
            // InternalArduinoML.g:1899:1: ( ( rule__Mode__Group_10__0 )? )
            // InternalArduinoML.g:1900:2: ( rule__Mode__Group_10__0 )?
            {
             before(grammarAccess.getModeAccess().getGroup_10()); 
            // InternalArduinoML.g:1901:2: ( rule__Mode__Group_10__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==34) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalArduinoML.g:1901:3: rule__Mode__Group_10__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Mode__Group_10__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getModeAccess().getGroup_10()); 

            }


            }

        }
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


    // $ANTLR start "rule__Mode__Group_5__0"
    // InternalArduinoML.g:1910:1: rule__Mode__Group_5__0 : rule__Mode__Group_5__0__Impl rule__Mode__Group_5__1 ;
    public final void rule__Mode__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1914:1: ( rule__Mode__Group_5__0__Impl rule__Mode__Group_5__1 )
            // InternalArduinoML.g:1915:2: rule__Mode__Group_5__0__Impl rule__Mode__Group_5__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalArduinoML.g:1922:1: rule__Mode__Group_5__0__Impl : ( 'bricks' ) ;
    public final void rule__Mode__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1926:1: ( ( 'bricks' ) )
            // InternalArduinoML.g:1927:1: ( 'bricks' )
            {
            // InternalArduinoML.g:1927:1: ( 'bricks' )
            // InternalArduinoML.g:1928:2: 'bricks'
            {
             before(grammarAccess.getModeAccess().getBricksKeyword_5_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalArduinoML.g:1937:1: rule__Mode__Group_5__1 : rule__Mode__Group_5__1__Impl rule__Mode__Group_5__2 ;
    public final void rule__Mode__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1941:1: ( rule__Mode__Group_5__1__Impl rule__Mode__Group_5__2 )
            // InternalArduinoML.g:1942:2: rule__Mode__Group_5__1__Impl rule__Mode__Group_5__2
            {
            pushFollow(FOLLOW_11);
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
    // InternalArduinoML.g:1949:1: rule__Mode__Group_5__1__Impl : ( ':' ) ;
    public final void rule__Mode__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1953:1: ( ( ':' ) )
            // InternalArduinoML.g:1954:1: ( ':' )
            {
            // InternalArduinoML.g:1954:1: ( ':' )
            // InternalArduinoML.g:1955:2: ':'
            {
             before(grammarAccess.getModeAccess().getColonKeyword_5_1()); 
            match(input,27,FOLLOW_2); 
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
    // InternalArduinoML.g:1964:1: rule__Mode__Group_5__2 : rule__Mode__Group_5__2__Impl rule__Mode__Group_5__3 ;
    public final void rule__Mode__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1968:1: ( rule__Mode__Group_5__2__Impl rule__Mode__Group_5__3 )
            // InternalArduinoML.g:1969:2: rule__Mode__Group_5__2__Impl rule__Mode__Group_5__3
            {
            pushFollow(FOLLOW_11);
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
    // InternalArduinoML.g:1976:1: rule__Mode__Group_5__2__Impl : ( ( rule__Mode__BricksAssignment_5_2 ) ) ;
    public final void rule__Mode__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1980:1: ( ( ( rule__Mode__BricksAssignment_5_2 ) ) )
            // InternalArduinoML.g:1981:1: ( ( rule__Mode__BricksAssignment_5_2 ) )
            {
            // InternalArduinoML.g:1981:1: ( ( rule__Mode__BricksAssignment_5_2 ) )
            // InternalArduinoML.g:1982:2: ( rule__Mode__BricksAssignment_5_2 )
            {
             before(grammarAccess.getModeAccess().getBricksAssignment_5_2()); 
            // InternalArduinoML.g:1983:2: ( rule__Mode__BricksAssignment_5_2 )
            // InternalArduinoML.g:1983:3: rule__Mode__BricksAssignment_5_2
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
    // InternalArduinoML.g:1991:1: rule__Mode__Group_5__3 : rule__Mode__Group_5__3__Impl ;
    public final void rule__Mode__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1995:1: ( rule__Mode__Group_5__3__Impl )
            // InternalArduinoML.g:1996:2: rule__Mode__Group_5__3__Impl
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
    // InternalArduinoML.g:2002:1: rule__Mode__Group_5__3__Impl : ( ( rule__Mode__BricksAssignment_5_3 )* ) ;
    public final void rule__Mode__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2006:1: ( ( ( rule__Mode__BricksAssignment_5_3 )* ) )
            // InternalArduinoML.g:2007:1: ( ( rule__Mode__BricksAssignment_5_3 )* )
            {
            // InternalArduinoML.g:2007:1: ( ( rule__Mode__BricksAssignment_5_3 )* )
            // InternalArduinoML.g:2008:2: ( rule__Mode__BricksAssignment_5_3 )*
            {
             before(grammarAccess.getModeAccess().getBricksAssignment_5_3()); 
            // InternalArduinoML.g:2009:2: ( rule__Mode__BricksAssignment_5_3 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=35 && LA21_0<=37)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalArduinoML.g:2009:3: rule__Mode__BricksAssignment_5_3
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Mode__BricksAssignment_5_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
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


    // $ANTLR start "rule__Mode__Group_10__0"
    // InternalArduinoML.g:2018:1: rule__Mode__Group_10__0 : rule__Mode__Group_10__0__Impl rule__Mode__Group_10__1 ;
    public final void rule__Mode__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2022:1: ( rule__Mode__Group_10__0__Impl rule__Mode__Group_10__1 )
            // InternalArduinoML.g:2023:2: rule__Mode__Group_10__0__Impl rule__Mode__Group_10__1
            {
            pushFollow(FOLLOW_9);
            rule__Mode__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mode__Group_10__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mode__Group_10__0"


    // $ANTLR start "rule__Mode__Group_10__0__Impl"
    // InternalArduinoML.g:2030:1: rule__Mode__Group_10__0__Impl : ( 'transitions' ) ;
    public final void rule__Mode__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2034:1: ( ( 'transitions' ) )
            // InternalArduinoML.g:2035:1: ( 'transitions' )
            {
            // InternalArduinoML.g:2035:1: ( 'transitions' )
            // InternalArduinoML.g:2036:2: 'transitions'
            {
             before(grammarAccess.getModeAccess().getTransitionsKeyword_10_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getModeAccess().getTransitionsKeyword_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mode__Group_10__0__Impl"


    // $ANTLR start "rule__Mode__Group_10__1"
    // InternalArduinoML.g:2045:1: rule__Mode__Group_10__1 : rule__Mode__Group_10__1__Impl rule__Mode__Group_10__2 ;
    public final void rule__Mode__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2049:1: ( rule__Mode__Group_10__1__Impl rule__Mode__Group_10__2 )
            // InternalArduinoML.g:2050:2: rule__Mode__Group_10__1__Impl rule__Mode__Group_10__2
            {
            pushFollow(FOLLOW_21);
            rule__Mode__Group_10__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mode__Group_10__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mode__Group_10__1"


    // $ANTLR start "rule__Mode__Group_10__1__Impl"
    // InternalArduinoML.g:2057:1: rule__Mode__Group_10__1__Impl : ( ':' ) ;
    public final void rule__Mode__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2061:1: ( ( ':' ) )
            // InternalArduinoML.g:2062:1: ( ':' )
            {
            // InternalArduinoML.g:2062:1: ( ':' )
            // InternalArduinoML.g:2063:2: ':'
            {
             before(grammarAccess.getModeAccess().getColonKeyword_10_1()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getModeAccess().getColonKeyword_10_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mode__Group_10__1__Impl"


    // $ANTLR start "rule__Mode__Group_10__2"
    // InternalArduinoML.g:2072:1: rule__Mode__Group_10__2 : rule__Mode__Group_10__2__Impl rule__Mode__Group_10__3 ;
    public final void rule__Mode__Group_10__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2076:1: ( rule__Mode__Group_10__2__Impl rule__Mode__Group_10__3 )
            // InternalArduinoML.g:2077:2: rule__Mode__Group_10__2__Impl rule__Mode__Group_10__3
            {
            pushFollow(FOLLOW_21);
            rule__Mode__Group_10__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mode__Group_10__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mode__Group_10__2"


    // $ANTLR start "rule__Mode__Group_10__2__Impl"
    // InternalArduinoML.g:2084:1: rule__Mode__Group_10__2__Impl : ( ( rule__Mode__Transitions_modeAssignment_10_2 ) ) ;
    public final void rule__Mode__Group_10__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2088:1: ( ( ( rule__Mode__Transitions_modeAssignment_10_2 ) ) )
            // InternalArduinoML.g:2089:1: ( ( rule__Mode__Transitions_modeAssignment_10_2 ) )
            {
            // InternalArduinoML.g:2089:1: ( ( rule__Mode__Transitions_modeAssignment_10_2 ) )
            // InternalArduinoML.g:2090:2: ( rule__Mode__Transitions_modeAssignment_10_2 )
            {
             before(grammarAccess.getModeAccess().getTransitions_modeAssignment_10_2()); 
            // InternalArduinoML.g:2091:2: ( rule__Mode__Transitions_modeAssignment_10_2 )
            // InternalArduinoML.g:2091:3: rule__Mode__Transitions_modeAssignment_10_2
            {
            pushFollow(FOLLOW_2);
            rule__Mode__Transitions_modeAssignment_10_2();

            state._fsp--;


            }

             after(grammarAccess.getModeAccess().getTransitions_modeAssignment_10_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mode__Group_10__2__Impl"


    // $ANTLR start "rule__Mode__Group_10__3"
    // InternalArduinoML.g:2099:1: rule__Mode__Group_10__3 : rule__Mode__Group_10__3__Impl ;
    public final void rule__Mode__Group_10__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2103:1: ( rule__Mode__Group_10__3__Impl )
            // InternalArduinoML.g:2104:2: rule__Mode__Group_10__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Mode__Group_10__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mode__Group_10__3"


    // $ANTLR start "rule__Mode__Group_10__3__Impl"
    // InternalArduinoML.g:2110:1: rule__Mode__Group_10__3__Impl : ( ( rule__Mode__Transitions_modeAssignment_10_3 )* ) ;
    public final void rule__Mode__Group_10__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2114:1: ( ( ( rule__Mode__Transitions_modeAssignment_10_3 )* ) )
            // InternalArduinoML.g:2115:1: ( ( rule__Mode__Transitions_modeAssignment_10_3 )* )
            {
            // InternalArduinoML.g:2115:1: ( ( rule__Mode__Transitions_modeAssignment_10_3 )* )
            // InternalArduinoML.g:2116:2: ( rule__Mode__Transitions_modeAssignment_10_3 )*
            {
             before(grammarAccess.getModeAccess().getTransitions_modeAssignment_10_3()); 
            // InternalArduinoML.g:2117:2: ( rule__Mode__Transitions_modeAssignment_10_3 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==41||LA22_0==44) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalArduinoML.g:2117:3: rule__Mode__Transitions_modeAssignment_10_3
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__Mode__Transitions_modeAssignment_10_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getModeAccess().getTransitions_modeAssignment_10_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mode__Group_10__3__Impl"


    // $ANTLR start "rule__State__Group__0"
    // InternalArduinoML.g:2126:1: rule__State__Group__0 : rule__State__Group__0__Impl rule__State__Group__1 ;
    public final void rule__State__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2130:1: ( rule__State__Group__0__Impl rule__State__Group__1 )
            // InternalArduinoML.g:2131:2: rule__State__Group__0__Impl rule__State__Group__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalArduinoML.g:2138:1: rule__State__Group__0__Impl : ( ( rule__State__NameAssignment_0 ) ) ;
    public final void rule__State__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2142:1: ( ( ( rule__State__NameAssignment_0 ) ) )
            // InternalArduinoML.g:2143:1: ( ( rule__State__NameAssignment_0 ) )
            {
            // InternalArduinoML.g:2143:1: ( ( rule__State__NameAssignment_0 ) )
            // InternalArduinoML.g:2144:2: ( rule__State__NameAssignment_0 )
            {
             before(grammarAccess.getStateAccess().getNameAssignment_0()); 
            // InternalArduinoML.g:2145:2: ( rule__State__NameAssignment_0 )
            // InternalArduinoML.g:2145:3: rule__State__NameAssignment_0
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
    // InternalArduinoML.g:2153:1: rule__State__Group__1 : rule__State__Group__1__Impl rule__State__Group__2 ;
    public final void rule__State__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2157:1: ( rule__State__Group__1__Impl rule__State__Group__2 )
            // InternalArduinoML.g:2158:2: rule__State__Group__1__Impl rule__State__Group__2
            {
            pushFollow(FOLLOW_23);
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
    // InternalArduinoML.g:2165:1: rule__State__Group__1__Impl : ( ':' ) ;
    public final void rule__State__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2169:1: ( ( ':' ) )
            // InternalArduinoML.g:2170:1: ( ':' )
            {
            // InternalArduinoML.g:2170:1: ( ':' )
            // InternalArduinoML.g:2171:2: ':'
            {
             before(grammarAccess.getStateAccess().getColonKeyword_1()); 
            match(input,27,FOLLOW_2); 
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
    // InternalArduinoML.g:2180:1: rule__State__Group__2 : rule__State__Group__2__Impl rule__State__Group__3 ;
    public final void rule__State__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2184:1: ( rule__State__Group__2__Impl rule__State__Group__3 )
            // InternalArduinoML.g:2185:2: rule__State__Group__2__Impl rule__State__Group__3
            {
            pushFollow(FOLLOW_24);
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
    // InternalArduinoML.g:2192:1: rule__State__Group__2__Impl : ( ( rule__State__ActionsAssignment_2 ) ) ;
    public final void rule__State__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2196:1: ( ( ( rule__State__ActionsAssignment_2 ) ) )
            // InternalArduinoML.g:2197:1: ( ( rule__State__ActionsAssignment_2 ) )
            {
            // InternalArduinoML.g:2197:1: ( ( rule__State__ActionsAssignment_2 ) )
            // InternalArduinoML.g:2198:2: ( rule__State__ActionsAssignment_2 )
            {
             before(grammarAccess.getStateAccess().getActionsAssignment_2()); 
            // InternalArduinoML.g:2199:2: ( rule__State__ActionsAssignment_2 )
            // InternalArduinoML.g:2199:3: rule__State__ActionsAssignment_2
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
    // InternalArduinoML.g:2207:1: rule__State__Group__3 : rule__State__Group__3__Impl rule__State__Group__4 ;
    public final void rule__State__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2211:1: ( rule__State__Group__3__Impl rule__State__Group__4 )
            // InternalArduinoML.g:2212:2: rule__State__Group__3__Impl rule__State__Group__4
            {
            pushFollow(FOLLOW_24);
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
    // InternalArduinoML.g:2219:1: rule__State__Group__3__Impl : ( ( rule__State__ActionsAssignment_3 )* ) ;
    public final void rule__State__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2223:1: ( ( ( rule__State__ActionsAssignment_3 )* ) )
            // InternalArduinoML.g:2224:1: ( ( rule__State__ActionsAssignment_3 )* )
            {
            // InternalArduinoML.g:2224:1: ( ( rule__State__ActionsAssignment_3 )* )
            // InternalArduinoML.g:2225:2: ( rule__State__ActionsAssignment_3 )*
            {
             before(grammarAccess.getStateAccess().getActionsAssignment_3()); 
            // InternalArduinoML.g:2226:2: ( rule__State__ActionsAssignment_3 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==38) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalArduinoML.g:2226:3: rule__State__ActionsAssignment_3
            	    {
            	    pushFollow(FOLLOW_25);
            	    rule__State__ActionsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
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
    // InternalArduinoML.g:2234:1: rule__State__Group__4 : rule__State__Group__4__Impl rule__State__Group__5 ;
    public final void rule__State__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2238:1: ( rule__State__Group__4__Impl rule__State__Group__5 )
            // InternalArduinoML.g:2239:2: rule__State__Group__4__Impl rule__State__Group__5
            {
            pushFollow(FOLLOW_24);
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
    // InternalArduinoML.g:2246:1: rule__State__Group__4__Impl : ( ( rule__State__Transitions_stateAssignment_4 ) ) ;
    public final void rule__State__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2250:1: ( ( ( rule__State__Transitions_stateAssignment_4 ) ) )
            // InternalArduinoML.g:2251:1: ( ( rule__State__Transitions_stateAssignment_4 ) )
            {
            // InternalArduinoML.g:2251:1: ( ( rule__State__Transitions_stateAssignment_4 ) )
            // InternalArduinoML.g:2252:2: ( rule__State__Transitions_stateAssignment_4 )
            {
             before(grammarAccess.getStateAccess().getTransitions_stateAssignment_4()); 
            // InternalArduinoML.g:2253:2: ( rule__State__Transitions_stateAssignment_4 )
            // InternalArduinoML.g:2253:3: rule__State__Transitions_stateAssignment_4
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
    // InternalArduinoML.g:2261:1: rule__State__Group__5 : rule__State__Group__5__Impl ;
    public final void rule__State__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2265:1: ( rule__State__Group__5__Impl )
            // InternalArduinoML.g:2266:2: rule__State__Group__5__Impl
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
    // InternalArduinoML.g:2272:1: rule__State__Group__5__Impl : ( ( rule__State__Transitions_stateAssignment_5 )* ) ;
    public final void rule__State__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2276:1: ( ( ( rule__State__Transitions_stateAssignment_5 )* ) )
            // InternalArduinoML.g:2277:1: ( ( rule__State__Transitions_stateAssignment_5 )* )
            {
            // InternalArduinoML.g:2277:1: ( ( rule__State__Transitions_stateAssignment_5 )* )
            // InternalArduinoML.g:2278:2: ( rule__State__Transitions_stateAssignment_5 )*
            {
             before(grammarAccess.getStateAccess().getTransitions_stateAssignment_5()); 
            // InternalArduinoML.g:2279:2: ( rule__State__Transitions_stateAssignment_5 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==41||LA24_0==44) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalArduinoML.g:2279:3: rule__State__Transitions_stateAssignment_5
            	    {
            	    pushFollow(FOLLOW_26);
            	    rule__State__Transitions_stateAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
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
    // InternalArduinoML.g:2288:1: rule__Actuator__Group__0 : rule__Actuator__Group__0__Impl rule__Actuator__Group__1 ;
    public final void rule__Actuator__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2292:1: ( rule__Actuator__Group__0__Impl rule__Actuator__Group__1 )
            // InternalArduinoML.g:2293:2: rule__Actuator__Group__0__Impl rule__Actuator__Group__1
            {
            pushFollow(FOLLOW_27);
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
    // InternalArduinoML.g:2300:1: rule__Actuator__Group__0__Impl : ( () ) ;
    public final void rule__Actuator__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2304:1: ( ( () ) )
            // InternalArduinoML.g:2305:1: ( () )
            {
            // InternalArduinoML.g:2305:1: ( () )
            // InternalArduinoML.g:2306:2: ()
            {
             before(grammarAccess.getActuatorAccess().getActuatorAction_0()); 
            // InternalArduinoML.g:2307:2: ()
            // InternalArduinoML.g:2307:3: 
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
    // InternalArduinoML.g:2315:1: rule__Actuator__Group__1 : rule__Actuator__Group__1__Impl ;
    public final void rule__Actuator__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2319:1: ( rule__Actuator__Group__1__Impl )
            // InternalArduinoML.g:2320:2: rule__Actuator__Group__1__Impl
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
    // InternalArduinoML.g:2326:1: rule__Actuator__Group__1__Impl : ( 'Actuator' ) ;
    public final void rule__Actuator__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2330:1: ( ( 'Actuator' ) )
            // InternalArduinoML.g:2331:1: ( 'Actuator' )
            {
            // InternalArduinoML.g:2331:1: ( 'Actuator' )
            // InternalArduinoML.g:2332:2: 'Actuator'
            {
             before(grammarAccess.getActuatorAccess().getActuatorKeyword_1()); 
            match(input,35,FOLLOW_2); 
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
    // InternalArduinoML.g:2342:1: rule__Digital__Group__0 : rule__Digital__Group__0__Impl rule__Digital__Group__1 ;
    public final void rule__Digital__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2346:1: ( rule__Digital__Group__0__Impl rule__Digital__Group__1 )
            // InternalArduinoML.g:2347:2: rule__Digital__Group__0__Impl rule__Digital__Group__1
            {
            pushFollow(FOLLOW_28);
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
    // InternalArduinoML.g:2354:1: rule__Digital__Group__0__Impl : ( () ) ;
    public final void rule__Digital__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2358:1: ( ( () ) )
            // InternalArduinoML.g:2359:1: ( () )
            {
            // InternalArduinoML.g:2359:1: ( () )
            // InternalArduinoML.g:2360:2: ()
            {
             before(grammarAccess.getDigitalAccess().getDigitalAction_0()); 
            // InternalArduinoML.g:2361:2: ()
            // InternalArduinoML.g:2361:3: 
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
    // InternalArduinoML.g:2369:1: rule__Digital__Group__1 : rule__Digital__Group__1__Impl ;
    public final void rule__Digital__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2373:1: ( rule__Digital__Group__1__Impl )
            // InternalArduinoML.g:2374:2: rule__Digital__Group__1__Impl
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
    // InternalArduinoML.g:2380:1: rule__Digital__Group__1__Impl : ( 'Digital' ) ;
    public final void rule__Digital__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2384:1: ( ( 'Digital' ) )
            // InternalArduinoML.g:2385:1: ( 'Digital' )
            {
            // InternalArduinoML.g:2385:1: ( 'Digital' )
            // InternalArduinoML.g:2386:2: 'Digital'
            {
             before(grammarAccess.getDigitalAccess().getDigitalKeyword_1()); 
            match(input,36,FOLLOW_2); 
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
    // InternalArduinoML.g:2396:1: rule__Analog__Group__0 : rule__Analog__Group__0__Impl rule__Analog__Group__1 ;
    public final void rule__Analog__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2400:1: ( rule__Analog__Group__0__Impl rule__Analog__Group__1 )
            // InternalArduinoML.g:2401:2: rule__Analog__Group__0__Impl rule__Analog__Group__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalArduinoML.g:2408:1: rule__Analog__Group__0__Impl : ( () ) ;
    public final void rule__Analog__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2412:1: ( ( () ) )
            // InternalArduinoML.g:2413:1: ( () )
            {
            // InternalArduinoML.g:2413:1: ( () )
            // InternalArduinoML.g:2414:2: ()
            {
             before(grammarAccess.getAnalogAccess().getAnalogAction_0()); 
            // InternalArduinoML.g:2415:2: ()
            // InternalArduinoML.g:2415:3: 
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
    // InternalArduinoML.g:2423:1: rule__Analog__Group__1 : rule__Analog__Group__1__Impl ;
    public final void rule__Analog__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2427:1: ( rule__Analog__Group__1__Impl )
            // InternalArduinoML.g:2428:2: rule__Analog__Group__1__Impl
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
    // InternalArduinoML.g:2434:1: rule__Analog__Group__1__Impl : ( 'Analog' ) ;
    public final void rule__Analog__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2438:1: ( ( 'Analog' ) )
            // InternalArduinoML.g:2439:1: ( 'Analog' )
            {
            // InternalArduinoML.g:2439:1: ( 'Analog' )
            // InternalArduinoML.g:2440:2: 'Analog'
            {
             before(grammarAccess.getAnalogAccess().getAnalogKeyword_1()); 
            match(input,37,FOLLOW_2); 
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
    // InternalArduinoML.g:2450:1: rule__Action__Group__0 : rule__Action__Group__0__Impl rule__Action__Group__1 ;
    public final void rule__Action__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2454:1: ( rule__Action__Group__0__Impl rule__Action__Group__1 )
            // InternalArduinoML.g:2455:2: rule__Action__Group__0__Impl rule__Action__Group__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalArduinoML.g:2462:1: rule__Action__Group__0__Impl : ( 'change' ) ;
    public final void rule__Action__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2466:1: ( ( 'change' ) )
            // InternalArduinoML.g:2467:1: ( 'change' )
            {
            // InternalArduinoML.g:2467:1: ( 'change' )
            // InternalArduinoML.g:2468:2: 'change'
            {
             before(grammarAccess.getActionAccess().getChangeKeyword_0()); 
            match(input,38,FOLLOW_2); 
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
    // InternalArduinoML.g:2477:1: rule__Action__Group__1 : rule__Action__Group__1__Impl rule__Action__Group__2 ;
    public final void rule__Action__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2481:1: ( rule__Action__Group__1__Impl rule__Action__Group__2 )
            // InternalArduinoML.g:2482:2: rule__Action__Group__1__Impl rule__Action__Group__2
            {
            pushFollow(FOLLOW_29);
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
    // InternalArduinoML.g:2489:1: rule__Action__Group__1__Impl : ( ( rule__Action__ActuatorAssignment_1 ) ) ;
    public final void rule__Action__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2493:1: ( ( ( rule__Action__ActuatorAssignment_1 ) ) )
            // InternalArduinoML.g:2494:1: ( ( rule__Action__ActuatorAssignment_1 ) )
            {
            // InternalArduinoML.g:2494:1: ( ( rule__Action__ActuatorAssignment_1 ) )
            // InternalArduinoML.g:2495:2: ( rule__Action__ActuatorAssignment_1 )
            {
             before(grammarAccess.getActionAccess().getActuatorAssignment_1()); 
            // InternalArduinoML.g:2496:2: ( rule__Action__ActuatorAssignment_1 )
            // InternalArduinoML.g:2496:3: rule__Action__ActuatorAssignment_1
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
    // InternalArduinoML.g:2504:1: rule__Action__Group__2 : rule__Action__Group__2__Impl rule__Action__Group__3 ;
    public final void rule__Action__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2508:1: ( rule__Action__Group__2__Impl rule__Action__Group__3 )
            // InternalArduinoML.g:2509:2: rule__Action__Group__2__Impl rule__Action__Group__3
            {
            pushFollow(FOLLOW_30);
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
    // InternalArduinoML.g:2516:1: rule__Action__Group__2__Impl : ( 'to' ) ;
    public final void rule__Action__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2520:1: ( ( 'to' ) )
            // InternalArduinoML.g:2521:1: ( 'to' )
            {
            // InternalArduinoML.g:2521:1: ( 'to' )
            // InternalArduinoML.g:2522:2: 'to'
            {
             before(grammarAccess.getActionAccess().getToKeyword_2()); 
            match(input,39,FOLLOW_2); 
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
    // InternalArduinoML.g:2531:1: rule__Action__Group__3 : rule__Action__Group__3__Impl ;
    public final void rule__Action__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2535:1: ( rule__Action__Group__3__Impl )
            // InternalArduinoML.g:2536:2: rule__Action__Group__3__Impl
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
    // InternalArduinoML.g:2542:1: rule__Action__Group__3__Impl : ( ( rule__Action__ValueAssignment_3 ) ) ;
    public final void rule__Action__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2546:1: ( ( ( rule__Action__ValueAssignment_3 ) ) )
            // InternalArduinoML.g:2547:1: ( ( rule__Action__ValueAssignment_3 ) )
            {
            // InternalArduinoML.g:2547:1: ( ( rule__Action__ValueAssignment_3 ) )
            // InternalArduinoML.g:2548:2: ( rule__Action__ValueAssignment_3 )
            {
             before(grammarAccess.getActionAccess().getValueAssignment_3()); 
            // InternalArduinoML.g:2549:2: ( rule__Action__ValueAssignment_3 )
            // InternalArduinoML.g:2549:3: rule__Action__ValueAssignment_3
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
    // InternalArduinoML.g:2558:1: rule__TransitionState__Group__0 : rule__TransitionState__Group__0__Impl rule__TransitionState__Group__1 ;
    public final void rule__TransitionState__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2562:1: ( rule__TransitionState__Group__0__Impl rule__TransitionState__Group__1 )
            // InternalArduinoML.g:2563:2: rule__TransitionState__Group__0__Impl rule__TransitionState__Group__1
            {
            pushFollow(FOLLOW_31);
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
    // InternalArduinoML.g:2570:1: rule__TransitionState__Group__0__Impl : ( ( rule__TransitionState__Alternatives_0 ) ) ;
    public final void rule__TransitionState__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2574:1: ( ( ( rule__TransitionState__Alternatives_0 ) ) )
            // InternalArduinoML.g:2575:1: ( ( rule__TransitionState__Alternatives_0 ) )
            {
            // InternalArduinoML.g:2575:1: ( ( rule__TransitionState__Alternatives_0 ) )
            // InternalArduinoML.g:2576:2: ( rule__TransitionState__Alternatives_0 )
            {
             before(grammarAccess.getTransitionStateAccess().getAlternatives_0()); 
            // InternalArduinoML.g:2577:2: ( rule__TransitionState__Alternatives_0 )
            // InternalArduinoML.g:2577:3: rule__TransitionState__Alternatives_0
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
    // InternalArduinoML.g:2585:1: rule__TransitionState__Group__1 : rule__TransitionState__Group__1__Impl rule__TransitionState__Group__2 ;
    public final void rule__TransitionState__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2589:1: ( rule__TransitionState__Group__1__Impl rule__TransitionState__Group__2 )
            // InternalArduinoML.g:2590:2: rule__TransitionState__Group__1__Impl rule__TransitionState__Group__2
            {
            pushFollow(FOLLOW_29);
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
    // InternalArduinoML.g:2597:1: rule__TransitionState__Group__1__Impl : ( 'go' ) ;
    public final void rule__TransitionState__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2601:1: ( ( 'go' ) )
            // InternalArduinoML.g:2602:1: ( 'go' )
            {
            // InternalArduinoML.g:2602:1: ( 'go' )
            // InternalArduinoML.g:2603:2: 'go'
            {
             before(grammarAccess.getTransitionStateAccess().getGoKeyword_1()); 
            match(input,40,FOLLOW_2); 
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
    // InternalArduinoML.g:2612:1: rule__TransitionState__Group__2 : rule__TransitionState__Group__2__Impl rule__TransitionState__Group__3 ;
    public final void rule__TransitionState__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2616:1: ( rule__TransitionState__Group__2__Impl rule__TransitionState__Group__3 )
            // InternalArduinoML.g:2617:2: rule__TransitionState__Group__2__Impl rule__TransitionState__Group__3
            {
            pushFollow(FOLLOW_18);
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
    // InternalArduinoML.g:2624:1: rule__TransitionState__Group__2__Impl : ( 'to' ) ;
    public final void rule__TransitionState__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2628:1: ( ( 'to' ) )
            // InternalArduinoML.g:2629:1: ( 'to' )
            {
            // InternalArduinoML.g:2629:1: ( 'to' )
            // InternalArduinoML.g:2630:2: 'to'
            {
             before(grammarAccess.getTransitionStateAccess().getToKeyword_2()); 
            match(input,39,FOLLOW_2); 
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
    // InternalArduinoML.g:2639:1: rule__TransitionState__Group__3 : rule__TransitionState__Group__3__Impl rule__TransitionState__Group__4 ;
    public final void rule__TransitionState__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2643:1: ( rule__TransitionState__Group__3__Impl rule__TransitionState__Group__4 )
            // InternalArduinoML.g:2644:2: rule__TransitionState__Group__3__Impl rule__TransitionState__Group__4
            {
            pushFollow(FOLLOW_6);
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
    // InternalArduinoML.g:2651:1: rule__TransitionState__Group__3__Impl : ( 'state' ) ;
    public final void rule__TransitionState__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2655:1: ( ( 'state' ) )
            // InternalArduinoML.g:2656:1: ( 'state' )
            {
            // InternalArduinoML.g:2656:1: ( 'state' )
            // InternalArduinoML.g:2657:2: 'state'
            {
             before(grammarAccess.getTransitionStateAccess().getStateKeyword_3()); 
            match(input,32,FOLLOW_2); 
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
    // InternalArduinoML.g:2666:1: rule__TransitionState__Group__4 : rule__TransitionState__Group__4__Impl ;
    public final void rule__TransitionState__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2670:1: ( rule__TransitionState__Group__4__Impl )
            // InternalArduinoML.g:2671:2: rule__TransitionState__Group__4__Impl
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
    // InternalArduinoML.g:2677:1: rule__TransitionState__Group__4__Impl : ( ( rule__TransitionState__Next_stateAssignment_4 ) ) ;
    public final void rule__TransitionState__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2681:1: ( ( ( rule__TransitionState__Next_stateAssignment_4 ) ) )
            // InternalArduinoML.g:2682:1: ( ( rule__TransitionState__Next_stateAssignment_4 ) )
            {
            // InternalArduinoML.g:2682:1: ( ( rule__TransitionState__Next_stateAssignment_4 ) )
            // InternalArduinoML.g:2683:2: ( rule__TransitionState__Next_stateAssignment_4 )
            {
             before(grammarAccess.getTransitionStateAccess().getNext_stateAssignment_4()); 
            // InternalArduinoML.g:2684:2: ( rule__TransitionState__Next_stateAssignment_4 )
            // InternalArduinoML.g:2684:3: rule__TransitionState__Next_stateAssignment_4
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
    // InternalArduinoML.g:2693:1: rule__TransitionState__Group_0_0__0 : rule__TransitionState__Group_0_0__0__Impl rule__TransitionState__Group_0_0__1 ;
    public final void rule__TransitionState__Group_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2697:1: ( rule__TransitionState__Group_0_0__0__Impl rule__TransitionState__Group_0_0__1 )
            // InternalArduinoML.g:2698:2: rule__TransitionState__Group_0_0__0__Impl rule__TransitionState__Group_0_0__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalArduinoML.g:2705:1: rule__TransitionState__Group_0_0__0__Impl : ( 'when' ) ;
    public final void rule__TransitionState__Group_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2709:1: ( ( 'when' ) )
            // InternalArduinoML.g:2710:1: ( 'when' )
            {
            // InternalArduinoML.g:2710:1: ( 'when' )
            // InternalArduinoML.g:2711:2: 'when'
            {
             before(grammarAccess.getTransitionStateAccess().getWhenKeyword_0_0_0()); 
            match(input,41,FOLLOW_2); 
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
    // InternalArduinoML.g:2720:1: rule__TransitionState__Group_0_0__1 : rule__TransitionState__Group_0_0__1__Impl rule__TransitionState__Group_0_0__2 ;
    public final void rule__TransitionState__Group_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2724:1: ( rule__TransitionState__Group_0_0__1__Impl rule__TransitionState__Group_0_0__2 )
            // InternalArduinoML.g:2725:2: rule__TransitionState__Group_0_0__1__Impl rule__TransitionState__Group_0_0__2
            {
            pushFollow(FOLLOW_32);
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
    // InternalArduinoML.g:2732:1: rule__TransitionState__Group_0_0__1__Impl : ( ( rule__TransitionState__Alternatives_0_0_1 ) ) ;
    public final void rule__TransitionState__Group_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2736:1: ( ( ( rule__TransitionState__Alternatives_0_0_1 ) ) )
            // InternalArduinoML.g:2737:1: ( ( rule__TransitionState__Alternatives_0_0_1 ) )
            {
            // InternalArduinoML.g:2737:1: ( ( rule__TransitionState__Alternatives_0_0_1 ) )
            // InternalArduinoML.g:2738:2: ( rule__TransitionState__Alternatives_0_0_1 )
            {
             before(grammarAccess.getTransitionStateAccess().getAlternatives_0_0_1()); 
            // InternalArduinoML.g:2739:2: ( rule__TransitionState__Alternatives_0_0_1 )
            // InternalArduinoML.g:2739:3: rule__TransitionState__Alternatives_0_0_1
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
    // InternalArduinoML.g:2747:1: rule__TransitionState__Group_0_0__2 : rule__TransitionState__Group_0_0__2__Impl rule__TransitionState__Group_0_0__3 ;
    public final void rule__TransitionState__Group_0_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2751:1: ( rule__TransitionState__Group_0_0__2__Impl rule__TransitionState__Group_0_0__3 )
            // InternalArduinoML.g:2752:2: rule__TransitionState__Group_0_0__2__Impl rule__TransitionState__Group_0_0__3
            {
            pushFollow(FOLLOW_32);
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
    // InternalArduinoML.g:2759:1: rule__TransitionState__Group_0_0__2__Impl : ( ( rule__TransitionState__Group_0_0_2__0 )* ) ;
    public final void rule__TransitionState__Group_0_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2763:1: ( ( ( rule__TransitionState__Group_0_0_2__0 )* ) )
            // InternalArduinoML.g:2764:1: ( ( rule__TransitionState__Group_0_0_2__0 )* )
            {
            // InternalArduinoML.g:2764:1: ( ( rule__TransitionState__Group_0_0_2__0 )* )
            // InternalArduinoML.g:2765:2: ( rule__TransitionState__Group_0_0_2__0 )*
            {
             before(grammarAccess.getTransitionStateAccess().getGroup_0_0_2()); 
            // InternalArduinoML.g:2766:2: ( rule__TransitionState__Group_0_0_2__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==43) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalArduinoML.g:2766:3: rule__TransitionState__Group_0_0_2__0
            	    {
            	    pushFollow(FOLLOW_33);
            	    rule__TransitionState__Group_0_0_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
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
    // InternalArduinoML.g:2774:1: rule__TransitionState__Group_0_0__3 : rule__TransitionState__Group_0_0__3__Impl ;
    public final void rule__TransitionState__Group_0_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2778:1: ( rule__TransitionState__Group_0_0__3__Impl )
            // InternalArduinoML.g:2779:2: rule__TransitionState__Group_0_0__3__Impl
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
    // InternalArduinoML.g:2785:1: rule__TransitionState__Group_0_0__3__Impl : ( ( rule__TransitionState__Group_0_0_3__0 )? ) ;
    public final void rule__TransitionState__Group_0_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2789:1: ( ( ( rule__TransitionState__Group_0_0_3__0 )? ) )
            // InternalArduinoML.g:2790:1: ( ( rule__TransitionState__Group_0_0_3__0 )? )
            {
            // InternalArduinoML.g:2790:1: ( ( rule__TransitionState__Group_0_0_3__0 )? )
            // InternalArduinoML.g:2791:2: ( rule__TransitionState__Group_0_0_3__0 )?
            {
             before(grammarAccess.getTransitionStateAccess().getGroup_0_0_3()); 
            // InternalArduinoML.g:2792:2: ( rule__TransitionState__Group_0_0_3__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==44) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalArduinoML.g:2792:3: rule__TransitionState__Group_0_0_3__0
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
    // InternalArduinoML.g:2801:1: rule__TransitionState__Group_0_0_1_0__0 : rule__TransitionState__Group_0_0_1_0__0__Impl rule__TransitionState__Group_0_0_1_0__1 ;
    public final void rule__TransitionState__Group_0_0_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2805:1: ( rule__TransitionState__Group_0_0_1_0__0__Impl rule__TransitionState__Group_0_0_1_0__1 )
            // InternalArduinoML.g:2806:2: rule__TransitionState__Group_0_0_1_0__0__Impl rule__TransitionState__Group_0_0_1_0__1
            {
            pushFollow(FOLLOW_34);
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
    // InternalArduinoML.g:2813:1: rule__TransitionState__Group_0_0_1_0__0__Impl : ( ( rule__TransitionState__DigitalsAssignment_0_0_1_0_0 ) ) ;
    public final void rule__TransitionState__Group_0_0_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2817:1: ( ( ( rule__TransitionState__DigitalsAssignment_0_0_1_0_0 ) ) )
            // InternalArduinoML.g:2818:1: ( ( rule__TransitionState__DigitalsAssignment_0_0_1_0_0 ) )
            {
            // InternalArduinoML.g:2818:1: ( ( rule__TransitionState__DigitalsAssignment_0_0_1_0_0 ) )
            // InternalArduinoML.g:2819:2: ( rule__TransitionState__DigitalsAssignment_0_0_1_0_0 )
            {
             before(grammarAccess.getTransitionStateAccess().getDigitalsAssignment_0_0_1_0_0()); 
            // InternalArduinoML.g:2820:2: ( rule__TransitionState__DigitalsAssignment_0_0_1_0_0 )
            // InternalArduinoML.g:2820:3: rule__TransitionState__DigitalsAssignment_0_0_1_0_0
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
    // InternalArduinoML.g:2828:1: rule__TransitionState__Group_0_0_1_0__1 : rule__TransitionState__Group_0_0_1_0__1__Impl rule__TransitionState__Group_0_0_1_0__2 ;
    public final void rule__TransitionState__Group_0_0_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2832:1: ( rule__TransitionState__Group_0_0_1_0__1__Impl rule__TransitionState__Group_0_0_1_0__2 )
            // InternalArduinoML.g:2833:2: rule__TransitionState__Group_0_0_1_0__1__Impl rule__TransitionState__Group_0_0_1_0__2
            {
            pushFollow(FOLLOW_30);
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
    // InternalArduinoML.g:2840:1: rule__TransitionState__Group_0_0_1_0__1__Impl : ( 'is' ) ;
    public final void rule__TransitionState__Group_0_0_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2844:1: ( ( 'is' ) )
            // InternalArduinoML.g:2845:1: ( 'is' )
            {
            // InternalArduinoML.g:2845:1: ( 'is' )
            // InternalArduinoML.g:2846:2: 'is'
            {
             before(grammarAccess.getTransitionStateAccess().getIsKeyword_0_0_1_0_1()); 
            match(input,42,FOLLOW_2); 
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
    // InternalArduinoML.g:2855:1: rule__TransitionState__Group_0_0_1_0__2 : rule__TransitionState__Group_0_0_1_0__2__Impl ;
    public final void rule__TransitionState__Group_0_0_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2859:1: ( rule__TransitionState__Group_0_0_1_0__2__Impl )
            // InternalArduinoML.g:2860:2: rule__TransitionState__Group_0_0_1_0__2__Impl
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
    // InternalArduinoML.g:2866:1: rule__TransitionState__Group_0_0_1_0__2__Impl : ( ( rule__TransitionState__D_valuesAssignment_0_0_1_0_2 ) ) ;
    public final void rule__TransitionState__Group_0_0_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2870:1: ( ( ( rule__TransitionState__D_valuesAssignment_0_0_1_0_2 ) ) )
            // InternalArduinoML.g:2871:1: ( ( rule__TransitionState__D_valuesAssignment_0_0_1_0_2 ) )
            {
            // InternalArduinoML.g:2871:1: ( ( rule__TransitionState__D_valuesAssignment_0_0_1_0_2 ) )
            // InternalArduinoML.g:2872:2: ( rule__TransitionState__D_valuesAssignment_0_0_1_0_2 )
            {
             before(grammarAccess.getTransitionStateAccess().getD_valuesAssignment_0_0_1_0_2()); 
            // InternalArduinoML.g:2873:2: ( rule__TransitionState__D_valuesAssignment_0_0_1_0_2 )
            // InternalArduinoML.g:2873:3: rule__TransitionState__D_valuesAssignment_0_0_1_0_2
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
    // InternalArduinoML.g:2882:1: rule__TransitionState__Group_0_0_1_1__0 : rule__TransitionState__Group_0_0_1_1__0__Impl rule__TransitionState__Group_0_0_1_1__1 ;
    public final void rule__TransitionState__Group_0_0_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2886:1: ( rule__TransitionState__Group_0_0_1_1__0__Impl rule__TransitionState__Group_0_0_1_1__1 )
            // InternalArduinoML.g:2887:2: rule__TransitionState__Group_0_0_1_1__0__Impl rule__TransitionState__Group_0_0_1_1__1
            {
            pushFollow(FOLLOW_35);
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
    // InternalArduinoML.g:2894:1: rule__TransitionState__Group_0_0_1_1__0__Impl : ( ( rule__TransitionState__AnalogsAssignment_0_0_1_1_0 ) ) ;
    public final void rule__TransitionState__Group_0_0_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2898:1: ( ( ( rule__TransitionState__AnalogsAssignment_0_0_1_1_0 ) ) )
            // InternalArduinoML.g:2899:1: ( ( rule__TransitionState__AnalogsAssignment_0_0_1_1_0 ) )
            {
            // InternalArduinoML.g:2899:1: ( ( rule__TransitionState__AnalogsAssignment_0_0_1_1_0 ) )
            // InternalArduinoML.g:2900:2: ( rule__TransitionState__AnalogsAssignment_0_0_1_1_0 )
            {
             before(grammarAccess.getTransitionStateAccess().getAnalogsAssignment_0_0_1_1_0()); 
            // InternalArduinoML.g:2901:2: ( rule__TransitionState__AnalogsAssignment_0_0_1_1_0 )
            // InternalArduinoML.g:2901:3: rule__TransitionState__AnalogsAssignment_0_0_1_1_0
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
    // InternalArduinoML.g:2909:1: rule__TransitionState__Group_0_0_1_1__1 : rule__TransitionState__Group_0_0_1_1__1__Impl rule__TransitionState__Group_0_0_1_1__2 ;
    public final void rule__TransitionState__Group_0_0_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2913:1: ( rule__TransitionState__Group_0_0_1_1__1__Impl rule__TransitionState__Group_0_0_1_1__2 )
            // InternalArduinoML.g:2914:2: rule__TransitionState__Group_0_0_1_1__1__Impl rule__TransitionState__Group_0_0_1_1__2
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
    // InternalArduinoML.g:2921:1: rule__TransitionState__Group_0_0_1_1__1__Impl : ( ( rule__TransitionState__CompAssignment_0_0_1_1_1 ) ) ;
    public final void rule__TransitionState__Group_0_0_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2925:1: ( ( ( rule__TransitionState__CompAssignment_0_0_1_1_1 ) ) )
            // InternalArduinoML.g:2926:1: ( ( rule__TransitionState__CompAssignment_0_0_1_1_1 ) )
            {
            // InternalArduinoML.g:2926:1: ( ( rule__TransitionState__CompAssignment_0_0_1_1_1 ) )
            // InternalArduinoML.g:2927:2: ( rule__TransitionState__CompAssignment_0_0_1_1_1 )
            {
             before(grammarAccess.getTransitionStateAccess().getCompAssignment_0_0_1_1_1()); 
            // InternalArduinoML.g:2928:2: ( rule__TransitionState__CompAssignment_0_0_1_1_1 )
            // InternalArduinoML.g:2928:3: rule__TransitionState__CompAssignment_0_0_1_1_1
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
    // InternalArduinoML.g:2936:1: rule__TransitionState__Group_0_0_1_1__2 : rule__TransitionState__Group_0_0_1_1__2__Impl ;
    public final void rule__TransitionState__Group_0_0_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2940:1: ( rule__TransitionState__Group_0_0_1_1__2__Impl )
            // InternalArduinoML.g:2941:2: rule__TransitionState__Group_0_0_1_1__2__Impl
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
    // InternalArduinoML.g:2947:1: rule__TransitionState__Group_0_0_1_1__2__Impl : ( ( rule__TransitionState__A_valuesAssignment_0_0_1_1_2 ) ) ;
    public final void rule__TransitionState__Group_0_0_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2951:1: ( ( ( rule__TransitionState__A_valuesAssignment_0_0_1_1_2 ) ) )
            // InternalArduinoML.g:2952:1: ( ( rule__TransitionState__A_valuesAssignment_0_0_1_1_2 ) )
            {
            // InternalArduinoML.g:2952:1: ( ( rule__TransitionState__A_valuesAssignment_0_0_1_1_2 ) )
            // InternalArduinoML.g:2953:2: ( rule__TransitionState__A_valuesAssignment_0_0_1_1_2 )
            {
             before(grammarAccess.getTransitionStateAccess().getA_valuesAssignment_0_0_1_1_2()); 
            // InternalArduinoML.g:2954:2: ( rule__TransitionState__A_valuesAssignment_0_0_1_1_2 )
            // InternalArduinoML.g:2954:3: rule__TransitionState__A_valuesAssignment_0_0_1_1_2
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
    // InternalArduinoML.g:2963:1: rule__TransitionState__Group_0_0_2__0 : rule__TransitionState__Group_0_0_2__0__Impl rule__TransitionState__Group_0_0_2__1 ;
    public final void rule__TransitionState__Group_0_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2967:1: ( rule__TransitionState__Group_0_0_2__0__Impl rule__TransitionState__Group_0_0_2__1 )
            // InternalArduinoML.g:2968:2: rule__TransitionState__Group_0_0_2__0__Impl rule__TransitionState__Group_0_0_2__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalArduinoML.g:2975:1: rule__TransitionState__Group_0_0_2__0__Impl : ( 'and' ) ;
    public final void rule__TransitionState__Group_0_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2979:1: ( ( 'and' ) )
            // InternalArduinoML.g:2980:1: ( 'and' )
            {
            // InternalArduinoML.g:2980:1: ( 'and' )
            // InternalArduinoML.g:2981:2: 'and'
            {
             before(grammarAccess.getTransitionStateAccess().getAndKeyword_0_0_2_0()); 
            match(input,43,FOLLOW_2); 
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
    // InternalArduinoML.g:2990:1: rule__TransitionState__Group_0_0_2__1 : rule__TransitionState__Group_0_0_2__1__Impl ;
    public final void rule__TransitionState__Group_0_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:2994:1: ( rule__TransitionState__Group_0_0_2__1__Impl )
            // InternalArduinoML.g:2995:2: rule__TransitionState__Group_0_0_2__1__Impl
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
    // InternalArduinoML.g:3001:1: rule__TransitionState__Group_0_0_2__1__Impl : ( ( rule__TransitionState__Alternatives_0_0_2_1 ) ) ;
    public final void rule__TransitionState__Group_0_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3005:1: ( ( ( rule__TransitionState__Alternatives_0_0_2_1 ) ) )
            // InternalArduinoML.g:3006:1: ( ( rule__TransitionState__Alternatives_0_0_2_1 ) )
            {
            // InternalArduinoML.g:3006:1: ( ( rule__TransitionState__Alternatives_0_0_2_1 ) )
            // InternalArduinoML.g:3007:2: ( rule__TransitionState__Alternatives_0_0_2_1 )
            {
             before(grammarAccess.getTransitionStateAccess().getAlternatives_0_0_2_1()); 
            // InternalArduinoML.g:3008:2: ( rule__TransitionState__Alternatives_0_0_2_1 )
            // InternalArduinoML.g:3008:3: rule__TransitionState__Alternatives_0_0_2_1
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
    // InternalArduinoML.g:3017:1: rule__TransitionState__Group_0_0_2_1_0__0 : rule__TransitionState__Group_0_0_2_1_0__0__Impl rule__TransitionState__Group_0_0_2_1_0__1 ;
    public final void rule__TransitionState__Group_0_0_2_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3021:1: ( rule__TransitionState__Group_0_0_2_1_0__0__Impl rule__TransitionState__Group_0_0_2_1_0__1 )
            // InternalArduinoML.g:3022:2: rule__TransitionState__Group_0_0_2_1_0__0__Impl rule__TransitionState__Group_0_0_2_1_0__1
            {
            pushFollow(FOLLOW_34);
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
    // InternalArduinoML.g:3029:1: rule__TransitionState__Group_0_0_2_1_0__0__Impl : ( ( rule__TransitionState__DigitalsAssignment_0_0_2_1_0_0 ) ) ;
    public final void rule__TransitionState__Group_0_0_2_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3033:1: ( ( ( rule__TransitionState__DigitalsAssignment_0_0_2_1_0_0 ) ) )
            // InternalArduinoML.g:3034:1: ( ( rule__TransitionState__DigitalsAssignment_0_0_2_1_0_0 ) )
            {
            // InternalArduinoML.g:3034:1: ( ( rule__TransitionState__DigitalsAssignment_0_0_2_1_0_0 ) )
            // InternalArduinoML.g:3035:2: ( rule__TransitionState__DigitalsAssignment_0_0_2_1_0_0 )
            {
             before(grammarAccess.getTransitionStateAccess().getDigitalsAssignment_0_0_2_1_0_0()); 
            // InternalArduinoML.g:3036:2: ( rule__TransitionState__DigitalsAssignment_0_0_2_1_0_0 )
            // InternalArduinoML.g:3036:3: rule__TransitionState__DigitalsAssignment_0_0_2_1_0_0
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
    // InternalArduinoML.g:3044:1: rule__TransitionState__Group_0_0_2_1_0__1 : rule__TransitionState__Group_0_0_2_1_0__1__Impl rule__TransitionState__Group_0_0_2_1_0__2 ;
    public final void rule__TransitionState__Group_0_0_2_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3048:1: ( rule__TransitionState__Group_0_0_2_1_0__1__Impl rule__TransitionState__Group_0_0_2_1_0__2 )
            // InternalArduinoML.g:3049:2: rule__TransitionState__Group_0_0_2_1_0__1__Impl rule__TransitionState__Group_0_0_2_1_0__2
            {
            pushFollow(FOLLOW_30);
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
    // InternalArduinoML.g:3056:1: rule__TransitionState__Group_0_0_2_1_0__1__Impl : ( 'is' ) ;
    public final void rule__TransitionState__Group_0_0_2_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3060:1: ( ( 'is' ) )
            // InternalArduinoML.g:3061:1: ( 'is' )
            {
            // InternalArduinoML.g:3061:1: ( 'is' )
            // InternalArduinoML.g:3062:2: 'is'
            {
             before(grammarAccess.getTransitionStateAccess().getIsKeyword_0_0_2_1_0_1()); 
            match(input,42,FOLLOW_2); 
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
    // InternalArduinoML.g:3071:1: rule__TransitionState__Group_0_0_2_1_0__2 : rule__TransitionState__Group_0_0_2_1_0__2__Impl ;
    public final void rule__TransitionState__Group_0_0_2_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3075:1: ( rule__TransitionState__Group_0_0_2_1_0__2__Impl )
            // InternalArduinoML.g:3076:2: rule__TransitionState__Group_0_0_2_1_0__2__Impl
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
    // InternalArduinoML.g:3082:1: rule__TransitionState__Group_0_0_2_1_0__2__Impl : ( ( rule__TransitionState__D_valuesAssignment_0_0_2_1_0_2 ) ) ;
    public final void rule__TransitionState__Group_0_0_2_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3086:1: ( ( ( rule__TransitionState__D_valuesAssignment_0_0_2_1_0_2 ) ) )
            // InternalArduinoML.g:3087:1: ( ( rule__TransitionState__D_valuesAssignment_0_0_2_1_0_2 ) )
            {
            // InternalArduinoML.g:3087:1: ( ( rule__TransitionState__D_valuesAssignment_0_0_2_1_0_2 ) )
            // InternalArduinoML.g:3088:2: ( rule__TransitionState__D_valuesAssignment_0_0_2_1_0_2 )
            {
             before(grammarAccess.getTransitionStateAccess().getD_valuesAssignment_0_0_2_1_0_2()); 
            // InternalArduinoML.g:3089:2: ( rule__TransitionState__D_valuesAssignment_0_0_2_1_0_2 )
            // InternalArduinoML.g:3089:3: rule__TransitionState__D_valuesAssignment_0_0_2_1_0_2
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
    // InternalArduinoML.g:3098:1: rule__TransitionState__Group_0_0_2_1_1__0 : rule__TransitionState__Group_0_0_2_1_1__0__Impl rule__TransitionState__Group_0_0_2_1_1__1 ;
    public final void rule__TransitionState__Group_0_0_2_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3102:1: ( rule__TransitionState__Group_0_0_2_1_1__0__Impl rule__TransitionState__Group_0_0_2_1_1__1 )
            // InternalArduinoML.g:3103:2: rule__TransitionState__Group_0_0_2_1_1__0__Impl rule__TransitionState__Group_0_0_2_1_1__1
            {
            pushFollow(FOLLOW_35);
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
    // InternalArduinoML.g:3110:1: rule__TransitionState__Group_0_0_2_1_1__0__Impl : ( ( rule__TransitionState__AnalogsAssignment_0_0_2_1_1_0 ) ) ;
    public final void rule__TransitionState__Group_0_0_2_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3114:1: ( ( ( rule__TransitionState__AnalogsAssignment_0_0_2_1_1_0 ) ) )
            // InternalArduinoML.g:3115:1: ( ( rule__TransitionState__AnalogsAssignment_0_0_2_1_1_0 ) )
            {
            // InternalArduinoML.g:3115:1: ( ( rule__TransitionState__AnalogsAssignment_0_0_2_1_1_0 ) )
            // InternalArduinoML.g:3116:2: ( rule__TransitionState__AnalogsAssignment_0_0_2_1_1_0 )
            {
             before(grammarAccess.getTransitionStateAccess().getAnalogsAssignment_0_0_2_1_1_0()); 
            // InternalArduinoML.g:3117:2: ( rule__TransitionState__AnalogsAssignment_0_0_2_1_1_0 )
            // InternalArduinoML.g:3117:3: rule__TransitionState__AnalogsAssignment_0_0_2_1_1_0
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
    // InternalArduinoML.g:3125:1: rule__TransitionState__Group_0_0_2_1_1__1 : rule__TransitionState__Group_0_0_2_1_1__1__Impl rule__TransitionState__Group_0_0_2_1_1__2 ;
    public final void rule__TransitionState__Group_0_0_2_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3129:1: ( rule__TransitionState__Group_0_0_2_1_1__1__Impl rule__TransitionState__Group_0_0_2_1_1__2 )
            // InternalArduinoML.g:3130:2: rule__TransitionState__Group_0_0_2_1_1__1__Impl rule__TransitionState__Group_0_0_2_1_1__2
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
    // InternalArduinoML.g:3137:1: rule__TransitionState__Group_0_0_2_1_1__1__Impl : ( ( rule__TransitionState__CompAssignment_0_0_2_1_1_1 ) ) ;
    public final void rule__TransitionState__Group_0_0_2_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3141:1: ( ( ( rule__TransitionState__CompAssignment_0_0_2_1_1_1 ) ) )
            // InternalArduinoML.g:3142:1: ( ( rule__TransitionState__CompAssignment_0_0_2_1_1_1 ) )
            {
            // InternalArduinoML.g:3142:1: ( ( rule__TransitionState__CompAssignment_0_0_2_1_1_1 ) )
            // InternalArduinoML.g:3143:2: ( rule__TransitionState__CompAssignment_0_0_2_1_1_1 )
            {
             before(grammarAccess.getTransitionStateAccess().getCompAssignment_0_0_2_1_1_1()); 
            // InternalArduinoML.g:3144:2: ( rule__TransitionState__CompAssignment_0_0_2_1_1_1 )
            // InternalArduinoML.g:3144:3: rule__TransitionState__CompAssignment_0_0_2_1_1_1
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
    // InternalArduinoML.g:3152:1: rule__TransitionState__Group_0_0_2_1_1__2 : rule__TransitionState__Group_0_0_2_1_1__2__Impl ;
    public final void rule__TransitionState__Group_0_0_2_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3156:1: ( rule__TransitionState__Group_0_0_2_1_1__2__Impl )
            // InternalArduinoML.g:3157:2: rule__TransitionState__Group_0_0_2_1_1__2__Impl
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
    // InternalArduinoML.g:3163:1: rule__TransitionState__Group_0_0_2_1_1__2__Impl : ( ( rule__TransitionState__A_valuesAssignment_0_0_2_1_1_2 ) ) ;
    public final void rule__TransitionState__Group_0_0_2_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3167:1: ( ( ( rule__TransitionState__A_valuesAssignment_0_0_2_1_1_2 ) ) )
            // InternalArduinoML.g:3168:1: ( ( rule__TransitionState__A_valuesAssignment_0_0_2_1_1_2 ) )
            {
            // InternalArduinoML.g:3168:1: ( ( rule__TransitionState__A_valuesAssignment_0_0_2_1_1_2 ) )
            // InternalArduinoML.g:3169:2: ( rule__TransitionState__A_valuesAssignment_0_0_2_1_1_2 )
            {
             before(grammarAccess.getTransitionStateAccess().getA_valuesAssignment_0_0_2_1_1_2()); 
            // InternalArduinoML.g:3170:2: ( rule__TransitionState__A_valuesAssignment_0_0_2_1_1_2 )
            // InternalArduinoML.g:3170:3: rule__TransitionState__A_valuesAssignment_0_0_2_1_1_2
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
    // InternalArduinoML.g:3179:1: rule__TransitionState__Group_0_0_3__0 : rule__TransitionState__Group_0_0_3__0__Impl rule__TransitionState__Group_0_0_3__1 ;
    public final void rule__TransitionState__Group_0_0_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3183:1: ( rule__TransitionState__Group_0_0_3__0__Impl rule__TransitionState__Group_0_0_3__1 )
            // InternalArduinoML.g:3184:2: rule__TransitionState__Group_0_0_3__0__Impl rule__TransitionState__Group_0_0_3__1
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
    // InternalArduinoML.g:3191:1: rule__TransitionState__Group_0_0_3__0__Impl : ( 'wait' ) ;
    public final void rule__TransitionState__Group_0_0_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3195:1: ( ( 'wait' ) )
            // InternalArduinoML.g:3196:1: ( 'wait' )
            {
            // InternalArduinoML.g:3196:1: ( 'wait' )
            // InternalArduinoML.g:3197:2: 'wait'
            {
             before(grammarAccess.getTransitionStateAccess().getWaitKeyword_0_0_3_0()); 
            match(input,44,FOLLOW_2); 
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
    // InternalArduinoML.g:3206:1: rule__TransitionState__Group_0_0_3__1 : rule__TransitionState__Group_0_0_3__1__Impl rule__TransitionState__Group_0_0_3__2 ;
    public final void rule__TransitionState__Group_0_0_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3210:1: ( rule__TransitionState__Group_0_0_3__1__Impl rule__TransitionState__Group_0_0_3__2 )
            // InternalArduinoML.g:3211:2: rule__TransitionState__Group_0_0_3__1__Impl rule__TransitionState__Group_0_0_3__2
            {
            pushFollow(FOLLOW_36);
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
    // InternalArduinoML.g:3218:1: rule__TransitionState__Group_0_0_3__1__Impl : ( ( rule__TransitionState__TimeAssignment_0_0_3_1 ) ) ;
    public final void rule__TransitionState__Group_0_0_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3222:1: ( ( ( rule__TransitionState__TimeAssignment_0_0_3_1 ) ) )
            // InternalArduinoML.g:3223:1: ( ( rule__TransitionState__TimeAssignment_0_0_3_1 ) )
            {
            // InternalArduinoML.g:3223:1: ( ( rule__TransitionState__TimeAssignment_0_0_3_1 ) )
            // InternalArduinoML.g:3224:2: ( rule__TransitionState__TimeAssignment_0_0_3_1 )
            {
             before(grammarAccess.getTransitionStateAccess().getTimeAssignment_0_0_3_1()); 
            // InternalArduinoML.g:3225:2: ( rule__TransitionState__TimeAssignment_0_0_3_1 )
            // InternalArduinoML.g:3225:3: rule__TransitionState__TimeAssignment_0_0_3_1
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
    // InternalArduinoML.g:3233:1: rule__TransitionState__Group_0_0_3__2 : rule__TransitionState__Group_0_0_3__2__Impl rule__TransitionState__Group_0_0_3__3 ;
    public final void rule__TransitionState__Group_0_0_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3237:1: ( rule__TransitionState__Group_0_0_3__2__Impl rule__TransitionState__Group_0_0_3__3 )
            // InternalArduinoML.g:3238:2: rule__TransitionState__Group_0_0_3__2__Impl rule__TransitionState__Group_0_0_3__3
            {
            pushFollow(FOLLOW_37);
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
    // InternalArduinoML.g:3245:1: rule__TransitionState__Group_0_0_3__2__Impl : ( ( rule__TransitionState__UnitAssignment_0_0_3_2 ) ) ;
    public final void rule__TransitionState__Group_0_0_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3249:1: ( ( ( rule__TransitionState__UnitAssignment_0_0_3_2 ) ) )
            // InternalArduinoML.g:3250:1: ( ( rule__TransitionState__UnitAssignment_0_0_3_2 ) )
            {
            // InternalArduinoML.g:3250:1: ( ( rule__TransitionState__UnitAssignment_0_0_3_2 ) )
            // InternalArduinoML.g:3251:2: ( rule__TransitionState__UnitAssignment_0_0_3_2 )
            {
             before(grammarAccess.getTransitionStateAccess().getUnitAssignment_0_0_3_2()); 
            // InternalArduinoML.g:3252:2: ( rule__TransitionState__UnitAssignment_0_0_3_2 )
            // InternalArduinoML.g:3252:3: rule__TransitionState__UnitAssignment_0_0_3_2
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
    // InternalArduinoML.g:3260:1: rule__TransitionState__Group_0_0_3__3 : rule__TransitionState__Group_0_0_3__3__Impl ;
    public final void rule__TransitionState__Group_0_0_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3264:1: ( rule__TransitionState__Group_0_0_3__3__Impl )
            // InternalArduinoML.g:3265:2: rule__TransitionState__Group_0_0_3__3__Impl
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
    // InternalArduinoML.g:3271:1: rule__TransitionState__Group_0_0_3__3__Impl : ( 'then' ) ;
    public final void rule__TransitionState__Group_0_0_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3275:1: ( ( 'then' ) )
            // InternalArduinoML.g:3276:1: ( 'then' )
            {
            // InternalArduinoML.g:3276:1: ( 'then' )
            // InternalArduinoML.g:3277:2: 'then'
            {
             before(grammarAccess.getTransitionStateAccess().getThenKeyword_0_0_3_3()); 
            match(input,45,FOLLOW_2); 
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
    // InternalArduinoML.g:3287:1: rule__TransitionState__Group_0_1__0 : rule__TransitionState__Group_0_1__0__Impl rule__TransitionState__Group_0_1__1 ;
    public final void rule__TransitionState__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3291:1: ( rule__TransitionState__Group_0_1__0__Impl rule__TransitionState__Group_0_1__1 )
            // InternalArduinoML.g:3292:2: rule__TransitionState__Group_0_1__0__Impl rule__TransitionState__Group_0_1__1
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
    // InternalArduinoML.g:3299:1: rule__TransitionState__Group_0_1__0__Impl : ( 'wait' ) ;
    public final void rule__TransitionState__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3303:1: ( ( 'wait' ) )
            // InternalArduinoML.g:3304:1: ( 'wait' )
            {
            // InternalArduinoML.g:3304:1: ( 'wait' )
            // InternalArduinoML.g:3305:2: 'wait'
            {
             before(grammarAccess.getTransitionStateAccess().getWaitKeyword_0_1_0()); 
            match(input,44,FOLLOW_2); 
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
    // InternalArduinoML.g:3314:1: rule__TransitionState__Group_0_1__1 : rule__TransitionState__Group_0_1__1__Impl rule__TransitionState__Group_0_1__2 ;
    public final void rule__TransitionState__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3318:1: ( rule__TransitionState__Group_0_1__1__Impl rule__TransitionState__Group_0_1__2 )
            // InternalArduinoML.g:3319:2: rule__TransitionState__Group_0_1__1__Impl rule__TransitionState__Group_0_1__2
            {
            pushFollow(FOLLOW_36);
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
    // InternalArduinoML.g:3326:1: rule__TransitionState__Group_0_1__1__Impl : ( ( rule__TransitionState__TimeAssignment_0_1_1 ) ) ;
    public final void rule__TransitionState__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3330:1: ( ( ( rule__TransitionState__TimeAssignment_0_1_1 ) ) )
            // InternalArduinoML.g:3331:1: ( ( rule__TransitionState__TimeAssignment_0_1_1 ) )
            {
            // InternalArduinoML.g:3331:1: ( ( rule__TransitionState__TimeAssignment_0_1_1 ) )
            // InternalArduinoML.g:3332:2: ( rule__TransitionState__TimeAssignment_0_1_1 )
            {
             before(grammarAccess.getTransitionStateAccess().getTimeAssignment_0_1_1()); 
            // InternalArduinoML.g:3333:2: ( rule__TransitionState__TimeAssignment_0_1_1 )
            // InternalArduinoML.g:3333:3: rule__TransitionState__TimeAssignment_0_1_1
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
    // InternalArduinoML.g:3341:1: rule__TransitionState__Group_0_1__2 : rule__TransitionState__Group_0_1__2__Impl rule__TransitionState__Group_0_1__3 ;
    public final void rule__TransitionState__Group_0_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3345:1: ( rule__TransitionState__Group_0_1__2__Impl rule__TransitionState__Group_0_1__3 )
            // InternalArduinoML.g:3346:2: rule__TransitionState__Group_0_1__2__Impl rule__TransitionState__Group_0_1__3
            {
            pushFollow(FOLLOW_37);
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
    // InternalArduinoML.g:3353:1: rule__TransitionState__Group_0_1__2__Impl : ( ( rule__TransitionState__UnitAssignment_0_1_2 ) ) ;
    public final void rule__TransitionState__Group_0_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3357:1: ( ( ( rule__TransitionState__UnitAssignment_0_1_2 ) ) )
            // InternalArduinoML.g:3358:1: ( ( rule__TransitionState__UnitAssignment_0_1_2 ) )
            {
            // InternalArduinoML.g:3358:1: ( ( rule__TransitionState__UnitAssignment_0_1_2 ) )
            // InternalArduinoML.g:3359:2: ( rule__TransitionState__UnitAssignment_0_1_2 )
            {
             before(grammarAccess.getTransitionStateAccess().getUnitAssignment_0_1_2()); 
            // InternalArduinoML.g:3360:2: ( rule__TransitionState__UnitAssignment_0_1_2 )
            // InternalArduinoML.g:3360:3: rule__TransitionState__UnitAssignment_0_1_2
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
    // InternalArduinoML.g:3368:1: rule__TransitionState__Group_0_1__3 : rule__TransitionState__Group_0_1__3__Impl ;
    public final void rule__TransitionState__Group_0_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3372:1: ( rule__TransitionState__Group_0_1__3__Impl )
            // InternalArduinoML.g:3373:2: rule__TransitionState__Group_0_1__3__Impl
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
    // InternalArduinoML.g:3379:1: rule__TransitionState__Group_0_1__3__Impl : ( 'then' ) ;
    public final void rule__TransitionState__Group_0_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3383:1: ( ( 'then' ) )
            // InternalArduinoML.g:3384:1: ( 'then' )
            {
            // InternalArduinoML.g:3384:1: ( 'then' )
            // InternalArduinoML.g:3385:2: 'then'
            {
             before(grammarAccess.getTransitionStateAccess().getThenKeyword_0_1_3()); 
            match(input,45,FOLLOW_2); 
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
    // InternalArduinoML.g:3395:1: rule__TransitionMode__Group__0 : rule__TransitionMode__Group__0__Impl rule__TransitionMode__Group__1 ;
    public final void rule__TransitionMode__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3399:1: ( rule__TransitionMode__Group__0__Impl rule__TransitionMode__Group__1 )
            // InternalArduinoML.g:3400:2: rule__TransitionMode__Group__0__Impl rule__TransitionMode__Group__1
            {
            pushFollow(FOLLOW_31);
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
    // InternalArduinoML.g:3407:1: rule__TransitionMode__Group__0__Impl : ( ( rule__TransitionMode__Alternatives_0 ) ) ;
    public final void rule__TransitionMode__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3411:1: ( ( ( rule__TransitionMode__Alternatives_0 ) ) )
            // InternalArduinoML.g:3412:1: ( ( rule__TransitionMode__Alternatives_0 ) )
            {
            // InternalArduinoML.g:3412:1: ( ( rule__TransitionMode__Alternatives_0 ) )
            // InternalArduinoML.g:3413:2: ( rule__TransitionMode__Alternatives_0 )
            {
             before(grammarAccess.getTransitionModeAccess().getAlternatives_0()); 
            // InternalArduinoML.g:3414:2: ( rule__TransitionMode__Alternatives_0 )
            // InternalArduinoML.g:3414:3: rule__TransitionMode__Alternatives_0
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
    // InternalArduinoML.g:3422:1: rule__TransitionMode__Group__1 : rule__TransitionMode__Group__1__Impl rule__TransitionMode__Group__2 ;
    public final void rule__TransitionMode__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3426:1: ( rule__TransitionMode__Group__1__Impl rule__TransitionMode__Group__2 )
            // InternalArduinoML.g:3427:2: rule__TransitionMode__Group__1__Impl rule__TransitionMode__Group__2
            {
            pushFollow(FOLLOW_29);
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
    // InternalArduinoML.g:3434:1: rule__TransitionMode__Group__1__Impl : ( 'go' ) ;
    public final void rule__TransitionMode__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3438:1: ( ( 'go' ) )
            // InternalArduinoML.g:3439:1: ( 'go' )
            {
            // InternalArduinoML.g:3439:1: ( 'go' )
            // InternalArduinoML.g:3440:2: 'go'
            {
             before(grammarAccess.getTransitionModeAccess().getGoKeyword_1()); 
            match(input,40,FOLLOW_2); 
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
    // InternalArduinoML.g:3449:1: rule__TransitionMode__Group__2 : rule__TransitionMode__Group__2__Impl rule__TransitionMode__Group__3 ;
    public final void rule__TransitionMode__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3453:1: ( rule__TransitionMode__Group__2__Impl rule__TransitionMode__Group__3 )
            // InternalArduinoML.g:3454:2: rule__TransitionMode__Group__2__Impl rule__TransitionMode__Group__3
            {
            pushFollow(FOLLOW_8);
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
    // InternalArduinoML.g:3461:1: rule__TransitionMode__Group__2__Impl : ( 'to' ) ;
    public final void rule__TransitionMode__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3465:1: ( ( 'to' ) )
            // InternalArduinoML.g:3466:1: ( 'to' )
            {
            // InternalArduinoML.g:3466:1: ( 'to' )
            // InternalArduinoML.g:3467:2: 'to'
            {
             before(grammarAccess.getTransitionModeAccess().getToKeyword_2()); 
            match(input,39,FOLLOW_2); 
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
    // InternalArduinoML.g:3476:1: rule__TransitionMode__Group__3 : rule__TransitionMode__Group__3__Impl rule__TransitionMode__Group__4 ;
    public final void rule__TransitionMode__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3480:1: ( rule__TransitionMode__Group__3__Impl rule__TransitionMode__Group__4 )
            // InternalArduinoML.g:3481:2: rule__TransitionMode__Group__3__Impl rule__TransitionMode__Group__4
            {
            pushFollow(FOLLOW_6);
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
    // InternalArduinoML.g:3488:1: rule__TransitionMode__Group__3__Impl : ( 'mode' ) ;
    public final void rule__TransitionMode__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3492:1: ( ( 'mode' ) )
            // InternalArduinoML.g:3493:1: ( 'mode' )
            {
            // InternalArduinoML.g:3493:1: ( 'mode' )
            // InternalArduinoML.g:3494:2: 'mode'
            {
             before(grammarAccess.getTransitionModeAccess().getModeKeyword_3()); 
            match(input,26,FOLLOW_2); 
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
    // InternalArduinoML.g:3503:1: rule__TransitionMode__Group__4 : rule__TransitionMode__Group__4__Impl ;
    public final void rule__TransitionMode__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3507:1: ( rule__TransitionMode__Group__4__Impl )
            // InternalArduinoML.g:3508:2: rule__TransitionMode__Group__4__Impl
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
    // InternalArduinoML.g:3514:1: rule__TransitionMode__Group__4__Impl : ( ( rule__TransitionMode__Next_modeAssignment_4 ) ) ;
    public final void rule__TransitionMode__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3518:1: ( ( ( rule__TransitionMode__Next_modeAssignment_4 ) ) )
            // InternalArduinoML.g:3519:1: ( ( rule__TransitionMode__Next_modeAssignment_4 ) )
            {
            // InternalArduinoML.g:3519:1: ( ( rule__TransitionMode__Next_modeAssignment_4 ) )
            // InternalArduinoML.g:3520:2: ( rule__TransitionMode__Next_modeAssignment_4 )
            {
             before(grammarAccess.getTransitionModeAccess().getNext_modeAssignment_4()); 
            // InternalArduinoML.g:3521:2: ( rule__TransitionMode__Next_modeAssignment_4 )
            // InternalArduinoML.g:3521:3: rule__TransitionMode__Next_modeAssignment_4
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
    // InternalArduinoML.g:3530:1: rule__TransitionMode__Group_0_0__0 : rule__TransitionMode__Group_0_0__0__Impl rule__TransitionMode__Group_0_0__1 ;
    public final void rule__TransitionMode__Group_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3534:1: ( rule__TransitionMode__Group_0_0__0__Impl rule__TransitionMode__Group_0_0__1 )
            // InternalArduinoML.g:3535:2: rule__TransitionMode__Group_0_0__0__Impl rule__TransitionMode__Group_0_0__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalArduinoML.g:3542:1: rule__TransitionMode__Group_0_0__0__Impl : ( 'when' ) ;
    public final void rule__TransitionMode__Group_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3546:1: ( ( 'when' ) )
            // InternalArduinoML.g:3547:1: ( 'when' )
            {
            // InternalArduinoML.g:3547:1: ( 'when' )
            // InternalArduinoML.g:3548:2: 'when'
            {
             before(grammarAccess.getTransitionModeAccess().getWhenKeyword_0_0_0()); 
            match(input,41,FOLLOW_2); 
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
    // InternalArduinoML.g:3557:1: rule__TransitionMode__Group_0_0__1 : rule__TransitionMode__Group_0_0__1__Impl rule__TransitionMode__Group_0_0__2 ;
    public final void rule__TransitionMode__Group_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3561:1: ( rule__TransitionMode__Group_0_0__1__Impl rule__TransitionMode__Group_0_0__2 )
            // InternalArduinoML.g:3562:2: rule__TransitionMode__Group_0_0__1__Impl rule__TransitionMode__Group_0_0__2
            {
            pushFollow(FOLLOW_32);
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
    // InternalArduinoML.g:3569:1: rule__TransitionMode__Group_0_0__1__Impl : ( ( rule__TransitionMode__Alternatives_0_0_1 ) ) ;
    public final void rule__TransitionMode__Group_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3573:1: ( ( ( rule__TransitionMode__Alternatives_0_0_1 ) ) )
            // InternalArduinoML.g:3574:1: ( ( rule__TransitionMode__Alternatives_0_0_1 ) )
            {
            // InternalArduinoML.g:3574:1: ( ( rule__TransitionMode__Alternatives_0_0_1 ) )
            // InternalArduinoML.g:3575:2: ( rule__TransitionMode__Alternatives_0_0_1 )
            {
             before(grammarAccess.getTransitionModeAccess().getAlternatives_0_0_1()); 
            // InternalArduinoML.g:3576:2: ( rule__TransitionMode__Alternatives_0_0_1 )
            // InternalArduinoML.g:3576:3: rule__TransitionMode__Alternatives_0_0_1
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
    // InternalArduinoML.g:3584:1: rule__TransitionMode__Group_0_0__2 : rule__TransitionMode__Group_0_0__2__Impl rule__TransitionMode__Group_0_0__3 ;
    public final void rule__TransitionMode__Group_0_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3588:1: ( rule__TransitionMode__Group_0_0__2__Impl rule__TransitionMode__Group_0_0__3 )
            // InternalArduinoML.g:3589:2: rule__TransitionMode__Group_0_0__2__Impl rule__TransitionMode__Group_0_0__3
            {
            pushFollow(FOLLOW_32);
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
    // InternalArduinoML.g:3596:1: rule__TransitionMode__Group_0_0__2__Impl : ( ( rule__TransitionMode__Group_0_0_2__0 )* ) ;
    public final void rule__TransitionMode__Group_0_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3600:1: ( ( ( rule__TransitionMode__Group_0_0_2__0 )* ) )
            // InternalArduinoML.g:3601:1: ( ( rule__TransitionMode__Group_0_0_2__0 )* )
            {
            // InternalArduinoML.g:3601:1: ( ( rule__TransitionMode__Group_0_0_2__0 )* )
            // InternalArduinoML.g:3602:2: ( rule__TransitionMode__Group_0_0_2__0 )*
            {
             before(grammarAccess.getTransitionModeAccess().getGroup_0_0_2()); 
            // InternalArduinoML.g:3603:2: ( rule__TransitionMode__Group_0_0_2__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==43) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalArduinoML.g:3603:3: rule__TransitionMode__Group_0_0_2__0
            	    {
            	    pushFollow(FOLLOW_33);
            	    rule__TransitionMode__Group_0_0_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
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
    // InternalArduinoML.g:3611:1: rule__TransitionMode__Group_0_0__3 : rule__TransitionMode__Group_0_0__3__Impl ;
    public final void rule__TransitionMode__Group_0_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3615:1: ( rule__TransitionMode__Group_0_0__3__Impl )
            // InternalArduinoML.g:3616:2: rule__TransitionMode__Group_0_0__3__Impl
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
    // InternalArduinoML.g:3622:1: rule__TransitionMode__Group_0_0__3__Impl : ( ( rule__TransitionMode__Group_0_0_3__0 )? ) ;
    public final void rule__TransitionMode__Group_0_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3626:1: ( ( ( rule__TransitionMode__Group_0_0_3__0 )? ) )
            // InternalArduinoML.g:3627:1: ( ( rule__TransitionMode__Group_0_0_3__0 )? )
            {
            // InternalArduinoML.g:3627:1: ( ( rule__TransitionMode__Group_0_0_3__0 )? )
            // InternalArduinoML.g:3628:2: ( rule__TransitionMode__Group_0_0_3__0 )?
            {
             before(grammarAccess.getTransitionModeAccess().getGroup_0_0_3()); 
            // InternalArduinoML.g:3629:2: ( rule__TransitionMode__Group_0_0_3__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==44) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalArduinoML.g:3629:3: rule__TransitionMode__Group_0_0_3__0
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
    // InternalArduinoML.g:3638:1: rule__TransitionMode__Group_0_0_1_0__0 : rule__TransitionMode__Group_0_0_1_0__0__Impl rule__TransitionMode__Group_0_0_1_0__1 ;
    public final void rule__TransitionMode__Group_0_0_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3642:1: ( rule__TransitionMode__Group_0_0_1_0__0__Impl rule__TransitionMode__Group_0_0_1_0__1 )
            // InternalArduinoML.g:3643:2: rule__TransitionMode__Group_0_0_1_0__0__Impl rule__TransitionMode__Group_0_0_1_0__1
            {
            pushFollow(FOLLOW_34);
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
    // InternalArduinoML.g:3650:1: rule__TransitionMode__Group_0_0_1_0__0__Impl : ( ( rule__TransitionMode__DigitalsAssignment_0_0_1_0_0 ) ) ;
    public final void rule__TransitionMode__Group_0_0_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3654:1: ( ( ( rule__TransitionMode__DigitalsAssignment_0_0_1_0_0 ) ) )
            // InternalArduinoML.g:3655:1: ( ( rule__TransitionMode__DigitalsAssignment_0_0_1_0_0 ) )
            {
            // InternalArduinoML.g:3655:1: ( ( rule__TransitionMode__DigitalsAssignment_0_0_1_0_0 ) )
            // InternalArduinoML.g:3656:2: ( rule__TransitionMode__DigitalsAssignment_0_0_1_0_0 )
            {
             before(grammarAccess.getTransitionModeAccess().getDigitalsAssignment_0_0_1_0_0()); 
            // InternalArduinoML.g:3657:2: ( rule__TransitionMode__DigitalsAssignment_0_0_1_0_0 )
            // InternalArduinoML.g:3657:3: rule__TransitionMode__DigitalsAssignment_0_0_1_0_0
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
    // InternalArduinoML.g:3665:1: rule__TransitionMode__Group_0_0_1_0__1 : rule__TransitionMode__Group_0_0_1_0__1__Impl rule__TransitionMode__Group_0_0_1_0__2 ;
    public final void rule__TransitionMode__Group_0_0_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3669:1: ( rule__TransitionMode__Group_0_0_1_0__1__Impl rule__TransitionMode__Group_0_0_1_0__2 )
            // InternalArduinoML.g:3670:2: rule__TransitionMode__Group_0_0_1_0__1__Impl rule__TransitionMode__Group_0_0_1_0__2
            {
            pushFollow(FOLLOW_30);
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
    // InternalArduinoML.g:3677:1: rule__TransitionMode__Group_0_0_1_0__1__Impl : ( 'is' ) ;
    public final void rule__TransitionMode__Group_0_0_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3681:1: ( ( 'is' ) )
            // InternalArduinoML.g:3682:1: ( 'is' )
            {
            // InternalArduinoML.g:3682:1: ( 'is' )
            // InternalArduinoML.g:3683:2: 'is'
            {
             before(grammarAccess.getTransitionModeAccess().getIsKeyword_0_0_1_0_1()); 
            match(input,42,FOLLOW_2); 
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
    // InternalArduinoML.g:3692:1: rule__TransitionMode__Group_0_0_1_0__2 : rule__TransitionMode__Group_0_0_1_0__2__Impl ;
    public final void rule__TransitionMode__Group_0_0_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3696:1: ( rule__TransitionMode__Group_0_0_1_0__2__Impl )
            // InternalArduinoML.g:3697:2: rule__TransitionMode__Group_0_0_1_0__2__Impl
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
    // InternalArduinoML.g:3703:1: rule__TransitionMode__Group_0_0_1_0__2__Impl : ( ( rule__TransitionMode__D_valuesAssignment_0_0_1_0_2 ) ) ;
    public final void rule__TransitionMode__Group_0_0_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3707:1: ( ( ( rule__TransitionMode__D_valuesAssignment_0_0_1_0_2 ) ) )
            // InternalArduinoML.g:3708:1: ( ( rule__TransitionMode__D_valuesAssignment_0_0_1_0_2 ) )
            {
            // InternalArduinoML.g:3708:1: ( ( rule__TransitionMode__D_valuesAssignment_0_0_1_0_2 ) )
            // InternalArduinoML.g:3709:2: ( rule__TransitionMode__D_valuesAssignment_0_0_1_0_2 )
            {
             before(grammarAccess.getTransitionModeAccess().getD_valuesAssignment_0_0_1_0_2()); 
            // InternalArduinoML.g:3710:2: ( rule__TransitionMode__D_valuesAssignment_0_0_1_0_2 )
            // InternalArduinoML.g:3710:3: rule__TransitionMode__D_valuesAssignment_0_0_1_0_2
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
    // InternalArduinoML.g:3719:1: rule__TransitionMode__Group_0_0_1_1__0 : rule__TransitionMode__Group_0_0_1_1__0__Impl rule__TransitionMode__Group_0_0_1_1__1 ;
    public final void rule__TransitionMode__Group_0_0_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3723:1: ( rule__TransitionMode__Group_0_0_1_1__0__Impl rule__TransitionMode__Group_0_0_1_1__1 )
            // InternalArduinoML.g:3724:2: rule__TransitionMode__Group_0_0_1_1__0__Impl rule__TransitionMode__Group_0_0_1_1__1
            {
            pushFollow(FOLLOW_35);
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
    // InternalArduinoML.g:3731:1: rule__TransitionMode__Group_0_0_1_1__0__Impl : ( ( rule__TransitionMode__AnalogsAssignment_0_0_1_1_0 ) ) ;
    public final void rule__TransitionMode__Group_0_0_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3735:1: ( ( ( rule__TransitionMode__AnalogsAssignment_0_0_1_1_0 ) ) )
            // InternalArduinoML.g:3736:1: ( ( rule__TransitionMode__AnalogsAssignment_0_0_1_1_0 ) )
            {
            // InternalArduinoML.g:3736:1: ( ( rule__TransitionMode__AnalogsAssignment_0_0_1_1_0 ) )
            // InternalArduinoML.g:3737:2: ( rule__TransitionMode__AnalogsAssignment_0_0_1_1_0 )
            {
             before(grammarAccess.getTransitionModeAccess().getAnalogsAssignment_0_0_1_1_0()); 
            // InternalArduinoML.g:3738:2: ( rule__TransitionMode__AnalogsAssignment_0_0_1_1_0 )
            // InternalArduinoML.g:3738:3: rule__TransitionMode__AnalogsAssignment_0_0_1_1_0
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
    // InternalArduinoML.g:3746:1: rule__TransitionMode__Group_0_0_1_1__1 : rule__TransitionMode__Group_0_0_1_1__1__Impl rule__TransitionMode__Group_0_0_1_1__2 ;
    public final void rule__TransitionMode__Group_0_0_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3750:1: ( rule__TransitionMode__Group_0_0_1_1__1__Impl rule__TransitionMode__Group_0_0_1_1__2 )
            // InternalArduinoML.g:3751:2: rule__TransitionMode__Group_0_0_1_1__1__Impl rule__TransitionMode__Group_0_0_1_1__2
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
    // InternalArduinoML.g:3758:1: rule__TransitionMode__Group_0_0_1_1__1__Impl : ( ( rule__TransitionMode__CompAssignment_0_0_1_1_1 ) ) ;
    public final void rule__TransitionMode__Group_0_0_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3762:1: ( ( ( rule__TransitionMode__CompAssignment_0_0_1_1_1 ) ) )
            // InternalArduinoML.g:3763:1: ( ( rule__TransitionMode__CompAssignment_0_0_1_1_1 ) )
            {
            // InternalArduinoML.g:3763:1: ( ( rule__TransitionMode__CompAssignment_0_0_1_1_1 ) )
            // InternalArduinoML.g:3764:2: ( rule__TransitionMode__CompAssignment_0_0_1_1_1 )
            {
             before(grammarAccess.getTransitionModeAccess().getCompAssignment_0_0_1_1_1()); 
            // InternalArduinoML.g:3765:2: ( rule__TransitionMode__CompAssignment_0_0_1_1_1 )
            // InternalArduinoML.g:3765:3: rule__TransitionMode__CompAssignment_0_0_1_1_1
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
    // InternalArduinoML.g:3773:1: rule__TransitionMode__Group_0_0_1_1__2 : rule__TransitionMode__Group_0_0_1_1__2__Impl ;
    public final void rule__TransitionMode__Group_0_0_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3777:1: ( rule__TransitionMode__Group_0_0_1_1__2__Impl )
            // InternalArduinoML.g:3778:2: rule__TransitionMode__Group_0_0_1_1__2__Impl
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
    // InternalArduinoML.g:3784:1: rule__TransitionMode__Group_0_0_1_1__2__Impl : ( ( rule__TransitionMode__A_valuesAssignment_0_0_1_1_2 ) ) ;
    public final void rule__TransitionMode__Group_0_0_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3788:1: ( ( ( rule__TransitionMode__A_valuesAssignment_0_0_1_1_2 ) ) )
            // InternalArduinoML.g:3789:1: ( ( rule__TransitionMode__A_valuesAssignment_0_0_1_1_2 ) )
            {
            // InternalArduinoML.g:3789:1: ( ( rule__TransitionMode__A_valuesAssignment_0_0_1_1_2 ) )
            // InternalArduinoML.g:3790:2: ( rule__TransitionMode__A_valuesAssignment_0_0_1_1_2 )
            {
             before(grammarAccess.getTransitionModeAccess().getA_valuesAssignment_0_0_1_1_2()); 
            // InternalArduinoML.g:3791:2: ( rule__TransitionMode__A_valuesAssignment_0_0_1_1_2 )
            // InternalArduinoML.g:3791:3: rule__TransitionMode__A_valuesAssignment_0_0_1_1_2
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
    // InternalArduinoML.g:3800:1: rule__TransitionMode__Group_0_0_2__0 : rule__TransitionMode__Group_0_0_2__0__Impl rule__TransitionMode__Group_0_0_2__1 ;
    public final void rule__TransitionMode__Group_0_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3804:1: ( rule__TransitionMode__Group_0_0_2__0__Impl rule__TransitionMode__Group_0_0_2__1 )
            // InternalArduinoML.g:3805:2: rule__TransitionMode__Group_0_0_2__0__Impl rule__TransitionMode__Group_0_0_2__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalArduinoML.g:3812:1: rule__TransitionMode__Group_0_0_2__0__Impl : ( 'and' ) ;
    public final void rule__TransitionMode__Group_0_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3816:1: ( ( 'and' ) )
            // InternalArduinoML.g:3817:1: ( 'and' )
            {
            // InternalArduinoML.g:3817:1: ( 'and' )
            // InternalArduinoML.g:3818:2: 'and'
            {
             before(grammarAccess.getTransitionModeAccess().getAndKeyword_0_0_2_0()); 
            match(input,43,FOLLOW_2); 
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
    // InternalArduinoML.g:3827:1: rule__TransitionMode__Group_0_0_2__1 : rule__TransitionMode__Group_0_0_2__1__Impl ;
    public final void rule__TransitionMode__Group_0_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3831:1: ( rule__TransitionMode__Group_0_0_2__1__Impl )
            // InternalArduinoML.g:3832:2: rule__TransitionMode__Group_0_0_2__1__Impl
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
    // InternalArduinoML.g:3838:1: rule__TransitionMode__Group_0_0_2__1__Impl : ( ( rule__TransitionMode__Alternatives_0_0_2_1 ) ) ;
    public final void rule__TransitionMode__Group_0_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3842:1: ( ( ( rule__TransitionMode__Alternatives_0_0_2_1 ) ) )
            // InternalArduinoML.g:3843:1: ( ( rule__TransitionMode__Alternatives_0_0_2_1 ) )
            {
            // InternalArduinoML.g:3843:1: ( ( rule__TransitionMode__Alternatives_0_0_2_1 ) )
            // InternalArduinoML.g:3844:2: ( rule__TransitionMode__Alternatives_0_0_2_1 )
            {
             before(grammarAccess.getTransitionModeAccess().getAlternatives_0_0_2_1()); 
            // InternalArduinoML.g:3845:2: ( rule__TransitionMode__Alternatives_0_0_2_1 )
            // InternalArduinoML.g:3845:3: rule__TransitionMode__Alternatives_0_0_2_1
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
    // InternalArduinoML.g:3854:1: rule__TransitionMode__Group_0_0_2_1_0__0 : rule__TransitionMode__Group_0_0_2_1_0__0__Impl rule__TransitionMode__Group_0_0_2_1_0__1 ;
    public final void rule__TransitionMode__Group_0_0_2_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3858:1: ( rule__TransitionMode__Group_0_0_2_1_0__0__Impl rule__TransitionMode__Group_0_0_2_1_0__1 )
            // InternalArduinoML.g:3859:2: rule__TransitionMode__Group_0_0_2_1_0__0__Impl rule__TransitionMode__Group_0_0_2_1_0__1
            {
            pushFollow(FOLLOW_34);
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
    // InternalArduinoML.g:3866:1: rule__TransitionMode__Group_0_0_2_1_0__0__Impl : ( ( rule__TransitionMode__DigitalsAssignment_0_0_2_1_0_0 ) ) ;
    public final void rule__TransitionMode__Group_0_0_2_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3870:1: ( ( ( rule__TransitionMode__DigitalsAssignment_0_0_2_1_0_0 ) ) )
            // InternalArduinoML.g:3871:1: ( ( rule__TransitionMode__DigitalsAssignment_0_0_2_1_0_0 ) )
            {
            // InternalArduinoML.g:3871:1: ( ( rule__TransitionMode__DigitalsAssignment_0_0_2_1_0_0 ) )
            // InternalArduinoML.g:3872:2: ( rule__TransitionMode__DigitalsAssignment_0_0_2_1_0_0 )
            {
             before(grammarAccess.getTransitionModeAccess().getDigitalsAssignment_0_0_2_1_0_0()); 
            // InternalArduinoML.g:3873:2: ( rule__TransitionMode__DigitalsAssignment_0_0_2_1_0_0 )
            // InternalArduinoML.g:3873:3: rule__TransitionMode__DigitalsAssignment_0_0_2_1_0_0
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
    // InternalArduinoML.g:3881:1: rule__TransitionMode__Group_0_0_2_1_0__1 : rule__TransitionMode__Group_0_0_2_1_0__1__Impl rule__TransitionMode__Group_0_0_2_1_0__2 ;
    public final void rule__TransitionMode__Group_0_0_2_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3885:1: ( rule__TransitionMode__Group_0_0_2_1_0__1__Impl rule__TransitionMode__Group_0_0_2_1_0__2 )
            // InternalArduinoML.g:3886:2: rule__TransitionMode__Group_0_0_2_1_0__1__Impl rule__TransitionMode__Group_0_0_2_1_0__2
            {
            pushFollow(FOLLOW_30);
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
    // InternalArduinoML.g:3893:1: rule__TransitionMode__Group_0_0_2_1_0__1__Impl : ( 'is' ) ;
    public final void rule__TransitionMode__Group_0_0_2_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3897:1: ( ( 'is' ) )
            // InternalArduinoML.g:3898:1: ( 'is' )
            {
            // InternalArduinoML.g:3898:1: ( 'is' )
            // InternalArduinoML.g:3899:2: 'is'
            {
             before(grammarAccess.getTransitionModeAccess().getIsKeyword_0_0_2_1_0_1()); 
            match(input,42,FOLLOW_2); 
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
    // InternalArduinoML.g:3908:1: rule__TransitionMode__Group_0_0_2_1_0__2 : rule__TransitionMode__Group_0_0_2_1_0__2__Impl ;
    public final void rule__TransitionMode__Group_0_0_2_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3912:1: ( rule__TransitionMode__Group_0_0_2_1_0__2__Impl )
            // InternalArduinoML.g:3913:2: rule__TransitionMode__Group_0_0_2_1_0__2__Impl
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
    // InternalArduinoML.g:3919:1: rule__TransitionMode__Group_0_0_2_1_0__2__Impl : ( ( rule__TransitionMode__D_valuesAssignment_0_0_2_1_0_2 ) ) ;
    public final void rule__TransitionMode__Group_0_0_2_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3923:1: ( ( ( rule__TransitionMode__D_valuesAssignment_0_0_2_1_0_2 ) ) )
            // InternalArduinoML.g:3924:1: ( ( rule__TransitionMode__D_valuesAssignment_0_0_2_1_0_2 ) )
            {
            // InternalArduinoML.g:3924:1: ( ( rule__TransitionMode__D_valuesAssignment_0_0_2_1_0_2 ) )
            // InternalArduinoML.g:3925:2: ( rule__TransitionMode__D_valuesAssignment_0_0_2_1_0_2 )
            {
             before(grammarAccess.getTransitionModeAccess().getD_valuesAssignment_0_0_2_1_0_2()); 
            // InternalArduinoML.g:3926:2: ( rule__TransitionMode__D_valuesAssignment_0_0_2_1_0_2 )
            // InternalArduinoML.g:3926:3: rule__TransitionMode__D_valuesAssignment_0_0_2_1_0_2
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
    // InternalArduinoML.g:3935:1: rule__TransitionMode__Group_0_0_2_1_1__0 : rule__TransitionMode__Group_0_0_2_1_1__0__Impl rule__TransitionMode__Group_0_0_2_1_1__1 ;
    public final void rule__TransitionMode__Group_0_0_2_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3939:1: ( rule__TransitionMode__Group_0_0_2_1_1__0__Impl rule__TransitionMode__Group_0_0_2_1_1__1 )
            // InternalArduinoML.g:3940:2: rule__TransitionMode__Group_0_0_2_1_1__0__Impl rule__TransitionMode__Group_0_0_2_1_1__1
            {
            pushFollow(FOLLOW_35);
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
    // InternalArduinoML.g:3947:1: rule__TransitionMode__Group_0_0_2_1_1__0__Impl : ( ( rule__TransitionMode__AnalogsAssignment_0_0_2_1_1_0 ) ) ;
    public final void rule__TransitionMode__Group_0_0_2_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3951:1: ( ( ( rule__TransitionMode__AnalogsAssignment_0_0_2_1_1_0 ) ) )
            // InternalArduinoML.g:3952:1: ( ( rule__TransitionMode__AnalogsAssignment_0_0_2_1_1_0 ) )
            {
            // InternalArduinoML.g:3952:1: ( ( rule__TransitionMode__AnalogsAssignment_0_0_2_1_1_0 ) )
            // InternalArduinoML.g:3953:2: ( rule__TransitionMode__AnalogsAssignment_0_0_2_1_1_0 )
            {
             before(grammarAccess.getTransitionModeAccess().getAnalogsAssignment_0_0_2_1_1_0()); 
            // InternalArduinoML.g:3954:2: ( rule__TransitionMode__AnalogsAssignment_0_0_2_1_1_0 )
            // InternalArduinoML.g:3954:3: rule__TransitionMode__AnalogsAssignment_0_0_2_1_1_0
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
    // InternalArduinoML.g:3962:1: rule__TransitionMode__Group_0_0_2_1_1__1 : rule__TransitionMode__Group_0_0_2_1_1__1__Impl rule__TransitionMode__Group_0_0_2_1_1__2 ;
    public final void rule__TransitionMode__Group_0_0_2_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3966:1: ( rule__TransitionMode__Group_0_0_2_1_1__1__Impl rule__TransitionMode__Group_0_0_2_1_1__2 )
            // InternalArduinoML.g:3967:2: rule__TransitionMode__Group_0_0_2_1_1__1__Impl rule__TransitionMode__Group_0_0_2_1_1__2
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
    // InternalArduinoML.g:3974:1: rule__TransitionMode__Group_0_0_2_1_1__1__Impl : ( ( rule__TransitionMode__CompAssignment_0_0_2_1_1_1 ) ) ;
    public final void rule__TransitionMode__Group_0_0_2_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3978:1: ( ( ( rule__TransitionMode__CompAssignment_0_0_2_1_1_1 ) ) )
            // InternalArduinoML.g:3979:1: ( ( rule__TransitionMode__CompAssignment_0_0_2_1_1_1 ) )
            {
            // InternalArduinoML.g:3979:1: ( ( rule__TransitionMode__CompAssignment_0_0_2_1_1_1 ) )
            // InternalArduinoML.g:3980:2: ( rule__TransitionMode__CompAssignment_0_0_2_1_1_1 )
            {
             before(grammarAccess.getTransitionModeAccess().getCompAssignment_0_0_2_1_1_1()); 
            // InternalArduinoML.g:3981:2: ( rule__TransitionMode__CompAssignment_0_0_2_1_1_1 )
            // InternalArduinoML.g:3981:3: rule__TransitionMode__CompAssignment_0_0_2_1_1_1
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
    // InternalArduinoML.g:3989:1: rule__TransitionMode__Group_0_0_2_1_1__2 : rule__TransitionMode__Group_0_0_2_1_1__2__Impl ;
    public final void rule__TransitionMode__Group_0_0_2_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:3993:1: ( rule__TransitionMode__Group_0_0_2_1_1__2__Impl )
            // InternalArduinoML.g:3994:2: rule__TransitionMode__Group_0_0_2_1_1__2__Impl
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
    // InternalArduinoML.g:4000:1: rule__TransitionMode__Group_0_0_2_1_1__2__Impl : ( ( rule__TransitionMode__A_valuesAssignment_0_0_2_1_1_2 ) ) ;
    public final void rule__TransitionMode__Group_0_0_2_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:4004:1: ( ( ( rule__TransitionMode__A_valuesAssignment_0_0_2_1_1_2 ) ) )
            // InternalArduinoML.g:4005:1: ( ( rule__TransitionMode__A_valuesAssignment_0_0_2_1_1_2 ) )
            {
            // InternalArduinoML.g:4005:1: ( ( rule__TransitionMode__A_valuesAssignment_0_0_2_1_1_2 ) )
            // InternalArduinoML.g:4006:2: ( rule__TransitionMode__A_valuesAssignment_0_0_2_1_1_2 )
            {
             before(grammarAccess.getTransitionModeAccess().getA_valuesAssignment_0_0_2_1_1_2()); 
            // InternalArduinoML.g:4007:2: ( rule__TransitionMode__A_valuesAssignment_0_0_2_1_1_2 )
            // InternalArduinoML.g:4007:3: rule__TransitionMode__A_valuesAssignment_0_0_2_1_1_2
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
    // InternalArduinoML.g:4016:1: rule__TransitionMode__Group_0_0_3__0 : rule__TransitionMode__Group_0_0_3__0__Impl rule__TransitionMode__Group_0_0_3__1 ;
    public final void rule__TransitionMode__Group_0_0_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:4020:1: ( rule__TransitionMode__Group_0_0_3__0__Impl rule__TransitionMode__Group_0_0_3__1 )
            // InternalArduinoML.g:4021:2: rule__TransitionMode__Group_0_0_3__0__Impl rule__TransitionMode__Group_0_0_3__1
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
    // InternalArduinoML.g:4028:1: rule__TransitionMode__Group_0_0_3__0__Impl : ( 'wait' ) ;
    public final void rule__TransitionMode__Group_0_0_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:4032:1: ( ( 'wait' ) )
            // InternalArduinoML.g:4033:1: ( 'wait' )
            {
            // InternalArduinoML.g:4033:1: ( 'wait' )
            // InternalArduinoML.g:4034:2: 'wait'
            {
             before(grammarAccess.getTransitionModeAccess().getWaitKeyword_0_0_3_0()); 
            match(input,44,FOLLOW_2); 
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
    // InternalArduinoML.g:4043:1: rule__TransitionMode__Group_0_0_3__1 : rule__TransitionMode__Group_0_0_3__1__Impl rule__TransitionMode__Group_0_0_3__2 ;
    public final void rule__TransitionMode__Group_0_0_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:4047:1: ( rule__TransitionMode__Group_0_0_3__1__Impl rule__TransitionMode__Group_0_0_3__2 )
            // InternalArduinoML.g:4048:2: rule__TransitionMode__Group_0_0_3__1__Impl rule__TransitionMode__Group_0_0_3__2
            {
            pushFollow(FOLLOW_36);
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
    // InternalArduinoML.g:4055:1: rule__TransitionMode__Group_0_0_3__1__Impl : ( ( rule__TransitionMode__TimeAssignment_0_0_3_1 ) ) ;
    public final void rule__TransitionMode__Group_0_0_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:4059:1: ( ( ( rule__TransitionMode__TimeAssignment_0_0_3_1 ) ) )
            // InternalArduinoML.g:4060:1: ( ( rule__TransitionMode__TimeAssignment_0_0_3_1 ) )
            {
            // InternalArduinoML.g:4060:1: ( ( rule__TransitionMode__TimeAssignment_0_0_3_1 ) )
            // InternalArduinoML.g:4061:2: ( rule__TransitionMode__TimeAssignment_0_0_3_1 )
            {
             before(grammarAccess.getTransitionModeAccess().getTimeAssignment_0_0_3_1()); 
            // InternalArduinoML.g:4062:2: ( rule__TransitionMode__TimeAssignment_0_0_3_1 )
            // InternalArduinoML.g:4062:3: rule__TransitionMode__TimeAssignment_0_0_3_1
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
    // InternalArduinoML.g:4070:1: rule__TransitionMode__Group_0_0_3__2 : rule__TransitionMode__Group_0_0_3__2__Impl rule__TransitionMode__Group_0_0_3__3 ;
    public final void rule__TransitionMode__Group_0_0_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:4074:1: ( rule__TransitionMode__Group_0_0_3__2__Impl rule__TransitionMode__Group_0_0_3__3 )
            // InternalArduinoML.g:4075:2: rule__TransitionMode__Group_0_0_3__2__Impl rule__TransitionMode__Group_0_0_3__3
            {
            pushFollow(FOLLOW_37);
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
    // InternalArduinoML.g:4082:1: rule__TransitionMode__Group_0_0_3__2__Impl : ( ( rule__TransitionMode__UnitAssignment_0_0_3_2 ) ) ;
    public final void rule__TransitionMode__Group_0_0_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:4086:1: ( ( ( rule__TransitionMode__UnitAssignment_0_0_3_2 ) ) )
            // InternalArduinoML.g:4087:1: ( ( rule__TransitionMode__UnitAssignment_0_0_3_2 ) )
            {
            // InternalArduinoML.g:4087:1: ( ( rule__TransitionMode__UnitAssignment_0_0_3_2 ) )
            // InternalArduinoML.g:4088:2: ( rule__TransitionMode__UnitAssignment_0_0_3_2 )
            {
             before(grammarAccess.getTransitionModeAccess().getUnitAssignment_0_0_3_2()); 
            // InternalArduinoML.g:4089:2: ( rule__TransitionMode__UnitAssignment_0_0_3_2 )
            // InternalArduinoML.g:4089:3: rule__TransitionMode__UnitAssignment_0_0_3_2
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
    // InternalArduinoML.g:4097:1: rule__TransitionMode__Group_0_0_3__3 : rule__TransitionMode__Group_0_0_3__3__Impl ;
    public final void rule__TransitionMode__Group_0_0_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:4101:1: ( rule__TransitionMode__Group_0_0_3__3__Impl )
            // InternalArduinoML.g:4102:2: rule__TransitionMode__Group_0_0_3__3__Impl
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
    // InternalArduinoML.g:4108:1: rule__TransitionMode__Group_0_0_3__3__Impl : ( 'then' ) ;
    public final void rule__TransitionMode__Group_0_0_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:4112:1: ( ( 'then' ) )
            // InternalArduinoML.g:4113:1: ( 'then' )
            {
            // InternalArduinoML.g:4113:1: ( 'then' )
            // InternalArduinoML.g:4114:2: 'then'
            {
             before(grammarAccess.getTransitionModeAccess().getThenKeyword_0_0_3_3()); 
            match(input,45,FOLLOW_2); 
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
    // InternalArduinoML.g:4124:1: rule__TransitionMode__Group_0_1__0 : rule__TransitionMode__Group_0_1__0__Impl rule__TransitionMode__Group_0_1__1 ;
    public final void rule__TransitionMode__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:4128:1: ( rule__TransitionMode__Group_0_1__0__Impl rule__TransitionMode__Group_0_1__1 )
            // InternalArduinoML.g:4129:2: rule__TransitionMode__Group_0_1__0__Impl rule__TransitionMode__Group_0_1__1
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
    // InternalArduinoML.g:4136:1: rule__TransitionMode__Group_0_1__0__Impl : ( 'wait' ) ;
    public final void rule__TransitionMode__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:4140:1: ( ( 'wait' ) )
            // InternalArduinoML.g:4141:1: ( 'wait' )
            {
            // InternalArduinoML.g:4141:1: ( 'wait' )
            // InternalArduinoML.g:4142:2: 'wait'
            {
             before(grammarAccess.getTransitionModeAccess().getWaitKeyword_0_1_0()); 
            match(input,44,FOLLOW_2); 
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
    // InternalArduinoML.g:4151:1: rule__TransitionMode__Group_0_1__1 : rule__TransitionMode__Group_0_1__1__Impl rule__TransitionMode__Group_0_1__2 ;
    public final void rule__TransitionMode__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:4155:1: ( rule__TransitionMode__Group_0_1__1__Impl rule__TransitionMode__Group_0_1__2 )
            // InternalArduinoML.g:4156:2: rule__TransitionMode__Group_0_1__1__Impl rule__TransitionMode__Group_0_1__2
            {
            pushFollow(FOLLOW_36);
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
    // InternalArduinoML.g:4163:1: rule__TransitionMode__Group_0_1__1__Impl : ( ( rule__TransitionMode__TimeAssignment_0_1_1 ) ) ;
    public final void rule__TransitionMode__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:4167:1: ( ( ( rule__TransitionMode__TimeAssignment_0_1_1 ) ) )
            // InternalArduinoML.g:4168:1: ( ( rule__TransitionMode__TimeAssignment_0_1_1 ) )
            {
            // InternalArduinoML.g:4168:1: ( ( rule__TransitionMode__TimeAssignment_0_1_1 ) )
            // InternalArduinoML.g:4169:2: ( rule__TransitionMode__TimeAssignment_0_1_1 )
            {
             before(grammarAccess.getTransitionModeAccess().getTimeAssignment_0_1_1()); 
            // InternalArduinoML.g:4170:2: ( rule__TransitionMode__TimeAssignment_0_1_1 )
            // InternalArduinoML.g:4170:3: rule__TransitionMode__TimeAssignment_0_1_1
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
    // InternalArduinoML.g:4178:1: rule__TransitionMode__Group_0_1__2 : rule__TransitionMode__Group_0_1__2__Impl rule__TransitionMode__Group_0_1__3 ;
    public final void rule__TransitionMode__Group_0_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:4182:1: ( rule__TransitionMode__Group_0_1__2__Impl rule__TransitionMode__Group_0_1__3 )
            // InternalArduinoML.g:4183:2: rule__TransitionMode__Group_0_1__2__Impl rule__TransitionMode__Group_0_1__3
            {
            pushFollow(FOLLOW_37);
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
    // InternalArduinoML.g:4190:1: rule__TransitionMode__Group_0_1__2__Impl : ( ( rule__TransitionMode__UnitAssignment_0_1_2 ) ) ;
    public final void rule__TransitionMode__Group_0_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:4194:1: ( ( ( rule__TransitionMode__UnitAssignment_0_1_2 ) ) )
            // InternalArduinoML.g:4195:1: ( ( rule__TransitionMode__UnitAssignment_0_1_2 ) )
            {
            // InternalArduinoML.g:4195:1: ( ( rule__TransitionMode__UnitAssignment_0_1_2 ) )
            // InternalArduinoML.g:4196:2: ( rule__TransitionMode__UnitAssignment_0_1_2 )
            {
             before(grammarAccess.getTransitionModeAccess().getUnitAssignment_0_1_2()); 
            // InternalArduinoML.g:4197:2: ( rule__TransitionMode__UnitAssignment_0_1_2 )
            // InternalArduinoML.g:4197:3: rule__TransitionMode__UnitAssignment_0_1_2
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
    // InternalArduinoML.g:4205:1: rule__TransitionMode__Group_0_1__3 : rule__TransitionMode__Group_0_1__3__Impl ;
    public final void rule__TransitionMode__Group_0_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:4209:1: ( rule__TransitionMode__Group_0_1__3__Impl )
            // InternalArduinoML.g:4210:2: rule__TransitionMode__Group_0_1__3__Impl
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
    // InternalArduinoML.g:4216:1: rule__TransitionMode__Group_0_1__3__Impl : ( 'then' ) ;
    public final void rule__TransitionMode__Group_0_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:4220:1: ( ( 'then' ) )
            // InternalArduinoML.g:4221:1: ( 'then' )
            {
            // InternalArduinoML.g:4221:1: ( 'then' )
            // InternalArduinoML.g:4222:2: 'then'
            {
             before(grammarAccess.getTransitionModeAccess().getThenKeyword_0_1_3()); 
            match(input,45,FOLLOW_2); 
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


    // $ANTLR start "rule__App__MonitoringAssignment_0_2"
    // InternalArduinoML.g:4232:1: rule__App__MonitoringAssignment_0_2 : ( ruleEBoolean ) ;
    public final void rule__App__MonitoringAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:4236:1: ( ( ruleEBoolean ) )
            // InternalArduinoML.g:4237:2: ( ruleEBoolean )
            {
            // InternalArduinoML.g:4237:2: ( ruleEBoolean )
            // InternalArduinoML.g:4238:3: ruleEBoolean
            {
             before(grammarAccess.getAppAccess().getMonitoringEBooleanParserRuleCall_0_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEBoolean();

            state._fsp--;

             after(grammarAccess.getAppAccess().getMonitoringEBooleanParserRuleCall_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__App__MonitoringAssignment_0_2"


    // $ANTLR start "rule__App__NameAssignment_1_0_1"
    // InternalArduinoML.g:4247:1: rule__App__NameAssignment_1_0_1 : ( ruleEString ) ;
    public final void rule__App__NameAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:4251:1: ( ( ruleEString ) )
            // InternalArduinoML.g:4252:2: ( ruleEString )
            {
            // InternalArduinoML.g:4252:2: ( ruleEString )
            // InternalArduinoML.g:4253:3: ruleEString
            {
             before(grammarAccess.getAppAccess().getNameEStringParserRuleCall_1_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAppAccess().getNameEStringParserRuleCall_1_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__App__NameAssignment_1_0_1"


    // $ANTLR start "rule__App__Initial_modeAssignment_1_0_4"
    // InternalArduinoML.g:4262:1: rule__App__Initial_modeAssignment_1_0_4 : ( ( ruleEString ) ) ;
    public final void rule__App__Initial_modeAssignment_1_0_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:4266:1: ( ( ( ruleEString ) ) )
            // InternalArduinoML.g:4267:2: ( ( ruleEString ) )
            {
            // InternalArduinoML.g:4267:2: ( ( ruleEString ) )
            // InternalArduinoML.g:4268:3: ( ruleEString )
            {
             before(grammarAccess.getAppAccess().getInitial_modeModeCrossReference_1_0_4_0()); 
            // InternalArduinoML.g:4269:3: ( ruleEString )
            // InternalArduinoML.g:4270:4: ruleEString
            {
             before(grammarAccess.getAppAccess().getInitial_modeModeEStringParserRuleCall_1_0_4_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAppAccess().getInitial_modeModeEStringParserRuleCall_1_0_4_0_1()); 

            }

             after(grammarAccess.getAppAccess().getInitial_modeModeCrossReference_1_0_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__App__Initial_modeAssignment_1_0_4"


    // $ANTLR start "rule__App__BricksAssignment_1_0_8"
    // InternalArduinoML.g:4281:1: rule__App__BricksAssignment_1_0_8 : ( ruleBrick ) ;
    public final void rule__App__BricksAssignment_1_0_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:4285:1: ( ( ruleBrick ) )
            // InternalArduinoML.g:4286:2: ( ruleBrick )
            {
            // InternalArduinoML.g:4286:2: ( ruleBrick )
            // InternalArduinoML.g:4287:3: ruleBrick
            {
             before(grammarAccess.getAppAccess().getBricksBrickParserRuleCall_1_0_8_0()); 
            pushFollow(FOLLOW_2);
            ruleBrick();

            state._fsp--;

             after(grammarAccess.getAppAccess().getBricksBrickParserRuleCall_1_0_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__App__BricksAssignment_1_0_8"


    // $ANTLR start "rule__App__BricksAssignment_1_0_9"
    // InternalArduinoML.g:4296:1: rule__App__BricksAssignment_1_0_9 : ( ruleBrick ) ;
    public final void rule__App__BricksAssignment_1_0_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:4300:1: ( ( ruleBrick ) )
            // InternalArduinoML.g:4301:2: ( ruleBrick )
            {
            // InternalArduinoML.g:4301:2: ( ruleBrick )
            // InternalArduinoML.g:4302:3: ruleBrick
            {
             before(grammarAccess.getAppAccess().getBricksBrickParserRuleCall_1_0_9_0()); 
            pushFollow(FOLLOW_2);
            ruleBrick();

            state._fsp--;

             after(grammarAccess.getAppAccess().getBricksBrickParserRuleCall_1_0_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__App__BricksAssignment_1_0_9"


    // $ANTLR start "rule__App__ModesAssignment_1_0_12"
    // InternalArduinoML.g:4311:1: rule__App__ModesAssignment_1_0_12 : ( ruleMode ) ;
    public final void rule__App__ModesAssignment_1_0_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:4315:1: ( ( ruleMode ) )
            // InternalArduinoML.g:4316:2: ( ruleMode )
            {
            // InternalArduinoML.g:4316:2: ( ruleMode )
            // InternalArduinoML.g:4317:3: ruleMode
            {
             before(grammarAccess.getAppAccess().getModesModeParserRuleCall_1_0_12_0()); 
            pushFollow(FOLLOW_2);
            ruleMode();

            state._fsp--;

             after(grammarAccess.getAppAccess().getModesModeParserRuleCall_1_0_12_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__App__ModesAssignment_1_0_12"


    // $ANTLR start "rule__App__ModesAssignment_1_0_13"
    // InternalArduinoML.g:4326:1: rule__App__ModesAssignment_1_0_13 : ( ruleMode ) ;
    public final void rule__App__ModesAssignment_1_0_13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:4330:1: ( ( ruleMode ) )
            // InternalArduinoML.g:4331:2: ( ruleMode )
            {
            // InternalArduinoML.g:4331:2: ( ruleMode )
            // InternalArduinoML.g:4332:3: ruleMode
            {
             before(grammarAccess.getAppAccess().getModesModeParserRuleCall_1_0_13_0()); 
            pushFollow(FOLLOW_2);
            ruleMode();

            state._fsp--;

             after(grammarAccess.getAppAccess().getModesModeParserRuleCall_1_0_13_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__App__ModesAssignment_1_0_13"


    // $ANTLR start "rule__App__ModesAssignment_1_1_1"
    // InternalArduinoML.g:4341:1: rule__App__ModesAssignment_1_1_1 : ( ruleMode ) ;
    public final void rule__App__ModesAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:4345:1: ( ( ruleMode ) )
            // InternalArduinoML.g:4346:2: ( ruleMode )
            {
            // InternalArduinoML.g:4346:2: ( ruleMode )
            // InternalArduinoML.g:4347:3: ruleMode
            {
             before(grammarAccess.getAppAccess().getModesModeParserRuleCall_1_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMode();

            state._fsp--;

             after(grammarAccess.getAppAccess().getModesModeParserRuleCall_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__App__ModesAssignment_1_1_1"


    // $ANTLR start "rule__Brick__NameAssignment_0_1"
    // InternalArduinoML.g:4356:1: rule__Brick__NameAssignment_0_1 : ( ruleEString ) ;
    public final void rule__Brick__NameAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:4360:1: ( ( ruleEString ) )
            // InternalArduinoML.g:4361:2: ( ruleEString )
            {
            // InternalArduinoML.g:4361:2: ( ruleEString )
            // InternalArduinoML.g:4362:3: ruleEString
            {
             before(grammarAccess.getBrickAccess().getNameEStringParserRuleCall_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getBrickAccess().getNameEStringParserRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Brick__NameAssignment_0_1"


    // $ANTLR start "rule__Brick__PinAssignment_0_3"
    // InternalArduinoML.g:4371:1: rule__Brick__PinAssignment_0_3 : ( ruleEInt ) ;
    public final void rule__Brick__PinAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:4375:1: ( ( ruleEInt ) )
            // InternalArduinoML.g:4376:2: ( ruleEInt )
            {
            // InternalArduinoML.g:4376:2: ( ruleEInt )
            // InternalArduinoML.g:4377:3: ruleEInt
            {
             before(grammarAccess.getBrickAccess().getPinEIntParserRuleCall_0_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getBrickAccess().getPinEIntParserRuleCall_0_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Brick__PinAssignment_0_3"


    // $ANTLR start "rule__Brick__NameAssignment_1_1"
    // InternalArduinoML.g:4386:1: rule__Brick__NameAssignment_1_1 : ( ruleEString ) ;
    public final void rule__Brick__NameAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:4390:1: ( ( ruleEString ) )
            // InternalArduinoML.g:4391:2: ( ruleEString )
            {
            // InternalArduinoML.g:4391:2: ( ruleEString )
            // InternalArduinoML.g:4392:3: ruleEString
            {
             before(grammarAccess.getBrickAccess().getNameEStringParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getBrickAccess().getNameEStringParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Brick__NameAssignment_1_1"


    // $ANTLR start "rule__Brick__PinAssignment_1_3"
    // InternalArduinoML.g:4401:1: rule__Brick__PinAssignment_1_3 : ( ruleEInt ) ;
    public final void rule__Brick__PinAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:4405:1: ( ( ruleEInt ) )
            // InternalArduinoML.g:4406:2: ( ruleEInt )
            {
            // InternalArduinoML.g:4406:2: ( ruleEInt )
            // InternalArduinoML.g:4407:3: ruleEInt
            {
             before(grammarAccess.getBrickAccess().getPinEIntParserRuleCall_1_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getBrickAccess().getPinEIntParserRuleCall_1_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Brick__PinAssignment_1_3"


    // $ANTLR start "rule__Brick__DebugAssignment_1_4_2"
    // InternalArduinoML.g:4416:1: rule__Brick__DebugAssignment_1_4_2 : ( ruleEBoolean ) ;
    public final void rule__Brick__DebugAssignment_1_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:4420:1: ( ( ruleEBoolean ) )
            // InternalArduinoML.g:4421:2: ( ruleEBoolean )
            {
            // InternalArduinoML.g:4421:2: ( ruleEBoolean )
            // InternalArduinoML.g:4422:3: ruleEBoolean
            {
             before(grammarAccess.getBrickAccess().getDebugEBooleanParserRuleCall_1_4_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEBoolean();

            state._fsp--;

             after(grammarAccess.getBrickAccess().getDebugEBooleanParserRuleCall_1_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Brick__DebugAssignment_1_4_2"


    // $ANTLR start "rule__Mode__NameAssignment_0"
    // InternalArduinoML.g:4431:1: rule__Mode__NameAssignment_0 : ( ruleEString ) ;
    public final void rule__Mode__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:4435:1: ( ( ruleEString ) )
            // InternalArduinoML.g:4436:2: ( ruleEString )
            {
            // InternalArduinoML.g:4436:2: ( ruleEString )
            // InternalArduinoML.g:4437:3: ruleEString
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
    // InternalArduinoML.g:4446:1: rule__Mode__InitialAssignment_3 : ( ( ruleEString ) ) ;
    public final void rule__Mode__InitialAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:4450:1: ( ( ( ruleEString ) ) )
            // InternalArduinoML.g:4451:2: ( ( ruleEString ) )
            {
            // InternalArduinoML.g:4451:2: ( ( ruleEString ) )
            // InternalArduinoML.g:4452:3: ( ruleEString )
            {
             before(grammarAccess.getModeAccess().getInitialStateCrossReference_3_0()); 
            // InternalArduinoML.g:4453:3: ( ruleEString )
            // InternalArduinoML.g:4454:4: ruleEString
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
    // InternalArduinoML.g:4465:1: rule__Mode__BricksAssignment_5_2 : ( ruleBrick ) ;
    public final void rule__Mode__BricksAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:4469:1: ( ( ruleBrick ) )
            // InternalArduinoML.g:4470:2: ( ruleBrick )
            {
            // InternalArduinoML.g:4470:2: ( ruleBrick )
            // InternalArduinoML.g:4471:3: ruleBrick
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
    // InternalArduinoML.g:4480:1: rule__Mode__BricksAssignment_5_3 : ( ruleBrick ) ;
    public final void rule__Mode__BricksAssignment_5_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:4484:1: ( ( ruleBrick ) )
            // InternalArduinoML.g:4485:2: ( ruleBrick )
            {
            // InternalArduinoML.g:4485:2: ( ruleBrick )
            // InternalArduinoML.g:4486:3: ruleBrick
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
    // InternalArduinoML.g:4495:1: rule__Mode__StatesAssignment_8 : ( ruleState ) ;
    public final void rule__Mode__StatesAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:4499:1: ( ( ruleState ) )
            // InternalArduinoML.g:4500:2: ( ruleState )
            {
            // InternalArduinoML.g:4500:2: ( ruleState )
            // InternalArduinoML.g:4501:3: ruleState
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
    // InternalArduinoML.g:4510:1: rule__Mode__StatesAssignment_9 : ( ruleState ) ;
    public final void rule__Mode__StatesAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:4514:1: ( ( ruleState ) )
            // InternalArduinoML.g:4515:2: ( ruleState )
            {
            // InternalArduinoML.g:4515:2: ( ruleState )
            // InternalArduinoML.g:4516:3: ruleState
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


    // $ANTLR start "rule__Mode__Transitions_modeAssignment_10_2"
    // InternalArduinoML.g:4525:1: rule__Mode__Transitions_modeAssignment_10_2 : ( ruleTransitionMode ) ;
    public final void rule__Mode__Transitions_modeAssignment_10_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:4529:1: ( ( ruleTransitionMode ) )
            // InternalArduinoML.g:4530:2: ( ruleTransitionMode )
            {
            // InternalArduinoML.g:4530:2: ( ruleTransitionMode )
            // InternalArduinoML.g:4531:3: ruleTransitionMode
            {
             before(grammarAccess.getModeAccess().getTransitions_modeTransitionModeParserRuleCall_10_2_0()); 
            pushFollow(FOLLOW_2);
            ruleTransitionMode();

            state._fsp--;

             after(grammarAccess.getModeAccess().getTransitions_modeTransitionModeParserRuleCall_10_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mode__Transitions_modeAssignment_10_2"


    // $ANTLR start "rule__Mode__Transitions_modeAssignment_10_3"
    // InternalArduinoML.g:4540:1: rule__Mode__Transitions_modeAssignment_10_3 : ( ruleTransitionMode ) ;
    public final void rule__Mode__Transitions_modeAssignment_10_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:4544:1: ( ( ruleTransitionMode ) )
            // InternalArduinoML.g:4545:2: ( ruleTransitionMode )
            {
            // InternalArduinoML.g:4545:2: ( ruleTransitionMode )
            // InternalArduinoML.g:4546:3: ruleTransitionMode
            {
             before(grammarAccess.getModeAccess().getTransitions_modeTransitionModeParserRuleCall_10_3_0()); 
            pushFollow(FOLLOW_2);
            ruleTransitionMode();

            state._fsp--;

             after(grammarAccess.getModeAccess().getTransitions_modeTransitionModeParserRuleCall_10_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mode__Transitions_modeAssignment_10_3"


    // $ANTLR start "rule__State__NameAssignment_0"
    // InternalArduinoML.g:4555:1: rule__State__NameAssignment_0 : ( ruleEString ) ;
    public final void rule__State__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:4559:1: ( ( ruleEString ) )
            // InternalArduinoML.g:4560:2: ( ruleEString )
            {
            // InternalArduinoML.g:4560:2: ( ruleEString )
            // InternalArduinoML.g:4561:3: ruleEString
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
    // InternalArduinoML.g:4570:1: rule__State__ActionsAssignment_2 : ( ruleAction ) ;
    public final void rule__State__ActionsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:4574:1: ( ( ruleAction ) )
            // InternalArduinoML.g:4575:2: ( ruleAction )
            {
            // InternalArduinoML.g:4575:2: ( ruleAction )
            // InternalArduinoML.g:4576:3: ruleAction
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
    // InternalArduinoML.g:4585:1: rule__State__ActionsAssignment_3 : ( ruleAction ) ;
    public final void rule__State__ActionsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:4589:1: ( ( ruleAction ) )
            // InternalArduinoML.g:4590:2: ( ruleAction )
            {
            // InternalArduinoML.g:4590:2: ( ruleAction )
            // InternalArduinoML.g:4591:3: ruleAction
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
    // InternalArduinoML.g:4600:1: rule__State__Transitions_stateAssignment_4 : ( ruleTransitionState ) ;
    public final void rule__State__Transitions_stateAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:4604:1: ( ( ruleTransitionState ) )
            // InternalArduinoML.g:4605:2: ( ruleTransitionState )
            {
            // InternalArduinoML.g:4605:2: ( ruleTransitionState )
            // InternalArduinoML.g:4606:3: ruleTransitionState
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
    // InternalArduinoML.g:4615:1: rule__State__Transitions_stateAssignment_5 : ( ruleTransitionState ) ;
    public final void rule__State__Transitions_stateAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:4619:1: ( ( ruleTransitionState ) )
            // InternalArduinoML.g:4620:2: ( ruleTransitionState )
            {
            // InternalArduinoML.g:4620:2: ( ruleTransitionState )
            // InternalArduinoML.g:4621:3: ruleTransitionState
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
    // InternalArduinoML.g:4630:1: rule__Action__ActuatorAssignment_1 : ( ( ruleEString ) ) ;
    public final void rule__Action__ActuatorAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:4634:1: ( ( ( ruleEString ) ) )
            // InternalArduinoML.g:4635:2: ( ( ruleEString ) )
            {
            // InternalArduinoML.g:4635:2: ( ( ruleEString ) )
            // InternalArduinoML.g:4636:3: ( ruleEString )
            {
             before(grammarAccess.getActionAccess().getActuatorActuatorCrossReference_1_0()); 
            // InternalArduinoML.g:4637:3: ( ruleEString )
            // InternalArduinoML.g:4638:4: ruleEString
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
    // InternalArduinoML.g:4649:1: rule__Action__ValueAssignment_3 : ( ruleSignal ) ;
    public final void rule__Action__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:4653:1: ( ( ruleSignal ) )
            // InternalArduinoML.g:4654:2: ( ruleSignal )
            {
            // InternalArduinoML.g:4654:2: ( ruleSignal )
            // InternalArduinoML.g:4655:3: ruleSignal
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
    // InternalArduinoML.g:4664:1: rule__TransitionState__DigitalsAssignment_0_0_1_0_0 : ( ( ruleEString ) ) ;
    public final void rule__TransitionState__DigitalsAssignment_0_0_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:4668:1: ( ( ( ruleEString ) ) )
            // InternalArduinoML.g:4669:2: ( ( ruleEString ) )
            {
            // InternalArduinoML.g:4669:2: ( ( ruleEString ) )
            // InternalArduinoML.g:4670:3: ( ruleEString )
            {
             before(grammarAccess.getTransitionStateAccess().getDigitalsDigitalCrossReference_0_0_1_0_0_0()); 
            // InternalArduinoML.g:4671:3: ( ruleEString )
            // InternalArduinoML.g:4672:4: ruleEString
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
    // InternalArduinoML.g:4683:1: rule__TransitionState__D_valuesAssignment_0_0_1_0_2 : ( ruleSignal ) ;
    public final void rule__TransitionState__D_valuesAssignment_0_0_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:4687:1: ( ( ruleSignal ) )
            // InternalArduinoML.g:4688:2: ( ruleSignal )
            {
            // InternalArduinoML.g:4688:2: ( ruleSignal )
            // InternalArduinoML.g:4689:3: ruleSignal
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
    // InternalArduinoML.g:4698:1: rule__TransitionState__AnalogsAssignment_0_0_1_1_0 : ( ( ruleEString ) ) ;
    public final void rule__TransitionState__AnalogsAssignment_0_0_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:4702:1: ( ( ( ruleEString ) ) )
            // InternalArduinoML.g:4703:2: ( ( ruleEString ) )
            {
            // InternalArduinoML.g:4703:2: ( ( ruleEString ) )
            // InternalArduinoML.g:4704:3: ( ruleEString )
            {
             before(grammarAccess.getTransitionStateAccess().getAnalogsAnalogCrossReference_0_0_1_1_0_0()); 
            // InternalArduinoML.g:4705:3: ( ruleEString )
            // InternalArduinoML.g:4706:4: ruleEString
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
    // InternalArduinoML.g:4717:1: rule__TransitionState__CompAssignment_0_0_1_1_1 : ( ruleCompare ) ;
    public final void rule__TransitionState__CompAssignment_0_0_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:4721:1: ( ( ruleCompare ) )
            // InternalArduinoML.g:4722:2: ( ruleCompare )
            {
            // InternalArduinoML.g:4722:2: ( ruleCompare )
            // InternalArduinoML.g:4723:3: ruleCompare
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
    // InternalArduinoML.g:4732:1: rule__TransitionState__A_valuesAssignment_0_0_1_1_2 : ( ruleEInt ) ;
    public final void rule__TransitionState__A_valuesAssignment_0_0_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:4736:1: ( ( ruleEInt ) )
            // InternalArduinoML.g:4737:2: ( ruleEInt )
            {
            // InternalArduinoML.g:4737:2: ( ruleEInt )
            // InternalArduinoML.g:4738:3: ruleEInt
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
    // InternalArduinoML.g:4747:1: rule__TransitionState__DigitalsAssignment_0_0_2_1_0_0 : ( ( ruleEString ) ) ;
    public final void rule__TransitionState__DigitalsAssignment_0_0_2_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:4751:1: ( ( ( ruleEString ) ) )
            // InternalArduinoML.g:4752:2: ( ( ruleEString ) )
            {
            // InternalArduinoML.g:4752:2: ( ( ruleEString ) )
            // InternalArduinoML.g:4753:3: ( ruleEString )
            {
             before(grammarAccess.getTransitionStateAccess().getDigitalsDigitalCrossReference_0_0_2_1_0_0_0()); 
            // InternalArduinoML.g:4754:3: ( ruleEString )
            // InternalArduinoML.g:4755:4: ruleEString
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
    // InternalArduinoML.g:4766:1: rule__TransitionState__D_valuesAssignment_0_0_2_1_0_2 : ( ruleSignal ) ;
    public final void rule__TransitionState__D_valuesAssignment_0_0_2_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:4770:1: ( ( ruleSignal ) )
            // InternalArduinoML.g:4771:2: ( ruleSignal )
            {
            // InternalArduinoML.g:4771:2: ( ruleSignal )
            // InternalArduinoML.g:4772:3: ruleSignal
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
    // InternalArduinoML.g:4781:1: rule__TransitionState__AnalogsAssignment_0_0_2_1_1_0 : ( ( ruleEString ) ) ;
    public final void rule__TransitionState__AnalogsAssignment_0_0_2_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:4785:1: ( ( ( ruleEString ) ) )
            // InternalArduinoML.g:4786:2: ( ( ruleEString ) )
            {
            // InternalArduinoML.g:4786:2: ( ( ruleEString ) )
            // InternalArduinoML.g:4787:3: ( ruleEString )
            {
             before(grammarAccess.getTransitionStateAccess().getAnalogsAnalogCrossReference_0_0_2_1_1_0_0()); 
            // InternalArduinoML.g:4788:3: ( ruleEString )
            // InternalArduinoML.g:4789:4: ruleEString
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
    // InternalArduinoML.g:4800:1: rule__TransitionState__CompAssignment_0_0_2_1_1_1 : ( ruleCompare ) ;
    public final void rule__TransitionState__CompAssignment_0_0_2_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:4804:1: ( ( ruleCompare ) )
            // InternalArduinoML.g:4805:2: ( ruleCompare )
            {
            // InternalArduinoML.g:4805:2: ( ruleCompare )
            // InternalArduinoML.g:4806:3: ruleCompare
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
    // InternalArduinoML.g:4815:1: rule__TransitionState__A_valuesAssignment_0_0_2_1_1_2 : ( ruleEInt ) ;
    public final void rule__TransitionState__A_valuesAssignment_0_0_2_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:4819:1: ( ( ruleEInt ) )
            // InternalArduinoML.g:4820:2: ( ruleEInt )
            {
            // InternalArduinoML.g:4820:2: ( ruleEInt )
            // InternalArduinoML.g:4821:3: ruleEInt
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
    // InternalArduinoML.g:4830:1: rule__TransitionState__TimeAssignment_0_0_3_1 : ( ruleEInt ) ;
    public final void rule__TransitionState__TimeAssignment_0_0_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:4834:1: ( ( ruleEInt ) )
            // InternalArduinoML.g:4835:2: ( ruleEInt )
            {
            // InternalArduinoML.g:4835:2: ( ruleEInt )
            // InternalArduinoML.g:4836:3: ruleEInt
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
    // InternalArduinoML.g:4845:1: rule__TransitionState__UnitAssignment_0_0_3_2 : ( ruleTime_unit ) ;
    public final void rule__TransitionState__UnitAssignment_0_0_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:4849:1: ( ( ruleTime_unit ) )
            // InternalArduinoML.g:4850:2: ( ruleTime_unit )
            {
            // InternalArduinoML.g:4850:2: ( ruleTime_unit )
            // InternalArduinoML.g:4851:3: ruleTime_unit
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
    // InternalArduinoML.g:4860:1: rule__TransitionState__TimeAssignment_0_1_1 : ( ruleEInt ) ;
    public final void rule__TransitionState__TimeAssignment_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:4864:1: ( ( ruleEInt ) )
            // InternalArduinoML.g:4865:2: ( ruleEInt )
            {
            // InternalArduinoML.g:4865:2: ( ruleEInt )
            // InternalArduinoML.g:4866:3: ruleEInt
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
    // InternalArduinoML.g:4875:1: rule__TransitionState__UnitAssignment_0_1_2 : ( ruleTime_unit ) ;
    public final void rule__TransitionState__UnitAssignment_0_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:4879:1: ( ( ruleTime_unit ) )
            // InternalArduinoML.g:4880:2: ( ruleTime_unit )
            {
            // InternalArduinoML.g:4880:2: ( ruleTime_unit )
            // InternalArduinoML.g:4881:3: ruleTime_unit
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
    // InternalArduinoML.g:4890:1: rule__TransitionState__Next_stateAssignment_4 : ( ( ruleEString ) ) ;
    public final void rule__TransitionState__Next_stateAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:4894:1: ( ( ( ruleEString ) ) )
            // InternalArduinoML.g:4895:2: ( ( ruleEString ) )
            {
            // InternalArduinoML.g:4895:2: ( ( ruleEString ) )
            // InternalArduinoML.g:4896:3: ( ruleEString )
            {
             before(grammarAccess.getTransitionStateAccess().getNext_stateStateCrossReference_4_0()); 
            // InternalArduinoML.g:4897:3: ( ruleEString )
            // InternalArduinoML.g:4898:4: ruleEString
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
    // InternalArduinoML.g:4909:1: rule__TransitionMode__DigitalsAssignment_0_0_1_0_0 : ( ( ruleEString ) ) ;
    public final void rule__TransitionMode__DigitalsAssignment_0_0_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:4913:1: ( ( ( ruleEString ) ) )
            // InternalArduinoML.g:4914:2: ( ( ruleEString ) )
            {
            // InternalArduinoML.g:4914:2: ( ( ruleEString ) )
            // InternalArduinoML.g:4915:3: ( ruleEString )
            {
             before(grammarAccess.getTransitionModeAccess().getDigitalsDigitalCrossReference_0_0_1_0_0_0()); 
            // InternalArduinoML.g:4916:3: ( ruleEString )
            // InternalArduinoML.g:4917:4: ruleEString
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
    // InternalArduinoML.g:4928:1: rule__TransitionMode__D_valuesAssignment_0_0_1_0_2 : ( ruleSignal ) ;
    public final void rule__TransitionMode__D_valuesAssignment_0_0_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:4932:1: ( ( ruleSignal ) )
            // InternalArduinoML.g:4933:2: ( ruleSignal )
            {
            // InternalArduinoML.g:4933:2: ( ruleSignal )
            // InternalArduinoML.g:4934:3: ruleSignal
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
    // InternalArduinoML.g:4943:1: rule__TransitionMode__AnalogsAssignment_0_0_1_1_0 : ( ( ruleEString ) ) ;
    public final void rule__TransitionMode__AnalogsAssignment_0_0_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:4947:1: ( ( ( ruleEString ) ) )
            // InternalArduinoML.g:4948:2: ( ( ruleEString ) )
            {
            // InternalArduinoML.g:4948:2: ( ( ruleEString ) )
            // InternalArduinoML.g:4949:3: ( ruleEString )
            {
             before(grammarAccess.getTransitionModeAccess().getAnalogsAnalogCrossReference_0_0_1_1_0_0()); 
            // InternalArduinoML.g:4950:3: ( ruleEString )
            // InternalArduinoML.g:4951:4: ruleEString
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
    // InternalArduinoML.g:4962:1: rule__TransitionMode__CompAssignment_0_0_1_1_1 : ( ruleCompare ) ;
    public final void rule__TransitionMode__CompAssignment_0_0_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:4966:1: ( ( ruleCompare ) )
            // InternalArduinoML.g:4967:2: ( ruleCompare )
            {
            // InternalArduinoML.g:4967:2: ( ruleCompare )
            // InternalArduinoML.g:4968:3: ruleCompare
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
    // InternalArduinoML.g:4977:1: rule__TransitionMode__A_valuesAssignment_0_0_1_1_2 : ( ruleEInt ) ;
    public final void rule__TransitionMode__A_valuesAssignment_0_0_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:4981:1: ( ( ruleEInt ) )
            // InternalArduinoML.g:4982:2: ( ruleEInt )
            {
            // InternalArduinoML.g:4982:2: ( ruleEInt )
            // InternalArduinoML.g:4983:3: ruleEInt
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
    // InternalArduinoML.g:4992:1: rule__TransitionMode__DigitalsAssignment_0_0_2_1_0_0 : ( ( ruleEString ) ) ;
    public final void rule__TransitionMode__DigitalsAssignment_0_0_2_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:4996:1: ( ( ( ruleEString ) ) )
            // InternalArduinoML.g:4997:2: ( ( ruleEString ) )
            {
            // InternalArduinoML.g:4997:2: ( ( ruleEString ) )
            // InternalArduinoML.g:4998:3: ( ruleEString )
            {
             before(grammarAccess.getTransitionModeAccess().getDigitalsDigitalCrossReference_0_0_2_1_0_0_0()); 
            // InternalArduinoML.g:4999:3: ( ruleEString )
            // InternalArduinoML.g:5000:4: ruleEString
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
    // InternalArduinoML.g:5011:1: rule__TransitionMode__D_valuesAssignment_0_0_2_1_0_2 : ( ruleSignal ) ;
    public final void rule__TransitionMode__D_valuesAssignment_0_0_2_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:5015:1: ( ( ruleSignal ) )
            // InternalArduinoML.g:5016:2: ( ruleSignal )
            {
            // InternalArduinoML.g:5016:2: ( ruleSignal )
            // InternalArduinoML.g:5017:3: ruleSignal
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
    // InternalArduinoML.g:5026:1: rule__TransitionMode__AnalogsAssignment_0_0_2_1_1_0 : ( ( ruleEString ) ) ;
    public final void rule__TransitionMode__AnalogsAssignment_0_0_2_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:5030:1: ( ( ( ruleEString ) ) )
            // InternalArduinoML.g:5031:2: ( ( ruleEString ) )
            {
            // InternalArduinoML.g:5031:2: ( ( ruleEString ) )
            // InternalArduinoML.g:5032:3: ( ruleEString )
            {
             before(grammarAccess.getTransitionModeAccess().getAnalogsAnalogCrossReference_0_0_2_1_1_0_0()); 
            // InternalArduinoML.g:5033:3: ( ruleEString )
            // InternalArduinoML.g:5034:4: ruleEString
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
    // InternalArduinoML.g:5045:1: rule__TransitionMode__CompAssignment_0_0_2_1_1_1 : ( ruleCompare ) ;
    public final void rule__TransitionMode__CompAssignment_0_0_2_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:5049:1: ( ( ruleCompare ) )
            // InternalArduinoML.g:5050:2: ( ruleCompare )
            {
            // InternalArduinoML.g:5050:2: ( ruleCompare )
            // InternalArduinoML.g:5051:3: ruleCompare
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
    // InternalArduinoML.g:5060:1: rule__TransitionMode__A_valuesAssignment_0_0_2_1_1_2 : ( ruleEInt ) ;
    public final void rule__TransitionMode__A_valuesAssignment_0_0_2_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:5064:1: ( ( ruleEInt ) )
            // InternalArduinoML.g:5065:2: ( ruleEInt )
            {
            // InternalArduinoML.g:5065:2: ( ruleEInt )
            // InternalArduinoML.g:5066:3: ruleEInt
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
    // InternalArduinoML.g:5075:1: rule__TransitionMode__TimeAssignment_0_0_3_1 : ( ruleEInt ) ;
    public final void rule__TransitionMode__TimeAssignment_0_0_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:5079:1: ( ( ruleEInt ) )
            // InternalArduinoML.g:5080:2: ( ruleEInt )
            {
            // InternalArduinoML.g:5080:2: ( ruleEInt )
            // InternalArduinoML.g:5081:3: ruleEInt
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
    // InternalArduinoML.g:5090:1: rule__TransitionMode__UnitAssignment_0_0_3_2 : ( ruleTime_unit ) ;
    public final void rule__TransitionMode__UnitAssignment_0_0_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:5094:1: ( ( ruleTime_unit ) )
            // InternalArduinoML.g:5095:2: ( ruleTime_unit )
            {
            // InternalArduinoML.g:5095:2: ( ruleTime_unit )
            // InternalArduinoML.g:5096:3: ruleTime_unit
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
    // InternalArduinoML.g:5105:1: rule__TransitionMode__TimeAssignment_0_1_1 : ( ruleEInt ) ;
    public final void rule__TransitionMode__TimeAssignment_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:5109:1: ( ( ruleEInt ) )
            // InternalArduinoML.g:5110:2: ( ruleEInt )
            {
            // InternalArduinoML.g:5110:2: ( ruleEInt )
            // InternalArduinoML.g:5111:3: ruleEInt
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
    // InternalArduinoML.g:5120:1: rule__TransitionMode__UnitAssignment_0_1_2 : ( ruleTime_unit ) ;
    public final void rule__TransitionMode__UnitAssignment_0_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:5124:1: ( ( ruleTime_unit ) )
            // InternalArduinoML.g:5125:2: ( ruleTime_unit )
            {
            // InternalArduinoML.g:5125:2: ( ruleTime_unit )
            // InternalArduinoML.g:5126:3: ruleTime_unit
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
    // InternalArduinoML.g:5135:1: rule__TransitionMode__Next_modeAssignment_4 : ( ( ruleEString ) ) ;
    public final void rule__TransitionMode__Next_modeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:5139:1: ( ( ( ruleEString ) ) )
            // InternalArduinoML.g:5140:2: ( ( ruleEString ) )
            {
            // InternalArduinoML.g:5140:2: ( ( ruleEString ) )
            // InternalArduinoML.g:5141:3: ( ruleEString )
            {
             before(grammarAccess.getTransitionModeAccess().getNext_modeModeCrossReference_4_0()); 
            // InternalArduinoML.g:5142:3: ( ruleEString )
            // InternalArduinoML.g:5143:4: ruleEString
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000000000000C0L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000003800000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000003820000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000003800000002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x00000000000000C2L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000210000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x00000004000000C0L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000120000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000120000000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000124000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000124000000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000001800000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000180000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x00000000003E0000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x000000000001C000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000200000000000L});

}