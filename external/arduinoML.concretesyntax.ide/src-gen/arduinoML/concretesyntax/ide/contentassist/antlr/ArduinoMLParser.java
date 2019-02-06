/*
 * generated by Xtext 2.16.0
 */
package arduinoML.concretesyntax.ide.contentassist.antlr;

import arduinoML.concretesyntax.ide.contentassist.antlr.internal.InternalArduinoMLParser;
import arduinoML.concretesyntax.services.ArduinoMLGrammarAccess;
import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class ArduinoMLParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(ArduinoMLGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, ArduinoMLGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getAppAccess().getAlternatives(), "rule__App__Alternatives");
			builder.put(grammarAccess.getBrickAccess().getAlternatives_0(), "rule__Brick__Alternatives_0");
			builder.put(grammarAccess.getEStringAccess().getAlternatives(), "rule__EString__Alternatives");
			builder.put(grammarAccess.getTransitionAccess().getAlternatives(), "rule__Transition__Alternatives");
			builder.put(grammarAccess.getTransitionStateAccess().getAlternatives_0(), "rule__TransitionState__Alternatives_0");
			builder.put(grammarAccess.getTransitionStateAccess().getAlternatives_0_0_1(), "rule__TransitionState__Alternatives_0_0_1");
			builder.put(grammarAccess.getTransitionStateAccess().getAlternatives_0_0_2_1(), "rule__TransitionState__Alternatives_0_0_2_1");
			builder.put(grammarAccess.getTransitionModeAccess().getAlternatives_0(), "rule__TransitionMode__Alternatives_0");
			builder.put(grammarAccess.getTransitionModeAccess().getAlternatives_0_0_1(), "rule__TransitionMode__Alternatives_0_0_1");
			builder.put(grammarAccess.getTransitionModeAccess().getAlternatives_0_0_2_1(), "rule__TransitionMode__Alternatives_0_0_2_1");
			builder.put(grammarAccess.getSignalAccess().getAlternatives(), "rule__Signal__Alternatives");
			builder.put(grammarAccess.getTime_unitAccess().getAlternatives(), "rule__Time_unit__Alternatives");
			builder.put(grammarAccess.getCompareAccess().getAlternatives(), "rule__Compare__Alternatives");
			builder.put(grammarAccess.getAppAccess().getGroup_0(), "rule__App__Group_0__0");
			builder.put(grammarAccess.getAppAccess().getGroup_1(), "rule__App__Group_1__0");
			builder.put(grammarAccess.getBrickAccess().getGroup(), "rule__Brick__Group__0");
			builder.put(grammarAccess.getModeAccess().getGroup(), "rule__Mode__Group__0");
			builder.put(grammarAccess.getModeAccess().getGroup_5(), "rule__Mode__Group_5__0");
			builder.put(grammarAccess.getStateAccess().getGroup(), "rule__State__Group__0");
			builder.put(grammarAccess.getActuatorAccess().getGroup(), "rule__Actuator__Group__0");
			builder.put(grammarAccess.getDigitalAccess().getGroup(), "rule__Digital__Group__0");
			builder.put(grammarAccess.getAnalogAccess().getGroup(), "rule__Analog__Group__0");
			builder.put(grammarAccess.getActionAccess().getGroup(), "rule__Action__Group__0");
			builder.put(grammarAccess.getTransitionStateAccess().getGroup(), "rule__TransitionState__Group__0");
			builder.put(grammarAccess.getTransitionStateAccess().getGroup_0_0(), "rule__TransitionState__Group_0_0__0");
			builder.put(grammarAccess.getTransitionStateAccess().getGroup_0_0_1_0(), "rule__TransitionState__Group_0_0_1_0__0");
			builder.put(grammarAccess.getTransitionStateAccess().getGroup_0_0_1_1(), "rule__TransitionState__Group_0_0_1_1__0");
			builder.put(grammarAccess.getTransitionStateAccess().getGroup_0_0_2(), "rule__TransitionState__Group_0_0_2__0");
			builder.put(grammarAccess.getTransitionStateAccess().getGroup_0_0_2_1_0(), "rule__TransitionState__Group_0_0_2_1_0__0");
			builder.put(grammarAccess.getTransitionStateAccess().getGroup_0_0_2_1_1(), "rule__TransitionState__Group_0_0_2_1_1__0");
			builder.put(grammarAccess.getTransitionStateAccess().getGroup_0_0_3(), "rule__TransitionState__Group_0_0_3__0");
			builder.put(grammarAccess.getTransitionStateAccess().getGroup_0_1(), "rule__TransitionState__Group_0_1__0");
			builder.put(grammarAccess.getTransitionModeAccess().getGroup(), "rule__TransitionMode__Group__0");
			builder.put(grammarAccess.getTransitionModeAccess().getGroup_0_0(), "rule__TransitionMode__Group_0_0__0");
			builder.put(grammarAccess.getTransitionModeAccess().getGroup_0_0_1_0(), "rule__TransitionMode__Group_0_0_1_0__0");
			builder.put(grammarAccess.getTransitionModeAccess().getGroup_0_0_1_1(), "rule__TransitionMode__Group_0_0_1_1__0");
			builder.put(grammarAccess.getTransitionModeAccess().getGroup_0_0_2(), "rule__TransitionMode__Group_0_0_2__0");
			builder.put(grammarAccess.getTransitionModeAccess().getGroup_0_0_2_1_0(), "rule__TransitionMode__Group_0_0_2_1_0__0");
			builder.put(grammarAccess.getTransitionModeAccess().getGroup_0_0_2_1_1(), "rule__TransitionMode__Group_0_0_2_1_1__0");
			builder.put(grammarAccess.getTransitionModeAccess().getGroup_0_0_3(), "rule__TransitionMode__Group_0_0_3__0");
			builder.put(grammarAccess.getTransitionModeAccess().getGroup_0_1(), "rule__TransitionMode__Group_0_1__0");
			builder.put(grammarAccess.getAppAccess().getNameAssignment_0_1(), "rule__App__NameAssignment_0_1");
			builder.put(grammarAccess.getAppAccess().getInitial_stateAssignment_0_4(), "rule__App__Initial_stateAssignment_0_4");
			builder.put(grammarAccess.getAppAccess().getBricksAssignment_0_8(), "rule__App__BricksAssignment_0_8");
			builder.put(grammarAccess.getAppAccess().getBricksAssignment_0_9(), "rule__App__BricksAssignment_0_9");
			builder.put(grammarAccess.getAppAccess().getStatesAssignment_0_12(), "rule__App__StatesAssignment_0_12");
			builder.put(grammarAccess.getAppAccess().getStatesAssignment_0_13(), "rule__App__StatesAssignment_0_13");
			builder.put(grammarAccess.getAppAccess().getNameAssignment_1_1(), "rule__App__NameAssignment_1_1");
			builder.put(grammarAccess.getAppAccess().getInitial_modeAssignment_1_4(), "rule__App__Initial_modeAssignment_1_4");
			builder.put(grammarAccess.getAppAccess().getBricksAssignment_1_8(), "rule__App__BricksAssignment_1_8");
			builder.put(grammarAccess.getAppAccess().getBricksAssignment_1_9(), "rule__App__BricksAssignment_1_9");
			builder.put(grammarAccess.getAppAccess().getModesAssignment_1_12(), "rule__App__ModesAssignment_1_12");
			builder.put(grammarAccess.getAppAccess().getModesAssignment_1_13(), "rule__App__ModesAssignment_1_13");
			builder.put(grammarAccess.getBrickAccess().getNameAssignment_1(), "rule__Brick__NameAssignment_1");
			builder.put(grammarAccess.getBrickAccess().getPinAssignment_3(), "rule__Brick__PinAssignment_3");
			builder.put(grammarAccess.getModeAccess().getNameAssignment_0(), "rule__Mode__NameAssignment_0");
			builder.put(grammarAccess.getModeAccess().getInitialAssignment_3(), "rule__Mode__InitialAssignment_3");
			builder.put(grammarAccess.getModeAccess().getBricksAssignment_5_2(), "rule__Mode__BricksAssignment_5_2");
			builder.put(grammarAccess.getModeAccess().getBricksAssignment_5_3(), "rule__Mode__BricksAssignment_5_3");
			builder.put(grammarAccess.getModeAccess().getStatesAssignment_8(), "rule__Mode__StatesAssignment_8");
			builder.put(grammarAccess.getModeAccess().getStatesAssignment_9(), "rule__Mode__StatesAssignment_9");
			builder.put(grammarAccess.getModeAccess().getTransitions_modeAssignment_12(), "rule__Mode__Transitions_modeAssignment_12");
			builder.put(grammarAccess.getModeAccess().getTransitions_modeAssignment_13(), "rule__Mode__Transitions_modeAssignment_13");
			builder.put(grammarAccess.getStateAccess().getNameAssignment_0(), "rule__State__NameAssignment_0");
			builder.put(grammarAccess.getStateAccess().getActionsAssignment_2(), "rule__State__ActionsAssignment_2");
			builder.put(grammarAccess.getStateAccess().getActionsAssignment_3(), "rule__State__ActionsAssignment_3");
			builder.put(grammarAccess.getStateAccess().getTransitions_stateAssignment_4(), "rule__State__Transitions_stateAssignment_4");
			builder.put(grammarAccess.getStateAccess().getTransitions_stateAssignment_5(), "rule__State__Transitions_stateAssignment_5");
			builder.put(grammarAccess.getActionAccess().getActuatorAssignment_1(), "rule__Action__ActuatorAssignment_1");
			builder.put(grammarAccess.getActionAccess().getValueAssignment_3(), "rule__Action__ValueAssignment_3");
			builder.put(grammarAccess.getTransitionStateAccess().getDigitalsAssignment_0_0_1_0_0(), "rule__TransitionState__DigitalsAssignment_0_0_1_0_0");
			builder.put(grammarAccess.getTransitionStateAccess().getD_valuesAssignment_0_0_1_0_2(), "rule__TransitionState__D_valuesAssignment_0_0_1_0_2");
			builder.put(grammarAccess.getTransitionStateAccess().getAnalogsAssignment_0_0_1_1_0(), "rule__TransitionState__AnalogsAssignment_0_0_1_1_0");
			builder.put(grammarAccess.getTransitionStateAccess().getCompAssignment_0_0_1_1_1(), "rule__TransitionState__CompAssignment_0_0_1_1_1");
			builder.put(grammarAccess.getTransitionStateAccess().getA_valuesAssignment_0_0_1_1_2(), "rule__TransitionState__A_valuesAssignment_0_0_1_1_2");
			builder.put(grammarAccess.getTransitionStateAccess().getDigitalsAssignment_0_0_2_1_0_0(), "rule__TransitionState__DigitalsAssignment_0_0_2_1_0_0");
			builder.put(grammarAccess.getTransitionStateAccess().getD_valuesAssignment_0_0_2_1_0_2(), "rule__TransitionState__D_valuesAssignment_0_0_2_1_0_2");
			builder.put(grammarAccess.getTransitionStateAccess().getAnalogsAssignment_0_0_2_1_1_0(), "rule__TransitionState__AnalogsAssignment_0_0_2_1_1_0");
			builder.put(grammarAccess.getTransitionStateAccess().getCompAssignment_0_0_2_1_1_1(), "rule__TransitionState__CompAssignment_0_0_2_1_1_1");
			builder.put(grammarAccess.getTransitionStateAccess().getA_valuesAssignment_0_0_2_1_1_2(), "rule__TransitionState__A_valuesAssignment_0_0_2_1_1_2");
			builder.put(grammarAccess.getTransitionStateAccess().getTimeAssignment_0_0_3_1(), "rule__TransitionState__TimeAssignment_0_0_3_1");
			builder.put(grammarAccess.getTransitionStateAccess().getUnitAssignment_0_0_3_2(), "rule__TransitionState__UnitAssignment_0_0_3_2");
			builder.put(grammarAccess.getTransitionStateAccess().getTimeAssignment_0_1_1(), "rule__TransitionState__TimeAssignment_0_1_1");
			builder.put(grammarAccess.getTransitionStateAccess().getUnitAssignment_0_1_2(), "rule__TransitionState__UnitAssignment_0_1_2");
			builder.put(grammarAccess.getTransitionStateAccess().getNext_stateAssignment_4(), "rule__TransitionState__Next_stateAssignment_4");
			builder.put(grammarAccess.getTransitionModeAccess().getDigitalsAssignment_0_0_1_0_0(), "rule__TransitionMode__DigitalsAssignment_0_0_1_0_0");
			builder.put(grammarAccess.getTransitionModeAccess().getD_valuesAssignment_0_0_1_0_2(), "rule__TransitionMode__D_valuesAssignment_0_0_1_0_2");
			builder.put(grammarAccess.getTransitionModeAccess().getAnalogsAssignment_0_0_1_1_0(), "rule__TransitionMode__AnalogsAssignment_0_0_1_1_0");
			builder.put(grammarAccess.getTransitionModeAccess().getCompAssignment_0_0_1_1_1(), "rule__TransitionMode__CompAssignment_0_0_1_1_1");
			builder.put(grammarAccess.getTransitionModeAccess().getA_valuesAssignment_0_0_1_1_2(), "rule__TransitionMode__A_valuesAssignment_0_0_1_1_2");
			builder.put(grammarAccess.getTransitionModeAccess().getDigitalsAssignment_0_0_2_1_0_0(), "rule__TransitionMode__DigitalsAssignment_0_0_2_1_0_0");
			builder.put(grammarAccess.getTransitionModeAccess().getD_valuesAssignment_0_0_2_1_0_2(), "rule__TransitionMode__D_valuesAssignment_0_0_2_1_0_2");
			builder.put(grammarAccess.getTransitionModeAccess().getAnalogsAssignment_0_0_2_1_1_0(), "rule__TransitionMode__AnalogsAssignment_0_0_2_1_1_0");
			builder.put(grammarAccess.getTransitionModeAccess().getCompAssignment_0_0_2_1_1_1(), "rule__TransitionMode__CompAssignment_0_0_2_1_1_1");
			builder.put(grammarAccess.getTransitionModeAccess().getA_valuesAssignment_0_0_2_1_1_2(), "rule__TransitionMode__A_valuesAssignment_0_0_2_1_1_2");
			builder.put(grammarAccess.getTransitionModeAccess().getTimeAssignment_0_0_3_1(), "rule__TransitionMode__TimeAssignment_0_0_3_1");
			builder.put(grammarAccess.getTransitionModeAccess().getUnitAssignment_0_0_3_2(), "rule__TransitionMode__UnitAssignment_0_0_3_2");
			builder.put(grammarAccess.getTransitionModeAccess().getTimeAssignment_0_1_1(), "rule__TransitionMode__TimeAssignment_0_1_1");
			builder.put(grammarAccess.getTransitionModeAccess().getUnitAssignment_0_1_2(), "rule__TransitionMode__UnitAssignment_0_1_2");
			builder.put(grammarAccess.getTransitionModeAccess().getNext_modeAssignment_4(), "rule__TransitionMode__Next_modeAssignment_4");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private ArduinoMLGrammarAccess grammarAccess;

	@Override
	protected InternalArduinoMLParser createParser() {
		InternalArduinoMLParser result = new InternalArduinoMLParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public ArduinoMLGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(ArduinoMLGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
