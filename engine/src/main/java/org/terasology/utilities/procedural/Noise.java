/*
 * Copyright 2013 MovingBlocks
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.terasology.utilities.procedural;

/**
 * noise interface for noise generators
 *
 * @author Esa-Petri Tirkkonen <esereja@yahoo.co.uk>
 */
public interface Noise {

    /**
     * Returns the noise value at the given position.
     *
     * @param x Position on the x-axis
     * @param y Position on the y-axis
     * @param z Position on the z-axis
     * @return The noise value
     */
    double noise(double x, double y, double z);

    /**
     * Returns Fractional Brownian Motion at the given position.
     *
     * @param x Position on the x-axis
     * @param y Position on the y-axis
     * @param z Position on the z-axis
     * @return The noise value
     * @deprecated Please use BrownianNoise3D.noise() instead
     */
    @Deprecated
    double fBm(double x, double y, double z);

    /**
     * @deprecated Please use BrownianNoise3D.setOctaves() instead
     */
    @Deprecated
    void setOctaves(int octaves);

    /**
     * @deprecated Please use BrownianNoise3D.setOctaves() instead
     */
    @Deprecated
    int getOctaves();
}