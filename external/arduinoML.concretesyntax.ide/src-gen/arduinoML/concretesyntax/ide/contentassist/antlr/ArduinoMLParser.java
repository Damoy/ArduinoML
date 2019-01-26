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
			builder.put(grammarAccess.getBrickAccess().getAlternatives_0(), "rule__Brick__Alternatives_0");
			builder.put(grammarAccess.getEStringAccess().getAlternatives(), "rule__EString__Alternatives");
			builder.put(grammarAccess.getTransitionAccess().getAlternatives(), "rule__Transition__Alternatives");
			builder.put(grammarAccess.getSignalAccess().getAlternatives(), "rule__Signal__Alternatives");
			builder.put(grammarAccess.getAppAccess().getGroup(), "rule__App__Group__0");
			builder.put(grammarAccess.getBrickAccess().getGroup(), "rule__Brick__Group__0");
			builder.put(grammarAccess.getStateAccess().getGroup(), "rule__State__Group__0");
			builder.put(grammarAccess.getEIntAccess().getGroup(), "rule__EInt__Group__0");
			builder.put(grammarAccess.getActuatorAccess().getGroup(), "rule__Actuator__Group__0");
			builder.put(grammarAccess.getSensorAccess().getGroup(), "rule__Sensor__Group__0");
			builder.put(grammarAccess.getActionAccess().getGroup(), "rule__Action__Group__0");
			builder.put(grammarAccess.getTransitionAccess().getGroup_0(), "rule__Transition__Group_0__0");
			builder.put(grammarAccess.getTransitionAccess().getGroup_0_4(), "rule__Transition__Group_0_4__0");
			builder.put(grammarAccess.getTransitionAccess().getGroup_1(), "rule__Transition__Group_1__0");
			builder.put(grammarAccess.getAppAccess().getNameAssignment_1(), "rule__App__NameAssignment_1");
			builder.put(grammarAccess.getAppAccess().getInitialAssignment_3(), "rule__App__InitialAssignment_3");
			builder.put(grammarAccess.getAppAccess().getBricksAssignment_6(), "rule__App__BricksAssignment_6");
			builder.put(grammarAccess.getAppAccess().getBricksAssignment_7(), "rule__App__BricksAssignment_7");
			builder.put(grammarAccess.getAppAccess().getStatesAssignment_9(), "rule__App__StatesAssignment_9");
			builder.put(grammarAccess.getAppAccess().getStatesAssignment_10(), "rule__App__StatesAssignment_10");
			builder.put(grammarAccess.getBrickAccess().getNameAssignment_1(), "rule__Brick__NameAssignment_1");
			builder.put(grammarAccess.getBrickAccess().getPinAssignment_3(), "rule__Brick__PinAssignment_3");
			builder.put(grammarAccess.getStateAccess().getNameAssignment_0(), "rule__State__NameAssignment_0");
			builder.put(grammarAccess.getStateAccess().getActionsAssignment_2(), "rule__State__ActionsAssignment_2");
			builder.put(grammarAccess.getStateAccess().getActionsAssignment_3(), "rule__State__ActionsAssignment_3");
			builder.put(grammarAccess.getStateAccess().getTransitionsAssignment_4(), "rule__State__TransitionsAssignment_4");
			builder.put(grammarAccess.getStateAccess().getTransitionsAssignment_5(), "rule__State__TransitionsAssignment_5");
			builder.put(grammarAccess.getActionAccess().getActuatorAssignment_1(), "rule__Action__ActuatorAssignment_1");
			builder.put(grammarAccess.getActionAccess().getValueAssignment_3(), "rule__Action__ValueAssignment_3");
			builder.put(grammarAccess.getTransitionAccess().getSensorsAssignment_0_1(), "rule__Transition__SensorsAssignment_0_1");
			builder.put(grammarAccess.getTransitionAccess().getValuesAssignment_0_3(), "rule__Transition__ValuesAssignment_0_3");
			builder.put(grammarAccess.getTransitionAccess().getSensorsAssignment_0_4_1(), "rule__Transition__SensorsAssignment_0_4_1");
			builder.put(grammarAccess.getTransitionAccess().getValuesAssignment_0_4_3(), "rule__Transition__ValuesAssignment_0_4_3");
			builder.put(grammarAccess.getTransitionAccess().getNextAssignment_0_6(), "rule__Transition__NextAssignment_0_6");
			builder.put(grammarAccess.getTransitionAccess().getTimeAssignment_1_1(), "rule__Transition__TimeAssignment_1_1");
			builder.put(grammarAccess.getTransitionAccess().getNextAssignment_1_3(), "rule__Transition__NextAssignment_1_3");
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
