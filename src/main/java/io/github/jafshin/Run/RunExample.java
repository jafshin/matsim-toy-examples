package io.github.jafshin.Run;

import org.matsim.api.core.v01.Scenario;
import org.matsim.core.config.Config;
import org.matsim.core.config.ConfigUtils;
import org.matsim.core.controler.Controler;
import org.matsim.core.controler.OutputDirectoryHierarchy;
import org.matsim.core.scenario.ScenarioUtils;


public class RunExample {
    public static void main(String[] args) {
        Config config;
        config = ConfigUtils.loadConfig( "scenario/simple/config.xml" );
        config.controler().setOverwriteFileSetting( OutputDirectoryHierarchy.OverwriteFileSetting.deleteDirectoryIfExists );

        Scenario scenario = ScenarioUtils.loadScenario(config) ;

        Controler controler = new Controler( scenario ) ;

        controler.run();
    }
}
