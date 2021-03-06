/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.s3control;

import javax.annotation.Generated;

import com.amazonaws.services.s3control.model.*;
import com.amazonaws.*;

/**
 * Abstract implementation of {@code AWSS3Control}. Convenient method forms pass through to the corresponding overload
 * that takes a request object, which throws an {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAWSS3Control implements AWSS3Control {

    protected AbstractAWSS3Control() {
    }

    @Override
    public CreateAccessPointResult createAccessPoint(CreateAccessPointRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateJobResult createJob(CreateJobRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteAccessPointResult deleteAccessPoint(DeleteAccessPointRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteAccessPointPolicyResult deleteAccessPointPolicy(DeleteAccessPointPolicyRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteJobTaggingResult deleteJobTagging(DeleteJobTaggingRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeletePublicAccessBlockResult deletePublicAccessBlock(DeletePublicAccessBlockRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeJobResult describeJob(DescribeJobRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetAccessPointResult getAccessPoint(GetAccessPointRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetAccessPointPolicyResult getAccessPointPolicy(GetAccessPointPolicyRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetAccessPointPolicyStatusResult getAccessPointPolicyStatus(GetAccessPointPolicyStatusRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetJobTaggingResult getJobTagging(GetJobTaggingRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetPublicAccessBlockResult getPublicAccessBlock(GetPublicAccessBlockRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListAccessPointsResult listAccessPoints(ListAccessPointsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListJobsResult listJobs(ListJobsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public PutAccessPointPolicyResult putAccessPointPolicy(PutAccessPointPolicyRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public PutJobTaggingResult putJobTagging(PutJobTaggingRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public PutPublicAccessBlockResult putPublicAccessBlock(PutPublicAccessBlockRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public UpdateJobPriorityResult updateJobPriority(UpdateJobPriorityRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public UpdateJobStatusResult updateJobStatus(UpdateJobStatusRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void shutdown() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public com.amazonaws.services.s3control.S3ControlResponseMetadata getCachedResponseMetadata(com.amazonaws.AmazonWebServiceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

}
