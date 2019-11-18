/*
 * (C) Copyright IBM Corp. 2019.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */
package com.ibm.watson.discovery.v2.model;

import java.util.ArrayList;
import java.util.List;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The updateTrainingQuery options.
 */
public class UpdateTrainingQueryOptions extends GenericModel {

  private String projectId;
  private String queryId;
  private String naturalLanguageQuery;
  private String filter;
  private List<TrainingExample> examples;

  /**
   * Builder.
   */
  public static class Builder {
    private String projectId;
    private String queryId;
    private String naturalLanguageQuery;
    private String filter;
    private List<TrainingExample> examples;

    private Builder(UpdateTrainingQueryOptions updateTrainingQueryOptions) {
      this.projectId = updateTrainingQueryOptions.projectId;
      this.queryId = updateTrainingQueryOptions.queryId;
      this.naturalLanguageQuery = updateTrainingQueryOptions.naturalLanguageQuery;
      this.filter = updateTrainingQueryOptions.filter;
      this.examples = updateTrainingQueryOptions.examples;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param projectId the projectId
     * @param queryId the queryId
     */
    public Builder(String projectId, String queryId) {
      this.projectId = projectId;
      this.queryId = queryId;
    }

    /**
     * Builds a UpdateTrainingQueryOptions.
     *
     * @return the updateTrainingQueryOptions
     */
    public UpdateTrainingQueryOptions build() {
      return new UpdateTrainingQueryOptions(this);
    }

    /**
     * Adds an examples to examples.
     *
     * @param examples the new examples
     * @return the UpdateTrainingQueryOptions builder
     */
    public Builder addExamples(TrainingExample examples) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(examples,
          "examples cannot be null");
      if (this.examples == null) {
        this.examples = new ArrayList<TrainingExample>();
      }
      this.examples.add(examples);
      return this;
    }

    /**
     * Set the projectId.
     *
     * @param projectId the projectId
     * @return the UpdateTrainingQueryOptions builder
     */
    public Builder projectId(String projectId) {
      this.projectId = projectId;
      return this;
    }

    /**
     * Set the queryId.
     *
     * @param queryId the queryId
     * @return the UpdateTrainingQueryOptions builder
     */
    public Builder queryId(String queryId) {
      this.queryId = queryId;
      return this;
    }

    /**
     * Set the naturalLanguageQuery.
     *
     * @param naturalLanguageQuery the naturalLanguageQuery
     * @return the UpdateTrainingQueryOptions builder
     */
    public Builder naturalLanguageQuery(String naturalLanguageQuery) {
      this.naturalLanguageQuery = naturalLanguageQuery;
      return this;
    }

    /**
     * Set the filter.
     *
     * @param filter the filter
     * @return the UpdateTrainingQueryOptions builder
     */
    public Builder filter(String filter) {
      this.filter = filter;
      return this;
    }

    /**
     * Set the examples.
     * Existing examples will be replaced.
     *
     * @param examples the examples
     * @return the UpdateTrainingQueryOptions builder
     */
    public Builder examples(List<TrainingExample> examples) {
      this.examples = examples;
      return this;
    }

    /**
     * Set the trainingQuery.
     *
     * @param trainingQuery the trainingQuery
     * @return the UpdateTrainingQueryOptions builder
     */
    public Builder trainingQuery(TrainingQuery trainingQuery) {
      this.naturalLanguageQuery = trainingQuery.naturalLanguageQuery();
      this.filter = trainingQuery.filter();
      this.examples = trainingQuery.examples();
      return this;
    }
  }

  private UpdateTrainingQueryOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.projectId,
        "projectId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.queryId,
        "queryId cannot be empty");
    projectId = builder.projectId;
    queryId = builder.queryId;
    naturalLanguageQuery = builder.naturalLanguageQuery;
    filter = builder.filter;
    examples = builder.examples;
  }

  /**
   * New builder.
   *
   * @return a UpdateTrainingQueryOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the projectId.
   *
   * The ID of the project. This information can be found from the deploy page of the Discovery administrative tooling.
   *
   * @return the projectId
   */
  public String projectId() {
    return projectId;
  }

  /**
   * Gets the queryId.
   *
   * The ID of the query used for training.
   *
   * @return the queryId
   */
  public String queryId() {
    return queryId;
  }

  /**
   * Gets the naturalLanguageQuery.
   *
   * The natural text query for the training query.
   *
   * @return the naturalLanguageQuery
   */
  public String naturalLanguageQuery() {
    return naturalLanguageQuery;
  }

  /**
   * Gets the filter.
   *
   * The filter used on the collection before the **natural_language_query** is applied.
   *
   * @return the filter
   */
  public String filter() {
    return filter;
  }

  /**
   * Gets the examples.
   *
   * Array of training examples.
   *
   * @return the examples
   */
  public List<TrainingExample> examples() {
    return examples;
  }
}
