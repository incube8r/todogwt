package com.todogwt.client.local;

import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.RootPanel;
import org.jboss.errai.ioc.client.api.EntryPoint;
import org.jboss.errai.ui.nav.client.local.Navigation;
import org.jboss.errai.ui.shared.api.annotations.Templated;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@Templated
@ApplicationScoped
@EntryPoint
public class Bootstrap extends Composite {

    @Inject
    Navigation navigation;

    @PostConstruct
    public void buildUI() {
        RootPanel.get("rootPanel").add(this);
    }

}
