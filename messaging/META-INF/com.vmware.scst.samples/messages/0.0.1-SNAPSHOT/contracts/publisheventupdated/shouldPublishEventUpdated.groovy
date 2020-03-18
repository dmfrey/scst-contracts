import org.springframework.cloud.contract.spec.Contract

Contract.make {
    description 'Publish a message to the "UpdateChannel" channel'
    label 'send updated'

    input {
        triggeredBy('saveEvent()')
    }

    outputMessage {
        sentTo('UpdateChannel')

        body(
            '''{
                "event": {
                  "date": "2020-02-25",
                  "id": "131e0977-60e0-47e0-b7c2-80684f9acd5d"
                },
                "eventType": "UPDATED"
            }'''
        )
    }
}
