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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'HIGH'", "'LOW'", "'app'", "'initial state'", "'{'", "'bricks'", "'states'", "'}'", "':'", "'-'", "'Actuator'", "'Sensor'", "'change'", "'to'", "'when'", "'is'", "'go to'", "'wait'", "'then go to'"
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


    // $ANTLR start "entryRuleState"
    // InternalArduinoML.g:128:1: entryRuleState : ruleState EOF ;
    public final void entryRuleState() throws RecognitionException {
        try {
            // InternalArduinoML.g:129:1: ( ruleState EOF )
            // InternalArduinoML.g:130:1: ruleState EOF
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
    // InternalArduinoML.g:137:1: ruleState : ( ( rule__State__Group__0 ) ) ;
    public final void ruleState() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:141:2: ( ( ( rule__State__Group__0 ) ) )
            // InternalArduinoML.g:142:2: ( ( rule__State__Group__0 ) )
            {
            // InternalArduinoML.g:142:2: ( ( rule__State__Group__0 ) )
            // InternalArduinoML.g:143:3: ( rule__State__Group__0 )
            {
             before(grammarAccess.getStateAccess().getGroup()); 
            // InternalArduinoML.g:144:3: ( rule__State__Group__0 )
            // InternalArduinoML.g:144:4: rule__State__Group__0
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
    // InternalArduinoML.g:153:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // InternalArduinoML.g:154:1: ( ruleEInt EOF )
            // InternalArduinoML.g:155:1: ruleEInt EOF
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
    // InternalArduinoML.g:162:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:166:2: ( ( ( rule__EInt__Group__0 ) ) )
            // InternalArduinoML.g:167:2: ( ( rule__EInt__Group__0 ) )
            {
            // InternalArduinoML.g:167:2: ( ( rule__EInt__Group__0 ) )
            // InternalArduinoML.g:168:3: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // InternalArduinoML.g:169:3: ( rule__EInt__Group__0 )
            // InternalArduinoML.g:169:4: rule__EInt__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EInt__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEIntAccess().getGroup()); 

            }


            }

        }
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
    // InternalArduinoML.g:178:1: entryRuleActuator : ruleActuator EOF ;
    public final void entryRuleActuator() throws RecognitionException {
        try {
            // InternalArduinoML.g:179:1: ( ruleActuator EOF )
            // InternalArduinoML.g:180:1: ruleActuator EOF
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
    // InternalArduinoML.g:187:1: ruleActuator : ( ( rule__Actuator__Group__0 ) ) ;
    public final void ruleActuator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:191:2: ( ( ( rule__Actuator__Group__0 ) ) )
            // InternalArduinoML.g:192:2: ( ( rule__Actuator__Group__0 ) )
            {
            // InternalArduinoML.g:192:2: ( ( rule__Actuator__Group__0 ) )
            // InternalArduinoML.g:193:3: ( rule__Actuator__Group__0 )
            {
             before(grammarAccess.getActuatorAccess().getGroup()); 
            // InternalArduinoML.g:194:3: ( rule__Actuator__Group__0 )
            // InternalArduinoML.g:194:4: rule__Actuator__Group__0
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


    // $ANTLR start "entryRuleSensor"
    // InternalArduinoML.g:203:1: entryRuleSensor : ruleSensor EOF ;
    public final void entryRuleSensor() throws RecognitionException {
        try {
            // InternalArduinoML.g:204:1: ( ruleSensor EOF )
            // InternalArduinoML.g:205:1: ruleSensor EOF
            {
             before(grammarAccess.getSensorRule()); 
            pushFollow(FOLLOW_1);
            ruleSensor();

            state._fsp--;

             after(grammarAccess.getSensorRule()); 
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
    // $ANTLR end "entryRuleSensor"


    // $ANTLR start "ruleSensor"
    // InternalArduinoML.g:212:1: ruleSensor : ( ( rule__Sensor__Group__0 ) ) ;
    public final void ruleSensor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:216:2: ( ( ( rule__Sensor__Group__0 ) ) )
            // InternalArduinoML.g:217:2: ( ( rule__Sensor__Group__0 ) )
            {
            // InternalArduinoML.g:217:2: ( ( rule__Sensor__Group__0 ) )
            // InternalArduinoML.g:218:3: ( rule__Sensor__Group__0 )
            {
             before(grammarAccess.getSensorAccess().getGroup()); 
            // InternalArduinoML.g:219:3: ( rule__Sensor__Group__0 )
            // InternalArduinoML.g:219:4: rule__Sensor__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Sensor__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSensorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSensor"


    // $ANTLR start "entryRuleAction"
    // InternalArduinoML.g:228:1: entryRuleAction : ruleAction EOF ;
    public final void entryRuleAction() throws RecognitionException {
        try {
            // InternalArduinoML.g:229:1: ( ruleAction EOF )
            // InternalArduinoML.g:230:1: ruleAction EOF
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
    // InternalArduinoML.g:237:1: ruleAction : ( ( rule__Action__Group__0 ) ) ;
    public final void ruleAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:241:2: ( ( ( rule__Action__Group__0 ) ) )
            // InternalArduinoML.g:242:2: ( ( rule__Action__Group__0 ) )
            {
            // InternalArduinoML.g:242:2: ( ( rule__Action__Group__0 ) )
            // InternalArduinoML.g:243:3: ( rule__Action__Group__0 )
            {
             before(grammarAccess.getActionAccess().getGroup()); 
            // InternalArduinoML.g:244:3: ( rule__Action__Group__0 )
            // InternalArduinoML.g:244:4: rule__Action__Group__0
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
    // InternalArduinoML.g:253:1: entryRuleTransition : ruleTransition EOF ;
    public final void entryRuleTransition() throws RecognitionException {
        try {
            // InternalArduinoML.g:254:1: ( ruleTransition EOF )
            // InternalArduinoML.g:255:1: ruleTransition EOF
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
    // InternalArduinoML.g:262:1: ruleTransition : ( ( rule__Transition__Alternatives ) ) ;
    public final void ruleTransition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:266:2: ( ( ( rule__Transition__Alternatives ) ) )
            // InternalArduinoML.g:267:2: ( ( rule__Transition__Alternatives ) )
            {
            // InternalArduinoML.g:267:2: ( ( rule__Transition__Alternatives ) )
            // InternalArduinoML.g:268:3: ( rule__Transition__Alternatives )
            {
             before(grammarAccess.getTransitionAccess().getAlternatives()); 
            // InternalArduinoML.g:269:3: ( rule__Transition__Alternatives )
            // InternalArduinoML.g:269:4: rule__Transition__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Transition__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getAlternatives()); 

            }


            }

        }
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
    // InternalArduinoML.g:278:1: ruleSignal : ( ( rule__Signal__Alternatives ) ) ;
    public final void ruleSignal() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:282:1: ( ( ( rule__Signal__Alternatives ) ) )
            // InternalArduinoML.g:283:2: ( ( rule__Signal__Alternatives ) )
            {
            // InternalArduinoML.g:283:2: ( ( rule__Signal__Alternatives ) )
            // InternalArduinoML.g:284:3: ( rule__Signal__Alternatives )
            {
             before(grammarAccess.getSignalAccess().getAlternatives()); 
            // InternalArduinoML.g:285:3: ( rule__Signal__Alternatives )
            // InternalArduinoML.g:285:4: rule__Signal__Alternatives
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


    // $ANTLR start "rule__Brick__Alternatives_0"
    // InternalArduinoML.g:293:1: rule__Brick__Alternatives_0 : ( ( ruleActuator ) | ( ruleSensor ) );
    public final void rule__Brick__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:297:1: ( ( ruleActuator ) | ( ruleSensor ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==21) ) {
                alt1=1;
            }
            else if ( (LA1_0==22) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalArduinoML.g:298:2: ( ruleActuator )
                    {
                    // InternalArduinoML.g:298:2: ( ruleActuator )
                    // InternalArduinoML.g:299:3: ruleActuator
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
                    // InternalArduinoML.g:304:2: ( ruleSensor )
                    {
                    // InternalArduinoML.g:304:2: ( ruleSensor )
                    // InternalArduinoML.g:305:3: ruleSensor
                    {
                     before(grammarAccess.getBrickAccess().getSensorParserRuleCall_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleSensor();

                    state._fsp--;

                     after(grammarAccess.getBrickAccess().getSensorParserRuleCall_0_1()); 

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
    // InternalArduinoML.g:314:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:318:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_STRING) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_ID) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalArduinoML.g:319:2: ( RULE_STRING )
                    {
                    // InternalArduinoML.g:319:2: ( RULE_STRING )
                    // InternalArduinoML.g:320:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalArduinoML.g:325:2: ( RULE_ID )
                    {
                    // InternalArduinoML.g:325:2: ( RULE_ID )
                    // InternalArduinoML.g:326:3: RULE_ID
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


    // $ANTLR start "rule__Transition__Alternatives"
    // InternalArduinoML.g:335:1: rule__Transition__Alternatives : ( ( ( rule__Transition__Group_0__0 ) ) | ( ( rule__Transition__Group_1__0 ) ) );
    public final void rule__Transition__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:339:1: ( ( ( rule__Transition__Group_0__0 ) ) | ( ( rule__Transition__Group_1__0 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==25) ) {
                alt3=1;
            }
            else if ( (LA3_0==28) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalArduinoML.g:340:2: ( ( rule__Transition__Group_0__0 ) )
                    {
                    // InternalArduinoML.g:340:2: ( ( rule__Transition__Group_0__0 ) )
                    // InternalArduinoML.g:341:3: ( rule__Transition__Group_0__0 )
                    {
                     before(grammarAccess.getTransitionAccess().getGroup_0()); 
                    // InternalArduinoML.g:342:3: ( rule__Transition__Group_0__0 )
                    // InternalArduinoML.g:342:4: rule__Transition__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Transition__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTransitionAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalArduinoML.g:346:2: ( ( rule__Transition__Group_1__0 ) )
                    {
                    // InternalArduinoML.g:346:2: ( ( rule__Transition__Group_1__0 ) )
                    // InternalArduinoML.g:347:3: ( rule__Transition__Group_1__0 )
                    {
                     before(grammarAccess.getTransitionAccess().getGroup_1()); 
                    // InternalArduinoML.g:348:3: ( rule__Transition__Group_1__0 )
                    // InternalArduinoML.g:348:4: rule__Transition__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Transition__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTransitionAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Transition__Alternatives"


    // $ANTLR start "rule__Signal__Alternatives"
    // InternalArduinoML.g:356:1: rule__Signal__Alternatives : ( ( ( 'HIGH' ) ) | ( ( 'LOW' ) ) );
    public final void rule__Signal__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:360:1: ( ( ( 'HIGH' ) ) | ( ( 'LOW' ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==11) ) {
                alt4=1;
            }
            else if ( (LA4_0==12) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalArduinoML.g:361:2: ( ( 'HIGH' ) )
                    {
                    // InternalArduinoML.g:361:2: ( ( 'HIGH' ) )
                    // InternalArduinoML.g:362:3: ( 'HIGH' )
                    {
                     before(grammarAccess.getSignalAccess().getHIGHEnumLiteralDeclaration_0()); 
                    // InternalArduinoML.g:363:3: ( 'HIGH' )
                    // InternalArduinoML.g:363:4: 'HIGH'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getSignalAccess().getHIGHEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalArduinoML.g:367:2: ( ( 'LOW' ) )
                    {
                    // InternalArduinoML.g:367:2: ( ( 'LOW' ) )
                    // InternalArduinoML.g:368:3: ( 'LOW' )
                    {
                     before(grammarAccess.getSignalAccess().getLOWEnumLiteralDeclaration_1()); 
                    // InternalArduinoML.g:369:3: ( 'LOW' )
                    // InternalArduinoML.g:369:4: 'LOW'
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


    // $ANTLR start "rule__App__Group__0"
    // InternalArduinoML.g:377:1: rule__App__Group__0 : rule__App__Group__0__Impl rule__App__Group__1 ;
    public final void rule__App__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:381:1: ( rule__App__Group__0__Impl rule__App__Group__1 )
            // InternalArduinoML.g:382:2: rule__App__Group__0__Impl rule__App__Group__1
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
    // InternalArduinoML.g:389:1: rule__App__Group__0__Impl : ( 'app' ) ;
    public final void rule__App__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:393:1: ( ( 'app' ) )
            // InternalArduinoML.g:394:1: ( 'app' )
            {
            // InternalArduinoML.g:394:1: ( 'app' )
            // InternalArduinoML.g:395:2: 'app'
            {
             before(grammarAccess.getAppAccess().getAppKeyword_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getAppAccess().getAppKeyword_0()); 

            }


            }

        }
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
    // InternalArduinoML.g:404:1: rule__App__Group__1 : rule__App__Group__1__Impl rule__App__Group__2 ;
    public final void rule__App__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:408:1: ( rule__App__Group__1__Impl rule__App__Group__2 )
            // InternalArduinoML.g:409:2: rule__App__Group__1__Impl rule__App__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__App__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__App__Group__2();

            state._fsp--;


            }

        }
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
    // InternalArduinoML.g:416:1: rule__App__Group__1__Impl : ( ( rule__App__NameAssignment_1 ) ) ;
    public final void rule__App__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:420:1: ( ( ( rule__App__NameAssignment_1 ) ) )
            // InternalArduinoML.g:421:1: ( ( rule__App__NameAssignment_1 ) )
            {
            // InternalArduinoML.g:421:1: ( ( rule__App__NameAssignment_1 ) )
            // InternalArduinoML.g:422:2: ( rule__App__NameAssignment_1 )
            {
             before(grammarAccess.getAppAccess().getNameAssignment_1()); 
            // InternalArduinoML.g:423:2: ( rule__App__NameAssignment_1 )
            // InternalArduinoML.g:423:3: rule__App__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__App__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAppAccess().getNameAssignment_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__App__Group__2"
    // InternalArduinoML.g:431:1: rule__App__Group__2 : rule__App__Group__2__Impl rule__App__Group__3 ;
    public final void rule__App__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:435:1: ( rule__App__Group__2__Impl rule__App__Group__3 )
            // InternalArduinoML.g:436:2: rule__App__Group__2__Impl rule__App__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__App__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__App__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__App__Group__2"


    // $ANTLR start "rule__App__Group__2__Impl"
    // InternalArduinoML.g:443:1: rule__App__Group__2__Impl : ( 'initial state' ) ;
    public final void rule__App__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:447:1: ( ( 'initial state' ) )
            // InternalArduinoML.g:448:1: ( 'initial state' )
            {
            // InternalArduinoML.g:448:1: ( 'initial state' )
            // InternalArduinoML.g:449:2: 'initial state'
            {
             before(grammarAccess.getAppAccess().getInitialStateKeyword_2()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getAppAccess().getInitialStateKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__App__Group__2__Impl"


    // $ANTLR start "rule__App__Group__3"
    // InternalArduinoML.g:458:1: rule__App__Group__3 : rule__App__Group__3__Impl rule__App__Group__4 ;
    public final void rule__App__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:462:1: ( rule__App__Group__3__Impl rule__App__Group__4 )
            // InternalArduinoML.g:463:2: rule__App__Group__3__Impl rule__App__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__App__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__App__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__App__Group__3"


    // $ANTLR start "rule__App__Group__3__Impl"
    // InternalArduinoML.g:470:1: rule__App__Group__3__Impl : ( ( rule__App__InitialAssignment_3 ) ) ;
    public final void rule__App__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:474:1: ( ( ( rule__App__InitialAssignment_3 ) ) )
            // InternalArduinoML.g:475:1: ( ( rule__App__InitialAssignment_3 ) )
            {
            // InternalArduinoML.g:475:1: ( ( rule__App__InitialAssignment_3 ) )
            // InternalArduinoML.g:476:2: ( rule__App__InitialAssignment_3 )
            {
             before(grammarAccess.getAppAccess().getInitialAssignment_3()); 
            // InternalArduinoML.g:477:2: ( rule__App__InitialAssignment_3 )
            // InternalArduinoML.g:477:3: rule__App__InitialAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__App__InitialAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getAppAccess().getInitialAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__App__Group__3__Impl"


    // $ANTLR start "rule__App__Group__4"
    // InternalArduinoML.g:485:1: rule__App__Group__4 : rule__App__Group__4__Impl rule__App__Group__5 ;
    public final void rule__App__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:489:1: ( rule__App__Group__4__Impl rule__App__Group__5 )
            // InternalArduinoML.g:490:2: rule__App__Group__4__Impl rule__App__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__App__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__App__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__App__Group__4"


    // $ANTLR start "rule__App__Group__4__Impl"
    // InternalArduinoML.g:497:1: rule__App__Group__4__Impl : ( '{' ) ;
    public final void rule__App__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:501:1: ( ( '{' ) )
            // InternalArduinoML.g:502:1: ( '{' )
            {
            // InternalArduinoML.g:502:1: ( '{' )
            // InternalArduinoML.g:503:2: '{'
            {
             before(grammarAccess.getAppAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getAppAccess().getLeftCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__App__Group__4__Impl"


    // $ANTLR start "rule__App__Group__5"
    // InternalArduinoML.g:512:1: rule__App__Group__5 : rule__App__Group__5__Impl rule__App__Group__6 ;
    public final void rule__App__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:516:1: ( rule__App__Group__5__Impl rule__App__Group__6 )
            // InternalArduinoML.g:517:2: rule__App__Group__5__Impl rule__App__Group__6
            {
            pushFollow(FOLLOW_7);
            rule__App__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__App__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__App__Group__5"


    // $ANTLR start "rule__App__Group__5__Impl"
    // InternalArduinoML.g:524:1: rule__App__Group__5__Impl : ( 'bricks' ) ;
    public final void rule__App__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:528:1: ( ( 'bricks' ) )
            // InternalArduinoML.g:529:1: ( 'bricks' )
            {
            // InternalArduinoML.g:529:1: ( 'bricks' )
            // InternalArduinoML.g:530:2: 'bricks'
            {
             before(grammarAccess.getAppAccess().getBricksKeyword_5()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getAppAccess().getBricksKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__App__Group__5__Impl"


    // $ANTLR start "rule__App__Group__6"
    // InternalArduinoML.g:539:1: rule__App__Group__6 : rule__App__Group__6__Impl rule__App__Group__7 ;
    public final void rule__App__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:543:1: ( rule__App__Group__6__Impl rule__App__Group__7 )
            // InternalArduinoML.g:544:2: rule__App__Group__6__Impl rule__App__Group__7
            {
            pushFollow(FOLLOW_8);
            rule__App__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__App__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__App__Group__6"


    // $ANTLR start "rule__App__Group__6__Impl"
    // InternalArduinoML.g:551:1: rule__App__Group__6__Impl : ( ( rule__App__BricksAssignment_6 ) ) ;
    public final void rule__App__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:555:1: ( ( ( rule__App__BricksAssignment_6 ) ) )
            // InternalArduinoML.g:556:1: ( ( rule__App__BricksAssignment_6 ) )
            {
            // InternalArduinoML.g:556:1: ( ( rule__App__BricksAssignment_6 ) )
            // InternalArduinoML.g:557:2: ( rule__App__BricksAssignment_6 )
            {
             before(grammarAccess.getAppAccess().getBricksAssignment_6()); 
            // InternalArduinoML.g:558:2: ( rule__App__BricksAssignment_6 )
            // InternalArduinoML.g:558:3: rule__App__BricksAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__App__BricksAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getAppAccess().getBricksAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__App__Group__6__Impl"


    // $ANTLR start "rule__App__Group__7"
    // InternalArduinoML.g:566:1: rule__App__Group__7 : rule__App__Group__7__Impl rule__App__Group__8 ;
    public final void rule__App__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:570:1: ( rule__App__Group__7__Impl rule__App__Group__8 )
            // InternalArduinoML.g:571:2: rule__App__Group__7__Impl rule__App__Group__8
            {
            pushFollow(FOLLOW_8);
            rule__App__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__App__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__App__Group__7"


    // $ANTLR start "rule__App__Group__7__Impl"
    // InternalArduinoML.g:578:1: rule__App__Group__7__Impl : ( ( rule__App__BricksAssignment_7 )* ) ;
    public final void rule__App__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:582:1: ( ( ( rule__App__BricksAssignment_7 )* ) )
            // InternalArduinoML.g:583:1: ( ( rule__App__BricksAssignment_7 )* )
            {
            // InternalArduinoML.g:583:1: ( ( rule__App__BricksAssignment_7 )* )
            // InternalArduinoML.g:584:2: ( rule__App__BricksAssignment_7 )*
            {
             before(grammarAccess.getAppAccess().getBricksAssignment_7()); 
            // InternalArduinoML.g:585:2: ( rule__App__BricksAssignment_7 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=21 && LA5_0<=22)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalArduinoML.g:585:3: rule__App__BricksAssignment_7
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__App__BricksAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getAppAccess().getBricksAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__App__Group__7__Impl"


    // $ANTLR start "rule__App__Group__8"
    // InternalArduinoML.g:593:1: rule__App__Group__8 : rule__App__Group__8__Impl rule__App__Group__9 ;
    public final void rule__App__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:597:1: ( rule__App__Group__8__Impl rule__App__Group__9 )
            // InternalArduinoML.g:598:2: rule__App__Group__8__Impl rule__App__Group__9
            {
            pushFollow(FOLLOW_3);
            rule__App__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__App__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__App__Group__8"


    // $ANTLR start "rule__App__Group__8__Impl"
    // InternalArduinoML.g:605:1: rule__App__Group__8__Impl : ( 'states' ) ;
    public final void rule__App__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:609:1: ( ( 'states' ) )
            // InternalArduinoML.g:610:1: ( 'states' )
            {
            // InternalArduinoML.g:610:1: ( 'states' )
            // InternalArduinoML.g:611:2: 'states'
            {
             before(grammarAccess.getAppAccess().getStatesKeyword_8()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getAppAccess().getStatesKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__App__Group__8__Impl"


    // $ANTLR start "rule__App__Group__9"
    // InternalArduinoML.g:620:1: rule__App__Group__9 : rule__App__Group__9__Impl rule__App__Group__10 ;
    public final void rule__App__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:624:1: ( rule__App__Group__9__Impl rule__App__Group__10 )
            // InternalArduinoML.g:625:2: rule__App__Group__9__Impl rule__App__Group__10
            {
            pushFollow(FOLLOW_10);
            rule__App__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__App__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__App__Group__9"


    // $ANTLR start "rule__App__Group__9__Impl"
    // InternalArduinoML.g:632:1: rule__App__Group__9__Impl : ( ( rule__App__StatesAssignment_9 ) ) ;
    public final void rule__App__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:636:1: ( ( ( rule__App__StatesAssignment_9 ) ) )
            // InternalArduinoML.g:637:1: ( ( rule__App__StatesAssignment_9 ) )
            {
            // InternalArduinoML.g:637:1: ( ( rule__App__StatesAssignment_9 ) )
            // InternalArduinoML.g:638:2: ( rule__App__StatesAssignment_9 )
            {
             before(grammarAccess.getAppAccess().getStatesAssignment_9()); 
            // InternalArduinoML.g:639:2: ( rule__App__StatesAssignment_9 )
            // InternalArduinoML.g:639:3: rule__App__StatesAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__App__StatesAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getAppAccess().getStatesAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__App__Group__9__Impl"


    // $ANTLR start "rule__App__Group__10"
    // InternalArduinoML.g:647:1: rule__App__Group__10 : rule__App__Group__10__Impl rule__App__Group__11 ;
    public final void rule__App__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:651:1: ( rule__App__Group__10__Impl rule__App__Group__11 )
            // InternalArduinoML.g:652:2: rule__App__Group__10__Impl rule__App__Group__11
            {
            pushFollow(FOLLOW_10);
            rule__App__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__App__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__App__Group__10"


    // $ANTLR start "rule__App__Group__10__Impl"
    // InternalArduinoML.g:659:1: rule__App__Group__10__Impl : ( ( rule__App__StatesAssignment_10 )* ) ;
    public final void rule__App__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:663:1: ( ( ( rule__App__StatesAssignment_10 )* ) )
            // InternalArduinoML.g:664:1: ( ( rule__App__StatesAssignment_10 )* )
            {
            // InternalArduinoML.g:664:1: ( ( rule__App__StatesAssignment_10 )* )
            // InternalArduinoML.g:665:2: ( rule__App__StatesAssignment_10 )*
            {
             before(grammarAccess.getAppAccess().getStatesAssignment_10()); 
            // InternalArduinoML.g:666:2: ( rule__App__StatesAssignment_10 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=RULE_STRING && LA6_0<=RULE_ID)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalArduinoML.g:666:3: rule__App__StatesAssignment_10
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__App__StatesAssignment_10();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getAppAccess().getStatesAssignment_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__App__Group__10__Impl"


    // $ANTLR start "rule__App__Group__11"
    // InternalArduinoML.g:674:1: rule__App__Group__11 : rule__App__Group__11__Impl ;
    public final void rule__App__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:678:1: ( rule__App__Group__11__Impl )
            // InternalArduinoML.g:679:2: rule__App__Group__11__Impl
            {
            pushFollow(FOLLOW_2);
            rule__App__Group__11__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__App__Group__11"


    // $ANTLR start "rule__App__Group__11__Impl"
    // InternalArduinoML.g:685:1: rule__App__Group__11__Impl : ( '}' ) ;
    public final void rule__App__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:689:1: ( ( '}' ) )
            // InternalArduinoML.g:690:1: ( '}' )
            {
            // InternalArduinoML.g:690:1: ( '}' )
            // InternalArduinoML.g:691:2: '}'
            {
             before(grammarAccess.getAppAccess().getRightCurlyBracketKeyword_11()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getAppAccess().getRightCurlyBracketKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__App__Group__11__Impl"


    // $ANTLR start "rule__Brick__Group__0"
    // InternalArduinoML.g:701:1: rule__Brick__Group__0 : rule__Brick__Group__0__Impl rule__Brick__Group__1 ;
    public final void rule__Brick__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:705:1: ( rule__Brick__Group__0__Impl rule__Brick__Group__1 )
            // InternalArduinoML.g:706:2: rule__Brick__Group__0__Impl rule__Brick__Group__1
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
    // InternalArduinoML.g:713:1: rule__Brick__Group__0__Impl : ( ( rule__Brick__Alternatives_0 ) ) ;
    public final void rule__Brick__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:717:1: ( ( ( rule__Brick__Alternatives_0 ) ) )
            // InternalArduinoML.g:718:1: ( ( rule__Brick__Alternatives_0 ) )
            {
            // InternalArduinoML.g:718:1: ( ( rule__Brick__Alternatives_0 ) )
            // InternalArduinoML.g:719:2: ( rule__Brick__Alternatives_0 )
            {
             before(grammarAccess.getBrickAccess().getAlternatives_0()); 
            // InternalArduinoML.g:720:2: ( rule__Brick__Alternatives_0 )
            // InternalArduinoML.g:720:3: rule__Brick__Alternatives_0
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
    // InternalArduinoML.g:728:1: rule__Brick__Group__1 : rule__Brick__Group__1__Impl rule__Brick__Group__2 ;
    public final void rule__Brick__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:732:1: ( rule__Brick__Group__1__Impl rule__Brick__Group__2 )
            // InternalArduinoML.g:733:2: rule__Brick__Group__1__Impl rule__Brick__Group__2
            {
            pushFollow(FOLLOW_12);
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
    // InternalArduinoML.g:740:1: rule__Brick__Group__1__Impl : ( ( rule__Brick__NameAssignment_1 ) ) ;
    public final void rule__Brick__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:744:1: ( ( ( rule__Brick__NameAssignment_1 ) ) )
            // InternalArduinoML.g:745:1: ( ( rule__Brick__NameAssignment_1 ) )
            {
            // InternalArduinoML.g:745:1: ( ( rule__Brick__NameAssignment_1 ) )
            // InternalArduinoML.g:746:2: ( rule__Brick__NameAssignment_1 )
            {
             before(grammarAccess.getBrickAccess().getNameAssignment_1()); 
            // InternalArduinoML.g:747:2: ( rule__Brick__NameAssignment_1 )
            // InternalArduinoML.g:747:3: rule__Brick__NameAssignment_1
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
    // InternalArduinoML.g:755:1: rule__Brick__Group__2 : rule__Brick__Group__2__Impl rule__Brick__Group__3 ;
    public final void rule__Brick__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:759:1: ( rule__Brick__Group__2__Impl rule__Brick__Group__3 )
            // InternalArduinoML.g:760:2: rule__Brick__Group__2__Impl rule__Brick__Group__3
            {
            pushFollow(FOLLOW_13);
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
    // InternalArduinoML.g:767:1: rule__Brick__Group__2__Impl : ( ':' ) ;
    public final void rule__Brick__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:771:1: ( ( ':' ) )
            // InternalArduinoML.g:772:1: ( ':' )
            {
            // InternalArduinoML.g:772:1: ( ':' )
            // InternalArduinoML.g:773:2: ':'
            {
             before(grammarAccess.getBrickAccess().getColonKeyword_2()); 
            match(input,19,FOLLOW_2); 
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
    // InternalArduinoML.g:782:1: rule__Brick__Group__3 : rule__Brick__Group__3__Impl ;
    public final void rule__Brick__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:786:1: ( rule__Brick__Group__3__Impl )
            // InternalArduinoML.g:787:2: rule__Brick__Group__3__Impl
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
    // InternalArduinoML.g:793:1: rule__Brick__Group__3__Impl : ( ( rule__Brick__PinAssignment_3 ) ) ;
    public final void rule__Brick__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:797:1: ( ( ( rule__Brick__PinAssignment_3 ) ) )
            // InternalArduinoML.g:798:1: ( ( rule__Brick__PinAssignment_3 ) )
            {
            // InternalArduinoML.g:798:1: ( ( rule__Brick__PinAssignment_3 ) )
            // InternalArduinoML.g:799:2: ( rule__Brick__PinAssignment_3 )
            {
             before(grammarAccess.getBrickAccess().getPinAssignment_3()); 
            // InternalArduinoML.g:800:2: ( rule__Brick__PinAssignment_3 )
            // InternalArduinoML.g:800:3: rule__Brick__PinAssignment_3
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


    // $ANTLR start "rule__State__Group__0"
    // InternalArduinoML.g:809:1: rule__State__Group__0 : rule__State__Group__0__Impl rule__State__Group__1 ;
    public final void rule__State__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:813:1: ( rule__State__Group__0__Impl rule__State__Group__1 )
            // InternalArduinoML.g:814:2: rule__State__Group__0__Impl rule__State__Group__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalArduinoML.g:821:1: rule__State__Group__0__Impl : ( ( rule__State__NameAssignment_0 ) ) ;
    public final void rule__State__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:825:1: ( ( ( rule__State__NameAssignment_0 ) ) )
            // InternalArduinoML.g:826:1: ( ( rule__State__NameAssignment_0 ) )
            {
            // InternalArduinoML.g:826:1: ( ( rule__State__NameAssignment_0 ) )
            // InternalArduinoML.g:827:2: ( rule__State__NameAssignment_0 )
            {
             before(grammarAccess.getStateAccess().getNameAssignment_0()); 
            // InternalArduinoML.g:828:2: ( rule__State__NameAssignment_0 )
            // InternalArduinoML.g:828:3: rule__State__NameAssignment_0
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
    // InternalArduinoML.g:836:1: rule__State__Group__1 : rule__State__Group__1__Impl rule__State__Group__2 ;
    public final void rule__State__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:840:1: ( rule__State__Group__1__Impl rule__State__Group__2 )
            // InternalArduinoML.g:841:2: rule__State__Group__1__Impl rule__State__Group__2
            {
            pushFollow(FOLLOW_14);
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
    // InternalArduinoML.g:848:1: rule__State__Group__1__Impl : ( '{' ) ;
    public final void rule__State__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:852:1: ( ( '{' ) )
            // InternalArduinoML.g:853:1: ( '{' )
            {
            // InternalArduinoML.g:853:1: ( '{' )
            // InternalArduinoML.g:854:2: '{'
            {
             before(grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
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
    // InternalArduinoML.g:863:1: rule__State__Group__2 : rule__State__Group__2__Impl rule__State__Group__3 ;
    public final void rule__State__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:867:1: ( rule__State__Group__2__Impl rule__State__Group__3 )
            // InternalArduinoML.g:868:2: rule__State__Group__2__Impl rule__State__Group__3
            {
            pushFollow(FOLLOW_15);
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
    // InternalArduinoML.g:875:1: rule__State__Group__2__Impl : ( ( rule__State__ActionsAssignment_2 ) ) ;
    public final void rule__State__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:879:1: ( ( ( rule__State__ActionsAssignment_2 ) ) )
            // InternalArduinoML.g:880:1: ( ( rule__State__ActionsAssignment_2 ) )
            {
            // InternalArduinoML.g:880:1: ( ( rule__State__ActionsAssignment_2 ) )
            // InternalArduinoML.g:881:2: ( rule__State__ActionsAssignment_2 )
            {
             before(grammarAccess.getStateAccess().getActionsAssignment_2()); 
            // InternalArduinoML.g:882:2: ( rule__State__ActionsAssignment_2 )
            // InternalArduinoML.g:882:3: rule__State__ActionsAssignment_2
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
    // InternalArduinoML.g:890:1: rule__State__Group__3 : rule__State__Group__3__Impl rule__State__Group__4 ;
    public final void rule__State__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:894:1: ( rule__State__Group__3__Impl rule__State__Group__4 )
            // InternalArduinoML.g:895:2: rule__State__Group__3__Impl rule__State__Group__4
            {
            pushFollow(FOLLOW_15);
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
    // InternalArduinoML.g:902:1: rule__State__Group__3__Impl : ( ( rule__State__ActionsAssignment_3 )* ) ;
    public final void rule__State__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:906:1: ( ( ( rule__State__ActionsAssignment_3 )* ) )
            // InternalArduinoML.g:907:1: ( ( rule__State__ActionsAssignment_3 )* )
            {
            // InternalArduinoML.g:907:1: ( ( rule__State__ActionsAssignment_3 )* )
            // InternalArduinoML.g:908:2: ( rule__State__ActionsAssignment_3 )*
            {
             before(grammarAccess.getStateAccess().getActionsAssignment_3()); 
            // InternalArduinoML.g:909:2: ( rule__State__ActionsAssignment_3 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==23) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalArduinoML.g:909:3: rule__State__ActionsAssignment_3
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__State__ActionsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
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
    // InternalArduinoML.g:917:1: rule__State__Group__4 : rule__State__Group__4__Impl rule__State__Group__5 ;
    public final void rule__State__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:921:1: ( rule__State__Group__4__Impl rule__State__Group__5 )
            // InternalArduinoML.g:922:2: rule__State__Group__4__Impl rule__State__Group__5
            {
            pushFollow(FOLLOW_17);
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
    // InternalArduinoML.g:929:1: rule__State__Group__4__Impl : ( ( rule__State__TransitionsAssignment_4 ) ) ;
    public final void rule__State__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:933:1: ( ( ( rule__State__TransitionsAssignment_4 ) ) )
            // InternalArduinoML.g:934:1: ( ( rule__State__TransitionsAssignment_4 ) )
            {
            // InternalArduinoML.g:934:1: ( ( rule__State__TransitionsAssignment_4 ) )
            // InternalArduinoML.g:935:2: ( rule__State__TransitionsAssignment_4 )
            {
             before(grammarAccess.getStateAccess().getTransitionsAssignment_4()); 
            // InternalArduinoML.g:936:2: ( rule__State__TransitionsAssignment_4 )
            // InternalArduinoML.g:936:3: rule__State__TransitionsAssignment_4
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
    // InternalArduinoML.g:944:1: rule__State__Group__5 : rule__State__Group__5__Impl rule__State__Group__6 ;
    public final void rule__State__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:948:1: ( rule__State__Group__5__Impl rule__State__Group__6 )
            // InternalArduinoML.g:949:2: rule__State__Group__5__Impl rule__State__Group__6
            {
            pushFollow(FOLLOW_17);
            rule__State__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__State__Group__6();

            state._fsp--;


            }

        }
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
    // InternalArduinoML.g:956:1: rule__State__Group__5__Impl : ( ( rule__State__TransitionsAssignment_5 )* ) ;
    public final void rule__State__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:960:1: ( ( ( rule__State__TransitionsAssignment_5 )* ) )
            // InternalArduinoML.g:961:1: ( ( rule__State__TransitionsAssignment_5 )* )
            {
            // InternalArduinoML.g:961:1: ( ( rule__State__TransitionsAssignment_5 )* )
            // InternalArduinoML.g:962:2: ( rule__State__TransitionsAssignment_5 )*
            {
             before(grammarAccess.getStateAccess().getTransitionsAssignment_5()); 
            // InternalArduinoML.g:963:2: ( rule__State__TransitionsAssignment_5 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==25||LA8_0==28) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalArduinoML.g:963:3: rule__State__TransitionsAssignment_5
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__State__TransitionsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
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


    // $ANTLR start "rule__State__Group__6"
    // InternalArduinoML.g:971:1: rule__State__Group__6 : rule__State__Group__6__Impl ;
    public final void rule__State__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:975:1: ( rule__State__Group__6__Impl )
            // InternalArduinoML.g:976:2: rule__State__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__State__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__6"


    // $ANTLR start "rule__State__Group__6__Impl"
    // InternalArduinoML.g:982:1: rule__State__Group__6__Impl : ( '}' ) ;
    public final void rule__State__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:986:1: ( ( '}' ) )
            // InternalArduinoML.g:987:1: ( '}' )
            {
            // InternalArduinoML.g:987:1: ( '}' )
            // InternalArduinoML.g:988:2: '}'
            {
             before(grammarAccess.getStateAccess().getRightCurlyBracketKeyword_6()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getStateAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__6__Impl"


    // $ANTLR start "rule__EInt__Group__0"
    // InternalArduinoML.g:998:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1002:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalArduinoML.g:1003:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__EInt__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EInt__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__0"


    // $ANTLR start "rule__EInt__Group__0__Impl"
    // InternalArduinoML.g:1010:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1014:1: ( ( ( '-' )? ) )
            // InternalArduinoML.g:1015:1: ( ( '-' )? )
            {
            // InternalArduinoML.g:1015:1: ( ( '-' )? )
            // InternalArduinoML.g:1016:2: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // InternalArduinoML.g:1017:2: ( '-' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==20) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalArduinoML.g:1017:3: '-'
                    {
                    match(input,20,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__0__Impl"


    // $ANTLR start "rule__EInt__Group__1"
    // InternalArduinoML.g:1025:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1029:1: ( rule__EInt__Group__1__Impl )
            // InternalArduinoML.g:1030:2: rule__EInt__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EInt__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__1"


    // $ANTLR start "rule__EInt__Group__1__Impl"
    // InternalArduinoML.g:1036:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1040:1: ( ( RULE_INT ) )
            // InternalArduinoML.g:1041:1: ( RULE_INT )
            {
            // InternalArduinoML.g:1041:1: ( RULE_INT )
            // InternalArduinoML.g:1042:2: RULE_INT
            {
             before(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__1__Impl"


    // $ANTLR start "rule__Actuator__Group__0"
    // InternalArduinoML.g:1052:1: rule__Actuator__Group__0 : rule__Actuator__Group__0__Impl rule__Actuator__Group__1 ;
    public final void rule__Actuator__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1056:1: ( rule__Actuator__Group__0__Impl rule__Actuator__Group__1 )
            // InternalArduinoML.g:1057:2: rule__Actuator__Group__0__Impl rule__Actuator__Group__1
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
    // InternalArduinoML.g:1064:1: rule__Actuator__Group__0__Impl : ( () ) ;
    public final void rule__Actuator__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1068:1: ( ( () ) )
            // InternalArduinoML.g:1069:1: ( () )
            {
            // InternalArduinoML.g:1069:1: ( () )
            // InternalArduinoML.g:1070:2: ()
            {
             before(grammarAccess.getActuatorAccess().getActuatorAction_0()); 
            // InternalArduinoML.g:1071:2: ()
            // InternalArduinoML.g:1071:3: 
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
    // InternalArduinoML.g:1079:1: rule__Actuator__Group__1 : rule__Actuator__Group__1__Impl ;
    public final void rule__Actuator__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1083:1: ( rule__Actuator__Group__1__Impl )
            // InternalArduinoML.g:1084:2: rule__Actuator__Group__1__Impl
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
    // InternalArduinoML.g:1090:1: rule__Actuator__Group__1__Impl : ( 'Actuator' ) ;
    public final void rule__Actuator__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1094:1: ( ( 'Actuator' ) )
            // InternalArduinoML.g:1095:1: ( 'Actuator' )
            {
            // InternalArduinoML.g:1095:1: ( 'Actuator' )
            // InternalArduinoML.g:1096:2: 'Actuator'
            {
             before(grammarAccess.getActuatorAccess().getActuatorKeyword_1()); 
            match(input,21,FOLLOW_2); 
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


    // $ANTLR start "rule__Sensor__Group__0"
    // InternalArduinoML.g:1106:1: rule__Sensor__Group__0 : rule__Sensor__Group__0__Impl rule__Sensor__Group__1 ;
    public final void rule__Sensor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1110:1: ( rule__Sensor__Group__0__Impl rule__Sensor__Group__1 )
            // InternalArduinoML.g:1111:2: rule__Sensor__Group__0__Impl rule__Sensor__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Sensor__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sensor__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group__0"


    // $ANTLR start "rule__Sensor__Group__0__Impl"
    // InternalArduinoML.g:1118:1: rule__Sensor__Group__0__Impl : ( () ) ;
    public final void rule__Sensor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1122:1: ( ( () ) )
            // InternalArduinoML.g:1123:1: ( () )
            {
            // InternalArduinoML.g:1123:1: ( () )
            // InternalArduinoML.g:1124:2: ()
            {
             before(grammarAccess.getSensorAccess().getSensorAction_0()); 
            // InternalArduinoML.g:1125:2: ()
            // InternalArduinoML.g:1125:3: 
            {
            }

             after(grammarAccess.getSensorAccess().getSensorAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group__0__Impl"


    // $ANTLR start "rule__Sensor__Group__1"
    // InternalArduinoML.g:1133:1: rule__Sensor__Group__1 : rule__Sensor__Group__1__Impl ;
    public final void rule__Sensor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1137:1: ( rule__Sensor__Group__1__Impl )
            // InternalArduinoML.g:1138:2: rule__Sensor__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Sensor__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group__1"


    // $ANTLR start "rule__Sensor__Group__1__Impl"
    // InternalArduinoML.g:1144:1: rule__Sensor__Group__1__Impl : ( 'Sensor' ) ;
    public final void rule__Sensor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1148:1: ( ( 'Sensor' ) )
            // InternalArduinoML.g:1149:1: ( 'Sensor' )
            {
            // InternalArduinoML.g:1149:1: ( 'Sensor' )
            // InternalArduinoML.g:1150:2: 'Sensor'
            {
             before(grammarAccess.getSensorAccess().getSensorKeyword_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getSensorAccess().getSensorKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group__1__Impl"


    // $ANTLR start "rule__Action__Group__0"
    // InternalArduinoML.g:1160:1: rule__Action__Group__0 : rule__Action__Group__0__Impl rule__Action__Group__1 ;
    public final void rule__Action__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1164:1: ( rule__Action__Group__0__Impl rule__Action__Group__1 )
            // InternalArduinoML.g:1165:2: rule__Action__Group__0__Impl rule__Action__Group__1
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
    // InternalArduinoML.g:1172:1: rule__Action__Group__0__Impl : ( 'change' ) ;
    public final void rule__Action__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1176:1: ( ( 'change' ) )
            // InternalArduinoML.g:1177:1: ( 'change' )
            {
            // InternalArduinoML.g:1177:1: ( 'change' )
            // InternalArduinoML.g:1178:2: 'change'
            {
             before(grammarAccess.getActionAccess().getChangeKeyword_0()); 
            match(input,23,FOLLOW_2); 
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
    // InternalArduinoML.g:1187:1: rule__Action__Group__1 : rule__Action__Group__1__Impl rule__Action__Group__2 ;
    public final void rule__Action__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1191:1: ( rule__Action__Group__1__Impl rule__Action__Group__2 )
            // InternalArduinoML.g:1192:2: rule__Action__Group__1__Impl rule__Action__Group__2
            {
            pushFollow(FOLLOW_20);
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
    // InternalArduinoML.g:1199:1: rule__Action__Group__1__Impl : ( ( rule__Action__ActuatorAssignment_1 ) ) ;
    public final void rule__Action__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1203:1: ( ( ( rule__Action__ActuatorAssignment_1 ) ) )
            // InternalArduinoML.g:1204:1: ( ( rule__Action__ActuatorAssignment_1 ) )
            {
            // InternalArduinoML.g:1204:1: ( ( rule__Action__ActuatorAssignment_1 ) )
            // InternalArduinoML.g:1205:2: ( rule__Action__ActuatorAssignment_1 )
            {
             before(grammarAccess.getActionAccess().getActuatorAssignment_1()); 
            // InternalArduinoML.g:1206:2: ( rule__Action__ActuatorAssignment_1 )
            // InternalArduinoML.g:1206:3: rule__Action__ActuatorAssignment_1
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
    // InternalArduinoML.g:1214:1: rule__Action__Group__2 : rule__Action__Group__2__Impl rule__Action__Group__3 ;
    public final void rule__Action__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1218:1: ( rule__Action__Group__2__Impl rule__Action__Group__3 )
            // InternalArduinoML.g:1219:2: rule__Action__Group__2__Impl rule__Action__Group__3
            {
            pushFollow(FOLLOW_21);
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
    // InternalArduinoML.g:1226:1: rule__Action__Group__2__Impl : ( 'to' ) ;
    public final void rule__Action__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1230:1: ( ( 'to' ) )
            // InternalArduinoML.g:1231:1: ( 'to' )
            {
            // InternalArduinoML.g:1231:1: ( 'to' )
            // InternalArduinoML.g:1232:2: 'to'
            {
             before(grammarAccess.getActionAccess().getToKeyword_2()); 
            match(input,24,FOLLOW_2); 
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
    // InternalArduinoML.g:1241:1: rule__Action__Group__3 : rule__Action__Group__3__Impl ;
    public final void rule__Action__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1245:1: ( rule__Action__Group__3__Impl )
            // InternalArduinoML.g:1246:2: rule__Action__Group__3__Impl
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
    // InternalArduinoML.g:1252:1: rule__Action__Group__3__Impl : ( ( rule__Action__ValueAssignment_3 ) ) ;
    public final void rule__Action__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1256:1: ( ( ( rule__Action__ValueAssignment_3 ) ) )
            // InternalArduinoML.g:1257:1: ( ( rule__Action__ValueAssignment_3 ) )
            {
            // InternalArduinoML.g:1257:1: ( ( rule__Action__ValueAssignment_3 ) )
            // InternalArduinoML.g:1258:2: ( rule__Action__ValueAssignment_3 )
            {
             before(grammarAccess.getActionAccess().getValueAssignment_3()); 
            // InternalArduinoML.g:1259:2: ( rule__Action__ValueAssignment_3 )
            // InternalArduinoML.g:1259:3: rule__Action__ValueAssignment_3
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


    // $ANTLR start "rule__Transition__Group_0__0"
    // InternalArduinoML.g:1268:1: rule__Transition__Group_0__0 : rule__Transition__Group_0__0__Impl rule__Transition__Group_0__1 ;
    public final void rule__Transition__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1272:1: ( rule__Transition__Group_0__0__Impl rule__Transition__Group_0__1 )
            // InternalArduinoML.g:1273:2: rule__Transition__Group_0__0__Impl rule__Transition__Group_0__1
            {
            pushFollow(FOLLOW_3);
            rule__Transition__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_0__0"


    // $ANTLR start "rule__Transition__Group_0__0__Impl"
    // InternalArduinoML.g:1280:1: rule__Transition__Group_0__0__Impl : ( 'when' ) ;
    public final void rule__Transition__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1284:1: ( ( 'when' ) )
            // InternalArduinoML.g:1285:1: ( 'when' )
            {
            // InternalArduinoML.g:1285:1: ( 'when' )
            // InternalArduinoML.g:1286:2: 'when'
            {
             before(grammarAccess.getTransitionAccess().getWhenKeyword_0_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getWhenKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_0__0__Impl"


    // $ANTLR start "rule__Transition__Group_0__1"
    // InternalArduinoML.g:1295:1: rule__Transition__Group_0__1 : rule__Transition__Group_0__1__Impl rule__Transition__Group_0__2 ;
    public final void rule__Transition__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1299:1: ( rule__Transition__Group_0__1__Impl rule__Transition__Group_0__2 )
            // InternalArduinoML.g:1300:2: rule__Transition__Group_0__1__Impl rule__Transition__Group_0__2
            {
            pushFollow(FOLLOW_22);
            rule__Transition__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_0__1"


    // $ANTLR start "rule__Transition__Group_0__1__Impl"
    // InternalArduinoML.g:1307:1: rule__Transition__Group_0__1__Impl : ( ( rule__Transition__SensorAssignment_0_1 ) ) ;
    public final void rule__Transition__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1311:1: ( ( ( rule__Transition__SensorAssignment_0_1 ) ) )
            // InternalArduinoML.g:1312:1: ( ( rule__Transition__SensorAssignment_0_1 ) )
            {
            // InternalArduinoML.g:1312:1: ( ( rule__Transition__SensorAssignment_0_1 ) )
            // InternalArduinoML.g:1313:2: ( rule__Transition__SensorAssignment_0_1 )
            {
             before(grammarAccess.getTransitionAccess().getSensorAssignment_0_1()); 
            // InternalArduinoML.g:1314:2: ( rule__Transition__SensorAssignment_0_1 )
            // InternalArduinoML.g:1314:3: rule__Transition__SensorAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Transition__SensorAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getSensorAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_0__1__Impl"


    // $ANTLR start "rule__Transition__Group_0__2"
    // InternalArduinoML.g:1322:1: rule__Transition__Group_0__2 : rule__Transition__Group_0__2__Impl rule__Transition__Group_0__3 ;
    public final void rule__Transition__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1326:1: ( rule__Transition__Group_0__2__Impl rule__Transition__Group_0__3 )
            // InternalArduinoML.g:1327:2: rule__Transition__Group_0__2__Impl rule__Transition__Group_0__3
            {
            pushFollow(FOLLOW_21);
            rule__Transition__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group_0__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_0__2"


    // $ANTLR start "rule__Transition__Group_0__2__Impl"
    // InternalArduinoML.g:1334:1: rule__Transition__Group_0__2__Impl : ( 'is' ) ;
    public final void rule__Transition__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1338:1: ( ( 'is' ) )
            // InternalArduinoML.g:1339:1: ( 'is' )
            {
            // InternalArduinoML.g:1339:1: ( 'is' )
            // InternalArduinoML.g:1340:2: 'is'
            {
             before(grammarAccess.getTransitionAccess().getIsKeyword_0_2()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getIsKeyword_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_0__2__Impl"


    // $ANTLR start "rule__Transition__Group_0__3"
    // InternalArduinoML.g:1349:1: rule__Transition__Group_0__3 : rule__Transition__Group_0__3__Impl rule__Transition__Group_0__4 ;
    public final void rule__Transition__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1353:1: ( rule__Transition__Group_0__3__Impl rule__Transition__Group_0__4 )
            // InternalArduinoML.g:1354:2: rule__Transition__Group_0__3__Impl rule__Transition__Group_0__4
            {
            pushFollow(FOLLOW_23);
            rule__Transition__Group_0__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group_0__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_0__3"


    // $ANTLR start "rule__Transition__Group_0__3__Impl"
    // InternalArduinoML.g:1361:1: rule__Transition__Group_0__3__Impl : ( ( rule__Transition__ValueAssignment_0_3 ) ) ;
    public final void rule__Transition__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1365:1: ( ( ( rule__Transition__ValueAssignment_0_3 ) ) )
            // InternalArduinoML.g:1366:1: ( ( rule__Transition__ValueAssignment_0_3 ) )
            {
            // InternalArduinoML.g:1366:1: ( ( rule__Transition__ValueAssignment_0_3 ) )
            // InternalArduinoML.g:1367:2: ( rule__Transition__ValueAssignment_0_3 )
            {
             before(grammarAccess.getTransitionAccess().getValueAssignment_0_3()); 
            // InternalArduinoML.g:1368:2: ( rule__Transition__ValueAssignment_0_3 )
            // InternalArduinoML.g:1368:3: rule__Transition__ValueAssignment_0_3
            {
            pushFollow(FOLLOW_2);
            rule__Transition__ValueAssignment_0_3();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getValueAssignment_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_0__3__Impl"


    // $ANTLR start "rule__Transition__Group_0__4"
    // InternalArduinoML.g:1376:1: rule__Transition__Group_0__4 : rule__Transition__Group_0__4__Impl rule__Transition__Group_0__5 ;
    public final void rule__Transition__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1380:1: ( rule__Transition__Group_0__4__Impl rule__Transition__Group_0__5 )
            // InternalArduinoML.g:1381:2: rule__Transition__Group_0__4__Impl rule__Transition__Group_0__5
            {
            pushFollow(FOLLOW_3);
            rule__Transition__Group_0__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group_0__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_0__4"


    // $ANTLR start "rule__Transition__Group_0__4__Impl"
    // InternalArduinoML.g:1388:1: rule__Transition__Group_0__4__Impl : ( 'go to' ) ;
    public final void rule__Transition__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1392:1: ( ( 'go to' ) )
            // InternalArduinoML.g:1393:1: ( 'go to' )
            {
            // InternalArduinoML.g:1393:1: ( 'go to' )
            // InternalArduinoML.g:1394:2: 'go to'
            {
             before(grammarAccess.getTransitionAccess().getGoToKeyword_0_4()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getGoToKeyword_0_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_0__4__Impl"


    // $ANTLR start "rule__Transition__Group_0__5"
    // InternalArduinoML.g:1403:1: rule__Transition__Group_0__5 : rule__Transition__Group_0__5__Impl ;
    public final void rule__Transition__Group_0__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1407:1: ( rule__Transition__Group_0__5__Impl )
            // InternalArduinoML.g:1408:2: rule__Transition__Group_0__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Transition__Group_0__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_0__5"


    // $ANTLR start "rule__Transition__Group_0__5__Impl"
    // InternalArduinoML.g:1414:1: rule__Transition__Group_0__5__Impl : ( ( rule__Transition__NextAssignment_0_5 ) ) ;
    public final void rule__Transition__Group_0__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1418:1: ( ( ( rule__Transition__NextAssignment_0_5 ) ) )
            // InternalArduinoML.g:1419:1: ( ( rule__Transition__NextAssignment_0_5 ) )
            {
            // InternalArduinoML.g:1419:1: ( ( rule__Transition__NextAssignment_0_5 ) )
            // InternalArduinoML.g:1420:2: ( rule__Transition__NextAssignment_0_5 )
            {
             before(grammarAccess.getTransitionAccess().getNextAssignment_0_5()); 
            // InternalArduinoML.g:1421:2: ( rule__Transition__NextAssignment_0_5 )
            // InternalArduinoML.g:1421:3: rule__Transition__NextAssignment_0_5
            {
            pushFollow(FOLLOW_2);
            rule__Transition__NextAssignment_0_5();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getNextAssignment_0_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_0__5__Impl"


    // $ANTLR start "rule__Transition__Group_1__0"
    // InternalArduinoML.g:1430:1: rule__Transition__Group_1__0 : rule__Transition__Group_1__0__Impl rule__Transition__Group_1__1 ;
    public final void rule__Transition__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1434:1: ( rule__Transition__Group_1__0__Impl rule__Transition__Group_1__1 )
            // InternalArduinoML.g:1435:2: rule__Transition__Group_1__0__Impl rule__Transition__Group_1__1
            {
            pushFollow(FOLLOW_13);
            rule__Transition__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_1__0"


    // $ANTLR start "rule__Transition__Group_1__0__Impl"
    // InternalArduinoML.g:1442:1: rule__Transition__Group_1__0__Impl : ( 'wait' ) ;
    public final void rule__Transition__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1446:1: ( ( 'wait' ) )
            // InternalArduinoML.g:1447:1: ( 'wait' )
            {
            // InternalArduinoML.g:1447:1: ( 'wait' )
            // InternalArduinoML.g:1448:2: 'wait'
            {
             before(grammarAccess.getTransitionAccess().getWaitKeyword_1_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getWaitKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_1__0__Impl"


    // $ANTLR start "rule__Transition__Group_1__1"
    // InternalArduinoML.g:1457:1: rule__Transition__Group_1__1 : rule__Transition__Group_1__1__Impl rule__Transition__Group_1__2 ;
    public final void rule__Transition__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1461:1: ( rule__Transition__Group_1__1__Impl rule__Transition__Group_1__2 )
            // InternalArduinoML.g:1462:2: rule__Transition__Group_1__1__Impl rule__Transition__Group_1__2
            {
            pushFollow(FOLLOW_24);
            rule__Transition__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_1__1"


    // $ANTLR start "rule__Transition__Group_1__1__Impl"
    // InternalArduinoML.g:1469:1: rule__Transition__Group_1__1__Impl : ( ( rule__Transition__TimeAssignment_1_1 ) ) ;
    public final void rule__Transition__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1473:1: ( ( ( rule__Transition__TimeAssignment_1_1 ) ) )
            // InternalArduinoML.g:1474:1: ( ( rule__Transition__TimeAssignment_1_1 ) )
            {
            // InternalArduinoML.g:1474:1: ( ( rule__Transition__TimeAssignment_1_1 ) )
            // InternalArduinoML.g:1475:2: ( rule__Transition__TimeAssignment_1_1 )
            {
             before(grammarAccess.getTransitionAccess().getTimeAssignment_1_1()); 
            // InternalArduinoML.g:1476:2: ( rule__Transition__TimeAssignment_1_1 )
            // InternalArduinoML.g:1476:3: rule__Transition__TimeAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Transition__TimeAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getTimeAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_1__1__Impl"


    // $ANTLR start "rule__Transition__Group_1__2"
    // InternalArduinoML.g:1484:1: rule__Transition__Group_1__2 : rule__Transition__Group_1__2__Impl rule__Transition__Group_1__3 ;
    public final void rule__Transition__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1488:1: ( rule__Transition__Group_1__2__Impl rule__Transition__Group_1__3 )
            // InternalArduinoML.g:1489:2: rule__Transition__Group_1__2__Impl rule__Transition__Group_1__3
            {
            pushFollow(FOLLOW_3);
            rule__Transition__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_1__2"


    // $ANTLR start "rule__Transition__Group_1__2__Impl"
    // InternalArduinoML.g:1496:1: rule__Transition__Group_1__2__Impl : ( 'then go to' ) ;
    public final void rule__Transition__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1500:1: ( ( 'then go to' ) )
            // InternalArduinoML.g:1501:1: ( 'then go to' )
            {
            // InternalArduinoML.g:1501:1: ( 'then go to' )
            // InternalArduinoML.g:1502:2: 'then go to'
            {
             before(grammarAccess.getTransitionAccess().getThenGoToKeyword_1_2()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getThenGoToKeyword_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_1__2__Impl"


    // $ANTLR start "rule__Transition__Group_1__3"
    // InternalArduinoML.g:1511:1: rule__Transition__Group_1__3 : rule__Transition__Group_1__3__Impl ;
    public final void rule__Transition__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1515:1: ( rule__Transition__Group_1__3__Impl )
            // InternalArduinoML.g:1516:2: rule__Transition__Group_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Transition__Group_1__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_1__3"


    // $ANTLR start "rule__Transition__Group_1__3__Impl"
    // InternalArduinoML.g:1522:1: rule__Transition__Group_1__3__Impl : ( ( rule__Transition__NextAssignment_1_3 ) ) ;
    public final void rule__Transition__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1526:1: ( ( ( rule__Transition__NextAssignment_1_3 ) ) )
            // InternalArduinoML.g:1527:1: ( ( rule__Transition__NextAssignment_1_3 ) )
            {
            // InternalArduinoML.g:1527:1: ( ( rule__Transition__NextAssignment_1_3 ) )
            // InternalArduinoML.g:1528:2: ( rule__Transition__NextAssignment_1_3 )
            {
             before(grammarAccess.getTransitionAccess().getNextAssignment_1_3()); 
            // InternalArduinoML.g:1529:2: ( rule__Transition__NextAssignment_1_3 )
            // InternalArduinoML.g:1529:3: rule__Transition__NextAssignment_1_3
            {
            pushFollow(FOLLOW_2);
            rule__Transition__NextAssignment_1_3();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getNextAssignment_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_1__3__Impl"


    // $ANTLR start "rule__App__NameAssignment_1"
    // InternalArduinoML.g:1538:1: rule__App__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__App__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1542:1: ( ( ruleEString ) )
            // InternalArduinoML.g:1543:2: ( ruleEString )
            {
            // InternalArduinoML.g:1543:2: ( ruleEString )
            // InternalArduinoML.g:1544:3: ruleEString
            {
             before(grammarAccess.getAppAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAppAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__App__NameAssignment_1"


    // $ANTLR start "rule__App__InitialAssignment_3"
    // InternalArduinoML.g:1553:1: rule__App__InitialAssignment_3 : ( ( ruleEString ) ) ;
    public final void rule__App__InitialAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1557:1: ( ( ( ruleEString ) ) )
            // InternalArduinoML.g:1558:2: ( ( ruleEString ) )
            {
            // InternalArduinoML.g:1558:2: ( ( ruleEString ) )
            // InternalArduinoML.g:1559:3: ( ruleEString )
            {
             before(grammarAccess.getAppAccess().getInitialStateCrossReference_3_0()); 
            // InternalArduinoML.g:1560:3: ( ruleEString )
            // InternalArduinoML.g:1561:4: ruleEString
            {
             before(grammarAccess.getAppAccess().getInitialStateEStringParserRuleCall_3_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAppAccess().getInitialStateEStringParserRuleCall_3_0_1()); 

            }

             after(grammarAccess.getAppAccess().getInitialStateCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__App__InitialAssignment_3"


    // $ANTLR start "rule__App__BricksAssignment_6"
    // InternalArduinoML.g:1572:1: rule__App__BricksAssignment_6 : ( ruleBrick ) ;
    public final void rule__App__BricksAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1576:1: ( ( ruleBrick ) )
            // InternalArduinoML.g:1577:2: ( ruleBrick )
            {
            // InternalArduinoML.g:1577:2: ( ruleBrick )
            // InternalArduinoML.g:1578:3: ruleBrick
            {
             before(grammarAccess.getAppAccess().getBricksBrickParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleBrick();

            state._fsp--;

             after(grammarAccess.getAppAccess().getBricksBrickParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__App__BricksAssignment_6"


    // $ANTLR start "rule__App__BricksAssignment_7"
    // InternalArduinoML.g:1587:1: rule__App__BricksAssignment_7 : ( ruleBrick ) ;
    public final void rule__App__BricksAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1591:1: ( ( ruleBrick ) )
            // InternalArduinoML.g:1592:2: ( ruleBrick )
            {
            // InternalArduinoML.g:1592:2: ( ruleBrick )
            // InternalArduinoML.g:1593:3: ruleBrick
            {
             before(grammarAccess.getAppAccess().getBricksBrickParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleBrick();

            state._fsp--;

             after(grammarAccess.getAppAccess().getBricksBrickParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__App__BricksAssignment_7"


    // $ANTLR start "rule__App__StatesAssignment_9"
    // InternalArduinoML.g:1602:1: rule__App__StatesAssignment_9 : ( ruleState ) ;
    public final void rule__App__StatesAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1606:1: ( ( ruleState ) )
            // InternalArduinoML.g:1607:2: ( ruleState )
            {
            // InternalArduinoML.g:1607:2: ( ruleState )
            // InternalArduinoML.g:1608:3: ruleState
            {
             before(grammarAccess.getAppAccess().getStatesStateParserRuleCall_9_0()); 
            pushFollow(FOLLOW_2);
            ruleState();

            state._fsp--;

             after(grammarAccess.getAppAccess().getStatesStateParserRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__App__StatesAssignment_9"


    // $ANTLR start "rule__App__StatesAssignment_10"
    // InternalArduinoML.g:1617:1: rule__App__StatesAssignment_10 : ( ruleState ) ;
    public final void rule__App__StatesAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1621:1: ( ( ruleState ) )
            // InternalArduinoML.g:1622:2: ( ruleState )
            {
            // InternalArduinoML.g:1622:2: ( ruleState )
            // InternalArduinoML.g:1623:3: ruleState
            {
             before(grammarAccess.getAppAccess().getStatesStateParserRuleCall_10_0()); 
            pushFollow(FOLLOW_2);
            ruleState();

            state._fsp--;

             after(grammarAccess.getAppAccess().getStatesStateParserRuleCall_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__App__StatesAssignment_10"


    // $ANTLR start "rule__Brick__NameAssignment_1"
    // InternalArduinoML.g:1632:1: rule__Brick__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Brick__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1636:1: ( ( ruleEString ) )
            // InternalArduinoML.g:1637:2: ( ruleEString )
            {
            // InternalArduinoML.g:1637:2: ( ruleEString )
            // InternalArduinoML.g:1638:3: ruleEString
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
    // InternalArduinoML.g:1647:1: rule__Brick__PinAssignment_3 : ( ruleEInt ) ;
    public final void rule__Brick__PinAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1651:1: ( ( ruleEInt ) )
            // InternalArduinoML.g:1652:2: ( ruleEInt )
            {
            // InternalArduinoML.g:1652:2: ( ruleEInt )
            // InternalArduinoML.g:1653:3: ruleEInt
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


    // $ANTLR start "rule__State__NameAssignment_0"
    // InternalArduinoML.g:1662:1: rule__State__NameAssignment_0 : ( ruleEString ) ;
    public final void rule__State__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1666:1: ( ( ruleEString ) )
            // InternalArduinoML.g:1667:2: ( ruleEString )
            {
            // InternalArduinoML.g:1667:2: ( ruleEString )
            // InternalArduinoML.g:1668:3: ruleEString
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
    // InternalArduinoML.g:1677:1: rule__State__ActionsAssignment_2 : ( ruleAction ) ;
    public final void rule__State__ActionsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1681:1: ( ( ruleAction ) )
            // InternalArduinoML.g:1682:2: ( ruleAction )
            {
            // InternalArduinoML.g:1682:2: ( ruleAction )
            // InternalArduinoML.g:1683:3: ruleAction
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
    // InternalArduinoML.g:1692:1: rule__State__ActionsAssignment_3 : ( ruleAction ) ;
    public final void rule__State__ActionsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1696:1: ( ( ruleAction ) )
            // InternalArduinoML.g:1697:2: ( ruleAction )
            {
            // InternalArduinoML.g:1697:2: ( ruleAction )
            // InternalArduinoML.g:1698:3: ruleAction
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
    // InternalArduinoML.g:1707:1: rule__State__TransitionsAssignment_4 : ( ruleTransition ) ;
    public final void rule__State__TransitionsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1711:1: ( ( ruleTransition ) )
            // InternalArduinoML.g:1712:2: ( ruleTransition )
            {
            // InternalArduinoML.g:1712:2: ( ruleTransition )
            // InternalArduinoML.g:1713:3: ruleTransition
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
    // InternalArduinoML.g:1722:1: rule__State__TransitionsAssignment_5 : ( ruleTransition ) ;
    public final void rule__State__TransitionsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1726:1: ( ( ruleTransition ) )
            // InternalArduinoML.g:1727:2: ( ruleTransition )
            {
            // InternalArduinoML.g:1727:2: ( ruleTransition )
            // InternalArduinoML.g:1728:3: ruleTransition
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
    // InternalArduinoML.g:1737:1: rule__Action__ActuatorAssignment_1 : ( ( ruleEString ) ) ;
    public final void rule__Action__ActuatorAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1741:1: ( ( ( ruleEString ) ) )
            // InternalArduinoML.g:1742:2: ( ( ruleEString ) )
            {
            // InternalArduinoML.g:1742:2: ( ( ruleEString ) )
            // InternalArduinoML.g:1743:3: ( ruleEString )
            {
             before(grammarAccess.getActionAccess().getActuatorActuatorCrossReference_1_0()); 
            // InternalArduinoML.g:1744:3: ( ruleEString )
            // InternalArduinoML.g:1745:4: ruleEString
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
    // InternalArduinoML.g:1756:1: rule__Action__ValueAssignment_3 : ( ruleSignal ) ;
    public final void rule__Action__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1760:1: ( ( ruleSignal ) )
            // InternalArduinoML.g:1761:2: ( ruleSignal )
            {
            // InternalArduinoML.g:1761:2: ( ruleSignal )
            // InternalArduinoML.g:1762:3: ruleSignal
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


    // $ANTLR start "rule__Transition__SensorAssignment_0_1"
    // InternalArduinoML.g:1771:1: rule__Transition__SensorAssignment_0_1 : ( ( ruleEString ) ) ;
    public final void rule__Transition__SensorAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1775:1: ( ( ( ruleEString ) ) )
            // InternalArduinoML.g:1776:2: ( ( ruleEString ) )
            {
            // InternalArduinoML.g:1776:2: ( ( ruleEString ) )
            // InternalArduinoML.g:1777:3: ( ruleEString )
            {
             before(grammarAccess.getTransitionAccess().getSensorSensorCrossReference_0_1_0()); 
            // InternalArduinoML.g:1778:3: ( ruleEString )
            // InternalArduinoML.g:1779:4: ruleEString
            {
             before(grammarAccess.getTransitionAccess().getSensorSensorEStringParserRuleCall_0_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTransitionAccess().getSensorSensorEStringParserRuleCall_0_1_0_1()); 

            }

             after(grammarAccess.getTransitionAccess().getSensorSensorCrossReference_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__SensorAssignment_0_1"


    // $ANTLR start "rule__Transition__ValueAssignment_0_3"
    // InternalArduinoML.g:1790:1: rule__Transition__ValueAssignment_0_3 : ( ruleSignal ) ;
    public final void rule__Transition__ValueAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1794:1: ( ( ruleSignal ) )
            // InternalArduinoML.g:1795:2: ( ruleSignal )
            {
            // InternalArduinoML.g:1795:2: ( ruleSignal )
            // InternalArduinoML.g:1796:3: ruleSignal
            {
             before(grammarAccess.getTransitionAccess().getValueSignalEnumRuleCall_0_3_0()); 
            pushFollow(FOLLOW_2);
            ruleSignal();

            state._fsp--;

             after(grammarAccess.getTransitionAccess().getValueSignalEnumRuleCall_0_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__ValueAssignment_0_3"


    // $ANTLR start "rule__Transition__NextAssignment_0_5"
    // InternalArduinoML.g:1805:1: rule__Transition__NextAssignment_0_5 : ( ( ruleEString ) ) ;
    public final void rule__Transition__NextAssignment_0_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1809:1: ( ( ( ruleEString ) ) )
            // InternalArduinoML.g:1810:2: ( ( ruleEString ) )
            {
            // InternalArduinoML.g:1810:2: ( ( ruleEString ) )
            // InternalArduinoML.g:1811:3: ( ruleEString )
            {
             before(grammarAccess.getTransitionAccess().getNextStateCrossReference_0_5_0()); 
            // InternalArduinoML.g:1812:3: ( ruleEString )
            // InternalArduinoML.g:1813:4: ruleEString
            {
             before(grammarAccess.getTransitionAccess().getNextStateEStringParserRuleCall_0_5_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTransitionAccess().getNextStateEStringParserRuleCall_0_5_0_1()); 

            }

             after(grammarAccess.getTransitionAccess().getNextStateCrossReference_0_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__NextAssignment_0_5"


    // $ANTLR start "rule__Transition__TimeAssignment_1_1"
    // InternalArduinoML.g:1824:1: rule__Transition__TimeAssignment_1_1 : ( ruleEInt ) ;
    public final void rule__Transition__TimeAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1828:1: ( ( ruleEInt ) )
            // InternalArduinoML.g:1829:2: ( ruleEInt )
            {
            // InternalArduinoML.g:1829:2: ( ruleEInt )
            // InternalArduinoML.g:1830:3: ruleEInt
            {
             before(grammarAccess.getTransitionAccess().getTimeEIntParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getTransitionAccess().getTimeEIntParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__TimeAssignment_1_1"


    // $ANTLR start "rule__Transition__NextAssignment_1_3"
    // InternalArduinoML.g:1839:1: rule__Transition__NextAssignment_1_3 : ( ( ruleEString ) ) ;
    public final void rule__Transition__NextAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoML.g:1843:1: ( ( ( ruleEString ) ) )
            // InternalArduinoML.g:1844:2: ( ( ruleEString ) )
            {
            // InternalArduinoML.g:1844:2: ( ( ruleEString ) )
            // InternalArduinoML.g:1845:3: ( ruleEString )
            {
             before(grammarAccess.getTransitionAccess().getNextStateCrossReference_1_3_0()); 
            // InternalArduinoML.g:1846:3: ( ruleEString )
            // InternalArduinoML.g:1847:4: ruleEString
            {
             before(grammarAccess.getTransitionAccess().getNextStateEStringParserRuleCall_1_3_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTransitionAccess().getNextStateEStringParserRuleCall_1_3_0_1()); 

            }

             after(grammarAccess.getTransitionAccess().getNextStateCrossReference_1_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__NextAssignment_1_3"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000620000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000600002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040030L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100040L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000012800000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000012840000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000012800002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000020000000L});

}