/**
 * Copyright Dignitas Technologies, LLC
 * 
 * This file and its contents are governed by one or more distribution and
 * copyright statements as described in the LICENSE.txt file distributed with
 * this work.
 */
package mil.arl.gift.tools.authoring.server.gat.client.view.dkf.task.task;

import java.io.Serializable;
import java.math.BigDecimal;

import generated.dkf.EndTriggers;
import generated.dkf.EndTriggers.Trigger;
import generated.dkf.EntityLocation;
import generated.dkf.StartTriggers.Trigger.TriggerMessage;
import mil.arl.gift.common.util.StringUtils;
import mil.arl.gift.tools.authoring.server.gat.client.view.dkf.util.ScenarioClientUtility;
import mil.arl.gift.tools.authoring.server.gat.client.view.dkf.util.ScenarioValidatorUtility;

/**
 * The inline editor for adding or editing an End Trigger.
 * 
 * @author sharrison
 */
public class AddEndTriggerWidget extends AddTriggerWidget<EndTriggers.Trigger> {

    /**
     * Constructor.
     */
    public AddEndTriggerWidget() {
        super();

        ruleLabel.setText("This event should stop this task when...");
        delayLabel.setText("Wait an additional");
        delayLabel2.setText("second(s) before stopping this task.");
        
        excludeTriggerTypeChoices(TriggerType.SCENARIO_STARTS);

        showFeedbackUI(false);
    }

    @Override
    protected void applyEdits(EndTriggers.Trigger trigger) {
        if (trigger == null) {
            throw new IllegalArgumentException("The parameter 'trigger' cannot be null.");
        }

        trigger.setTriggerType(getTriggerTypeFromInput());
        trigger.setTriggerDelay(getDelayFromInput());

        /* The team references may have changed, so update the global reference
         * map */
        if (trigger.getTriggerType() instanceof EntityLocation) {
            ScenarioClientUtility.gatherTeamReferences();
        }
    }

    @Override
    protected Serializable getTriggerChoice(EndTriggers.Trigger trigger) {
        return trigger != null ? trigger.getTriggerType() : null;
    }

    @Override
    protected BigDecimal getDelay(EndTriggers.Trigger trigger) {
        return trigger != null ? trigger.getTriggerDelay() : null;
    }

    @Override
    protected TriggerMessage getTriggerMessage(EndTriggers.Trigger trigger) {
        // only start triggers have trigger messages
        return null;
    }

    @Override
    protected boolean validate(Trigger trigger) {
        String errorMsg = ScenarioValidatorUtility.validateEndTrigger(trigger);
        return StringUtils.isBlank(errorMsg);
    }
}
