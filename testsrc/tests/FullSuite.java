/*
 * File: FullSuite.java Author: Robert Bittle <guywithnose@gmail.com>
 */
package tests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import simpleGui.tests.SimpleGuiTest;

/**
 * The Class FullSuite.
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({ SimpleGuiTest.class })
public class FullSuite
{
    // Do Nothing
}
