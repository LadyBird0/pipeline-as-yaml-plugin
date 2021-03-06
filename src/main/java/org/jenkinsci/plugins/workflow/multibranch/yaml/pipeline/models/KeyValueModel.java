package org.jenkinsci.plugins.workflow.multibranch.yaml.pipeline.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.jenkinsci.plugins.workflow.multibranch.yaml.pipeline.interfaces.ParsableModelInterface;

/**
 * Model Class for Key/Value Pairs used in other models
 */
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class KeyValueModel extends AbstractModel implements ParsableModelInterface {
    private String key;
    private String value;

    @Override
    public String toGroovy() {
        return new StringBuffer()
                .append(this.key)
                .append(this.getParameterOpen())
                .append(this.value)
                .append(this.getParameterClose())
                .toString();
    }
}
