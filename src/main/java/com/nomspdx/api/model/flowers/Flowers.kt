package com.nomspdx.api.model.flowers

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.nomspdx.api.model.common.Metadata

/**

 */
@JsonIgnoreProperties(ignoreUnknown = true)
class Flowers {
    var data: List<FlowerData>? = null
    var meta: Metadata? = null
}
