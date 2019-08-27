transports:
  rest.agent.transport:
    enabled: false
  websocket.transport:
    enabled: true
    consoleUri: wss://runtime-manager.anypoint.mulesoft.com:443/mule
    handshake:
      enabled: true
      body: null
globalConfiguration:
  security:
    keyStorePassword: ad87841f-4853-4a1e-9aa4-3c3c26a168ef
    keyStoreAlias: agent
    keyStoreAliasPassword: ad87841f-4853-4a1e-9aa4-3c3c26a168ef
  authenticationProxy:
    endpoint: https://data-authenticator.anypoint.mulesoft.com
internalHandlers:
  mule.agent.tracking.handler.analytics:
    enabled: false
  mule.agent.tracking.handler.log:
    enabled: true
services:
  mule.agent.logging.service:
    applicationLogLevels:
    - artifactName: event-sender-onprem
      scopeLoggingConfigurations: []
    enabled: true
  mule.agent.tracking.service:
    trackedApplications: []
    enabled: true
