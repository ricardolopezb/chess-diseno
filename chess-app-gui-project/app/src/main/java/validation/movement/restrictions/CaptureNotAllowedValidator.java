package validation.movement.restrictions;

import chess.Turn;
import validation.movement.MovementValidator;

public class CaptureNotAllowedValidator implements MovementValidator {
    @Override
    public boolean validate(Turn turn) {
        return !turn.getTo().hasPiece();
    }
}
