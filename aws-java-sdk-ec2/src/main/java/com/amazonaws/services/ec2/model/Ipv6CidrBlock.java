/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;

/**
 * <p>
 * Describes an IPv6 CIDR block.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/Ipv6CidrBlock"/>AWS API Documentation</a>
 */
public class Ipv6CidrBlock implements Serializable, Cloneable {

    /**
     * <p>
     * The IPv6 CIDR block.
     * </p>
     */
    private String ipv6CidrBlock;

    /**
     * <p>
     * The IPv6 CIDR block.
     * </p>
     * 
     * @param ipv6CidrBlock
     *        The IPv6 CIDR block.
     */

    public void setIpv6CidrBlock(String ipv6CidrBlock) {
        this.ipv6CidrBlock = ipv6CidrBlock;
    }

    /**
     * <p>
     * The IPv6 CIDR block.
     * </p>
     * 
     * @return The IPv6 CIDR block.
     */

    public String getIpv6CidrBlock() {
        return this.ipv6CidrBlock;
    }

    /**
     * <p>
     * The IPv6 CIDR block.
     * </p>
     * 
     * @param ipv6CidrBlock
     *        The IPv6 CIDR block.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Ipv6CidrBlock withIpv6CidrBlock(String ipv6CidrBlock) {
        setIpv6CidrBlock(ipv6CidrBlock);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getIpv6CidrBlock() != null)
            sb.append("Ipv6CidrBlock: ").append(getIpv6CidrBlock());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Ipv6CidrBlock == false)
            return false;
        Ipv6CidrBlock other = (Ipv6CidrBlock) obj;
        if (other.getIpv6CidrBlock() == null ^ this.getIpv6CidrBlock() == null)
            return false;
        if (other.getIpv6CidrBlock() != null && other.getIpv6CidrBlock().equals(this.getIpv6CidrBlock()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIpv6CidrBlock() == null) ? 0 : getIpv6CidrBlock().hashCode());
        return hashCode;
    }

    @Override
    public Ipv6CidrBlock clone() {
        try {
            return (Ipv6CidrBlock) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}