package jade.core.vampusworld.agents;

import jade.core.Agent;

import java.util.List;

/**
@author Pryima Anna
*/

public class NavigatorAgent extends Agent implements NavigatorListener {

    @Override
    public void navigatorListModelChanged(List<? super Agent> navigatorAgents) {
           updateNavigatorAgentList(navigatorAgents);
    }

    private void updateNavigatorAgentList(List<? super Agent> navigatorAgents) {

    }

}
