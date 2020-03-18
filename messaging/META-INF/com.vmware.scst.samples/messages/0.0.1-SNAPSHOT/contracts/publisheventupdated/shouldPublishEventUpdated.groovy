package publishdebriefsortieupdated

import org.springframework.cloud.contract.spec.Contract

Contract.make {
    description 'Publish a message to the "sortieUpdateChannel" channel with eventType "Updated"'
    label 'sortie updated'

    input {
        triggeredBy('saveDebriefedSortie()')
    }

    outputMessage {
        sentTo('output')

        body(
            '''{
                "sortie": {
                  "date": "2020-02-25",
                  "tailNumber": "12-5012",
                  "lineNumber": "22",
                  "aircraftId": "12-5012",
                  "amuId": "c3a17cf9-6085-48b7-b277-46f044d70753",
                  "takeoffDateTime": "2020-02-25T12:13:00",
                  "landDateTime": "2020-02-25T13:34:00",
                  "duration": 1.35,
                  "takeoffAirport": "FRDW",
                  "landingAirport": "FRDW",
                  "pilotName": "Mr Pilot",
                  "missionType": "ATA/TI - Air to Air, Tactical Intercepts",
                  "effective": true,
                  "pilotDeviations": [
                      {
                        "deviation":
                          {
                            "code": "AD",
                            "function": "Addition"
                          },
                        "cause":
                          {
                            "code": "ATG",
                            "function": "Air Traffic Control, Ground Emergency"
                          },
                        "id": "2297bc0d-2536-4db2-8f47-2ffeef8895dd"
                      }
                  ],
                  "pilotDiscrepancies": [
                    {
                      "stage": {
                        "name": "Startup"
                      },
                      "type": {
                        "name": "Failure"
                      },
                      "system": "A10 - PARKING AND MOORING, AIRCRAFT",
                      "subsystem": "A101 - PARKING",
                      "reset": false,
                      "cleared": false,
                      "detail": "All the details, ALL THE DETAILS!!!",
                      "symbol": {
                        "symbol": "X",
                        "description": "Grounding Condition"
                      },
                      "maintenanceComment": "FIX IT!",
                      "id": "5dc2539b-36a3-4645-93c1-265b39c988a5"
                    }
                  ],
                  "asymmetricBrakeEngagements": 1,
                  "airRefuelContacts": 3,
                  "engineOperatingHours": 3.5,
                  "landingCode": "THREE",
                  "significantHrcs": [
                    {
                      "code": "24213452533453",
                      "activated": true,
                      "amuId": "c3a17cf9-6085-48b7-b277-46f044d70753",
                      "description": null
                    },
                    {
                      "code": "532454235642",
                      "activated": true,
                      "amuId": "c3a17cf9-6085-48b7-b277-46f044d70753",
                      "description": null
                    }
                  ],
                  "sortieId": "9861fa29-ad17-41be-8da7-f94ca6f27eb9",
                  "version": 1234
                },
              "sortieEventType": "UPDATED"
            }'''
        )
    }
}
