/*
 * generated by Xtext 2.16.0
 */
package arduinoML.concretesyntax.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.EnumLiteralDeclaration;
import org.eclipse.xtext.EnumRule;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractEnumRuleElementFinder;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractGrammarElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class ArduinoMLGrammarAccess extends AbstractGrammarElementFinder {
	
	public class AppElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "arduinoML.concretesyntax.ArduinoML.App");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cAppKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameEStringParserRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cInitialStateKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cInitialAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final CrossReference cInitialStateCrossReference_3_0 = (CrossReference)cInitialAssignment_3.eContents().get(0);
		private final RuleCall cInitialStateEStringParserRuleCall_3_0_1 = (RuleCall)cInitialStateCrossReference_3_0.eContents().get(1);
		private final Keyword cColonKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Keyword cBricksKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Assignment cBricksAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cBricksBrickParserRuleCall_6_0 = (RuleCall)cBricksAssignment_6.eContents().get(0);
		private final Assignment cBricksAssignment_7 = (Assignment)cGroup.eContents().get(7);
		private final RuleCall cBricksBrickParserRuleCall_7_0 = (RuleCall)cBricksAssignment_7.eContents().get(0);
		private final Keyword cStatesKeyword_8 = (Keyword)cGroup.eContents().get(8);
		private final Assignment cStatesAssignment_9 = (Assignment)cGroup.eContents().get(9);
		private final RuleCall cStatesStateParserRuleCall_9_0 = (RuleCall)cStatesAssignment_9.eContents().get(0);
		private final Assignment cStatesAssignment_10 = (Assignment)cGroup.eContents().get(10);
		private final RuleCall cStatesStateParserRuleCall_10_0 = (RuleCall)cStatesAssignment_10.eContents().get(0);
		
		//App:
		//	'app' name=EString 'initial state' initial=[State|EString] ':'
		//	'bricks :'
		//	bricks+=Brick
		//	bricks+=Brick*
		//	'states :'
		//	states+=State
		//	states+=State*;
		@Override public ParserRule getRule() { return rule; }
		
		//'app' name=EString 'initial state' initial=[State|EString] ':' 'bricks :' bricks+=Brick bricks+=Brick* 'states :'
		//states+=State states+=State*
		public Group getGroup() { return cGroup; }
		
		//'app'
		public Keyword getAppKeyword_0() { return cAppKeyword_0; }
		
		//name=EString
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//EString
		public RuleCall getNameEStringParserRuleCall_1_0() { return cNameEStringParserRuleCall_1_0; }
		
		//'initial state'
		public Keyword getInitialStateKeyword_2() { return cInitialStateKeyword_2; }
		
		//initial=[State|EString]
		public Assignment getInitialAssignment_3() { return cInitialAssignment_3; }
		
		//[State|EString]
		public CrossReference getInitialStateCrossReference_3_0() { return cInitialStateCrossReference_3_0; }
		
		//EString
		public RuleCall getInitialStateEStringParserRuleCall_3_0_1() { return cInitialStateEStringParserRuleCall_3_0_1; }
		
		//':'
		public Keyword getColonKeyword_4() { return cColonKeyword_4; }
		
		//'bricks :'
		public Keyword getBricksKeyword_5() { return cBricksKeyword_5; }
		
		//bricks+=Brick
		public Assignment getBricksAssignment_6() { return cBricksAssignment_6; }
		
		//Brick
		public RuleCall getBricksBrickParserRuleCall_6_0() { return cBricksBrickParserRuleCall_6_0; }
		
		//bricks+=Brick*
		public Assignment getBricksAssignment_7() { return cBricksAssignment_7; }
		
		//Brick
		public RuleCall getBricksBrickParserRuleCall_7_0() { return cBricksBrickParserRuleCall_7_0; }
		
		//'states :'
		public Keyword getStatesKeyword_8() { return cStatesKeyword_8; }
		
		//states+=State
		public Assignment getStatesAssignment_9() { return cStatesAssignment_9; }
		
		//State
		public RuleCall getStatesStateParserRuleCall_9_0() { return cStatesStateParserRuleCall_9_0; }
		
		//states+=State*
		public Assignment getStatesAssignment_10() { return cStatesAssignment_10; }
		
		//State
		public RuleCall getStatesStateParserRuleCall_10_0() { return cStatesStateParserRuleCall_10_0; }
	}
	public class BrickElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "arduinoML.concretesyntax.ArduinoML.Brick");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Alternatives cAlternatives_0 = (Alternatives)cGroup.eContents().get(0);
		private final RuleCall cActuatorParserRuleCall_0_0 = (RuleCall)cAlternatives_0.eContents().get(0);
		private final RuleCall cSensorParserRuleCall_0_1 = (RuleCall)cAlternatives_0.eContents().get(1);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameEStringParserRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cColonKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cPinAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cPinEIntParserRuleCall_3_0 = (RuleCall)cPinAssignment_3.eContents().get(0);
		
		//Brick:
		//	(Actuator | Sensor) name=EString ':' pin=EInt;
		@Override public ParserRule getRule() { return rule; }
		
		//(Actuator | Sensor) name=EString ':' pin=EInt
		public Group getGroup() { return cGroup; }
		
		//Actuator | Sensor
		public Alternatives getAlternatives_0() { return cAlternatives_0; }
		
		//Actuator
		public RuleCall getActuatorParserRuleCall_0_0() { return cActuatorParserRuleCall_0_0; }
		
		//Sensor
		public RuleCall getSensorParserRuleCall_0_1() { return cSensorParserRuleCall_0_1; }
		
		//name=EString
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//EString
		public RuleCall getNameEStringParserRuleCall_1_0() { return cNameEStringParserRuleCall_1_0; }
		
		//':'
		public Keyword getColonKeyword_2() { return cColonKeyword_2; }
		
		//pin=EInt
		public Assignment getPinAssignment_3() { return cPinAssignment_3; }
		
		//EInt
		public RuleCall getPinEIntParserRuleCall_3_0() { return cPinEIntParserRuleCall_3_0; }
	}
	public class EStringElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "arduinoML.concretesyntax.ArduinoML.EString");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cSTRINGTerminalRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//EString:
		//	STRING | ID;
		@Override public ParserRule getRule() { return rule; }
		
		//STRING | ID
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//STRING
		public RuleCall getSTRINGTerminalRuleCall_0() { return cSTRINGTerminalRuleCall_0; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_1() { return cIDTerminalRuleCall_1; }
	}
	public class StateElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "arduinoML.concretesyntax.ArduinoML.State");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNameEStringParserRuleCall_0_0 = (RuleCall)cNameAssignment_0.eContents().get(0);
		private final Keyword cColonKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cActionsAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cActionsActionParserRuleCall_2_0 = (RuleCall)cActionsAssignment_2.eContents().get(0);
		private final Assignment cActionsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cActionsActionParserRuleCall_3_0 = (RuleCall)cActionsAssignment_3.eContents().get(0);
		private final Assignment cTransitionsAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cTransitionsTransitionParserRuleCall_4_0 = (RuleCall)cTransitionsAssignment_4.eContents().get(0);
		private final Assignment cTransitionsAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cTransitionsTransitionParserRuleCall_5_0 = (RuleCall)cTransitionsAssignment_5.eContents().get(0);
		
		//State:
		//	name=EString ':'
		//	actions+=Action
		//	actions+=Action*
		//	transitions+=Transition
		//	transitions+=Transition*;
		@Override public ParserRule getRule() { return rule; }
		
		//name=EString ':' actions+=Action actions+=Action* transitions+=Transition transitions+=Transition*
		public Group getGroup() { return cGroup; }
		
		//name=EString
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }
		
		//EString
		public RuleCall getNameEStringParserRuleCall_0_0() { return cNameEStringParserRuleCall_0_0; }
		
		//':'
		public Keyword getColonKeyword_1() { return cColonKeyword_1; }
		
		//actions+=Action
		public Assignment getActionsAssignment_2() { return cActionsAssignment_2; }
		
		//Action
		public RuleCall getActionsActionParserRuleCall_2_0() { return cActionsActionParserRuleCall_2_0; }
		
		//actions+=Action*
		public Assignment getActionsAssignment_3() { return cActionsAssignment_3; }
		
		//Action
		public RuleCall getActionsActionParserRuleCall_3_0() { return cActionsActionParserRuleCall_3_0; }
		
		//transitions+=Transition
		public Assignment getTransitionsAssignment_4() { return cTransitionsAssignment_4; }
		
		//Transition
		public RuleCall getTransitionsTransitionParserRuleCall_4_0() { return cTransitionsTransitionParserRuleCall_4_0; }
		
		//transitions+=Transition*
		public Assignment getTransitionsAssignment_5() { return cTransitionsAssignment_5; }
		
		//Transition
		public RuleCall getTransitionsTransitionParserRuleCall_5_0() { return cTransitionsTransitionParserRuleCall_5_0; }
	}
	public class EIntElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "arduinoML.concretesyntax.ArduinoML.EInt");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cHyphenMinusKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final RuleCall cINTTerminalRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		
		//EInt ecore::EInt:
		//	'-'? INT;
		@Override public ParserRule getRule() { return rule; }
		
		//'-'? INT
		public Group getGroup() { return cGroup; }
		
		//'-'?
		public Keyword getHyphenMinusKeyword_0() { return cHyphenMinusKeyword_0; }
		
		//INT
		public RuleCall getINTTerminalRuleCall_1() { return cINTTerminalRuleCall_1; }
	}
	public class ActuatorElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "arduinoML.concretesyntax.ArduinoML.Actuator");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cActuatorAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cActuatorKeyword_1 = (Keyword)cGroup.eContents().get(1);
		
		//Actuator:
		//	{Actuator}
		//	'Actuator';
		@Override public ParserRule getRule() { return rule; }
		
		//{Actuator} 'Actuator'
		public Group getGroup() { return cGroup; }
		
		//{Actuator}
		public Action getActuatorAction_0() { return cActuatorAction_0; }
		
		//'Actuator'
		public Keyword getActuatorKeyword_1() { return cActuatorKeyword_1; }
	}
	public class SensorElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "arduinoML.concretesyntax.ArduinoML.Sensor");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cSensorAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cSensorKeyword_1 = (Keyword)cGroup.eContents().get(1);
		
		//Sensor:
		//	{Sensor}
		//	'Sensor';
		@Override public ParserRule getRule() { return rule; }
		
		//{Sensor} 'Sensor'
		public Group getGroup() { return cGroup; }
		
		//{Sensor}
		public Action getSensorAction_0() { return cSensorAction_0; }
		
		//'Sensor'
		public Keyword getSensorKeyword_1() { return cSensorKeyword_1; }
	}
	public class ActionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "arduinoML.concretesyntax.ArduinoML.Action");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cChangeKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cActuatorAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cActuatorActuatorCrossReference_1_0 = (CrossReference)cActuatorAssignment_1.eContents().get(0);
		private final RuleCall cActuatorActuatorEStringParserRuleCall_1_0_1 = (RuleCall)cActuatorActuatorCrossReference_1_0.eContents().get(1);
		private final Keyword cToKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cValueAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cValueSignalEnumRuleCall_3_0 = (RuleCall)cValueAssignment_3.eContents().get(0);
		
		//Action:
		//	'change' actuator=[Actuator|EString] 'to' value=Signal;
		@Override public ParserRule getRule() { return rule; }
		
		//'change' actuator=[Actuator|EString] 'to' value=Signal
		public Group getGroup() { return cGroup; }
		
		//'change'
		public Keyword getChangeKeyword_0() { return cChangeKeyword_0; }
		
		//actuator=[Actuator|EString]
		public Assignment getActuatorAssignment_1() { return cActuatorAssignment_1; }
		
		//[Actuator|EString]
		public CrossReference getActuatorActuatorCrossReference_1_0() { return cActuatorActuatorCrossReference_1_0; }
		
		//EString
		public RuleCall getActuatorActuatorEStringParserRuleCall_1_0_1() { return cActuatorActuatorEStringParserRuleCall_1_0_1; }
		
		//'to'
		public Keyword getToKeyword_2() { return cToKeyword_2; }
		
		//value=Signal
		public Assignment getValueAssignment_3() { return cValueAssignment_3; }
		
		//Signal
		public RuleCall getValueSignalEnumRuleCall_3_0() { return cValueSignalEnumRuleCall_3_0; }
	}
	public class TransitionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "arduinoML.concretesyntax.ArduinoML.Transition");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cAlternatives.eContents().get(0);
		private final Keyword cWhenKeyword_0_0 = (Keyword)cGroup_0.eContents().get(0);
		private final Assignment cSensorsAssignment_0_1 = (Assignment)cGroup_0.eContents().get(1);
		private final CrossReference cSensorsSensorCrossReference_0_1_0 = (CrossReference)cSensorsAssignment_0_1.eContents().get(0);
		private final RuleCall cSensorsSensorEStringParserRuleCall_0_1_0_1 = (RuleCall)cSensorsSensorCrossReference_0_1_0.eContents().get(1);
		private final Keyword cIsKeyword_0_2 = (Keyword)cGroup_0.eContents().get(2);
		private final Assignment cValuesAssignment_0_3 = (Assignment)cGroup_0.eContents().get(3);
		private final RuleCall cValuesSignalEnumRuleCall_0_3_0 = (RuleCall)cValuesAssignment_0_3.eContents().get(0);
		private final Group cGroup_0_4 = (Group)cGroup_0.eContents().get(4);
		private final Keyword cAndKeyword_0_4_0 = (Keyword)cGroup_0_4.eContents().get(0);
		private final Assignment cSensorsAssignment_0_4_1 = (Assignment)cGroup_0_4.eContents().get(1);
		private final CrossReference cSensorsSensorCrossReference_0_4_1_0 = (CrossReference)cSensorsAssignment_0_4_1.eContents().get(0);
		private final RuleCall cSensorsSensorEStringParserRuleCall_0_4_1_0_1 = (RuleCall)cSensorsSensorCrossReference_0_4_1_0.eContents().get(1);
		private final Keyword cIsKeyword_0_4_2 = (Keyword)cGroup_0_4.eContents().get(2);
		private final Assignment cValuesAssignment_0_4_3 = (Assignment)cGroup_0_4.eContents().get(3);
		private final RuleCall cValuesSignalEnumRuleCall_0_4_3_0 = (RuleCall)cValuesAssignment_0_4_3.eContents().get(0);
		private final Keyword cGoToKeyword_0_5 = (Keyword)cGroup_0.eContents().get(5);
		private final Assignment cNextAssignment_0_6 = (Assignment)cGroup_0.eContents().get(6);
		private final CrossReference cNextStateCrossReference_0_6_0 = (CrossReference)cNextAssignment_0_6.eContents().get(0);
		private final RuleCall cNextStateEStringParserRuleCall_0_6_0_1 = (RuleCall)cNextStateCrossReference_0_6_0.eContents().get(1);
		private final Group cGroup_1 = (Group)cAlternatives.eContents().get(1);
		private final Keyword cWaitKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Assignment cTimeAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cTimeEIntParserRuleCall_1_1_0 = (RuleCall)cTimeAssignment_1_1.eContents().get(0);
		private final Assignment cUnitAssignment_1_2 = (Assignment)cGroup_1.eContents().get(2);
		private final RuleCall cUnitTime_unitEnumRuleCall_1_2_0 = (RuleCall)cUnitAssignment_1_2.eContents().get(0);
		private final Keyword cThenGoToKeyword_1_3 = (Keyword)cGroup_1.eContents().get(3);
		private final Assignment cNextAssignment_1_4 = (Assignment)cGroup_1.eContents().get(4);
		private final CrossReference cNextStateCrossReference_1_4_0 = (CrossReference)cNextAssignment_1_4.eContents().get(0);
		private final RuleCall cNextStateEStringParserRuleCall_1_4_0_1 = (RuleCall)cNextStateCrossReference_1_4_0.eContents().get(1);
		
		//Transition:
		//	'when' sensors+=[Sensor|EString] 'is' values+=Signal ('and' sensors+=[Sensor|EString] 'is' values+=Signal)* 'go to'
		//	next=[State|EString] | 'wait' time=EInt unit=Time_unit 'then go to' next=[State|EString];
		@Override public ParserRule getRule() { return rule; }
		
		//'when' sensors+=[Sensor|EString] 'is' values+=Signal ('and' sensors+=[Sensor|EString] 'is' values+=Signal)* 'go to'
		//next=[State|EString] | 'wait' time=EInt unit=Time_unit 'then go to' next=[State|EString]
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//'when' sensors+=[Sensor|EString] 'is' values+=Signal ('and' sensors+=[Sensor|EString] 'is' values+=Signal)* 'go to'
		//next=[State|EString]
		public Group getGroup_0() { return cGroup_0; }
		
		//'when'
		public Keyword getWhenKeyword_0_0() { return cWhenKeyword_0_0; }
		
		//sensors+=[Sensor|EString]
		public Assignment getSensorsAssignment_0_1() { return cSensorsAssignment_0_1; }
		
		//[Sensor|EString]
		public CrossReference getSensorsSensorCrossReference_0_1_0() { return cSensorsSensorCrossReference_0_1_0; }
		
		//EString
		public RuleCall getSensorsSensorEStringParserRuleCall_0_1_0_1() { return cSensorsSensorEStringParserRuleCall_0_1_0_1; }
		
		//'is'
		public Keyword getIsKeyword_0_2() { return cIsKeyword_0_2; }
		
		//values+=Signal
		public Assignment getValuesAssignment_0_3() { return cValuesAssignment_0_3; }
		
		//Signal
		public RuleCall getValuesSignalEnumRuleCall_0_3_0() { return cValuesSignalEnumRuleCall_0_3_0; }
		
		//('and' sensors+=[Sensor|EString] 'is' values+=Signal)*
		public Group getGroup_0_4() { return cGroup_0_4; }
		
		//'and'
		public Keyword getAndKeyword_0_4_0() { return cAndKeyword_0_4_0; }
		
		//sensors+=[Sensor|EString]
		public Assignment getSensorsAssignment_0_4_1() { return cSensorsAssignment_0_4_1; }
		
		//[Sensor|EString]
		public CrossReference getSensorsSensorCrossReference_0_4_1_0() { return cSensorsSensorCrossReference_0_4_1_0; }
		
		//EString
		public RuleCall getSensorsSensorEStringParserRuleCall_0_4_1_0_1() { return cSensorsSensorEStringParserRuleCall_0_4_1_0_1; }
		
		//'is'
		public Keyword getIsKeyword_0_4_2() { return cIsKeyword_0_4_2; }
		
		//values+=Signal
		public Assignment getValuesAssignment_0_4_3() { return cValuesAssignment_0_4_3; }
		
		//Signal
		public RuleCall getValuesSignalEnumRuleCall_0_4_3_0() { return cValuesSignalEnumRuleCall_0_4_3_0; }
		
		//'go to'
		public Keyword getGoToKeyword_0_5() { return cGoToKeyword_0_5; }
		
		//next=[State|EString]
		public Assignment getNextAssignment_0_6() { return cNextAssignment_0_6; }
		
		//[State|EString]
		public CrossReference getNextStateCrossReference_0_6_0() { return cNextStateCrossReference_0_6_0; }
		
		//EString
		public RuleCall getNextStateEStringParserRuleCall_0_6_0_1() { return cNextStateEStringParserRuleCall_0_6_0_1; }
		
		//'wait' time=EInt unit=Time_unit 'then go to' next=[State|EString]
		public Group getGroup_1() { return cGroup_1; }
		
		//'wait'
		public Keyword getWaitKeyword_1_0() { return cWaitKeyword_1_0; }
		
		//time=EInt
		public Assignment getTimeAssignment_1_1() { return cTimeAssignment_1_1; }
		
		//EInt
		public RuleCall getTimeEIntParserRuleCall_1_1_0() { return cTimeEIntParserRuleCall_1_1_0; }
		
		//unit=Time_unit
		public Assignment getUnitAssignment_1_2() { return cUnitAssignment_1_2; }
		
		//Time_unit
		public RuleCall getUnitTime_unitEnumRuleCall_1_2_0() { return cUnitTime_unitEnumRuleCall_1_2_0; }
		
		//'then go to'
		public Keyword getThenGoToKeyword_1_3() { return cThenGoToKeyword_1_3; }
		
		//next=[State|EString]
		public Assignment getNextAssignment_1_4() { return cNextAssignment_1_4; }
		
		//[State|EString]
		public CrossReference getNextStateCrossReference_1_4_0() { return cNextStateCrossReference_1_4_0; }
		
		//EString
		public RuleCall getNextStateEStringParserRuleCall_1_4_0_1() { return cNextStateEStringParserRuleCall_1_4_0_1; }
	}
	
	public class SignalElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "arduinoML.concretesyntax.ArduinoML.Signal");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cHIGHEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cHIGHHIGHKeyword_0_0 = (Keyword)cHIGHEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cLOWEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cLOWLOWKeyword_1_0 = (Keyword)cLOWEnumLiteralDeclaration_1.eContents().get(0);
		
		//enum Signal:
		//	HIGH | LOW;
		public EnumRule getRule() { return rule; }
		
		//HIGH | LOW
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//HIGH
		public EnumLiteralDeclaration getHIGHEnumLiteralDeclaration_0() { return cHIGHEnumLiteralDeclaration_0; }
		
		//'HIGH'
		public Keyword getHIGHHIGHKeyword_0_0() { return cHIGHHIGHKeyword_0_0; }
		
		//LOW
		public EnumLiteralDeclaration getLOWEnumLiteralDeclaration_1() { return cLOWEnumLiteralDeclaration_1; }
		
		//'LOW'
		public Keyword getLOWLOWKeyword_1_0() { return cLOWLOWKeyword_1_0; }
	}
	public class Time_unitElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "arduinoML.concretesyntax.ArduinoML.Time_unit");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cMsEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cMsMsKeyword_0_0 = (Keyword)cMsEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cSEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cSSKeyword_1_0 = (Keyword)cSEnumLiteralDeclaration_1.eContents().get(0);
		private final EnumLiteralDeclaration cMinEnumLiteralDeclaration_2 = (EnumLiteralDeclaration)cAlternatives.eContents().get(2);
		private final Keyword cMinMinKeyword_2_0 = (Keyword)cMinEnumLiteralDeclaration_2.eContents().get(0);
		
		//enum Time_unit:
		//	ms | s | min;
		public EnumRule getRule() { return rule; }
		
		//ms | s | min
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//ms
		public EnumLiteralDeclaration getMsEnumLiteralDeclaration_0() { return cMsEnumLiteralDeclaration_0; }
		
		//'ms'
		public Keyword getMsMsKeyword_0_0() { return cMsMsKeyword_0_0; }
		
		//s
		public EnumLiteralDeclaration getSEnumLiteralDeclaration_1() { return cSEnumLiteralDeclaration_1; }
		
		//'s'
		public Keyword getSSKeyword_1_0() { return cSSKeyword_1_0; }
		
		//min
		public EnumLiteralDeclaration getMinEnumLiteralDeclaration_2() { return cMinEnumLiteralDeclaration_2; }
		
		//'min'
		public Keyword getMinMinKeyword_2_0() { return cMinMinKeyword_2_0; }
	}
	
	private final AppElements pApp;
	private final BrickElements pBrick;
	private final EStringElements pEString;
	private final StateElements pState;
	private final EIntElements pEInt;
	private final ActuatorElements pActuator;
	private final SensorElements pSensor;
	private final ActionElements pAction;
	private final TransitionElements pTransition;
	private final SignalElements eSignal;
	private final Time_unitElements eTime_unit;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public ArduinoMLGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pApp = new AppElements();
		this.pBrick = new BrickElements();
		this.pEString = new EStringElements();
		this.pState = new StateElements();
		this.pEInt = new EIntElements();
		this.pActuator = new ActuatorElements();
		this.pSensor = new SensorElements();
		this.pAction = new ActionElements();
		this.pTransition = new TransitionElements();
		this.eSignal = new SignalElements();
		this.eTime_unit = new Time_unitElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("arduinoML.concretesyntax.ArduinoML".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//App:
	//	'app' name=EString 'initial state' initial=[State|EString] ':'
	//	'bricks :'
	//	bricks+=Brick
	//	bricks+=Brick*
	//	'states :'
	//	states+=State
	//	states+=State*;
	public AppElements getAppAccess() {
		return pApp;
	}
	
	public ParserRule getAppRule() {
		return getAppAccess().getRule();
	}
	
	//Brick:
	//	(Actuator | Sensor) name=EString ':' pin=EInt;
	public BrickElements getBrickAccess() {
		return pBrick;
	}
	
	public ParserRule getBrickRule() {
		return getBrickAccess().getRule();
	}
	
	//EString:
	//	STRING | ID;
	public EStringElements getEStringAccess() {
		return pEString;
	}
	
	public ParserRule getEStringRule() {
		return getEStringAccess().getRule();
	}
	
	//State:
	//	name=EString ':'
	//	actions+=Action
	//	actions+=Action*
	//	transitions+=Transition
	//	transitions+=Transition*;
	public StateElements getStateAccess() {
		return pState;
	}
	
	public ParserRule getStateRule() {
		return getStateAccess().getRule();
	}
	
	//EInt ecore::EInt:
	//	'-'? INT;
	public EIntElements getEIntAccess() {
		return pEInt;
	}
	
	public ParserRule getEIntRule() {
		return getEIntAccess().getRule();
	}
	
	//Actuator:
	//	{Actuator}
	//	'Actuator';
	public ActuatorElements getActuatorAccess() {
		return pActuator;
	}
	
	public ParserRule getActuatorRule() {
		return getActuatorAccess().getRule();
	}
	
	//Sensor:
	//	{Sensor}
	//	'Sensor';
	public SensorElements getSensorAccess() {
		return pSensor;
	}
	
	public ParserRule getSensorRule() {
		return getSensorAccess().getRule();
	}
	
	//Action:
	//	'change' actuator=[Actuator|EString] 'to' value=Signal;
	public ActionElements getActionAccess() {
		return pAction;
	}
	
	public ParserRule getActionRule() {
		return getActionAccess().getRule();
	}
	
	//Transition:
	//	'when' sensors+=[Sensor|EString] 'is' values+=Signal ('and' sensors+=[Sensor|EString] 'is' values+=Signal)* 'go to'
	//	next=[State|EString] | 'wait' time=EInt unit=Time_unit 'then go to' next=[State|EString];
	public TransitionElements getTransitionAccess() {
		return pTransition;
	}
	
	public ParserRule getTransitionRule() {
		return getTransitionAccess().getRule();
	}
	
	//enum Signal:
	//	HIGH | LOW;
	public SignalElements getSignalAccess() {
		return eSignal;
	}
	
	public EnumRule getSignalRule() {
		return getSignalAccess().getRule();
	}
	
	//enum Time_unit:
	//	ms | s | min;
	public Time_unitElements getTime_unitAccess() {
		return eTime_unit;
	}
	
	public EnumRule getTime_unitRule() {
		return getTime_unitAccess().getRule();
	}
	
	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt:
	//	'0'..'9'+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' | "'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT:
	//	'/*'->'*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
