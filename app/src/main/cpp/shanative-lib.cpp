/**
 * Created by Chek Tien Tan on 23/3/17.
 * NOTE: please mess with this file to your hearts content.
 */

#include <jni.h>
#include <string>
#include <sstream>
#include <math.h>
#include "sha256.h"

#include <android/log.h>
using namespace std;
extern "C" {
    static const char *TAG = "SHANATIVE";

    /**
     * Generate salt.
     * - each salt is a hash of the hash iteration count
     */
    static const std::string getSalt(const int i) {
        std::stringstream ss;
        ss << i;
        return sha256(ss.str());
    }
}
