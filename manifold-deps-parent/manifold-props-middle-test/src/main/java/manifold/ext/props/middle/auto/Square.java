/*
 * Copyright (c) 2021 - Manifold Systems LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package manifold.ext.props.middle.auto;

public class Square extends Rectangle
{
  public Square( String name, double side )
  {
    super( name, side, side );
  }

  public double getLength()
  {
    return getSides()[0];
  }

  @Override
  public double getArea()
  {
    double l = getLength();
    return l * l;
  }
}