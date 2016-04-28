package personal.arc.example.share.param;

import com.baidu.bjf.remoting.protobuf.FieldType;
import com.baidu.bjf.remoting.protobuf.annotation.Protobuf;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Map;

/**
 * Created by Arc on 26/4/2016.
 */
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class EchoInfo {

    @Protobuf
    public String message;

    @Protobuf(fieldType = FieldType.MAP)
    public Map<String, String> map;

}
